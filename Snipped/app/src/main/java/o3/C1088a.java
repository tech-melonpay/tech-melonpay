package o3;

import java.util.TimeZone;

/* compiled from: ISO8601Utils.java */
/* renamed from: o3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1088a {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f24365a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i, char c2) {
        return i < str.length() && str.charAt(i) == c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date b(java.lang.String r18, java.text.ParsePosition r19) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.C1088a.b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int c(int i, int i9, String str) {
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
