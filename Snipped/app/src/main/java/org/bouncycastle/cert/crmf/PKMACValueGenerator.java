package org.bouncycastle.cert.crmf;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.crmf.PKMACValue;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.operator.MacCalculator;

/* loaded from: classes2.dex */
class PKMACValueGenerator {
    private PKMACBuilder builder;

    public PKMACValueGenerator(PKMACBuilder pKMACBuilder) {
        this.builder = pKMACBuilder;
    }

    public PKMACValue generate(char[] cArr, SubjectPublicKeyInfo subjectPublicKeyInfo) {
        MacCalculator build = this.builder.build(cArr);
        OutputStream outputStream = build.getOutputStream();
        try {
            outputStream.write(subjectPublicKeyInfo.getEncoded(ASN1Encoding.DER));
            outputStream.close();
            return new PKMACValue(build.getAlgorithmIdentifier(), new DERBitString(build.getMac()));
        } catch (IOException e10) {
            throw new CRMFException(a.b(e10, new StringBuilder("exception encoding mac input: ")), e10);
        }
    }
}
