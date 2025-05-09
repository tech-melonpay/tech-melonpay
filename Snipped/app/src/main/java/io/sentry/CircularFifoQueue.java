package io.sentry;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* loaded from: classes2.dex */
final class CircularFifoQueue<E> extends AbstractCollection<E> implements Queue<E>, Serializable {
    private static final long serialVersionUID = -8423413834657610406L;

    /* renamed from: a, reason: collision with root package name */
    public transient E[] f21795a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f21796b = 0;

    /* renamed from: c, reason: collision with root package name */
    public transient int f21797c = 0;

    /* renamed from: d, reason: collision with root package name */
    public transient boolean f21798d = false;

    /* renamed from: e, reason: collision with root package name */
    public final int f21799e;

    public class a implements Iterator<E> {

        /* renamed from: a, reason: collision with root package name */
        public int f21800a;

        /* renamed from: b, reason: collision with root package name */
        public int f21801b = -1;

        /* renamed from: c, reason: collision with root package name */
        public boolean f21802c;

        public a() {
            this.f21800a = CircularFifoQueue.this.f21796b;
            this.f21802c = CircularFifoQueue.this.f21798d;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f21802c || this.f21800a != CircularFifoQueue.this.f21797c;
        }

        @Override // java.util.Iterator
        public final E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f21802c = false;
            int i = this.f21800a;
            this.f21801b = i;
            int i9 = i + 1;
            CircularFifoQueue circularFifoQueue = CircularFifoQueue.this;
            this.f21800a = i9 < circularFifoQueue.f21799e ? i9 : 0;
            return circularFifoQueue.f21795a[i];
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i;
            int i9 = this.f21801b;
            if (i9 == -1) {
                throw new IllegalStateException();
            }
            CircularFifoQueue circularFifoQueue = CircularFifoQueue.this;
            int i10 = circularFifoQueue.f21796b;
            if (i9 == i10) {
                circularFifoQueue.remove();
                this.f21801b = -1;
                return;
            }
            int i11 = i9 + 1;
            int i12 = circularFifoQueue.f21799e;
            if (i10 >= i9 || i11 >= (i = circularFifoQueue.f21797c)) {
                while (i11 != circularFifoQueue.f21797c) {
                    if (i11 >= i12) {
                        E[] eArr = circularFifoQueue.f21795a;
                        eArr[i11 - 1] = eArr[0];
                    } else {
                        E[] eArr2 = circularFifoQueue.f21795a;
                        int i13 = i11 - 1;
                        if (i13 < 0) {
                            i13 = i12 - 1;
                        }
                        eArr2[i13] = eArr2[i11];
                        i11++;
                        if (i11 >= i12) {
                        }
                    }
                    i11 = 0;
                }
            } else {
                E[] eArr3 = circularFifoQueue.f21795a;
                System.arraycopy(eArr3, i11, eArr3, i9, i - i11);
            }
            this.f21801b = -1;
            int i14 = circularFifoQueue.f21797c - 1;
            if (i14 < 0) {
                i14 = i12 - 1;
            }
            circularFifoQueue.f21797c = i14;
            circularFifoQueue.f21795a[i14] = null;
            circularFifoQueue.f21798d = false;
            int i15 = this.f21800a - 1;
            if (i15 < 0) {
                i15 = i12 - 1;
            }
            this.f21800a = i15;
        }
    }

    public CircularFifoQueue(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        E[] eArr = (E[]) new Object[i];
        this.f21795a = eArr;
        this.f21799e = eArr.length;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int i = this.f21799e;
        this.f21795a = (E[]) new Object[i];
        int readInt = objectInputStream.readInt();
        for (int i9 = 0; i9 < readInt; i9++) {
            ((E[]) this.f21795a)[i9] = objectInputStream.readObject();
        }
        this.f21796b = 0;
        boolean z10 = readInt == i;
        this.f21798d = z10;
        if (z10) {
            this.f21797c = 0;
        } else {
            this.f21797c = readInt;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        a aVar = new a();
        while (aVar.hasNext()) {
            objectOutputStream.writeObject(aVar.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(E e10) {
        if (e10 == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        int size = size();
        int i = this.f21799e;
        if (size == i) {
            remove();
        }
        E[] eArr = this.f21795a;
        int i9 = this.f21797c;
        int i10 = i9 + 1;
        this.f21797c = i10;
        eArr[i9] = e10;
        if (i10 >= i) {
            this.f21797c = 0;
        }
        if (this.f21797c == this.f21796b) {
            this.f21798d = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f21798d = false;
        this.f21796b = 0;
        this.f21797c = 0;
        Arrays.fill(this.f21795a, (Object) null);
    }

    @Override // java.util.Queue
    public final E element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.Queue
    public final boolean offer(E e10) {
        add(e10);
        return true;
    }

    @Override // java.util.Queue
    public final E peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f21795a[this.f21796b];
    }

    @Override // java.util.Queue
    public final E poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public final E remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        E[] eArr = this.f21795a;
        int i = this.f21796b;
        E e10 = eArr[i];
        if (e10 != null) {
            int i9 = i + 1;
            this.f21796b = i9;
            eArr[i] = null;
            if (i9 >= this.f21799e) {
                this.f21796b = 0;
            }
            this.f21798d = false;
        }
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.f21797c;
        int i9 = this.f21796b;
        int i10 = this.f21799e;
        if (i < i9) {
            return (i10 - i9) + i;
        }
        if (i != i9) {
            return i - i9;
        }
        if (this.f21798d) {
            return i10;
        }
        return 0;
    }
}
