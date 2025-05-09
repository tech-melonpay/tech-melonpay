package org.bouncycastle.tls.crypto;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* loaded from: classes3.dex */
public interface TlsCertificate {
    TlsVerifier createVerifier(short s10);

    byte[] getEncoded();

    byte[] getExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier);

    short getLegacySignatureAlgorithm();

    BigInteger getSerialNumber();

    String getSigAlgOID();

    boolean supportsSignatureAlgorithm(short s10);

    TlsCertificate useInRole(int i, int i9);
}
