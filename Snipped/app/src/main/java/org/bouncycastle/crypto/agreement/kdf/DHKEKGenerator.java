package org.bouncycastle.crypto.agreement.kdf;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class DHKEKGenerator implements DerivationFunction {
    private ASN1ObjectIdentifier algorithm;
    private final Digest digest;
    private int keySize;
    private byte[] partyAInfo;

    /* renamed from: z, reason: collision with root package name */
    private byte[] f24787z;

    public DHKEKGenerator(Digest digest) {
        this.digest = digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i9) {
        boolean z10;
        int i10 = i9;
        int i11 = i;
        if (bArr.length - i10 < i11) {
            throw new OutputLengthException("output buffer too small");
        }
        long j10 = i10;
        int digestSize = this.digest.getDigestSize();
        if (j10 > 8589934591L) {
            throw new IllegalArgumentException("Output length too large");
        }
        long j11 = digestSize;
        int i12 = (int) (((j10 + j11) - 1) / j11);
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        int i13 = 0;
        int i14 = 0;
        int i15 = 1;
        while (i14 < i12) {
            Digest digest = this.digest;
            byte[] bArr3 = this.f24787z;
            digest.update(bArr3, i13, bArr3.length);
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            aSN1EncodableVector2.add(this.algorithm);
            aSN1EncodableVector2.add(new DEROctetString(Pack.intToBigEndian(i15)));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
            if (this.partyAInfo != null) {
                z10 = true;
                aSN1EncodableVector.add(new DERTaggedObject(true, i13, (ASN1Encodable) new DEROctetString(this.partyAInfo)));
            } else {
                z10 = true;
            }
            aSN1EncodableVector.add(new DERTaggedObject(z10, 2, new DEROctetString(Pack.intToBigEndian(this.keySize))));
            try {
                byte[] encoded = new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER);
                this.digest.update(encoded, 0, encoded.length);
                this.digest.doFinal(bArr2, 0);
                if (i10 > digestSize) {
                    System.arraycopy(bArr2, 0, bArr, i11, digestSize);
                    i11 += digestSize;
                    i10 -= digestSize;
                } else {
                    System.arraycopy(bArr2, 0, bArr, i11, i10);
                }
                i15++;
                i14++;
                i13 = 0;
            } catch (IOException e10) {
                throw new IllegalArgumentException(a.b(e10, new StringBuilder("unable to encode parameter info: ")));
            }
        }
        this.digest.reset();
        return (int) j10;
    }

    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        DHKDFParameters dHKDFParameters = (DHKDFParameters) derivationParameters;
        this.algorithm = dHKDFParameters.getAlgorithm();
        this.keySize = dHKDFParameters.getKeySize();
        this.f24787z = dHKDFParameters.getZ();
        this.partyAInfo = dHKDFParameters.getExtraInfo();
    }
}
