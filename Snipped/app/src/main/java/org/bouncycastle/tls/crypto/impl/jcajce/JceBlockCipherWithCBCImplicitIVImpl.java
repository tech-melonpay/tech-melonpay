package org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.impl.TlsBlockCipherImpl;

/* loaded from: classes3.dex */
public class JceBlockCipherWithCBCImplicitIVImpl implements TlsBlockCipherImpl {
    private static final int BUF_SIZE = 32768;
    private final String algorithm;
    private final Cipher cipher;
    private final boolean isEncrypting;
    private SecretKey key;
    private byte[] nextIV;

    public JceBlockCipherWithCBCImplicitIVImpl(Cipher cipher, String str, boolean z10) {
        this.cipher = cipher;
        this.algorithm = str;
        this.isEncrypting = z10;
    }

    @Override // org.bouncycastle.tls.crypto.impl.TlsBlockCipherImpl
    public int doFinal(byte[] bArr, int i, int i9, byte[] bArr2, int i10) {
        try {
            this.cipher.init(this.isEncrypting ? 1 : 2, this.key, new IvParameterSpec(this.nextIV));
            this.nextIV = null;
            if (!this.isEncrypting) {
                int i11 = i + i9;
                this.nextIV = TlsUtils.copyOfRangeExact(bArr, i11 - this.cipher.getBlockSize(), i11);
            }
            int i12 = 0;
            while (i9 > 32768) {
                i12 += this.cipher.update(bArr, i, 32768, bArr2, i10 + i12);
                i += 32768;
                i9 -= 32768;
            }
            int update = i12 + this.cipher.update(bArr, i, i9, bArr2, i10 + i12);
            int doFinal = update + this.cipher.doFinal(bArr2, i10 + update);
            if (this.isEncrypting) {
                int i13 = i10 + doFinal;
                this.nextIV = TlsUtils.copyOfRangeExact(bArr2, i13 - this.cipher.getBlockSize(), i13);
            }
            return doFinal;
        } catch (GeneralSecurityException e10) {
            throw Exceptions.illegalStateException(e10.getMessage(), e10);
        }
    }

    @Override // org.bouncycastle.tls.crypto.impl.TlsBlockCipherImpl
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.bouncycastle.tls.crypto.impl.TlsBlockCipherImpl
    public void init(byte[] bArr, int i, int i9) {
        if (this.nextIV != null) {
            throw new IllegalStateException("unexpected reinitialization of an implicit-IV cipher");
        }
        this.nextIV = TlsUtils.copyOfRangeExact(bArr, i, i9 + i);
    }

    @Override // org.bouncycastle.tls.crypto.impl.TlsBlockCipherImpl
    public void setKey(byte[] bArr, int i, int i9) {
        this.key = new SecretKeySpec(bArr, i, i9, this.algorithm);
    }
}
