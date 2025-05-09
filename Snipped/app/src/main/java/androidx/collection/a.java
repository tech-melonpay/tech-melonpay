package androidx.collection;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: ArrayMap.java */
/* loaded from: classes.dex */
public class a<K, V> extends g<K, V> implements Map<K, V> {
    a<K, V>.C0067a mEntrySet;
    a<K, V>.c mKeySet;
    a<K, V>.e mValues;

    /* compiled from: ArrayMap.java */
    /* renamed from: androidx.collection.a$a, reason: collision with other inner class name */
    public final class C0067a extends AbstractSet<Map.Entry<K, V>> {
        public C0067a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return a.this.size();
        }
    }

    /* compiled from: ArrayMap.java */
    public final class b extends androidx.collection.c<K> {
        public b() {
            super(a.this.size());
        }

        @Override // androidx.collection.c
        public final K a(int i) {
            return a.this.keyAt(i);
        }

        @Override // androidx.collection.c
        public final void c(int i) {
            a.this.removeAt(i);
        }
    }

    /* compiled from: ArrayMap.java */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public int f5884a;

        /* renamed from: b, reason: collision with root package name */
        public int f5885b = -1;

        /* renamed from: c, reason: collision with root package name */
        public boolean f5886c;

        public d() {
            this.f5884a = a.this.size() - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.f5886c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.f5885b;
            a aVar = a.this;
            return kotlin.jvm.internal.f.b(key, aVar.keyAt(i)) && kotlin.jvm.internal.f.b(entry.getValue(), aVar.valueAt(this.f5885b));
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (this.f5886c) {
                return a.this.keyAt(this.f5885b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (this.f5886c) {
                return a.this.valueAt(this.f5885b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f5885b < this.f5884a;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.f5886c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            int i = this.f5885b;
            a aVar = a.this;
            K keyAt = aVar.keyAt(i);
            V valueAt = aVar.valueAt(this.f5885b);
            return (keyAt == null ? 0 : keyAt.hashCode()) ^ (valueAt != null ? valueAt.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f5885b++;
            this.f5886c = true;
            return this;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f5886c) {
                throw new IllegalStateException();
            }
            a.this.removeAt(this.f5885b);
            this.f5885b--;
            this.f5884a--;
            this.f5886c = false;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            if (this.f5886c) {
                return a.this.setValueAt(this.f5885b, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* compiled from: ArrayMap.java */
    public final class f extends androidx.collection.c<V> {
        public f() {
            super(a.this.size());
        }

        @Override // androidx.collection.c
        public final V a(int i) {
            return a.this.valueAt(i);
        }

        @Override // androidx.collection.c
        public final void c(int i) {
            a.this.removeAt(i);
        }
    }

    public a() {
    }

    public static <T> boolean equalsSetHelper(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.g, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.g, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        a<K, V>.C0067a c0067a = this.mEntrySet;
        if (c0067a != null) {
            return c0067a;
        }
        a<K, V>.C0067a c0067a2 = new C0067a();
        this.mEntrySet = c0067a2;
        return c0067a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.g, java.util.Map
    public V get(Object obj) {
        return (V) super.get(obj);
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        a<K, V>.c cVar = this.mKeySet;
        if (cVar != null) {
            return cVar;
        }
        a<K, V>.c cVar2 = new c();
        this.mKeySet = cVar2;
        return cVar2;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        ensureCapacity(map.size() + size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.g, java.util.Map
    public V remove(Object obj) {
        return (V) super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        int size = size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != size();
    }

    public boolean retainAll(Collection<?> collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(keyAt(size2))) {
                removeAt(size2);
            }
        }
        return size != size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        a<K, V>.e eVar = this.mValues;
        if (eVar != null) {
            return eVar;
        }
        a<K, V>.e eVar2 = new e();
        this.mValues = eVar2;
        return eVar2;
    }

    public a(int i) {
        super(i);
    }

    public a(g gVar) {
        super(gVar);
    }

    /* compiled from: ArrayMap.java */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k3) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            return a.this.containsAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return a.equalsSetHelper(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            a aVar = a.this;
            int i = 0;
            for (int size = aVar.size() - 1; size >= 0; size--) {
                K keyAt = aVar.keyAt(size);
                i += keyAt == null ? 0 : keyAt.hashCode();
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new b();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            a aVar = a.this;
            int indexOfKey = aVar.indexOfKey(obj);
            if (indexOfKey < 0) {
                return false;
            }
            aVar.removeAt(indexOfKey);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            return a.this.removeAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return a.this.retainAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return a.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            a aVar = a.this;
            int size = aVar.size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i = 0; i < size; i++) {
                tArr[i] = aVar.keyAt(i);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            a aVar = a.this;
            int size = aVar.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                objArr[i] = aVar.keyAt(i);
            }
            return objArr;
        }
    }

    /* compiled from: ArrayMap.java */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            a.this.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return a.this.__restricted$indexOfValue(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new f();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            a aVar = a.this;
            int __restricted$indexOfValue = aVar.__restricted$indexOfValue(obj);
            if (__restricted$indexOfValue < 0) {
                return false;
            }
            aVar.removeAt(__restricted$indexOfValue);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            a aVar = a.this;
            int size = aVar.size();
            int i = 0;
            boolean z10 = false;
            while (i < size) {
                if (collection.contains(aVar.valueAt(i))) {
                    aVar.removeAt(i);
                    i--;
                    size--;
                    z10 = true;
                }
                i++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            a aVar = a.this;
            int size = aVar.size();
            int i = 0;
            boolean z10 = false;
            while (i < size) {
                if (!collection.contains(aVar.valueAt(i))) {
                    aVar.removeAt(i);
                    i--;
                    size--;
                    z10 = true;
                }
                i++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public final int size() {
            return a.this.size();
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            a aVar = a.this;
            int size = aVar.size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i = 0; i < size; i++) {
                tArr[i] = aVar.valueAt(i);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            a aVar = a.this;
            int size = aVar.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                objArr[i] = aVar.valueAt(i);
            }
            return objArr;
        }
    }
}
