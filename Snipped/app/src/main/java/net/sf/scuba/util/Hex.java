package net.sf.scuba.util;

import C.v;

/* loaded from: classes2.dex */
public final class Hex {
    private static final String HEXCHARS = "0123456789abcdefABCDEF";
    private static final boolean LEFT = true;
    private static final String PRINTABLE = " .,:;'`\"<>()[]{}?/\\!@#$%^&*_-=+|~0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final boolean RIGHT = false;

    private Hex() {
    }

    public static String byteToHexString(byte b9) {
        int i = b9 & 255;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i < 16 ? "0" : "");
        sb2.append(Integer.toHexString(i));
        return sb2.toString().toUpperCase();
    }

    public static String bytesToASCIIString(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b9 : bArr) {
            char c2 = (char) b9;
            if (PRINTABLE.indexOf(c2) < 0) {
                c2 = '.';
            }
            sb2.append(Character.toString(c2));
        }
        return sb2.toString();
    }

    public static String[] bytesToASCIIStrings(byte[] bArr, int i) {
        byte[][] split = split(bArr, i);
        String[] strArr = new String[split.length];
        for (int i9 = 0; i9 < split.length; i9++) {
            strArr[i9] = bytesToASCIIString(split[i9]);
        }
        return strArr;
    }

    public static String bytesToHexString(byte[] bArr) {
        return bytesToHexString(bArr, 1000);
    }

    public static String bytesToPrettyString(byte[] bArr) {
        return bytesToPrettyString(bArr, 16, true, 4, null, true);
    }

    public static String bytesToSpacedHexString(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        while (i < bArr.length) {
            sb2.append(byteToHexString(bArr[i]));
            sb2.append(i < bArr.length + (-1) ? " " : "");
            i++;
        }
        return sb2.toString().toUpperCase();
    }

    private static String[] bytesToSpacedHexStrings(byte[] bArr, int i, int i9) {
        byte[][] split = split(bArr, i);
        String[] strArr = new String[split.length];
        for (int i10 = 0; i10 < split.length; i10++) {
            strArr[i10] = pad(bytesToSpacedHexString(split[i10]), i9, ' ', false);
        }
        return strArr;
    }

    public static int hexDigitToInt(char c2) {
        switch (c2) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            default:
                switch (c2) {
                    case 'A':
                        return 10;
                    case 'B':
                        return 11;
                    case 'C':
                        return 12;
                    case 'D':
                        return 13;
                    case 'E':
                        return 14;
                    case 'F':
                        return 15;
                    default:
                        switch (c2) {
                            case 'a':
                                return 10;
                            case 'b':
                                return 11;
                            case 'c':
                                return 12;
                            case 'd':
                                return 13;
                            case 'e':
                                return 14;
                            case 'f':
                                return 15;
                            default:
                                throw new NumberFormatException();
                        }
                }
        }
    }

    public static byte hexStringToByte(String str) {
        byte[] hexStringToBytes = hexStringToBytes(str);
        if (hexStringToBytes == null || hexStringToBytes.length != 1) {
            throw new NumberFormatException();
        }
        return hexStringToBytes[0];
    }

    public static byte[] hexStringToBytes(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isWhitespace(charAt)) {
                if (HEXCHARS.indexOf(charAt) < 0) {
                    throw new NumberFormatException();
                }
                sb2.append(charAt);
            }
        }
        if (sb2.length() % 2 != 0) {
            sb2.insert(0, "0");
        }
        byte[] bArr = new byte[sb2.length() / 2];
        for (int i9 = 0; i9 < sb2.length(); i9 += 2) {
            bArr[i9 / 2] = (byte) (((hexDigitToInt(sb2.charAt(i9)) & 255) << 4) | (hexDigitToInt(sb2.charAt(i9 + 1)) & 255));
        }
        return bArr;
    }

    public static int hexStringToInt(String str) {
        byte[] hexStringToBytes = hexStringToBytes(str);
        if (hexStringToBytes == null || hexStringToBytes.length != 4) {
            throw new NumberFormatException();
        }
        return (hexStringToBytes[3] & 255) | ((hexStringToBytes[0] & 255) << 24) | ((hexStringToBytes[1] & 255) << 16) | ((hexStringToBytes[2] & 255) << 8);
    }

    public static short hexStringToShort(String str) {
        byte[] hexStringToBytes = hexStringToBytes(str);
        if (hexStringToBytes == null || hexStringToBytes.length != 2) {
            throw new NumberFormatException();
        }
        return (short) ((hexStringToBytes[1] & 255) | ((hexStringToBytes[0] & 255) << 8));
    }

    public static String intToHexString(int i) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i < 268435456 ? "0" : "");
        sb2.append(i < 16777216 ? "0" : "");
        sb2.append(i < 1048576 ? "0" : "");
        sb2.append(i < 65536 ? "0" : "");
        sb2.append(i < 4096 ? "0" : "");
        sb2.append(i < 256 ? "0" : "");
        sb2.append(i < 16 ? "0" : "");
        sb2.append(Integer.toHexString(i));
        return sb2.toString().toUpperCase();
    }

    private static String pad(String str, int i, char c2, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        if (length >= i) {
            return str;
        }
        int i9 = i - length;
        for (int i10 = 0; i10 < i9; i10++) {
            sb2.append(c2);
        }
        if (z10) {
            sb2.append(str);
            return sb2.toString();
        }
        StringBuilder s10 = v.s(str);
        s10.append(sb2.toString());
        return s10.toString();
    }

    public static String shortToHexString(short s10) {
        int i = 65535 & s10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i < 4096 ? "0" : "");
        sb2.append(i < 256 ? "0" : "");
        sb2.append(i < 16 ? "0" : "");
        sb2.append(Integer.toHexString(s10));
        String sb3 = sb2.toString();
        if (sb3.length() > 4) {
            sb3 = sb3.substring(sb3.length() - 4, sb3.length());
        }
        return sb3.toUpperCase();
    }

    public static byte[][] split(byte[] bArr, int i) {
        int length = bArr.length / i;
        int length2 = bArr.length % i;
        byte[][] bArr2 = new byte[(length2 > 0 ? 1 : 0) + length][];
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            byte[] bArr3 = new byte[i];
            bArr2[i10] = bArr3;
            System.arraycopy(bArr, i9, bArr3, 0, i);
            i9 += i;
        }
        if (length2 > 0) {
            byte[] bArr4 = new byte[length2];
            bArr2[length] = bArr4;
            System.arraycopy(bArr, i9, bArr4, 0, length2);
        }
        return bArr2;
    }

    public static String toHexString(byte[] bArr) {
        return bytesToHexString(bArr, 0, bArr.length, 1000);
    }

    public static String bytesToHexString(byte[] bArr, int i) {
        return bArr == null ? "NULL" : bytesToHexString(bArr, 0, bArr.length, i);
    }

    public static String bytesToPrettyString(byte[] bArr, int i, boolean z10, int i9, String str, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        String[] bytesToSpacedHexStrings = bytesToSpacedHexStrings(bArr, i, i * 3);
        String[] bytesToASCIIStrings = bytesToASCIIStrings(bArr, i);
        int i10 = 0;
        while (i10 < bytesToSpacedHexStrings.length) {
            if (z10) {
                sb2.append(pad(Integer.toHexString(i10 * i).toUpperCase(), i9, '0', true) + ": ");
            } else {
                sb2.append(pad(i10 == 0 ? str : "", i9, ' ', true) + " ");
            }
            sb2.append(bytesToSpacedHexStrings[i10]);
            if (z11) {
                sb2.append(" " + bytesToASCIIStrings[i10]);
            }
            sb2.append("\n");
            i10++;
        }
        return sb2.toString();
    }

    public static String toHexString(byte[] bArr, int i) {
        return bytesToHexString(bArr, 0, bArr.length, i);
    }

    public static String bytesToHexString(byte[] bArr, int i, int i9, int i10) {
        if (bArr == null) {
            return "NULL";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i9; i11++) {
            if (i11 != 0 && i11 % i10 == 0) {
                sb2.append("\n");
            }
            sb2.append(byteToHexString(bArr[i + i11]));
        }
        return sb2.toString();
    }

    public static String bytesToHexString(byte[] bArr, int i, int i9) {
        return bytesToHexString(bArr, i, i9, 1000);
    }
}
