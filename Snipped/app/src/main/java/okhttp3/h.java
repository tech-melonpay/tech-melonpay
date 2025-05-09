package okhttp3;

import ha.C0804c;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.C0967l;
import ka.C0969n;
import kotlin.text.Regex;
import org.bouncycastle.math.Primes;
import org.bouncycastle.tls.CipherSuite;
import org.jmrtd.PassportService;
import pa.C1124b;

/* compiled from: HttpUrl.kt */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: k, reason: collision with root package name */
    public static final char[] f24524k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f24525a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24526b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24527c;

    /* renamed from: d, reason: collision with root package name */
    public final String f24528d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24529e;

    /* renamed from: f, reason: collision with root package name */
    public final List<String> f24530f;

    /* renamed from: g, reason: collision with root package name */
    public final List<String> f24531g;

    /* renamed from: h, reason: collision with root package name */
    public final String f24532h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f24533j;

    /* compiled from: HttpUrl.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f24534a;

        /* renamed from: d, reason: collision with root package name */
        public String f24537d;

        /* renamed from: f, reason: collision with root package name */
        public final ArrayList f24539f;

        /* renamed from: g, reason: collision with root package name */
        public ArrayList f24540g;

        /* renamed from: h, reason: collision with root package name */
        public String f24541h;

        /* renamed from: b, reason: collision with root package name */
        public String f24535b = "";

        /* renamed from: c, reason: collision with root package name */
        public String f24536c = "";

        /* renamed from: e, reason: collision with root package name */
        public int f24538e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f24539f = arrayList;
            arrayList.add("");
        }

        public final h a() {
            ArrayList arrayList;
            String str = this.f24534a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String c2 = b.c(this.f24535b, 0, 0, false, 7);
            String c10 = b.c(this.f24536c, 0, 0, false, 7);
            String str2 = this.f24537d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int b9 = b();
            ArrayList arrayList2 = this.f24539f;
            ArrayList arrayList3 = new ArrayList(P9.n.u(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(b.c((String) it.next(), 0, 0, false, 7));
            }
            ArrayList<String> arrayList4 = this.f24540g;
            if (arrayList4 != null) {
                arrayList = new ArrayList(P9.n.u(arrayList4, 10));
                for (String str3 : arrayList4) {
                    arrayList.add(str3 != null ? b.c(str3, 0, 0, true, 3) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.f24541h;
            return new h(str, c2, c10, str2, b9, arrayList3, arrayList, str4 != null ? b.c(str4, 0, 0, false, 7) : null, toString());
        }

        public final int b() {
            int i = this.f24538e;
            if (i != -1) {
                return i;
            }
            String str = this.f24534a;
            if (kotlin.jvm.internal.f.b(str, "http")) {
                return 80;
            }
            return kotlin.jvm.internal.f.b(str, "https") ? 443 : -1;
        }

        public final void c(String str) {
            String F10 = C1124b.F(b.c(str, 0, 0, false, 7));
            if (F10 == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.f24537d = F10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:151:0x0298, code lost:
        
            if (r2 < 65536) goto L130;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:125:0x0239  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x0267  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x02f8  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x042d  */
        /* JADX WARN: Removed duplicated region for block: B:165:0x02cf  */
        /* JADX WARN: Removed duplicated region for block: B:174:0x025d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:180:0x016f  */
        /* JADX WARN: Removed duplicated region for block: B:190:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0305  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0169  */
        /* JADX WARN: Type inference failed for: r13v10, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r13v11 */
        /* JADX WARN: Type inference failed for: r13v13 */
        /* JADX WARN: Type inference failed for: r19v0 */
        /* JADX WARN: Type inference failed for: r19v1 */
        /* JADX WARN: Type inference failed for: r19v6 */
        /* JADX WARN: Type inference failed for: r19v7 */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 3 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(okhttp3.h r35, java.lang.String r36) {
            /*
                Method dump skipped, instructions count: 1130
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.h.a.d(okhttp3.h, java.lang.String):void");
        }

        public final void e(String str) {
            if (C0967l.U(str, "http", true)) {
                this.f24534a = "http";
            } else {
                if (!C0967l.U(str, "https", true)) {
                    throw new IllegalArgumentException("unexpected scheme: ".concat(str));
                }
                this.f24534a = "https";
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
        
            if (r1 != r3) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.f24534a
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.f24535b
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L22
                goto L2a
            L22:
                java.lang.String r1 = r6.f24536c
                int r1 = r1.length()
                if (r1 <= 0) goto L44
            L2a:
                java.lang.String r1 = r6.f24535b
                r0.append(r1)
                java.lang.String r1 = r6.f24536c
                int r1 = r1.length()
                if (r1 <= 0) goto L3f
                r0.append(r2)
                java.lang.String r1 = r6.f24536c
                r0.append(r1)
            L3f:
                r1 = 64
                r0.append(r1)
            L44:
                java.lang.String r1 = r6.f24537d
                if (r1 == 0) goto L63
                boolean r1 = ka.C0969n.Z(r1, r2)
                if (r1 == 0) goto L5e
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f24537d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L63
            L5e:
                java.lang.String r1 = r6.f24537d
                r0.append(r1)
            L63:
                int r1 = r6.f24538e
                r3 = -1
                if (r1 != r3) goto L6c
                java.lang.String r1 = r6.f24534a
                if (r1 == 0) goto L91
            L6c:
                int r1 = r6.b()
                java.lang.String r4 = r6.f24534a
                if (r4 == 0) goto L8b
                java.lang.String r5 = "http"
                boolean r5 = kotlin.jvm.internal.f.b(r4, r5)
                if (r5 == 0) goto L7f
                r3 = 80
                goto L89
            L7f:
                java.lang.String r5 = "https"
                boolean r4 = kotlin.jvm.internal.f.b(r4, r5)
                if (r4 == 0) goto L89
                r3 = 443(0x1bb, float:6.21E-43)
            L89:
                if (r1 == r3) goto L91
            L8b:
                r0.append(r2)
                r0.append(r1)
            L91:
                java.util.ArrayList r1 = r6.f24539f
                int r2 = r1.size()
                r3 = 0
            L98:
                if (r3 >= r2) goto Lab
                r4 = 47
                r0.append(r4)
                java.lang.Object r4 = r1.get(r3)
                java.lang.String r4 = (java.lang.String) r4
                r0.append(r4)
                int r3 = r3 + 1
                goto L98
            Lab:
                java.util.ArrayList r1 = r6.f24540g
                if (r1 == 0) goto Lb9
                r1 = 63
                r0.append(r1)
                java.util.ArrayList r1 = r6.f24540g
                okhttp3.h.b.e(r1, r0)
            Lb9:
                java.lang.String r1 = r6.f24541h
                if (r1 == 0) goto Lc7
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f24541h
                r0.append(r1)
            Lc7:
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.h.a.toString():java.lang.String");
        }
    }

    /* compiled from: HttpUrl.kt */
    public static final class b {
        public static String a(String str, int i, int i9, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i10) {
            int i11 = (i10 & 1) != 0 ? 0 : i;
            int length = (i10 & 2) != 0 ? str.length() : i9;
            boolean z14 = (i10 & 8) != 0 ? false : z10;
            boolean z15 = (i10 & 16) != 0 ? false : z11;
            boolean z16 = (i10 & 32) != 0 ? false : z12;
            boolean z17 = (i10 & 64) != 0 ? false : z13;
            int i12 = 128;
            Charset charset2 = (i10 & 128) != 0 ? null : charset;
            int i13 = i11;
            while (i13 < length) {
                int codePointAt = str.codePointAt(i13);
                int i14 = 32;
                int i15 = 43;
                char c2 = 127;
                if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= i12 && !z17) || C0969n.Z(str2, (char) codePointAt) || ((codePointAt == 37 && (!z14 || (z15 && !b(i13, length, str)))) || (codePointAt == 43 && z16)))) {
                    Ka.f fVar = new Ka.f();
                    fVar.n0(i11, i13, str);
                    Ka.f fVar2 = null;
                    while (i13 < length) {
                        int codePointAt2 = str.codePointAt(i13);
                        if (!z14 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                            if (codePointAt2 == i15 && z16) {
                                String str3 = z14 ? "+" : "%2B";
                                fVar.n0(0, str3.length(), str3);
                            } else {
                                if (codePointAt2 < i14 || codePointAt2 == 127 || ((codePointAt2 >= 128 && !z17) || C0969n.Z(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z14 || (z15 && !b(i13, length, str)))))) {
                                    if (fVar2 == null) {
                                        fVar2 = new Ka.f();
                                    }
                                    if (charset2 == null || kotlin.jvm.internal.f.b(charset2, StandardCharsets.UTF_8)) {
                                        fVar2.p0(codePointAt2);
                                    } else {
                                        fVar2.k0(str, i13, Character.charCount(codePointAt2) + i13, charset2);
                                    }
                                    while (!fVar2.r()) {
                                        byte readByte = fVar2.readByte();
                                        fVar.W(37);
                                        char[] cArr = h.f24524k;
                                        fVar.W(cArr[((readByte & 255) >> 4) & 15]);
                                        fVar.W(cArr[readByte & PassportService.SFI_DG15]);
                                    }
                                } else {
                                    fVar.p0(codePointAt2);
                                }
                                i13 += Character.charCount(codePointAt2);
                                c2 = 127;
                                i14 = 32;
                                i15 = 43;
                            }
                        }
                        i13 += Character.charCount(codePointAt2);
                        c2 = 127;
                        i14 = 32;
                        i15 = 43;
                    }
                    return fVar.M();
                }
                i13 += Character.charCount(codePointAt);
                i12 = 128;
            }
            return str.substring(i11, length);
        }

        public static boolean b(int i, int i9, String str) {
            int i10 = i + 2;
            return i10 < i9 && str.charAt(i) == '%' && wa.b.q(str.charAt(i + 1)) != -1 && wa.b.q(str.charAt(i10)) != -1;
        }

        public static String c(String str, int i, int i9, boolean z10, int i10) {
            int i11;
            if ((i10 & 1) != 0) {
                i = 0;
            }
            if ((i10 & 2) != 0) {
                i9 = str.length();
            }
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            int i12 = i;
            while (i12 < i9) {
                char charAt = str.charAt(i12);
                if (charAt == '%' || (charAt == '+' && z10)) {
                    Ka.f fVar = new Ka.f();
                    fVar.n0(i, i12, str);
                    while (i12 < i9) {
                        int codePointAt = str.codePointAt(i12);
                        if (codePointAt != 37 || (i11 = i12 + 2) >= i9) {
                            if (codePointAt == 43 && z10) {
                                fVar.W(32);
                                i12++;
                            }
                            fVar.p0(codePointAt);
                            i12 += Character.charCount(codePointAt);
                        } else {
                            int q10 = wa.b.q(str.charAt(i12 + 1));
                            int q11 = wa.b.q(str.charAt(i11));
                            if (q10 != -1 && q11 != -1) {
                                fVar.W((q10 << 4) + q11);
                                i12 = Character.charCount(codePointAt) + i11;
                            }
                            fVar.p0(codePointAt);
                            i12 += Character.charCount(codePointAt);
                        }
                    }
                    return fVar.M();
                }
                i12++;
            }
            return str.substring(i, i9);
        }

        public static ArrayList d(String str) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int f02 = C0969n.f0(str, '&', i, false, 4);
                if (f02 == -1) {
                    f02 = str.length();
                }
                int f03 = C0969n.f0(str, '=', i, false, 4);
                if (f03 == -1 || f03 > f02) {
                    arrayList.add(str.substring(i, f02));
                    arrayList.add(null);
                } else {
                    arrayList.add(str.substring(i, f03));
                    arrayList.add(str.substring(f03 + 1, f02));
                }
                i = f02 + 1;
            }
            return arrayList;
        }

        public static void e(List list, StringBuilder sb2) {
            C0804c U = ha.h.U(ha.h.V(0, list.size()), 2);
            int i = U.f21226a;
            int i9 = U.f21227b;
            int i10 = U.f21228c;
            if ((i10 <= 0 || i > i9) && (i10 >= 0 || i9 > i)) {
                return;
            }
            while (true) {
                String str = (String) list.get(i);
                String str2 = (String) list.get(i + 1);
                if (i > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (i == i9) {
                    return;
                } else {
                    i += i10;
                }
            }
        }
    }

    public h(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f24525a = str;
        this.f24526b = str2;
        this.f24527c = str3;
        this.f24528d = str4;
        this.f24529e = i;
        this.f24530f = arrayList;
        this.f24531g = arrayList2;
        this.f24532h = str5;
        this.i = str6;
        this.f24533j = kotlin.jvm.internal.f.b(str, "https");
    }

    public final String a() {
        if (this.f24527c.length() == 0) {
            return "";
        }
        int length = this.f24525a.length() + 3;
        String str = this.i;
        return str.substring(C0969n.f0(str, ':', length, false, 4) + 1, C0969n.f0(str, '@', 0, false, 6));
    }

    public final String b() {
        int length = this.f24525a.length() + 3;
        String str = this.i;
        int f02 = C0969n.f0(str, '/', length, false, 4);
        return str.substring(f02, wa.b.e(f02, str.length(), str, "?#"));
    }

    public final ArrayList c() {
        int length = this.f24525a.length() + 3;
        String str = this.i;
        int f02 = C0969n.f0(str, '/', length, false, 4);
        int e10 = wa.b.e(f02, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (f02 < e10) {
            int i = f02 + 1;
            int f10 = wa.b.f(str, '/', i, e10);
            arrayList.add(str.substring(i, f10));
            f02 = f10;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f24531g == null) {
            return null;
        }
        String str = this.i;
        int f02 = C0969n.f0(str, '?', 0, false, 6) + 1;
        return str.substring(f02, wa.b.f(str, '#', f02, str.length()));
    }

    public final String e() {
        if (this.f24526b.length() == 0) {
            return "";
        }
        int length = this.f24525a.length() + 3;
        String str = this.i;
        return str.substring(length, wa.b.e(length, str.length(), str, ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h) && kotlin.jvm.internal.f.b(((h) obj).i, this.i);
    }

    public final a f() {
        a aVar = new a();
        String str = this.f24525a;
        aVar.f24534a = str;
        aVar.f24535b = e();
        aVar.f24536c = a();
        aVar.f24537d = this.f24528d;
        int i = kotlin.jvm.internal.f.b(str, "http") ? 80 : kotlin.jvm.internal.f.b(str, "https") ? 443 : -1;
        int i9 = this.f24529e;
        aVar.f24538e = i9 != i ? i9 : -1;
        ArrayList arrayList = aVar.f24539f;
        arrayList.clear();
        arrayList.addAll(c());
        String d10 = d();
        String str2 = null;
        aVar.f24540g = d10 != null ? b.d(b.a(d10, 0, 0, " \"'<>#", true, false, true, false, null, Primes.SMALL_FACTOR_LIMIT)) : null;
        if (this.f24532h != null) {
            String str3 = this.i;
            str2 = str3.substring(C0969n.f0(str3, '#', 0, false, 6) + 1);
        }
        aVar.f24541h = str2;
        return aVar;
    }

    public final a g(String str) {
        try {
            a aVar = new a();
            aVar.d(this, str);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String h() {
        a g10 = g("/...");
        g10.f24535b = b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        g10.f24536c = b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        return g10.a().i;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final URI i() {
        a f10 = f();
        String str = f10.f24537d;
        f10.f24537d = str != null ? new Regex("[\"<>^`{|}]").c(str, "") : null;
        ArrayList arrayList = f10.f24539f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, b.a((String) arrayList.get(i), 0, 0, "[]", true, true, false, false, null, 227));
        }
        ArrayList arrayList2 = f10.f24540g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                String str2 = (String) arrayList2.get(i9);
                arrayList2.set(i9, str2 != null ? b.a(str2, 0, 0, "\\^`{|}", true, true, true, false, null, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256) : null);
            }
        }
        String str3 = f10.f24541h;
        f10.f24541h = str3 != null ? b.a(str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163) : null;
        String aVar = f10.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e10) {
            try {
                return URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").c(aVar, ""));
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final String toString() {
        return this.i;
    }
}
