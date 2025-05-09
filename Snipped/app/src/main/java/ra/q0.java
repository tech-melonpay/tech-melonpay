package ra;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes2.dex */
public final class q0 extends b0<O9.j> {

    /* renamed from: a, reason: collision with root package name */
    public int[] f26426a;

    /* renamed from: b, reason: collision with root package name */
    public int f26427b;

    @Override // ra.b0
    public final O9.j a() {
        return new O9.j(Arrays.copyOf(this.f26426a, this.f26427b));
    }

    @Override // ra.b0
    public final void b(int i) {
        int[] iArr = this.f26426a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f26426a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // ra.b0
    public final int d() {
        return this.f26427b;
    }
}
