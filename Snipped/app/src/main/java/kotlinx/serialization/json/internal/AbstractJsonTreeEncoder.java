package kotlinx.serialization.json.internal;

import O9.p;
import P9.s;
import ca.InterfaceC0646l;
import kotlinx.serialization.descriptors.b;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonNull;
import pa.C1124b;
import pa.g;
import qa.InterfaceC1143c;
import qa.InterfaceC1145e;
import ra.C1165D;
import ra.V;
import sa.AbstractC1244a;
import sa.f;
import sa.h;
import sa.j;
import sa.l;
import ta.o;
import ta.t;
import ta.w;

/* compiled from: TreeJsonEncoder.kt */
/* loaded from: classes2.dex */
public abstract class AbstractJsonTreeEncoder extends V implements j {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1244a f23378b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0646l<JsonElement, p> f23379c;

    /* renamed from: d, reason: collision with root package name */
    public final f f23380d;

    /* renamed from: e, reason: collision with root package name */
    public String f23381e;

    public AbstractJsonTreeEncoder(AbstractC1244a abstractC1244a, InterfaceC0646l interfaceC0646l) {
        this.f23378b = abstractC1244a;
        this.f23379c = interfaceC0646l;
        this.f23380d = abstractC1244a.f27065a;
    }

    @Override // qa.InterfaceC1143c
    public final boolean D() {
        return this.f23380d.f27089a;
    }

    @Override // ra.V
    public String G(pa.f fVar, int i) {
        b.d(fVar, this.f23378b);
        return fVar.g(i);
    }

    @Override // ra.V
    public final void H(Object obj, boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        C1165D c1165d = h.f27103a;
        W((String) obj, new l(valueOf, false, null));
    }

    @Override // ra.V
    public final void I(Object obj, byte b9) {
        W((String) obj, h.a(Byte.valueOf(b9)));
    }

    @Override // ra.V
    public final void J(Object obj, char c2) {
        W((String) obj, h.b(String.valueOf(c2)));
    }

    @Override // ra.V
    public final void K(Object obj, double d10) {
        String str = (String) obj;
        W(str, h.a(Double.valueOf(d10)));
        if (this.f23380d.f27098k) {
            return;
        }
        if (Double.isInfinite(d10) || Double.isNaN(d10)) {
            throw new JsonEncodingException(C1124b.H(Double.valueOf(d10), str, V().toString()));
        }
    }

    @Override // ra.V
    public final void L(Object obj, pa.f fVar, int i) {
        W((String) obj, h.b(fVar.g(i)));
    }

