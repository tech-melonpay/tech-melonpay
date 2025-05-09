package androidx.collection;

import O9.p;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LruCache.kt */
/* loaded from: classes.dex */
public class f<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final Q.b lock;
    private final Q.c<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public f(int i) {
        this.maxSize = i;
        if (i <= 0) {
            Q.a.c("maxSize <= 0");
            throw null;
        }
        this.map = new Q.c<>();
        this.lock = new Q.b();
    }

    private final int safeSizeOf(K k3, V v10) {
        int sizeOf = sizeOf(k3, v10);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        throw new IllegalStateException("Negative size: " + k3 + '=' + v10);
    }

    public V create(K k3) {
        return null;
    }

    public final int createCount() {
        int i;
        synchronized (this.lock) {
            i = this.createCount;
        }
        return i;
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i;
        synchronized (this.lock) {
            i = this.evictionCount;
        }
        return i;
    }

    public final V get(K k3) {
        V v10;
        synchronized (this.lock) {
            V v11 = this.map.f3178a.get(k3);
            if (v11 != null) {
                this.hitCount++;
                return v11;
            }
            this.missCount++;
            V create = create(k3);
            if (create == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    v10 = (V) this.map.f3178a.put(k3, create);
                    if (v10 != null) {
                        this.map.f3178a.put(k3, v10);
                    } else {
                        this.size += safeSizeOf(k3, create);
                        p pVar = p.f3034a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (v10 != null) {
                entryRemoved(false, k3, create, v10);
                return v10;
            }
            trimToSize(this.maxSize);
            return create;
        }
    }

    public final int hitCount() {
        int i;
        synchronized (this.lock) {
            i = this.hitCount;
        }
        return i;
    }

    public final int maxSize() {
        int i;
        synchronized (this.lock) {
            i = this.maxSize;
        }
        return i;
    }

    public final int missCount() {
        int i;
        synchronized (this.lock) {
            i = this.missCount;
        }
        return i;
    }

    public final V put(K k3, V v10) {
        V put;
        synchronized (this.lock) {
            try {
                this.putCount++;
                this.size += safeSizeOf(k3, v10);
                put = this.map.f3178a.put(k3, v10);
                if (put != null) {
                    this.size -= safeSizeOf(k3, put);
                }
                p pVar = p.f3034a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (put != null) {
            entryRemoved(false, k3, put, v10);
        }
        trimToSize(this.maxSize);
        return put;
    }

    public final int putCount() {
        int i;
        synchronized (this.lock) {
            i = this.putCount;
        }
        return i;
    }

    public final V remove(K k3) {
        V remove;
        synchronized (this.lock) {
            try {
                remove = this.map.f3178a.remove(k3);
                if (remove != null) {
                    this.size -= safeSizeOf(k3, remove);
                }
                p pVar = p.f3034a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (remove != null) {
            entryRemoved(false, k3, remove, null);
        }
        return remove;
    }

    public void resize(int i) {
        if (!(i > 0)) {
            Q.a.c("maxSize <= 0");
            throw null;
        }
        synchronized (this.lock) {
            this.maxSize = i;
            p pVar = p.f3034a;
        }
        trimToSize(i);
    }

    public final int size() {
        int i;
        synchronized (this.lock) {
            i = this.size;
        }
        return i;
    }

    public int sizeOf(K k3, V v10) {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            linkedHashMap = new LinkedHashMap(this.map.f3178a.entrySet().size());
            Iterator<T> it = this.map.f3178a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i = this.hitCount;
                int i9 = this.missCount + i;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i9 != 0 ? (i * 100) / i9 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001e A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x0012, B:13:0x001e, B:15:0x0022, B:17:0x002d, B:19:0x0041, B:32:0x0066, B:33:0x006d), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trimToSize(int r7) {
        /*
            r6 = this;
        L0:
            Q.b r0 = r6.lock
            monitor-enter(r0)
            int r1 = r6.size     // Catch: java.lang.Throwable -> L17
            r2 = 1
            if (r1 < 0) goto L1b
            Q.c<K, V> r1 = r6.map     // Catch: java.lang.Throwable -> L17
            java.util.LinkedHashMap<K, V> r1 = r1.f3178a     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            int r1 = r6.size     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L1b
            goto L19
        L17:
            r7 = move-exception
            goto L6e
        L19:
            r1 = r2
            goto L1c
        L1b:
            r1 = 0
        L1c:
            if (r1 == 0) goto L66
            int r1 = r6.size     // Catch: java.lang.Throwable -> L17
            if (r1 <= r7) goto L64
            Q.c<K, V> r1 = r6.map     // Catch: java.lang.Throwable -> L17
            java.util.LinkedHashMap<K, V> r1 = r1.f3178a     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L2d
            goto L64
        L2d:
            Q.c<K, V> r1 = r6.map     // Catch: java.lang.Throwable -> L17
            java.util.LinkedHashMap<K, V> r1 = r1.f3178a     // Catch: java.lang.Throwable -> L17
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L17
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = P9.s.K(r1)     // Catch: java.lang.Throwable -> L17
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L41
            monitor-exit(r0)
            return
        L41:
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L17
            Q.c<K, V> r4 = r6.map     // Catch: java.lang.Throwable -> L17
            java.util.LinkedHashMap<K, V> r4 = r4.f3178a     // Catch: java.lang.Throwable -> L17
            r4.remove(r3)     // Catch: java.lang.Throwable -> L17
            int r4 = r6.size     // Catch: java.lang.Throwable -> L17
            int r5 = r6.safeSizeOf(r3, r1)     // Catch: java.lang.Throwable -> L17
            int r4 = r4 - r5
            r6.size = r4     // Catch: java.lang.Throwable -> L17
            int r4 = r6.evictionCount     // Catch: java.lang.Throwable -> L17
            int r4 = r4 + r2
            r6.evictionCount = r4     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            r0 = 0
            r6.entryRemoved(r2, r3, r1, r0)
            goto L0
        L64:
            monitor-exit(r0)
            return
        L66:
            java.lang.String r7 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L17
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L17
            throw r1     // Catch: java.lang.Throwable -> L17
        L6e:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.f.trimToSize(int):void");
    }

    public void entryRemoved(boolean z10, K k3, V v10, V v11) {
    }
}
