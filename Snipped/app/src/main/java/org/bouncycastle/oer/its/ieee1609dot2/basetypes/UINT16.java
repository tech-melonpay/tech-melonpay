package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

/* loaded from: classes3.dex */
public class UINT16 extends UintBase {
    private static final BigInteger MAX = BigInteger.valueOf(65535);

    public UINT16(int i) {
        super(i);
    }

    public static UINT16 getInstance(Object obj) {
        if (obj instanceof UINT16) {
            return (UINT16) obj;
        }
        if (obj != null) {
            return new UINT16(ASN1Integer.getInstance(obj));
        }
        return null;
    }

    public static UINT16 valueOf(int i) {
        return new UINT16(i);
    }

    @Override // org.bouncycastle.oer.its.ieee1609dot2.basetypes.UintBase
    public void assertLimit() {
        if (this.value.signum() < 0) {
            throw new IllegalArgumentException("value must not be negative");
        }
        BigInteger bigInteger = this.value;
        BigInteger bigInteger2 = MAX;
        if (bigInteger.compareTo(bigInteger2) <= 0) {
            return;
        }
        throw new IllegalArgumentException("value must not exceed " + bigInteger2.toString(16));
    }

    public UINT16(long j10) {
        super(j10);
    }

    public UINT16(BigInteger bigInteger) {
        super(bigInteger);
    }

    public UINT16(ASN1Integer aSN1Integer) {
        super(aSN1Integer);
    }
}
