package L9;

import java.util.TimeZone;

/* compiled from: ISO8601Utils.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f2499a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i, char c2) {
        return i < str.length() && str.charAt(i) == c2;
    }

    public static void b(StringBuilder sb2, int i, int i9) {
        String num = Integer.toString(i);
        for (int length = i9 - num.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date c(java.lang.String r18, java.text.ParsePosition r19) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L9.a.c(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int d(int i, int i9, String str) {
        int i10;
        int i11;
        if (i < 0 || i9 > str.length() || i > i9) {
            throw new NumberFormatException(str);
        }
        if (i < i9) {
            i11 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i9));
            }
            i10 = -digit;
        } else {
            i10 = 0;
            i11 = i;
        }
        while (i11 < i9) {
            int i12 = i11 + 1;
            int digit2 = Character.digit(str.charAt(i11), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i9));
            }
            i10 = (i10 * 10) - digit2;
            i11 = i12;
        }
        return -i10;
    }
}
