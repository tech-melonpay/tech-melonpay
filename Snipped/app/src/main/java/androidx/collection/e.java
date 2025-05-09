package androidx.collection;

import java.util.ConcurrentModificationException;

/* compiled from: LongSparseArray.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f5897a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f5898b = new Object();

    public static final void a(h hVar) {
        int i = hVar.f5902d;
        int[] iArr = hVar.f5900b;
        Object[] objArr = hVar.f5901c;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            Object obj = objArr[i10];
            if (obj != f5898b) {
                if (i10 != i9) {
                    iArr[i9] = iArr[i10];
                    objArr[i9] = obj;
                    objArr[i10] = null;
                }
                i9++;
            }
        }
        hVar.f5899a = false;
        hVar.f5902d = i9;
    }

    public static final int b(b bVar, Object obj, int i) {
        int i9 = bVar.f5892c;
        if (i9 == 0) {
            return -1;
        }
        try {
            int a10 = Q.a.a(i9, i, bVar.f5890a);
            if (a10 < 0) {
                return a10;
            }
            if (kotlin.jvm.internal.f.b(obj, bVar.f5891b[a10])) {
                return a10;
            }
            int i10 = a10 + 1;
            while (i10 < i9 && bVar.f5890a[i10] == i) {
                if (kotlin.jvm.internal.f.b(obj, bVar.f5891b[i10])) {
                    return i10;
                }
                i10++;
            }
            for (int i11 = a10 - 1; i11 >= 0 && bVar.f5890a[i11] == i; i11--) {
                if (kotlin.jvm.internal.f.b(obj, bVar.f5891b[i11])) {
                    return i11;
                }
            }
            return ~i10;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
