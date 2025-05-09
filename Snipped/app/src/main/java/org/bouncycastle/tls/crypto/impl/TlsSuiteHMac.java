package org.bouncycastle.tls.crypto.impl;

import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.TlsHMAC;
import org.bouncycastle.tls.crypto.TlsMAC;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class TlsSuiteHMac implements TlsSuiteMac {
    protected final TlsCryptoParameters cryptoParams;
    protected final int digestBlockSize;
    protected final int digestOverhead;
    protected final TlsHMAC mac;
    protected final int macSize;

    public TlsSuiteHMac(TlsCryptoParameters tlsCryptoParameters, TlsHMAC tlsHMAC) {
        this.cryptoParams = tlsCryptoParameters;
        this.mac = tlsHMAC;
        this.macSize = getMacSize(tlsCryptoParameters, tlsHMAC);
        int internalBlockSize = tlsHMAC.getInternalBlockSize();
        this.digestBlockSize = internalBlockSize;
        this.digestOverhead = internalBlockSize / 8;
    }

    public static int getMacSize(TlsCryptoParameters tlsCryptoParameters, TlsMAC tlsMAC) {
        int macLength = tlsMAC.getMacLength();
        return tlsCryptoParameters.getSecurityParametersHandshake().isTruncatedHMac() ? Math.min(macLength, 10) : macLength;
    }

    @Override // org.bouncycastle.tls.crypto.impl.TlsSuiteMac
    public byte[] calculateMac(long j10, short s10, byte[] bArr, int i, int i9) {
        byte[] bArr2 = new byte[13];
        TlsUtils.writeUint64(j10, bArr2, 0);
        TlsUtils.writeUint8(s10, bArr2, 8);
        TlsUtils.writeVersion(this.cryptoParams.getServerVersion(), bArr2, 9);
        TlsUtils.writeUint16(i9, bArr2, 11);
        this.mac.update(bArr2, 0, 13);
        this.mac.update(bArr, i, i9);
        return truncate(this.mac.calculateMAC());
    }

    @Override // org.bouncycastle.tls.crypto.impl.TlsSuiteMac
    public byte[] calculateMacConstantTime(long j10, short s10, byte[] bArr, int i, int i9, int i10, byte[] bArr2) {
        byte[] calculateMac = calculateMac(j10, s10, bArr, i, i9);
        int digestBlockCount = getDigestBlockCount(i10 + 13) - getDigestBlockCount(i9 + 13);
        while (true) {
            digestBlockCount--;
            if (digestBlockCount < 0) {
                this.mac.update(bArr2, 0, 1);
                this.mac.reset();
                return calculateMac;
            }
            this.mac.update(bArr2, 0, this.digestBlockSize);
        }
    }

    public int getDigestBlockCount(int i) {
        return (i + this.digestOverhead) / this.digestBlockSize;
    }

    @Override // org.bouncycastle.tls.crypto.impl.TlsSuiteMac
    public int getSize() {
        return this.macSize;
    }

    public byte[] truncate(byte[] bArr) {
        int length = bArr.length;
        int i = this.macSize;
        return length <= i ? bArr : Arrays.copyOf(bArr, i);
    }
}
