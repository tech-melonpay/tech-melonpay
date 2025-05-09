package ra;

import java.util.Iterator;
import na.InterfaceC1078b;
import qa.InterfaceC1142b;
import qa.InterfaceC1143c;
import qa.InterfaceC1145e;

/* compiled from: CollectionSerializers.kt */
/* loaded from: classes2.dex */
public abstract class r<Element, Collection, Builder> extends AbstractC1166a<Element, Collection, Builder> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1078b<Element> f26428a;

    public r(InterfaceC1078b interfaceC1078b) {
        this.f26428a = interfaceC1078b;
    }

    @Override // ra.AbstractC1166a
    public void f(InterfaceC1142b interfaceC1142b, int i, Builder builder, boolean z10) {
        i(i, builder, interfaceC1142b.C(getDescriptor(), i, this.f26428a, null));
    }

    public abstract void i(int i, Object obj, Object obj2);

    @Override // na.InterfaceC1081e
    public void serialize(InterfaceC1145e interfaceC1145e, Collection collection) {
        int d10 = d(collection);
        pa.f descriptor = getDescriptor();
        InterfaceC1143c u6 = interfaceC1145e.u(descriptor);
        Iterator<Element> c2 = c(collection);
        for (int i = 0; i < d10; i++) {
            u6.C(getDescriptor(), i, this.f26428a, c2.next());
        }
        u6.b(descriptor);
    }
}
