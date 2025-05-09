package org.koin.core.scope;

import C.v;
import Fa.h;
import java.util.ArrayList;
import kotlin.jvm.internal.f;

/* compiled from: Scope.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public final h f25575d;

    /* renamed from: f, reason: collision with root package name */
    public final P9.h<gb.a> f25577f;

    /* renamed from: a, reason: collision with root package name */
    public final hb.a f25572a = ib.a.f21519c;

    /* renamed from: b, reason: collision with root package name */
    public final String f25573b = "_root_";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25574c = true;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList<a> f25576e = new ArrayList<>();

    public a(h hVar) {
        this.f25575d = hVar;
        new ArrayList();
        this.f25577f = new P9.h<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r2 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(final ca.InterfaceC0635a r7, final hb.a r8, final ia.InterfaceC0835c r9) {
        /*
            r6 = this;
            Fa.h r0 = r6.f25575d
            java.lang.Object r1 = r0.f1301d
            C.N r1 = (C.N) r1
            org.koin.core.logger.Level r2 = org.koin.core.logger.Level.f25554a
            boolean r1 = r1.j(r2)
            if (r1 == 0) goto L98
            r1 = 39
            if (r8 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " with qualifier '"
            r2.<init>(r3)
            r2.append(r8)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L27
        L25:
            java.lang.String r2 = ""
        L27:
            java.lang.Object r3 = r0.f1301d
            C.N r3 = (C.N) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "+- '"
            r4.<init>(r5)
            java.lang.String r5 = kb.a.a(r9)
            r4.append(r5)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r3.f(r1)
            org.koin.core.scope.Scope$get$1 r1 = new org.koin.core.scope.Scope$get$1
            r1.<init>()
            long r7 = java.lang.System.nanoTime()
            java.lang.Object r1 = r1.invoke()
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r7
            double r7 = (double) r2
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r7 = r7 / r2
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            double r7 = r7.doubleValue()
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            double r7 = r7.doubleValue()
            java.lang.Object r0 = r0.f1301d
            C.N r0 = (C.N) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "|- '"
            r2.<init>(r3)
            java.lang.String r9 = kb.a.a(r9)
            r2.append(r9)
            java.lang.String r9 = "' in "
            r2.append(r9)
            r2.append(r7)
            java.lang.String r7 = " ms"
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r0.f(r7)
            return r1
        L98:
            java.lang.Object r7 = r6.b(r7, r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.core.scope.a.a(ca.a, hb.a, ia.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e8, code lost:
    
        if (r13 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(ca.InterfaceC0635a r12, final hb.a r13, final ia.InterfaceC0835c r14) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.core.scope.a.b(ca.a, hb.a, ia.c):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.f25572a, aVar.f25572a) && f.b(this.f25573b, aVar.f25573b) && this.f25574c == aVar.f25574c && f.b(this.f25575d, aVar.f25575d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int c2 = v.c(this.f25572a.hashCode() * 31, 31, this.f25573b);
        boolean z10 = this.f25574c;
        int i = z10;
        if (z10 != 0) {
            i = 1;
        }
        return this.f25575d.hashCode() + ((c2 + i) * 31);
    }

    public final String toString() {
        return androidx.camera.core.impl.utils.a.n(new StringBuilder("['"), this.f25573b, "']");
    }
}
