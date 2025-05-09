package org.bouncycastle.asn1;

/* loaded from: classes2.dex */
public class BERBitString extends ASN1BitString {
    private static final int DEFAULT_SEGMENT_LIMIT = 1000;
    private final ASN1BitString[] elements;
    private final int segmentLimit;

    public BERBitString(byte b9, int i) {
        super(b9, i);
        this.elements = null;
        this.segmentLimit = DEFAULT_SEGMENT_LIMIT;
    }

    public static byte[] flattenBitStrings(ASN1BitString[] aSN1BitStringArr) {
        int length = aSN1BitStringArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return aSN1BitStringArr[0].contents;
        }
        int i = length - 1;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            byte[] bArr = aSN1BitStringArr[i10].contents;
            if (bArr[0] != 0) {
                throw new IllegalArgumentException("only the last nested bitstring can have padding");
            }
            i9 += bArr.length - 1;
        }
        byte[] bArr2 = aSN1BitStringArr[i].contents;
        byte b9 = bArr2[0];
        byte[] bArr3 = new byte[i9 + bArr2.length];
        bArr3[0] = b9;
        int i11 = 1;
        for (ASN1BitString aSN1BitString : aSN1BitStringArr) {
            byte[] bArr4 = aSN1BitString.contents;
            int length2 = bArr4.length - 1;
            System.arraycopy(bArr4, 1, bArr3, i11, length2);
            i11 += length2;
        }
        return bArr3;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z10) {
        if (!encodeConstructed()) {
            byte[] bArr = this.contents;
            DLBitString.encode(aSN1OutputStream, z10, bArr, 0, bArr.length);
            return;
        }
        aSN1OutputStream.writeIdentifier(z10, 35);
        aSN1OutputStream.write(128);
        ASN1BitString[] aSN1BitStringArr = this.elements;
        if (aSN1BitStringArr != null) {
            aSN1OutputStream.writePrimitives(aSN1BitStringArr);
        } else {
            byte[] bArr2 = this.contents;
            if (bArr2.length >= 2) {
                byte b9 = bArr2[0];
                int length = bArr2.length;
                int i = length - 1;
                int i9 = this.segmentLimit - 1;
                while (i > i9) {
                    DLBitString.encode(aSN1OutputStream, true, (byte) 0, this.contents, length - i, i9);
                    i -= i9;
                }
                DLBitString.encode(aSN1OutputStream, true, b9, this.contents, length - i, i);
            }
        }
        aSN1OutputStream.write(0);
        aSN1OutputStream.write(0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return this.elements != null || this.contents.length > this.segmentLimit;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z10) {
        if (!encodeConstructed()) {
            return DLBitString.encodedLength(z10, this.contents.length);
        }
        int i = z10 ? 4 : 3;
        if (this.elements == null) {
            byte[] bArr = this.contents;
            if (bArr.length < 2) {
                return i;
            }
            int length = bArr.length - 2;
            int i9 = this.segmentLimit;
            int i10 = length / (i9 - 1);
            return DLBitString.encodedLength(true, this.contents.length - ((this.segmentLimit - 1) * i10)) + (DLBitString.encodedLength(true, i9) * i10) + i;
        }
        int i11 = 0;
        while (true) {
            ASN1BitString[] aSN1BitStringArr = this.elements;
            if (i11 >= aSN1BitStringArr.length) {
                return i;
            }
            i += aSN1BitStringArr[i11].encodedLength(true);
            i11++;
        }
    }

    public BERBitString(ASN1Encodable aSN1Encodable) {
        this(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER), 0);
    }

    public BERBitString(byte[] bArr) {
        this(bArr, 0);
    }

    public BERBitString(byte[] bArr, int i) {
        this(bArr, i, DEFAULT_SEGMENT_LIMIT);
    }

    public BERBitString(byte[] bArr, int i, int i9) {
        super(bArr, i);
        this.elements = null;
        this.segmentLimit = i9;
    }

    public BERBitString(byte[] bArr, boolean z10) {
        super(bArr, z10);
        this.elements = null;
        this.segmentLimit = DEFAULT_SEGMENT_LIMIT;
    }

    public BERBitString(ASN1BitString[] aSN1BitStringArr) {
        this(aSN1BitStringArr, DEFAULT_SEGMENT_LIMIT);
    }

    public BERBitString(ASN1BitString[] aSN1BitStringArr, int i) {
        super(flattenBitStrings(aSN1BitStringArr), false);
        this.elements = aSN1BitStringArr;
        this.segmentLimit = i;
    }
}
