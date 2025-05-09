package org.bouncycastle.oer.its.template.ieee1609dot2;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import org.bouncycastle.oer.Element;
import org.bouncycastle.oer.ElementSupplier;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.oer.Switch;
import org.bouncycastle.oer.SwitchIndexer;
import org.bouncycastle.oer.its.template.etsi103097.extension.EtsiTs103097ExtensionModule;
import org.bouncycastle.oer.its.template.ieee1609dot2.basetypes.Ieee1609Dot2BaseTypes;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes3.dex */
public class IEEE1609dot2 {
    public static final OERDefinition.Builder AesCcmCiphertext;
    public static final OERDefinition.Builder Certificate;
    public static final OERDefinition.Builder CertificateBase;
    public static final OERDefinition.Builder CertificateId;
    public static final OERDefinition.Builder CertificateType;
    public static final OERDefinition.Builder ContributedExtensionBlock;
    public static final Switch ContributedExtensionBlockSwitch;
    public static final OERDefinition.Builder ContributedExtensionBlocks;
    public static final OERDefinition.Builder CounterSignature;
    public static final OERDefinition.Builder EncryptedData;
    public static final OERDefinition.Builder EncryptedDataEncryptionKey;
    public static final OERDefinition.Builder EndEntityType;
    public static final OERDefinition.Builder ExplicitCertificate;
    public static final OERDefinition.Builder HashedData;
    public static final OERDefinition.Builder HeaderInfo;
    public static final OERDefinition.Builder HeaderInfoContributorId;
    public static final OERDefinition.Builder Ieee1609Dot2Content;
    public static final OERDefinition.Builder Ieee1609Dot2Data;
    public static final OERDefinition.Builder ImplicitCertificate;
    public static final OERDefinition.Builder IssuerIdentifier;
    public static final OERDefinition.Builder LinkageData;
    public static final OERDefinition.Builder MissingCrlIdentifier;
    public static final OERDefinition.Builder Opaque;
    public static final OERDefinition.Builder PKRecipientInfo;
    public static final OERDefinition.Builder PduFunctionalType;
    public static final OERDefinition.Builder PreSharedKeyRecipientInfo;
    public static final OERDefinition.Builder PsidGroupPermissions;
    public static final OERDefinition.Builder RecipientInfo;
    public static final OERDefinition.Builder SequenceOfCertificate;
    public static final OERDefinition.Builder SequenceOfPsidGroupPermissions;
    public static final OERDefinition.Builder SequenceOfRecipientInfo;
    public static final OERDefinition.Builder SignedData;
    public static final OERDefinition.Builder SignedDataPayload;
    public static final OERDefinition.Builder SignerIdentifier;
    public static final OERDefinition.Builder SubjectPermissions;
    public static final OERDefinition.Builder SymmRecipientInfo;
    public static final OERDefinition.Builder SymmetricCiphertext;
    public static final OERDefinition.Builder ToBeSignedCertificate;
    public static final OERDefinition.Builder ToBeSignedData;
    public static final OERDefinition.Builder VerificationKeyIndicator;
    private static final ASN1Integer etsiHeaderInfoContributorId;
    private static ASN1Integer explicitOrdinal;
    private static final ASN1Encodable[] extensionBlockSwitchKeys;
    private static ASN1Integer implicitOrdinal;

