package org.jmrtd.cbeff;

import androidx.camera.core.impl.utils.a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.AccessControlException;
import java.util.HashMap;
import java.util.logging.Logger;
import net.sf.scuba.tlv.TLVInputStream;
import net.sf.scuba.tlv.TLVUtil;

/* loaded from: classes3.dex */
public class ISO781611Decoder implements ISO781611 {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private BiometricDataBlockDecoder<?> bdbDecoder;

    public ISO781611Decoder(BiometricDataBlockDecoder<?> biometricDataBlockDecoder) {
        this.bdbDecoder = biometricDataBlockDecoder;
    }

    private byte[] decodeSMTValue(InputStream inputStream) {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        int readTag = tLVInputStream.readTag();
        int readLength = tLVInputStream.readLength();
        if (readTag == 129) {
            return tLVInputStream.readValue();
        }
        if (readTag == 133) {
            throw new AccessControlException("Access denied. Biometric Information Template is statically protected.");
        }
        long j10 = 0;
        if (readTag == 142) {
            while (true) {
                long j11 = readLength;
                if (j10 >= j11) {
                    return null;
                }
                j10 += tLVInputStream.skip(j11);
            }
        } else {
            if (readTag != 158) {
                LOGGER.info("Unsupported data object tag " + Integer.toHexString(readTag));
                return null;
            }
            while (true) {
                long j12 = readLength;
                if (j10 >= j12) {
                    return null;
                }
                j10 += tLVInputStream.skip(j12);
            }
        }
    }

    private StandardBiometricHeader readBHT(InputStream inputStream, int i, int i9, int i10) {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        if (i != 161) {
            LOGGER.warning("Expected tag " + Integer.toHexString(161) + ", found " + Integer.toHexString(i));
        }
        HashMap hashMap = new HashMap();
        int i11 = 0;
        while (i11 < i9) {
            int readTag = tLVInputStream.readTag();
            int lengthLength = TLVUtil.getLengthLength(tLVInputStream.readLength()) + TLVUtil.getTagLength(readTag) + i11;
            byte[] readValue = tLVInputStream.readValue();
            i11 = lengthLength + readValue.length;
            hashMap.put(Integer.valueOf(readTag), readValue);
        }
        return new StandardBiometricHeader(hashMap);
    }

    private CBEFFInfo readBIT(InputStream inputStream, int i) {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        return readBIT(tLVInputStream.readTag(), tLVInputStream.readLength(), inputStream, i);
    }

    private ComplexCBEFFInfo readBITGroup(InputStream inputStream) {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        int readTag = tLVInputStream.readTag();
        if (readTag == 32609) {
            return readBITGroup(readTag, tLVInputStream.readLength(), inputStream);
        }
        throw new IllegalArgumentException("Expected tag " + Integer.toHexString(ISO781611.BIOMETRIC_INFORMATION_GROUP_TEMPLATE_TAG) + ", found " + Integer.toHexString(readTag));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [org.jmrtd.cbeff.BiometricDataBlock] */
    private BiometricDataBlock readBiometricDataBlock(InputStream inputStream, StandardBiometricHeader standardBiometricHeader, int i) {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        int readTag = tLVInputStream.readTag();
        if (readTag == 24366 || readTag == 32558) {
            return this.bdbDecoder.decode(inputStream, standardBiometricHeader, i, tLVInputStream.readLength());
        }
        StringBuilder sb2 = new StringBuilder("Expected tag BIOMETRIC_DATA_BLOCK_TAG (");
        sb2.append(Integer.toHexString(ISO781611.BIOMETRIC_DATA_BLOCK_TAG));
        sb2.append(") or BIOMETRIC_DATA_BLOCK_TAG_ALT (");
        sb2.append(Integer.toHexString(ISO781611.BIOMETRIC_DATA_BLOCK_CONSTRUCTED_TAG));
        sb2.append("), found ");
        throw new IllegalArgumentException(a.g(readTag, sb2));
    }

    private void readStaticallyProtectedBIT(InputStream inputStream, int i, int i9, int i10) {
        TLVInputStream tLVInputStream = new TLVInputStream(new ByteArrayInputStream(decodeSMTValue(inputStream)));
        try {
            readBiometricDataBlock(new ByteArrayInputStream(decodeSMTValue(inputStream)), readBHT(tLVInputStream, tLVInputStream.readTag(), tLVInputStream.readLength(), i10), i10);
        } finally {
            tLVInputStream.close();
        }
    }

    public ComplexCBEFFInfo decode(InputStream inputStream) {
        return readBITGroup(inputStream);
    }

    private CBEFFInfo readBIT(int i, int i9, InputStream inputStream, int i10) {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        if (i == 32608) {
            int readTag = tLVInputStream.readTag();
            int readLength = tLVInputStream.readLength();
            if (readTag == 125) {
                readStaticallyProtectedBIT(inputStream, readTag, readLength, i10);
                return null;
            }
            if ((readTag & 160) == 160) {
                return new SimpleCBEFFInfo(readBiometricDataBlock(inputStream, readBHT(inputStream, readTag, readLength, i10), i10));
            }
            throw new IllegalArgumentException(a.g(readTag, new StringBuilder("Unsupported template tag: ")));
        }
        throw new IllegalArgumentException("Expected tag BIOMETRIC_INFORMATION_TEMPLATE_TAG (" + Integer.toHexString(ISO781611.BIOMETRIC_INFORMATION_TEMPLATE_TAG) + "), found " + Integer.toHexString(i) + ", index is " + i10);
    }

    private ComplexCBEFFInfo readBITGroup(int i, int i9, InputStream inputStream) {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        ComplexCBEFFInfo complexCBEFFInfo = new ComplexCBEFFInfo();
        if (i == 32609) {
            int readTag = tLVInputStream.readTag();
            if (readTag == 2) {
                int readLength = tLVInputStream.readLength();
                if (readLength == 1) {
                    byte[] readValue = tLVInputStream.readValue();
                    int i10 = readValue[0] & 255;
                    for (int i11 = 0; i11 < i10; i11++) {
                        complexCBEFFInfo.add(readBIT(inputStream, i11));
                    }
                    return complexCBEFFInfo;
                }
                throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(readLength, "BIOMETRIC_INFO_COUNT should have length 1, found length "));
            }
            throw new IllegalArgumentException("Expected tag BIOMETRIC_INFO_COUNT_TAG (" + Integer.toHexString(2) + ") in CBEFF structure, found " + Integer.toHexString(readTag));
        }
        throw new IllegalArgumentException("Expected tag " + Integer.toHexString(ISO781611.BIOMETRIC_INFORMATION_GROUP_TEMPLATE_TAG) + ", found " + Integer.toHexString(i));
    }
}
