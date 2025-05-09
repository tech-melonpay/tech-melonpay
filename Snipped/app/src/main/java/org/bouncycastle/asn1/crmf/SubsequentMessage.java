package org.bouncycastle.asn1.crmf;

import com.google.android.gms.measurement.internal.a;
import org.bouncycastle.asn1.ASN1Integer;

/* loaded from: classes2.dex */
public class SubsequentMessage extends ASN1Integer {
    public static final SubsequentMessage encrCert = new SubsequentMessage(0);
    public static final SubsequentMessage challengeResp = new SubsequentMessage(1);

    private SubsequentMessage(int i) {
        super(i);
    }

    public static SubsequentMessage valueOf(int i) {
        if (i == 0) {
            return encrCert;
        }
        if (i == 1) {
            return challengeResp;
        }
        throw new IllegalArgumentException(a.g(i, "unknown value: "));
    }
}
