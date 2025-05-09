package org.bouncycastle.crypto.util;

import java.security.SecureRandom;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.kisa.KISAObjectIdentifiers;
import org.bouncycastle.asn1.misc.CAST5CBCParameters;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RC2CBCParameter;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSEnvelopedGenerator;
import org.bouncycastle.internal.asn1.cms.CCMParameters;
import org.bouncycastle.internal.asn1.cms.GCMParameters;
import org.bouncycastle.tls.AlertDescription;
import org.bouncycastle.tls.HandshakeType;

/* loaded from: classes2.dex */
public class AlgorithmIdentifierFactory {
    static final ASN1ObjectIdentifier IDEA_CBC = a.s(CMSEnvelopedGenerator.IDEA_CBC);
    static final ASN1ObjectIdentifier CAST5_CBC = a.s(CMSEnvelopedGenerator.CAST5_CBC);
    private static final short[] rc2Table = {189, 86, 234, 242, 162, 241, 172, 42, 176, 147, 209, 156, 27, 51, 253, 208, 48, 4, 182, 220, 125, 223, 50, 75, 247, 203, 69, 155, 49, 187, 33, 90, 65, 159, 225, 217, 74, 77, 158, 218, 160, 104, 44, 195, 39, 95, 128, 54, 62, 238, 251, 149, 26, HandshakeType.message_hash, 206, 168, 52, 169, 19, 240, 166, 63, 216, 12, AlertDescription.no_application_protocol, 36, 175, 35, 82, 193, 103, 23, 245, 102, 144, 231, 232, 7, 184, 96, 72, 230, 30, 83, 243, 146, 164, AlertDescription.bad_certificate_hash_value, 140, 8, 21, AlertDescription.unsupported_extension, 134, 0, 132, 250, 244, 127, 138, 66, 25, 246, 219, 205, 20, 141, 80, 18, 186, 60, 6, 78, 236, 179, 53, 17, 161, 136, 142, 43, 148, 153, 183, AlertDescription.bad_certificate_status_response, AlertDescription.certificate_required, 211, 228, 191, 58, 222, 150, 14, 188, 10, 237, 119, 252, 55, 107, 3, 121, 137, 98, 198, 215, 192, 210, 124, 106, 139, 34, 163, 91, 5, 93, 2, 117, 213, 97, 227, 24, 143, 85, 81, 173, 31, 11, 94, 133, 229, 194, 87, 99, 202, 61, 108, 180, 197, 204, AlertDescription.unrecognized_name, 178, 145, 89, 13, 71, 32, 200, 79, 88, 224, 1, 226, 22, 56, 196, AlertDescription.certificate_unobtainable, 59, 15, 101, 70, 190, 126, 45, 123, 130, 249, 64, 181, 29, AlertDescription.unknown_psk_identity, 248, 235, 38, 199, 135, 151, 37, 84, 177, 40, 170, 152, 157, 165, 100, AlertDescription.missing_extension, 122, 212, 16, 129, 68, 239, 73, 214, 174, 46, 221, 118, 92, 47, 167, 28, 201, 9, 105, 154, 131, 207, 41, 57, 185, 233, 76, 255, 67, 171};

    private AlgorithmIdentifierFactory() {
    }

    public static AlgorithmIdentifier generateEncryptionAlgID(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i, SecureRandom secureRandom) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes128_CBC) || aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes192_CBC) || aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes256_CBC) || aSN1ObjectIdentifier.equals((ASN1Primitive) NTTObjectIdentifiers.id_camellia128_cbc) || aSN1ObjectIdentifier.equals((ASN1Primitive) NTTObjectIdentifiers.id_camellia192_cbc) || aSN1ObjectIdentifier.equals((ASN1Primitive) NTTObjectIdentifiers.id_camellia256_cbc) || aSN1ObjectIdentifier.equals((ASN1Primitive) KISAObjectIdentifiers.id_seedCBC)) {
            byte[] bArr = new byte[16];
            secureRandom.nextBytes(bArr);
            return new AlgorithmIdentifier(aSN1ObjectIdentifier, new DEROctetString(bArr));
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes128_GCM) || aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes192_GCM) || aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes256_GCM)) {
            byte[] bArr2 = new byte[12];
            secureRandom.nextBytes(bArr2);
            return new AlgorithmIdentifier(aSN1ObjectIdentifier, new GCMParameters(bArr2, 16));
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes128_CCM) || aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes192_CCM) || aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes256_CCM)) {
            byte[] bArr3 = new byte[8];
            secureRandom.nextBytes(bArr3);
            return new AlgorithmIdentifier(aSN1ObjectIdentifier, new CCMParameters(bArr3, 16));
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.des_EDE3_CBC) || aSN1ObjectIdentifier.equals((ASN1Primitive) IDEA_CBC) || aSN1ObjectIdentifier.equals((ASN1Primitive) OIWObjectIdentifiers.desCBC)) {
            byte[] bArr4 = new byte[8];
            secureRandom.nextBytes(bArr4);
            return new AlgorithmIdentifier(aSN1ObjectIdentifier, new DEROctetString(bArr4));
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) CAST5_CBC)) {
            byte[] bArr5 = new byte[8];
            secureRandom.nextBytes(bArr5);
            return new AlgorithmIdentifier(aSN1ObjectIdentifier, new CAST5CBCParameters(bArr5, i));
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.rc4)) {
            return new AlgorithmIdentifier(aSN1ObjectIdentifier, DERNull.INSTANCE);
        }
        if (!aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.RC2_CBC)) {
            throw new IllegalArgumentException("unable to match algorithm");
        }
        byte[] bArr6 = new byte[8];
        secureRandom.nextBytes(bArr6);
        return new AlgorithmIdentifier(aSN1ObjectIdentifier, new RC2CBCParameter(rc2Table[128], bArr6));
    }
}
