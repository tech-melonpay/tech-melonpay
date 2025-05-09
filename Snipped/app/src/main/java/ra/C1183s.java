package ra;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* renamed from: ra.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1183s extends b0<double[]> {

    /* renamed from: a, reason: collision with root package name */
    public double[] f26430a;

    /* renamed from: b, reason: collision with root package name */
    public int f26431b;

    @Override // ra.b0
    public final double[] a() {
        return Arrays.copyOf(this.f26430a, this.f26431b);
    }

    @Override // ra.b0
    public final void b(int i) {
        double[] dArr = this.f26430a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f26430a = Arrays.copyOf(dArr, i);
        }
    }

    @Override // ra.b0
    public final int d() {
        return this.f26431b;
    }
}