    @Override // ra.V
    public final void M(Object obj, float f10) {
        String str = (String) obj;
        W(str, h.a(Float.valueOf(f10)));
        if (this.f23380d.f27098k) {
            return;
        }
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            throw new JsonEncodingException(C1124b.H(Float.valueOf(f10), str, V().toString()));
        }
    }

    @Override // ra.V
    public final InterfaceC1145e N(Object obj, pa.f fVar) {
        String str = (String) obj;
        if (t.a(fVar)) {
            return new ta.b(this, str);
        }
        if (fVar.isInline() && kotlin.jvm.internal.f.b(fVar, h.f27103a)) {
            return new ta.b(this, str, fVar);
        }
        this.f26372a.add(str);
        return this;
    }

    @Override // ra.V
    public final void O(int i, Object obj) {
        W((String) obj, h.a(Integer.valueOf(i)));
    }

    @Override // ra.V
    public final void P(long j10, Object obj) {
        W((String) obj, h.a(Long.valueOf(j10)));
    }

    @Override // ra.V
    public final void Q(short s10, Object obj) {
        W((String) obj, h.a(Short.valueOf(s10)));
    }

    @Override // ra.V
    public final void R(Object obj, String str) {
        W((String) obj, h.b(str));
    }

    @Override // ra.V
    public final void S() {
        this.f23379c.invoke(V());
    }

    public abstract JsonElement V();

    public abstract void W(String str, JsonElement jsonElement);

    @Override // qa.InterfaceC1145e
    public final Y8.a a() {
        return this.f23378b.f27066b;
    }

    @Override // qa.InterfaceC1145e
    public final InterfaceC1143c c(pa.f fVar) {
        ta.l lVar;
        InterfaceC0646l<JsonElement, p> interfaceC0646l = s.R(this.f26372a) == null ? this.f23379c : new InterfaceC0646l<JsonElement, p>() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$beginStructure$consumer$1
            {
                super(1);
            }

            @Override // ca.InterfaceC0646l
            public final p invoke(JsonElement jsonElement) {
                AbstractJsonTreeEncoder abstractJsonTreeEncoder = AbstractJsonTreeEncoder.this;
                abstractJsonTreeEncoder.W((String) s.Q(abstractJsonTreeEncoder.f26372a), jsonElement);
                return p.f3034a;
            }
        };
        g e10 = fVar.e();
        boolean b9 = kotlin.jvm.internal.f.b(e10, b.C0424b.f23310a);
        AbstractC1244a abstractC1244a = this.f23378b;
        if (b9 || (e10 instanceof pa.d)) {
            lVar = new ta.l(abstractC1244a, interfaceC0646l, 2);
        } else if (kotlin.jvm.internal.f.b(e10, b.c.f23311a)) {
            pa.f a10 = w.a(fVar.i(0), abstractC1244a.f27066b);
            g e11 = a10.e();
            if ((e11 instanceof pa.e) || kotlin.jvm.internal.f.b(e11, g.b.f25740a)) {
                o oVar = new o(abstractC1244a, interfaceC0646l, 1);
                oVar.i = true;
                lVar = oVar;
            } else {
                if (!abstractC1244a.f27065a.f27092d) {
                    throw C1124b.e(a10);
                }
                lVar = new ta.l(abstractC1244a, interfaceC0646l, 2);
            }
        } else {
            lVar = new ta.l(abstractC1244a, interfaceC0646l, 1);
        }
        String str = this.f23381e;
        if (str != null) {
            lVar.W(str, h.b(fVar.a()));
            this.f23381e = null;
        }
        return lVar;
    }

    @Override // qa.InterfaceC1145e
    public final void f() {
        String str = (String) s.R(this.f26372a);
        if (str == null) {
            this.f23379c.invoke(JsonNull.INSTANCE);
        } else {
            W(str, JsonNull.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r0.f27102o != kotlinx.serialization.json.ClassDiscriminatorMode.f23365a) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0072, code lost:
    
        if (kotlin.jvm.internal.f.b(r0, kotlinx.serialization.descriptors.b.d.f23312a) == false) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ra.V, qa.InterfaceC1145e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> void s(na.InterfaceC1081e<? super T> r5, T r6) {
        /*
            r4 = this;
            java.util.ArrayList<java.lang.String> r0 = r4.f26372a
            java.lang.Object r0 = P9.s.R(r0)
            sa.a r1 = r4.f23378b
            if (r0 != 0) goto L31
            pa.f r0 = r5.getDescriptor()
            Y8.a r2 = r1.f27066b
            pa.f r0 = ta.w.a(r0, r2)
            pa.g r2 = r0.e()
            boolean r2 = r2 instanceof pa.e
            if (r2 != 0) goto L24
            pa.g r0 = r0.e()
            pa.g$b r2 = pa.g.b.f25740a
            if (r0 != r2) goto L31
        L24:
            ta.l r0 = new ta.l
            ca.l<kotlinx.serialization.json.JsonElement, O9.p> r2 = r4.f23379c
            r3 = 0
            r0.<init>(r1, r2, r3)
            r0.s(r5, r6)
            goto Lc3
        L31:
            sa.f r0 = r1.f27065a
            boolean r2 = r0.i
            if (r2 == 0) goto L3c
            r5.serialize(r4, r6)
            goto Lc3
        L3c:
            boolean r2 = r5 instanceof ra.AbstractC1167b
            if (r2 == 0) goto L47
            kotlinx.serialization.json.ClassDiscriminatorMode r0 = r0.f27102o
            kotlinx.serialization.json.ClassDiscriminatorMode r3 = kotlinx.serialization.json.ClassDiscriminatorMode.f23365a
            if (r0 == r3) goto L7d
            goto L74
        L47:
            kotlinx.serialization.json.ClassDiscriminatorMode r0 = r0.f27102o
            int r0 = r0.ordinal()
            if (r0 == 0) goto L7d
            r3 = 1
            if (r0 == r3) goto L5c
            r1 = 2
            if (r0 != r1) goto L56
            goto L7d
        L56:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L5c:
            pa.f r0 = r5.getDescriptor()
            pa.g r0 = r0.e()
            kotlinx.serialization.descriptors.b$a r3 = kotlinx.serialization.descriptors.b.a.f23309a
            boolean r3 = kotlin.jvm.internal.f.b(r0, r3)
            if (r3 != 0) goto L74
            kotlinx.serialization.descriptors.b$d r3 = kotlinx.serialization.descriptors.b.d.f23312a
            boolean r0 = kotlin.jvm.internal.f.b(r0, r3)
            if (r0 == 0) goto L7d
        L74:
            pa.f r0 = r5.getDescriptor()
            java.lang.String r0 = ta.p.c(r0, r1)
            goto L7e
        L7d:
            r0 = 0
        L7e:
            if (r2 == 0) goto Lbc
            r1 = r5
            ra.b r1 = (ra.AbstractC1167b) r1
            if (r6 == 0) goto L9b
            na.e r1 = j3.e.s(r1, r4, r6)
            if (r0 == 0) goto L8e
            ta.p.a(r5, r1, r0)
        L8e:
            pa.f r5 = r1.getDescriptor()
            pa.g r5 = r5.e()
            ta.p.b(r5)
            r5 = r1
            goto Lbc
        L9b:
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
        Lbc:
            if (r0 == 0) goto Lc0
            r4.f23381e = r0
        Lc0:
            r5.serialize(r4, r6)
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder.s(na.e, java.lang.Object):void");
    }

    @Override // sa.j
    public final void w(JsonElement jsonElement) {
        s(JsonElementSerializer.f23368a, jsonElement);
    }

    @Override // ra.V, qa.InterfaceC1145e
    public final InterfaceC1145e z(pa.f fVar) {
        return s.R(this.f26372a) != null ? super.z(fVar) : new ta.l(this.f23378b, this.f23379c, 0).z(fVar);
    }

    @Override // qa.InterfaceC1145e
    public final void r() {
    }
}
