package j3;

import h3.InterfaceC0795a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: PrfMac.java */
/* loaded from: classes.dex */
public final class o implements b3.k {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0795a f22503a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22504b;

    public o(InterfaceC0795a interfaceC0795a, int i) {
        this.f22503a = interfaceC0795a;
        this.f22504b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        interfaceC0795a.a(i, new byte[0]);
    }

    @Override // b3.k
    public final void a(byte[] bArr, byte[] bArr2) {
        if (!e.o(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // b3.k
    public final byte[] b(byte[] bArr) {
        return this.f22503a.a(this.f22504b, bArr);
    }
}
