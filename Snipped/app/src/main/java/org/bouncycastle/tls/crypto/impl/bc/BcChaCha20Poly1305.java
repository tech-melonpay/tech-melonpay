package org.bouncycastle.tls.crypto.impl.bc;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.engines.ChaCha7539Engine;
import org.bouncycastle.crypto.macs.Poly1305;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.impl.TlsAEADCipherImpl;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class BcChaCha20Poly1305 implements TlsAEADCipherImpl {
    private static final byte[] ZEROES = new byte[15];
    protected int additionalDataLength;
    protected final boolean isEncrypting;
    protected final ChaCha7539Engine cipher = new ChaCha7539Engine();
    protected final Poly1305 mac = new Poly1305();

    public BcChaCha20Poly1305(boolean z10) {
        this.isEncrypting = z10;
    }

    @Override // org.bouncycastle.tls.crypto.impl.TlsAEADCipherImpl
    public int doFinal(byte[] bArr, int i, int i9, byte[] bArr2, int i10) {
        if (this.isEncrypting) {
            if (i9 != this.cipher.processBytes(bArr, i, i9, bArr2, i10)) {
                throw new IllegalStateException();
            }
            updateMAC(bArr2, i10, i9);
            byte[] bArr3 = new byte[16];
            Pack.longToLittleEndian(this.additionalDataLength & BodyPartID.bodyIdMax, bArr3, 0);
            Pack.longToLittleEndian(i9 & BodyPartID.bodyIdMax, bArr3, 8);
            this.mac.update(bArr3, 0, 16);
            this.mac.doFinal(bArr2, i10 + i9);
            return i9 + 16;
        }
        int i11 = i9 - 16;
        updateMAC(bArr, i, i11);
        byte[] bArr4 = new byte[16];
        Pack.longToLittleEndian(this.additionalDataLength & BodyPartID.bodyIdMax, bArr4, 0);
        Pack.longToLittleEndian(i11 & BodyPartID.bodyIdMax, bArr4, 8);
        this.mac.update(bArr4, 0, 16);
        this.mac.doFinal(bArr4, 0);
        if (!Arrays.constantTimeAreEqual(bArr4, TlsUtils.copyOfRangeExact(bArr, i + i11, i + i9))) {
            throw new TlsFatalAlert((short) 20);
        }
        if (i11 == this.cipher.processBytes(bArr, i, i11, bArr2, i10)) {
            return i11;
        }
        throw new IllegalStateException();
    }

    @Override // org.bouncycastle.tls.crypto.impl.TlsAEADCipherImpl
    public int getOutputSize(int i) {
        return this.isEncrypting ? i + 16 : i - 16;
    }

    @Override // org.bouncycastle.tls.crypto.impl.TlsAEADCipherImpl
    public void init(byte[] bArr, int i, byte[] bArr2) {
        if (bArr == null || bArr.length != 12 || i != 16) {
            throw new TlsFatalAlert((short) 80);
        }
        this.cipher.init(this.isEncrypting, new ParametersWithIV(null, bArr));
        initMAC();
        if (bArr2 == null) {
            this.additionalDataLength = 0;
        } else {
            this.additionalDataLength = bArr2.length;
            updateMAC(bArr2, 0, bArr2.length);
        }
    }

    public void initMAC() {
        byte[] bArr = new byte[64];
        this.cipher.processBytes(bArr, 0, 64, bArr, 0);
        this.mac.init(new KeyParameter(bArr, 0, 32));
        Arrays.fill(bArr, (byte) 0);
    }

    @Override // org.bouncycastle.tls.crypto.impl.TlsAEADCipherImpl
    public void setKey(byte[] bArr, int i, int i9) {
        this.cipher.init(this.isEncrypting, new ParametersWithIV(new KeyParameter(bArr, i, i9), ZEROES, 0, 12));
    }

    public void updateMAC(byte[] bArr, int i, int i9) {
        this.mac.update(bArr, i, i9);
        int i10 = i9 % 16;
        if (i10 != 0) {
            this.mac.update(ZEROES, 0, 16 - i10);
        }
    }
}
