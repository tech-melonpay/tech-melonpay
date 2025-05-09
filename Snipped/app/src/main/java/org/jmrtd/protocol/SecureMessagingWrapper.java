package org.jmrtd.protocol;

import androidx.camera.core.impl.utils.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import net.sf.scuba.smartcards.APDUWrapper;
import net.sf.scuba.smartcards.CommandAPDU;
import net.sf.scuba.smartcards.ResponseAPDU;
import net.sf.scuba.tlv.TLVUtil;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jmrtd.Util;

/* loaded from: classes3.dex */
public abstract class SecureMessagingWrapper implements Serializable, APDUWrapper {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd.protocol");
    private static final long serialVersionUID = 4709645514566992414L;
    private transient Cipher cipher;
    private SecretKey ksEnc;
    private SecretKey ksMac;
    private transient Mac mac;
    private int maxTranceiveLength;
    private boolean shouldCheckMAC;
    private long ssc;

    public SecureMessagingWrapper(SecretKey secretKey, SecretKey secretKey2, String str, String str2, int i, boolean z10, long j10) {
        this.maxTranceiveLength = i;
        this.shouldCheckMAC = z10;
        this.ksEnc = secretKey;
        this.ksMac = secretKey2;
        this.ssc = j10;
        this.cipher = Util.getCipher(str);
        this.mac = Util.getMac(str2);
    }

    private byte[] encodeLe(int i) {
        return (i < 0 || i > 256) ? new byte[]{(byte) ((65280 & i) >> 8), (byte) (i & 255)} : new byte[]{(byte) i};
    }

    public static SecureMessagingWrapper getInstance(SecureMessagingWrapper secureMessagingWrapper) {
        try {
        } catch (GeneralSecurityException e10) {
            LOGGER.log(Level.WARNING, "Could not copy wrapper", (Throwable) e10);
        }
        if (secureMessagingWrapper instanceof DESedeSecureMessagingWrapper) {
            return new DESedeSecureMessagingWrapper((DESedeSecureMessagingWrapper) secureMessagingWrapper);
        }
        if (secureMessagingWrapper instanceof AESSecureMessagingWrapper) {
            return new AESSecureMessagingWrapper((AESSecureMessagingWrapper) secureMessagingWrapper);
        }
        LOGGER.warning("Not copying wrapper");
        return secureMessagingWrapper;
    }

    private byte[] readDO87(DataInputStream dataInputStream, boolean z10) {
        int readUnsignedByte;
        int readUnsignedByte2 = dataInputStream.readUnsignedByte();
        if ((readUnsignedByte2 & 128) == 128) {
            int i = readUnsignedByte2 & 127;
            int i9 = 0;
            for (int i10 = 0; i10 < i; i10++) {
                i9 = (i9 << 8) | dataInputStream.readUnsignedByte();
            }
            if (!z10 && dataInputStream.readUnsignedByte() != 1) {
                throw new IllegalStateException("DO'87 expected 0x01 marker");
            }
            readUnsignedByte2 = i9;
        } else if (!z10 && (readUnsignedByte = dataInputStream.readUnsignedByte()) != 1) {
            throw new IllegalStateException(a.g(readUnsignedByte & 255, new StringBuilder("DO'87 expected 0x01 marker, found ")));
        }
        if (!z10) {
            readUnsignedByte2--;
        }
        byte[] bArr = new byte[readUnsignedByte2];
        dataInputStream.readFully(bArr);
        return Util.unpad(this.cipher.doFinal(bArr));
    }

    private byte[] readDO8E(DataInputStream dataInputStream) {
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        if (readUnsignedByte != 8 && readUnsignedByte != 16) {
            throw new IllegalStateException(com.google.android.gms.measurement.internal.a.g(readUnsignedByte, "DO'8E wrong length for MAC: "));
        }
        byte[] bArr = new byte[readUnsignedByte];
        dataInputStream.readFully(bArr);
        return bArr;
    }

    private short readDO99(DataInputStream dataInputStream) {
        if (dataInputStream.readUnsignedByte() != 2) {
            throw new IllegalStateException("DO'99 wrong length");
        }
        byte readByte = dataInputStream.readByte();
        return (short) ((dataInputStream.readByte() & 255) | ((readByte & 255) << 8));
    }

