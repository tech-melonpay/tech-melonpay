package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* loaded from: classes2.dex */
public class GMac implements Mac {
    private final GCMBlockCipher cipher;
    private final int macSizeBits;

    public GMac(GCMBlockCipher gCMBlockCipher) {
        this.cipher = gCMBlockCipher;
        this.macSizeBits = 128;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        try {
            return this.cipher.doFinal(bArr, i);
        } catch (InvalidCipherTextException e10) {
            throw new IllegalStateException(e10.toString());
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return this.cipher.getUnderlyingCipher().getAlgorithmName() + "-GMAC";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.macSizeBits / 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("GMAC requires ParametersWithIV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        this.cipher.init(true, new AEADParameters((KeyParameter) parametersWithIV.getParameters(), this.macSizeBits, iv));
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.cipher.reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b9) {
        this.cipher.processAADByte(b9);
    }

    public GMac(GCMBlockCipher gCMBlockCipher, int i) {
        this.cipher = gCMBlockCipher;
        this.macSizeBits = i;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i9) {
        this.cipher.processAADBytes(bArr, i, i9);
    }
}
