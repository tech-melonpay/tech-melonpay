package okhttp3;

import P9.q;
import P9.v;
import da.InterfaceC0701a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ka.C0967l;
import ka.C0969n;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: Headers.kt */
/* loaded from: classes2.dex */
public final class g implements Iterable<Pair<? extends String, ? extends String>>, InterfaceC0701a {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f24522a;

    /* compiled from: Headers.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f24523a = new ArrayList(20);

        public final void a(String str, String str2) {
            b.a(str);
            b.b(str2, str);
            c(str, str2);
        }

        public final void b(String str) {
            int f02 = C0969n.f0(str, ':', 1, false, 4);
            if (f02 != -1) {
                c(str.substring(0, f02), str.substring(f02 + 1));
            } else if (str.charAt(0) == ':') {
                c("", str.substring(1));
            } else {
                c("", str);
            }
        }

        public final void c(String str, String str2) {
            ArrayList arrayList = this.f24523a;
            arrayList.add(str);
            arrayList.add(C0969n.u0(str2).toString());
        }

        public final g d() {
            return new g((String[]) this.f24523a.toArray(new String[0]));
        }

        public final String e(String str) {
            ArrayList arrayList = this.f24523a;
            int size = arrayList.size() - 2;
            int m2 = U4.b.m(size, 0, -2);
            if (m2 > size) {
                return null;
            }
            while (!C0967l.U(str, (String) arrayList.get(size), true)) {
                if (size == m2) {
                    return null;
                }
                size -= 2;
            }
            return (String) arrayList.get(size + 1);
        }

        public final void f(String str) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.f24523a;
                if (i >= arrayList.size()) {
                    return;
                }
                if (C0967l.U(str, (String) arrayList.get(i), true)) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
                i += 2;
            }
        }

        public final void g(String str, String str2) {
            b.a(str);
            b.b(str2, str);
            f(str);
            c(str, str2);
        }
    }

    /* compiled from: Headers.kt */
    public static final class b {
        public static void a(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ('!' > charAt || charAt >= 127) {
                    throw new IllegalArgumentException(wa.b.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                }
            }
        }

        public static void b(String str, String str2) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(wa.b.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2));
                    sb2.append(wa.b.p(str2) ? "" : ": ".concat(str));
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        public static g c(String... strArr) {
            if (strArr.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i = 0;
            for (int i9 = 0; i9 < length; i9++) {
                String str = strArr2[i9];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                strArr2[i9] = C0969n.u0(str).toString();
            }
            int m2 = U4.b.m(0, strArr2.length - 1, 2);
            if (m2 >= 0) {
                while (true) {
                    String str2 = strArr2[i];
                    String str3 = strArr2[i + 1];
                    a(str2);
                    b(str3, str2);
                    if (i == m2) {
                        break;
                    }
                    i += 2;
                }
            }
            return new g(strArr2);
        }
    }

    public g(String[] strArr) {
        this.f24522a = strArr;
    }

    public final String a(String str) {
        String[] strArr = this.f24522a;
        int length = strArr.length - 2;
        int m2 = U4.b.m(length, 0, -2);
        if (m2 <= length) {
            while (!C0967l.U(str, strArr[length], true)) {
                if (length != m2) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String c(int i) {
        return this.f24522a[i * 2];
    }

    public final a e() {
        a aVar = new a();
        q.w(aVar.f24523a, this.f24522a);
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (Arrays.equals(this.f24522a, ((g) obj).f24522a)) {
                return true;
            }
        }
        return false;
    }

    public final String f(int i) {
        return this.f24522a[(i * 2) + 1];
    }

    public final List<String> g(String str) {
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (C0967l.U(str, c(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(f(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : EmptyList.f23104a;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f24522a);
    }

    @Override // java.lang.Iterable
    public final Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = new Pair(c(i), f(i));
        }
        return new v(pairArr, 2);
    }

    public final int size() {
        return this.f24522a.length / 2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String c2 = c(i);
            String f10 = f(i);
            sb2.append(c2);
            sb2.append(": ");
            if (wa.b.p(c2)) {
                f10 = "██";
            }
            sb2.append(f10);
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
