package org.bouncycastle.eac.operator.jcajce;

import java.io.OutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.eac.operator.EACSigner;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.OperatorStreamException;
import org.bouncycastle.operator.RuntimeOperatorException;

/* loaded from: classes2.dex */
public class JcaEACSignerBuilder {
    private static final Hashtable sigNames;
    private EACHelper helper = new DefaultEACHelper();

    public class SignatureOutputStream extends OutputStream {
        private Signature sig;

        public SignatureOutputStream(Signature signature) {
            this.sig = signature;
        }

        public byte[] getSignature() {
            return this.sig.sign();
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            try {
                this.sig.update((byte) i);
            } catch (SignatureException e10) {
                throw new OperatorStreamException("exception in content signer: " + e10.getMessage(), e10);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            try {
                this.sig.update(bArr);
            } catch (SignatureException e10) {
                throw new OperatorStreamException("exception in content signer: " + e10.getMessage(), e10);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i9) {
            try {
                this.sig.update(bArr, i, i9);
            } catch (SignatureException e10) {
                throw new OperatorStreamException("exception in content signer: " + e10.getMessage(), e10);
            }
        }
    }

    static {
        Hashtable hashtable = new Hashtable();
        sigNames = hashtable;
        hashtable.put("SHA1withRSA", EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_1);
        hashtable.put("SHA256withRSA", EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_256);
        hashtable.put("SHA1withRSAandMGF1", EACObjectIdentifiers.id_TA_RSA_PSS_SHA_1);
        hashtable.put("SHA256withRSAandMGF1", EACObjectIdentifiers.id_TA_RSA_PSS_SHA_256);
        hashtable.put("SHA512withRSA", EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_512);
        hashtable.put("SHA512withRSAandMGF1", EACObjectIdentifiers.id_TA_RSA_PSS_SHA_512);
        hashtable.put("SHA1withECDSA", EACObjectIdentifiers.id_TA_ECDSA_SHA_1);
        hashtable.put("SHA224withECDSA", EACObjectIdentifiers.id_TA_ECDSA_SHA_224);
        hashtable.put("SHA256withECDSA", EACObjectIdentifiers.id_TA_ECDSA_SHA_256);
        hashtable.put("SHA384withECDSA", EACObjectIdentifiers.id_TA_ECDSA_SHA_384);
        hashtable.put("SHA512withECDSA", EACObjectIdentifiers.id_TA_ECDSA_SHA_512);
    }

    private static void copyUnsignedInt(byte[] bArr, byte[] bArr2, int i) {
        int length = bArr.length;
        int i9 = 0;
        if (bArr[0] == 0) {
            length--;
            i9 = 1;
        }
        System.arraycopy(bArr, i9, bArr2, i, length);
    }

    public static int max(int i, int i9) {
        return i > i9 ? i : i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] reencode(byte[] bArr) {
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(bArr);
        BigInteger value = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).getValue();
        BigInteger value2 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).getValue();
        byte[] byteArray = value.toByteArray();
        byte[] byteArray2 = value2.toByteArray();
        int unsignedIntLength = unsignedIntLength(byteArray);
        int unsignedIntLength2 = unsignedIntLength(byteArray2);
        int max = max(unsignedIntLength, unsignedIntLength2);
        int i = max * 2;
        byte[] bArr2 = new byte[i];
        Arrays.fill(bArr2, (byte) 0);
        copyUnsignedInt(byteArray, bArr2, max - unsignedIntLength);
        copyUnsignedInt(byteArray2, bArr2, i - unsignedIntLength2);
        return bArr2;
    }

    private static int unsignedIntLength(byte[] bArr) {
        int length = bArr.length;
        return bArr[0] == 0 ? length - 1 : length;
    }

    public EACSigner build(String str, PrivateKey privateKey) {
        return build((ASN1ObjectIdentifier) sigNames.get(str), privateKey);
    }

    public JcaEACSignerBuilder setProvider(String str) {
        this.helper = new NamedEACHelper(str);
        return this;
    }

    public EACSigner build(final ASN1ObjectIdentifier aSN1ObjectIdentifier, PrivateKey privateKey) {
        try {
            Signature signature = this.helper.getSignature(aSN1ObjectIdentifier);
            signature.initSign(privateKey);
            final SignatureOutputStream signatureOutputStream = new SignatureOutputStream(signature);
            return new EACSigner() { // from class: org.bouncycastle.eac.operator.jcajce.JcaEACSignerBuilder.1
                @Override // org.bouncycastle.eac.operator.EACSigner
                public OutputStream getOutputStream() {
                    return signatureOutputStream;
                }

                @Override // org.bouncycastle.eac.operator.EACSigner
                public byte[] getSignature() {
                    try {
                        byte[] signature2 = signatureOutputStream.getSignature();
                        return aSN1ObjectIdentifier.on(EACObjectIdentifiers.id_TA_ECDSA) ? JcaEACSignerBuilder.reencode(signature2) : signature2;
                    } catch (SignatureException e10) {
                        throw new RuntimeOperatorException("exception obtaining signature: " + e10.getMessage(), e10);
                    }
                }

                @Override // org.bouncycastle.eac.operator.EACSigner
                public ASN1ObjectIdentifier getUsageIdentifier() {
                    return aSN1ObjectIdentifier;
                }
            };
        } catch (InvalidKeyException e10) {
            throw new OperatorCreationException("invalid key: " + e10.getMessage(), e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new OperatorCreationException("unable to find algorithm: " + e11.getMessage(), e11);
        } catch (NoSuchProviderException e12) {
            throw new OperatorCreationException("unable to find provider: " + e12.getMessage(), e12);
        }
    }

    public JcaEACSignerBuilder setProvider(Provider provider) {
        this.helper = new ProviderEACHelper(provider);
        return this;
    }
}
