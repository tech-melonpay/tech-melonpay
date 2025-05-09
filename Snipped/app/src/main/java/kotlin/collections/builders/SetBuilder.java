package kotlin.collections.builders;

import P9.f;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.builders.MapBuilder;

/* compiled from: SetBuilder.kt */
/* loaded from: classes2.dex */
public final class SetBuilder<E> extends f<E> implements Set<E>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final SetBuilder f23147b;

    /* renamed from: a, reason: collision with root package name */
    public final MapBuilder<E, ?> f23148a;

    static {
        MapBuilder mapBuilder = MapBuilder.f23124n;
        f23147b = new SetBuilder(MapBuilder.f23124n);
    }

    public SetBuilder(MapBuilder<E, ?> mapBuilder) {
        this.f23148a = mapBuilder;
    }

    private final Object writeReplace() {
        if (this.f23148a.f23136m) {
            return new SerializedCollection(1, this);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // P9.f, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        return this.f23148a.a(e10) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        this.f23148a.d();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f23148a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f23148a.containsKey(obj);
    }

    @Override // P9.f
    public final int getSize() {
        return this.f23148a.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f23148a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        MapBuilder<E, ?> mapBuilder = this.f23148a;
        mapBuilder.getClass();
        return new MapBuilder.e(mapBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        MapBuilder<E, ?> mapBuilder = this.f23148a;
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
        this.f23148a.d();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> collection) {
        this.f23148a.d();
        return super.retainAll(collection);
    }

    public SetBuilder() {
        this(new MapBuilder());
    }
}
