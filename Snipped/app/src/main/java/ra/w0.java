package ra;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes2.dex */
public final class w0 extends b0<O9.o> {

    /* renamed from: a, reason: collision with root package name */
    public short[] f26449a;

    /* renamed from: b, reason: collision with root package name */
    public int f26450b;

    @Override // ra.b0
    public final O9.o a() {
        return new O9.o(Arrays.copyOf(this.f26449a, this.f26450b));
    }

    @Override // ra.b0
    public final void b(int i) {
        short[] sArr = this.f26449a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f26449a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // ra.b0
    public final int d() {
        return this.f26450b;
    }
}
