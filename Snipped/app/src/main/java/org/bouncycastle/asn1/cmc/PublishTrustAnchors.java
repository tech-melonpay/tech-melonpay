package org.bouncycastle.asn1.cmc;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class PublishTrustAnchors extends ASN1Object {
    private final ASN1Sequence anchorHashes;
    private final AlgorithmIdentifier hashAlgorithm;
    private final ASN1Integer seqNumber;

    public PublishTrustAnchors(BigInteger bigInteger, AlgorithmIdentifier algorithmIdentifier, byte[][] bArr) {
        this.seqNumber = new ASN1Integer(bigInteger);
        this.hashAlgorithm = algorithmIdentifier;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(bArr.length);
        for (int i = 0; i != bArr.length; i++) {
            aSN1EncodableVector.add(new DEROctetString(Arrays.clone(bArr[i])));
        }
        this.anchorHashes = new DERSequence(aSN1EncodableVector);
    }

    public static PublishTrustAnchors getInstance(Object obj) {
        if (obj instanceof PublishTrustAnchors) {
            return (PublishTrustAnchors) obj;
        }
        if (obj != null) {
            return new PublishTrustAnchors(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[][] getAnchorHashes() {
        int size = this.anchorHashes.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i != size; i++) {
            bArr[i] = a.A(this.anchorHashes, i);
        }
        return bArr;
    }

    public AlgorithmIdentifier getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public BigInteger getSeqNumber() {
        return this.seqNumber.getValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.seqNumber);
        aSN1EncodableVector.add(this.hashAlgorithm);
        aSN1EncodableVector.add(this.anchorHashes);
        return new DERSequence(aSN1EncodableVector);
    }

    private PublishTrustAnchors(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.seqNumber = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        this.hashAlgorithm = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.anchorHashes = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(2));
    }
}
