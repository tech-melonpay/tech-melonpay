package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.ASN1TaggedObjectParser;
import org.bouncycastle.asn1.ASN1Util;

/* loaded from: classes2.dex */
public class EnvelopedDataParser {
    private ASN1Encodable _nextObject;
    private boolean _originatorInfoCalled;
    private ASN1SequenceParser _seq;
    private ASN1Integer _version;

    public EnvelopedDataParser(ASN1SequenceParser aSN1SequenceParser) {
        this._seq = aSN1SequenceParser;
        this._version = ASN1Integer.getInstance(aSN1SequenceParser.readObject());
    }

    public EncryptedContentInfoParser getEncryptedContentInfo() {
        if (this._nextObject == null) {
            this._nextObject = this._seq.readObject();
        }
        ASN1Encodable aSN1Encodable = this._nextObject;
        if (aSN1Encodable == null) {
            return null;
        }
        this._nextObject = null;
        return new EncryptedContentInfoParser((ASN1SequenceParser) aSN1Encodable);
    }

    public OriginatorInfo getOriginatorInfo() {
        this._originatorInfoCalled = true;
        if (this._nextObject == null) {
            this._nextObject = this._seq.readObject();
        }
        ASN1Encodable aSN1Encodable = this._nextObject;
        if (aSN1Encodable instanceof ASN1TaggedObjectParser) {
            ASN1TaggedObjectParser aSN1TaggedObjectParser = (ASN1TaggedObjectParser) aSN1Encodable;
            if (aSN1TaggedObjectParser.hasContextTag(0)) {
                ASN1SequenceParser aSN1SequenceParser = (ASN1SequenceParser) aSN1TaggedObjectParser.parseBaseUniversal(false, 16);
                this._nextObject = null;
                return OriginatorInfo.getInstance(aSN1SequenceParser.getLoadedObject());
            }
        }
        return null;
    }

    public ASN1SetParser getRecipientInfos() {
        if (!this._originatorInfoCalled) {
            getOriginatorInfo();
        }
        if (this._nextObject == null) {
            this._nextObject = this._seq.readObject();
        }
        ASN1SetParser aSN1SetParser = (ASN1SetParser) this._nextObject;
        this._nextObject = null;
        return aSN1SetParser;
    }

    public ASN1SetParser getUnprotectedAttrs() {
        if (this._nextObject == null) {
            this._nextObject = this._seq.readObject();
        }
        ASN1Encodable aSN1Encodable = this._nextObject;
        if (aSN1Encodable == null) {
            return null;
        }
        this._nextObject = null;
        return (ASN1SetParser) ASN1Util.parseContextBaseUniversal((ASN1TaggedObjectParser) aSN1Encodable, 1, false, 17);
    }

    public ASN1Integer getVersion() {
        return this._version;
    }
}
