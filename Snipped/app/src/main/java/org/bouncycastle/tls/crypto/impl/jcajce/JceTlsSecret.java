package org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.tls.crypto.impl.AbstractTlsCrypto;
import org.bouncycastle.tls.crypto.impl.AbstractTlsSecret;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import s3.b;

/* loaded from: classes3.dex */
public class JceTlsSecret extends AbstractTlsSecret {
    protected final JcaTlsCrypto crypto;

    public JceTlsSecret(JcaTlsCrypto jcaTlsCrypto, byte[] bArr) {
        super(bArr);
        this.crypto = jcaTlsCrypto;
    }

    @Override // org.bouncycastle.tls.crypto.impl.AbstractTlsSecret
    public TlsSecret adoptLocalSecret(byte[] bArr) {
        return this.crypto.adoptLocalSecret(bArr);
    }

    @Override // org.bouncycastle.tls.crypto.TlsSecret
    public synchronized TlsSecret deriveUsingPRF(int i, String str, byte[] bArr, int i9) {
        byte[] concatenate;
        try {
            checkAlive();
            concatenate = Arrays.concatenate(Strings.toByteArray(str), bArr);
            try {
            } catch (GeneralSecurityException unused) {
                throw new IllegalStateException();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.crypto.adoptLocalSecret(i == 0 ? prf_1_0(this.data, concatenate, i9) : prf_1_2(i, this.data, concatenate, i9));
    }

    @Override // org.bouncycastle.tls.crypto.impl.AbstractTlsSecret
    public AbstractTlsCrypto getCrypto() {
        return this.crypto;
    }

    public void hmacHash(String str, byte[] bArr, int i, int i9, byte[] bArr2, byte[] bArr3) {
        String j10 = b.j("Hmac", str);
        Mac createMac = this.crypto.getHelper().createMac(j10);
        createMac.init(new SecretKeySpec(bArr, i, i9, j10));
        int macLength = createMac.getMacLength();
        byte[] bArr4 = new byte[macLength];
        byte[] bArr5 = new byte[macLength];
        int i10 = 0;
        byte[] bArr6 = bArr2;
        while (i10 < bArr3.length) {
            createMac.update(bArr6, 0, bArr6.length);
            createMac.doFinal(bArr4, 0);
            createMac.update(bArr4, 0, macLength);
            createMac.update(bArr2, 0, bArr2.length);
            createMac.doFinal(bArr5, 0);
            System.arraycopy(bArr5, 0, bArr3, i10, Math.min(macLength, bArr3.length - i10));
            i10 += macLength;
            bArr6 = bArr4;
        }
    }

    public byte[] prf_1_0(byte[] bArr, byte[] bArr2, int i) {
        int length = (bArr.length + 1) / 2;
        byte[] bArr3 = new byte[i];
        hmacHash("MD5", bArr, 0, length, bArr2, bArr3);
        byte[] bArr4 = new byte[i];
        hmacHash("SHA1", bArr, bArr.length - length, length, bArr2, bArr4);
        for (int i9 = 0; i9 < i; i9++) {
            bArr3[i9] = (byte) (bArr3[i9] ^ bArr4[i9]);
        }
        return bArr3;
    }

    public byte[] prf_1_2(int i, byte[] bArr, byte[] bArr2, int i9) {
        String replaceAll = this.crypto.getDigestName(TlsUtils.getHashAlgorithmForPRFAlgorithm(i)).replaceAll("-", "");
        byte[] bArr3 = new byte[i9];
        hmacHash(replaceAll, bArr, 0, bArr.length, bArr2, bArr3);
        return bArr3;
    }
}
