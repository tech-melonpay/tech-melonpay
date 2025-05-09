package org.bouncycastle.crypto.encodings;

import java.math.BigInteger;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.jmrtd.PassportService;

/* loaded from: classes2.dex */
public class ISO9796d1Encoding implements AsymmetricBlockCipher {
    private int bitSize;
    private AsymmetricBlockCipher engine;
    private boolean forEncryption;
    private BigInteger modulus;
    private int padBits = 0;
    private static final BigInteger SIXTEEN = BigInteger.valueOf(16);
    private static final BigInteger SIX = BigInteger.valueOf(6);
    private static byte[] shadows = {14, 3, 5, 8, 9, 4, 2, PassportService.SFI_DG15, 0, PassportService.SFI_DG13, PassportService.SFI_DG11, 6, 7, 10, PassportService.SFI_DG12, 1};
    private static byte[] inverse = {8, PassportService.SFI_DG15, 6, 1, 5, 2, PassportService.SFI_DG11, PassportService.SFI_DG12, 3, 4, PassportService.SFI_DG13, 10, 14, 9, 0, 7};

    public ISO9796d1Encoding(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.engine = asymmetricBlockCipher;
    }

    private static byte[] convertOutputDecryptOnly(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] != 0) {
            return byteArray;
        }
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }

    private byte[] decodeBlock(byte[] bArr, int i, int i9) {
        byte[] processBlock = this.engine.processBlock(bArr, i, i9);
        int i10 = (this.bitSize + 13) / 16;
        BigInteger bigInteger = new BigInteger(1, processBlock);
        BigInteger bigInteger2 = SIXTEEN;
        BigInteger mod = bigInteger.mod(bigInteger2);
        BigInteger bigInteger3 = SIX;
        if (!mod.equals(bigInteger3)) {
            if (!this.modulus.subtract(bigInteger).mod(bigInteger2).equals(bigInteger3)) {
                throw new InvalidCipherTextException("resulting integer iS or (modulus - iS) is not congruent to 6 mod 16");
            }
            bigInteger = this.modulus.subtract(bigInteger);
        }
        byte[] convertOutputDecryptOnly = convertOutputDecryptOnly(bigInteger);
        if ((convertOutputDecryptOnly[convertOutputDecryptOnly.length - 1] & PassportService.SFI_DG15) != 6) {
            throw new InvalidCipherTextException("invalid forcing byte in block");
        }
        convertOutputDecryptOnly[convertOutputDecryptOnly.length - 1] = (byte) (((convertOutputDecryptOnly[convertOutputDecryptOnly.length - 1] & 255) >>> 4) | (inverse[(convertOutputDecryptOnly[convertOutputDecryptOnly.length - 2] & 255) >> 4] << 4));
        byte[] bArr2 = shadows;
        byte b9 = convertOutputDecryptOnly[1];
        byte b10 = (byte) (bArr2[b9 & PassportService.SFI_DG15] | (bArr2[(b9 & 255) >>> 4] << 4));
        convertOutputDecryptOnly[0] = b10;
        int i11 = 1;
        int i12 = 0;
        boolean z10 = false;
        for (int length = convertOutputDecryptOnly.length - 1; length >= convertOutputDecryptOnly.length - (i10 * 2); length -= 2) {
            byte[] bArr3 = shadows;
            byte b11 = convertOutputDecryptOnly[length];
            int i13 = bArr3[b11 & PassportService.SFI_DG15] | (bArr3[(b11 & 255) >>> 4] << 4);
            int i14 = length - 1;
            byte b12 = convertOutputDecryptOnly[i14];
            if (((b12 ^ i13) & 255) != 0) {
                if (z10) {
                    throw new InvalidCipherTextException("invalid tsums in block");
                }
                i11 = (b12 ^ i13) & 255;
                z10 = true;
                i12 = i14;
            }
        }
        convertOutputDecryptOnly[i12] = 0;
        int length2 = (convertOutputDecryptOnly.length - i12) / 2;
        byte[] bArr4 = new byte[length2];
        for (int i15 = 0; i15 < length2; i15++) {
            bArr4[i15] = convertOutputDecryptOnly[(i15 * 2) + i12 + 1];
        }
        this.padBits = i11 - 1;
        return bArr4;
    }

    private byte[] encodeBlock(byte[] bArr, int i, int i9) {
        int i10 = this.bitSize;
        int i11 = (i10 + 7) / 8;
        byte[] bArr2 = new byte[i11];
        int i12 = 1;
        int i13 = this.padBits + 1;
        int i14 = (i10 + 13) / 16;
        int i15 = 0;
        while (i15 < i14) {
            if (i15 > i14 - i9) {
                int i16 = i14 - i15;
                System.arraycopy(bArr, (i + i9) - i16, bArr2, i11 - i14, i16);
            } else {
                System.arraycopy(bArr, i, bArr2, i11 - (i15 + i9), i9);
            }
            i15 += i9;
        }
        for (int i17 = i11 - (i14 * 2); i17 != i11; i17 += 2) {
            byte b9 = bArr2[(i17 / 2) + (i11 - i14)];
            byte[] bArr3 = shadows;
            bArr2[i17] = (byte) (bArr3[b9 & PassportService.SFI_DG15] | (bArr3[(b9 & 255) >>> 4] << 4));
            bArr2[i17 + 1] = b9;
        }
        int i18 = i11 - (i9 * 2);
        bArr2[i18] = (byte) (bArr2[i18] ^ i13);
        int i19 = i11 - 1;
        bArr2[i19] = (byte) ((bArr2[i19] << 4) | 6);
        int i20 = 8 - ((this.bitSize - 1) % 8);
        if (i20 != 8) {
            byte b10 = (byte) (bArr2[0] & (255 >>> i20));
            bArr2[0] = b10;
            bArr2[0] = (byte) ((128 >>> i20) | b10);
            i12 = 0;
        } else {
            bArr2[0] = 0;
            bArr2[1] = (byte) (bArr2[1] | ISOFileInfo.DATA_BYTES1);
        }
        return this.engine.processBlock(bArr2, i12, i11 - i12);
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.engine.getInputBlockSize();
        return this.forEncryption ? (inputBlockSize + 1) / 2 : inputBlockSize;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.engine.getOutputBlockSize();
        return this.forEncryption ? outputBlockSize : (outputBlockSize + 1) / 2;
    }

    public int getPadBits() {
        return this.padBits;
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        RSAKeyParameters rSAKeyParameters = cipherParameters instanceof ParametersWithRandom ? (RSAKeyParameters) ((ParametersWithRandom) cipherParameters).getParameters() : (RSAKeyParameters) cipherParameters;
        this.engine.init(z10, cipherParameters);
        BigInteger modulus = rSAKeyParameters.getModulus();
        this.modulus = modulus;
        this.bitSize = modulus.bitLength();
        this.forEncryption = z10;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i, int i9) {
        return this.forEncryption ? encodeBlock(bArr, i, i9) : decodeBlock(bArr, i, i9);
    }

    public void setPadBits(int i) {
        if (i > 7) {
            throw new IllegalArgumentException("padBits > 7");
        }
        this.padBits = i;
    }
}
