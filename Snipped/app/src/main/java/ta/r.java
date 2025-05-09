package ta;

import java.util.Arrays;
import ka.C0969n;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.JsonElementMarker;
import kotlinx.serialization.json.internal.WriteMode;
import na.InterfaceC1077a;
import pa.C1124b;
import qa.InterfaceC1142b;
import qa.InterfaceC1144d;
import ra.AbstractC1167b;
import sa.AbstractC1244a;
import ta.j;

/* compiled from: StreamingJsonDecoder.kt */
/* loaded from: classes2.dex */
public final class r extends Ha.c implements sa.g {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1244a f30007a;

    /* renamed from: b, reason: collision with root package name */
    public final WriteMode f30008b;

    /* renamed from: c, reason: collision with root package name */
    public final u f30009c;

    /* renamed from: d, reason: collision with root package name */
    public final Y8.a f30010d;

    /* renamed from: e, reason: collision with root package name */
    public int f30011e = -1;

    /* renamed from: f, reason: collision with root package name */
    public a f30012f;

    /* renamed from: g, reason: collision with root package name */
    public final sa.f f30013g;

    /* renamed from: h, reason: collision with root package name */
    public final JsonElementMarker f30014h;

    /* compiled from: StreamingJsonDecoder.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f30015a;
    }

    public r(AbstractC1244a abstractC1244a, WriteMode writeMode, u uVar, pa.f fVar, a aVar) {
        this.f30007a = abstractC1244a;
        this.f30008b = writeMode;
        this.f30009c = uVar;
        this.f30010d = abstractC1244a.f27066b;
        this.f30012f = aVar;
        sa.f fVar2 = abstractC1244a.f27065a;
        this.f30013g = fVar2;
        this.f30014h = fVar2.f27094f ? null : new JsonElementMarker(fVar);
    }

    @Override // Ha.c, qa.InterfaceC1144d
    public final short A() {
        u uVar = this.f30009c;
        long h9 = uVar.h();
        short s10 = (short) h9;
        if (h9 == s10) {
            return s10;
        }
        u.m(uVar, "Failed to parse short for input '" + h9 + '\'', 0, null, 6);
        throw null;
    }

    @Override // Ha.c, qa.InterfaceC1144d
    public final float B() {
        u uVar = this.f30009c;
        String j10 = uVar.j();
        try {
            float parseFloat = Float.parseFloat(j10);
            if (this.f30007a.f27065a.f27098k || !(Float.isInfinite(parseFloat) || Float.isNaN(parseFloat))) {
                return parseFloat;
            }
            u.m(uVar, "Unexpected special floating-point value " + Float.valueOf(parseFloat) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            u.m(uVar, C.v.o("Failed to parse type 'float' for input '", j10, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // Ha.c, qa.InterfaceC1142b
    public final <T> T C(pa.f fVar, int i, InterfaceC1077a<? extends T> interfaceC1077a, T t3) {
        boolean z10 = this.f30008b == WriteMode.f23400e && (i & 1) == 0;
        u uVar = this.f30009c;
        if (z10) {
            j jVar = uVar.f30026b;
            int[] iArr = jVar.f29991b;
            int i9 = jVar.f29992c;
            if (iArr[i9] == -2) {
                jVar.f29990a[i9] = j.a.f29993a;
            }
        }
        T t10 = (T) x(interfaceC1077a);
        if (z10) {
            j jVar2 = uVar.f30026b;
            int[] iArr2 = jVar2.f29991b;
            int i10 = jVar2.f29992c;
            if (iArr2[i10] != -2) {
                int i11 = i10 + 1;
                jVar2.f29992c = i11;
                Object[] objArr = jVar2.f29990a;
                if (i11 == objArr.length) {
                    int i12 = i11 * 2;
                    jVar2.f29990a = Arrays.copyOf(objArr, i12);
                    jVar2.f29991b = Arrays.copyOf(jVar2.f29991b, i12);
                }
            }
            Object[] objArr2 = jVar2.f29990a;
            int i13 = jVar2.f29992c;
            objArr2[i13] = t10;
            jVar2.f29991b[i13] = -2;
        }
        return t10;
    }

    @Override // Ha.c, qa.InterfaceC1144d
    public final double E() {
        u uVar = this.f30009c;
        String j10 = uVar.j();
        try {
            double parseDouble = Double.parseDouble(j10);
            if (this.f30007a.f27065a.f27098k || !(Double.isInfinite(parseDouble) || Double.isNaN(parseDouble))) {
                return parseDouble;
            }
            u.m(uVar, "Unexpected special floating-point value " + Double.valueOf(parseDouble) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            u.m(uVar, C.v.o("Failed to parse type 'double' for input '", j10, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // qa.InterfaceC1144d, qa.InterfaceC1142b
    public final Y8.a a() {
        return this.f30010d;
    }

    @Override // Ha.c, qa.InterfaceC1142b
    public final void b(pa.f fVar) {
        AbstractC1244a abstractC1244a = this.f30007a;
        if (abstractC1244a.f27065a.f27090b && fVar.f() == 0) {
            while (q(fVar) != -1) {
            }
        }
        u uVar = this.f30009c;
        if (uVar.v() && !abstractC1244a.f27065a.f27101n) {
            C1124b.C(uVar, "");
            throw null;
        }
        uVar.g(this.f30008b.f23405b);
        j jVar = uVar.f30026b;
        int i = jVar.f29992c;
        int[] iArr = jVar.f29991b;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            jVar.f29992c = i - 1;
        }
        int i9 = jVar.f29992c;
        if (i9 != -1) {
            jVar.f29992c = i9 - 1;
        }
    }

    @Override // Ha.c, qa.InterfaceC1144d
    public final InterfaceC1142b c(pa.f fVar) {
        AbstractC1244a abstractC1244a = this.f30007a;
        WriteMode b9 = w.b(fVar, abstractC1244a);
        u uVar = this.f30009c;
        j jVar = uVar.f30026b;
        int i = jVar.f29992c + 1;
        jVar.f29992c = i;
        Object[] objArr = jVar.f29990a;
        if (i == objArr.length) {
            int i9 = i * 2;
            jVar.f29990a = Arrays.copyOf(objArr, i9);
            jVar.f29991b = Arrays.copyOf(jVar.f29991b, i9);
        }
        jVar.f29990a[i] = fVar;
        uVar.g(b9.f23404a);
        if (uVar.r() == 4) {
            u.m(uVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int ordinal = b9.ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
            return new r(this.f30007a, b9, this.f30009c, fVar, this.f30012f);
        }
        if (this.f30008b == b9 && abstractC1244a.f27065a.f27094f) {
            return this;
        }
        return new r(this.f30007a, b9, this.f30009c, fVar, this.f30012f);
    }

    @Override // Ha.c, qa.InterfaceC1144d
    public final boolean e() {
        boolean z10;
        boolean z11;
        u uVar = this.f30009c;
        int u6 = uVar.u();
        if (u6 == uVar.p().length()) {
            u.m(uVar, "EOF", 0, null, 6);
            throw null;
        }
        if (uVar.p().charAt(u6) == '\"') {
            u6++;
            z10 = true;
        } else {
            z10 = false;
        }
        int t3 = uVar.t(u6);
        if (t3 >= uVar.p().length() || t3 == -1) {
            u.m(uVar, "EOF", 0, null, 6);
            throw null;
        }
        int i = t3 + 1;
        int charAt = uVar.p().charAt(t3) | ' ';
        if (charAt == 102) {
            uVar.c(i, "alse");
            z11 = false;
        } else {
            if (charAt != 116) {
                u.m(uVar, "Expected valid boolean literal prefix, but had '" + uVar.j() + '\'', 0, null, 6);
                throw null;
            }
            uVar.c(i, "rue");
            z11 = true;
        }
        if (z10) {
            if (uVar.f30025a == uVar.p().length()) {
                u.m(uVar, "EOF", 0, null, 6);
                throw null;
            }
            if (uVar.p().charAt(uVar.f30025a) != '\"') {
                u.m(uVar, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            uVar.f30025a++;
        }
        return z11;
    }

    @Override // Ha.c, qa.InterfaceC1144d
    public final char f() {
        u uVar = this.f30009c;
        String j10 = uVar.j();
        if (j10.length() == 1) {
            return j10.charAt(0);
        }
        u.m(uVar, C.v.o("Expected single char, but got '", j10, '\''), 0, null, 6);
        throw null;
    }

    @Override // Ha.c, qa.InterfaceC1144d
    public final int i(pa.f fVar) {
        return kotlinx.serialization.json.internal.b.c(fVar, this.f30007a, p(), " at path ".concat(this.f30009c.f30026b.a()));
    }

    @Override // sa.g
    public final JsonElement l() {
        return new kotlinx.serialization.json.internal.d(this.f30007a.f27065a, this.f30009c).b();
    }

    @Override // Ha.c, qa.InterfaceC1144d
    public final int n() {
        u uVar = this.f30009c;
        long h9 = uVar.h();
        int i = (int) h9;
        if (h9 == i) {
            return i;
        }
        u.m(uVar, "Failed to parse int for input '" + h9 + '\'', 0, null, 6);
        throw null;
    }

    @Override // Ha.c, qa.InterfaceC1144d
    public final InterfaceC1144d o(pa.f fVar) {
        return t.a(fVar) ? new i(this.f30009c, this.f30007a) : this;
    }

    @Override // Ha.c, qa.InterfaceC1144d
    public final String p() {
        boolean z10 = this.f30013g.f27091c;
        u uVar = this.f30009c;
        return z10 ? uVar.k() : uVar.i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x010d, code lost:
    
        r1 = r11.f23383a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x010f, code lost:
    
        if (r9 >= 64) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0111, code lost:
    
        r1.f26447c |= 1 << r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x011b, code lost:
    
        r3 = (r9 >>> 6) - 1;
        r1 = r1.f26448d;
        r1[r3] = (1 << (r9 & 63)) | r1[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x028d, code lost:
    
        r11 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0146, code lost:
    
        r4.l(C.v.o("Encountered an unknown key '", r12, '\''), ka.C0969n.k0(r4.p().subSequence(0, r4.f30025a).toString(), r12, 0, 6), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0167, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // qa.InterfaceC1142b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int q(pa.f r19) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.r.q(pa.f):int");
    }

    @Override // Ha.c, qa.InterfaceC1144d
    public final long r() {
        return this.f30009c.h();
    }

    @Override // Ha.c, qa.InterfaceC1144d
    public final boolean t() {
        JsonElementMarker jsonElementMarker = this.f30014h;
        return (jsonElementMarker == null || !jsonElementMarker.f23384b) && !this.f30009c.w(true);
    }

    @Override // sa.g
    public final AbstractC1244a v() {
        return this.f30007a;
    }

    @Override // Ha.c, qa.InterfaceC1144d
    public final <T> T x(InterfaceC1077a<? extends T> interfaceC1077a) {
        u uVar = this.f30009c;
        AbstractC1244a abstractC1244a = this.f30007a;
        try {
            if ((interfaceC1077a instanceof AbstractC1167b) && !abstractC1244a.f27065a.i) {
                String c2 = p.c(interfaceC1077a.getDescriptor(), abstractC1244a);
                String q10 = uVar.q(c2, this.f30013g.f27091c);
                if (q10 == null) {
                    return (T) p.d(this, interfaceC1077a);
                }
                try {
                    InterfaceC1077a r8 = j3.e.r((AbstractC1167b) interfaceC1077a, this, q10);
                    a aVar = new a();
                    aVar.f30015a = c2;
                    this.f30012f = aVar;
                    return (T) r8.deserialize(this);
                } catch (SerializationException e10) {
                    String message = e10.getMessage();
                    int f02 = C0969n.f0(message, '\n', 0, false, 6);
                    if (f02 != -1) {
                        message = message.substring(0, f02);
                    }
                    if (C0969n.a0(message, ".")) {
                        message = message.substring(0, message.length() - ".".length());
                    }
                    String message2 = e10.getMessage();
                    String str = "";
                    int f03 = C0969n.f0(message2, '\n', 0, false, 6);
                    if (f03 != -1) {
                        str = message2.substring(f03 + 1, message2.length());
                    }
                    u.m(uVar, message, 0, str, 2);
                    throw null;
                }
            }
            return interfaceC1077a.deserialize(this);
        } catch (MissingFieldException e11) {
            if (C0969n.Y(e11.getMessage(), "at path", false)) {
                throw e11;
            }
            throw new MissingFieldException(e11.f23266a, e11.getMessage() + " at path: " + uVar.f30026b.a(), e11);
        }
    }

    @Override // Ha.c, qa.InterfaceC1144d
    public final byte z() {
        u uVar = this.f30009c;
        long h9 = uVar.h();
        byte b9 = (byte) h9;
        if (h9 == b9) {
            return b9;
        }
        u.m(uVar, "Failed to parse byte for input '" + h9 + '\'', 0, null, 6);
        throw null;
    }
}
