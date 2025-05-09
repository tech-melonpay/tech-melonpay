package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.util.Encodable;

/* loaded from: classes3.dex */
public abstract class LMSKeyParameters extends AsymmetricKeyParameter implements Encodable {
    public LMSKeyParameters(boolean z10) {
        super(z10);
    }

    public abstract byte[] getEncoded();
}