    private ResponseAPDU unwrapResponseAPDU(ResponseAPDU responseAPDU) {
        byte[] bytes = responseAPDU.getBytes();
        if (bytes == null || bytes.length < 2) {
            throw new IllegalArgumentException("Invalid response APDU");
        }
        this.cipher.init(2, this.ksEnc, getIV());
        byte[] bArr = new byte[0];
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bytes));
        byte[] bArr2 = null;
        boolean z10 = false;
        short s10 = 0;
        while (!z10) {
            try {
                byte readByte = dataInputStream.readByte();
                if (readByte == -123) {
                    bArr = readDO87(dataInputStream, true);
                } else if (readByte == -121) {
                    bArr = readDO87(dataInputStream, false);
                } else if (readByte == -114) {
                    bArr2 = readDO8E(dataInputStream);
                    z10 = true;
                } else if (readByte != -103) {
                    LOGGER.warning("Unexpected tag " + Integer.toHexString(readByte));
                } else {
                    s10 = readDO99(dataInputStream);
                }
            } catch (Throwable th) {
                dataInputStream.close();
                throw th;
            }
        }
        dataInputStream.close();
        if (shouldCheckMAC() && !checkMac(bytes, bArr2)) {
            throw new IllegalStateException("Invalid MAC");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(bArr, 0, bArr.length);
        byteArrayOutputStream.write((65280 & s10) >> 8);
        byteArrayOutputStream.write(s10 & 255);
        return new ResponseAPDU(byteArrayOutputStream.toByteArray());
    }

    private CommandAPDU wrapCommandAPDU(CommandAPDU commandAPDU) {
        int cla = commandAPDU.getCLA();
        int ins = commandAPDU.getINS();
        int p12 = commandAPDU.getP1();
        int p22 = commandAPDU.getP2();
        int nc = commandAPDU.getNc();
        int ne = commandAPDU.getNe();
        byte[] bArr = {(byte) (cla | 12), (byte) ins, (byte) p12, (byte) p22};
        byte[] pad = Util.pad(bArr, getPadLength());
        int i = ((byte) commandAPDU.getINS()) == -79 ? 1 : 0;
        byte[] bArr2 = new byte[0];
        byte[] bArr3 = new byte[0];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (ne > 0) {
            try {
                bArr3 = TLVUtil.wrapDO(151, encodeLe(ne));
            } finally {
            }
        }
        if (nc > 0) {
            byte[] pad2 = Util.pad(commandAPDU.getData(), getPadLength());
            this.cipher.init(1, this.ksEnc, getIV());
            byte[] doFinal = this.cipher.doFinal(pad2);
            byteArrayOutputStream.reset();
            byteArrayOutputStream.write(i != 0 ? -123 : -121);
            byteArrayOutputStream.write(TLVUtil.getLengthAsBytes(doFinal.length + (i ^ 1)));
            if (i == 0) {
                byteArrayOutputStream.write(1);
            }
            byteArrayOutputStream.write(doFinal, 0, doFinal.length);
            bArr2 = byteArrayOutputStream.toByteArray();
        }
        byteArrayOutputStream.reset();
        byteArrayOutputStream.write(getEncodedSendSequenceCounter());
        byteArrayOutputStream.write(pad);
        byteArrayOutputStream.write(bArr2);
        byteArrayOutputStream.write(bArr3);
        byte[] pad3 = Util.pad(byteArrayOutputStream.toByteArray(), getPadLength());
        this.mac.init(this.ksMac);
        byte[] doFinal2 = this.mac.doFinal(pad3);
        int length = doFinal2.length;
        if (length != 8) {
            length = 8;
        }
        byteArrayOutputStream.reset();
        byteArrayOutputStream.write(-114);
        byteArrayOutputStream.write(length);
        byteArrayOutputStream.write(doFinal2, 0, length);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.reset();
        byteArrayOutputStream.write(bArr2);
        byteArrayOutputStream.write(bArr3);
        byteArrayOutputStream.write(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (IOException e10) {
            LOGGER.log(Level.FINE, "Error closing stream", (Throwable) e10);
        }
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        return (ne > 256 || byteArray2.length > 255) ? (ne > 256 || byteArray2.length > 255) ? new CommandAPDU(bArr[0], bArr[1], bArr[2], bArr[3], byteArray2, 65536) : new CommandAPDU(bArr[0], bArr[1], bArr[2], bArr[3], byteArray2, getMaxTranceiveLength()) : new CommandAPDU(bArr[0], bArr[1], bArr[2], bArr[3], byteArray2, 256);
    }

    public boolean checkMac(byte[] bArr, byte[] bArr2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.write(getEncodedSendSequenceCounter());
            byte[] pad = Util.pad(bArr, 0, bArr.length - 12, getPadLength());
            dataOutputStream.write(pad, 0, pad.length);
            dataOutputStream.flush();
            dataOutputStream.close();
            this.mac.init(this.ksMac);
            byte[] doFinal = this.mac.doFinal(byteArrayOutputStream.toByteArray());
            if (doFinal.length > 8 && bArr2.length == 8) {
                byte[] bArr3 = new byte[8];
                System.arraycopy(doFinal, 0, bArr3, 0, 8);
                doFinal = bArr3;
            }
            return Arrays.equals(bArr2, doFinal);
        } catch (IOException e10) {
            LOGGER.log(Level.WARNING, "Exception checking MAC", (Throwable) e10);
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecureMessagingWrapper secureMessagingWrapper = (SecureMessagingWrapper) obj;
        SecretKey secretKey = this.ksEnc;
        if (secretKey == null) {
            if (secureMessagingWrapper.ksEnc != null) {
                return false;
            }
        } else if (!secretKey.equals(secureMessagingWrapper.ksEnc)) {
            return false;
        }
        SecretKey secretKey2 = this.ksMac;
        if (secretKey2 == null) {
            if (secureMessagingWrapper.ksMac != null) {
                return false;
            }
        } else if (!secretKey2.equals(secureMessagingWrapper.ksMac)) {
            return false;
        }
        return this.maxTranceiveLength == secureMessagingWrapper.maxTranceiveLength && this.shouldCheckMAC == secureMessagingWrapper.shouldCheckMAC && this.ssc == secureMessagingWrapper.ssc;
    }

    public abstract byte[] getEncodedSendSequenceCounter();

    public SecretKey getEncryptionKey() {
        return this.ksEnc;
    }

    public abstract IvParameterSpec getIV();

    public SecretKey getMACKey() {
        return this.ksMac;
    }

    public int getMaxTranceiveLength() {
        return this.maxTranceiveLength;
    }

    public abstract int getPadLength();

    public long getSendSequenceCounter() {
        return this.ssc;
    }

    public int hashCode() {
        SecretKey secretKey = this.ksEnc;
        int hashCode = ((secretKey == null ? 0 : secretKey.hashCode()) + 31) * 31;
        SecretKey secretKey2 = this.ksMac;
        int hashCode2 = (((((hashCode + (secretKey2 != null ? secretKey2.hashCode() : 0)) * 31) + this.maxTranceiveLength) * 31) + (this.shouldCheckMAC ? 1231 : 1237)) * 31;
        long j10 = this.ssc;
        return hashCode2 + ((int) (j10 ^ (j10 >>> 32)));
    }

    public boolean shouldCheckMAC() {
        return this.shouldCheckMAC;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SecureMessagingWrapper [ssc: ");
        sb2.append(this.ssc);
        sb2.append(", ksEnc: ");
        sb2.append(this.ksEnc);
        sb2.append(", ksMac: ");
        sb2.append(this.ksMac);
        sb2.append(", maxTranceiveLength: ");
        sb2.append(this.maxTranceiveLength);
        sb2.append(", shouldCheckMAC: ");
        return com.google.android.gms.measurement.internal.a.k(sb2, this.shouldCheckMAC, "]");
    }

    @Override // net.sf.scuba.smartcards.APDUWrapper
    public ResponseAPDU unwrap(ResponseAPDU responseAPDU) {
        this.ssc++;
        try {
            byte[] data = responseAPDU.getData();
            if (data != null && data.length > 0) {
                return unwrapResponseAPDU(responseAPDU);
            }
            throw new IllegalStateException("Card indicates SM error, SW = " + Integer.toHexString(responseAPDU.getSW() & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        } catch (IOException e10) {
            throw new IllegalStateException("Unexpected exception", e10);
        } catch (GeneralSecurityException e11) {
            throw new IllegalStateException("Unexpected exception", e11);
        }
    }

    @Override // net.sf.scuba.smartcards.APDUWrapper
    public CommandAPDU wrap(CommandAPDU commandAPDU) {
        this.ssc++;
        try {
            return wrapCommandAPDU(commandAPDU);
        } catch (IOException e10) {
            throw new IllegalStateException("Unexpected exception", e10);
        } catch (GeneralSecurityException e11) {
            throw new IllegalStateException("Unexpected exception", e11);
        }
    }
}
