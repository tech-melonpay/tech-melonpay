package ra;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes2.dex */
public final class t0 extends b0<O9.l> {

    /* renamed from: a, reason: collision with root package name */
    public long[] f26435a;

    /* renamed from: b, reason: collision with root package name */
    public int f26436b;

    @Override // ra.b0
    public final O9.l a() {
        return new O9.l(Arrays.copyOf(this.f26435a, this.f26436b));
    }

    @Override // ra.b0
    public final void b(int i) {
        long[] jArr = this.f26435a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f26435a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // ra.b0
    public final int d() {
        return this.f26436b;
    }
}
