package org.bouncycastle.tls.crypto.impl.bc;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.tls.crypto.impl.AbstractTlsCrypto;
import org.bouncycastle.tls.crypto.impl.AbstractTlsSecret;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: classes3.dex */
public class BcTlsSecret extends AbstractTlsSecret {
    protected final BcTlsCrypto crypto;

    public BcTlsSecret(BcTlsCrypto bcTlsCrypto, byte[] bArr) {
        super(bArr);
        this.crypto = bcTlsCrypto;
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
        } catch (Throwable th) {
            throw th;
        }
        return this.crypto.adoptLocalSecret(i == 0 ? prf_1_0(this.data, concatenate, i9) : prf_1_2(i, this.data, concatenate, i9));
    }

    @Override // org.bouncycastle.tls.crypto.impl.AbstractTlsSecret
    public AbstractTlsCrypto getCrypto() {
        return this.crypto;
    }

    public void hmacHash(Digest digest, byte[] bArr, int i, int i9, byte[] bArr2, byte[] bArr3) {
        HMac hMac = new HMac(digest);
        hMac.init(new KeyParameter(bArr, i, i9));
        int macSize = hMac.getMacSize();
        byte[] bArr4 = new byte[macSize];
        byte[] bArr5 = new byte[macSize];
        int i10 = 0;
        byte[] bArr6 = bArr2;
        while (i10 < bArr3.length) {
            hMac.update(bArr6, 0, bArr6.length);
            hMac.doFinal(bArr4, 0);
            hMac.update(bArr4, 0, macSize);
            hMac.update(bArr2, 0, bArr2.length);
            hMac.doFinal(bArr5, 0);
            System.arraycopy(bArr5, 0, bArr3, i10, Math.min(macSize, bArr3.length - i10));
            i10 += macSize;
            bArr6 = bArr4;
        }
    }

    public byte[] prf_1_0(byte[] bArr, byte[] bArr2, int i) {
        int length = (bArr.length + 1) / 2;
        byte[] bArr3 = new byte[i];
        hmacHash(this.crypto.createDigest((short) 1), bArr, 0, length, bArr2, bArr3);
        byte[] bArr4 = new byte[i];
        hmacHash(this.crypto.createDigest((short) 2), bArr, bArr.length - length, length, bArr2, bArr4);
        for (int i9 = 0; i9 < i; i9++) {
            bArr3[i9] = (byte) (bArr3[i9] ^ bArr4[i9]);
        }
        return bArr3;
    }

    public byte[] prf_1_2(int i, byte[] bArr, byte[] bArr2, int i9) {
        Digest createDigest = this.crypto.createDigest(TlsUtils.getHashAlgorithmForPRFAlgorithm(i));
        byte[] bArr3 = new byte[i9];
        hmacHash(createDigest, bArr, 0, bArr.length, bArr2, bArr3);
        return bArr3;
    }
}
