package j3;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: AesCtrJceCipher.java */
/* loaded from: classes.dex */
public final class a implements m {

    /* renamed from: d, reason: collision with root package name */
    public static final C0416a f22462d = new C0416a();

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f22463a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22464b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22465c;

    /* compiled from: AesCtrJceCipher.java */
    /* renamed from: j3.a$a, reason: collision with other inner class name */
    public class C0416a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        public final Cipher initialValue() {
            try {
                return k.f22494e.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public a(byte[] bArr, int i) {
        q.a(bArr.length);
        this.f22463a = new SecretKeySpec(bArr, "AES");
        int blockSize = f22462d.get().getBlockSize();
        this.f22465c = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f22464b = i;
    }

    @Override // j3.m
    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i = this.f22464b;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        int length2 = bArr.length;
        int i9 = this.f22464b;
        byte[] bArr3 = new byte[length2 - i9];
        b(bArr, i9, bArr.length - i9, bArr3, 0, bArr2, false);
        return bArr3;
    }

    public final void b(byte[] bArr, int i, int i9, byte[] bArr2, int i10, byte[] bArr3, boolean z10) {
        Cipher cipher = f22462d.get();
        byte[] bArr4 = new byte[this.f22465c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f22464b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f22463a;
        if (z10) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i9, bArr2, i10) != i9) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    @Override // j3.m
    public final byte[] encrypt(byte[] bArr) {
        int length = bArr.length;
        int i = this.f22464b;
        int i9 = Integer.MAX_VALUE - i;
        if (length > i9) {
            throw new GeneralSecurityException(com.google.android.gms.measurement.internal.a.g(i9, "plaintext length can not exceed "));
        }
        byte[] bArr2 = new byte[bArr.length + i];
        byte[] a10 = p.a(i);
        System.arraycopy(a10, 0, bArr2, 0, i);
        b(bArr, 0, bArr.length, bArr2, this.f22464b, a10, true);
        return bArr2;
    }
}
