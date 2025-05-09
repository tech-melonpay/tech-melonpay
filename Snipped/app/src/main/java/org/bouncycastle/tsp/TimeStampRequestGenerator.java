package org.bouncycastle.tsp;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.tsp.MessageImprint;
import org.bouncycastle.asn1.tsp.TimeStampReq;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;

/* loaded from: classes3.dex */
public class TimeStampRequestGenerator {
    private ASN1Boolean certReq;
    private ExtensionsGenerator extGenerator = new ExtensionsGenerator();
    private ASN1ObjectIdentifier reqPolicy;

    public void addExtension(String str, boolean z10, ASN1Encodable aSN1Encodable) {
        addExtension(str, z10, aSN1Encodable.toASN1Primitive().getEncoded());
    }

    public TimeStampRequest generate(String str, byte[] bArr) {
        return generate(str, bArr, (BigInteger) null);
    }

    public void setCertReq(boolean z10) {
        this.certReq = ASN1Boolean.getInstance(z10);
    }

    public void setReqPolicy(String str) {
        this.reqPolicy = new ASN1ObjectIdentifier(str);
    }

    public void addExtension(String str, boolean z10, byte[] bArr) {
        this.extGenerator.addExtension(new ASN1ObjectIdentifier(str), z10, bArr);
    }

    public TimeStampRequest generate(String str, byte[] bArr, BigInteger bigInteger) {
        if (str == null) {
            throw new IllegalArgumentException("No digest algorithm specified");
        }
        MessageImprint messageImprint = new MessageImprint(new AlgorithmIdentifier(new ASN1ObjectIdentifier(str), DERNull.INSTANCE), bArr);
        Extensions generate = !this.extGenerator.isEmpty() ? this.extGenerator.generate() : null;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.reqPolicy;
        return bigInteger != null ? new TimeStampRequest(new TimeStampReq(messageImprint, aSN1ObjectIdentifier, new ASN1Integer(bigInteger), this.certReq, generate)) : new TimeStampRequest(new TimeStampReq(messageImprint, aSN1ObjectIdentifier, null, this.certReq, generate));
    }

    public void setReqPolicy(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.reqPolicy = aSN1ObjectIdentifier;
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, ASN1Encodable aSN1Encodable) {
        TSPUtil.addExtension(this.extGenerator, aSN1ObjectIdentifier, z10, aSN1Encodable);
    }

    public TimeStampRequest generate(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr) {
        return generate(aSN1ObjectIdentifier.getId(), bArr);
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, byte[] bArr) {
        this.extGenerator.addExtension(aSN1ObjectIdentifier, z10, bArr);
    }

    public TimeStampRequest generate(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr, BigInteger bigInteger) {
        return generate(aSN1ObjectIdentifier.getId(), bArr, bigInteger);
    }
}
