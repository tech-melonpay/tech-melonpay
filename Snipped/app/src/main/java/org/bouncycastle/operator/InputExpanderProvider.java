package org.bouncycastle.operator;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: classes3.dex */
public interface InputExpanderProvider {
    InputExpander get(AlgorithmIdentifier algorithmIdentifier);
}
