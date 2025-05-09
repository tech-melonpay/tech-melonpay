package org.bouncycastle.asn1;

import s3.b;

/* loaded from: classes2.dex */
public abstract class ASN1Util {
    public static ASN1TaggedObject checkTag(ASN1TaggedObject aSN1TaggedObject, int i, int i9) {
        if (aSN1TaggedObject.hasTag(i, i9)) {
            return aSN1TaggedObject;
        }
        throw new IllegalStateException(b.k("Expected ", getTagText(i, i9), " tag but found ", getTagText(aSN1TaggedObject)));
    }

    public static ASN1Primitive getBaseUniversal(ASN1TaggedObject aSN1TaggedObject, int i, int i9, boolean z10, int i10) {
        return checkTag(aSN1TaggedObject, i, i9).getBaseUniversal(z10, i10);
    }

    public static ASN1Primitive getContextBaseUniversal(ASN1TaggedObject aSN1TaggedObject, int i, boolean z10, int i9) {
        return getBaseUniversal(aSN1TaggedObject, 128, i, z10, i9);
    }

    public static ASN1Object getExplicitBaseObject(ASN1TaggedObject aSN1TaggedObject, int i, int i9) {
        return checkTag(aSN1TaggedObject, i, i9).getExplicitBaseObject();
    }

