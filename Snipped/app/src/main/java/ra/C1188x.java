package ra;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* renamed from: ra.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1188x extends b0<float[]> {

    /* renamed from: a, reason: collision with root package name */
    public float[] f26451a;

    /* renamed from: b, reason: collision with root package name */
    public int f26452b;

    @Override // ra.b0
    public final float[] a() {
        return Arrays.copyOf(this.f26451a, this.f26452b);
    }

    @Override // ra.b0
    public final void b(int i) {
        float[] fArr = this.f26451a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f26451a = Arrays.copyOf(fArr, i);
        }
    }

    @Override // ra.b0
    public final int d() {
        return this.f26452b;
    }
}
