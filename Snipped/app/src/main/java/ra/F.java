package ra;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes2.dex */
public final class F extends b0<int[]> {

    /* renamed from: a, reason: collision with root package name */
    public int[] f26350a;

    /* renamed from: b, reason: collision with root package name */
    public int f26351b;

    @Override // ra.b0
    public final int[] a() {
        return Arrays.copyOf(this.f26350a, this.f26351b);
    }

    @Override // ra.b0
    public final void b(int i) {
        int[] iArr = this.f26350a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f26350a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // ra.b0
    public final int d() {
        return this.f26351b;
    }
}
