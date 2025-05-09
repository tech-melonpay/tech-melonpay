package ra;

import java.util.Iterator;
import na.InterfaceC1078b;
import qa.InterfaceC1142b;
import qa.InterfaceC1144d;

/* compiled from: CollectionSerializers.kt */
/* renamed from: ra.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1166a<Element, Collection, Builder> implements InterfaceC1078b<Collection> {
    public abstract Builder a();

    public abstract int b(Builder builder);

    public abstract Iterator<Element> c(Collection collection);

    public abstract int d(Collection collection);

    @Override // na.InterfaceC1077a
    public Collection deserialize(InterfaceC1144d interfaceC1144d) {
        return (Collection) e(interfaceC1144d);
    }

    public final Object e(InterfaceC1144d interfaceC1144d) {
        Builder a10 = a();
        int b9 = b(a10);
        InterfaceC1142b c2 = interfaceC1144d.c(getDescriptor());
        while (true) {
            int q10 = c2.q(getDescriptor());
            if (q10 == -1) {
                c2.b(getDescriptor());
                return h(a10);
            }
            f(c2, q10 + b9, a10, true);
        }
    }

    public abstract void f(InterfaceC1142b interfaceC1142b, int i, Builder builder, boolean z10);

    public abstract Builder g(Collection collection);

    public abstract Collection h(Builder builder);
}
