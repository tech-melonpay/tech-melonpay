package org.bouncycastle.tsp;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.DLSequence;
import org.bouncycastle.asn1.cmp.PKIFreeText;
import org.bouncycastle.asn1.cmp.PKIStatusInfo;
import org.bouncycastle.asn1.tsp.TimeStampResp;
import org.bouncycastle.asn1.x509.Extensions;

/* loaded from: classes3.dex */
public class TimeStampResponseGenerator {
    private Set acceptedAlgorithms;
    private Set acceptedExtensions;
    private Set acceptedPolicies;
    int failInfo;
    int status;
    ASN1EncodableVector statusStrings;
    private TimeStampTokenGenerator tokenGenerator;

    public class FailInfo extends DERBitString {
        public FailInfo(int i) {
            super(ASN1BitString.getBytes(i), ASN1BitString.getPadBits(i));
        }
    }

    public TimeStampResponseGenerator(TimeStampTokenGenerator timeStampTokenGenerator, Set set) {
        this(timeStampTokenGenerator, set, null, null);
    }

    private void addStatusString(String str) {
        this.statusStrings.add(new DERUTF8String(str));
    }

    private Set convert(Set set) {
        if (set == null) {
            return set;
        }
        HashSet hashSet = new HashSet(set.size());
        for (Object obj : set) {
            if (obj instanceof String) {
                hashSet.add(new ASN1ObjectIdentifier((String) obj));
            } else {
                hashSet.add(obj);
            }
        }
        return hashSet;
    }

    private PKIStatusInfo getPKIStatusInfo() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.status));
        if (this.statusStrings.size() > 0) {
            aSN1EncodableVector.add(PKIFreeText.getInstance(new DERSequence(this.statusStrings)));
        }
        if (this.failInfo != 0) {
            aSN1EncodableVector.add(new FailInfo(this.failInfo));
        }
        return PKIStatusInfo.getInstance(new DERSequence(aSN1EncodableVector));
    }

    private void setFailInfoField(int i) {
        this.failInfo = i | this.failInfo;
    }

    public TimeStampResponse generate(TimeStampRequest timeStampRequest, BigInteger bigInteger, Date date) {
        try {
            return generateGrantedResponse(timeStampRequest, bigInteger, date, "Operation Okay");
        } catch (Exception e10) {
            return generateRejectedResponse(e10);
        }
    }

    public TimeStampResponse generateFailResponse(int i, int i9, String str) {
        this.status = i;
        this.statusStrings = new ASN1EncodableVector();
        setFailInfoField(i9);
        if (str != null) {
            addStatusString(str);
        }
        try {
            return new TimeStampResponse(new TimeStampResp(getPKIStatusInfo(), null));
        } catch (IOException unused) {
            throw new TSPException("created badly formatted response!");
        }
    }

    public TimeStampResponse generateGrantedResponse(TimeStampRequest timeStampRequest, BigInteger bigInteger, Date date) {
        return generateGrantedResponse(timeStampRequest, bigInteger, date, null);
    }

    public TimeStampResponse generateRejectedResponse(Exception exc) {
        return generateFailResponse(2, exc instanceof TSPValidationException ? ((TSPValidationException) exc).getFailureCode() : 1073741824, exc.getMessage());
    }

    public TimeStampResponseGenerator(TimeStampTokenGenerator timeStampTokenGenerator, Set set, Set set2) {
        this(timeStampTokenGenerator, set, set2, null);
    }

    public TimeStampResponse generateGrantedResponse(TimeStampRequest timeStampRequest, BigInteger bigInteger, Date date, String str) {
        return generateGrantedResponse(timeStampRequest, bigInteger, date, str, null);
    }

    public TimeStampResponseGenerator(TimeStampTokenGenerator timeStampTokenGenerator, Set set, Set set2, Set set3) {
        this.tokenGenerator = timeStampTokenGenerator;
        this.acceptedAlgorithms = convert(set);
        this.acceptedPolicies = convert(set2);
        this.acceptedExtensions = convert(set3);
        this.statusStrings = new ASN1EncodableVector();
    }

    public TimeStampResponse generateGrantedResponse(TimeStampRequest timeStampRequest, BigInteger bigInteger, Date date, String str, Extensions extensions) {
        if (date == null) {
            throw new TSPValidationException("The time source is not available.", 512);
        }
        timeStampRequest.validate(this.acceptedAlgorithms, this.acceptedPolicies, this.acceptedExtensions);
        this.status = 0;
        this.statusStrings = new ASN1EncodableVector();
        if (str != null) {
            addStatusString(str);
        }
        try {
            try {
                return new TimeStampResponse(new DLSequence(new ASN1Encodable[]{getPKIStatusInfo().toASN1Primitive(), this.tokenGenerator.generate(timeStampRequest, bigInteger, date, extensions).toCMSSignedData().toASN1Structure().toASN1Primitive()}));
            } catch (IOException unused) {
                throw new TSPException("created badly formatted response!");
            }
        } catch (TSPException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new TSPException("Timestamp token received cannot be converted to ContentInfo", e11);
        }
    }
}
