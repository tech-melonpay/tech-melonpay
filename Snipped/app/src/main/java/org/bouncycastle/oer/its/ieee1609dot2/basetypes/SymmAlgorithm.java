package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes3.dex */
public class SymmAlgorithm extends ASN1Enumerated {
    public static final SymmAlgorithm aes128Ccm = new SymmAlgorithm(BigInteger.ZERO);

    public SymmAlgorithm(BigInteger bigInteger) {
        super(bigInteger);
        assertValues();
    }

    public static SymmAlgorithm getInstance(Object obj) {
        if (obj instanceof SymmAlgorithm) {
            return (SymmAlgorithm) obj;
        }
        if (obj != null) {
            return new SymmAlgorithm(ASN1Enumerated.getInstance(obj));
        }
        return null;
    }

    public void assertValues() {
        if (BigIntegers.intValueExact(getValue()) == 0) {
            return;
        }
        throw new IllegalArgumentException("invalid enumeration value " + getValue());
    }

    private SymmAlgorithm(ASN1Enumerated aSN1Enumerated) {
        super(aSN1Enumerated.getValue());
        assertValues();
    }
}
