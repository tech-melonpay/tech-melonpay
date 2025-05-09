package ka;

import java.util.ArrayList;

/* compiled from: _Strings.kt */
/* renamed from: ka.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0970o extends C0969n {
    public static String A0(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(s3.b.i("Requested character count ", i, " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(length - i);
    }

    public static ArrayList v0(int i, CharSequence charSequence) {
        if (i <= 0 || i <= 0) {
            throw new IllegalArgumentException(s3.b.i("size ", i, " must be greater than zero.").toString());
        }
        int length = charSequence.length();
        int i9 = 0;
        ArrayList arrayList = new ArrayList((length / i) + (length % i == 0 ? 0 : 1));
        while (i9 >= 0 && i9 < length) {
            int i10 = i9 + i;
            arrayList.add(charSequence.subSequence(i9, (i10 < 0 || i10 > length) ? length : i10).toString());
            i9 = i10;
        }
        return arrayList;
    }

    public static String w0(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(s3.b.i("Requested character count ", i, " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    public static String x0(String str) {
        int length = str.length() - 1;
        if (length < 0) {
            length = 0;
        }
        return z0(length, str);
    }

    public static Character y0(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static String z0(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(s3.b.i("Requested character count ", i, " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }
}
