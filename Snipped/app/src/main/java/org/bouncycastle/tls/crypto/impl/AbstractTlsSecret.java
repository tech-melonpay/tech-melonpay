package org.bouncycastle.tls.crypto.impl;

import org.bouncycastle.tls.crypto.TlsCertificate;
import org.bouncycastle.tls.crypto.TlsCipher;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.TlsHMAC;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public abstract class AbstractTlsSecret implements TlsSecret {
    protected byte[] data;

    public AbstractTlsSecret(byte[] bArr) {
        this.data = bArr;
    }

    public abstract TlsSecret adoptLocalSecret(byte[] bArr);

    public void checkAlive() {
        if (this.data == null) {
            throw new IllegalStateException("Secret has already been extracted or destroyed");
        }
    }

    public synchronized byte[] copyData() {
        return Arrays.clone(this.data);
    }

    @Override // org.bouncycastle.tls.crypto.TlsSecret
    public TlsCipher createCipher(TlsCryptoParameters tlsCryptoParameters, int i, int i9) {
        return getCrypto().createCipher(tlsCryptoParameters, i, i9);
    }

    @Override // org.bouncycastle.tls.crypto.TlsSecret
    public synchronized void destroy() {
        byte[] bArr = this.data;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            this.data = null;
        }
    }

    @Override // org.bouncycastle.tls.crypto.TlsSecret
    public synchronized byte[] encrypt(TlsCertificate tlsCertificate) {
        TlsEncryptor createEncryptor;
        byte[] bArr;
        checkAlive();
        createEncryptor = getCrypto().createEncryptor(tlsCertificate);
        bArr = this.data;
        return createEncryptor.encrypt(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.tls.crypto.TlsSecret
    public synchronized byte[] extract() {
        byte[] bArr;
        checkAlive();
        bArr = this.data;
        this.data = null;
        return bArr;
    }

    public abstract AbstractTlsCrypto getCrypto();

    @Override // org.bouncycastle.tls.crypto.TlsSecret
    public synchronized TlsSecret hkdfExpand(short s10, byte[] bArr, int i) {
        byte[] bArr2;
        try {
            checkAlive();
            byte[] bArr3 = this.data;
            TlsHMAC createHMAC = getCrypto().createHMAC(s10);
            createHMAC.setKey(bArr3, 0, bArr3.length);
            bArr2 = new byte[i];
            int macLength = createHMAC.getMacLength();
            byte[] bArr4 = new byte[macLength];
            int i9 = 0;
            byte b9 = 0;
            while (i9 < i) {
                if (b9 != 0) {
                    createHMAC.update(bArr4, 0, macLength);
                }
                createHMAC.update(bArr, 0, bArr.length);
                b9 = (byte) (b9 + 1);
                createHMAC.update(new byte[]{b9}, 0, 1);
                createHMAC.calculateMAC(bArr4, 0);
                int min = Math.min(macLength, i - i9);
                System.arraycopy(bArr4, 0, bArr2, i9, min);
                i9 += min;
            }
        } catch (Throwable th) {
            throw th;
        }
        return adoptLocalSecret(bArr2);
    }

    @Override // org.bouncycastle.tls.crypto.TlsSecret
    public synchronized TlsSecret hkdfExtract(short s10, byte[] bArr) {
        TlsHMAC createHMAC;
        checkAlive();
        byte[] bArr2 = this.data;
        createHMAC = getCrypto().createHMAC(s10);
        createHMAC.setKey(bArr2, 0, bArr2.length);
        createHMAC.update(bArr, 0, bArr.length);
        return adoptLocalSecret(createHMAC.calculateMAC());
    }
}
