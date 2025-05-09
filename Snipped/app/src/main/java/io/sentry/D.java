package io.sentry;

import io.sentry.C;
import io.sentry.vendor.gson.stream.JsonToken;
import io.sentry.vendor.gson.stream.MalformedJsonException;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

/* compiled from: JsonObjectReader.java */
/* loaded from: classes2.dex */
public final class D implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Reader f21804a;

    /* renamed from: h, reason: collision with root package name */
    public long f21811h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public String f21812j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f21813k;

    /* renamed from: m, reason: collision with root package name */
    public String[] f21815m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f21816n;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f21805b = new char[1024];

    /* renamed from: c, reason: collision with root package name */
    public int f21806c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f21807d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f21808e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f21809f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f21810g = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f21814l = 1;

    public D(Reader reader) {
        int[] iArr = new int[32];
        this.f21813k = iArr;
        iArr[0] = 6;
        this.f21815m = new String[32];
        this.f21816n = new int[32];
        this.f21804a = reader;
    }

    public final void A() {
        int i = this.f21810g;
        if (i == 0) {
            i = p();
        }
        if (i != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + v0() + E());
        }
        int i9 = this.f21814l;
        int i10 = i9 - 1;
        this.f21814l = i10;
        this.f21815m[i10] = null;
        int[] iArr = this.f21816n;
        int i11 = i9 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f21810g = 0;
    }

    public final boolean C(int i) {
        int i9;
        int i10;
        int i11 = this.f21809f;
        int i12 = this.f21806c;
        this.f21809f = i11 - i12;
        int i13 = this.f21807d;
        char[] cArr = this.f21805b;
        if (i13 != i12) {
            int i14 = i13 - i12;
            this.f21807d = i14;
            System.arraycopy(cArr, i12, cArr, 0, i14);
        } else {
            this.f21807d = 0;
        }
        this.f21806c = 0;
        do {
            int i15 = this.f21807d;
            int read = this.f21804a.read(cArr, i15, cArr.length - i15);
            if (read == -1) {
                return false;
            }
            i9 = this.f21807d + read;
            this.f21807d = i9;
            if (this.f21808e == 0 && (i10 = this.f21809f) == 0 && i9 > 0 && cArr[0] == 65279) {
                this.f21806c++;
                this.f21809f = i10 + 1;
                i++;
            }
        } while (i9 < i);
        return true;
    }

    public final boolean D(char c2) {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (c2 != '/' && c2 != '=') {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        j();
        throw null;
    }

    public final String E() {
        StringBuilder q10 = androidx.camera.core.impl.utils.a.q(this.f21808e + 1, (this.f21806c - this.f21809f) + 1, " at line ", " column ", " path ");
        StringBuilder sb2 = new StringBuilder("$");
        int i = this.f21814l;
        for (int i9 = 0; i9 < i; i9++) {
            int i10 = this.f21813k[i9];
            if (i10 == 1 || i10 == 2) {
                sb2.append('[');
                sb2.append(this.f21816n[i9]);
                sb2.append(']');
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                sb2.append('.');
                String str = this.f21815m[i9];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        q10.append(sb2.toString());
        return q10.toString();
    }

    public final boolean G() {
        int i = this.f21810g;
        if (i == 0) {
            i = p();
        }
        if (i == 5) {
            this.f21810g = 0;
            int[] iArr = this.f21816n;
            int i9 = this.f21814l - 1;
            iArr[i9] = iArr[i9] + 1;
            return true;
        }
        if (i != 6) {
            throw new IllegalStateException("Expected a boolean but was " + v0() + E());
        }
        this.f21810g = 0;
        int[] iArr2 = this.f21816n;
        int i10 = this.f21814l - 1;
        iArr2[i10] = iArr2[i10] + 1;
        return false;
    }

    public final Boolean H() {
        if (v0() != JsonToken.NULL) {
            return Boolean.valueOf(G());
        }
        n0();
        return null;
    }

    public final Date M(InterfaceC0859q interfaceC0859q) {
        if (v0() == JsonToken.NULL) {
            n0();
            return null;
        }
        String r02 = r0();
        try {
            return I.o(r02);
        } catch (Exception e10) {
            interfaceC0859q.f(SentryLevel.DEBUG, "Error when deserializing UTC timestamp format, it might be millis timestamp format.", e10);
            try {
                return I.p(r02);
            } catch (Exception e11) {
                interfaceC0859q.f(SentryLevel.ERROR, "Error when deserializing millis timestamp format.", e11);
                return null;
            }
        }
    }

    public final double N() {
        int i = this.f21810g;
        if (i == 0) {
            i = p();
        }
        if (i == 15) {
            this.f21810g = 0;
            int[] iArr = this.f21816n;
            int i9 = this.f21814l - 1;
            iArr[i9] = iArr[i9] + 1;
            return this.f21811h;
        }
        if (i == 16) {
            this.f21812j = new String(this.f21805b, this.f21806c, this.i);
            this.f21806c += this.i;
        } else if (i == 8 || i == 9) {
            this.f21812j = q0(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.f21812j = u0();
        } else if (i != 11) {
            throw new IllegalStateException("Expected a double but was " + v0() + E());
        }
        this.f21810g = 11;
        double parseDouble = Double.parseDouble(this.f21812j);
        if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + E());
        }
        this.f21812j = null;
        this.f21810g = 0;
        int[] iArr2 = this.f21816n;
        int i10 = this.f21814l - 1;
        iArr2[i10] = iArr2[i10] + 1;
        return parseDouble;
    }

    public final Double P() {
        if (v0() != JsonToken.NULL) {
            return Double.valueOf(N());
        }
        n0();
        return null;
    }

    public final Float Q() {
        if (v0() != JsonToken.NULL) {
            return Float.valueOf((float) N());
        }
        n0();
        return null;
    }

    public final int T() {
        int i = this.f21810g;
        if (i == 0) {
            i = p();
        }
        if (i == 15) {
            long j10 = this.f21811h;
            int i9 = (int) j10;
            if (j10 != i9) {
                throw new NumberFormatException("Expected an int but was " + this.f21811h + E());
            }
            this.f21810g = 0;
            int[] iArr = this.f21816n;
            int i10 = this.f21814l - 1;
            iArr[i10] = iArr[i10] + 1;
            return i9;
        }
        if (i == 16) {
            this.f21812j = new String(this.f21805b, this.f21806c, this.i);
            this.f21806c += this.i;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw new IllegalStateException("Expected an int but was " + v0() + E());
            }
            if (i == 10) {
                this.f21812j = u0();
            } else {
                this.f21812j = q0(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f21812j);
                this.f21810g = 0;
                int[] iArr2 = this.f21816n;
                int i11 = this.f21814l - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f21810g = 11;
        double parseDouble = Double.parseDouble(this.f21812j);
        int i12 = (int) parseDouble;
        if (i12 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.f21812j + E());
        }
        this.f21812j = null;
        this.f21810g = 0;
        int[] iArr3 = this.f21816n;
        int i13 = this.f21814l - 1;
        iArr3[i13] = iArr3[i13] + 1;
        return i12;
    }

    public final Integer V() {
        if (v0() != JsonToken.NULL) {
            return Integer.valueOf(T());
        }
        n0();
        return null;
    }

    public final ArrayList W(InterfaceC0859q interfaceC0859q, A a10) {
        if (v0() == JsonToken.NULL) {
            n0();
            return null;
        }
        d();
        ArrayList arrayList = new ArrayList();
        do {
            try {
                arrayList.add(a10.a(this, interfaceC0859q));
            } catch (Exception e10) {
                interfaceC0859q.f(SentryLevel.ERROR, "Failed to deserialize object in list.", e10);
            }
        } while (v0() == JsonToken.BEGIN_OBJECT);
        y();
        return arrayList;
    }

    public final long Y() {
        int i = this.f21810g;
        if (i == 0) {
            i = p();
        }
        if (i == 15) {
            this.f21810g = 0;
            int[] iArr = this.f21816n;
            int i9 = this.f21814l - 1;
            iArr[i9] = iArr[i9] + 1;
            return this.f21811h;
        }
        if (i == 16) {
            this.f21812j = new String(this.f21805b, this.f21806c, this.i);
            this.f21806c += this.i;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw new IllegalStateException("Expected a long but was " + v0() + E());
            }
            if (i == 10) {
                this.f21812j = u0();
            } else {
                this.f21812j = q0(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f21812j);
                this.f21810g = 0;
                int[] iArr2 = this.f21816n;
                int i10 = this.f21814l - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f21810g = 11;
        double parseDouble = Double.parseDouble(this.f21812j);
        long j10 = (long) parseDouble;
        if (j10 != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.f21812j + E());
        }
        this.f21812j = null;
        this.f21810g = 0;
        int[] iArr3 = this.f21816n;
        int i11 = this.f21814l - 1;
        iArr3[i11] = iArr3[i11] + 1;
        return j10;
    }

    public final Long a0() {
        if (v0() != JsonToken.NULL) {
            return Long.valueOf(Y());
        }
        n0();
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f21810g = 0;
        this.f21813k[0] = 8;
        this.f21814l = 1;
        this.f21804a.close();
    }

    public final void d() {
        int i = this.f21810g;
        if (i == 0) {
            i = p();
        }
        if (i == 3) {
            w0(1);
            this.f21816n[this.f21814l - 1] = 0;
            this.f21810g = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + v0() + E());
        }
    }

    public final HashMap d0(InterfaceC0859q interfaceC0859q, A a10) {
        if (v0() == JsonToken.NULL) {
            n0();
            return null;
        }
        i();
        HashMap hashMap = new HashMap();
        while (true) {
            try {
                hashMap.put(g0(), a10.a(this, interfaceC0859q));
            } catch (Exception e10) {
                interfaceC0859q.f(SentryLevel.ERROR, "Failed to deserialize object in map.", e10);
            }
            if (v0() != JsonToken.BEGIN_OBJECT && v0() != JsonToken.NAME) {
                A();
                return hashMap;
            }
        }
    }

    public final String g0() {
        String q02;
        int i = this.f21810g;
        if (i == 0) {
            i = p();
        }
        if (i == 14) {
            q02 = u0();
        } else if (i == 12) {
            q02 = q0('\'');
        } else {
            if (i != 13) {
                throw new IllegalStateException("Expected a name but was " + v0() + E());
            }
            q02 = q0('\"');
        }
        this.f21810g = 0;
        this.f21815m[this.f21814l - 1] = q02;
        return q02;
    }

    public final void i() {
        int i = this.f21810g;
        if (i == 0) {
            i = p();
        }
        if (i == 1) {
            w0(3);
            this.f21810g = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + v0() + E());
        }
    }

    public final void j() {
        z0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final int k0(boolean z10) {
        int i = this.f21806c;
        int i9 = this.f21807d;
        while (true) {
            if (i == i9) {
                this.f21806c = i;
                if (!C(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + E());
                }
                i = this.f21806c;
                i9 = this.f21807d;
            }
            int i10 = i + 1;
            char c2 = this.f21805b[i];
            if (c2 == '\n') {
                this.f21808e++;
                this.f21809f = i10;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 != '/') {
                    if (c2 != '#') {
                        this.f21806c = i10;
                        return c2;
                    }
                    this.f21806c = i10;
                    j();
                    throw null;
                }
                this.f21806c = i10;
                if (i10 == i9) {
                    this.f21806c = i;
                    boolean C10 = C(2);
                    this.f21806c++;
                    if (!C10) {
                        return c2;
                    }
                }
                j();
                throw null;
            }
            i = i10;
        }
    }

    public final void n0() {
        int i = this.f21810g;
        if (i == 0) {
            i = p();
        }
        if (i != 7) {
            throw new IllegalStateException("Expected null but was " + v0() + E());
        }
        this.f21810g = 0;
        int[] iArr = this.f21816n;
        int i9 = this.f21814l - 1;
        iArr[i9] = iArr[i9] + 1;
    }

    public final Object o0() {
        C c2 = new C();
        c2.d(this);
        C.c a10 = c2.a();
        if (a10 != null) {
            return a10.getValue();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x019c, code lost:
    
        if (r12 != 6) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ae, code lost:
    
        if (D(r10) != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b0, code lost:
    
        if (r12 != 2) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01b2, code lost:
    
        if (r13 == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01b8, code lost:
    
        if (r14 != Long.MIN_VALUE) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ba, code lost:
    
        if (r16 == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01be, code lost:
    
        if (r14 != 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01c0, code lost:
    
        if (r16 != false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c2, code lost:
    
        if (r16 == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01c5, code lost:
    
        r14 = -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01c6, code lost:
    
        r20.f21811h = r14;
        r20.f21806c += r5;
        r9 = 15;
        r20.f21810g = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01d2, code lost:
    
        if (r12 == 2) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d5, code lost:
    
        if (r12 == 4) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d8, code lost:
    
        if (r12 != 7) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01da, code lost:
    
        r20.i = r5;
        r9 = 16;
        r20.f21810g = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0215 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0216  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int p() {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.D.p():int");
    }

    public final <T> T p0(InterfaceC0859q interfaceC0859q, A<T> a10) {
        if (v0() != JsonToken.NULL) {
            return a10.a(this, interfaceC0859q);
        }
        n0();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r10.f21806c = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r10.f21806c = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String q0(char r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r10.f21806c
            int r3 = r10.f21807d
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 1
            r6 = 16
            char[] r7 = r10.f21805b
            if (r2 >= r4) goto L5b
            int r8 = r2 + 1
            char r2 = r7[r2]
            if (r2 != r11) goto L29
            r10.f21806c = r8
            int r8 = r8 - r3
            int r8 = r8 - r5
            if (r1 != 0) goto L21
            java.lang.String r11 = new java.lang.String
            r11.<init>(r7, r3, r8)
            return r11
        L21:
            r1.append(r7, r3, r8)
            java.lang.String r11 = r1.toString()
            return r11
        L29:
            r9 = 92
            if (r2 != r9) goto L4e
            r10.f21806c = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L3f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r6)
            r1.<init>(r4)
        L3f:
            r1.append(r7, r3, r2)
            char r2 = r10.x0()
            r1.append(r2)
            int r2 = r10.f21806c
            int r3 = r10.f21807d
            goto L6
        L4e:
            r6 = 10
            if (r2 != r6) goto L59
            int r2 = r10.f21808e
            int r2 = r2 + r5
            r10.f21808e = r2
            r10.f21809f = r8
        L59:
            r2 = r8
            goto L8
        L5b:
            if (r1 != 0) goto L6b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r6)
            r4.<init>(r1)
            r1 = r4
        L6b:
            int r4 = r2 - r3
            r1.append(r7, r3, r4)
            r10.f21806c = r2
            boolean r2 = r10.C(r5)
            if (r2 == 0) goto L79
            goto L2
        L79:
            java.lang.String r11 = "Unterminated string"
            r10.z0(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.D.q0(char):java.lang.String");
    }

    public final String r0() {
        String str;
        int i = this.f21810g;
        if (i == 0) {
            i = p();
        }
        if (i == 10) {
            str = u0();
        } else if (i == 8) {
            str = q0('\'');
        } else if (i == 9) {
            str = q0('\"');
        } else if (i == 11) {
            str = this.f21812j;
            this.f21812j = null;
        } else if (i == 15) {
            str = Long.toString(this.f21811h);
        } else {
            if (i != 16) {
                throw new IllegalStateException("Expected a string but was " + v0() + E());
            }
            str = new String(this.f21805b, this.f21806c, this.i);
            this.f21806c += this.i;
        }
        this.f21810g = 0;
        int[] iArr = this.f21816n;
        int i9 = this.f21814l - 1;
        iArr[i9] = iArr[i9] + 1;
        return str;
    }

    public final String s0() {
        if (v0() != JsonToken.NULL) {
            return r0();
        }
        n0();
        return null;
    }

    public final void t0(InterfaceC0859q interfaceC0859q, AbstractMap abstractMap, String str) {
        try {
            abstractMap.put(str, o0());
        } catch (Exception e10) {
            interfaceC0859q.d(SentryLevel.ERROR, e10, "Error deserializing unknown key: %s", str);
        }
    }

    public final String toString() {
        return D.class.getSimpleName() + E();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004b, code lost:
    
        j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x004e, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String u0() {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r3 = r0
        L3:
            r2 = r1
        L4:
            int r4 = r8.f21806c
            int r5 = r4 + r2
            int r6 = r8.f21807d
            char[] r7 = r8.f21805b
            if (r5 >= r6) goto L4f
            int r4 = r4 + r2
            char r4 = r7[r4]
            r5 = 9
            if (r4 == r5) goto L5b
            r5 = 10
            if (r4 == r5) goto L5b
            r5 = 12
            if (r4 == r5) goto L5b
            r5 = 13
            if (r4 == r5) goto L5b
            r5 = 32
            if (r4 == r5) goto L5b
            r5 = 35
            if (r4 == r5) goto L4b
            r5 = 44
            if (r4 == r5) goto L5b
            r5 = 47
            if (r4 == r5) goto L4b
            r5 = 61
            if (r4 == r5) goto L4b
            r5 = 123(0x7b, float:1.72E-43)
            if (r4 == r5) goto L5b
            r5 = 125(0x7d, float:1.75E-43)
            if (r4 == r5) goto L5b
            r5 = 58
            if (r4 == r5) goto L5b
            r5 = 59
            if (r4 == r5) goto L4b
            switch(r4) {
                case 91: goto L5b;
                case 92: goto L4b;
                case 93: goto L5b;
                default: goto L48;
            }
        L48:
            int r2 = r2 + 1
            goto L4
        L4b:
            r8.j()
            throw r0
        L4f:
            int r4 = r7.length
            if (r2 >= r4) goto L5d
            int r4 = r2 + 1
            boolean r4 = r8.C(r4)
            if (r4 == 0) goto L5b
            goto L4
        L5b:
            r1 = r2
            goto L7b
        L5d:
            if (r3 != 0) goto L6a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 16
            int r4 = java.lang.Math.max(r2, r4)
            r3.<init>(r4)
        L6a:
            int r4 = r8.f21806c
            r3.append(r7, r4, r2)
            int r4 = r8.f21806c
            int r4 = r4 + r2
            r8.f21806c = r4
            r2 = 1
            boolean r2 = r8.C(r2)
            if (r2 != 0) goto L3
        L7b:
            if (r3 != 0) goto L85
            java.lang.String r0 = new java.lang.String
            int r2 = r8.f21806c
            r0.<init>(r7, r2, r1)
            goto L8e
        L85:
            int r0 = r8.f21806c
            r3.append(r7, r0, r1)
            java.lang.String r0 = r3.toString()
        L8e:
            int r2 = r8.f21806c
            int r2 = r2 + r1
            r8.f21806c = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.D.u0():java.lang.String");
    }

    public final JsonToken v0() {
        int i = this.f21810g;
        if (i == 0) {
            i = p();
        }
        switch (i) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void w0(int i) {
        int i9 = this.f21814l;
        int[] iArr = this.f21813k;
        if (i9 == iArr.length) {
            int i10 = i9 * 2;
            this.f21813k = Arrays.copyOf(iArr, i10);
            this.f21816n = Arrays.copyOf(this.f21816n, i10);
            this.f21815m = (String[]) Arrays.copyOf(this.f21815m, i10);
        }
        int[] iArr2 = this.f21813k;
        int i11 = this.f21814l;
        this.f21814l = i11 + 1;
        iArr2[i11] = i;
    }

    public final char x0() {
        int i;
        if (this.f21806c == this.f21807d && !C(1)) {
            z0("Unterminated escape sequence");
            throw null;
        }
        int i9 = this.f21806c;
        int i10 = i9 + 1;
        this.f21806c = i10;
        char[] cArr = this.f21805b;
        char c2 = cArr[i9];
        if (c2 == '\n') {
            this.f21808e++;
            this.f21809f = i10;
        } else if (c2 != '\"' && c2 != '\'' && c2 != '/' && c2 != '\\') {
            if (c2 == 'b') {
                return '\b';
            }
            if (c2 == 'f') {
                return '\f';
            }
            if (c2 == 'n') {
                return '\n';
            }
            if (c2 == 'r') {
                return '\r';
            }
            if (c2 == 't') {
                return '\t';
            }
            if (c2 != 'u') {
                z0("Invalid escape sequence");
                throw null;
            }
            if (i9 + 5 > this.f21807d && !C(4)) {
                z0("Unterminated escape sequence");
                throw null;
            }
            int i11 = this.f21806c;
            int i12 = i11 + 4;
            char c10 = 0;
            while (i11 < i12) {
                char c11 = cArr[i11];
                char c12 = (char) (c10 << 4);
                if (c11 >= '0' && c11 <= '9') {
                    i = c11 - '0';
                } else if (c11 >= 'a' && c11 <= 'f') {
                    i = c11 - 'W';
                } else {
                    if (c11 < 'A' || c11 > 'F') {
                        throw new NumberFormatException("\\u".concat(new String(cArr, this.f21806c, 4)));
                    }
                    i = c11 - '7';
                }
                c10 = (char) (i + c12);
                i11++;
            }
            this.f21806c += 4;
            return c10;
        }
        return c2;
    }

    public final void y() {
        int i = this.f21810g;
        if (i == 0) {
            i = p();
        }
        if (i != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + v0() + E());
        }
        int i9 = this.f21814l;
        this.f21814l = i9 - 1;
        int[] iArr = this.f21816n;
        int i10 = i9 - 2;
        iArr[i10] = iArr[i10] + 1;
        this.f21810g = 0;
    }

    public final void y0(char c2) {
        do {
            int i = this.f21806c;
            int i9 = this.f21807d;
            while (i < i9) {
                int i10 = i + 1;
                char c10 = this.f21805b[i];
                if (c10 == c2) {
                    this.f21806c = i10;
                    return;
                }
                if (c10 == '\\') {
                    this.f21806c = i10;
                    x0();
                    i = this.f21806c;
                    i9 = this.f21807d;
                } else {
                    if (c10 == '\n') {
                        this.f21808e++;
                        this.f21809f = i10;
                    }
                    i = i10;
                }
            }
            this.f21806c = i;
        } while (C(1));
        z0("Unterminated string");
        throw null;
    }

    public final void z0(String str) {
        StringBuilder s10 = C.v.s(str);
        s10.append(E());
        throw new MalformedJsonException(s10.toString());
    }
}
