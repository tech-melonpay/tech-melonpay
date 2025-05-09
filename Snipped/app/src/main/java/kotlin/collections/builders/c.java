package kotlin.collections.builders;

import P9.AbstractC0501c;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.f;

/* compiled from: MapBuilder.kt */
/* loaded from: classes2.dex */
public final class c<V> extends AbstractC0501c<V> {

    /* renamed from: a, reason: collision with root package name */
    public final MapBuilder<?, V> f23151a;

    public c(MapBuilder<?, V> mapBuilder) {
        this.f23151a = mapBuilder;
    }

    @Override // P9.AbstractC0501c
    public final int a() {
        return this.f23151a.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends V> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f23151a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f23151a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f23151a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        MapBuilder<?, V> mapBuilder = this.f23151a;
        mapBuilder.getClass();
        return new MapBuilder.f(mapBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        MapBuilder<?, V> mapBuilder = this.f23151a;
        mapBuilder.d();
        int i9 = mapBuilder.f23130f;
        while (true) {
            i = -1;
            i9--;
            if (i9 >= 0) {
                if (mapBuilder.f23127c[i9] >= 0 && f.b(mapBuilder.f23126b[i9], obj)) {
                    i = i9;
                    break;
                }
            } else {
                break;
            }
        }
        if (i < 0) {
            return false;
        }
        mapBuilder.k(i);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        this.f23151a.d();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        this.f23151a.d();
        return super.retainAll(collection);
    }
}
