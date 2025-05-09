package ra;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes2.dex */
public final class n0 extends b0<O9.h> {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f26418a;

    /* renamed from: b, reason: collision with root package name */
    public int f26419b;

    @Override // ra.b0
    public final O9.h a() {
        return new O9.h(Arrays.copyOf(this.f26418a, this.f26419b));
    }

    @Override // ra.b0
    public final void b(int i) {
        byte[] bArr = this.f26418a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f26418a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // ra.b0
    public final int d() {
        return this.f26419b;
    }
}
