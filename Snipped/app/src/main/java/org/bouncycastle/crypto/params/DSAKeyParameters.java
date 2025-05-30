package org.bouncycastle.crypto.params;

/* loaded from: classes2.dex */
public class DSAKeyParameters extends AsymmetricKeyParameter {
    private DSAParameters params;

    public DSAKeyParameters(boolean z10, DSAParameters dSAParameters) {
        super(z10);
        this.params = dSAParameters;
    }

    public DSAParameters getParameters() {
        return this.params;
    }
}
