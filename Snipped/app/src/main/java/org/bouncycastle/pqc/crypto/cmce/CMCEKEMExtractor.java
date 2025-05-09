package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.crypto.EncapsulatedSecretExtractor;

/* loaded from: classes3.dex */
public class CMCEKEMExtractor implements EncapsulatedSecretExtractor {
    private CMCEEngine engine;
    private CMCEKeyParameters key;

    public CMCEKEMExtractor(CMCEPrivateKeyParameters cMCEPrivateKeyParameters) {
        this.key = cMCEPrivateKeyParameters;
        initCipher(cMCEPrivateKeyParameters.getParameters());
    }

    private void initCipher(CMCEParameters cMCEParameters) {
        this.engine = cMCEParameters.getEngine();
        CMCEPrivateKeyParameters cMCEPrivateKeyParameters = (CMCEPrivateKeyParameters) this.key;
        if (cMCEPrivateKeyParameters.getPrivateKey().length < this.engine.getPrivateKeySize()) {
            this.key = new CMCEPrivateKeyParameters(cMCEPrivateKeyParameters.getParameters(), this.engine.decompress_private_key(cMCEPrivateKeyParameters.getPrivateKey()));
        }
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public byte[] extractSecret(byte[] bArr) {
        return extractSecret(bArr, this.engine.getDefaultSessionKeySize());
    }

    public int getInputSize() {
        return this.engine.getCipherTextSize();
    }

    public byte[] extractSecret(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i / 8];
        this.engine.kem_dec(bArr2, bArr, ((CMCEPrivateKeyParameters) this.key).getPrivateKey());
        return bArr2;
    }
}
