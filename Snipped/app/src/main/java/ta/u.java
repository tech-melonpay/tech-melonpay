package ta;

import ka.C0969n;
import pa.C1124b;

/* compiled from: StringJsonLexer.kt */
/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public int f30025a;

    /* renamed from: b, reason: collision with root package name */
    public final j f30026b;

    /* renamed from: c, reason: collision with root package name */
    public String f30027c;

    /* renamed from: d, reason: collision with root package name */
    public final StringBuilder f30028d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30029e;

    public u(String str) {
        j jVar = new j();
        jVar.f29990a = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        jVar.f29991b = iArr;
        jVar.f29992c = -1;
        this.f30026b = jVar;
        this.f30028d = new StringBuilder();
        this.f30029e = str;
    }

    public static /* synthetic */ void m(u uVar, String str, int i, String str2, int i9) {
        if ((i9 & 2) != 0) {
            i = uVar.f30025a;
        }
        if ((i9 & 4) != 0) {
            str2 = "";
        }
        uVar.l(str, i, str2);
        throw null;
    }

    public final int a(int i, CharSequence charSequence) {
        int i9 = i + 4;
        if (i9 < charSequence.length()) {
            this.f30028d.append((char) (o(i + 3, charSequence) + (o(i, charSequence) << 12) + (o(i + 1, charSequence) << 8) + (o(i + 2, charSequence) << 4)));
            return i9;
        }
        this.f30025a = i;
        if (i9 < charSequence.length()) {
            return a(this.f30025a, charSequence);
        }
        m(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public final boolean b() {
        int i = this.f30025a;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.f30029e;
            if (i >= str.length()) {
                this.f30025a = i;
                return false;
            }
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f30025a = i;
                return !(charAt == '}' || charAt == ']' || charAt == ':' || charAt == ',');
            }
            i++;
        }
    }

    public final void c(int i, String str) {
        if (p().length() - i < str.length()) {
            m(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i9 = 0; i9 < length; i9++) {
            if (str.charAt(i9) != (p().charAt(i + i9) | ' ')) {
                m(this, "Expected valid boolean literal prefix, but had '" + j() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f30025a = str.length() + i;
    }

    public final String d() {
        String str;
        g('\"');
        int i = this.f30025a;
        String str2 = this.f30029e;
        int f02 = C0969n.f0(str2, '\"', i, false, 4);
        if (f02 == -1) {
            j();
            n((byte) 1, false);
            throw null;
        }
        int i9 = i;
        while (i9 < f02) {
            if (str2.charAt(i9) == '\\') {
                int i10 = this.f30025a;
                char charAt = str2.charAt(i9);
                boolean z10 = false;
                while (charAt != '\"') {
                    if (charAt == '\\') {
                        this.f30028d.append((CharSequence) p(), i10, i9);
                        int t3 = t(i9 + 1);
                        if (t3 == -1) {
                            m(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int i11 = t3 + 1;
                        char charAt2 = str2.charAt(t3);
                        if (charAt2 == 'u') {
                            i11 = a(i11, str2);
                        } else {
                            char c2 = charAt2 < 'u' ? e.f29982a[charAt2] : (char) 0;
                            if (c2 == 0) {
                                m(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            this.f30028d.append(c2);
                        }
                        i10 = t(i11);
                        if (i10 == -1) {
                            m(this, "Unexpected EOF", i10, null, 4);
                            throw null;
                        }
                    } else {
                        i9++;
                        if (i9 >= str2.length()) {
                            this.f30028d.append((CharSequence) p(), i10, i9);
                            i10 = t(i9);
                            if (i10 == -1) {
                                m(this, "Unexpected EOF", i10, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            charAt = str2.charAt(i9);
                        }
                    }
                    i9 = i10;
                    z10 = true;
                    charAt = str2.charAt(i9);
                }
                if (z10) {
                    this.f30028d.append((CharSequence) p(), i10, i9);
                    StringBuilder sb2 = this.f30028d;
                    String sb3 = sb2.toString();
                    sb2.setLength(0);
                    str = sb3;
                } else {
                    str = p().subSequence(i10, i9).toString();
                }
                this.f30025a = i9 + 1;
                return str;
            }
            i9++;
        }
        this.f30025a = f02 + 1;
        return str2.substring(i, f02);
    }

    public final byte e() {
        byte k3;
        do {
            int i = this.f30025a;
            if (i == -1) {
                return (byte) 10;
            }
            String str = this.f30029e;
            if (i >= str.length()) {
                return (byte) 10;
            }
            int i9 = this.f30025a;
            this.f30025a = i9 + 1;
            k3 = C1124b.k(str.charAt(i9));
        } while (k3 == 3);
        return k3;
    }

    public final byte f(byte b9) {
        byte e10 = e();
        if (e10 == b9) {
            return e10;
        }
        n(b9, true);
        throw null;
    }

    public final void g(char c2) {
        if (this.f30025a == -1) {
            x(c2);
            throw null;
        }
        while (true) {
            int i = this.f30025a;
            String str = this.f30029e;
            if (i >= str.length()) {
                this.f30025a = -1;
                x(c2);
                throw null;
            }
            int i9 = this.f30025a;
            this.f30025a = i9 + 1;
            char charAt = str.charAt(i9);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt == c2) {
                    return;
                }
                x(c2);
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f2, code lost:
    
        m(r19, "Unexpected symbol '" + r9 + "' in numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010d, code lost:
    
        if (r11 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010f, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0112, code lost:
    
        if (r1 == r11) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0114, code lost:
    
        if (r13 == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0118, code lost:
    
        if (r1 == (r11 - 1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011f, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0121, code lost:
    
        if (r3 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012d, code lost:
    
        if (p().charAt(r11) != '\"') goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012f, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0132, code lost:
    
        m(r19, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0139, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013a, code lost:
    
        m(r19, r18, 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0141, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0142, code lost:
    
        r19.f30025a = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0144, code lost:
    
        if (r12 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0146, code lost:
    
        r1 = r14;
        r5 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014b, code lost:
    
        if (r5 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014d, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015c, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0161, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0167, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016f, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0171, code lost:
    
        r14 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0173, code lost:
    
        m(r19, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x018b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018c, code lost:
    
        m(r19, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0191, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0155, code lost:
    
        if (r5 != true) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0157, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0197, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0198, code lost:
    
        if (r13 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019f, code lost:
    
        if (r14 == Long.MIN_VALUE) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a2, code lost:
    
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a3, code lost:
    
        m(r19, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:?, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a9, code lost:
    
        m(r19, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ae, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0111, code lost:
    
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long h() {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.u.h():long");
    }

    public final String i() {
        String str = this.f30027c;
        if (str == null) {
            return d();
        }
        this.f30027c = null;
        return str;
    }

    public final String j() {
        String str;
        String str2 = this.f30027c;
        if (str2 != null) {
            this.f30027c = null;
            return str2;
        }
        int u6 = u();
        if (u6 >= p().length() || u6 == -1) {
            m(this, "EOF", u6, null, 4);
            throw null;
        }
        byte k3 = C1124b.k(p().charAt(u6));
        if (k3 == 1) {
            return i();
        }
        if (k3 != 0) {
            m(this, "Expected beginning of the string, but got " + p().charAt(u6), 0, null, 6);
            throw null;
        }
        boolean z10 = false;
        while (C1124b.k(p().charAt(u6)) == 0) {
            u6++;
            if (u6 >= p().length()) {
                this.f30028d.append((CharSequence) p(), this.f30025a, u6);
                int t3 = t(u6);
                if (t3 == -1) {
                    this.f30025a = u6;
                    this.f30028d.append((CharSequence) p(), 0, 0);
                    StringBuilder sb2 = this.f30028d;
                    String sb3 = sb2.toString();
                    sb2.setLength(0);
                    return sb3;
                }
                u6 = t3;
                z10 = true;
            }
        }
        if (z10) {
            this.f30028d.append((CharSequence) p(), this.f30025a, u6);
            StringBuilder sb4 = this.f30028d;
            String sb5 = sb4.toString();
            sb4.setLength(0);
            str = sb5;
        } else {
            str = p().subSequence(this.f30025a, u6).toString();
        }
        this.f30025a = u6;
        return str;
    }

    public final String k() {
        String j10 = j();
        if (!kotlin.jvm.internal.f.b(j10, "null") || p().charAt(this.f30025a - 1) == '\"') {
            return j10;
        }
        m(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public final void l(String str, int i, String str2) {
        String concat = str2.length() == 0 ? "" : "\n".concat(str2);
        StringBuilder r8 = androidx.camera.core.impl.utils.a.r(str, " at path: ");
        r8.append(this.f30026b.a());
        r8.append(concat);
        throw C1124b.g(i, r8.toString(), p());
    }

    public final void n(byte b9, boolean z10) {
        String G8 = C1124b.G(b9);
        int i = z10 ? this.f30025a - 1 : this.f30025a;
        m(this, s3.b.l("Expected ", G8, ", but had '", (this.f30025a == p().length() || i < 0) ? "EOF" : String.valueOf(p().charAt(i)), "' instead"), i, null, 4);
        throw null;
    }

    public final int o(int i, CharSequence charSequence) {
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        m(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public final String p() {
        return this.f30029e;
    }

    public final String q(String str, boolean z10) {
        int i = this.f30025a;
        try {
            if (e() != 6) {
                return null;
            }
            if (!kotlin.jvm.internal.f.b(s(z10), str)) {
                return null;
            }
            this.f30027c = null;
            if (e() != 5) {
                return null;
            }
            return s(z10);
        } finally {
            this.f30025a = i;
            this.f30027c = null;
        }
    }

    public final byte r() {
        String p10 = p();
        int i = this.f30025a;
        while (true) {
            int t3 = t(i);
            if (t3 == -1) {
                this.f30025a = t3;
                return (byte) 10;
            }
            char charAt = p10.charAt(t3);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f30025a = t3;
                return C1124b.k(charAt);
            }
            i = t3 + 1;
        }
    }

    public final String s(boolean z10) {
        String i;
        byte r8 = r();
        if (z10) {
            if (r8 != 1 && r8 != 0) {
                return null;
            }
            i = j();
        } else {
            if (r8 != 1) {
                return null;
            }
            i = i();
        }
        this.f30027c = i;
        return i;
    }

    public final int t(int i) {
        if (i < this.f30029e.length()) {
            return i;
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsonReader(source='");
        sb2.append((Object) p());
        sb2.append("', currentPosition=");
        return androidx.camera.core.impl.utils.a.m(sb2, this.f30025a, ')');
    }

    public final int u() {
        char charAt;
        int i = this.f30025a;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.f30029e;
            if (i >= str.length() || !((charAt = str.charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i++;
        }
        this.f30025a = i;
        return i;
    }

    public final boolean v() {
        int u6 = u();
        String str = this.f30029e;
        if (u6 == str.length() || u6 == -1 || str.charAt(u6) != ',') {
            return false;
        }
        this.f30025a++;
        return true;
    }

    public final boolean w(boolean z10) {
        int t3 = t(u());
        int length = p().length() - t3;
        if (length < 4 || t3 == -1) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if ("null".charAt(i) != p().charAt(t3 + i)) {
                return false;
            }
        }
        if (length > 4 && C1124b.k(p().charAt(t3 + 4)) == 0) {
            return false;
        }
        if (!z10) {
            return true;
        }
        this.f30025a = t3 + 4;
        return true;
    }

    public final void x(char c2) {
        int i = this.f30025a;
        if (i > 0 && c2 == '\"') {
            try {
                this.f30025a = i - 1;
                String j10 = j();
                this.f30025a = i;
                if (kotlin.jvm.internal.f.b(j10, "null")) {
                    l("Expected string literal but 'null' literal was found", this.f30025a - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f30025a = i;
                throw th;
            }
        }
        n(C1124b.k(c2), true);
        throw null;
    }
}
