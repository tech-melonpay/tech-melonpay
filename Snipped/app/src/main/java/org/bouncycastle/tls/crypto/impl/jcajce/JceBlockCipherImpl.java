package org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.tls.crypto.impl.TlsBlockCipherImpl;

/* loaded from: classes3.dex */
public class JceBlockCipherImpl implements TlsBlockCipherImpl {
    private static final int BUF_SIZE = 32768;
    private final String algorithm;
    private final Cipher cipher;
    private final int cipherMode;
    private SecretKey key;
    private final int keySize;

    public JceBlockCipherImpl(Cipher cipher, String str, int i, boolean z10) {
        this.cipher = cipher;
        this.algorithm = str;
        this.keySize = i;
        this.cipherMode = z10 ? 1 : 2;
    }

    @Override // org.bouncycastle.tls.crypto.impl.TlsBlockCipherImpl
    public int doFinal(byte[] bArr, int i, int i9, byte[] bArr2, int i10) {
        int i11 = 0;
        while (i9 > 32768) {
            try {
                i11 += this.cipher.update(bArr, i, 32768, bArr2, i10 + i11);
                i += 32768;
                i9 -= 32768;
            } catch (GeneralSecurityException e10) {
                throw Exceptions.illegalStateException(e10.getMessage(), e10);
            }
        }
        int update = i11 + this.cipher.update(bArr, i, i9, bArr2, i10 + i11);
        return update + this.cipher.doFinal(bArr2, i10 + update);
    }

    @Override // org.bouncycastle.tls.crypto.impl.TlsBlockCipherImpl
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.bouncycastle.tls.crypto.impl.TlsBlockCipherImpl
    public void init(byte[] bArr, int i, int i9) {
        try {
            this.cipher.init(this.cipherMode, this.key, new IvParameterSpec(bArr, i, i9));
        } catch (GeneralSecurityException e10) {
            throw Exceptions.illegalStateException(e10.getMessage(), e10);
        }
    }

    @Override // org.bouncycastle.tls.crypto.impl.TlsBlockCipherImpl
    public void setKey(byte[] bArr, int i, int i9) {
        if (this.keySize != i9) {
            throw new IllegalStateException();
        }
        this.key = new SecretKeySpec(bArr, i, i9, this.algorithm);
    }
}
