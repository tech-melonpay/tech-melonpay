package kotlin.collections.builders;

import da.InterfaceC0701a;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: MapBuilder.kt */
/* loaded from: classes2.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, da.c {

    /* renamed from: n, reason: collision with root package name */
    public static final MapBuilder f23124n;

    /* renamed from: a, reason: collision with root package name */
    public K[] f23125a;

    /* renamed from: b, reason: collision with root package name */
    public V[] f23126b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f23127c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f23128d;

    /* renamed from: e, reason: collision with root package name */
    public int f23129e;

    /* renamed from: f, reason: collision with root package name */
    public int f23130f;

    /* renamed from: g, reason: collision with root package name */
    public int f23131g;

    /* renamed from: h, reason: collision with root package name */
    public int f23132h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public kotlin.collections.builders.b<K> f23133j;

    /* renamed from: k, reason: collision with root package name */
    public kotlin.collections.builders.c<V> f23134k;

    /* renamed from: l, reason: collision with root package name */
    public kotlin.collections.builders.a<K, V> f23135l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f23136m;

    /* compiled from: MapBuilder.kt */
    public static final class a {
    }

    /* compiled from: MapBuilder.kt */
    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC0701a {
        @Override // java.util.Iterator
        public final Object next() {
            a();
            int i = this.f23141b;
            MapBuilder<K, V> mapBuilder = this.f23140a;
            if (i >= mapBuilder.f23130f) {
                throw new NoSuchElementException();
            }
            this.f23141b = i + 1;
            this.f23142c = i;
            c cVar = new c(mapBuilder, i);
            c();
            return cVar;
        }
    }

    /* compiled from: MapBuilder.kt */
    public static final class c<K, V> implements Map.Entry<K, V>, InterfaceC0701a {

        /* renamed from: a, reason: collision with root package name */
        public final MapBuilder<K, V> f23137a;

        /* renamed from: b, reason: collision with root package name */
        public final int f23138b;

        /* renamed from: c, reason: collision with root package name */
        public final int f23139c;

        public c(MapBuilder<K, V> mapBuilder, int i) {
            this.f23137a = mapBuilder;
            this.f23138b = i;
            this.f23139c = mapBuilder.f23132h;
        }

        public final void a() {
            if (this.f23137a.f23132h != this.f23139c) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (kotlin.jvm.internal.f.b(entry.getKey(), getKey()) && kotlin.jvm.internal.f.b(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            a();
            return this.f23137a.f23125a[this.f23138b];
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            a();
            return this.f23137a.f23126b[this.f23138b];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            a();
            MapBuilder<K, V> mapBuilder = this.f23137a;
            mapBuilder.d();
            V[] vArr = mapBuilder.f23126b;
            if (vArr == null) {
                int length = mapBuilder.f23125a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.".toString());
                }
                vArr = (V[]) new Object[length];
                mapBuilder.f23126b = vArr;
            }
            int i = this.f23138b;
            V v11 = vArr[i];
            vArr[i] = v10;
            return v11;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* compiled from: MapBuilder.kt */
    public static class d<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final MapBuilder<K, V> f23140a;

        /* renamed from: b, reason: collision with root package name */
        public int f23141b;

        /* renamed from: c, reason: collision with root package name */
        public int f23142c = -1;

        /* renamed from: d, reason: collision with root package name */
        public int f23143d;

        public d(MapBuilder<K, V> mapBuilder) {
            this.f23140a = mapBuilder;
            this.f23143d = mapBuilder.f23132h;
            c();
        }

        public final void a() {
            if (this.f23140a.f23132h != this.f23143d) {
                throw new ConcurrentModificationException();
            }
        }

        public final void c() {
            while (true) {
                int i = this.f23141b;
                MapBuilder<K, V> mapBuilder = this.f23140a;
                if (i >= mapBuilder.f23130f || mapBuilder.f23127c[i] >= 0) {
                    return;
                } else {
                    this.f23141b = i + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.f23141b < this.f23140a.f23130f;
        }

        public final void remove() {
            a();
            if (this.f23142c == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
            }
            MapBuilder<K, V> mapBuilder = this.f23140a;
            mapBuilder.d();
            mapBuilder.k(this.f23142c);
            this.f23142c = -1;
            this.f23143d = mapBuilder.f23132h;
        }
    }

    /* compiled from: MapBuilder.kt */
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, InterfaceC0701a {
        @Override // java.util.Iterator
        public final K next() {
            a();
            int i = this.f23141b;
            MapBuilder<K, V> mapBuilder = this.f23140a;
            if (i >= mapBuilder.f23130f) {
                throw new NoSuchElementException();
            }
            this.f23141b = i + 1;
            this.f23142c = i;
            K k3 = mapBuilder.f23125a[i];
            c();
            return k3;
        }
    }

    /* compiled from: MapBuilder.kt */
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, InterfaceC0701a {
        @Override // java.util.Iterator
        public final V next() {
            a();
            int i = this.f23141b;
            MapBuilder<K, V> mapBuilder = this.f23140a;
            if (i >= mapBuilder.f23130f) {
                throw new NoSuchElementException();
            }
            this.f23141b = i + 1;
            this.f23142c = i;
            V v10 = mapBuilder.f23126b[i];
            c();
            return v10;
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.f23136m = true;
        f23124n = mapBuilder;
    }

    public MapBuilder() {
        this(8);
    }

    private final Object writeReplace() {
        if (this.f23136m) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int a(K k3) {
        d();
        while (true) {
            int i = i(k3);
            int i9 = this.f23129e * 2;
            int length = this.f23128d.length / 2;
            if (i9 > length) {
                i9 = length;
            }
            int i10 = 0;
            while (true) {
                int[] iArr = this.f23128d;
                int i11 = iArr[i];
                if (i11 <= 0) {
                    int i12 = this.f23130f;
                    K[] kArr = this.f23125a;
                    if (i12 < kArr.length) {
                        int i13 = i12 + 1;
                        this.f23130f = i13;
                        kArr[i12] = k3;
                        this.f23127c[i12] = i;
                        iArr[i] = i13;
                        this.i++;
                        this.f23132h++;
                        if (i10 > this.f23129e) {
                            this.f23129e = i10;
                        }
                        return i12;
                    }
                    g(1);
                } else {
                    if (kotlin.jvm.internal.f.b(this.f23125a[i11 - 1], k3)) {
                        return -i11;
                    }
                    i10++;
                    if (i10 > i9) {
                        j(this.f23128d.length * 2);
                        break;
                    }
                    i = i == 0 ? this.f23128d.length - 1 : i - 1;
                }
            }
        }
    }

    public final MapBuilder c() {
        d();
        this.f23136m = true;
        return this.i > 0 ? this : f23124n;
    }

    @Override // java.util.Map
    public final void clear() {
        d();
        int i = this.f23130f - 1;
        if (i >= 0) {
            int i9 = 0;
            while (true) {
                int[] iArr = this.f23127c;
                int i10 = iArr[i9];
                if (i10 >= 0) {
                    this.f23128d[i10] = 0;
                    iArr[i9] = -1;
                }
                if (i9 == i) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        Ja.a.s(this.f23125a, 0, this.f23130f);
        V[] vArr = this.f23126b;
        if (vArr != null) {
            Ja.a.s(vArr, 0, this.f23130f);
        }
        this.i = 0;
        this.f23130f = 0;
        this.f23132h++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i = this.f23130f;
        while (true) {
            i--;
            if (i < 0) {
                break;
            }
            if (this.f23127c[i] >= 0 && kotlin.jvm.internal.f.b(this.f23126b[i], obj)) {
                if (i >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        if (this.f23136m) {
            throw new UnsupportedOperationException();
        }
    }

    public final void e(boolean z10) {
        int i;
        V[] vArr = this.f23126b;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i = this.f23130f;
            if (i9 >= i) {
                break;
            }
            int[] iArr = this.f23127c;
            int i11 = iArr[i9];
            if (i11 >= 0) {
                K[] kArr = this.f23125a;
                kArr[i10] = kArr[i9];
                if (vArr != null) {
                    vArr[i10] = vArr[i9];
                }
                if (z10) {
                    iArr[i10] = i11;
                    this.f23128d[i11] = i10 + 1;
                }
                i10++;
            }
            i9++;
        }
        Ja.a.s(this.f23125a, i10, i);
        if (vArr != null) {
            Ja.a.s(vArr, i10, this.f23130f);
        }
        this.f23130f = i10;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        kotlin.collections.builders.a<K, V> aVar = this.f23135l;
        if (aVar != null) {
            return aVar;
        }
        kotlin.collections.builders.a<K, V> aVar2 = new kotlin.collections.builders.a<>(this);
        this.f23135l = aVar2;
        return aVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.i != map.size() || !f(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f(Collection<?> collection) {
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int h9 = h(entry.getKey());
                    if (h9 >= 0 && kotlin.jvm.internal.f.b(this.f23126b[h9], entry.getValue())) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final void g(int i) {
        K[] kArr = this.f23125a;
        int length = kArr.length;
        int i9 = this.f23130f;
        int i10 = length - i9;
        int i11 = i9 - this.i;
        if (i10 < i && i10 + i11 >= i && i11 >= kArr.length / 4) {
            e(true);
            return;
        }
        int i12 = i9 + i;
        if (i12 < 0) {
            throw new OutOfMemoryError();
        }
        if (i12 > kArr.length) {
            int length2 = kArr.length;
            int i13 = length2 + (length2 >> 1);
            if (i13 - i12 < 0) {
                i13 = i12;
            }
            if (i13 - 2147483639 > 0) {
                i13 = i12 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.f23125a = (K[]) Arrays.copyOf(kArr, i13);
            V[] vArr = this.f23126b;
            this.f23126b = vArr != null ? (V[]) Arrays.copyOf(vArr, i13) : null;
            this.f23127c = Arrays.copyOf(this.f23127c, i13);
            int highestOneBit = Integer.highestOneBit((i13 >= 1 ? i13 : 1) * 3);
            if (highestOneBit > this.f23128d.length) {
                j(highestOneBit);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V get(Object obj) {
        int h9 = h(obj);
        if (h9 < 0) {
            return null;
        }
        return this.f23126b[h9];
    }

    public final int h(K k3) {
        int i = i(k3);
        int i9 = this.f23129e;
        while (true) {
            int i10 = this.f23128d[i];
            if (i10 == 0) {
                return -1;
            }
            if (i10 > 0) {
                int i11 = i10 - 1;
                if (kotlin.jvm.internal.f.b(this.f23125a[i11], k3)) {
                    return i11;
                }
            }
            i9--;
            if (i9 < 0) {
                return -1;
            }
            i = i == 0 ? this.f23128d.length - 1 : i - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        b bVar = new b(this);
        int i = 0;
        while (bVar.hasNext()) {
            int i9 = bVar.f23141b;
            MapBuilder<K, V> mapBuilder = bVar.f23140a;
            if (i9 >= mapBuilder.f23130f) {
                throw new NoSuchElementException();
            }
            bVar.f23141b = i9 + 1;
            bVar.f23142c = i9;
            K k3 = mapBuilder.f23125a[i9];
            int hashCode = k3 != null ? k3.hashCode() : 0;
            V v10 = mapBuilder.f23126b[bVar.f23142c];
            int hashCode2 = v10 != null ? v10.hashCode() : 0;
            bVar.c();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    public final int i(K k3) {
        return ((k3 != null ? k3.hashCode() : 0) * (-1640531527)) >>> this.f23131g;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.i == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f23127c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(int r6) {
        /*
            r5 = this;
            int r0 = r5.f23132h
            int r0 = r0 + 1
            r5.f23132h = r0
            int r0 = r5.f23130f
            int r1 = r5.i
            r2 = 0
            if (r0 <= r1) goto L10
            r5.e(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f23128d = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f23131g = r6
        L1c:
            int r6 = r5.f23130f
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            K[] r0 = r5.f23125a
            r0 = r0[r2]
            int r0 = r5.i(r0)
            int r1 = r5.f23129e
        L2c:
            int[] r3 = r5.f23128d
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f23127c
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.MapBuilder.j(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x001f->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r12) {
        /*
            r11 = this;
            K[] r0 = r11.f23125a
            r1 = 0
            r0[r12] = r1
            V[] r0 = r11.f23126b
            if (r0 == 0) goto Lb
            r0[r12] = r1
        Lb:
            int[] r0 = r11.f23127c
            r0 = r0[r12]
            int r1 = r11.f23129e
            int r1 = r1 * 2
            int[] r2 = r11.f23128d
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L1b
            r1 = r2
        L1b:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L1f:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L29
            int[] r0 = r11.f23128d
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2a
        L29:
            r0 = r5
        L2a:
            int r4 = r4 + 1
            int r5 = r11.f23129e
            r6 = -1
            if (r4 <= r5) goto L36
            int[] r0 = r11.f23128d
            r0[r1] = r2
            goto L67
        L36:
            int[] r5 = r11.f23128d
            r7 = r5[r0]
            if (r7 != 0) goto L3f
            r5[r1] = r2
            goto L67
        L3f:
            if (r7 >= 0) goto L46
            r5[r1] = r6
        L43:
            r1 = r0
            r4 = r2
            goto L60
        L46:
            K[] r5 = r11.f23125a
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.i(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f23128d
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L60
            r9[r1] = r7
            int[] r4 = r11.f23127c
            r4[r8] = r1
            goto L43
        L60:
            int r3 = r3 + r6
            if (r3 >= 0) goto L1f
            int[] r0 = r11.f23128d
            r0[r1] = r6
        L67:
            int[] r0 = r11.f23127c
            r0[r12] = r6
            int r12 = r11.i
            int r12 = r12 + r6
            r11.i = r12
            int r12 = r11.f23132h
            int r12 = r12 + 1
            r11.f23132h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.MapBuilder.k(int):void");
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        kotlin.collections.builders.b<K> bVar = this.f23133j;
        if (bVar != null) {
            return bVar;
        }
        kotlin.collections.builders.b<K> bVar2 = new kotlin.collections.builders.b<>(this);
        this.f23133j = bVar2;
        return bVar2;
    }

    @Override // java.util.Map
    public final V put(K k3, V v10) {
        d();
        int a10 = a(k3);
        V[] vArr = this.f23126b;
        if (vArr == null) {
            int length = this.f23125a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.".toString());
            }
            vArr = (V[]) new Object[length];
            this.f23126b = vArr;
        }
        if (a10 >= 0) {
            vArr[a10] = v10;
            return null;
        }
        int i = (-a10) - 1;
        V v11 = vArr[i];
        vArr[i] = v10;
        return v11;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        d();
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        g(entrySet.size());
        for (Map.Entry<? extends K, ? extends V> entry : entrySet) {
            int a10 = a(entry.getKey());
            V[] vArr = this.f23126b;
            if (vArr == null) {
                int length = this.f23125a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.".toString());
                }
                vArr = (V[]) new Object[length];
                this.f23126b = vArr;
            }
            if (a10 >= 0) {
                vArr[a10] = entry.getValue();
            } else {
                int i = (-a10) - 1;
                if (!kotlin.jvm.internal.f.b(entry.getValue(), vArr[i])) {
                    vArr[i] = entry.getValue();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V remove(Object obj) {
        d();
        int h9 = h(obj);
        if (h9 < 0) {
            return null;
        }
        V v10 = this.f23126b[h9];
        k(h9);
        return v10;
    }

    @Override // java.util.Map
    public final int size() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.i * 3) + 2);
        sb2.append("{");
        b bVar = new b(this);
        int i = 0;
        while (bVar.hasNext()) {
            if (i > 0) {
                sb2.append(", ");
            }
            int i9 = bVar.f23141b;
            MapBuilder<K, V> mapBuilder = bVar.f23140a;
            if (i9 >= mapBuilder.f23130f) {
                throw new NoSuchElementException();
            }
            bVar.f23141b = i9 + 1;
            bVar.f23142c = i9;
            K k3 = mapBuilder.f23125a[i9];
            if (k3 == mapBuilder) {
                sb2.append("(this Map)");
            } else {
                sb2.append(k3);
            }
            sb2.append('=');
            V v10 = mapBuilder.f23126b[bVar.f23142c];
            if (v10 == mapBuilder) {
                sb2.append("(this Map)");
            } else {
                sb2.append(v10);
            }
            bVar.c();
            i++;
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        kotlin.collections.builders.c<V> cVar = this.f23134k;
        if (cVar != null) {
            return cVar;
        }
        kotlin.collections.builders.c<V> cVar2 = new kotlin.collections.builders.c<>(this);
        this.f23134k = cVar2;
        return cVar2;
    }

    public MapBuilder(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.".toString());
        }
        K[] kArr = (K[]) new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f23125a = kArr;
        this.f23126b = null;
        this.f23127c = iArr;
        this.f23128d = new int[highestOneBit];
        this.f23129e = 2;
        this.f23130f = 0;
        this.f23131g = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
