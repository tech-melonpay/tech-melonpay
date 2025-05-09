package com.google.crypto.tink.shaded.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: SmallSortedMap.java */
/* loaded from: classes.dex */
public class a0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f10186g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f10187a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10190d;

    /* renamed from: e, reason: collision with root package name */
    public volatile a0<K, V>.d f10191e;

    /* renamed from: b, reason: collision with root package name */
    public List<a0<K, V>.b> f10188b = Collections.emptyList();

    /* renamed from: c, reason: collision with root package name */
    public Map<K, V> f10189c = Collections.emptyMap();

    /* renamed from: f, reason: collision with root package name */
    public Map<K, V> f10192f = Collections.emptyMap();

    /* compiled from: SmallSortedMap.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0110a f10193a = new C0110a();

        /* renamed from: b, reason: collision with root package name */
        public static final b f10194b = new b();

        /* compiled from: SmallSortedMap.java */
        /* renamed from: com.google.crypto.tink.shaded.protobuf.a0$a$a, reason: collision with other inner class name */
        public class C0110a implements Iterator<Object> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* compiled from: SmallSortedMap.java */
        public class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return a.f10193a;
            }
        }
    }

    /* compiled from: SmallSortedMap.java */
    public class b implements Map.Entry<K, V>, Comparable<a0<K, V>.b> {

        /* renamed from: a, reason: collision with root package name */
        public final K f10195a;

        /* renamed from: b, reason: collision with root package name */
        public V f10196b;

        public b() {
            throw null;
        }

        public b(K k3, V v10) {
            this.f10195a = k3;
            this.f10196b = v10;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f10195a.compareTo(((b) obj).f10195a);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            K k3 = this.f10195a;
            if (k3 != null ? k3.equals(key) : key == null) {
                V v10 = this.f10196b;
                Object value = entry.getValue();
                if (v10 == null) {
                    if (value == null) {
                        return true;
                    }
                } else if (v10.equals(value)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f10195a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f10196b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k3 = this.f10195a;
            int hashCode = k3 == null ? 0 : k3.hashCode();
            V v10 = this.f10196b;
            return (v10 != null ? v10.hashCode() : 0) ^ hashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            int i = a0.f10186g;
            a0.this.c();
            V v11 = this.f10196b;
            this.f10196b = v10;
            return v11;
        }

        public final String toString() {
            return this.f10195a + "=" + this.f10196b;
        }
    }

    /* compiled from: SmallSortedMap.java */
    public class c implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public int f10198a = -1;

        /* renamed from: b, reason: collision with root package name */
        public boolean f10199b;

        /* renamed from: c, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f10200c;

        public c() {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f10200c == null) {
                this.f10200c = a0.this.f10189c.entrySet().iterator();
            }
            return this.f10200c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.f10198a + 1;
            a0 a0Var = a0.this;
            if (i >= a0Var.f10188b.size()) {
                return !a0Var.f10189c.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f10199b = true;
            int i = this.f10198a + 1;
            this.f10198a = i;
            a0 a0Var = a0.this;
            return i < a0Var.f10188b.size() ? a0Var.f10188b.get(this.f10198a) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f10199b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f10199b = false;
            int i = a0.f10186g;
            a0 a0Var = a0.this;
            a0Var.c();
            if (this.f10198a >= a0Var.f10188b.size()) {
                a().remove();
                return;
            }
            int i9 = this.f10198a;
            this.f10198a = i9 - 1;
            a0Var.i(i9);
        }
    }

    /* compiled from: SmallSortedMap.java */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            a0.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            a0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = a0.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            a0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return a0.this.size();
        }
    }

    public a0(int i) {
        this.f10187a = i;
    }

    public final int a(K k3) {
        int i;
        int size = this.f10188b.size();
        int i9 = size - 1;
        if (i9 >= 0) {
            int compareTo = k3.compareTo(this.f10188b.get(i9).f10195a);
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i9;
            }
        }
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) / 2;
            int compareTo2 = k3.compareTo(this.f10188b.get(i11).f10195a);
            if (compareTo2 < 0) {
                i9 = i11 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i11;
                }
                i10 = i11 + 1;
            }
        }
        i = i10 + 1;
        return -i;
    }

    public final void c() {
        if (this.f10190d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        if (!this.f10188b.isEmpty()) {
            this.f10188b.clear();
        }
        if (this.f10189c.isEmpty()) {
            return;
        }
        this.f10189c.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f10189c.containsKey(comparable);
    }

    public final Map.Entry<K, V> d(int i) {
        return this.f10188b.get(i);
    }

    public final Iterable<Map.Entry<K, V>> e() {
        return this.f10189c.isEmpty() ? a.f10194b : this.f10189c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f10191e == null) {
            this.f10191e = new d();
        }
        return this.f10191e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return super.equals(obj);
        }
        a0 a0Var = (a0) obj;
        int size = size();
        if (size != a0Var.size()) {
            return false;
        }
        int size2 = this.f10188b.size();
        if (size2 != a0Var.f10188b.size()) {
            return entrySet().equals(a0Var.entrySet());
        }
        for (int i = 0; i < size2; i++) {
            if (!d(i).equals(a0Var.d(i))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f10189c.equals(a0Var.f10189c);
        }
        return true;
    }

    public final SortedMap<K, V> f() {
        c();
        if (this.f10189c.isEmpty() && !(this.f10189c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f10189c = treeMap;
            this.f10192f = treeMap.descendingMap();
        }
        return (SortedMap) this.f10189c;
    }

    public void g() {
        if (this.f10190d) {
            return;
        }
        this.f10189c = this.f10189c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f10189c);
        this.f10192f = this.f10192f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f10192f);
        this.f10190d = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        return a10 >= 0 ? this.f10188b.get(a10).f10196b : this.f10189c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final V put(K k3, V v10) {
        c();
        int a10 = a(k3);
        if (a10 >= 0) {
            return this.f10188b.get(a10).setValue(v10);
        }
        c();
        boolean isEmpty = this.f10188b.isEmpty();
        int i = this.f10187a;
        if (isEmpty && !(this.f10188b instanceof ArrayList)) {
            this.f10188b = new ArrayList(i);
        }
        int i9 = -(a10 + 1);
        if (i9 >= i) {
            return f().put(k3, v10);
        }
        if (this.f10188b.size() == i) {
            a0<K, V>.b remove = this.f10188b.remove(i - 1);
            f().put(remove.f10195a, remove.f10196b);
        }
        this.f10188b.add(i9, new b(k3, v10));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f10188b.size();
        int i = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i += this.f10188b.get(i9).hashCode();
        }
        return this.f10189c.size() > 0 ? i + this.f10189c.hashCode() : i;
    }

    public final V i(int i) {
        c();
        V v10 = this.f10188b.remove(i).f10196b;
        if (!this.f10189c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = f().entrySet().iterator();
            List<a0<K, V>.b> list = this.f10188b;
            Map.Entry<K, V> next = it.next();
            list.add(new b(next.getKey(), next.getValue()));
            it.remove();
        }
        return v10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return (V) i(a10);
        }
        if (this.f10189c.isEmpty()) {
            return null;
        }
        return this.f10189c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f10189c.size() + this.f10188b.size();
    }
}
