package ra;

import java.util.Iterator;
import java.util.Map;
import na.InterfaceC1078b;
import qa.InterfaceC1142b;
import qa.InterfaceC1143c;
import qa.InterfaceC1145e;

/* compiled from: CollectionSerializers.kt */
/* loaded from: classes2.dex */
public abstract class Q<Key, Value, Collection, Builder extends Map<Key, Value>> extends AbstractC1166a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1078b<Key> f26370a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1078b<Value> f26371b;

    public Q(InterfaceC1078b interfaceC1078b, InterfaceC1078b interfaceC1078b2) {
        this.f26370a = interfaceC1078b;
        this.f26371b = interfaceC1078b2;
    }

    @Override // ra.AbstractC1166a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void f(InterfaceC1142b interfaceC1142b, int i, Builder builder, boolean z10) {
        int i9;
        Object C10 = interfaceC1142b.C(getDescriptor(), i, this.f26370a, null);
        if (z10) {
            i9 = interfaceC1142b.q(getDescriptor());
            if (i9 != i + 1) {
                throw new IllegalArgumentException(C.v.k(i, i9, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
            }
        } else {
            i9 = i + 1;
        }
        boolean containsKey = builder.containsKey(C10);
        InterfaceC1078b<Value> interfaceC1078b = this.f26371b;
        builder.put(C10, (!containsKey || (interfaceC1078b.getDescriptor().e() instanceof pa.e)) ? interfaceC1142b.C(getDescriptor(), i9, interfaceC1078b, null) : interfaceC1142b.C(getDescriptor(), i9, interfaceC1078b, kotlin.collections.a.q(builder, C10)));
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, Collection collection) {
        d(collection);
        pa.f descriptor = getDescriptor();
        InterfaceC1143c u6 = interfaceC1145e.u(descriptor);
        Iterator<Map.Entry<? extends Key, ? extends Value>> c2 = c(collection);
        int i = 0;
        while (c2.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = c2.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i9 = i + 1;
            u6.C(getDescriptor(), i, this.f26370a, key);
            i += 2;
            u6.C(getDescriptor(), i9, this.f26371b, value);
        }
        u6.b(descriptor);
    }
}
