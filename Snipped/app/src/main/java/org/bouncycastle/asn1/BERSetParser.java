package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes2.dex */
public class BERSetParser implements ASN1SetParser {
    private ASN1StreamParser _parser;

    public BERSetParser(ASN1StreamParser aSN1StreamParser) {
        this._parser = aSN1StreamParser;
    }

    public static BERSet parse(ASN1StreamParser aSN1StreamParser) {
        return new BERSet(aSN1StreamParser.readVector());
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() {
        return parse(this._parser);
    }

    @Override // org.bouncycastle.asn1.ASN1SetParser
    public ASN1Encodable readObject() {
        return this._parser.readObject();
    }

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e10) {
            throw new ASN1ParsingException(e10.getMessage(), e10);
        }
    }
}
