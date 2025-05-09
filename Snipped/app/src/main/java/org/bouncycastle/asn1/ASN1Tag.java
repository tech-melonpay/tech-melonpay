package org.bouncycastle.asn1;

/* loaded from: classes2.dex */
final class ASN1Tag {
    private final int tagClass;
    private final int tagNumber;

    private ASN1Tag(int i, int i9) {
        this.tagClass = i;
        this.tagNumber = i9;
    }

    public static ASN1Tag create(int i, int i9) {
        return new ASN1Tag(i, i9);
    }

    public int getTagClass() {
        return this.tagClass;
    }

    public int getTagNumber() {
        return this.tagNumber;
    }
}
