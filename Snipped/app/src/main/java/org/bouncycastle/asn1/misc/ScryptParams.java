package org.bouncycastle.asn1.misc;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class ScryptParams extends ASN1Object {
    private final BigInteger blockSize;
    private final BigInteger costParameter;
    private final BigInteger keyLength;
    private final BigInteger parallelizationParameter;
    private final byte[] salt;

    private ScryptParams(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 4 && aSN1Sequence.size() != 5) {
            throw new IllegalArgumentException(a.i(aSN1Sequence, new StringBuilder("invalid sequence: size = ")));
        }
        this.salt = a.A(aSN1Sequence, 0);
        this.costParameter = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).getValue();
        this.blockSize = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(2)).getValue();
        this.parallelizationParameter = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(3)).getValue();
        this.keyLength = aSN1Sequence.size() == 5 ? ASN1Integer.getInstance(aSN1Sequence.getObjectAt(4)).getValue() : null;
    }

    public static ScryptParams getInstance(Object obj) {
        if (obj instanceof ScryptParams) {
            return (ScryptParams) obj;
        }
        if (obj != null) {
            return new ScryptParams(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getBlockSize() {
        return this.blockSize;
    }

    public BigInteger getCostParameter() {
        return this.costParameter;
    }

    public BigInteger getKeyLength() {
        return this.keyLength;
    }

    public BigInteger getParallelizationParameter() {
        return this.parallelizationParameter;
    }

    public byte[] getSalt() {
        return Arrays.clone(this.salt);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(5);
        aSN1EncodableVector.add(new DEROctetString(this.salt));
        aSN1EncodableVector.add(new ASN1Integer(this.costParameter));
        aSN1EncodableVector.add(new ASN1Integer(this.blockSize));
        aSN1EncodableVector.add(new ASN1Integer(this.parallelizationParameter));
        if (this.keyLength != null) {
            aSN1EncodableVector.add(new ASN1Integer(this.keyLength));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public ScryptParams(byte[] bArr, int i, int i9, int i10) {
        this(bArr, BigInteger.valueOf(i), BigInteger.valueOf(i9), BigInteger.valueOf(i10), (BigInteger) null);
    }

    public ScryptParams(byte[] bArr, int i, int i9, int i10, int i11) {
        this(bArr, BigInteger.valueOf(i), BigInteger.valueOf(i9), BigInteger.valueOf(i10), BigInteger.valueOf(i11));
    }

    public ScryptParams(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.salt = Arrays.clone(bArr);
        this.costParameter = bigInteger;
        this.blockSize = bigInteger2;
        this.parallelizationParameter = bigInteger3;
        this.keyLength = bigInteger4;
    }
}
