package a9;

import io.noties.markwon.html.jsoup.UncheckedIOException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;

/* compiled from: CharacterReader.java */
/* renamed from: a9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0525a {

    /* renamed from: a, reason: collision with root package name */
    public final char[] f4488a;

    /* renamed from: b, reason: collision with root package name */
    public final Reader f4489b;

    /* renamed from: c, reason: collision with root package name */
    public int f4490c;

    /* renamed from: d, reason: collision with root package name */
    public int f4491d;

    /* renamed from: e, reason: collision with root package name */
    public int f4492e;

    /* renamed from: f, reason: collision with root package name */
    public int f4493f;

    /* renamed from: g, reason: collision with root package name */
    public int f4494g;

    /* renamed from: h, reason: collision with root package name */
    public final String[] f4495h;

    public C0525a(String str) {
        StringReader stringReader = new StringReader(str);
        str.getClass();
        this.f4495h = new String[128];
        if (!stringReader.markSupported()) {
            throw new IllegalArgumentException("Must be true");
        }
        this.f4489b = stringReader;
        this.f4488a = new char[4096];
        b();
    }

    public static String c(char[] cArr, String[] strArr, int i, int i9) {
        if (i9 > 12) {
            return new String(cArr, i, i9);
        }
        if (i9 < 1) {
            return "";
        }
        int i10 = 0;
        int i11 = i;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i9) {
            i13 = (i13 * 31) + cArr[i11];
            i12++;
            i11++;
        }
        int length = i13 & (strArr.length - 1);
        String str = strArr[length];
        if (str == null) {
            String str2 = new String(cArr, i, i9);
            strArr[length] = str2;
            return str2;
        }
        if (i9 == str.length()) {
            int i14 = i;
            int i15 = i9;
            while (true) {
                int i16 = i15 - 1;
                if (i15 == 0) {
                    return str;
                }
                int i17 = i14 + 1;
                int i18 = i10 + 1;
                if (cArr[i14] != str.charAt(i10)) {
                    break;
                }
                i14 = i17;
                i15 = i16;
                i10 = i18;
            }
        }
        String str3 = new String(cArr, i, i9);
        strArr[length] = str3;
        return str3;
    }

    public final void a() {
        this.f4492e++;
    }

    public final void b() {
        Reader reader = this.f4489b;
        int i = this.f4492e;
        if (i < this.f4491d) {
            return;
        }
        try {
            reader.skip(i);
            reader.mark(4096);
            int read = reader.read(this.f4488a);
            reader.reset();
            if (read != -1) {
                this.f4490c = read;
                this.f4493f += this.f4492e;
                this.f4492e = 0;
                this.f4494g = 0;
                if (read > 3072) {
                    read = 3072;
                }
                this.f4491d = read;
            }
        } catch (IOException e10) {
            throw new UncheckedIOException(e10);
        }
    }

    public final char d() {
        b();
        int i = this.f4492e;
        char c2 = i >= this.f4490c ? (char) 65535 : this.f4488a[i];
        this.f4492e = i + 1;
        return c2;
    }

    public final String e() {
        char[] cArr;
        char c2;
        b();
        int i = this.f4492e;
        while (true) {
            int i9 = this.f4492e;
            int i10 = this.f4490c;
            cArr = this.f4488a;
            if (i9 >= i10 || (((c2 = cArr[i9]) < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !Character.isLetter(c2)))) {
                break;
            }
            this.f4492e++;
        }
        return c(cArr, this.f4495h, i, this.f4492e - i);
    }

    public final String f(char c2) {
        char[] cArr;
        int i;
        b();
        int i9 = this.f4492e;
        while (true) {
            int i10 = this.f4490c;
            cArr = this.f4488a;
            if (i9 >= i10) {
                i = -1;
                break;
            }
            if (c2 == cArr[i9]) {
                i = i9 - this.f4492e;
                break;
            }
            i9++;
        }
        String[] strArr = this.f4495h;
        if (i != -1) {
            String c10 = c(cArr, strArr, this.f4492e, i);
            this.f4492e += i;
            return c10;
        }
        b();
        int i11 = this.f4492e;
        String c11 = c(cArr, strArr, i11, this.f4490c - i11);
        this.f4492e = this.f4490c;
        return c11;
    }

    public final String g(char... cArr) {
        char[] cArr2;
        b();
        int i = this.f4492e;
        int i9 = this.f4490c;
        loop0: while (true) {
            int i10 = this.f4492e;
            cArr2 = this.f4488a;
            if (i10 >= i9) {
                break;
            }
            for (char c2 : cArr) {
                if (cArr2[this.f4492e] == c2) {
                    break loop0;
                }
            }
            this.f4492e++;
        }
        int i11 = this.f4492e;
        return i11 > i ? c(cArr2, this.f4495h, i, i11 - i) : "";
    }

    public final String h(char... cArr) {
        char[] cArr2;
        b();
        int i = this.f4492e;
        int i9 = this.f4490c;
        while (true) {
            int i10 = this.f4492e;
            cArr2 = this.f4488a;
            if (i10 >= i9 || Arrays.binarySearch(cArr, cArr2[i10]) >= 0) {
                break;
            }
            this.f4492e++;
        }
        int i11 = this.f4492e;
        return i11 > i ? c(cArr2, this.f4495h, i, i11 - i) : "";
    }

    public final char i() {
        b();
        int i = this.f4492e;
        if (i >= this.f4490c) {
            return (char) 65535;
        }
        return this.f4488a[i];
    }

    public final boolean j() {
        b();
        return this.f4492e >= this.f4490c;
    }

    public final boolean k(String str) {
        b();
        b();
        int length = str.length();
        if (length <= this.f4490c - this.f4492e) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == this.f4488a[this.f4492e + i]) {
                }
            }
            this.f4492e = str.length() + this.f4492e;
            return true;
        }
        return false;
    }

    public final boolean l(String str) {
        b();
        int length = str.length();
        if (length <= this.f4490c - this.f4492e) {
            for (int i = 0; i < length; i++) {
                if (Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(this.f4488a[this.f4492e + i])) {
                }
            }
            this.f4492e = str.length() + this.f4492e;
            return true;
        }
        return false;
    }

    public final boolean m(char c2) {
        return !j() && this.f4488a[this.f4492e] == c2;
    }

    public final boolean n(char... cArr) {
        if (j()) {
            return false;
        }
        b();
        char c2 = this.f4488a[this.f4492e];
        for (char c10 : cArr) {
            if (c10 == c2) {
                return true;
            }
        }
        return false;
    }

    public final boolean o() {
        if (j()) {
            return false;
        }
        char c2 = this.f4488a[this.f4492e];
        return (c2 >= 'A' && c2 <= 'Z') || (c2 >= 'a' && c2 <= 'z') || Character.isLetter(c2);
    }

    public final int p(String str) {
        b();
        char charAt = str.charAt(0);
        int i = this.f4492e;
        while (i < this.f4490c) {
            char[] cArr = this.f4488a;
            if (charAt != cArr[i]) {
                do {
                    i++;
                    if (i >= this.f4490c) {
                        break;
                    }
                } while (charAt != cArr[i]);
            }
            int i9 = i + 1;
            int length = (str.length() + i9) - 1;
            int i10 = this.f4490c;
            if (i < i10 && length <= i10) {
                int i11 = i9;
                for (int i12 = 1; i11 < length && str.charAt(i12) == cArr[i11]; i12++) {
                    i11++;
                }
                if (i11 == length) {
                    return i - this.f4492e;
                }
            }
            i = i9;
        }
        return -1;
    }

    public final void q() {
        this.f4492e--;
    }

    public final String toString() {
        int i = this.f4492e;
        return new String(this.f4488a, i, this.f4490c - i);
    }
}
