package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes2.dex */
public class RSAEngine implements AsymmetricBlockCipher {
    private RSACoreEngine core;

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        return this.core.getInputBlockSize();
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        return this.core.getOutputBlockSize();
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (this.core == null) {
            this.core = new RSACoreEngine();
        }
        this.core.init(z10, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i, int i9) {
        RSACoreEngine rSACoreEngine = this.core;
        if (rSACoreEngine != null) {
            return rSACoreEngine.convertOutput(rSACoreEngine.processBlock(rSACoreEngine.convertInput(bArr, i, i9)));
        }
        throw new IllegalStateException("RSA engine not initialised");
    }
}
