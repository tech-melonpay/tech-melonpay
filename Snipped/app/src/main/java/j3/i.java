package j3;

import b3.InterfaceC0586a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

/* compiled from: ChaCha20Poly1305.java */
/* loaded from: classes.dex */
public final class i implements InterfaceC0586a {

    /* renamed from: a, reason: collision with root package name */
    public final h f22486a;

    /* renamed from: b, reason: collision with root package name */
    public final h f22487b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22488c;

    public i(byte[] bArr, int i) {
        this.f22488c = i;
        this.f22486a = c(1, bArr);
        this.f22487b = c(0, bArr);
    }

    public static byte[] b(ByteBuffer byteBuffer, byte[] bArr) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int remaining = byteBuffer.remaining();
        int i = remaining % 16;
        int i9 = (i == 0 ? remaining : (remaining + 16) - i) + length;
        ByteBuffer order = ByteBuffer.allocate(i9 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i9);
        order.putLong(bArr.length);
        order.putLong(remaining);
        return order.array();
    }

    @Override // b3.InterfaceC0586a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        h hVar = this.f22486a;
        if (length > 2147483631 - hVar.f()) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer allocate = ByteBuffer.allocate(hVar.f() + bArr.length + 16);
        if (allocate.remaining() < hVar.f() + bArr.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = allocate.position();
        hVar.e(allocate, bArr);
        allocate.position(position);
        byte[] bArr3 = new byte[hVar.f()];
        allocate.get(bArr3);
        allocate.limit(allocate.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr4 = new byte[32];
        this.f22487b.b(0, bArr3).get(bArr4);
        byte[] g10 = e.g(bArr4, b(allocate, bArr2));
        allocate.limit(allocate.limit() + 16);
        allocate.put(g10);
        return allocate.array();
    }

    public final h c(int i, byte[] bArr) {
        switch (this.f22488c) {
            case 0:
                return new g(bArr, i);
            default:
                return new r(bArr, i);
        }
    }

    @Override // b3.InterfaceC0586a
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int remaining = wrap.remaining();
        h hVar = this.f22486a;
        if (remaining < hVar.f() + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int position = wrap.position();
        byte[] bArr3 = new byte[16];
        wrap.position(wrap.limit() - 16);
        wrap.get(bArr3);
        wrap.position(position);
        wrap.limit(wrap.limit() - 16);
        byte[] bArr4 = new byte[hVar.f()];
        wrap.get(bArr4);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr5 = new byte[32];
            this.f22487b.b(0, bArr4).get(bArr5);
            if (!e.o(e.g(bArr5, b(wrap, bArr2)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            wrap.position(position);
            return hVar.d(wrap);
        } catch (GeneralSecurityException e10) {
            throw new AEADBadTagException(e10.toString());
        }
    }
}
