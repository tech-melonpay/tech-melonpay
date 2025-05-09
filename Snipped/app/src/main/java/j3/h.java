package j3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;

/* compiled from: ChaCha20Base.java */
/* loaded from: classes.dex */
public abstract class h implements m {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f22483c = j(new byte[]{101, 120, ISO7816.INS_MANAGE_CHANNEL, 97, 110, ISOFileInfo.FMD_BYTE, ISO7816.INS_VERIFY, 51, ISO7816.INS_INCREASE, 45, ISOFileInfo.FCP_BYTE, 121, 116, 101, ISO7816.INS_VERIFY, 107});

    /* renamed from: a, reason: collision with root package name */
    public final int[] f22484a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22485b;

    public h(byte[] bArr, int i) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f22484a = j(bArr);
        this.f22485b = i;
    }

    public static void h(int[] iArr, int i, int i9, int i10, int i11) {
        int i12 = iArr[i] + iArr[i9];
        iArr[i] = i12;
        int i13 = i12 ^ iArr[i11];
        int i14 = (i13 >>> (-16)) | (i13 << 16);
        iArr[i11] = i14;
        int i15 = iArr[i10] + i14;
        iArr[i10] = i15;
        int i16 = iArr[i9] ^ i15;
        int i17 = (i16 >>> (-12)) | (i16 << 12);
        iArr[i9] = i17;
        int i18 = iArr[i] + i17;
        iArr[i] = i18;
        int i19 = iArr[i11] ^ i18;
        int i20 = (i19 >>> (-8)) | (i19 << 8);
        iArr[i11] = i20;
        int i21 = iArr[i10] + i20;
        iArr[i10] = i21;
        int i22 = iArr[i9] ^ i21;
        iArr[i9] = (i22 >>> (-7)) | (i22 << 7);
    }

    public static void i(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            h(iArr, 0, 4, 8, 12);
            h(iArr, 1, 5, 9, 13);
            h(iArr, 2, 6, 10, 14);
            h(iArr, 3, 7, 11, 15);
            h(iArr, 0, 5, 10, 15);
            h(iArr, 1, 6, 11, 12);
            h(iArr, 2, 7, 8, 13);
            h(iArr, 3, 4, 9, 14);
        }
    }

    public static int[] j(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    @Override // j3.m
    public final byte[] a(byte[] bArr) {
        return d(ByteBuffer.wrap(bArr));
    }

    public final ByteBuffer b(int i, byte[] bArr) {
        int[] c2 = c(i, j(bArr));
        int[] iArr = (int[]) c2.clone();
        i(iArr);
        for (int i9 = 0; i9 < c2.length; i9++) {
            c2[i9] = c2[i9] + iArr[i9];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(c2, 0, 16);
        return order;
    }

    public abstract int[] c(int i, int[] iArr);

    public final byte[] d(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < f()) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr = new byte[f()];
        byteBuffer.get(bArr);
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        g(bArr, allocate, byteBuffer);
        return allocate.array();
    }

    public final void e(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - f() < bArr.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        byte[] a10 = p.a(f());
        byteBuffer.put(a10);
        g(a10, byteBuffer, ByteBuffer.wrap(bArr));
    }

    @Override // j3.m
    public final byte[] encrypt(byte[] bArr) {
        if (bArr.length > Integer.MAX_VALUE - f()) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer allocate = ByteBuffer.allocate(f() + bArr.length);
        e(allocate, bArr);
        return allocate.array();
    }

    public abstract int f();

    public final void g(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int remaining = byteBuffer2.remaining();
        int i = remaining / 64;
        int i9 = i + 1;
        for (int i10 = 0; i10 < i9; i10++) {
            ByteBuffer b9 = b(this.f22485b + i10, bArr);
            if (i10 == i) {
                e.K(byteBuffer, byteBuffer2, b9, remaining % 64);
            } else {
                e.K(byteBuffer, byteBuffer2, b9, 64);
            }
        }
    }
}
