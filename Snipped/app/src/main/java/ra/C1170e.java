package ra;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* renamed from: ra.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1170e extends b0<boolean[]> {

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f26389a;

    /* renamed from: b, reason: collision with root package name */
    public int f26390b;

    @Override // ra.b0
    public final boolean[] a() {
        return Arrays.copyOf(this.f26389a, this.f26390b);
    }

    @Override // ra.b0
    public final void b(int i) {
        boolean[] zArr = this.f26389a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f26389a = Arrays.copyOf(zArr, i);
        }
    }

    @Override // ra.b0
    public final int d() {
        return this.f26390b;
    }
}
