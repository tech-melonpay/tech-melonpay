package org.bouncycastle.asn1;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class BEROctetString extends ASN1OctetString {
    private static final int DEFAULT_SEGMENT_LIMIT = 1000;
    private final ASN1OctetString[] elements;
    private final int segmentLimit;

    public BEROctetString(byte[] bArr) {
        this(bArr, DEFAULT_SEGMENT_LIMIT);
    }

    public static byte[] flattenOctetStrings(ASN1OctetString[] aSN1OctetStringArr) {
        int length = aSN1OctetStringArr.length;
        if (length == 0) {
            return ASN1OctetString.EMPTY_OCTETS;
        }
        if (length == 1) {
            return aSN1OctetStringArr[0].string;
        }
        int i = 0;
        for (ASN1OctetString aSN1OctetString : aSN1OctetStringArr) {
            i += aSN1OctetString.string.length;
        }
        byte[] bArr = new byte[i];
        int i9 = 0;
        for (ASN1OctetString aSN1OctetString2 : aSN1OctetStringArr) {
            byte[] bArr2 = aSN1OctetString2.string;
            System.arraycopy(bArr2, 0, bArr, i9, bArr2.length);
            i9 += bArr2.length;
        }
        return bArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z10) {
        if (!encodeConstructed()) {
            byte[] bArr = this.string;
            DEROctetString.encode(aSN1OutputStream, z10, bArr, 0, bArr.length);
            return;
        }
        aSN1OutputStream.writeIdentifier(z10, 36);
        aSN1OutputStream.write(128);
        ASN1OctetString[] aSN1OctetStringArr = this.elements;
        if (aSN1OctetStringArr == null) {
            int i = 0;
            while (true) {
                byte[] bArr2 = this.string;
                if (i >= bArr2.length) {
                    break;
                }
                int min = Math.min(bArr2.length - i, this.segmentLimit);
                DEROctetString.encode(aSN1OutputStream, true, this.string, i, min);
                i += min;
            }
        } else {
            aSN1OutputStream.writePrimitives(aSN1OctetStringArr);
        }
        aSN1OutputStream.write(0);
        aSN1OutputStream.write(0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return this.elements != null || this.string.length > this.segmentLimit;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z10) {
        if (!encodeConstructed()) {
            return DEROctetString.encodedLength(z10, this.string.length);
        }
        int i = z10 ? 4 : 3;
        if (this.elements == null) {
            int length = this.string.length;
            int i9 = this.segmentLimit;
            int i10 = length / i9;
            int encodedLength = i + (DEROctetString.encodedLength(true, i9) * i10);
            int length2 = this.string.length - (i10 * this.segmentLimit);
            return length2 > 0 ? encodedLength + DEROctetString.encodedLength(true, length2) : encodedLength;
        }
        int i11 = 0;
        while (true) {
            ASN1OctetString[] aSN1OctetStringArr = this.elements;
            if (i11 >= aSN1OctetStringArr.length) {
                return i;
            }
            i += aSN1OctetStringArr[i11].encodedLength(true);
            i11++;
        }
    }

    public Enumeration getObjects() {
        return this.elements == null ? new Enumeration() { // from class: org.bouncycastle.asn1.BEROctetString.1
            int pos = 0;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.pos < BEROctetString.this.string.length;
            }

            @Override // java.util.Enumeration
            public Object nextElement() {
                int i = this.pos;
                BEROctetString bEROctetString = BEROctetString.this;
                byte[] bArr = bEROctetString.string;
                if (i >= bArr.length) {
                    throw new NoSuchElementException();
                }
                int min = Math.min(bArr.length - i, bEROctetString.segmentLimit);
                byte[] bArr2 = new byte[min];
                System.arraycopy(BEROctetString.this.string, this.pos, bArr2, 0, min);
                this.pos += min;
                return new DEROctetString(bArr2);
            }
        } : new Enumeration() { // from class: org.bouncycastle.asn1.BEROctetString.2
            int counter = 0;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.counter < BEROctetString.this.elements.length;
            }

            @Override // java.util.Enumeration
            public Object nextElement() {
                if (this.counter >= BEROctetString.this.elements.length) {
                    throw new NoSuchElementException();
                }
                ASN1OctetString[] aSN1OctetStringArr = BEROctetString.this.elements;
                int i = this.counter;
                this.counter = i + 1;
                return aSN1OctetStringArr[i];
            }
        };
    }

    public BEROctetString(byte[] bArr, int i) {
        this(bArr, null, i);
    }

    private BEROctetString(byte[] bArr, ASN1OctetString[] aSN1OctetStringArr, int i) {
        super(bArr);
        this.elements = aSN1OctetStringArr;
        this.segmentLimit = i;
    }

    public BEROctetString(ASN1OctetString[] aSN1OctetStringArr) {
        this(aSN1OctetStringArr, DEFAULT_SEGMENT_LIMIT);
    }

    public BEROctetString(ASN1OctetString[] aSN1OctetStringArr, int i) {
        this(flattenOctetStrings(aSN1OctetStringArr), aSN1OctetStringArr, i);
    }
}
