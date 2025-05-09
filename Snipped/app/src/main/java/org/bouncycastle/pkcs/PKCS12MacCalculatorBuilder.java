package org.bouncycastle.pkcs;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.MacCalculator;

/* loaded from: classes3.dex */
public interface PKCS12MacCalculatorBuilder {
    MacCalculator build(char[] cArr);

    AlgorithmIdentifier getDigestAlgorithmIdentifier();
}
