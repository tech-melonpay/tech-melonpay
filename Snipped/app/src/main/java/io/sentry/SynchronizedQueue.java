package io.sentry;

import java.util.Queue;

/* loaded from: classes2.dex */
final class SynchronizedQueue<E> extends SynchronizedCollection<E> implements Queue<E> {
    private static final long serialVersionUID = 1;

    @Override // java.util.Queue
    public final E element() {
        E e10;
        synchronized (this.f21886b) {
            e10 = (E) ((Queue) this.f21885a).element();
        }
        return e10;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f21886b) {
            equals = ((Queue) this.f21885a).equals(obj);
        }
        return equals;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        int hashCode;
        synchronized (this.f21886b) {
            hashCode = ((Queue) this.f21885a).hashCode();
        }
        return hashCode;
    }

    @Override // java.util.Queue
    public final boolean offer(E e10) {
        boolean offer;
        synchronized (this.f21886b) {
            offer = ((Queue) this.f21885a).offer(e10);
        }
        return offer;
    }

    @Override // java.util.Queue
    public final E peek() {
        E e10;
        synchronized (this.f21886b) {
            e10 = (E) ((Queue) this.f21885a).peek();
        }
        return e10;
    }

    @Override // java.util.Queue
    public final E poll() {
        E e10;
        synchronized (this.f21886b) {
            e10 = (E) ((Queue) this.f21885a).poll();
        }
        return e10;
    }

    @Override // java.util.Queue
    public final E remove() {
        E e10;
        synchronized (this.f21886b) {
            e10 = (E) ((Queue) this.f21885a).remove();
        }
        return e10;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] array;
        synchronized (this.f21886b) {
            array = ((Queue) this.f21885a).toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        T[] tArr2;
        synchronized (this.f21886b) {
            tArr2 = (T[]) ((Queue) this.f21885a).toArray(tArr);
        }
        return tArr2;
    }
}
