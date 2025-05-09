package ra;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes2.dex */
public final class j0 extends b0<short[]> {

    /* renamed from: a, reason: collision with root package name */
    public short[] f26407a;

    /* renamed from: b, reason: collision with root package name */
    public int f26408b;

    @Override // ra.b0
    public final short[] a() {
        return Arrays.copyOf(this.f26407a, this.f26408b);
    }

    @Override // ra.b0
    public final void b(int i) {
        short[] sArr = this.f26407a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f26407a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // ra.b0
    public final int d() {
        return this.f26408b;
    }
}
