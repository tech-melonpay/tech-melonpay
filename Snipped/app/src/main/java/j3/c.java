package j3;

import b3.InterfaceC0586a;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: AesGcmJce.java */
/* loaded from: classes.dex */
public final class c implements InterfaceC0586a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f22472b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f22473a;

    /* compiled from: AesGcmJce.java */
    public class a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        public final Cipher initialValue() {
            try {
                return k.f22494e.a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public c(byte[] bArr) {
        q.a(bArr.length);
        this.f22473a = new SecretKeySpec(bArr, "AES");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (java.lang.Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").getInt(null) <= 19) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.security.spec.AlgorithmParameterSpec b(int r3, byte[] r4) {
        /*
            boolean r0 = j3.e.t()
            r1 = 0
            if (r0 == 0) goto L22
            java.lang.String r0 = "android.os.Build$VERSION"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "SDK_INT"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L1c
            r2 = 0
            int r0 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L1c
            r2 = 19
            if (r0 > r2) goto L22
        L1c:
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec
            r0.<init>(r4, r1, r3)
            return r0
        L22:
            javax.crypto.spec.GCMParameterSpec r0 = new javax.crypto.spec.GCMParameterSpec
            r2 = 128(0x80, float:1.8E-43)
            r0.<init>(r2, r4, r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.c.b(int, byte[]):java.security.spec.AlgorithmParameterSpec");
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
        a aVar = f22472b;
        aVar.get().init(1, this.f22473a, b9);
        if (bArr2 != null && bArr2.length != 0) {
            aVar.get().updateAAD(bArr2);
        }
        int doFinal = aVar.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (doFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(s3.b.i("encryption failed; GCM tag must be 16 bytes, but got only ", doFinal - bArr.length, " bytes"));
    }

    @Override // b3.InterfaceC0586a
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec b9 = b(12, bArr);
        a aVar = f22472b;
        aVar.get().init(2, this.f22473a, b9);
        if (bArr2 != null && bArr2.length != 0) {
            aVar.get().updateAAD(bArr2);
        }
        return aVar.get().doFinal(bArr, 12, bArr.length - 12);
    }
}
