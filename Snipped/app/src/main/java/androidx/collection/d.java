package androidx.collection;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: LongSparseArray.jvm.kt */
/* loaded from: classes.dex */
public class d<E> implements Cloneable {
    public /* synthetic */ boolean garbage;
    public /* synthetic */ long[] keys;
    public /* synthetic */ int size;
    public /* synthetic */ Object[] values;

    public d() {
        this(0, 1, null);
    }

    public void append(long j10, E e10) {
        int i = this.size;
        if (i != 0 && j10 <= this.keys[i - 1]) {
            put(j10, e10);
            return;
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            if (i >= jArr.length) {
                Object[] objArr = this.values;
                int i9 = 0;
                for (int i10 = 0; i10 < i; i10++) {
                    Object obj = objArr[i10];
                    if (obj != e.f5897a) {
                        if (i10 != i9) {
                            jArr[i9] = jArr[i10];
                            objArr[i9] = obj;
                            objArr[i10] = null;
                        }
                        i9++;
                    }
                }
                this.garbage = false;
                this.size = i9;
            }
        }
        int i11 = this.size;
        if (i11 >= this.keys.length) {
            int i12 = (i11 + 1) * 8;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 8;
            this.keys = Arrays.copyOf(this.keys, i15);
            this.values = Arrays.copyOf(this.values, i15);
        }
        this.keys[i11] = j10;
        this.values[i11] = e10;
        this.size = i11 + 1;
    }

