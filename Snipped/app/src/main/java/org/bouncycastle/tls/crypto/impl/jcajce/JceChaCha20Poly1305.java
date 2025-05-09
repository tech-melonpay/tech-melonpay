package org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.impl.TlsAEADCipherImpl;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class JceChaCha20Poly1305 implements TlsAEADCipherImpl {
    private static final int BUF_SIZE = 32768;
    private static final byte[] ZEROES = new byte[15];
    protected byte[] additionalData;
    protected final Cipher cipher;
    protected SecretKey cipherKey;
    protected final int cipherMode;
    protected final Mac mac;

    public JceChaCha20Poly1305(JcaJceHelper jcaJceHelper, boolean z10) {
        this.cipher = jcaJceHelper.createCipher("ChaCha7539");
        this.mac = jcaJceHelper.createMac("Poly1305");
        this.cipherMode = z10 ? 1 : 2;
    }

    @Override // org.bouncycastle.tls.crypto.impl.TlsAEADCipherImpl
    public int doFinal(byte[] bArr, int i, int i9, byte[] bArr2, int i10) {
        try {
            if (this.cipherMode == 1) {
                int i11 = i9 + 64;
                byte[] bArr3 = new byte[i11];
                System.arraycopy(bArr, i, bArr3, 64, i9);
                int i12 = 0;
                while (i12 < i9 - 32704) {
                    i12 += this.cipher.update(bArr3, i12, 32768, bArr3, i12);
                }
                int update = this.cipher.update(bArr3, i12, i11 - i12, bArr3, i12);
                if (i11 != update + this.cipher.doFinal(bArr3, update) + i12) {
                    throw new IllegalStateException();
                }
                System.arraycopy(bArr3, 64, bArr2, i10, i9);
                initMAC(bArr3);
                byte[] bArr4 = this.additionalData;
                updateMAC(bArr4, 0, bArr4.length);
                updateMAC(bArr3, 64, i9);
                byte[] bArr5 = new byte[16];
                Pack.longToLittleEndian(this.additionalData.length & BodyPartID.bodyIdMax, bArr5, 0);
                Pack.longToLittleEndian(i9 & BodyPartID.bodyIdMax, bArr5, 8);
                this.mac.update(bArr5, 0, 16);
                this.mac.doFinal(bArr2, i10 + i9);
                return i9 + 16;
            }
            int i13 = i9 - 16;
            int i14 = i9 + 48;
            byte[] bArr6 = new byte[i14];
            System.arraycopy(bArr, i, bArr6, 64, i13);
            int i15 = 0;
            while (i15 < i9 - 32720) {
                int i16 = i15;
                byte[] bArr7 = bArr6;
                i15 = i16 + this.cipher.update(bArr6, i16, 32768, bArr7, i16);
                bArr6 = bArr7;
            }
            int i17 = i15;
            byte[] bArr8 = bArr6;
            int update2 = this.cipher.update(bArr8, i17, i14 - i17, bArr8, i17);
            if (i14 != update2 + this.cipher.doFinal(bArr8, update2) + i17) {
                throw new IllegalStateException();
            }
            initMAC(bArr8);
            byte[] bArr9 = this.additionalData;
            updateMAC(bArr9, 0, bArr9.length);
            updateMAC(bArr, i, i13);
            byte[] bArr10 = new byte[16];
            Pack.longToLittleEndian(this.additionalData.length & BodyPartID.bodyIdMax, bArr10, 0);
            Pack.longToLittleEndian(BodyPartID.bodyIdMax & i13, bArr10, 8);
            this.mac.update(bArr10, 0, 16);
            this.mac.doFinal(bArr10, 0);
            if (!Arrays.constantTimeAreEqual(bArr10, TlsUtils.copyOfRangeExact(bArr, i + i13, i + i9))) {
                throw new TlsFatalAlert((short) 20);
            }
            System.arraycopy(bArr8, 64, bArr2, i10, i13);
            return i13;
        } catch (GeneralSecurityException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // org.bouncycastle.tls.crypto.impl.TlsAEADCipherImpl
    public int getOutputSize(int i) {
        return this.cipherMode == 1 ? i + 16 : i - 16;
    }

    @Override // org.bouncycastle.tls.crypto.impl.TlsAEADCipherImpl
    public void init(byte[] bArr, int i, byte[] bArr2) {
        if (bArr == null || bArr.length != 12 || i != 16) {
            throw new TlsFatalAlert((short) 80);
        }
        try {
            this.cipher.init(this.cipherMode, this.cipherKey, new IvParameterSpec(bArr));
            this.additionalData = bArr2;
        } catch (GeneralSecurityException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void initMAC(byte[] bArr) {
        this.mac.init(new SecretKeySpec(bArr, 0, 32, "Poly1305"));
        for (int i = 0; i < 64; i++) {
            bArr[i] = 0;
        }
    }

    @Override // org.bouncycastle.tls.crypto.impl.TlsAEADCipherImpl
    public void setKey(byte[] bArr, int i, int i9) {
        this.cipherKey = new SecretKeySpec(bArr, i, i9, "ChaCha7539");
    }

    public void updateMAC(byte[] bArr, int i, int i9) {
        this.mac.update(bArr, i, i9);
        int i10 = i9 % 16;
        if (i10 != 0) {
            this.mac.update(ZEROES, 0, 16 - i10);
        }
    }
}
