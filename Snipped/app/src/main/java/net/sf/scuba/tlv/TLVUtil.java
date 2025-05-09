package net.sf.scuba.tlv;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;

/* loaded from: classes2.dex */
public class TLVUtil implements ASN1Constants {
    private static final Logger LOGGER = Logger.getLogger("net.sf.scuba.tlv");

    private TLVUtil() {
    }

    public static byte[] getLengthAsBytes(int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (i < 128) {
            byteArrayOutputStream.write(i);
        } else {
            int log = log(i, 256);
            byteArrayOutputStream.write(log | 128);
            for (int i9 = 0; i9 < log; i9++) {
                int i10 = ((log - i9) - 1) * 8;
                byteArrayOutputStream.write(((255 << i10) & i) >> i10);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static int getLengthLength(int i) {
        return getLengthAsBytes(i).length;
    }

    public static byte[] getTagAsBytes(int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int log = ((int) (Math.log(i) / Math.log(256.0d))) + 1;
        for (int i9 = 0; i9 < log; i9++) {
            int i10 = ((log - i9) - 1) * 8;
            byteArrayOutputStream.write(((255 << i10) & i) >> i10);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int tagClass = getTagClass(i);
        if (tagClass == 1) {
            byteArray[0] = (byte) (byteArray[0] | 64);
        } else if (tagClass == 2) {
            byteArray[0] = (byte) (byteArray[0] | ISOFileInfo.DATA_BYTES1);
        } else if (tagClass == 3) {
            byteArray[0] = (byte) (byteArray[0] | ISO7816.INS_GET_RESPONSE);
        }
        if (!isPrimitive(i)) {
            byteArray[0] = (byte) (byteArray[0] | ISO7816.INS_VERIFY);
        }
        return byteArray;
    }

    public static int getTagClass(int i) {
        int i9 = 3;
        while (i9 >= 0 && ((255 << (i9 * 8)) & i) == 0) {
            i9--;
        }
        int i10 = i9 * 8;
        int i11 = ((i & (255 << i10)) >> i10) & 192;
        if (i11 == 0) {
            return 0;
        }
        if (i11 != 64) {
            return i11 != 128 ? 3 : 2;
        }
        return 1;
    }

    public static int getTagLength(int i) {
        return getTagAsBytes(i).length;
    }

    public static boolean isPrimitive(int i) {
        int i9 = 3;
        while (i9 >= 0 && ((255 << (i9 * 8)) & i) == 0) {
            i9--;
        }
        int i10 = i9 * 8;
        return (((i & (255 << i10)) >> i10) & 32) == 0;
    }

    private static int log(int i, int i9) {
        int i10 = 0;
        while (i > 0) {
            i /= i9;
            i10++;
        }
        return i10;
    }

    public static byte[] unwrapDO(int i, byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            throw new IllegalArgumentException("Wrapped data is null or length < 2");
        }
        TLVInputStream tLVInputStream = new TLVInputStream(new ByteArrayInputStream(bArr));
        try {
            try {
                int readTag = tLVInputStream.readTag();
                if (readTag == i) {
                    int readLength = tLVInputStream.readLength();
                    byte[] bArr2 = new byte[readLength];
                    System.arraycopy(tLVInputStream.readValue(), 0, bArr2, 0, readLength);
                    return bArr2;
                }
                throw new IllegalArgumentException("Expected tag " + Integer.toHexString(i) + ", found tag " + Integer.toHexString(readTag));
            } catch (IOException e10) {
                throw new IllegalStateException("Error reading from stream", e10);
            }
        } finally {
            try {
                tLVInputStream.close();
            } catch (IOException e11) {
                LOGGER.log(Level.FINE, "Error closing stream", (Throwable) e11);
            }
        }
    }

    public static byte[] wrapDO(int i, byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("Data to wrap is null");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                TLVOutputStream tLVOutputStream = new TLVOutputStream(byteArrayOutputStream);
                tLVOutputStream.writeTag(i);
                tLVOutputStream.writeValue(bArr);
                tLVOutputStream.flush();
                tLVOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e10) {
                throw new IllegalStateException("Error writing stream", e10);
            }
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e11) {
                LOGGER.log(Level.FINE, "Error closing stream", (Throwable) e11);
            }
        }
    }
}
