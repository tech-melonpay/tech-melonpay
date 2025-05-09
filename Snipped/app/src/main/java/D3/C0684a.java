package d3;

import b3.InterfaceC0586a;
import j3.e;
import j3.k;
import j3.p;
import j3.q;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import s3.b;

/* compiled from: AesGcmSiv.java */
/* renamed from: d3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0684a implements InterfaceC0586a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0392a f20415b = new C0392a();

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f20416a;

    /* compiled from: AesGcmSiv.java */
    /* renamed from: d3.a$a, reason: collision with other inner class name */
    public class C0392a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        public final Cipher initialValue() {
            try {
                return k.f22494e.a("AES/GCM-SIV/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public C0684a(byte[] bArr) {
        q.a(bArr.length);
        this.f20416a = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec b(int i, byte[] bArr) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i);
        } catch (ClassNotFoundException unused) {
            if (e.t()) {
                return new IvParameterSpec(bArr, 0, i);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // b3.InterfaceC0586a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] a10 = p.a(12);
        System.arraycopy(a10, 0, bArr3, 0, 12);
        AlgorithmParameterSpec b9 = b(a10.length, a10);
        C0392a c0392a = f20415b;
        c0392a.get().init(1, this.f20416a, b9);
        if (bArr2 != null && bArr2.length != 0) {
            c0392a.get().updateAAD(bArr2);
        }
        int doFinal = c0392a.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (doFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(b.i("encryption failed; GCM tag must be 16 bytes, but got only ", doFinal - bArr.length, " bytes"));
    }

    @Override // b3.InterfaceC0586a
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec b9 = b(12, bArr);
        C0392a c0392a = f20415b;
        c0392a.get().init(2, this.f20416a, b9);
        if (bArr2 != null && bArr2.length != 0) {
            c0392a.get().updateAAD(bArr2);
        }
        return c0392a.get().doFinal(bArr, 12, bArr.length - 12);
    }
}
