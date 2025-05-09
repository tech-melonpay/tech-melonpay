package ra;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* renamed from: ra.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1179n extends b0<char[]> {

    /* renamed from: a, reason: collision with root package name */
    public char[] f26416a;

    /* renamed from: b, reason: collision with root package name */
    public int f26417b;

    @Override // ra.b0
    public final char[] a() {
        return Arrays.copyOf(this.f26416a, this.f26417b);
    }

    @Override // ra.b0
    public final void b(int i) {
        char[] cArr = this.f26416a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f26416a = Arrays.copyOf(cArr, i);
        }
    }

    @Override // ra.b0
    public final int d() {
        return this.f26417b;
    }
}
