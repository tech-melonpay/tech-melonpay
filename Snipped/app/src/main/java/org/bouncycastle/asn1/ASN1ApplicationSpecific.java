package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class ASN1ApplicationSpecific extends ASN1TaggedObject implements ASN1ApplicationSpecificParser {
    final ASN1TaggedObject taggedObject;

    public ASN1ApplicationSpecific(ASN1TaggedObject aSN1TaggedObject) {
        super(aSN1TaggedObject.explicitness, checkTagClass(aSN1TaggedObject.tagClass), aSN1TaggedObject.tagNo, aSN1TaggedObject.obj);
        this.taggedObject = aSN1TaggedObject;
    }

    private static int checkTagClass(int i) {
        if (64 == i) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    public static ASN1ApplicationSpecific getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1ApplicationSpecific)) {
            return (ASN1ApplicationSpecific) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(a.e(obj, "unknown object in getInstance: "));
        }
        try {
            return getInstance((Object) ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (IOException e10) {
            throw new IllegalArgumentException(a.b(e10, new StringBuilder("Failed to construct object from byte[]: ")));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z10) {
        this.taggedObject.encode(aSN1OutputStream, z10);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return this.taggedObject.encodeConstructed();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z10) {
        return this.taggedObject.encodedLength(z10);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public String getASN1Encoding() {
        return this.taggedObject.getASN1Encoding();
    }

    public int getApplicationTag() {
        return this.taggedObject.getTagNo();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public byte[] getContents() {
        return this.taggedObject.getContents();
    }

    public ASN1Primitive getEnclosedObject() {
        return this.taggedObject.getBaseObject().toASN1Primitive();
    }

    public ASN1Primitive getObject(int i) {
        return this.taggedObject.getBaseUniversal(false, i);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable getObjectParser(int i, boolean z10) {
        throw new ASN1Exception("this method only valid for CONTEXT_SPECIFIC tags");
    }

    public ASN1TaggedObject getTaggedObject() {
        return this.taggedObject;
    }

    public boolean hasApplicationTag(int i) {
        return this.tagNo == i;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public boolean hasContextTag(int i) {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public boolean isConstructed() {
        return this.taggedObject.isConstructed();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable parseBaseUniversal(boolean z10, int i) {
        return this.taggedObject.parseBaseUniversal(z10, i);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable parseExplicitBaseObject() {
        return this.taggedObject.parseExplicitBaseObject();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1TaggedObjectParser parseExplicitBaseTagged() {
        return this.taggedObject.parseExplicitBaseTagged();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1TaggedObjectParser parseImplicitBaseTagged(int i, int i9) {
        return this.taggedObject.parseImplicitBaseTagged(i, i9);
    }

    @Override // org.bouncycastle.asn1.ASN1ApplicationSpecificParser
    public ASN1Encodable readObject() {
        return parseExplicitBaseObject();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public ASN1Sequence rebuildConstructed(ASN1Primitive aSN1Primitive) {
        return this.taggedObject.rebuildConstructed(aSN1Primitive);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public ASN1TaggedObject replaceTag(int i, int i9) {
        return this.taggedObject.replaceTag(i, i9);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return new DERApplicationSpecific((ASN1TaggedObject) this.taggedObject.toDERObject());
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return new DLApplicationSpecific((ASN1TaggedObject) this.taggedObject.toDLObject());
    }
}
