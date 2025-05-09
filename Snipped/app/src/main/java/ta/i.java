package ta;

import ka.C0966k;
import sa.AbstractC1244a;

/* compiled from: StreamingJsonDecoder.kt */
/* loaded from: classes2.dex */
public final class i extends Ha.c {

    /* renamed from: a, reason: collision with root package name */
    public final u f29988a;

    /* renamed from: b, reason: collision with root package name */
    public final Y8.a f29989b;

    public i(u uVar, AbstractC1244a abstractC1244a) {
        this.f29988a = uVar;
        this.f29989b = abstractC1244a.f27066b;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025 A[Catch: IllegalArgumentException -> 0x0029, TryCatch #0 {IllegalArgumentException -> 0x0029, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x001a, B:9:0x0022, B:12:0x0025, B:13:0x0028), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[Catch: IllegalArgumentException -> 0x0029, TryCatch #0 {IllegalArgumentException -> 0x0029, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x001a, B:9:0x0022, B:12:0x0025, B:13:0x0028), top: B:2:0x0007 }] */
    @Override // Ha.c, qa.InterfaceC1144d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final short A() {
        /*
            r5 = this;
            ta.u r0 = r5.f29988a
            java.lang.String r1 = r0.j()
            r2 = 0
            O9.i r3 = j3.e.H(r1)     // Catch: java.lang.IllegalArgumentException -> L29
            if (r3 == 0) goto L18
            int r3 = r3.f3021a     // Catch: java.lang.IllegalArgumentException -> L29
            r4 = 65535(0xffff, float:9.1834E-41)
            int r4 = java.lang.Integer.compareUnsigned(r3, r4)     // Catch: java.lang.IllegalArgumentException -> L29
            if (r4 <= 0) goto L1a
        L18:
            r4 = r2
            goto L20
        L1a:
            short r3 = (short) r3     // Catch: java.lang.IllegalArgumentException -> L29
            O9.n r4 = new O9.n     // Catch: java.lang.IllegalArgumentException -> L29
            r4.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L29
        L20:
            if (r4 == 0) goto L25
            short r0 = r4.f3030a     // Catch: java.lang.IllegalArgumentException -> L29
            return r0
        L25:
            ka.C0966k.P(r1)     // Catch: java.lang.IllegalArgumentException -> L29
            throw r2     // Catch: java.lang.IllegalArgumentException -> L29
        L29:
            java.lang.String r3 = "Failed to parse type 'UShort' for input '"
            r4 = 39
            java.lang.String r1 = C.v.o(r3, r1, r4)
            r3 = 6
            r4 = 0
            ta.u.m(r0, r1, r4, r2, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.i.A():short");
    }

    @Override // qa.InterfaceC1144d, qa.InterfaceC1142b
    public final Y8.a a() {
        return this.f29989b;
    }

    @Override // Ha.c, qa.InterfaceC1144d
    public final int n() {
        u uVar = this.f29988a;
        String j10 = uVar.j();
        try {
            O9.i H10 = j3.e.H(j10);
            if (H10 != null) {
                return H10.f3021a;
            }
            C0966k.P(j10);
            throw null;
        } catch (IllegalArgumentException unused) {
            u.m(uVar, C.v.o("Failed to parse type 'UInt' for input '", j10, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // qa.InterfaceC1142b
    public final int q(pa.f fVar) {
        throw new IllegalStateException("unsupported".toString());
    }

    @Override // Ha.c, qa.InterfaceC1144d
    public final long r() {
        u uVar = this.f29988a;
        String j10 = uVar.j();
        try {
            O9.k I10 = j3.e.I(j10);
            if (I10 != null) {
                return I10.f3025a;
            }
            C0966k.P(j10);
            throw null;
        } catch (IllegalArgumentException unused) {
            u.m(uVar, C.v.o("Failed to parse type 'ULong' for input '", j10, '\''), 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024 A[Catch: IllegalArgumentException -> 0x0028, TryCatch #0 {IllegalArgumentException -> 0x0028, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0019, B:9:0x0021, B:12:0x0024, B:13:0x0027), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[Catch: IllegalArgumentException -> 0x0028, TryCatch #0 {IllegalArgumentException -> 0x0028, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0019, B:9:0x0021, B:12:0x0024, B:13:0x0027), top: B:2:0x0007 }] */
    @Override // Ha.c, qa.InterfaceC1144d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte z() {
        /*
            r5 = this;
            ta.u r0 = r5.f29988a
            java.lang.String r1 = r0.j()
            r2 = 0
            O9.i r3 = j3.e.H(r1)     // Catch: java.lang.IllegalArgumentException -> L28
            if (r3 == 0) goto L17
            int r3 = r3.f3021a     // Catch: java.lang.IllegalArgumentException -> L28
            r4 = 255(0xff, float:3.57E-43)
            int r4 = java.lang.Integer.compareUnsigned(r3, r4)     // Catch: java.lang.IllegalArgumentException -> L28
            if (r4 <= 0) goto L19
        L17:
            r4 = r2
            goto L1f
        L19:
            byte r3 = (byte) r3     // Catch: java.lang.IllegalArgumentException -> L28
            O9.g r4 = new O9.g     // Catch: java.lang.IllegalArgumentException -> L28
            r4.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L28
        L1f:
            if (r4 == 0) goto L24
            byte r0 = r4.f3017a     // Catch: java.lang.IllegalArgumentException -> L28
            return r0
        L24:
            ka.C0966k.P(r1)     // Catch: java.lang.IllegalArgumentException -> L28
            throw r2     // Catch: java.lang.IllegalArgumentException -> L28
        L28:
            java.lang.String r3 = "Failed to parse type 'UByte' for input '"
            r4 = 39
            java.lang.String r1 = C.v.o(r3, r1, r4)
            r3 = 6
            r4 = 0
            ta.u.m(r0, r1, r4, r2, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.i.z():byte");
    }
}
