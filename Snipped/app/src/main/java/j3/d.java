package j3;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.sf.scuba.smartcards.ISOFileInfo;

/* compiled from: AesSiv.java */
/* loaded from: classes.dex */
public final class d implements b3.c {

    /* renamed from: c, reason: collision with root package name */
    public static final List f22474c = Arrays.asList(64);

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f22475d = new byte[16];

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f22476e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public final Fa.h f22477a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f22478b;

    public d(byte[] bArr) {
        if (!f22474c.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(s3.b.m(new StringBuilder("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.f22478b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.f22477a = new Fa.h(copyOfRange);
    }

    @Override // b3.c
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher a10 = k.f22494e.a("AES/CTR/NoPadding");
        byte[] c2 = c(bArr2, bArr);
        byte[] bArr3 = (byte[]) c2.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        a10.init(1, new SecretKeySpec(this.f22478b, "AES"), new IvParameterSpec(bArr3));
        return e.h(c2, a10.doFinal(bArr));
    }

    @Override // b3.c
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher a10 = k.f22494e.a("AES/CTR/NoPadding");
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) copyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        a10.init(2, new SecretKeySpec(this.f22478b, "AES"), new IvParameterSpec(bArr3));
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] doFinal = a10.doFinal(copyOfRange2);
        if (copyOfRange2.length == 0 && doFinal == null && e.t()) {
            doFinal = new byte[0];
        }
        if (e.o(copyOfRange, c(bArr2, doFinal))) {
            return doFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    public final byte[] c(byte[]... bArr) {
        byte[] M8;
        int length = bArr.length;
        Fa.h hVar = this.f22477a;
        if (length == 0) {
            return hVar.a(16, f22476e);
        }
        byte[] a10 = hVar.a(16, f22475d);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            a10 = e.M(e.k(a10), hVar.a(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < a10.length) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int length2 = bArr3.length - a10.length;
            M8 = Arrays.copyOf(bArr3, bArr3.length);
            for (int i9 = 0; i9 < a10.length; i9++) {
                int i10 = length2 + i9;
                M8[i10] = (byte) (M8[i10] ^ a10[i9]);
            }
        } else {
            if (bArr3.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(bArr3, 16);
            copyOf[bArr3.length] = ISOFileInfo.DATA_BYTES1;
            M8 = e.M(copyOf, e.k(a10));
        }
        return hVar.a(16, M8);
    }
}
