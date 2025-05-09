package ra;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import na.InterfaceC1078b;

/* compiled from: CollectionSerializers.kt */
/* loaded from: classes2.dex */
public final class K<K, V> extends Q<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {

    /* renamed from: c, reason: collision with root package name */
    public final C1163B f26358c;

    public K(InterfaceC1078b<K> interfaceC1078b, InterfaceC1078b<V> interfaceC1078b2) {
        super(interfaceC1078b, interfaceC1078b2);
        this.f26358c = new C1163B("kotlin.collections.LinkedHashMap", interfaceC1078b.getDescriptor(), interfaceC1078b2.getDescriptor());
    }

    @Override // ra.AbstractC1166a
    public final Object a() {
        return new LinkedHashMap();
    }

    @Override // ra.AbstractC1166a
    public final int b(Object obj) {
        return ((LinkedHashMap) obj).size() * 2;
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
        return new LinkedHashMap((Map) null);
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return this.f26358c;
    }

    @Override // ra.AbstractC1166a
    public final Object h(Object obj) {
        return (LinkedHashMap) obj;
    }
}
