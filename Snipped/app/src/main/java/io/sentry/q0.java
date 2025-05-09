package io.sentry;

import java.util.UUID;

/* compiled from: SpanId.java */
/* loaded from: classes2.dex */
public final class q0 implements F {

    /* renamed from: b, reason: collision with root package name */
    public static final q0 f22185b = new q0(new UUID(0, 0));

    /* renamed from: a, reason: collision with root package name */
    public final String f22186a;

    /* compiled from: SpanId.java */
    public static final class a implements A<q0> {
        @Override // io.sentry.A
        public final q0 a(D d10, InterfaceC0859q interfaceC0859q) {
            return new q0(d10.r0());
        }
    }

    public q0(String str) {
        D9.b.t0(str, "value is required");
        this.f22186a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q0.class != obj.getClass()) {
            return false;
        }
        return this.f22186a.equals(((q0) obj).f22186a);
    }

    public final int hashCode() {
        return this.f22186a.hashCode();
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.H(this.f22186a);
    }

    public final String toString() {
        return this.f22186a;
    }

    public q0() {
        this(UUID.randomUUID());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q0(java.util.UUID r3) {
        /*
            r2 = this;
            java.lang.String r3 = r3.toString()
            java.nio.charset.Charset r0 = J9.e.f2209a
            java.lang.String r0 = "0000-0000"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L10
            java.lang.String r3 = "00000000-0000-0000-0000-000000000000"
        L10:
            java.lang.String r0 = "-"
            java.lang.String r1 = ""
            java.lang.String r3 = r3.replace(r0, r1)
            r0 = 0
            r1 = 16
            java.lang.String r3 = r3.substring(r0, r1)
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.q0.<init>(java.util.UUID):void");
    }
}
