package j3;

import b3.InterfaceC0586a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: EncryptThenAuthenticate.java */
/* loaded from: classes.dex */
public final class j implements InterfaceC0586a {

    /* renamed from: a, reason: collision with root package name */
    public final m f22489a;

    /* renamed from: b, reason: collision with root package name */
    public final b3.k f22490b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22491c;

    public j(m mVar, b3.k kVar, int i) {
        this.f22489a = mVar;
        this.f22490b = kVar;
        this.f22491c = i;
    }

    @Override // b3.InterfaceC0586a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] encrypt = this.f22489a.encrypt(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return e.h(encrypt, this.f22490b.b(e.h(bArr2, encrypt, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // b3.InterfaceC0586a
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f22491c;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f22490b.a(copyOfRange2, e.h(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.f22489a.a(copyOfRange);
    }
}
