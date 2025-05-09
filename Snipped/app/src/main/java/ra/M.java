package ra;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes2.dex */
public final class M extends b0<long[]> {

    /* renamed from: a, reason: collision with root package name */
    public long[] f26361a;

    /* renamed from: b, reason: collision with root package name */
    public int f26362b;

    @Override // ra.b0
    public final long[] a() {
        return Arrays.copyOf(this.f26361a, this.f26362b);
    }

    @Override // ra.b0
    public final void b(int i) {
        long[] jArr = this.f26361a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f26361a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // ra.b0
    public final int d() {
        return this.f26362b;
    }
}
