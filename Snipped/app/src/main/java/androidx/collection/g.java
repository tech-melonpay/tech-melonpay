package androidx.collection;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: SimpleArrayMap.kt */
/* loaded from: classes.dex */
public class g<K, V> {
    private Object[] array;
    private int[] hashes;
    private int size;

    public g() {
        this(0, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends V> T getOrDefaultInternal(Object obj, T t3) {
        int indexOfKey = indexOfKey(obj);
        return indexOfKey >= 0 ? (T) this.array[(indexOfKey << 1) + 1] : t3;
    }

    private final int indexOf(K k3, int i) {
        int i9 = this.size;
        if (i9 == 0) {
            return -1;
        }
        int a10 = Q.a.a(i9, i, this.hashes);
        if (a10 < 0) {
            return a10;
        }
        if (kotlin.jvm.internal.f.b(k3, this.array[a10 << 1])) {
            return a10;
        }
        int i10 = a10 + 1;
        while (i10 < i9 && this.hashes[i10] == i) {
            if (kotlin.jvm.internal.f.b(k3, this.array[i10 << 1])) {
                return i10;
            }
            i10++;
        }
        for (int i11 = a10 - 1; i11 >= 0 && this.hashes[i11] == i; i11--) {
            if (kotlin.jvm.internal.f.b(k3, this.array[i11 << 1])) {
                return i11;
            }
        }
        return ~i10;
    }

    private final int indexOfNull() {
        int i = this.size;
        if (i == 0) {
            return -1;
        }
        int a10 = Q.a.a(i, 0, this.hashes);
        if (a10 < 0) {
            return a10;
        }
        if (this.array[a10 << 1] == null) {
            return a10;
        }
        int i9 = a10 + 1;
        while (i9 < i && this.hashes[i9] == 0) {
            if (this.array[i9 << 1] == null) {
                return i9;
            }
            i9++;
        }
        for (int i10 = a10 - 1; i10 >= 0 && this.hashes[i10] == 0; i10--) {
            if (this.array[i10 << 1] == null) {
                return i10;
            }
        }
        return ~i9;
    }

    public final int __restricted$indexOfValue(V v10) {
        int i = this.size * 2;
        Object[] objArr = this.array;
        if (v10 == null) {
            for (int i9 = 1; i9 < i; i9 += 2) {
                if (objArr[i9] == null) {
                    return i9 >> 1;
                }
            }
            return -1;
        }
        for (int i10 = 1; i10 < i; i10 += 2) {
            if (kotlin.jvm.internal.f.b(v10, objArr[i10])) {
                return i10 >> 1;
            }
        }
        return -1;
    }

    public void clear() {
        if (this.size > 0) {
            this.hashes = Q.a.f3175a;
            this.array = Q.a.f3177c;
            this.size = 0;
        }
        if (this.size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K k3) {
        return indexOfKey(k3) >= 0;
    }

    public boolean containsValue(V v10) {
        return __restricted$indexOfValue(v10) >= 0;
    }

    public void ensureCapacity(int i) {
        int i9 = this.size;
        int[] iArr = this.hashes;
        if (iArr.length < i) {
            this.hashes = Arrays.copyOf(iArr, i);
            this.array = Arrays.copyOf(this.array, i * 2);
        }
        if (this.size != i9) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof g) {
                if (size() != ((g) obj).size()) {
                    return false;
                }
                g gVar = (g) obj;
                int i = this.size;
                for (int i9 = 0; i9 < i; i9++) {
                    K keyAt = keyAt(i9);
                    V valueAt = valueAt(i9);
                    Object obj2 = gVar.get(keyAt);
                    if (valueAt == null) {
                        if (obj2 != null || !gVar.containsKey(keyAt)) {
                            return false;
                        }
                    } else if (!kotlin.jvm.internal.f.b(valueAt, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i10 = this.size;
            for (int i11 = 0; i11 < i10; i11++) {
                K keyAt2 = keyAt(i11);
                V valueAt2 = valueAt(i11);
                Object obj3 = ((Map) obj).get(keyAt2);
                if (valueAt2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(keyAt2)) {
                        return false;
                    }
                } else if (!kotlin.jvm.internal.f.b(valueAt2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public V get(K k3) {
        int indexOfKey = indexOfKey(k3);
        if (indexOfKey >= 0) {
            return (V) this.array[(indexOfKey << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(Object obj, V v10) {
        int indexOfKey = indexOfKey(obj);
        return indexOfKey >= 0 ? (V) this.array[(indexOfKey << 1) + 1] : v10;
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.array;
        int i = this.size;
        int i9 = 1;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            Object obj = objArr[i9];
            i11 += (obj != null ? obj.hashCode() : 0) ^ iArr[i10];
            i10++;
            i9 += 2;
        }
        return i11;
    }

    public int indexOfKey(K k3) {
        return k3 == null ? indexOfNull() : indexOf(k3, k3.hashCode());
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    public K keyAt(int i) {
        boolean z10 = false;
        if (i >= 0 && i < this.size) {
            z10 = true;
        }
        if (z10) {
            return (K) this.array[i << 1];
        }
        Q.a.c("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public V put(K k3, V v10) {
        int i = this.size;
        int hashCode = k3 != null ? k3.hashCode() : 0;
        int indexOf = k3 != null ? indexOf(k3, hashCode) : indexOfNull();
        if (indexOf >= 0) {
            int i9 = (indexOf << 1) + 1;
            Object[] objArr = this.array;
            V v11 = (V) objArr[i9];
            objArr[i9] = v10;
            return v11;
        }
        int i10 = ~indexOf;
        int[] iArr = this.hashes;
        if (i >= iArr.length) {
            int i11 = 8;
            if (i >= 8) {
                i11 = (i >> 1) + i;
            } else if (i < 4) {
                i11 = 4;
            }
            this.hashes = Arrays.copyOf(iArr, i11);
            this.array = Arrays.copyOf(this.array, i11 << 1);
            if (i != this.size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i10 < i) {
            int[] iArr2 = this.hashes;
            int i12 = i10 + 1;
            P9.i.d(i12, i10, iArr2, iArr2, i);
            Object[] objArr2 = this.array;
            P9.i.e(objArr2, objArr2, i12 << 1, i10 << 1, this.size << 1);
        }
        int i13 = this.size;
        if (i == i13) {
            int[] iArr3 = this.hashes;
            if (i10 < iArr3.length) {
                iArr3[i10] = hashCode;
                Object[] objArr3 = this.array;
                int i14 = i10 << 1;
                objArr3[i14] = k3;
                objArr3[i14 + 1] = v10;
                this.size = i13 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(g<? extends K, ? extends V> gVar) {
        int i = gVar.size;
        ensureCapacity(this.size + i);
        if (this.size != 0) {
            for (int i9 = 0; i9 < i; i9++) {
                put(gVar.keyAt(i9), gVar.valueAt(i9));
            }
        } else if (i > 0) {
            P9.i.d(0, 0, gVar.hashes, this.hashes, i);
            P9.i.e(gVar.array, this.array, 0, 0, i << 1);
            this.size = i;
        }
    }

    public V putIfAbsent(K k3, V v10) {
        V v11 = get(k3);
        return v11 == null ? put(k3, v10) : v11;
    }

    public V remove(K k3) {
        int indexOfKey = indexOfKey(k3);
        if (indexOfKey >= 0) {
            return removeAt(indexOfKey);
        }
        return null;
    }

    public V removeAt(int i) {
        if (!(i >= 0 && i < this.size)) {
            Q.a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        Object[] objArr = this.array;
        int i9 = i << 1;
        V v10 = (V) objArr[i9 + 1];
        int i10 = this.size;
        if (i10 <= 1) {
            clear();
        } else {
            int i11 = i10 - 1;
            int[] iArr = this.hashes;
            if (iArr.length <= 8 || i10 >= iArr.length / 3) {
                if (i < i11) {
                    int i12 = i + 1;
                    P9.i.d(i, i12, iArr, iArr, i10);
                    Object[] objArr2 = this.array;
                    P9.i.e(objArr2, objArr2, i9, i12 << 1, i10 << 1);
                }
                Object[] objArr3 = this.array;
                int i13 = i11 << 1;
                objArr3[i13] = null;
                objArr3[i13 + 1] = null;
            } else {
                int i14 = i10 > 8 ? i10 + (i10 >> 1) : 8;
                this.hashes = Arrays.copyOf(iArr, i14);
                this.array = Arrays.copyOf(this.array, i14 << 1);
                if (i10 != this.size) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    P9.i.d(0, 0, iArr, this.hashes, i);
                    P9.i.e(objArr, this.array, 0, 0, i9);
                }
                if (i < i11) {
                    int i15 = i + 1;
                    P9.i.d(i, i15, iArr, this.hashes, i10);
                    P9.i.e(objArr, this.array, i9, i15 << 1, i10 << 1);
                }
            }
            if (i10 != this.size) {
                throw new ConcurrentModificationException();
            }
            this.size = i11;
        }
        return v10;
    }

    public V replace(K k3, V v10) {
        int indexOfKey = indexOfKey(k3);
        if (indexOfKey >= 0) {
            return setValueAt(indexOfKey, v10);
        }
        return null;
    }

    public V setValueAt(int i, V v10) {
        boolean z10 = false;
        if (i >= 0 && i < this.size) {
            z10 = true;
        }
        if (!z10) {
            Q.a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        int i9 = (i << 1) + 1;
        Object[] objArr = this.array;
        V v11 = (V) objArr[i9];
        objArr[i9] = v10;
        return v11;
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.size * 28);
        sb2.append('{');
        int i = this.size;
        for (int i9 = 0; i9 < i; i9++) {
            if (i9 > 0) {
                sb2.append(", ");
            }
            K keyAt = keyAt(i9);
            if (keyAt != sb2) {
                sb2.append(keyAt);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V valueAt = valueAt(i9);
            if (valueAt != sb2) {
                sb2.append(valueAt);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public V valueAt(int i) {
        boolean z10 = false;
        if (i >= 0 && i < this.size) {
            z10 = true;
        }
        if (z10) {
            return (V) this.array[(i << 1) + 1];
        }
        Q.a.c("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public g(int i) {
        this.hashes = i == 0 ? Q.a.f3175a : new int[i];
        this.array = i == 0 ? Q.a.f3177c : new Object[i << 1];
    }

    public boolean remove(K k3, V v10) {
        int indexOfKey = indexOfKey(k3);
        if (indexOfKey < 0 || !kotlin.jvm.internal.f.b(v10, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public boolean replace(K k3, V v10, V v11) {
        int indexOfKey = indexOfKey(k3);
        if (indexOfKey < 0 || !kotlin.jvm.internal.f.b(v10, valueAt(indexOfKey))) {
            return false;
        }
        setValueAt(indexOfKey, v11);
        return true;
    }

    public /* synthetic */ g(int i, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0 : i);
    }

    public g(g<? extends K, ? extends V> gVar) {
        this(0, 1, null);
        if (gVar != null) {
            putAll(gVar);
        }
    }
}
