package ra;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import na.InterfaceC1078b;

/* compiled from: CollectionSerializers.kt */
/* renamed from: ra.C, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1164C<K, V> extends Q<K, V, Map<K, ? extends V>, HashMap<K, V>> {

    /* renamed from: c, reason: collision with root package name */
    public final C1163B f26347c;

    public C1164C(InterfaceC1078b<K> interfaceC1078b, InterfaceC1078b<V> interfaceC1078b2) {
        super(interfaceC1078b, interfaceC1078b2);
        this.f26347c = new C1163B("kotlin.collections.HashMap", interfaceC1078b.getDescriptor(), interfaceC1078b2.getDescriptor());
    }

    @Override // ra.AbstractC1166a
    public final Object a() {
        return new HashMap();
    }

    @Override // ra.AbstractC1166a
    public final int b(Object obj) {
        return ((HashMap) obj).size() * 2;
    }

    @Override // ra.AbstractC1166a
    public final Iterator c(Object obj) {
        return ((Map) obj).entrySet().iterator();
    }

    @Override // ra.AbstractC1166a
    public final int d(Object obj) {
        return ((Map) obj).size();
    }

    @Override // ra.AbstractC1166a
    public final Object g(Object obj) {
        return new HashMap((Map) null);
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return this.f26347c;
    }

    @Override // ra.AbstractC1166a
    public final Object h(Object obj) {
        return (HashMap) obj;
    }
}