    public static ASN1TaggedObject getExplicitBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i, int i9) {
        return checkTag(aSN1TaggedObject, i, i9).getExplicitBaseTagged();
    }

    public static ASN1Object getExplicitContextBaseObject(ASN1TaggedObject aSN1TaggedObject, int i) {
        return getExplicitBaseObject(aSN1TaggedObject, 128, i);
    }

    public static ASN1TaggedObject getExplicitContextBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i) {
        return getExplicitBaseTagged(aSN1TaggedObject, 128, i);
    }

    public static ASN1TaggedObject getImplicitBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i, int i9, int i10, int i11) {
        return checkTag(aSN1TaggedObject, i, i9).getImplicitBaseTagged(i10, i11);
    }

    public static ASN1TaggedObject getImplicitContextBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i, int i9, int i10) {
        return getImplicitBaseTagged(aSN1TaggedObject, 128, i, i9, i10);
    }

    public static String getTagText(int i, int i9) {
        return b.i(i != 64 ? i != 128 ? i != 192 ? "[UNIVERSAL " : "[PRIVATE " : "[CONTEXT " : "[APPLICATION ", i9, "]");
    }

    public static ASN1Encodable parseBaseUniversal(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i, int i9, boolean z10, int i10) {
        return checkTag(aSN1TaggedObjectParser, i, i9).parseBaseUniversal(z10, i10);
    }

    public static ASN1Encodable parseContextBaseUniversal(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i, boolean z10, int i9) {
        return parseBaseUniversal(aSN1TaggedObjectParser, 128, i, z10, i9);
    }

    public static ASN1Encodable parseExplicitBaseObject(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i, int i9) {
        return checkTag(aSN1TaggedObjectParser, i, i9).parseExplicitBaseObject();
    }

    public static ASN1TaggedObjectParser parseExplicitBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i, int i9) {
        return checkTag(aSN1TaggedObjectParser, i, i9).parseExplicitBaseTagged();
    }

    public static ASN1Encodable parseExplicitContextBaseObject(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i) {
        return parseExplicitBaseObject(aSN1TaggedObjectParser, 128, i);
    }

    public static ASN1TaggedObjectParser parseExplicitContextBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i) {
        return parseExplicitBaseTagged(aSN1TaggedObjectParser, 128, i);
    }

    public static ASN1TaggedObjectParser parseImplicitBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i, int i9, int i10, int i11) {
        return checkTag(aSN1TaggedObjectParser, i, i9).parseImplicitBaseTagged(i10, i11);
    }

    public static ASN1TaggedObjectParser parseImplicitContextBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i, int i9, int i10) {
        return parseImplicitBaseTagged(aSN1TaggedObjectParser, 128, i, i9, i10);
    }

    public static ASN1Primitive tryGetBaseUniversal(ASN1TaggedObject aSN1TaggedObject, int i, int i9, boolean z10, int i10) {
        if (aSN1TaggedObject.hasTag(i, i9)) {
            return aSN1TaggedObject.getBaseUniversal(z10, i10);
        }
        return null;
    }

    public static ASN1Primitive tryGetContextBaseUniversal(ASN1TaggedObject aSN1TaggedObject, int i, boolean z10, int i9) {
        return tryGetBaseUniversal(aSN1TaggedObject, 128, i, z10, i9);
    }

    public static ASN1Object tryGetExplicitBaseObject(ASN1TaggedObject aSN1TaggedObject, int i, int i9) {
        if (aSN1TaggedObject.hasTag(i, i9)) {
            return aSN1TaggedObject.getExplicitBaseObject();
        }
        return null;
    }

    public static ASN1TaggedObject tryGetExplicitBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i, int i9) {
        if (aSN1TaggedObject.hasTag(i, i9)) {
            return aSN1TaggedObject.getExplicitBaseTagged();
        }
        return null;
    }

    public static ASN1Object tryGetExplicitContextBaseObject(ASN1TaggedObject aSN1TaggedObject, int i) {
        return tryGetExplicitBaseObject(aSN1TaggedObject, 128, i);
    }

    public static ASN1TaggedObject tryGetExplicitContextBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i) {
        return tryGetExplicitBaseTagged(aSN1TaggedObject, 128, i);
    }

    public static ASN1TaggedObject tryGetImplicitBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i, int i9, int i10, int i11) {
        if (aSN1TaggedObject.hasTag(i, i9)) {
            return aSN1TaggedObject.getImplicitBaseTagged(i10, i11);
        }
        return null;
    }

    public static ASN1TaggedObject tryGetImplicitContextBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i, int i9, int i10) {
        return tryGetImplicitBaseTagged(aSN1TaggedObject, 128, i, i9, i10);
    }

    public static ASN1Encodable tryParseBaseUniversal(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i, int i9, boolean z10, int i10) {
        if (aSN1TaggedObjectParser.hasTag(i, i9)) {
            return aSN1TaggedObjectParser.parseBaseUniversal(z10, i10);
        }
        return null;
    }

    public static ASN1Encodable tryParseContextBaseUniversal(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i, boolean z10, int i9) {
        return tryParseBaseUniversal(aSN1TaggedObjectParser, 128, i, z10, i9);
    }

    public static ASN1Encodable tryParseExplicitBaseObject(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i, int i9) {
        if (aSN1TaggedObjectParser.hasTag(i, i9)) {
            return aSN1TaggedObjectParser.parseExplicitBaseObject();
        }
        return null;
    }

    public static ASN1TaggedObjectParser tryParseExplicitBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i, int i9) {
        if (aSN1TaggedObjectParser.hasTag(i, i9)) {
            return aSN1TaggedObjectParser.parseExplicitBaseTagged();
        }
        return null;
    }

    public static ASN1Encodable tryParseExplicitContextBaseObject(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i) {
        return tryParseExplicitBaseObject(aSN1TaggedObjectParser, 128, i);
    }

    public static ASN1TaggedObjectParser tryParseExplicitContextBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i) {
        return tryParseExplicitBaseTagged(aSN1TaggedObjectParser, 128, i);
    }

    public static ASN1TaggedObjectParser tryParseImplicitBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i, int i9, int i10, int i11) {
        if (aSN1TaggedObjectParser.hasTag(i, i9)) {
            return aSN1TaggedObjectParser.parseImplicitBaseTagged(i10, i11);
        }
        return null;
    }

    public static ASN1TaggedObjectParser tryParseImplicitContextBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i, int i9, int i10) {
        return tryParseImplicitBaseTagged(aSN1TaggedObjectParser, 128, i, i9, i10);
    }

    public static String getTagText(ASN1Tag aSN1Tag) {
        return getTagText(aSN1Tag.getTagClass(), aSN1Tag.getTagNumber());
    }

    public static ASN1TaggedObjectParser checkTag(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i, int i9) {
        if (aSN1TaggedObjectParser.hasTag(i, i9)) {
            return aSN1TaggedObjectParser;
        }
        throw new IllegalStateException(b.k("Expected ", getTagText(i, i9), " tag but found ", getTagText(aSN1TaggedObjectParser)));
    }

    public static String getTagText(ASN1TaggedObject aSN1TaggedObject) {
        return getTagText(aSN1TaggedObject.getTagClass(), aSN1TaggedObject.getTagNo());
    }

    public static String getTagText(ASN1TaggedObjectParser aSN1TaggedObjectParser) {
        return getTagText(aSN1TaggedObjectParser.getTagClass(), aSN1TaggedObjectParser.getTagNo());
    }
}
