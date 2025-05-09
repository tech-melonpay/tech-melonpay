package org.bouncycastle.dvcs;

import C.v;
import java.io.OutputStream;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.operator.DigestCalculator;

/* loaded from: classes2.dex */
public class MessageImprintBuilder {
    private final DigestCalculator digestCalculator;

    public MessageImprintBuilder(DigestCalculator digestCalculator) {
        this.digestCalculator = digestCalculator;
    }

    public MessageImprint build(byte[] bArr) {
        try {
            OutputStream outputStream = this.digestCalculator.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return new MessageImprint(new DigestInfo(this.digestCalculator.getAlgorithmIdentifier(), this.digestCalculator.getDigest()));
        } catch (Exception e10) {
            throw new DVCSException(v.l(e10, new StringBuilder("unable to build MessageImprint: ")), e10);
        }
    }
}
