package androidx.collection;

import da.InterfaceC0701a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: IndexBasedArrayIterator.kt */
/* loaded from: classes.dex */
public abstract class c<T> implements Iterator<T>, InterfaceC0701a {

    /* renamed from: a, reason: collision with root package name */
    public int f5894a;

    /* renamed from: b, reason: collision with root package name */
    public int f5895b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5896c;

    public c(int i) {
        this.f5894a = i;
    }

    public abstract T a(int i);

    public abstract void c(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5895b < this.f5894a;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T a10 = a(this.f5895b);
        this.f5895b++;
        this.f5896c = true;
        return a10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f5896c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f5895b - 1;
        this.f5895b = i;
        c(i);
        this.f5894a--;
        this.f5896c = false;
    }
}
