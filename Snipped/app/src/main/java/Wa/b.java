package wa;

import C.v;
import Ka.i;
import Ka.q;
import Ka.y;
import P9.m;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import ka.C0956a;
import ka.C0967l;
import ka.C0969n;
import kotlin.jvm.internal.f;
import kotlin.text.Regex;
import okhttp3.g;
import okhttp3.h;
import okhttp3.p;
import va.j;

/* compiled from: Util.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f30872a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f30873b = g.b.c(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final j f30874c;

    /* renamed from: d, reason: collision with root package name */
    public static final q f30875d;

    /* renamed from: e, reason: collision with root package name */
    public static final TimeZone f30876e;

    /* renamed from: f, reason: collision with root package name */
    public static final Regex f30877f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f30878g;

    /* JADX WARN: Code restructure failed: missing block: B:59:0x015d, code lost:
    
        continue;
     */
    static {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.b.<clinit>():void");
    }

    public static final boolean a(h hVar, h hVar2) {
        return f.b(hVar.f24528d, hVar2.f24528d) && hVar.f24529e == hVar2.f24529e && f.b(hVar.f24525a, hVar2.f24525a);
    }

    public static final int b(String str, long j10, TimeUnit timeUnit) {
        if (j10 < 0) {
            throw new IllegalStateException(str.concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j10);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(str.concat(" too large.").toString());
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(str.concat(" too small.").toString());
    }

    public static final void c(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!f.b(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(int i, int i9, String str, String str2) {
        while (i < i9) {
            if (C0969n.Z(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i9;
    }

    public static final int f(String str, char c2, int i, int i9) {
        while (i < i9) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i9;
    }

    public static /* synthetic */ int g(String str, char c2, int i, int i9, int i10) {
        if ((i10 & 2) != 0) {
            i = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = str.length();
        }
        return f(str, c2, i, i9);
    }

    public static final String h(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0033, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean i(java.lang.String[] r7, java.lang.String[] r8, java.util.Comparator<? super java.lang.String> r9) {
        /*
            int r0 = r7.length
            r1 = 0
            if (r0 != 0) goto L5
            goto L36
        L5:
            if (r8 == 0) goto L36
            int r0 = r8.length
            if (r0 != 0) goto Lb
            goto L36
        Lb:
            int r0 = r7.length
            r2 = r1
        Ld:
            if (r2 >= r0) goto L36
            r3 = r7[r2]
            r4 = r1
        L12:
            int r5 = r8.length
            r6 = 1
            if (r4 >= r5) goto L18
            r5 = r6
            goto L19
        L18:
            r5 = r1
        L19:
            if (r5 == 0) goto L33
            int r5 = r4 + 1
            r4 = r8[r4]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L28
            int r4 = r9.compare(r3, r4)
            if (r4 != 0) goto L26
            return r6
        L26:
            r4 = r5
            goto L12
        L28:
            r7 = move-exception
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            java.lang.String r7 = r7.getMessage()
            r8.<init>(r7)
            throw r8
        L33:
            int r2 = r2 + 1
            goto Ld
        L36:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.b.i(java.lang.String[], java.lang.String[], java.util.Comparator):boolean");
    }

    public static final long j(p pVar) {
        String a10 = pVar.f24676f.a("Content-Length");
        if (a10 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(a10);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @SafeVarargs
    public static final <T> List<T> k(T... tArr) {
        Object[] objArr = (Object[]) tArr.clone();
        return Collections.unmodifiableList(m.q(Arrays.copyOf(objArr, objArr.length)));
    }

    public static final int l(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (f.c(charAt, 31) <= 0 || f.c(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int m(int i, int i9, String str) {
        while (i < i9) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i9;
    }

    public static final int n(int i, int i9, String str) {
        int i10 = i9 - 1;
        if (i <= i10) {
            while (true) {
                char charAt = str.charAt(i10);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i10 + 1;
                }
                if (i10 == i) {
                    break;
                }
                i10--;
            }
        }
        return i;
    }

    public static final String[] o(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean p(String str) {
        return C0967l.U(str, "Authorization", true) || C0967l.U(str, "Cookie", true) || C0967l.U(str, "Proxy-Authorization", true) || C0967l.U(str, "Set-Cookie", true);
    }

    public static final int q(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final Charset r(i iVar, Charset charset) {
        Charset charset2;
        int S = iVar.S(f30875d);
        if (S == -1) {
            return charset;
        }
        if (S == 0) {
            return StandardCharsets.UTF_8;
        }
        if (S == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (S == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (S == 3) {
            C0956a.f23053a.getClass();
            charset2 = C0956a.f23056d;
            if (charset2 == null) {
                charset2 = Charset.forName("UTF-32BE");
                C0956a.f23056d = charset2;
            }
        } else {
            if (S != 4) {
                throw new AssertionError();
            }
            C0956a.f23053a.getClass();
            charset2 = C0956a.f23055c;
            if (charset2 == null) {
                charset2 = Charset.forName("UTF-32LE");
                C0956a.f23055c = charset2;
            }
        }
        return charset2;
    }

    public static final int s(i iVar) {
        return (iVar.readByte() & 255) | ((iVar.readByte() & 255) << 16) | ((iVar.readByte() & 255) << 8);
    }

    public static final boolean t(y yVar, int i, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c2 = yVar.b().e() ? yVar.b().c() - nanoTime : Long.MAX_VALUE;
        yVar.b().d(Math.min(c2, timeUnit.toNanos(i)) + nanoTime);
        try {
            Ka.f fVar = new Ka.f();
            while (yVar.i0(fVar, 8192L) != -1) {
                fVar.d();
            }
            if (c2 == Long.MAX_VALUE) {
                yVar.b().a();
            } else {
                yVar.b().d(nanoTime + c2);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                yVar.b().a();
            } else {
                yVar.b().d(nanoTime + c2);
            }
            return false;
        } catch (Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                yVar.b().a();
            } else {
                yVar.b().d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static final g u(List<Ca.a> list) {
        g.a aVar = new g.a();
        for (Ca.a aVar2 : list) {
            aVar.c(aVar2.f703a.k(), aVar2.f704b.k());
        }
        return aVar.d();
    }

    public static final String v(h hVar, boolean z10) {
        String str = hVar.f24528d;
        if (C0969n.Y(str, com.sumsub.sns.internal.core.data.model.p.f15541a, false)) {
            str = v.o("[", str, ']');
        }
        int i = hVar.f24529e;
        if (!z10) {
            String str2 = hVar.f24525a;
            if (i == (f.b(str2, "http") ? 80 : f.b(str2, "https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final <T> List<T> w(List<? extends T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static final <K, V> Map<K, V> x(Map<K, ? extends V> map) {
        return map.isEmpty() ? kotlin.collections.a.p() : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static final int y(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final String z(int i, int i9, String str) {
        int m2 = m(i, i9, str);
        return str.substring(m2, n(m2, i9, str));
    }
}
