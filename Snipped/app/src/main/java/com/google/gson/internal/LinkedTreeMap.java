package com.google.gson.internal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final a i = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Comparator<? super K> f10384a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10385b;

    /* renamed from: c, reason: collision with root package name */
    public e<K, V> f10386c;

    /* renamed from: d, reason: collision with root package name */
    public int f10387d;

    /* renamed from: e, reason: collision with root package name */
    public int f10388e;

    /* renamed from: f, reason: collision with root package name */
    public final e<K, V> f10389f;

    /* renamed from: g, reason: collision with root package name */
    public LinkedTreeMap<K, V>.b f10390g;

    /* renamed from: h, reason: collision with root package name */
    public LinkedTreeMap<K, V>.c f10391h;

    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public class b extends AbstractSet<Map.Entry<K, V>> {

        public class a extends LinkedTreeMap<K, V>.d<Map.Entry<K, V>> {
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            LinkedTreeMap.this.clear();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean contains(java.lang.Object r5) {
            /*
                r4 = this;
                boolean r0 = r5 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L2b
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                com.google.gson.internal.LinkedTreeMap r0 = com.google.gson.internal.LinkedTreeMap.this
                r0.getClass()
                java.lang.Object r2 = r5.getKey()
                r3 = 0
                if (r2 == 0) goto L18
                com.google.gson.internal.LinkedTreeMap$e r0 = r0.a(r2, r1)     // Catch: java.lang.ClassCastException -> L18
                goto L19
            L18:
                r0 = r3
            L19:
                if (r0 == 0) goto L28
                V r2 = r0.f10405h
                java.lang.Object r5 = r5.getValue()
                boolean r5 = java.util.Objects.equals(r2, r5)
                if (r5 == 0) goto L28
                r3 = r0
            L28:
                if (r3 == 0) goto L2b
                r1 = 1
            L2b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.b.contains(java.lang.Object):boolean");
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x002b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean remove(java.lang.Object r6) {
            /*
                r5 = this;
                boolean r0 = r6 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6
                com.google.gson.internal.LinkedTreeMap r0 = com.google.gson.internal.LinkedTreeMap.this
                r0.getClass()
                java.lang.Object r2 = r6.getKey()
                r3 = 0
                if (r2 == 0) goto L19
                com.google.gson.internal.LinkedTreeMap$e r2 = r0.a(r2, r1)     // Catch: java.lang.ClassCastException -> L19
                goto L1a
            L19:
                r2 = r3
            L1a:
                if (r2 == 0) goto L29
                V r4 = r2.f10405h
                java.lang.Object r6 = r6.getValue()
                boolean r6 = java.util.Objects.equals(r4, r6)
                if (r6 == 0) goto L29
                r3 = r2
            L29:
                if (r3 != 0) goto L2c
                return r1
            L2c:
                r6 = 1
                r0.d(r3, r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.b.remove(java.lang.Object):boolean");
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LinkedTreeMap.this.f10387d;
        }
    }

    public final class c extends AbstractSet<K> {

        public class a extends LinkedTreeMap<K, V>.d<K> {
            @Override // com.google.gson.internal.LinkedTreeMap.d, java.util.Iterator
            public final K next() {
                return a().f10403f;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return LinkedTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            linkedTreeMap.getClass();
            e<K, V> eVar = null;
            if (obj != null) {
                try {
                    eVar = linkedTreeMap.a(obj, false);
                } catch (ClassCastException unused) {
                }
            }
            if (eVar != null) {
                linkedTreeMap.d(eVar, true);
            }
            return eVar != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LinkedTreeMap.this.f10387d;
        }
    }

    public abstract class d<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public e<K, V> f10394a;

        /* renamed from: b, reason: collision with root package name */
        public e<K, V> f10395b = null;

        /* renamed from: c, reason: collision with root package name */
        public int f10396c;

        public d() {
            this.f10394a = LinkedTreeMap.this.f10389f.f10401d;
            this.f10396c = LinkedTreeMap.this.f10388e;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f10394a;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (eVar == linkedTreeMap.f10389f) {
                throw new NoSuchElementException();
            }
            if (linkedTreeMap.f10388e != this.f10396c) {
                throw new ConcurrentModificationException();
            }
            this.f10394a = eVar.f10401d;
            this.f10395b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f10394a != LinkedTreeMap.this.f10389f;
        }

        @Override // java.util.Iterator
        public Object next() {
            return a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f10395b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            linkedTreeMap.d(eVar, true);
            this.f10395b = null;
            this.f10396c = linkedTreeMap.f10388e;
        }
    }

    public LinkedTreeMap() {
        this(true);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    public final e<K, V> a(K k3, boolean z10) {
        int i9;
        e<K, V> eVar;
        e<K, V> eVar2 = this.f10386c;
        a aVar = i;
        Comparator<? super K> comparator = this.f10384a;
        if (eVar2 != null) {
            Comparable comparable = comparator == aVar ? (Comparable) k3 : null;
            while (true) {
                K k10 = eVar2.f10403f;
                i9 = comparable != null ? comparable.compareTo(k10) : comparator.compare(k3, k10);
                if (i9 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i9 < 0 ? eVar2.f10399b : eVar2.f10400c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i9 = 0;
        }
        if (!z10) {
            return null;
        }
        e<K, V> eVar4 = this.f10389f;
        if (eVar2 != null) {
            eVar = new e<>(this.f10385b, eVar2, k3, eVar4, eVar4.f10402e);
            if (i9 < 0) {
                eVar2.f10399b = eVar;
            } else {
                eVar2.f10400c = eVar;
            }
            c(eVar2, true);
        } else {
            if (comparator == aVar && !(k3 instanceof Comparable)) {
                throw new ClassCastException(k3.getClass().getName().concat(" is not Comparable"));
            }
            eVar = new e<>(this.f10385b, eVar2, k3, eVar4, eVar4.f10402e);
            this.f10386c = eVar;
        }
        this.f10387d++;
        this.f10388e++;
        return eVar;
    }

    public final void c(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f10399b;
            e<K, V> eVar3 = eVar.f10400c;
            int i9 = eVar2 != null ? eVar2.i : 0;
            int i10 = eVar3 != null ? eVar3.i : 0;
            int i11 = i9 - i10;
            if (i11 == -2) {
                e<K, V> eVar4 = eVar3.f10399b;
                e<K, V> eVar5 = eVar3.f10400c;
                int i12 = (eVar4 != null ? eVar4.i : 0) - (eVar5 != null ? eVar5.i : 0);
                if (i12 == -1 || (i12 == 0 && !z10)) {
                    f(eVar);
                } else {
                    g(eVar3);
                    f(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i11 == 2) {
                e<K, V> eVar6 = eVar2.f10399b;
                e<K, V> eVar7 = eVar2.f10400c;
                int i13 = (eVar6 != null ? eVar6.i : 0) - (eVar7 != null ? eVar7.i : 0);
                if (i13 == 1 || (i13 == 0 && !z10)) {
                    g(eVar);
                } else {
                    f(eVar2);
                    g(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i11 == 0) {
                eVar.i = i9 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.i = Math.max(i9, i10) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f10398a;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f10386c = null;
        this.f10387d = 0;
        this.f10388e++;
        e<K, V> eVar = this.f10389f;
        eVar.f10402e = eVar;
        eVar.f10401d = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        e<K, V> eVar = null;
        if (obj != 0) {
            try {
                eVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return eVar != null;
    }

    public final void d(e<K, V> eVar, boolean z10) {
        e<K, V> eVar2;
        e<K, V> eVar3;
        int i9;
        if (z10) {
            e<K, V> eVar4 = eVar.f10402e;
            eVar4.f10401d = eVar.f10401d;
            eVar.f10401d.f10402e = eVar4;
        }
        e<K, V> eVar5 = eVar.f10399b;
        e<K, V> eVar6 = eVar.f10400c;
        e<K, V> eVar7 = eVar.f10398a;
        int i10 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                e(eVar, eVar5);
                eVar.f10399b = null;
            } else if (eVar6 != null) {
                e(eVar, eVar6);
                eVar.f10400c = null;
            } else {
                e(eVar, null);
            }
            c(eVar7, false);
            this.f10387d--;
            this.f10388e++;
            return;
        }
        if (eVar5.i > eVar6.i) {
            e<K, V> eVar8 = eVar5.f10400c;
            while (true) {
                e<K, V> eVar9 = eVar8;
                eVar3 = eVar5;
                eVar5 = eVar9;
                if (eVar5 == null) {
                    break;
                } else {
                    eVar8 = eVar5.f10400c;
                }
            }
        } else {
            e<K, V> eVar10 = eVar6.f10399b;
            while (true) {
                eVar2 = eVar6;
                eVar6 = eVar10;
                if (eVar6 == null) {
                    break;
                } else {
                    eVar10 = eVar6.f10399b;
                }
            }
            eVar3 = eVar2;
        }
        d(eVar3, false);
        e<K, V> eVar11 = eVar.f10399b;
        if (eVar11 != null) {
            i9 = eVar11.i;
            eVar3.f10399b = eVar11;
            eVar11.f10398a = eVar3;
            eVar.f10399b = null;
        } else {
            i9 = 0;
        }
        e<K, V> eVar12 = eVar.f10400c;
        if (eVar12 != null) {
            i10 = eVar12.i;
            eVar3.f10400c = eVar12;
            eVar12.f10398a = eVar3;
            eVar.f10400c = null;
        }
        eVar3.i = Math.max(i9, i10) + 1;
        e(eVar, eVar3);
    }

    public final void e(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f10398a;
        eVar.f10398a = null;
        if (eVar2 != null) {
            eVar2.f10398a = eVar3;
        }
        if (eVar3 == null) {
            this.f10386c = eVar2;
        } else if (eVar3.f10399b == eVar) {
            eVar3.f10399b = eVar2;
        } else {
            eVar3.f10400c = eVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        LinkedTreeMap<K, V>.b bVar = this.f10390g;
        if (bVar != null) {
            return bVar;
        }
        LinkedTreeMap<K, V>.b bVar2 = new b();
        this.f10390g = bVar2;
        return bVar2;
    }

    public final void f(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f10399b;
        e<K, V> eVar3 = eVar.f10400c;
        e<K, V> eVar4 = eVar3.f10399b;
        e<K, V> eVar5 = eVar3.f10400c;
        eVar.f10400c = eVar4;
        if (eVar4 != null) {
            eVar4.f10398a = eVar;
        }
        e(eVar, eVar3);
        eVar3.f10399b = eVar;
        eVar.f10398a = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.i : 0, eVar4 != null ? eVar4.i : 0) + 1;
        eVar.i = max;
        eVar3.i = Math.max(max, eVar5 != null ? eVar5.i : 0) + 1;
    }

    public final void g(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f10399b;
        e<K, V> eVar3 = eVar.f10400c;
        e<K, V> eVar4 = eVar2.f10399b;
        e<K, V> eVar5 = eVar2.f10400c;
        eVar.f10399b = eVar5;
        if (eVar5 != null) {
            eVar5.f10398a = eVar;
        }
        e(eVar, eVar2);
        eVar2.f10400c = eVar;
        eVar.f10398a = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.i : 0, eVar5 != null ? eVar5.i : 0) + 1;
        eVar.i = max;
        eVar2.i = Math.max(max, eVar4 != null ? eVar4.i : 0) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            com.google.gson.internal.LinkedTreeMap$e r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto Le
            V r0 = r3.f10405h
        Le:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        LinkedTreeMap<K, V>.c cVar = this.f10391h;
        if (cVar != null) {
            return cVar;
        }
        LinkedTreeMap<K, V>.c cVar2 = new c();
        this.f10391h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k3, V v10) {
        if (k3 == null) {
            throw new NullPointerException("key == null");
        }
        if (v10 == null && !this.f10385b) {
            throw new NullPointerException("value == null");
        }
        e<K, V> a10 = a(k3, true);
        V v11 = a10.f10405h;
        a10.f10405h = v10;
        return v11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            com.google.gson.internal.LinkedTreeMap$e r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.d(r3, r1)
        L10:
            if (r3 == 0) goto L14
            V r0 = r3.f10405h
        L14:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f10387d;
    }

    public LinkedTreeMap(boolean z10) {
        a aVar = i;
        this.f10387d = 0;
        this.f10388e = 0;
        this.f10384a = aVar;
        this.f10385b = z10;
        this.f10389f = new e<>(z10);
    }

    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public e<K, V> f10398a;

        /* renamed from: b, reason: collision with root package name */
        public e<K, V> f10399b;

        /* renamed from: c, reason: collision with root package name */
        public e<K, V> f10400c;

        /* renamed from: d, reason: collision with root package name */
        public e<K, V> f10401d;

        /* renamed from: e, reason: collision with root package name */
        public e<K, V> f10402e;

        /* renamed from: f, reason: collision with root package name */
        public final K f10403f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f10404g;

        /* renamed from: h, reason: collision with root package name */
        public V f10405h;
        public int i;

        public e(boolean z10) {
            this.f10403f = null;
            this.f10404g = z10;
            this.f10402e = this;
            this.f10401d = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k3 = this.f10403f;
            if (k3 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k3.equals(entry.getKey())) {
                return false;
            }
            V v10 = this.f10405h;
            if (v10 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v10.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f10403f;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f10405h;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k3 = this.f10403f;
            int hashCode = k3 == null ? 0 : k3.hashCode();
            V v10 = this.f10405h;
            return (v10 != null ? v10.hashCode() : 0) ^ hashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            if (v10 == null && !this.f10404g) {
                throw new NullPointerException("value == null");
            }
            V v11 = this.f10405h;
            this.f10405h = v10;
            return v11;
        }

        public final String toString() {
            return this.f10403f + "=" + this.f10405h;
        }

        public e(boolean z10, e<K, V> eVar, K k3, e<K, V> eVar2, e<K, V> eVar3) {
            this.f10398a = eVar;
            this.f10403f = k3;
            this.f10404g = z10;
            this.i = 1;
            this.f10401d = eVar2;
            this.f10402e = eVar3;
            eVar3.f10401d = this;
            eVar2.f10402e = this;
        }
    }
}
