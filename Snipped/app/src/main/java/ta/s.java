package ta;

import g9.C0771a;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.internal.WriteMode;
import na.InterfaceC1078b;
import pa.C1124b;
import qa.AbstractC1141a;
import qa.InterfaceC1143c;
import qa.InterfaceC1145e;
import sa.AbstractC1244a;

/* compiled from: StreamingJsonEncoder.kt */
/* loaded from: classes2.dex */
public final class s extends AbstractC1141a implements sa.j {

    /* renamed from: a, reason: collision with root package name */
    public final C0771a f30016a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1244a f30017b;

    /* renamed from: c, reason: collision with root package name */
    public final WriteMode f30018c;

    /* renamed from: d, reason: collision with root package name */
    public final sa.j[] f30019d;

    /* renamed from: e, reason: collision with root package name */
    public final Y8.a f30020e;

    /* renamed from: f, reason: collision with root package name */
    public final sa.f f30021f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f30022g;

    /* renamed from: h, reason: collision with root package name */
    public String f30023h;

    public s(C0771a c0771a, AbstractC1244a abstractC1244a, WriteMode writeMode, sa.j[] jVarArr) {
        this.f30016a = c0771a;
        this.f30017b = abstractC1244a;
        this.f30018c = writeMode;
        this.f30019d = jVarArr;
        this.f30020e = abstractC1244a.f27066b;
        this.f30021f = abstractC1244a.f27065a;
        int ordinal = writeMode.ordinal();
        if (jVarArr != null) {
            sa.j jVar = jVarArr[ordinal];
            if (jVar == null && jVar == this) {
                return;
            }
            jVarArr[ordinal] = this;
        }
    }

    @Override // qa.AbstractC1141a, qa.InterfaceC1145e
    public final void B(long j10) {
        if (this.f30022g) {
            F(String.valueOf(j10));
        } else {
            this.f30016a.h(j10);
        }
    }

    @Override // qa.AbstractC1141a, qa.InterfaceC1143c
    public final boolean D() {
        return this.f30021f.f27089a;
    }

    @Override // qa.AbstractC1141a, qa.InterfaceC1145e
    public final void F(String str) {
        this.f30016a.k(str);
    }

    @Override // qa.AbstractC1141a
    public final void G(pa.f fVar, int i) {
        int ordinal = this.f30018c.ordinal();
        boolean z10 = true;
        C0771a c0771a = this.f30016a;
        if (ordinal == 1) {
            if (!c0771a.f20837a) {
                c0771a.f(',');
            }
            c0771a.c();
            return;
        }
        if (ordinal == 2) {
            if (c0771a.f20837a) {
                this.f30022g = true;
                c0771a.c();
                return;
            }
            if (i % 2 == 0) {
                c0771a.f(',');
                c0771a.c();
            } else {
                c0771a.f(':');
                c0771a.n();
                z10 = false;
            }
            this.f30022g = z10;
            return;
        }
        if (ordinal != 3) {
            if (!c0771a.f20837a) {
                c0771a.f(',');
            }
            c0771a.c();
            kotlinx.serialization.json.internal.b.d(fVar, this.f30017b);
            F(fVar.g(i));
            c0771a.f(':');
            c0771a.n();
            return;
        }
        if (i == 0) {
            this.f30022g = true;
        }
        if (i == 1) {
            c0771a.f(',');
            c0771a.n();
            this.f30022g = false;
        }
    }

    @Override // qa.InterfaceC1145e
    public final Y8.a a() {
        return this.f30020e;
    }

    @Override // qa.AbstractC1141a, qa.InterfaceC1143c
    public final void b(pa.f fVar) {
        WriteMode writeMode = this.f30018c;
        if (writeMode.f23405b != 0) {
            C0771a c0771a = this.f30016a;
            c0771a.o();
            c0771a.d();
            c0771a.f(writeMode.f23405b);
        }
    }

    @Override // qa.AbstractC1141a, qa.InterfaceC1145e
    public final InterfaceC1143c c(pa.f fVar) {
        sa.j jVar;
        AbstractC1244a abstractC1244a = this.f30017b;
        WriteMode b9 = w.b(fVar, abstractC1244a);
        C0771a c0771a = this.f30016a;
        char c2 = b9.f23404a;
        if (c2 != 0) {
            c0771a.f(c2);
            c0771a.b();
        }
        if (this.f30023h != null) {
            c0771a.c();
            F(this.f30023h);
            c0771a.f(':');
            c0771a.n();
            F(fVar.a());
            this.f30023h = null;
        }
        if (this.f30018c == b9) {
            return this;
        }
        sa.j[] jVarArr = this.f30019d;
        return (jVarArr == null || (jVar = jVarArr[b9.ordinal()]) == null) ? new s(c0771a, abstractC1244a, b9, jVarArr) : jVar;
    }

    @Override // qa.AbstractC1141a, qa.InterfaceC1143c
    public final void e(pa.f fVar, int i, InterfaceC1078b interfaceC1078b, Object obj) {
        if (obj != null || this.f30021f.f27094f) {
            super.e(fVar, i, interfaceC1078b, obj);
        }
    }

    @Override // qa.AbstractC1141a, qa.InterfaceC1145e
    public final void f() {
        this.f30016a.i("null");
    }

    @Override // qa.AbstractC1141a, qa.InterfaceC1145e
    public final void g(double d10) {
        boolean z10 = this.f30022g;
        C0771a c0771a = this.f30016a;
        if (z10) {
            F(String.valueOf(d10));
        } else {
            ((Na.a) c0771a.f20838b).h(String.valueOf(d10));
        }
        if (this.f30021f.f27098k) {
            return;
        }
        if (Double.isInfinite(d10) || Double.isNaN(d10)) {
            throw C1124b.d(Double.valueOf(d10), ((Na.a) c0771a.f20838b).toString());
        }
    }

