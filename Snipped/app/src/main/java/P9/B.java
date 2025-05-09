package P9;

import ca.InterfaceC0646l;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: MapWithDefault.kt */
/* loaded from: classes2.dex */
public final class B<K, V> implements A<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<K, V> f3141a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0646l<K, V> f3142b;

    public B(Map map, Z3.a aVar) {
        this.f3141a = map;
        this.f3142b = aVar;
    }

    @Override // P9.y
    public final V b(K k3) {
        Map<K, V> map = this.f3141a;
        V v10 = map.get(k3);
        return (v10 != null || map.containsKey(k3)) ? v10 : this.f3142b.invoke(k3);
    }

    @Override // java.util.Map
    public final void clear() {
        this.f3141a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f3141a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f3141a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return this.f3141a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.f3141a.equals(obj);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return this.f3141a.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f3141a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f3141a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.f3141a.keySet();
    }

    @Override // P9.A
    public final Map<K, V> l() {
        return this.f3141a;
    }

    @Override // java.util.Map
    public final V put(K k3, V v10) {
        return this.f3141a.put(k3, v10);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        this.f3141a.putAll(map);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        return this.f3141a.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f3141a.size();
    }

    public final String toString() {
        return this.f3141a.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.f3141a.values();
    }
}
