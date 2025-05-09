package io.sentry;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/* loaded from: classes2.dex */
class SynchronizedCollection<E> implements Collection<E>, Serializable {
    private static final long serialVersionUID = 2412805092710877986L;

    /* renamed from: a, reason: collision with root package name */
    public final Collection<E> f21885a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21886b = this;

    public SynchronizedCollection(Collection<E> collection) {
        this.f21885a = collection;
    }

    @Override // java.util.Collection
    public final boolean add(E e10) {
        boolean add;
        synchronized (this.f21886b) {
            add = ((Queue) ((SynchronizedQueue) this).f21885a).add(e10);
        }
        return add;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        boolean addAll;
        synchronized (this.f21886b) {
            addAll = ((Queue) ((SynchronizedQueue) this).f21885a).addAll(collection);
        }
        return addAll;
    }

    @Override // java.util.Collection
    public final void clear() {
        synchronized (this.f21886b) {
            ((Queue) ((SynchronizedQueue) this).f21885a).clear();
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        boolean contains;
        synchronized (this.f21886b) {
            contains = ((Queue) ((SynchronizedQueue) this).f21885a).contains(obj);
        }
        return contains;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        boolean containsAll;
        synchronized (this.f21886b) {
            containsAll = ((Queue) ((SynchronizedQueue) this).f21885a).containsAll(collection);
        }
        return containsAll;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f21886b) {
            isEmpty = ((Queue) ((SynchronizedQueue) this).f21885a).isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return ((Queue) ((SynchronizedQueue) this).f21885a).iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        boolean remove;
        synchronized (this.f21886b) {
            remove = ((Queue) ((SynchronizedQueue) this).f21885a).remove(obj);
        }
        return remove;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        boolean removeAll;
        synchronized (this.f21886b) {
            removeAll = ((Queue) ((SynchronizedQueue) this).f21885a).removeAll(collection);
        }
        return removeAll;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        boolean retainAll;
        synchronized (this.f21886b) {
            retainAll = ((Queue) ((SynchronizedQueue) this).f21885a).retainAll(collection);
        }
        return retainAll;
    }

    @Override // java.util.Collection
    public final int size() {
        int size;
        synchronized (this.f21886b) {
            size = ((Queue) ((SynchronizedQueue) this).f21885a).size();
        }
        return size;
    }

    public final String toString() {
        String obj;
        synchronized (this.f21886b) {
            obj = ((Queue) ((SynchronizedQueue) this).f21885a).toString();
        }
        return obj;
    }
}
