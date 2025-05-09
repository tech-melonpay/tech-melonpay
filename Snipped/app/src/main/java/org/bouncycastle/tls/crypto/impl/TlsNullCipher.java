package org.bouncycastle.tls.crypto.impl;

import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsCipher;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.TlsHMAC;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class TlsNullCipher implements TlsCipher {
    protected final TlsCryptoParameters cryptoParameters;
    protected final TlsSuiteHMac readMac;
    protected final TlsSuiteHMac writeMac;

    public TlsNullCipher(TlsCryptoParameters tlsCryptoParameters, TlsHMAC tlsHMAC, TlsHMAC tlsHMAC2) {
        this.cryptoParameters = tlsCryptoParameters;
        int macLength = tlsHMAC2.getMacLength() + tlsHMAC.getMacLength();
        byte[] calculateKeyBlock = TlsImplUtils.calculateKeyBlock(tlsCryptoParameters, macLength);
        tlsHMAC.setKey(calculateKeyBlock, 0, tlsHMAC.getMacLength());
        int macLength2 = tlsHMAC.getMacLength();
        tlsHMAC2.setKey(calculateKeyBlock, macLength2, tlsHMAC2.getMacLength());
        if (tlsHMAC2.getMacLength() + macLength2 != macLength) {
            throw new TlsFatalAlert((short) 80);
        }
        if (tlsCryptoParameters.isServer()) {
            this.writeMac = new TlsSuiteHMac(tlsCryptoParameters, tlsHMAC2);
            this.readMac = new TlsSuiteHMac(tlsCryptoParameters, tlsHMAC);
        } else {
            this.writeMac = new TlsSuiteHMac(tlsCryptoParameters, tlsHMAC);
            this.readMac = new TlsSuiteHMac(tlsCryptoParameters, tlsHMAC2);
        }
    }

    @Override // org.bouncycastle.tls.crypto.TlsCipher
    public byte[] decodeCiphertext(long j10, short s10, byte[] bArr, int i, int i9) {
        int size = this.readMac.getSize();
        if (i9 < size) {
            throw new TlsFatalAlert((short) 50);
        }
        int i10 = i9 - size;
        int i11 = i + i10;
        if (Arrays.constantTimeAreEqual(TlsUtils.copyOfRangeExact(bArr, i11, i9 + i), this.readMac.calculateMac(j10, s10, bArr, i, i10))) {
            return TlsUtils.copyOfRangeExact(bArr, i, i11);
        }
        throw new TlsFatalAlert((short) 20);
    }

    @Override // org.bouncycastle.tls.crypto.TlsCipher
    public byte[] encodePlaintext(long j10, short s10, byte[] bArr, int i, int i9) {
        byte[] calculateMac = this.writeMac.calculateMac(j10, s10, bArr, i, i9);
        byte[] bArr2 = new byte[calculateMac.length + i9];
        System.arraycopy(bArr, i, bArr2, 0, i9);
        System.arraycopy(calculateMac, 0, bArr2, i9, calculateMac.length);
        return bArr2;
    }

    @Override // org.bouncycastle.tls.crypto.TlsCipher
    public int getCiphertextLimit(int i) {
        return i + this.writeMac.getSize();
    }

    @Override // org.bouncycastle.tls.crypto.TlsCipher
    public int getPlaintextLimit(int i) {
        return i - this.writeMac.getSize();
    }
}
