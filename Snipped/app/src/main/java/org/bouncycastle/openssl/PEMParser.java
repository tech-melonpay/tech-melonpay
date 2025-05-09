package org.bouncycastle.openssl;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.RSAPrivateKey;
import org.bouncycastle.asn1.pkcs.RSAPublicKey;
import org.bouncycastle.asn1.sec.ECPrivateKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DSAParameter;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.cert.X509AttributeCertificateHolder;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.pkcs.PKCS10CertificationRequest;
import org.bouncycastle.pkcs.PKCS8EncryptedPrivateKeyInfo;
import org.bouncycastle.util.encoders.Hex;
import org.bouncycastle.util.io.pem.PemHeader;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemObjectParser;
import org.bouncycastle.util.io.pem.PemReader;
import s3.b;

/* loaded from: classes3.dex */
public class PEMParser extends PemReader {
    private final Map parsers;

    public class DSAKeyPairParser implements PEMKeyPairParser {
        private DSAKeyPairParser() {
        }

        @Override // org.bouncycastle.openssl.PEMKeyPairParser
        public PEMKeyPair parse(byte[] bArr) {
            try {
                ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(bArr);
                if (aSN1Sequence.size() != 6) {
                    throw new PEMException("malformed sequence in DSA private key");
                }
                ASN1Integer aSN1Integer = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
                ASN1Integer aSN1Integer2 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(2));
                ASN1Integer aSN1Integer3 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(3));
                ASN1Integer aSN1Integer4 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(4));
                ASN1Integer aSN1Integer5 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(5));
                ASN1ObjectIdentifier aSN1ObjectIdentifier = X9ObjectIdentifiers.id_dsa;
                return new PEMKeyPair(new SubjectPublicKeyInfo(new AlgorithmIdentifier(aSN1ObjectIdentifier, new DSAParameter(aSN1Integer.getValue(), aSN1Integer2.getValue(), aSN1Integer3.getValue())), aSN1Integer4), new PrivateKeyInfo(new AlgorithmIdentifier(aSN1ObjectIdentifier, new DSAParameter(aSN1Integer.getValue(), aSN1Integer2.getValue(), aSN1Integer3.getValue())), aSN1Integer5));
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new PEMException(a.c(e11, new StringBuilder("problem creating DSA private key: ")), e11);
            }
        }
    }

    public class ECCurveParamsParser implements PemObjectParser {
        private ECCurveParamsParser() {
        }

        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) {
            try {
                ASN1Primitive fromByteArray = ASN1Primitive.fromByteArray(pemObject.getContent());
                if (fromByteArray instanceof ASN1ObjectIdentifier) {
                    return ASN1Primitive.fromByteArray(pemObject.getContent());
                }
                if (fromByteArray instanceof ASN1Sequence) {
                    return X9ECParameters.getInstance(fromByteArray);
                }
                return null;
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new PEMException(a.c(e11, new StringBuilder("exception extracting EC named curve: ")));
            }
        }
    }

    public class ECDSAKeyPairParser implements PEMKeyPairParser {
        private ECDSAKeyPairParser() {
        }

        @Override // org.bouncycastle.openssl.PEMKeyPairParser
        public PEMKeyPair parse(byte[] bArr) {
            try {
                ECPrivateKey eCPrivateKey = ECPrivateKey.getInstance(ASN1Sequence.getInstance(bArr));
                AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, eCPrivateKey.getParameters());
                PrivateKeyInfo privateKeyInfo = new PrivateKeyInfo(algorithmIdentifier, eCPrivateKey);
                return eCPrivateKey.getPublicKey() != null ? new PEMKeyPair(new SubjectPublicKeyInfo(algorithmIdentifier, eCPrivateKey.getPublicKey().getBytes()), privateKeyInfo) : new PEMKeyPair(null, privateKeyInfo);
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new PEMException(a.c(e11, new StringBuilder("problem creating EC private key: ")), e11);
            }
        }
    }

    public class EncryptedPrivateKeyParser implements PemObjectParser {
        public EncryptedPrivateKeyParser() {
        }

        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) {
            try {
                return new PKCS8EncryptedPrivateKeyInfo(EncryptedPrivateKeyInfo.getInstance(pemObject.getContent()));
            } catch (Exception e10) {
                throw new PEMException(a.c(e10, new StringBuilder("problem parsing ENCRYPTED PRIVATE KEY: ")), e10);
            }
        }
    }

    public class KeyPairParser implements PemObjectParser {
        private final PEMKeyPairParser pemKeyPairParser;

        public KeyPairParser(PEMKeyPairParser pEMKeyPairParser) {
            this.pemKeyPairParser = pEMKeyPairParser;
        }

        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) {
            boolean z10 = false;
            String str = null;
            for (PemHeader pemHeader : pemObject.getHeaders()) {
                if (pemHeader.getName().equals("Proc-Type") && pemHeader.getValue().equals("4,ENCRYPTED")) {
                    z10 = true;
                } else if (pemHeader.getName().equals("DEK-Info")) {
                    str = pemHeader.getValue();
                }
            }
            byte[] content = pemObject.getContent();
            try {
                if (!z10) {
                    return this.pemKeyPairParser.parse(content);
                }
                StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
                return new PEMEncryptedKeyPair(stringTokenizer.nextToken(), Hex.decode(stringTokenizer.nextToken()), content, this.pemKeyPairParser);
            } catch (IOException e10) {
                if (z10) {
                    throw new PEMException("exception decoding - please check password and data.", e10);
                }
                throw new PEMException(e10.getMessage(), e10);
            } catch (IllegalArgumentException e11) {
                if (z10) {
                    throw new PEMException("exception decoding - please check password and data.", e11);
                }
                throw new PEMException(e11.getMessage(), e11);
            }
        }
    }

    public class PKCS10CertificationRequestParser implements PemObjectParser {
        private PKCS10CertificationRequestParser() {
        }

        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) {
            try {
                return new PKCS10CertificationRequest(pemObject.getContent());
            } catch (Exception e10) {
                throw new PEMException(a.c(e10, new StringBuilder("problem parsing certrequest: ")), e10);
            }
        }
    }

    public class PKCS7Parser implements PemObjectParser {
        private PKCS7Parser() {
        }

        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) {
            try {
                return ContentInfo.getInstance(new ASN1InputStream(pemObject.getContent()).readObject());
            } catch (Exception e10) {
                throw new PEMException(a.c(e10, new StringBuilder("problem parsing PKCS7 object: ")), e10);
            }
        }
    }

    public class PrivateKeyParser implements PemObjectParser {
        public PrivateKeyParser() {
        }

        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) {
            try {
                return PrivateKeyInfo.getInstance(pemObject.getContent());
            } catch (Exception e10) {
                throw new PEMException(a.c(e10, new StringBuilder("problem parsing PRIVATE KEY: ")), e10);
            }
        }
    }

    public class PublicKeyParser implements PemObjectParser {
        public PublicKeyParser() {
        }

        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) {
            return SubjectPublicKeyInfo.getInstance(pemObject.getContent());
        }
    }

    public class RSAKeyPairParser implements PEMKeyPairParser {
        private RSAKeyPairParser() {
        }

        @Override // org.bouncycastle.openssl.PEMKeyPairParser
        public PEMKeyPair parse(byte[] bArr) {
            try {
                ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(bArr);
                if (aSN1Sequence.size() != 9) {
                    throw new PEMException("malformed sequence in RSA private key");
                }
                RSAPrivateKey rSAPrivateKey = RSAPrivateKey.getInstance(aSN1Sequence);
                RSAPublicKey rSAPublicKey = new RSAPublicKey(rSAPrivateKey.getModulus(), rSAPrivateKey.getPublicExponent());
                AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, DERNull.INSTANCE);
                return new PEMKeyPair(new SubjectPublicKeyInfo(algorithmIdentifier, rSAPublicKey), new PrivateKeyInfo(algorithmIdentifier, rSAPrivateKey));
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new PEMException(a.c(e11, new StringBuilder("problem creating RSA private key: ")), e11);
            }
        }
    }

    public class RSAPublicKeyParser implements PemObjectParser {
        public RSAPublicKeyParser() {
        }

        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) {
            try {
                return new SubjectPublicKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, DERNull.INSTANCE), RSAPublicKey.getInstance(pemObject.getContent()));
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new PEMException(a.c(e11, new StringBuilder("problem extracting key: ")), e11);
            }
        }
    }

    public class X509AttributeCertificateParser implements PemObjectParser {
        private X509AttributeCertificateParser() {
        }

        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) {
            return new X509AttributeCertificateHolder(pemObject.getContent());
        }
    }

    public class X509CRLParser implements PemObjectParser {
        private X509CRLParser() {
        }

        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) {
            try {
                return new X509CRLHolder(pemObject.getContent());
            } catch (Exception e10) {
                throw new PEMException(a.c(e10, new StringBuilder("problem parsing cert: ")), e10);
            }
        }
    }

    public class X509CertificateParser implements PemObjectParser {
        private X509CertificateParser() {
        }

        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) {
            try {
                return new X509CertificateHolder(pemObject.getContent());
            } catch (Exception e10) {
                throw new PEMException(a.c(e10, new StringBuilder("problem parsing cert: ")), e10);
            }
        }
    }

    public class X509TrustedCertificateParser implements PemObjectParser {
        private X509TrustedCertificateParser() {
        }

        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) {
            try {
                return new X509TrustedCertificateBlock(pemObject.getContent());
            } catch (Exception e10) {
                throw new PEMException(a.c(e10, new StringBuilder("problem parsing cert: ")), e10);
            }
        }
    }

    public PEMParser(Reader reader) {
        super(reader);
        HashMap hashMap = new HashMap();
        this.parsers = hashMap;
        hashMap.put("CERTIFICATE REQUEST", new PKCS10CertificationRequestParser());
        hashMap.put("NEW CERTIFICATE REQUEST", new PKCS10CertificationRequestParser());
        hashMap.put("CERTIFICATE", new X509CertificateParser());
        hashMap.put("TRUSTED CERTIFICATE", new X509TrustedCertificateParser());
        hashMap.put("X509 CERTIFICATE", new X509CertificateParser());
        hashMap.put("X509 CRL", new X509CRLParser());
        hashMap.put("PKCS7", new PKCS7Parser());
        hashMap.put("CMS", new PKCS7Parser());
        hashMap.put("ATTRIBUTE CERTIFICATE", new X509AttributeCertificateParser());
        hashMap.put("EC PARAMETERS", new ECCurveParamsParser());
        hashMap.put("PUBLIC KEY", new PublicKeyParser());
        hashMap.put("RSA PUBLIC KEY", new RSAPublicKeyParser());
        hashMap.put("RSA PRIVATE KEY", new KeyPairParser(new RSAKeyPairParser()));
        hashMap.put("DSA PRIVATE KEY", new KeyPairParser(new DSAKeyPairParser()));
        hashMap.put("EC PRIVATE KEY", new KeyPairParser(new ECDSAKeyPairParser()));
        hashMap.put("ENCRYPTED PRIVATE KEY", new EncryptedPrivateKeyParser());
        hashMap.put("PRIVATE KEY", new PrivateKeyParser());
    }

    public Object readObject() {
        PemObject readPemObject = readPemObject();
        if (readPemObject == null) {
            return null;
        }
        String type = readPemObject.getType();
        if (this.parsers.containsKey(type)) {
            return ((PemObjectParser) this.parsers.get(type)).parseObject(readPemObject);
        }
        throw new IOException(b.j("unrecognised object: ", type));
    }
}
