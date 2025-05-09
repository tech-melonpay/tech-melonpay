package org.bouncycastle.cms;

/* loaded from: classes2.dex */
public interface SignerInformationVerifierProvider {
    SignerInformationVerifier get(SignerId signerId);
}
