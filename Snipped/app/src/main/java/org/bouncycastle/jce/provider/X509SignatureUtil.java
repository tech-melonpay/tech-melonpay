package org.bouncycastle.jce.provider;

import androidx.camera.core.impl.utils.a;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;

/* loaded from: classes2.dex */
class X509SignatureUtil {
    private static final ASN1Null derNull = DERNull.INSTANCE;

    private static String getDigestAlgName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return PKCSObjectIdentifiers.md5.equals((ASN1Primitive) aSN1ObjectIdentifier) ? "MD5" : OIWObjectIdentifiers.idSHA1.equals((ASN1Primitive) aSN1ObjectIdentifier) ? "SHA1" : NISTObjectIdentifiers.id_sha224.equals((ASN1Primitive) aSN1ObjectIdentifier) ? "SHA224" : NISTObjectIdentifiers.id_sha256.equals((ASN1Primitive) aSN1ObjectIdentifier) ? "SHA256" : NISTObjectIdentifiers.id_sha384.equals((ASN1Primitive) aSN1ObjectIdentifier) ? "SHA384" : NISTObjectIdentifiers.id_sha512.equals((ASN1Primitive) aSN1ObjectIdentifier) ? "SHA512" : TeleTrusTObjectIdentifiers.ripemd128.equals((ASN1Primitive) aSN1ObjectIdentifier) ? "RIPEMD128" : TeleTrusTObjectIdentifiers.ripemd160.equals((ASN1Primitive) aSN1ObjectIdentifier) ? "RIPEMD160" : TeleTrusTObjectIdentifiers.ripemd256.equals((ASN1Primitive) aSN1ObjectIdentifier) ? "RIPEMD256" : CryptoProObjectIdentifiers.gostR3411.equals((ASN1Primitive) aSN1ObjectIdentifier) ? "GOST3411" : aSN1ObjectIdentifier.getId();
    }

    public static String getSignatureName(AlgorithmIdentifier algorithmIdentifier) {
        ASN1Encodable parameters = algorithmIdentifier.getParameters();
        if (parameters != null && !derNull.equals(parameters)) {
            if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_RSASSA_PSS)) {
                return a.n(new StringBuilder(), getDigestAlgName(RSASSAPSSparams.getInstance(parameters).getHashAlgorithm().getAlgorithm()), "withRSAandMGF1");
            }
            if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) X9ObjectIdentifiers.ecdsa_with_SHA2)) {
                return a.n(new StringBuilder(), getDigestAlgName(ASN1ObjectIdentifier.getInstance(ASN1Sequence.getInstance(parameters).getObjectAt(0))), "withECDSA");
            }
        }
        return algorithmIdentifier.getAlgorithm().getId();
    }

    public static void setSignatureParameters(Signature signature, ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null || derNull.equals(aSN1Encodable)) {
            return;
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
        try {
            algorithmParameters.init(aSN1Encodable.toASN1Primitive().getEncoded());
            if (signature.getAlgorithm().endsWith("MGF1")) {
                try {
                    signature.setParameter(algorithmParameters.getParameterSpec(PSSParameterSpec.class));
                } catch (GeneralSecurityException e10) {
                    throw new SignatureException(a.p(e10, new StringBuilder("Exception extracting parameters: ")));
                }
            }
        } catch (IOException e11) {
            throw new SignatureException(org.bouncycastle.asn1.a.b(e11, new StringBuilder("IOException decoding parameters: ")));
        }
    }
}
