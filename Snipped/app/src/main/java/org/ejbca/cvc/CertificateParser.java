package org.ejbca.cvc;

import androidx.camera.core.impl.utils.a;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.ejbca.cvc.exception.ParseException;

/* loaded from: classes3.dex */
public final class CertificateParser {

    /* renamed from: org.ejbca.cvc.CertificateParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$ejbca$cvc$CVCTagEnum;

        static {
            int[] iArr = new int[CVCTagEnum.values().length];
            $SwitchMap$org$ejbca$cvc$CVCTagEnum = iArr;
            try {
                iArr[CVCTagEnum.DISCRETIONARY_DATA_TEMPLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private CertificateParser() {
    }

    private static CVCObject decode(byte[] bArr, CVCTagEnum cVCTagEnum) {
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArr);
            } catch (Throwable th) {
                th = th;
            }
            try {
                CVCObject decode = decode(new DataInputStream(byteArrayInputStream), cVCTagEnum, null);
                byteArrayInputStream.close();
                return decode;
            } catch (Throwable th2) {
                th = th2;
                byteArrayInputStream2 = byteArrayInputStream;
                if (byteArrayInputStream2 != null) {
                    byteArrayInputStream2.close();
                }
                throw th;
            }
        } catch (IOException e10) {
            throw new ParseException(e10);
        }
    }

    private static int decodeTag(DataInputStream dataInputStream) {
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        if ((readUnsignedByte & 31) != 31) {
            return readUnsignedByte;
        }
        return (readUnsignedByte << 8) + dataInputStream.readByte();
    }

    private static CVCTagEnum findTagFromValue(int i) {
        CVCTagEnum cVCTagEnum;
        CVCTagEnum[] values = CVCTagEnum.values();
        int length = values.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                cVCTagEnum = null;
                break;
            }
            cVCTagEnum = values[i9];
            if (cVCTagEnum.getValue() == i) {
                break;
            }
            i9++;
        }
        if (cVCTagEnum != null) {
            return cVCTagEnum;
        }
        throw new ParseException(a.g(i, new StringBuilder("Unknown CVC tag value ")));
    }

    public static CVCObject parseCVCObject(byte[] bArr) {
        return decode(bArr, null);
    }

    public static CVCertificate parseCertificate(byte[] bArr) {
        return (CVCertificate) decode(bArr, CVCTagEnum.CV_CERTIFICATE);
    }

    private static CVCObject decode(DataInputStream dataInputStream, CVCTagEnum cVCTagEnum, CVCTagEnum cVCTagEnum2) {
        CVCTagEnum findTagFromValue = findTagFromValue(decodeTag(dataInputStream));
        if (cVCTagEnum != null && findTagFromValue != cVCTagEnum) {
            throw new ParseException("Expected first tag " + cVCTagEnum + " but found " + findTagFromValue);
        }
        if (cVCTagEnum2 == null || findTagFromValue.getValue() != cVCTagEnum2.getValue()) {
            cVCTagEnum2 = findTagFromValue;
        }
        int decodeLength = CVCObject.decodeLength(dataInputStream);
        if (cVCTagEnum2.isSequence()) {
            int available = dataInputStream.available() - decodeLength;
            AbstractSequence createSequence = SequenceFactory.createSequence(cVCTagEnum2);
            while (dataInputStream.available() > available) {
                createSequence.addSubfield(decode(dataInputStream, null, AnonymousClass1.$SwitchMap$org$ejbca$cvc$CVCTagEnum[cVCTagEnum2.ordinal()] != 1 ? null : CVCTagEnum.ARBITRARY_DATA));
            }
            return createSequence instanceof GenericPublicKeyField ? KeyFactory.createInstance((GenericPublicKeyField) createSequence) : createSequence;
        }
        byte[] bArr = new byte[decodeLength];
        dataInputStream.read(bArr, 0, decodeLength);
        return FieldFactory.decodeField(cVCTagEnum2, bArr);
    }
}
