package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

/* compiled from: UnknownFieldSetLite.java */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: f, reason: collision with root package name */
    public static final e0 f10210f = new e0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f10211a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f10212b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f10213c;

    /* renamed from: d, reason: collision with root package name */
    public int f10214d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10215e;

    public e0() {
        this(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int j02;
        int i = this.f10214d;
        if (i != -1) {
            return i;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f10211a; i10++) {
            int i11 = this.f10212b[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                j02 = CodedOutputStream.j0(i12, ((Long) this.f10213c[i10]).longValue());
            } else if (i13 == 1) {
                ((Long) this.f10213c[i10]).getClass();
                j02 = CodedOutputStream.T(i12);
            } else if (i13 == 2) {
                j02 = CodedOutputStream.O(i12, (ByteString) this.f10213c[i10]);
            } else if (i13 == 3) {
                i9 = ((e0) this.f10213c[i10]).a() + (CodedOutputStream.g0(i12) * 2) + i9;
            } else {
                if (i13 != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.b());
                }
                ((Integer) this.f10213c[i10]).getClass();
                j02 = CodedOutputStream.S(i12);
            }
            i9 = j02 + i9;
        }
        this.f10214d = i9;
        return i9;
    }

    public final void b(int i, Object obj) {
        if (!this.f10215e) {
            throw new UnsupportedOperationException();
        }
        int i9 = this.f10211a;
        int[] iArr = this.f10212b;
        if (i9 == iArr.length) {
            int i10 = i9 + (i9 < 4 ? 8 : i9 >> 1);
            this.f10212b = Arrays.copyOf(iArr, i10);
            this.f10213c = Arrays.copyOf(this.f10213c, i10);
        }
        int[] iArr2 = this.f10212b;
        int i11 = this.f10211a;
        iArr2[i11] = i;
        this.f10213c[i11] = obj;
        this.f10211a = i11 + 1;
    }

    public final void c(C0663j c0663j) {
        if (this.f10211a == 0) {
            return;
        }
        c0663j.getClass();
        for (int i = 0; i < this.f10211a; i++) {
            int i9 = this.f10212b[i];
            Object obj = this.f10213c[i];
            int i10 = i9 >>> 3;
            int i11 = i9 & 7;
            if (i11 == 0) {
                c0663j.j(i10, ((Long) obj).longValue());
            } else if (i11 == 1) {
                c0663j.f(i10, ((Long) obj).longValue());
            } else if (i11 == 2) {
                c0663j.b(i10, (ByteString) obj);
            } else if (i11 == 3) {
                CodedOutputStream codedOutputStream = c0663j.f10246a;
                codedOutputStream.y0(i10, 3);
                ((e0) obj).c(c0663j);
                codedOutputStream.y0(i10, 4);
            } else {
                if (i11 != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.b());
                }
                c0663j.e(i10, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        int i = this.f10211a;
        if (i == e0Var.f10211a) {
            int[] iArr = this.f10212b;
            int[] iArr2 = e0Var.f10212b;
            int i9 = 0;
            while (true) {
                if (i9 >= i) {
                    Object[] objArr = this.f10213c;
                    Object[] objArr2 = e0Var.f10213c;
                    int i10 = this.f10211a;
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (objArr[i11].equals(objArr2[i11])) {
                        }
                    }
                    return true;
                }
                if (iArr[i9] != iArr2[i9]) {
                    break;
                }
                i9++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f10211a;
        int i9 = (527 + i) * 31;
        int[] iArr = this.f10212b;
        int i10 = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i9 + i11) * 31;
        Object[] objArr = this.f10213c;
        int i14 = this.f10211a;
        for (int i15 = 0; i15 < i14; i15++) {
            i10 = (i10 * 31) + objArr[i15].hashCode();
        }
        return i13 + i10;
    }

    public e0(int i, int[] iArr, Object[] objArr, boolean z10) {
        this.f10214d = -1;
        this.f10211a = i;
        this.f10212b = iArr;
        this.f10213c = objArr;
        this.f10215e = z10;
    }
}
