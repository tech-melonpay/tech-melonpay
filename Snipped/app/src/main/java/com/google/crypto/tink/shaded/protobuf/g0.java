package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: UnmodifiableLazyStringList.java */
/* loaded from: classes.dex */
public final class g0 extends AbstractList<String> implements InterfaceC0677y, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0677y f10221a;

    /* compiled from: UnmodifiableLazyStringList.java */
    public class a implements ListIterator<String> {

        /* renamed from: a, reason: collision with root package name */
        public final ListIterator<String> f10222a;

        public a(g0 g0Var, int i) {
            this.f10222a = g0Var.f10221a.listIterator(i);
        }

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f10222a.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f10222a.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return this.f10222a.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f10222a.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.f10222a.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f10222a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnmodifiableLazyStringList.java */
    public class b implements Iterator<String> {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<String> f10223a;

        public b(g0 g0Var) {
            this.f10223a = g0Var.f10221a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f10223a.hasNext();
        }

        @Override // java.util.Iterator
        public final String next() {
            return this.f10223a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public g0(InterfaceC0677y interfaceC0677y) {
        this.f10221a = interfaceC0677y;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0677y
    public final List<?> A() {
        return this.f10221a.A();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0677y
    public final void V(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0677y
    public final Object d0(int i) {
        return this.f10221a.d0(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f10221a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new b(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new a(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10221a.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0677y
    public final InterfaceC0677y Y() {
        return this;
    }
}
