package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import s3.b;

/* loaded from: classes2.dex */
public class PKCS5S1ParametersGenerator extends PBEParametersGenerator {
    private Digest digest;

    public PKCS5S1ParametersGenerator(Digest digest) {
        this.digest = digest;
    }

    private byte[] generateDerivedKey() {
        int digestSize = this.digest.getDigestSize();
        byte[] bArr = new byte[digestSize];
        Digest digest = this.digest;
        byte[] bArr2 = this.password;
        digest.update(bArr2, 0, bArr2.length);
        Digest digest2 = this.digest;
        byte[] bArr3 = this.salt;
        digest2.update(bArr3, 0, bArr3.length);
        this.digest.doFinal(bArr, 0);
        for (int i = 1; i < this.iterationCount; i++) {
            this.digest.update(bArr, 0, digestSize);
            this.digest.doFinal(bArr, 0);
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedMacParameters(int i) {
        return generateDerivedParameters(i);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i) {
        int i9 = i / 8;
        if (i9 <= this.digest.getDigestSize()) {
            return new KeyParameter(generateDerivedKey(), 0, i9);
        }
        throw new IllegalArgumentException(b.i("Can't generate a derived key ", i9, " bytes long."));
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i, int i9) {
        int i10 = i / 8;
        int i11 = i9 / 8;
        int i12 = i10 + i11;
        if (i12 > this.digest.getDigestSize()) {
            throw new IllegalArgumentException(b.i("Can't generate a derived key ", i12, " bytes long."));
        }
        byte[] generateDerivedKey = generateDerivedKey();
        return new ParametersWithIV(new KeyParameter(generateDerivedKey, 0, i10), generateDerivedKey, i10, i11);
    }
}
