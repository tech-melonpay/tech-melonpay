package org.jmrtd;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.smartcards.APDUWrapper;
import net.sf.scuba.smartcards.CardServiceException;
import net.sf.scuba.smartcards.FileInfo;
import net.sf.scuba.smartcards.FileSystemStructured;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.tlv.TLVInputStream;
import net.sf.scuba.util.Hex;
import org.jmrtd.io.FragmentBuffer;
import org.jmrtd.lds.LDSFileUtil;
import org.jmrtd.protocol.SecureMessagingWrapper;

/* loaded from: classes3.dex */
public class DefaultFileSystem implements FileSystemStructured {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    public static final int NO_SFI = -1;
    private static final int READ_AHEAD_LENGTH = 8;
    private Map<Short, Byte> fidToSFI;
    private Map<Short, DefaultFileInfo> fileInfos;
    private boolean isSFIEnabled;
    private boolean isSelected;
    private int maxReadBinaryLength;
    private APDUWrapper oldWrapper;
    private short selectedFID;
    private APDULevelReadBinaryCapable service;
    private APDUWrapper wrapper;

    public static class DefaultFileInfo extends FileInfo implements Serializable {
        private static final long serialVersionUID = 6727369753765119839L;
        private FragmentBuffer buffer;
        private short fid;

        public DefaultFileInfo(short s10, int i) {
            this.fid = s10;
            this.buffer = new FragmentBuffer(i);
        }

        public void addFragment(int i, byte[] bArr) {
            this.buffer.addFragment(i, bArr);
        }

        public byte[] getBuffer() {
            return this.buffer.getBuffer();
        }

        @Override // net.sf.scuba.smartcards.FileInfo
        public short getFID() {
            return this.fid;
        }

        @Override // net.sf.scuba.smartcards.FileInfo
        public int getFileLength() {
            return this.buffer.getLength();
        }

        public FragmentBuffer.Fragment getSmallestUnbufferedFragment(int i, int i9) {
            return this.buffer.getSmallestUnbufferedFragment(i, i9);
        }

        public String toString() {
            return Integer.toHexString(this.fid);
        }
    }

    public DefaultFileSystem(APDULevelReadBinaryCapable aPDULevelReadBinaryCapable, boolean z10) {
        this(aPDULevelReadBinaryCapable, z10, LDSFileUtil.FID_TO_SFI);
    }

