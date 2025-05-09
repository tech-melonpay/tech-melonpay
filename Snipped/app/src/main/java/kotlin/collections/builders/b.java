package kotlin.collections.builders;

import P9.f;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.builders.MapBuilder;

/* compiled from: MapBuilder.kt */
/* loaded from: classes2.dex */
public final class b<E> extends f<E> {

    /* renamed from: a, reason: collision with root package name */
    public final MapBuilder<E, ?> f23150a;

    public b(MapBuilder<E, ?> mapBuilder) {
        this.f23150a = mapBuilder;
    }

    @Override // P9.f, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f23150a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f23150a.containsKey(obj);
    }

    @Override // P9.f
    public final int getSize() {
        return this.f23150a.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f23150a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        MapBuilder<E, ?> mapBuilder = this.f23150a;
        mapBuilder.getClass();
        return new MapBuilder.e(mapBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        MapBuilder<E, ?> mapBuilder = this.f23150a;
        mapBuilder.d();
        int h9 = mapBuilder.h(obj);
        if (h9 < 0) {
            return false;
        }
        mapBuilder.k(h9);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> collection) {
        this.f23150a.d();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> collection) {
        this.f23150a.d();
        return super.retainAll(collection);
    }
}
