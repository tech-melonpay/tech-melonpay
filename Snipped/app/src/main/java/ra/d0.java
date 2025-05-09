package ra;

import java.util.Iterator;
import na.InterfaceC1078b;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.b0;

/* compiled from: CollectionSerializers.kt */
/* loaded from: classes2.dex */
public abstract class d0<Element, Array, Builder extends b0<Array>> extends r<Element, Array, Builder> {

    /* renamed from: b, reason: collision with root package name */
    public final c0 f26388b;

    public d0(InterfaceC1078b<Element> interfaceC1078b) {
        super(interfaceC1078b);
        this.f26388b = new c0(interfaceC1078b.getDescriptor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ra.AbstractC1166a
    public final Object a() {
        return (b0) g(j());
    }

    @Override // ra.AbstractC1166a
    public final int b(Object obj) {
        return ((b0) obj).d();
    }

    @Override // ra.AbstractC1166a
    public final Iterator<Element> c(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    @Override // ra.AbstractC1166a, na.InterfaceC1077a
    public final Array deserialize(InterfaceC1144d interfaceC1144d) {
        return (Array) e(interfaceC1144d);
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return this.f26388b;
    }

    @Override // ra.AbstractC1166a
    public final Object h(Object obj) {
        return ((b0) obj).a();
    }

    @Override // ra.r
    public final void i(int i, Object obj, Object obj2) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    public abstract Array j();

    public abstract void k(InterfaceC1143c interfaceC1143c, Array array, int i);

    @Override // ra.r, na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, Array array) {
        int d10 = d(array);
        c0 c0Var = this.f26388b;
        InterfaceC1143c u6 = interfaceC1145e.u(c0Var);
        k(u6, array, d10);
        u6.b(c0Var);
    }
}
