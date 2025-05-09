package com.sumsub.sns.internal.core.common;

import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class k {
    public static final byte[] a(byte[] bArr, int i, byte[] bArr2, byte[] bArr3) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(bArr2, 16), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(i, secretKeySpec, new IvParameterSpec(bArr3));
        return cipher.doFinal(bArr);
    }

    public static final byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] a10 = a(16);
        byte[] a11 = a(bArr, 1, bArr2, a10);
        int length = a10.length;
        int length2 = a11.length;
        byte[] copyOf = Arrays.copyOf(a10, length + length2);
        System.arraycopy(a11, 0, copyOf, length, length2);
        return copyOf;
    }

    public static final byte[] a(int i) {
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }
}
