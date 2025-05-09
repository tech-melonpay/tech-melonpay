package org.ejbca.cvc.util;

import org.jmrtd.PassportService;

/* loaded from: classes3.dex */
public final class StringConverter {
    private static final char[] HEXCHAR = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final String HEXINDEX = "0123456789abcdef          ABCDEF";

    private StringConverter() {
    }

    public static String byteToHex(byte[] bArr) {
        return byteToHex(bArr, null);
    }

    public static byte[] hexToByte(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        int i = 0;
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = i + 1;
            int indexOf = (HEXINDEX.indexOf(str.charAt(i)) & 15) << 4;
            i += 2;
            bArr[i9] = (byte) (indexOf + (HEXINDEX.indexOf(str.charAt(i10)) & 15));
        }
        return bArr;
    }

    public static String byteToHex(byte[] bArr, String str) {
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            stringBuffer.append(byteToHex(bArr[i]));
            if (str != null && i + 1 < length) {
                stringBuffer.append(str);
            }
        }
        return stringBuffer.toString();
    }

    public static String byteToHex(byte b9) {
        char[] cArr = HEXCHAR;
        char c2 = cArr[((b9 & 255) >> 4) & 15];
        return Character.toString(c2) + cArr[b9 & PassportService.SFI_DG15];
    }
}
