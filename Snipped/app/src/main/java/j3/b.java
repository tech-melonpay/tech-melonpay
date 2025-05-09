package j3;

import b3.InterfaceC0586a;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.sf.scuba.smartcards.ISOFileInfo;

/* compiled from: AesEaxJce.java */
/* loaded from: classes.dex */
public final class b implements InterfaceC0586a {

    /* renamed from: e, reason: collision with root package name */
    public static final a f22466e = new a();

    /* renamed from: f, reason: collision with root package name */
    public static final C0417b f22467f = new C0417b();

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f22468a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f22469b;

    /* renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f22470c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22471d;

    /* compiled from: AesEaxJce.java */
    public class a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        public final Cipher initialValue() {
            try {
                return k.f22494e.a("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    /* compiled from: AesEaxJce.java */
    /* renamed from: j3.b$b, reason: collision with other inner class name */
    public class C0417b extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        public final Cipher initialValue() {
            try {
                return k.f22494e.a("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public b(byte[] bArr, int i) {
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f22471d = i;
        q.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f22470c = secretKeySpec;
        Cipher cipher = f22466e.get();
        cipher.init(1, secretKeySpec);
        byte[] b9 = b(cipher.doFinal(new byte[16]));
        this.f22468a = b9;
        this.f22469b = b(b9);
    }

    public static byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            int i9 = i + 1;
            bArr2[i] = (byte) (((bArr[i] << 1) ^ ((bArr[i9] & 255) >>> 7)) & 255);
            i = i9;
        }
        bArr2[15] = (byte) ((bArr[15] << 1) ^ ((bArr[0] & ISOFileInfo.DATA_BYTES1) != 0 ? 135 : 0));
        return bArr2;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // b3.InterfaceC0586a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f22471d;
        if (length > 2147483631 - i) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + i + 16];
        byte[] a10 = p.a(i);
        System.arraycopy(a10, 0, bArr3, 0, i);
        Cipher cipher = f22466e.get();
        SecretKeySpec secretKeySpec = this.f22470c;
        cipher.init(1, secretKeySpec);
        byte[] c2 = c(cipher, 0, a10, 0, a10.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] c10 = c(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = f22467f.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(c2));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.f22471d);
        byte[] c11 = c(cipher, 2, bArr3, this.f22471d, bArr.length);
        int length2 = bArr.length + i;
        for (int i9 = 0; i9 < 16; i9++) {
            bArr3[length2 + i9] = (byte) ((c10[i9] ^ c2[i9]) ^ c11[i9]);
        }
        return bArr3;
    }

    public final byte[] c(Cipher cipher, int i, byte[] bArr, int i9, int i10) {
        byte[] copyOf;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        byte[] bArr3 = this.f22468a;
        if (i10 == 0) {
            return cipher.doFinal(d(bArr2, bArr3));
        }
        byte[] doFinal = cipher.doFinal(bArr2);
        int i11 = 0;
        while (i10 - i11 > 16) {
            for (int i12 = 0; i12 < 16; i12++) {
                doFinal[i12] = (byte) (doFinal[i12] ^ bArr[(i9 + i11) + i12]);
            }
            doFinal = cipher.doFinal(doFinal);
            i11 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i11 + i9, i9 + i10);
        if (copyOfRange.length == 16) {
            copyOf = d(copyOfRange, bArr3);
        } else {
            copyOf = Arrays.copyOf(this.f22469b, 16);
            for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                copyOf[i13] = (byte) (copyOf[i13] ^ copyOfRange[i13]);
            }
            copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ ISOFileInfo.DATA_BYTES1);
        }
        return cipher.doFinal(d(doFinal, copyOf));
    }

    @Override // b3.InterfaceC0586a
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f22471d;
        int i9 = (length - i) - 16;
        if (i9 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = f22466e.get();
        SecretKeySpec secretKeySpec = this.f22470c;
        cipher.init(1, secretKeySpec);
        byte[] c2 = c(cipher, 0, bArr, 0, this.f22471d);
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        byte[] c10 = c(cipher, 1, bArr3, 0, bArr3.length);
        byte[] c11 = c(cipher, 2, bArr, this.f22471d, i9);
        int length2 = bArr.length - 16;
        byte b9 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            b9 = (byte) (b9 | (((bArr[length2 + i10] ^ c10[i10]) ^ c2[i10]) ^ c11[i10]));
        }
        if (b9 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = f22467f.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(c2));
        return cipher2.doFinal(bArr, i, i9);
    }
}