    @Override // qa.AbstractC1141a, qa.InterfaceC1145e
    public final void h(short s10) {
        if (this.f30022g) {
            F(String.valueOf((int) s10));
        } else {
            this.f30016a.j(s10);
        }
    }

    @Override // qa.AbstractC1141a, qa.InterfaceC1145e
    public final void i(byte b9) {
        if (this.f30022g) {
            F(String.valueOf((int) b9));
        } else {
            this.f30016a.e(b9);
        }
    }

    @Override // qa.AbstractC1141a, qa.InterfaceC1145e
    public final void k(boolean z10) {
        if (this.f30022g) {
            F(String.valueOf(z10));
        } else {
            ((Na.a) this.f30016a.f20838b).h(String.valueOf(z10));
        }
    }

    @Override // qa.AbstractC1141a, qa.InterfaceC1145e
    public final void l(pa.f fVar, int i) {
        F(fVar.g(i));
    }

    @Override // qa.AbstractC1141a, qa.InterfaceC1145e
    public final void p(float f10) {
        boolean z10 = this.f30022g;
        C0771a c0771a = this.f30016a;
        if (z10) {
            F(String.valueOf(f10));
        } else {
            ((Na.a) c0771a.f20838b).h(String.valueOf(f10));
        }
        if (this.f30021f.f27098k) {
            return;
        }
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            throw C1124b.d(Float.valueOf(f10), ((Na.a) c0771a.f20838b).toString());
        }
    }

    @Override // qa.AbstractC1141a, qa.InterfaceC1145e
    public final void q(char c2) {
        F(String.valueOf(c2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0043, code lost:
    
        if (kotlin.jvm.internal.f.b(r1, kotlinx.serialization.descriptors.b.d.f23312a) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r1.f27102o != kotlinx.serialization.json.ClassDiscriminatorMode.f23365a) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // qa.AbstractC1141a, qa.InterfaceC1145e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> void s(na.InterfaceC1081e<? super T> r5, T r6) {
        /*
            r4 = this;
            sa.a r0 = r4.f30017b
            sa.f r1 = r0.f27065a
            boolean r2 = r1.i
            if (r2 == 0) goto Ld
            r5.serialize(r4, r6)
            goto L94
        Ld:
            boolean r2 = r5 instanceof ra.AbstractC1167b
            if (r2 == 0) goto L18
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.f27102o
            kotlinx.serialization.json.ClassDiscriminatorMode r3 = kotlinx.serialization.json.ClassDiscriminatorMode.f23365a
            if (r1 == r3) goto L4e
            goto L45
        L18:
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.f27102o
            int r1 = r1.ordinal()
            if (r1 == 0) goto L4e
            r3 = 1
            if (r1 == r3) goto L2d
            r0 = 2
            if (r1 != r0) goto L27
            goto L4e
        L27:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L2d:
            pa.f r1 = r5.getDescriptor()
            pa.g r1 = r1.e()
            kotlinx.serialization.descriptors.b$a r3 = kotlinx.serialization.descriptors.b.a.f23309a
            boolean r3 = kotlin.jvm.internal.f.b(r1, r3)
            if (r3 != 0) goto L45
            kotlinx.serialization.descriptors.b$d r3 = kotlinx.serialization.descriptors.b.d.f23312a
            boolean r1 = kotlin.jvm.internal.f.b(r1, r3)
            if (r1 == 0) goto L4e
        L45:
            pa.f r1 = r5.getDescriptor()
            java.lang.String r0 = ta.p.c(r1, r0)
            goto L4f
        L4e:
            r0 = 0
        L4f:
            if (r2 == 0) goto L8d
            r1 = r5
            ra.b r1 = (ra.AbstractC1167b) r1
            if (r6 == 0) goto L6c
            na.e r1 = j3.e.s(r1, r4, r6)
            if (r0 == 0) goto L5f
            ta.p.a(r5, r1, r0)
        L5f:
            pa.f r5 = r1.getDescriptor()
            pa.g r5 = r5.e()
            ta.p.b(r5)
            r5 = r1
            goto L8d
        L6c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Value for serializer "
            r6.<init>(r0)
            pa.f r5 = r5.getDescriptor()
            r6.append(r5)
            java.lang.String r5 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L8d:
            if (r0 == 0) goto L91
            r4.f30023h = r0
        L91:
            r5.serialize(r4, r6)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.s.s(na.e, java.lang.Object):void");
    }

    @Override // sa.j
    public final void w(JsonElement jsonElement) {
        s(JsonElementSerializer.f23368a, jsonElement);
    }

    @Override // qa.AbstractC1141a, qa.InterfaceC1145e
    public final void y(int i) {
        if (this.f30022g) {
            F(String.valueOf(i));
        } else {
            this.f30016a.g(i);
        }
    }

    @Override // qa.AbstractC1141a, qa.InterfaceC1145e
    public final InterfaceC1145e z(pa.f fVar) {
        boolean a10 = t.a(fVar);
        WriteMode writeMode = this.f30018c;
        AbstractC1244a abstractC1244a = this.f30017b;
        C0771a c0771a = this.f30016a;
        if (a10) {
            if (!(c0771a instanceof g)) {
                c0771a = new g((Na.a) c0771a.f20838b, this.f30022g);
            }
            return new s(c0771a, abstractC1244a, writeMode, null);
        }
        if (!fVar.isInline() || !kotlin.jvm.internal.f.b(fVar, sa.h.f27103a)) {
            return this;
        }
        if (!(c0771a instanceof f)) {
            c0771a = new f((Na.a) c0771a.f20838b, this.f30022g);
        }
        return new s(c0771a, abstractC1244a, writeMode, null);
    }
}
