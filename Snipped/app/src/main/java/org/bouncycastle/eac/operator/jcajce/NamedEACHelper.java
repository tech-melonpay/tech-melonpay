package org.bouncycastle.eac.operator.jcajce;

import java.security.Signature;

/* loaded from: classes2.dex */
class NamedEACHelper extends EACHelper {
    private final String providerName;

    public NamedEACHelper(String str) {
        this.providerName = str;
    }

    @Override // org.bouncycastle.eac.operator.jcajce.EACHelper
    public Signature createSignature(String str) {
        return Signature.getInstance(str, this.providerName);
    }
}
