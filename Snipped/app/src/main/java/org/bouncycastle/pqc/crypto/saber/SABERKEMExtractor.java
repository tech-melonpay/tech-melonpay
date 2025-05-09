package org.bouncycastle.pqc.crypto.saber;

import org.bouncycastle.crypto.EncapsulatedSecretExtractor;

/* loaded from: classes3.dex */
public class SABERKEMExtractor implements EncapsulatedSecretExtractor {
    private SABEREngine engine;
    private SABERKeyParameters key;

    public SABERKEMExtractor(SABERKeyParameters sABERKeyParameters) {
        this.key = sABERKeyParameters;
        initCipher(sABERKeyParameters.getParameters());
    }

    private void initCipher(SABERParameters sABERParameters) {
        this.engine = sABERParameters.getEngine();
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public byte[] extractSecret(byte[] bArr) {
        byte[] bArr2 = new byte[this.engine.getSessionKeySize()];
        this.engine.crypto_kem_dec(bArr2, bArr, ((SABERPrivateKeyParameters) this.key).getPrivateKey());
        return bArr2;
    }

    public int getInputSize() {
        return this.engine.getCipherTextSize();
    }
}
