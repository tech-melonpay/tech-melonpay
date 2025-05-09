package Q9;

import P9.f;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.collections.builders.MapBuilder;

/* compiled from: MapBuilder.kt */
/* loaded from: classes2.dex */
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends f<E> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        MapBuilder<K, V> mapBuilder = ((kotlin.collections.builders.a) this).f23149a;
        mapBuilder.getClass();
        int h9 = mapBuilder.h(entry.getKey());
        if (h9 < 0) {
            return false;
        }
        return kotlin.jvm.internal.f.b(mapBuilder.f23126b[h9], entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        MapBuilder<K, V> mapBuilder = ((kotlin.collections.builders.a) this).f23149a;
        mapBuilder.d();
        int h9 = mapBuilder.h(entry.getKey());
        if (h9 < 0 || !kotlin.jvm.internal.f.b(mapBuilder.f23126b[h9], entry.getValue())) {
            return false;
        }
        mapBuilder.k(h9);
        return true;
    }
}
