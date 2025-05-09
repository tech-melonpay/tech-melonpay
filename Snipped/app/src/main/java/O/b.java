package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap.java */
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a, reason: collision with root package name */
    public c<K, V> f24326a;

    /* renamed from: b, reason: collision with root package name */
    public c<K, V> f24327b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap<f<K, V>, Boolean> f24328c = new WeakHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public int f24329d = 0;

    /* compiled from: SafeIterableMap.java */
    public static class a<K, V> extends e<K, V> {
        @Override // o.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f24333d;
        }

        @Override // o.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f24332c;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: o.b$b, reason: collision with other inner class name */
    public static class C0437b<K, V> extends e<K, V> {
        @Override // o.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f24332c;
        }

        @Override // o.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f24333d;
        }
    }

    /* compiled from: SafeIterableMap.java */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final K f24330a;

        /* renamed from: b, reason: collision with root package name */
        public final V f24331b;

        /* renamed from: c, reason: collision with root package name */
        public c<K, V> f24332c;

        /* renamed from: d, reason: collision with root package name */
        public c<K, V> f24333d;

        public c(K k3, V v10) {
            this.f24330a = k3;
            this.f24331b = v10;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f24330a.equals(cVar.f24330a) && this.f24331b.equals(cVar.f24331b);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f24330a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f24331b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f24330a.hashCode() ^ this.f24331b.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f24330a + "=" + this.f24331b;
        }
    }

    /* compiled from: SafeIterableMap.java */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public c<K, V> f24334a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f24335b = true;

        public d() {
        }

        @Override // o.b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f24334a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f24333d;
                this.f24334a = cVar3;
                this.f24335b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f24335b) {
                return b.this.f24326a != null;
            }
            c<K, V> cVar = this.f24334a;
            return (cVar == null || cVar.f24332c == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f24335b) {
                this.f24335b = false;
                this.f24334a = b.this.f24326a;
            } else {
                c<K, V> cVar = this.f24334a;
                this.f24334a = cVar != null ? cVar.f24332c : null;
            }
            return this.f24334a;
        }
    }

    /* compiled from: SafeIterableMap.java */
    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public c<K, V> f24337a;

        /* renamed from: b, reason: collision with root package name */
        public c<K, V> f24338b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f24337a = cVar2;
            this.f24338b = cVar;
        }

        @Override // o.b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f24337a == cVar && cVar == this.f24338b) {
                this.f24338b = null;
                this.f24337a = null;
            }
            c<K, V> cVar3 = this.f24337a;
            if (cVar3 == cVar) {
                this.f24337a = b(cVar3);
            }
            c<K, V> cVar4 = this.f24338b;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f24337a;
                if (cVar4 != cVar5 && cVar5 != null) {
                    cVar2 = c(cVar4);
                }
                this.f24338b = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f24338b != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar = this.f24338b;
            c<K, V> cVar2 = this.f24337a;
            this.f24338b = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    /* compiled from: SafeIterableMap.java */
    public static abstract class f<K, V> {
        public abstract void a(c<K, V> cVar);
    }

    public c<K, V> a(K k3) {
        c<K, V> cVar = this.f24326a;
        while (cVar != null && !cVar.f24330a.equals(k3)) {
            cVar = cVar.f24332c;
        }
        return cVar;
    }

    public V b(K k3, V v10) {
        c<K, V> a10 = a(k3);
        if (a10 != null) {
            return a10.f24331b;
        }
        c<K, V> cVar = new c<>(k3, v10);
        this.f24329d++;
        c<K, V> cVar2 = this.f24327b;
        if (cVar2 == null) {
            this.f24326a = cVar;
            this.f24327b = cVar;
            return null;
        }
        cVar2.f24332c = cVar;
        cVar.f24333d = cVar2;
        this.f24327b = cVar;
        return null;
    }

    public V c(K k3) {
        c<K, V> a10 = a(k3);
        if (a10 == null) {
            return null;
        }
        this.f24329d--;
        WeakHashMap<f<K, V>, Boolean> weakHashMap = this.f24328c;
        if (!weakHashMap.isEmpty()) {
            Iterator<f<K, V>> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(a10);
            }
        }
        c<K, V> cVar = a10.f24333d;
        if (cVar != null) {
            cVar.f24332c = a10.f24332c;
        } else {
            this.f24326a = a10.f24332c;
        }
        c<K, V> cVar2 = a10.f24332c;
        if (cVar2 != null) {
            cVar2.f24333d = cVar;
        } else {
            this.f24327b = cVar;
        }
        a10.f24332c = null;
        a10.f24333d = null;
        return a10.f24331b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((o.b.e) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof o.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            o.b r7 = (o.b) r7
            int r1 = r6.f24329d
            int r3 = r7.f24329d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            o.b$e r3 = (o.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            o.b$e r4 = (o.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            o.b$e r7 = (o.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i;
            }
            i += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f24326a, this.f24327b);
        this.f24328c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sb2.append(", ");
            }
        }
    }
}