    public void clear() {
        int i = this.size;
        Object[] objArr = this.values;
        for (int i9 = 0; i9 < i; i9++) {
            objArr[i9] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    public boolean containsKey(long j10) {
        return indexOfKey(j10) >= 0;
    }

    public boolean containsValue(E e10) {
        return indexOfValue(e10) >= 0;
    }

    public void delete(long j10) {
        int b9 = Q.a.b(j10, this.keys, this.size);
        if (b9 >= 0) {
            Object[] objArr = this.values;
            Object obj = objArr[b9];
            Object obj2 = e.f5897a;
            if (obj != obj2) {
                objArr[b9] = obj2;
                this.garbage = true;
            }
        }
    }

    public E get(long j10) {
        E e10;
        int b9 = Q.a.b(j10, this.keys, this.size);
        if (b9 < 0 || (e10 = (E) this.values[b9]) == e.f5897a) {
            return null;
        }
        return e10;
    }

    public int indexOfKey(long j10) {
        if (this.garbage) {
            int i = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i9 = 0;
            for (int i10 = 0; i10 < i; i10++) {
                Object obj = objArr[i10];
                if (obj != e.f5897a) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.garbage = false;
            this.size = i9;
        }
        return Q.a.b(j10, this.keys, this.size);
    }

    public int indexOfValue(E e10) {
        if (this.garbage) {
            int i = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i9 = 0;
            for (int i10 = 0; i10 < i; i10++) {
                Object obj = objArr[i10];
                if (obj != e.f5897a) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.garbage = false;
            this.size = i9;
        }
        int i11 = this.size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.values[i12] == e10) {
                return i12;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public long keyAt(int i) {
        if (!(i >= 0 && i < this.size)) {
            Q.a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.garbage) {
            int i9 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                Object obj = objArr[i11];
                if (obj != e.f5897a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.garbage = false;
            this.size = i10;
        }
        return this.keys[i];
    }

    public void put(long j10, E e10) {
        int b9 = Q.a.b(j10, this.keys, this.size);
        if (b9 >= 0) {
            this.values[b9] = e10;
            return;
        }
        int i = ~b9;
        int i9 = this.size;
        Object obj = e.f5897a;
        if (i < i9) {
            Object[] objArr = this.values;
            if (objArr[i] == obj) {
                this.keys[i] = j10;
                objArr[i] = e10;
                return;
            }
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            if (i9 >= jArr.length) {
                Object[] objArr2 = this.values;
                int i10 = 0;
                for (int i11 = 0; i11 < i9; i11++) {
                    Object obj2 = objArr2[i11];
                    if (obj2 != obj) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr2[i10] = obj2;
                            objArr2[i11] = null;
                        }
                        i10++;
                    }
                }
                this.garbage = false;
                this.size = i10;
                i = ~Q.a.b(j10, this.keys, i10);
            }
        }
        int i12 = this.size;
        if (i12 >= this.keys.length) {
            int i13 = (i12 + 1) * 8;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 8;
            this.keys = Arrays.copyOf(this.keys, i16);
            this.values = Arrays.copyOf(this.values, i16);
        }
        int i17 = this.size - i;
        if (i17 != 0) {
            long[] jArr2 = this.keys;
            int i18 = i + 1;
            System.arraycopy(jArr2, i, jArr2, i18, i17);
            Object[] objArr3 = this.values;
            P9.i.e(objArr3, objArr3, i18, i, this.size);
        }
        this.keys[i] = j10;
        this.values[i] = e10;
        this.size++;
    }

    public void putAll(d<? extends E> dVar) {
        int size = dVar.size();
        for (int i = 0; i < size; i++) {
            put(dVar.keyAt(i), dVar.valueAt(i));
        }
    }

    public E putIfAbsent(long j10, E e10) {
        E e11 = get(j10);
        if (e11 == null) {
            put(j10, e10);
        }
        return e11;
    }

    public void remove(long j10) {
        int b9 = Q.a.b(j10, this.keys, this.size);
        if (b9 >= 0) {
            Object[] objArr = this.values;
            Object obj = objArr[b9];
            Object obj2 = e.f5897a;
            if (obj != obj2) {
                objArr[b9] = obj2;
                this.garbage = true;
            }
        }
    }

    public void removeAt(int i) {
        Object[] objArr = this.values;
        Object obj = objArr[i];
        Object obj2 = e.f5897a;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.garbage = true;
        }
    }

    public E replace(long j10, E e10) {
        int indexOfKey = indexOfKey(j10);
        if (indexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.values;
        E e11 = (E) objArr[indexOfKey];
        objArr[indexOfKey] = e10;
        return e11;
    }

    public void setValueAt(int i, E e10) {
        if (!(i >= 0 && i < this.size)) {
            Q.a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.garbage) {
            int i9 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                Object obj = objArr[i11];
                if (obj != e.f5897a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.garbage = false;
            this.size = i10;
        }
        this.values[i] = e10;
    }

    public int size() {
        if (this.garbage) {
            int i = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i9 = 0;
            for (int i10 = 0; i10 < i; i10++) {
                Object obj = objArr[i10];
                if (obj != e.f5897a) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.garbage = false;
            this.size = i9;
        }
        return this.size;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.size * 28);
        sb2.append('{');
        int i = this.size;
        for (int i9 = 0; i9 < i; i9++) {
            if (i9 > 0) {
                sb2.append(", ");
            }
            sb2.append(keyAt(i9));
            sb2.append('=');
            E valueAt = valueAt(i9);
            if (valueAt != sb2) {
                sb2.append(valueAt);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public E valueAt(int i) {
        if (!(i >= 0 && i < this.size)) {
            Q.a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.garbage) {
            int i9 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                Object obj = objArr[i11];
                if (obj != e.f5897a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.garbage = false;
            this.size = i10;
        }
        return (E) this.values[i];
    }

    public d(int i) {
        if (i == 0) {
            this.keys = Q.a.f3176b;
            this.values = Q.a.f3177c;
            return;
        }
        int i9 = i * 8;
        int i10 = 4;
        while (true) {
            if (i10 >= 32) {
                break;
            }
            int i11 = (1 << i10) - 12;
            if (i9 <= i11) {
                i9 = i11;
                break;
            }
            i10++;
        }
        int i12 = i9 / 8;
        this.keys = new long[i12];
        this.values = new Object[i12];
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public d<E> m1clone() {
        d<E> dVar = (d) super.clone();
        dVar.keys = (long[]) this.keys.clone();
        dVar.values = (Object[]) this.values.clone();
        return dVar;
    }

    public E get(long j10, E e10) {
        E e11;
        int b9 = Q.a.b(j10, this.keys, this.size);
        return (b9 < 0 || (e11 = (E) this.values[b9]) == e.f5897a) ? e10 : e11;
    }

    public boolean replace(long j10, E e10, E e11) {
        int indexOfKey = indexOfKey(j10);
        if (indexOfKey < 0 || !kotlin.jvm.internal.f.b(this.values[indexOfKey], e10)) {
            return false;
        }
        this.values[indexOfKey] = e11;
        return true;
    }

    public boolean remove(long j10, E e10) {
        int indexOfKey = indexOfKey(j10);
        if (indexOfKey < 0 || !kotlin.jvm.internal.f.b(e10, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public /* synthetic */ d(int i, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 10 : i);
    }
}