    private synchronized DefaultFileInfo getFileInfo() {
        byte[] sendReadBinary;
        try {
            short s10 = this.selectedFID;
            if (s10 <= 0) {
                throw new CardServiceException("No file selected");
            }
            DefaultFileInfo defaultFileInfo = this.fileInfos.get(Short.valueOf(s10));
            if (defaultFileInfo != null) {
                return defaultFileInfo;
            }
            try {
                if (this.isSFIEnabled) {
                    Byte b9 = this.fidToSFI.get(Short.valueOf(this.selectedFID));
                    if (b9 == null) {
                        throw new NumberFormatException("Unknown FID " + Integer.toHexString(this.selectedFID));
                    }
                    sendReadBinary = sendReadBinary((b9.byteValue() & 255) | 128, 0, 8, false);
                    this.isSelected = true;
                } else {
                    if (!this.isSelected) {
                        sendSelectFile(this.selectedFID);
                        this.isSelected = true;
                    }
                    sendReadBinary = sendReadBinary(0, 8, false);
                }
                if (sendReadBinary != null && sendReadBinary.length != 0) {
                    int fileLength = getFileLength(this.selectedFID, 8, sendReadBinary);
                    if (fileLength < sendReadBinary.length) {
                        sendReadBinary = Arrays.copyOf(sendReadBinary, fileLength);
                    }
                    DefaultFileInfo defaultFileInfo2 = new DefaultFileInfo(this.selectedFID, fileLength);
                    defaultFileInfo2.addFragment(0, sendReadBinary);
                    this.fileInfos.put(Short.valueOf(this.selectedFID), defaultFileInfo2);
                    return defaultFileInfo2;
                }
                LOGGER.warning("Something is wrong with prefix, prefix = " + Hex.bytesToHexString(sendReadBinary));
                return null;
            } catch (IOException e10) {
                throw new CardServiceException("Error getting file info for " + Integer.toHexString(this.selectedFID), e10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static int getFileLength(short s10, int i, byte[] bArr) {
        if (bArr.length < i) {
            return bArr.length;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        TLVInputStream tLVInputStream = new TLVInputStream(byteArrayInputStream);
        try {
            if (tLVInputStream.readTag() != 66) {
                return (bArr.length - byteArrayInputStream.available()) + tLVInputStream.readLength();
            }
            try {
                tLVInputStream.close();
                return 36;
            } catch (IOException e10) {
                LOGGER.log(Level.FINE, "Error closing stream", (Throwable) e10);
                return 36;
            }
        } finally {
            try {
                tLVInputStream.close();
            } catch (IOException e11) {
                LOGGER.log(Level.FINE, "Error closing stream", (Throwable) e11);
            }
        }
    }

    public int getMaxReadBinaryLength() {
        return this.maxReadBinaryLength;
    }

    @Override // net.sf.scuba.smartcards.FileSystemStructured
    public synchronized FileInfo[] getSelectedPath() {
        DefaultFileInfo fileInfo = getFileInfo();
        if (fileInfo == null) {
            return null;
        }
        return new DefaultFileInfo[]{fileInfo};
    }

    public APDUWrapper getWrapper() {
        return this.wrapper;
    }

    @Override // net.sf.scuba.smartcards.FileSystemStructured
    public synchronized byte[] readBinary(int i, int i9) {
        byte[] bArr;
        byte[] sendReadBinary;
        try {
            try {
                try {
                    if (this.selectedFID <= 0) {
                        throw new CardServiceException("No file selected");
                    }
                    DefaultFileInfo fileInfo = getFileInfo();
                    if (fileInfo == null) {
                        throw new IllegalStateException("Could not get file info");
                    }
                    int min = Math.min(i9, this.maxReadBinaryLength);
                    FragmentBuffer.Fragment smallestUnbufferedFragment = fileInfo.getSmallestUnbufferedFragment(i, min);
                    if (smallestUnbufferedFragment.getLength() > 0) {
                        boolean z10 = true;
                        if (!this.isSFIEnabled || i >= 256) {
                            if (!this.isSelected) {
                                sendSelectFile(this.selectedFID);
                                this.isSelected = true;
                            }
                            int offset = smallestUnbufferedFragment.getOffset();
                            int length = smallestUnbufferedFragment.getLength();
                            if (i <= 32767) {
                                z10 = false;
                            }
                            sendReadBinary = sendReadBinary(offset, length, z10);
                        } else {
                            Byte b9 = this.fidToSFI.get(Short.valueOf(this.selectedFID));
                            if (b9 == null) {
                                throw new NumberFormatException("Unknown FID " + Integer.toHexString(this.selectedFID));
                            }
                            sendReadBinary = sendReadBinary((b9.byteValue() & 255) | 128, smallestUnbufferedFragment.getOffset(), smallestUnbufferedFragment.getLength(), false);
                            this.isSelected = true;
                        }
                        if (sendReadBinary == null) {
                            throw new IllegalStateException("Could not read bytes");
                        }
                        if (sendReadBinary.length > 0) {
                            fileInfo.addFragment(smallestUnbufferedFragment.getOffset(), sendReadBinary);
                        }
                        if (sendReadBinary.length < smallestUnbufferedFragment.getLength()) {
                            min = sendReadBinary.length;
                        }
                    }
                    bArr = new byte[min];
                    System.arraycopy(fileInfo.getBuffer(), i, bArr, 0, min);
                } catch (Exception e10) {
                    StringBuilder sb2 = new StringBuilder("Read binary failed on file ");
                    sb2.append((Object) (0 == 0 ? Integer.toHexString(this.selectedFID) : null));
                    throw new CardServiceException(sb2.toString(), e10);
                }
            } catch (CardServiceException e11) {
                if ((((short) e11.getSW()) & ISO7816.SW_WRONG_LENGTH) != 26368 || this.maxReadBinaryLength <= 223) {
                    StringBuilder sb3 = new StringBuilder("Read binary failed on file ");
                    sb3.append((Object) (0 == 0 ? Integer.toHexString(this.selectedFID) : null));
                    throw new CardServiceException(sb3.toString(), e11);
                }
                this.wrapper = this.oldWrapper;
                this.maxReadBinaryLength = PassportService.DEFAULT_MAX_BLOCKSIZE;
                return new byte[0];
            }
        } catch (Throwable th) {
            throw th;
        }
        return bArr;
    }

    @Override // net.sf.scuba.smartcards.FileSystemStructured
    public synchronized void selectFile(short s10) {
        if (this.selectedFID == s10) {
            return;
        }
        this.selectedFID = s10;
        this.isSelected = false;
    }

    public synchronized byte[] sendReadBinary(int i, int i9, boolean z10) {
        try {
            APDUWrapper aPDUWrapper = this.wrapper;
            if (aPDUWrapper instanceof SecureMessagingWrapper) {
                aPDUWrapper = SecureMessagingWrapper.getInstance((SecureMessagingWrapper) aPDUWrapper);
            }
            this.oldWrapper = aPDUWrapper;
        } catch (Throwable th) {
            throw th;
        }
        return this.service.sendReadBinary(this.wrapper, -1, i, i9, false, z10);
    }

    public synchronized void sendSelectFile(short s10) {
        this.service.sendSelectFile(this.wrapper, s10);
    }

    public void setWrapper(APDUWrapper aPDUWrapper) {
        this.oldWrapper = this.wrapper;
        this.wrapper = aPDUWrapper;
    }

    public DefaultFileSystem(APDULevelReadBinaryCapable aPDULevelReadBinaryCapable, boolean z10, Map<Short, Byte> map) {
        this.service = aPDULevelReadBinaryCapable;
        this.fileInfos = new HashMap();
        this.selectedFID = (short) 0;
        this.isSelected = false;
        this.isSFIEnabled = z10;
        this.fidToSFI = map;
        this.maxReadBinaryLength = 65536;
    }

    public synchronized byte[] sendReadBinary(int i, int i9, int i10, boolean z10) {
        return this.service.sendReadBinary(this.wrapper, i, i9, i10, true, z10);
    }
}