    static {
        OERDefinition.Builder typeName = OERDefinition.octets().typeName("Opaque");
        Opaque = typeName;
        OERDefinition.Builder typeName2 = OERDefinition.integer(0L, 255L).typeName("PduFunctionalType");
        PduFunctionalType = typeName2;
        OERDefinition.Builder typeName3 = OERDefinition.choice(OERDefinition.octets(32).label("sha256HashedData"), OERDefinition.extension(OERDefinition.octets(48).label("sha384HashedData"), OERDefinition.octets(32).label("reserved"))).typeName("HashedData");
        HashedData = typeName3;
        OERDefinition.Builder builder = Ieee1609Dot2BaseTypes.HashedId3;
        OERDefinition.Builder label = builder.label("cracaId");
        OERDefinition.Builder builder2 = Ieee1609Dot2BaseTypes.CrlSeries;
        OERDefinition.Builder typeName4 = OERDefinition.seq(label, builder2.label("crlSeries"), OERDefinition.extension(new Object[0])).typeName("MissingCrlIdentifier");
        MissingCrlIdentifier = typeName4;
        ASN1Integer aSN1Integer = new ASN1Integer(BigIntegers.TWO);
        etsiHeaderInfoContributorId = aSN1Integer;
        extensionBlockSwitchKeys = new ASN1Encodable[]{aSN1Integer};
        OERDefinition.Builder validSwitchValue = OERDefinition.integer(0L, 255L).typeName("HeaderInfoContributorId").validSwitchValue(aSN1Integer);
        HeaderInfoContributorId = validSwitchValue;
        Switch r42 = new Switch() { // from class: org.bouncycastle.oer.its.template.ieee1609dot2.IEEE1609dot2.1
            @Override // org.bouncycastle.oer.Switch
            public ASN1Encodable[] keys() {
                return IEEE1609dot2.extensionBlockSwitchKeys;
            }

            @Override // org.bouncycastle.oer.Switch
            public Element result(SwitchIndexer switchIndexer) {
                ASN1Integer aSN1Integer2 = ASN1Integer.getInstance(switchIndexer.get(0).toASN1Primitive());
                if (aSN1Integer2.equals((ASN1Primitive) IEEE1609dot2.etsiHeaderInfoContributorId)) {
                    return OERDefinition.seqof(EtsiTs103097ExtensionModule.EtsiOriginatingHeaderInfoExtension).rangeToMAXFrom(1L).label("extns").build();
                }
                throw new IllegalArgumentException("No forward definition for type id " + aSN1Integer2);
            }
        };
        ContributedExtensionBlockSwitch = r42;
        OERDefinition.Builder typeName5 = OERDefinition.seq(validSwitchValue.label("contributorId"), OERDefinition.aSwitch(r42).label("Extn")).typeName("ContributedExtensionBlock");
        ContributedExtensionBlock = typeName5;
        OERDefinition.Builder typeName6 = OERDefinition.seqof(typeName5).rangeToMAXFrom(1L).typeName("ContributedExtensionBlocks");
        ContributedExtensionBlocks = typeName6;
        OERDefinition.Builder builder3 = Ieee1609Dot2BaseTypes.HashedId8;
        OERDefinition.Builder typeName7 = builder3.typeName("PreSharedKeyRecipientInfo");
        PreSharedKeyRecipientInfo = typeName7;
        OERDefinition.Builder builder4 = Ieee1609Dot2BaseTypes.EciesP256EncryptedKey;
        OERDefinition.Builder typeName8 = OERDefinition.choice(builder4.label("eciesNistP256"), builder4.label("eciesBrainpoolP256r1"), OERDefinition.extension(new Object[0])).typeName("EncryptedDataEncryptionKey");
        EncryptedDataEncryptionKey = typeName8;
        OERDefinition.Builder typeName9 = OERDefinition.seq(builder3.label("recipientId"), typeName8.label("encKey")).typeName("PKRecipientInfo");
        PKRecipientInfo = typeName9;
        OERDefinition.Builder typeName10 = OERDefinition.seq(OERDefinition.octets(12).label("nonce"), typeName.label("ccmCiphertext")).typeName("AesCcmCiphertext");
        AesCcmCiphertext = typeName10;
        OERDefinition.Builder typeName11 = OERDefinition.choice(typeName10.label("aes128ccm"), OERDefinition.extension(new Object[0])).typeName("SymmetricCiphertext");
        SymmetricCiphertext = typeName11;
        OERDefinition.Builder typeName12 = OERDefinition.seq(builder3.label("recipientId"), typeName11.label("encKey")).typeName("SymmRecipientInfo");
        SymmRecipientInfo = typeName12;
        OERDefinition.Builder typeName13 = OERDefinition.choice(typeName7.label("pskRecipInfo"), typeName12.label("symmRecipInfo"), typeName9.label("certRecipInfo"), typeName9.label("signedDataRecipInfo"), typeName9.label("rekRecipInfo")).typeName("RecipientInfo");
        RecipientInfo = typeName13;
        OERDefinition.Builder typeName14 = OERDefinition.seqof(typeName13).typeName("SequenceOfRecipientInfo");
        SequenceOfRecipientInfo = typeName14;
        OERDefinition.Builder typeName15 = OERDefinition.seq(typeName14.label("recipients"), typeName11.label("ciphertext")).typeName("EncryptedData");
        EncryptedData = typeName15;
        OERDefinition.Builder typeName16 = OERDefinition.bitString(8L).defaultValue(new DERBitString(new byte[]{0}, 0)).typeName("EndEntityType");
        EndEntityType = typeName16;
        OERDefinition.Builder typeName17 = OERDefinition.choice(Ieee1609Dot2BaseTypes.SequenceOfPsidSspRange.label("explicit"), OERDefinition.nullValue().label("all"), OERDefinition.extension(new Object[0])).typeName("SubjectPermissions");
        SubjectPermissions = typeName17;
        OERDefinition.Builder typeName18 = OERDefinition.choice(Ieee1609Dot2BaseTypes.PublicVerificationKey.label("verificationKey"), Ieee1609Dot2BaseTypes.EccP256CurvePoint.label("reconstructionValue"), OERDefinition.extension(new Object[0])).typeName("VerificationKeyIndicator");
        VerificationKeyIndicator = typeName18;
        OERDefinition.Builder typeName19 = OERDefinition.seq(typeName17.label("subjectPermissions"), OERDefinition.integer(1L).label("minChainLength"), OERDefinition.integer(0L).label("chainLengthRange"), typeName16.label("eeType")).typeName("PsidGroupPermissions");
        PsidGroupPermissions = typeName19;
        OERDefinition.Builder typeName20 = OERDefinition.seqof(typeName19).typeName("SequenceOfPsidGroupPermissions");
        SequenceOfPsidGroupPermissions = typeName20;
        OERDefinition.Builder typeName21 = OERDefinition.seq(Ieee1609Dot2BaseTypes.IValue.label("iCert"), Ieee1609Dot2BaseTypes.LinkageValue.label("linkageValue"), OERDefinition.optional(Ieee1609Dot2BaseTypes.GroupLinkageValue.label("groupLinkageValue")), OERDefinition.extension(new Object[0])).typeName("LinkageData");
        LinkageData = typeName21;
        OERDefinition.Builder typeName22 = OERDefinition.choice(typeName21.label("linkageData"), Ieee1609Dot2BaseTypes.Hostname.label(AppMeasurementSdk.ConditionalUserProperty.NAME), OERDefinition.octets(1, 64).label("binaryId"), OERDefinition.nullValue().label("none"), OERDefinition.extension(new Object[0])).typeName("CertificateId");
        CertificateId = typeName22;
        OERDefinition.Builder typeName23 = OERDefinition.seq(typeName22.label("id"), builder.label("cracaId"), builder2.label("crlSeries"), Ieee1609Dot2BaseTypes.ValidityPeriod.label("validityPeriod"), OERDefinition.optional(Ieee1609Dot2BaseTypes.GeographicRegion.label("region"), Ieee1609Dot2BaseTypes.SubjectAssurance.label("assuranceLevel"), Ieee1609Dot2BaseTypes.SequenceOfPsidSsp.label("appPermissions"), typeName20.label("certIssuePermissions"), typeName20.label("certRequestPermissions"), OERDefinition.nullValue().label("canRequestRollover"), Ieee1609Dot2BaseTypes.PublicEncryptionKey.label("encryptionKey")), typeName18.label("verifyKeyIndicator"), OERDefinition.extension(new Object[0])).typeName("ToBeSignedCertificate");
        ToBeSignedCertificate = typeName23;
        OERDefinition.Builder label2 = builder3.label("sha256AndDigest");
        OERDefinition.Builder builder5 = Ieee1609Dot2BaseTypes.HashAlgorithm;
        OERDefinition.Builder typeName24 = OERDefinition.choice(label2, builder5.label("self"), OERDefinition.extension(builder3.label("sha384AndDigest"))).typeName("IssuerIdentifier");
        IssuerIdentifier = typeName24;
        OERDefinition.Builder typeName25 = OERDefinition.enumeration(OERDefinition.enumItem("explicit"), OERDefinition.enumItem("implicit"), OERDefinition.extension(new Object[0])).typeName("CertificateType");
        CertificateType = typeName25;
        explicitOrdinal = new ASN1Integer(BigInteger.ZERO);
        implicitOrdinal = new ASN1Integer(BigInteger.ONE);
        OERDefinition.Builder builder6 = Ieee1609Dot2BaseTypes.UINT8;
        OERDefinition.Builder label3 = builder6.label("version");
        OERDefinition.Builder label4 = typeName25.label("type");
        OERDefinition.Builder label5 = typeName24.label("issuer");
        OERDefinition.Builder label6 = typeName23.label("toBeSigned");
        OERDefinition.Builder builder7 = Ieee1609Dot2BaseTypes.Signature;
        OERDefinition.Builder typeName26 = OERDefinition.seq(label3, label4, label5, label6, OERDefinition.optional(builder7.label("signature"))).label("signature").typeName("CertificateBase");
        CertificateBase = typeName26;
        OERDefinition.Builder typeName27 = typeName26.copy().typeName("Certificate");
        Certificate = typeName27;
        ExplicitCertificate = typeName26.typeName("ExplicitCertificate").replaceChild(1, typeName25.validSwitchValue(explicitOrdinal).label("type"));
        ImplicitCertificate = typeName26.typeName("ImplicitCertificate").replaceChild(1, typeName25.validSwitchValue(implicitOrdinal).label("type"));
        OERDefinition.Builder typeName28 = OERDefinition.seqof(typeName27).typeName("SequenceOfCertificate");
        SequenceOfCertificate = typeName28;
        OERDefinition.Builder typeName29 = OERDefinition.choice(builder3.label(CMSAttributeTableGenerator.DIGEST), typeName28.label("certificate"), OERDefinition.nullValue().label("self"), OERDefinition.extension(new Object[0])).typeName("SignerIdentifier");
        SignerIdentifier = typeName29;
        OERDefinition.Builder label7 = Ieee1609Dot2BaseTypes.Psid.label("psid");
        OERDefinition.Builder builder8 = Ieee1609Dot2BaseTypes.Time64;
        OERDefinition.Builder typeName30 = OERDefinition.seq(label7, OERDefinition.optional(builder8.label("generationTime"), builder8.label("expiryTime"), Ieee1609Dot2BaseTypes.ThreeDLocation.label("generationLocation"), builder.label("p2pcdLearningRequest"), typeName4.label("missingCrlIdentifier"), Ieee1609Dot2BaseTypes.EncryptionKey.label("encryptionKey")), OERDefinition.extension(OERDefinition.optional(Ieee1609Dot2BaseTypes.SequenceOfHashedId3.label("inlineP2pcdRequest"), typeName27.label("requestedCertificate"), typeName2.label("pduFunctionalType"), typeName6.label("contributedExtensions")))).typeName("HeaderInfo");
        HeaderInfo = typeName30;
        SignedData = OERDefinition.seq(builder5.label("hashId"), OERDefinition.deferred(new ElementSupplier() { // from class: org.bouncycastle.oer.its.template.ieee1609dot2.IEEE1609dot2.2
            private Element built;

            @Override // org.bouncycastle.oer.ElementSupplier
            public Element build() {
                Element element;
                synchronized (this) {
                    try {
                        if (this.built == null) {
                            this.built = IEEE1609dot2.ToBeSignedData.label("tbsData").build();
                        }
                        element = this.built;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return element;
            }
        }).label("tbsData"), typeName29.label("signer"), builder7.label("signature")).typeName("SignedData");
        OERDefinition.Builder typeName31 = OERDefinition.choice(typeName.label("unsecuredData"), OERDefinition.deferred(new ElementSupplier() { // from class: org.bouncycastle.oer.its.template.ieee1609dot2.IEEE1609dot2.3
            private Element built;

            @Override // org.bouncycastle.oer.ElementSupplier
            public Element build() {
                Element element;
                synchronized (this) {
                    try {
                        if (this.built == null) {
                            this.built = IEEE1609dot2.SignedData.label("signedData").mayRecurse(true).build();
                        }
                        element = this.built;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return element;
            }
        }).label("signedData").mayRecurse(true), typeName15.label("encryptedData"), typeName.label("signedCertificateRequest"), OERDefinition.extension(new Object[0])).typeName("Ieee1609Dot2Content");
        Ieee1609Dot2Content = typeName31;
        CounterSignature = OERDefinition.seq(builder6.label("protocolVersion"), typeName31.label(FirebaseAnalytics.Param.CONTENT)).typeName("CounterSignature");
        OERDefinition.Builder typeName32 = OERDefinition.seq(builder6.validSwitchValue(new ASN1Integer(3L)).label("protocolVersion"), typeName31.label(FirebaseAnalytics.Param.CONTENT)).typeName("Ieee1609Dot2Data");
        Ieee1609Dot2Data = typeName32;
        OERDefinition.Builder typeName33 = OERDefinition.seq(OERDefinition.optional(typeName32.label(Constants.ScionAnalytics.MessageType.DATA_MESSAGE), typeName3.label("extDataHash")), OERDefinition.extension(new Object[0])).typeName("SignedDataPayload");
        SignedDataPayload = typeName33;
        ToBeSignedData = OERDefinition.seq(typeName33.label("payload"), typeName30.label("headerInfo")).typeName("ToBeSignedData");
    }
}
