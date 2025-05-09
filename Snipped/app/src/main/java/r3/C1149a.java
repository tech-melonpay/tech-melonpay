package r3;

import C.v;
import com.google.gson.Strictness;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: JsonReader.java */
/* renamed from: r3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1149a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Reader f26149a;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public int f26157j;

    /* renamed from: k, reason: collision with root package name */
    public String f26158k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f26159l;

    /* renamed from: n, reason: collision with root package name */
    public String[] f26161n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f26162o;

    /* renamed from: b, reason: collision with root package name */
    public Strictness f26150b = Strictness.f10314b;

    /* renamed from: c, reason: collision with root package name */
    public final char[] f26151c = new char[1024];

    /* renamed from: d, reason: collision with root package name */
    public int f26152d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f26153e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f26154f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f26155g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f26156h = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f26160m = 1;

    /* compiled from: JsonReader.java */
    /* renamed from: r3.a$a, reason: collision with other inner class name */
    public class C0464a extends Y8.a {
    }

    static {
        Y8.a.f4121a = new C0464a();
    }

    public C1149a(Reader reader) {
        int[] iArr = new int[32];
        this.f26159l = iArr;
        iArr[0] = 6;
        this.f26161n = new String[32];
        this.f26162o = new int[32];
        this.f26149a = reader;
    }

    public void A() {
        int i = this.f26156h;
        if (i == 0) {
            i = p();
        }
        if (i != 2) {
            throw v0("END_OBJECT");
        }
        int i9 = this.f26160m;
        int i10 = i9 - 1;
        this.f26160m = i10;
        this.f26161n[i10] = null;
        int[] iArr = this.f26162o;
        int i11 = i9 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f26156h = 0;
    }

    public final boolean C(int i) {
        int i9;
        int i10;
        int i11 = this.f26155g;
        int i12 = this.f26152d;
        this.f26155g = i11 - i12;
        int i13 = this.f26153e;
        char[] cArr = this.f26151c;
        if (i13 != i12) {
            int i14 = i13 - i12;
            this.f26153e = i14;
            System.arraycopy(cArr, i12, cArr, 0, i14);
        } else {
            this.f26153e = 0;
        }
        this.f26152d = 0;
        do {
            int i15 = this.f26153e;
            int read = this.f26149a.read(cArr, i15, cArr.length - i15);
            if (read == -1) {
                return false;
            }
            i9 = this.f26153e + read;
            this.f26153e = i9;
            if (this.f26154f == 0 && (i10 = this.f26155g) == 0 && i9 > 0 && cArr[0] == 65279) {
                this.f26152d++;
                this.f26155g = i10 + 1;
                i++;
            }
        } while (i9 < i);
        return true;
    }

    public final String D(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i9 = this.f26160m;
            if (i >= i9) {
                return sb2.toString();
            }
            int i10 = this.f26159l[i];
            switch (i10) {
                case 1:
                case 2:
                    int i11 = this.f26162o[i];
                    if (z10 && i11 > 0 && i == i9 - 1) {
                        i11--;
                    }
                    sb2.append('[');
                    sb2.append(i11);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.f26161n[i];
                    if (str == null) {
                        break;
                    } else {
                        sb2.append(str);
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(com.google.android.gms.measurement.internal.a.g(i10, "Unknown scope value: "));
            }
            i++;
        }
    }

    public String E() {
        return D(true);
    }

    public boolean G() {
        int i = this.f26156h;
        if (i == 0) {
            i = p();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    public final boolean H(char c2) {
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
        return false;
    }

    final String M() {
        StringBuilder q10 = androidx.camera.core.impl.utils.a.q(this.f26154f + 1, (this.f26152d - this.f26155g) + 1, " at line ", " column ", " path ");
        q10.append(getPath());
        return q10.toString();
    }

    public boolean N() {
        int i = this.f26156h;
        if (i == 0) {
            i = p();
        }
        if (i == 5) {
            this.f26156h = 0;
            int[] iArr = this.f26162o;
            int i9 = this.f26160m - 1;
            iArr[i9] = iArr[i9] + 1;
            return true;
        }
        if (i != 6) {
            throw v0("a boolean");
        }
        this.f26156h = 0;
        int[] iArr2 = this.f26162o;
        int i10 = this.f26160m - 1;
        iArr2[i10] = iArr2[i10] + 1;
        return false;
    }

    public double P() {
        int i = this.f26156h;
        if (i == 0) {
            i = p();
        }
        if (i == 15) {
            this.f26156h = 0;
            int[] iArr = this.f26162o;
            int i9 = this.f26160m - 1;
            iArr[i9] = iArr[i9] + 1;
            return this.i;
        }
        if (i == 16) {
            this.f26158k = new String(this.f26151c, this.f26152d, this.f26157j);
            this.f26152d += this.f26157j;
        } else if (i == 8 || i == 9) {
            this.f26158k = a0(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.f26158k = g0();
        } else if (i != 11) {
            throw v0("a double");
        }
        this.f26156h = 11;
        double parseDouble = Double.parseDouble(this.f26158k);
        if (this.f26150b != Strictness.f10313a && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            u0("JSON forbids NaN and infinities: " + parseDouble);
            throw null;
        }
        this.f26158k = null;
        this.f26156h = 0;
        int[] iArr2 = this.f26162o;
        int i10 = this.f26160m - 1;
        iArr2[i10] = iArr2[i10] + 1;
        return parseDouble;
    }

    public int Q() {
        int i = this.f26156h;
        if (i == 0) {
            i = p();
        }
        if (i == 15) {
            long j10 = this.i;
            int i9 = (int) j10;
            if (j10 != i9) {
                throw new NumberFormatException("Expected an int but was " + this.i + M());
            }
            this.f26156h = 0;
            int[] iArr = this.f26162o;
            int i10 = this.f26160m - 1;
            iArr[i10] = iArr[i10] + 1;
            return i9;
        }
        if (i == 16) {
            this.f26158k = new String(this.f26151c, this.f26152d, this.f26157j);
            this.f26152d += this.f26157j;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw v0("an int");
            }
            if (i == 10) {
                this.f26158k = g0();
            } else {
                this.f26158k = a0(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f26158k);
                this.f26156h = 0;
                int[] iArr2 = this.f26162o;
                int i11 = this.f26160m - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f26156h = 11;
        double parseDouble = Double.parseDouble(this.f26158k);
        int i12 = (int) parseDouble;
        if (i12 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.f26158k + M());
        }
        this.f26158k = null;
        this.f26156h = 0;
        int[] iArr3 = this.f26162o;
        int i13 = this.f26160m - 1;
        iArr3[i13] = iArr3[i13] + 1;
        return i12;
    }

    public long T() {
        int i = this.f26156h;
        if (i == 0) {
            i = p();
        }
        if (i == 15) {
            this.f26156h = 0;
            int[] iArr = this.f26162o;
            int i9 = this.f26160m - 1;
            iArr[i9] = iArr[i9] + 1;
            return this.i;
        }
        if (i == 16) {
            this.f26158k = new String(this.f26151c, this.f26152d, this.f26157j);
            this.f26152d += this.f26157j;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw v0("a long");
            }
            if (i == 10) {
                this.f26158k = g0();
            } else {
                this.f26158k = a0(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f26158k);
                this.f26156h = 0;
                int[] iArr2 = this.f26162o;
                int i10 = this.f26160m - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f26156h = 11;
        double parseDouble = Double.parseDouble(this.f26158k);
        long j10 = (long) parseDouble;
        if (j10 != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.f26158k + M());
        }
        this.f26158k = null;
        this.f26156h = 0;
        int[] iArr3 = this.f26162o;
        int i11 = this.f26160m - 1;
        iArr3[i11] = iArr3[i11] + 1;
        return j10;
    }

    public String V() {
        String a02;
        int i = this.f26156h;
        if (i == 0) {
            i = p();
        }
        if (i == 14) {
            a02 = g0();
        } else if (i == 12) {
            a02 = a0('\'');
        } else {
            if (i != 13) {
                throw v0("a name");
            }
            a02 = a0('\"');
        }
        this.f26156h = 0;
        this.f26161n[this.f26160m - 1] = a02;
        return a02;
    }

    public final int W(boolean z10) {
        int i = this.f26152d;
        int i9 = this.f26153e;
        while (true) {
            if (i == i9) {
                this.f26152d = i;
                if (!C(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + M());
                }
                i = this.f26152d;
                i9 = this.f26153e;
            }
            int i10 = i + 1;
            char[] cArr = this.f26151c;
            char c2 = cArr[i];
            if (c2 == '\n') {
                this.f26154f++;
                this.f26155g = i10;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.f26152d = i10;
                    if (i10 == i9) {
                        this.f26152d = i;
                        boolean C10 = C(2);
                        this.f26152d++;
                        if (!C10) {
                            return c2;
                        }
                    }
                    j();
                    int i11 = this.f26152d;
                    char c10 = cArr[i11];
                    if (c10 == '*') {
                        this.f26152d = i11 + 1;
                        while (true) {
                            if (this.f26152d + 2 > this.f26153e && !C(2)) {
                                u0("Unterminated comment");
                                throw null;
                            }
                            int i12 = this.f26152d;
                            if (cArr[i12] != '\n') {
                                for (int i13 = 0; i13 < 2; i13++) {
                                    if (cArr[this.f26152d + i13] != "*/".charAt(i13)) {
                                        break;
                                    }
                                }
                                i = this.f26152d + 2;
                                i9 = this.f26153e;
                                break;
                            }
                            this.f26154f++;
                            this.f26155g = i12 + 1;
                            this.f26152d++;
                        }
                    } else {
                        if (c10 != '/') {
                            return c2;
                        }
                        this.f26152d = i11 + 1;
                        r0();
                        i = this.f26152d;
                        i9 = this.f26153e;
                    }
                } else {
                    if (c2 != '#') {
                        this.f26152d = i10;
                        return c2;
                    }
                    this.f26152d = i10;
                    j();
                    r0();
                    i = this.f26152d;
                    i9 = this.f26153e;
                }
            }
            i = i10;
        }
    }

    public void Y() {
        int i = this.f26156h;
        if (i == 0) {
            i = p();
        }
        if (i != 7) {
            throw v0("null");
        }
        this.f26156h = 0;
        int[] iArr = this.f26162o;
        int i9 = this.f26160m - 1;
        iArr[i9] = iArr[i9] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        r11.f26152d = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007c, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r11.f26152d = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a0(char r12) {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.f26152d
            int r3 = r11.f26153e
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 1
            r6 = 16
            char[] r7 = r11.f26151c
            if (r2 >= r4) goto L6c
            int r8 = r2 + 1
            char r2 = r7[r2]
            com.google.gson.Strictness r9 = r11.f26150b
            com.google.gson.Strictness r10 = com.google.gson.Strictness.f10315c
            if (r9 != r10) goto L24
            r9 = 32
            if (r2 < r9) goto L1e
            goto L24
        L1e:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.u0(r12)
            throw r0
        L24:
            if (r2 != r12) goto L3a
            r11.f26152d = r8
            int r8 = r8 - r3
            int r8 = r8 - r5
            if (r1 != 0) goto L32
            java.lang.String r12 = new java.lang.String
            r12.<init>(r7, r3, r8)
            return r12
        L32:
            r1.append(r7, r3, r8)
            java.lang.String r12 = r1.toString()
            return r12
        L3a:
            r9 = 92
            if (r2 != r9) goto L5f
            r11.f26152d = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L50
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r6)
            r1.<init>(r4)
        L50:
            r1.append(r7, r3, r2)
            char r2 = r11.o0()
            r1.append(r2)
            int r2 = r11.f26152d
            int r3 = r11.f26153e
            goto L6
        L5f:
            r6 = 10
            if (r2 != r6) goto L6a
            int r2 = r11.f26154f
            int r2 = r2 + r5
            r11.f26154f = r2
            r11.f26155g = r8
        L6a:
            r2 = r8
            goto L8
        L6c:
            if (r1 != 0) goto L7c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r6)
            r4.<init>(r1)
            r1 = r4
        L7c:
            int r4 = r2 - r3
            r1.append(r7, r3, r4)
            r11.f26152d = r2
            boolean r2 = r11.C(r5)
            if (r2 == 0) goto L8b
            goto L2
        L8b:
            java.lang.String r12 = "Unterminated string"
            r11.u0(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.C1149a.a0(char):java.lang.String");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f26156h = 0;
        this.f26159l[0] = 8;
        this.f26160m = 1;
        this.f26149a.close();
    }

    public void d() {
        int i = this.f26156h;
        if (i == 0) {
            i = p();
        }
        if (i != 3) {
            throw v0("BEGIN_ARRAY");
        }
        n0(1);
        this.f26162o[this.f26160m - 1] = 0;
        this.f26156h = 0;
    }

    public String d0() {
        String str;
        int i = this.f26156h;
        if (i == 0) {
            i = p();
        }
        if (i == 10) {
            str = g0();
        } else if (i == 8) {
            str = a0('\'');
        } else if (i == 9) {
            str = a0('\"');
        } else if (i == 11) {
            str = this.f26158k;
            this.f26158k = null;
        } else if (i == 15) {
            str = Long.toString(this.i);
        } else {
            if (i != 16) {
                throw v0("a string");
            }
            str = new String(this.f26151c, this.f26152d, this.f26157j);
            this.f26152d += this.f26157j;
        }
        this.f26156h = 0;
        int[] iArr = this.f26162o;
        int i9 = this.f26160m - 1;
        iArr[i9] = iArr[i9] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        j();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String g0() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f26152d
            int r4 = r3 + r2
            int r5 = r7.f26153e
            char[] r6 = r7.f26151c
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.j()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.C(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f26152d
            r0.append(r6, r3, r2)
            int r3 = r7.f26152d
            int r3 = r3 + r2
            r7.f26152d = r3
            r2 = 1
            boolean r2 = r7.C(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f26152d
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f26152d
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f26152d
            int r2 = r2 + r1
            r7.f26152d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.C1149a.g0():java.lang.String");
    }

    public String getPath() {
        return D(false);
    }

    public void i() {
        int i = this.f26156h;
        if (i == 0) {
            i = p();
        }
        if (i != 1) {
            throw v0("BEGIN_OBJECT");
        }
        n0(3);
        this.f26156h = 0;
    }

    public final void j() {
        if (this.f26150b == Strictness.f10313a) {
            return;
        }
        u0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public JsonToken k0() {
        int i = this.f26156h;
        if (i == 0) {
            i = p();
        }
        switch (i) {
            case 1:
                return JsonToken.f10412c;
            case 2:
                return JsonToken.f10413d;
            case 3:
                return JsonToken.f10410a;
            case 4:
                return JsonToken.f10411b;
            case 5:
            case 6:
                return JsonToken.f10417h;
            case 7:
                return JsonToken.i;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.f10415f;
            case 12:
            case 13:
            case 14:
                return JsonToken.f10414e;
            case 15:
            case 16:
                return JsonToken.f10416g;
            case 17:
                return JsonToken.f10418j;
            default:
                throw new AssertionError();
        }
    }

    public final void n0(int i) {
        int i9 = this.f26160m;
        int[] iArr = this.f26159l;
        if (i9 == iArr.length) {
            int i10 = i9 * 2;
            this.f26159l = Arrays.copyOf(iArr, i10);
            this.f26162o = Arrays.copyOf(this.f26162o, i10);
            this.f26161n = (String[]) Arrays.copyOf(this.f26161n, i10);
        }
        int[] iArr2 = this.f26159l;
        int i11 = this.f26160m;
        this.f26160m = i11 + 1;
        iArr2[i11] = i;
    }

    public final char o0() {
        int i;
        if (this.f26152d == this.f26153e && !C(1)) {
            u0("Unterminated escape sequence");
            throw null;
        }
        int i9 = this.f26152d;
        int i10 = i9 + 1;
        this.f26152d = i10;
        char[] cArr = this.f26151c;
        char c2 = cArr[i9];
        Strictness strictness = Strictness.f10315c;
        if (c2 != '\n') {
            if (c2 != '\"') {
                if (c2 != '\'') {
                    if (c2 != '/' && c2 != '\\') {
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
                            u0("Invalid escape sequence");
                            throw null;
                        }
                        if (i9 + 5 > this.f26153e && !C(4)) {
                            u0("Unterminated escape sequence");
                            throw null;
                        }
                        int i11 = this.f26152d;
                        int i12 = i11 + 4;
                        int i13 = 0;
                        while (i11 < i12) {
                            char c10 = cArr[i11];
                            int i14 = i13 << 4;
                            if (c10 >= '0' && c10 <= '9') {
                                i = c10 - '0';
                            } else if (c10 >= 'a' && c10 <= 'f') {
                                i = c10 - 'W';
                            } else {
                                if (c10 < 'A' || c10 > 'F') {
                                    u0("Malformed Unicode escape \\u".concat(new String(cArr, this.f26152d, 4)));
                                    throw null;
                                }
                                i = c10 - '7';
                            }
                            i13 = i + i14;
                            i11++;
                        }
                        this.f26152d += 4;
                        return (char) i13;
                    }
                }
            }
            return c2;
        }
        if (this.f26150b == strictness) {
            u0("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f26154f++;
        this.f26155g = i10;
        if (this.f26150b == strictness) {
            u0("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0222, code lost:
    
        if (H(r1) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a7, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0225, code lost:
    
        if (r5 != 2) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0227, code lost:
    
        if (r14 == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x022d, code lost:
    
        if (r9 != Long.MIN_VALUE) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x022f, code lost:
    
        if (r16 == 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0236, code lost:
    
        if (r9 != 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0238, code lost:
    
        if (r16 != 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x023a, code lost:
    
        if (r16 == 0) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x023d, code lost:
    
        r9 = -r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x023e, code lost:
    
        r20.i = r9;
        r20.f26152d += r8;
        r9 = 15;
        r20.f26156h = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0232, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x024a, code lost:
    
        if (r5 == r1) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x024d, code lost:
    
        if (r5 == 4) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0250, code lost:
    
        if (r5 != 7) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0252, code lost:
    
        r20.f26157j = r8;
        r9 = 16;
        r20.f26156h = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x028a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int p() {
        /*
            Method dump skipped, instructions count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.C1149a.p():int");
    }

    public final void p0(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.f26150b = strictness;
    }

    public final void q0(char c2) {
        do {
            int i = this.f26152d;
            int i9 = this.f26153e;
            while (i < i9) {
                int i10 = i + 1;
                char c10 = this.f26151c[i];
                if (c10 == c2) {
                    this.f26152d = i10;
                    return;
                }
                if (c10 == '\\') {
                    this.f26152d = i10;
                    o0();
                    i = this.f26152d;
                    i9 = this.f26153e;
                } else {
                    if (c10 == '\n') {
                        this.f26154f++;
                        this.f26155g = i10;
                    }
                    i = i10;
                }
            }
            this.f26152d = i;
        } while (C(1));
        u0("Unterminated string");
        throw null;
    }

    public final void r0() {
        char c2;
        do {
            if (this.f26152d >= this.f26153e && !C(1)) {
                return;
            }
            int i = this.f26152d;
            int i9 = i + 1;
            this.f26152d = i9;
            c2 = this.f26151c[i];
            if (c2 == '\n') {
                this.f26154f++;
                this.f26155g = i9;
                return;
            }
        } while (c2 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        j();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s0() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f26152d
            int r2 = r1 + r0
            int r3 = r4.f26153e
            if (r2 >= r3) goto L51
            char[] r2 = r4.f26151c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.j()
        L4b:
            int r1 = r4.f26152d
            int r1 = r1 + r0
            r4.f26152d = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f26152d = r1
            r0 = 1
            boolean r0 = r4.C(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.C1149a.s0():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void t0() {
        int i = 0;
        do {
            int i9 = this.f26156h;
            if (i9 == 0) {
                i9 = p();
            }
            switch (i9) {
                case 1:
                    n0(3);
                    i++;
                    this.f26156h = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.f26161n[this.f26160m - 1] = null;
                    }
                    this.f26160m--;
                    i--;
                    this.f26156h = 0;
                    break;
                case 3:
                    n0(1);
                    i++;
                    this.f26156h = 0;
                    break;
                case 4:
                    this.f26160m--;
                    i--;
                    this.f26156h = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f26156h = 0;
                    break;
                case 8:
                    q0('\'');
                    this.f26156h = 0;
                    break;
                case 9:
                    q0('\"');
                    this.f26156h = 0;
                    break;
                case 10:
                    s0();
                    this.f26156h = 0;
                    break;
                case 12:
                    q0('\'');
                    if (i == 0) {
                        this.f26161n[this.f26160m - 1] = "<skipped>";
                    }
                    this.f26156h = 0;
                    break;
                case 13:
                    q0('\"');
                    if (i == 0) {
                        this.f26161n[this.f26160m - 1] = "<skipped>";
                    }
                    this.f26156h = 0;
                    break;
                case 14:
                    s0();
                    if (i == 0) {
                        this.f26161n[this.f26160m - 1] = "<skipped>";
                    }
                    this.f26156h = 0;
                    break;
                case 16:
                    this.f26152d += this.f26157j;
                    this.f26156h = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.f26162o;
        int i10 = this.f26160m - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public String toString() {
        return getClass().getSimpleName() + M();
    }

    public final void u0(String str) {
        StringBuilder s10 = v.s(str);
        s10.append(M());
        s10.append("\nSee ");
        s10.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new MalformedJsonException(s10.toString());
    }

    public final IllegalStateException v0(String str) {
        String str2 = k0() == JsonToken.i ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder m2 = com.google.android.gms.measurement.internal.a.m("Expected ", str, " but was ");
        m2.append(k0());
        m2.append(M());
        m2.append("\nSee ");
        m2.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(m2.toString());
    }

    public void y() {
        int i = this.f26156h;
        if (i == 0) {
            i = p();
        }
        if (i != 4) {
            throw v0("END_ARRAY");
        }
        int i9 = this.f26160m;
        this.f26160m = i9 - 1;
        int[] iArr = this.f26162o;
        int i10 = i9 - 2;
        iArr[i10] = iArr[i10] + 1;
        this.f26156h = 0;
    }
}
