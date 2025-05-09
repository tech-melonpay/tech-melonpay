package ra;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* renamed from: ra.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1173h extends b0<byte[]> {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f26399a;

    /* renamed from: b, reason: collision with root package name */
    public int f26400b;

    @Override // ra.b0
    public final byte[] a() {
        return Arrays.copyOf(this.f26399a, this.f26400b);
    }

    @Override // ra.b0
    public final void b(int i) {
        byte[] bArr = this.f26399a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f26399a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // ra.b0
    public final int d() {
        return this.f26400b;
    }
}
