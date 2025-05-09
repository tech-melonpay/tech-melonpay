package ka;

/* compiled from: StringsJVM.kt */
/* renamed from: ka.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0967l extends C0966k {
    public static boolean U(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static boolean V(int i, int i9, int i10, String str, String str2, boolean z10) {
        return !z10 ? str.regionMatches(i, str2, i9, i10) : str.regionMatches(z10, i, str2, i9, i10);
    }

    public static String W(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        if (i == 0) {
            return "";
        }
        int i9 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length != 1) {
            StringBuilder sb2 = new StringBuilder(str.length() * i);
            if (1 <= i) {
                while (true) {
                    sb2.append((CharSequence) str);
                    if (i9 == i) {
                        break;
                    }
                    i9++;
                }
            }
            return sb2.toString();
        }
        char charAt = str.charAt(0);
        char[] cArr = new char[i];
        for (int i10 = 0; i10 < i; i10++) {
            cArr[i10] = charAt;
        }
        return new String(cArr);
    }

    public static String X(String str, String str2, String str3, boolean z10) {
        int i = 0;
        int d02 = C0969n.d0(0, str, str2, z10);
        if (d02 < 0) {
            return str;
        }
        int length = str2.length();
        int i9 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i, d02);
            sb2.append(str3);
            i = d02 + length;
            if (d02 >= str.length()) {
                break;
            }
            d02 = C0969n.d0(d02 + i9, str, str2, z10);
        } while (d02 > 0);
        sb2.append((CharSequence) str, i, str.length());
        return sb2.toString();
    }
}
