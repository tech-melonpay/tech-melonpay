package org.bouncycastle.crypto.engines;

import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.tls.AlertDescription;
import org.bouncycastle.tls.HandshakeType;

/* loaded from: classes2.dex */
public class SkipjackEngine implements BlockCipher {
    static final int BLOCK_SIZE = 8;
    static short[] ftable = {163, 215, 9, 131, 248, 72, 246, 244, 179, 33, 21, AlertDescription.no_application_protocol, 153, 177, 175, 249, 231, 45, 77, 138, 206, 76, 202, 46, 82, 149, 217, 30, 78, 56, 68, 40, 10, 223, 2, 160, 23, 241, 96, 104, 18, 183, 122, 195, 233, 250, 61, 83, 150, 132, 107, 186, 242, 99, 154, 25, 124, 174, 229, 245, 247, 22, 106, 162, 57, 182, 123, 15, 193, 147, 129, 27, 238, 180, 26, 234, 208, 145, 47, 184, 85, 185, 218, 133, 63, 65, 191, 224, 90, 88, 128, 95, 102, 11, 216, 144, 53, 213, 192, 167, 51, 6, 101, 105, 69, 0, 148, 86, AlertDescription.missing_extension, 152, 155, 118, 151, 252, 178, 194, 176, HandshakeType.message_hash, 219, 32, 225, 235, 214, 228, 221, 71, 74, 29, 66, 237, 158, AlertDescription.unsupported_extension, 73, 60, 205, 67, 39, 210, 7, 212, 222, 199, 103, 24, 137, 203, 48, 31, 141, 198, 143, 170, 200, AlertDescription.certificate_required, 220, 201, 93, 92, 49, 164, AlertDescription.unrecognized_name, 136, 97, 44, 159, 13, 43, 135, 80, 130, 84, 100, 38, 125, 3, 64, 52, 75, 28, AlertDescription.unknown_psk_identity, 209, 196, 253, 59, 204, 251, 127, 171, 230, 62, 91, 165, 173, 4, 35, 156, 20, 81, 34, 240, 41, 121, AlertDescription.bad_certificate_status_response, 126, 255, 140, 14, 226, 12, 239, 188, AlertDescription.bad_certificate_hash_value, 117, AlertDescription.certificate_unobtainable, 55, 161, 236, 211, 142, 98, 139, 134, 16, 232, 8, 119, 17, 190, 146, 79, 36, 197, 50, 54, 157, 207, 243, 166, 187, 172, 94, 108, 169, 19, 87, 37, 181, 227, 189, 168, 58, 1, 5, 89, 42, 70};
    private boolean encrypting;
    private int[] key0;
    private int[] key1;
    private int[] key2;
    private int[] key3;

    private int g(int i, int i9) {
        int i10 = (i9 >> 8) & 255;
        int i11 = i9 & 255;
        short[] sArr = ftable;
        int i12 = i10 ^ sArr[this.key0[i] ^ i11];
        int i13 = i11 ^ sArr[this.key1[i] ^ i12];
        int i14 = i12 ^ sArr[this.key2[i] ^ i13];
        return (i14 << 8) + (sArr[this.key3[i] ^ i14] ^ i13);
    }

    private int h(int i, int i9) {
        int i10 = i9 & 255;
        int i11 = (i9 >> 8) & 255;
        short[] sArr = ftable;
        int i12 = i10 ^ sArr[this.key3[i] ^ i11];
        int i13 = i11 ^ sArr[this.key2[i] ^ i12];
        int i14 = i12 ^ sArr[this.key1[i] ^ i13];
        return ((sArr[this.key0[i] ^ i14] ^ i13) << 8) + i14;
    }

    public int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        int i10 = (bArr[i] << 8) + (bArr[i + 1] & 255);
        int i11 = (bArr[i + 2] << 8) + (bArr[i + 3] & 255);
        int i12 = (bArr[i + 4] << 8) + (bArr[i + 5] & 255);
        int i13 = (bArr[i + 6] << 8) + (bArr[i + 7] & 255);
        int i14 = 31;
        for (int i15 = 0; i15 < 2; i15++) {
            int i16 = 0;
            while (i16 < 8) {
                int h9 = h(i14, i11);
                int i17 = (i12 ^ h9) ^ (i14 + 1);
                i14--;
                i16++;
                int i18 = i13;
                i13 = i10;
                i10 = h9;
                i11 = i17;
                i12 = i18;
            }
            int i19 = 0;
            while (i19 < 8) {
                int i20 = (i10 ^ i11) ^ (i14 + 1);
                int h10 = h(i14, i11);
                i14--;
                i19++;
                int i21 = i13;
                i13 = i20;
                i10 = h10;
                i11 = i12;
                i12 = i21;
            }
        }
        bArr2[i9] = (byte) (i10 >> 8);
        bArr2[i9 + 1] = (byte) i10;
        bArr2[i9 + 2] = (byte) (i11 >> 8);
        bArr2[i9 + 3] = (byte) i11;
        bArr2[i9 + 4] = (byte) (i12 >> 8);
        bArr2[i9 + 5] = (byte) i12;
        bArr2[i9 + 6] = (byte) (i13 >> 8);
        bArr2[i9 + 7] = (byte) i13;
        return 8;
    }

    public int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        int i10 = (bArr[i] << 8) + (bArr[i + 1] & 255);
        int i11 = (bArr[i + 2] << 8) + (bArr[i + 3] & 255);
        int i12 = (bArr[i + 4] << 8) + (bArr[i + 5] & 255);
        int i13 = (bArr[i + 6] << 8) + (bArr[i + 7] & 255);
        int i14 = 0;
        for (int i15 = 0; i15 < 2; i15++) {
            int i16 = 0;
            while (i16 < 8) {
                int g10 = g(i14, i10);
                i14++;
                i16++;
                int i17 = i11;
                i11 = g10;
                i10 = (i13 ^ g10) ^ i14;
                i13 = i12;
                i12 = i17;
            }
            int i18 = 0;
            while (i18 < 8) {
                int i19 = i14 + 1;
                int i20 = (i11 ^ i10) ^ i19;
                int g11 = g(i14, i10);
                i18++;
                i14 = i19;
                i11 = g11;
                i10 = i13;
                i13 = i12;
                i12 = i20;
            }
        }
        bArr2[i9] = (byte) (i10 >> 8);
        bArr2[i9 + 1] = (byte) i10;
        bArr2[i9 + 2] = (byte) (i11 >> 8);
        bArr2[i9 + 3] = (byte) i11;
        bArr2[i9 + 4] = (byte) (i12 >> 8);
        bArr2[i9 + 5] = (byte) i12;
        bArr2[i9 + 6] = (byte) (i13 >> 8);
        bArr2[i9 + 7] = (byte) i13;
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "SKIPJACK";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.h("invalid parameter passed to SKIPJACK init - ", cipherParameters));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        this.encrypting = z10;
        this.key0 = new int[32];
        this.key1 = new int[32];
        this.key2 = new int[32];
        this.key3 = new int[32];
        for (int i = 0; i < 32; i++) {
            int i9 = i * 4;
            this.key0[i] = key[i9 % 10] & 255;
            this.key1[i] = key[(i9 + 1) % 10] & 255;
            this.key2[i] = key[(i9 + 2) % 10] & 255;
            this.key3[i] = key[(i9 + 3) % 10] & 255;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        if (this.key1 == null) {
            throw new IllegalStateException("SKIPJACK engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i9 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.encrypting) {
            encryptBlock(bArr, i, bArr2, i9);
            return 8;
        }
        decryptBlock(bArr, i, bArr2, i9);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
