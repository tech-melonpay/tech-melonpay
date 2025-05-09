package kotlin.enums;

import C.v;
import P9.AbstractC0500b;
import java.io.Serializable;
import java.lang.Enum;

/* compiled from: EnumEntries.kt */
/* loaded from: classes2.dex */
final class EnumEntriesList<T extends Enum<T>> extends AbstractC0500b<T> implements W9.a<T>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final T[] f23172a;

    public EnumEntriesList(T[] tArr) {
        this.f23172a = tArr;
    }

    private final Object writeReplace() {
        return new EnumEntriesSerializationProxy(this.f23172a);
    }

    @Override // P9.AbstractC0499a
    public final int a() {
        return this.f23172a.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    @Override // P9.AbstractC0499a, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Enum
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Enum r5 = (java.lang.Enum) r5
            int r0 = r5.ordinal()
            if (r0 < 0) goto L16
            T extends java.lang.Enum<T>[] r2 = r4.f23172a
            int r3 = r2.length
            if (r0 >= r3) goto L16
            r0 = r2[r0]
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 != r5) goto L1a
            r1 = 1
        L1a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.enums.EnumEntriesList.contains(java.lang.Object):boolean");
    }

    @Override // java.util.List
    public final Object get(int i) {
        T[] tArr = this.f23172a;
        int length = tArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(v.k(i, length, "index: ", ", size: "));
        }
        return tArr[i];
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // P9.AbstractC0500b, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int indexOf(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Enum
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Enum r5 = (java.lang.Enum) r5
            int r0 = r5.ordinal()
            if (r0 < 0) goto L16
            T extends java.lang.Enum<T>[] r2 = r4.f23172a
            int r3 = r2.length
            if (r0 >= r3) goto L16
            r2 = r2[r0]
            goto L17
        L16:
            r2 = 0
        L17:
            if (r2 != r5) goto L1a
            r1 = r0
        L1a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.enums.EnumEntriesList.indexOf(java.lang.Object):int");
    }

    @Override // P9.AbstractC0500b, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((Enum) obj);
        }
        return -1;
    }
}
