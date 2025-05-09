package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KDFParameters;

/* loaded from: classes2.dex */
public class BrokenKDF2BytesGenerator implements DerivationFunction {
    private Digest digest;
    private byte[] iv;
    private byte[] shared;

    public BrokenKDF2BytesGenerator(Digest digest) {
        this.digest = digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i9) {
        if (bArr.length - i9 < i) {
            throw new OutputLengthException("output buffer too small");
        }
        long j10 = i9 * 8;
        if (j10 > this.digest.getDigestSize() * 17179869184L) {
            throw new IllegalArgumentException("Output length too large");
        }
        int digestSize = (int) (j10 / this.digest.getDigestSize());
        int digestSize2 = this.digest.getDigestSize();
        byte[] bArr2 = new byte[digestSize2];
        for (int i10 = 1; i10 <= digestSize; i10++) {
            Digest digest = this.digest;
            byte[] bArr3 = this.shared;
            digest.update(bArr3, 0, bArr3.length);
            this.digest.update((byte) (i10 & 255));
            this.digest.update((byte) ((i10 >> 8) & 255));
            this.digest.update((byte) ((i10 >> 16) & 255));
            this.digest.update((byte) ((i10 >> 24) & 255));
            Digest digest2 = this.digest;
            byte[] bArr4 = this.iv;
            digest2.update(bArr4, 0, bArr4.length);
            this.digest.doFinal(bArr2, 0);
            int i11 = i9 - i;
            if (i11 > digestSize2) {
                System.arraycopy(bArr2, 0, bArr, i, digestSize2);
                i += digestSize2;
            } else {
                System.arraycopy(bArr2, 0, bArr, i, i11);
            }
        }
        this.digest.reset();
        return i9;
    }

    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof KDFParameters)) {
            throw new IllegalArgumentException("KDF parameters required for generator");
        }
        KDFParameters kDFParameters = (KDFParameters) derivationParameters;
        this.shared = kDFParameters.getSharedSecret();
        this.iv = kDFParameters.getIV();
    }
}
