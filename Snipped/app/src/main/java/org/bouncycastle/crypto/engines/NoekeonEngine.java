package org.bouncycastle.crypto.engines;

import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class NoekeonEngine implements BlockCipher {
    private static final int SIZE = 16;
    private static final byte[] roundConstants = {ISOFileInfo.DATA_BYTES1, 27, 54, 108, ISO7816.INS_LOAD_KEY_FILE, ISOFileInfo.AB, 77, -102, 47, 94, PSSSigner.TRAILER_IMPLICIT, 99, -58, -105, 53, 106, -44};
    private boolean _forEncryption;

    /* renamed from: k, reason: collision with root package name */
    private final int[] f24973k = new int[4];
    private boolean _initialised = false;

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        int bigEndianToInt = Pack.bigEndianToInt(bArr, i);
        int bigEndianToInt2 = Pack.bigEndianToInt(bArr, i + 4);
        int bigEndianToInt3 = Pack.bigEndianToInt(bArr, i + 8);
        int bigEndianToInt4 = Pack.bigEndianToInt(bArr, i + 12);
        int[] iArr = this.f24973k;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = 16;
        while (true) {
            int i15 = bigEndianToInt ^ bigEndianToInt3;
            int rotateLeft = i15 ^ (Integers.rotateLeft(i15, 8) ^ Integers.rotateLeft(i15, 24));
            int i16 = bigEndianToInt2 ^ i11;
            int i17 = bigEndianToInt4 ^ i13;
            int i18 = i16 ^ i17;
            int rotateLeft2 = (Integers.rotateLeft(i18, 24) ^ Integers.rotateLeft(i18, 8)) ^ i18;
            int i19 = i16 ^ rotateLeft;
            int i20 = (bigEndianToInt3 ^ i12) ^ rotateLeft2;
            int i21 = i17 ^ rotateLeft;
            int i22 = ((bigEndianToInt ^ i10) ^ rotateLeft2) ^ (roundConstants[i14] & 255);
            i14--;
            if (i14 < 0) {
                Pack.intToBigEndian(i22, bArr2, i9);
                Pack.intToBigEndian(i19, bArr2, i9 + 4);
                Pack.intToBigEndian(i20, bArr2, i9 + 8);
                Pack.intToBigEndian(i21, bArr2, i9 + 12);
                return 16;
            }
            int rotateLeft3 = Integers.rotateLeft(i19, 1);
            int rotateLeft4 = Integers.rotateLeft(i20, 5);
            int rotateLeft5 = Integers.rotateLeft(i21, 2);
            int i23 = rotateLeft3 ^ (rotateLeft5 | rotateLeft4);
            int i24 = ~i23;
            int i25 = i22 ^ (rotateLeft4 & i24);
            int i26 = (rotateLeft4 ^ (i24 ^ rotateLeft5)) ^ i25;
            int i27 = i23 ^ (i25 | i26);
            int i28 = rotateLeft5 ^ (i26 & i27);
            bigEndianToInt2 = Integers.rotateLeft(i27, 31);
            bigEndianToInt3 = Integers.rotateLeft(i26, 27);
            int rotateLeft6 = Integers.rotateLeft(i25, 30);
            bigEndianToInt = i28;
            bigEndianToInt4 = rotateLeft6;
        }
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        int bigEndianToInt = Pack.bigEndianToInt(bArr, i);
        int bigEndianToInt2 = Pack.bigEndianToInt(bArr, i + 4);
        int bigEndianToInt3 = Pack.bigEndianToInt(bArr, i + 8);
        int bigEndianToInt4 = Pack.bigEndianToInt(bArr, i + 12);
        int[] iArr = this.f24973k;
        int i10 = 0;
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        while (true) {
            int i15 = bigEndianToInt ^ (roundConstants[i10] & 255);
            int i16 = i15 ^ bigEndianToInt3;
            int rotateLeft = i16 ^ (Integers.rotateLeft(i16, 8) ^ Integers.rotateLeft(i16, 24));
            int i17 = bigEndianToInt2 ^ i12;
            int i18 = bigEndianToInt4 ^ i14;
            int i19 = i17 ^ i18;
            int rotateLeft2 = i19 ^ (Integers.rotateLeft(i19, 24) ^ Integers.rotateLeft(i19, 8));
            int i20 = (i15 ^ i11) ^ rotateLeft2;
            int i21 = i17 ^ rotateLeft;
            int i22 = (bigEndianToInt3 ^ i13) ^ rotateLeft2;
            int i23 = i18 ^ rotateLeft;
            i10++;
            if (i10 > 16) {
                Pack.intToBigEndian(i20, bArr2, i9);
                Pack.intToBigEndian(i21, bArr2, i9 + 4);
                Pack.intToBigEndian(i22, bArr2, i9 + 8);
                Pack.intToBigEndian(i23, bArr2, i9 + 12);
                return 16;
            }
            int rotateLeft3 = Integers.rotateLeft(i21, 1);
            int rotateLeft4 = Integers.rotateLeft(i22, 5);
            int rotateLeft5 = Integers.rotateLeft(i23, 2);
            int i24 = rotateLeft3 ^ (rotateLeft5 | rotateLeft4);
            int i25 = ~i24;
            int i26 = i20 ^ (rotateLeft4 & i25);
            int i27 = (rotateLeft4 ^ (i25 ^ rotateLeft5)) ^ i26;
            int i28 = i24 ^ (i26 | i27);
            int i29 = rotateLeft5 ^ (i27 & i28);
            bigEndianToInt2 = Integers.rotateLeft(i28, 31);
            bigEndianToInt3 = Integers.rotateLeft(i27, 27);
            int rotateLeft6 = Integers.rotateLeft(i26, 30);
            bigEndianToInt = i29;
            bigEndianToInt4 = rotateLeft6;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Noekeon";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.h("invalid parameter passed to Noekeon init - ", cipherParameters));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("Key length not 128 bits.");
        }
        Pack.bigEndianToInt(key, 0, this.f24973k, 0, 4);
        if (!z10) {
            int[] iArr = this.f24973k;
            int i = iArr[0];
            int i9 = iArr[1];
            int i10 = iArr[2];
            int i11 = iArr[3];
            int i12 = i ^ i10;
            int rotateLeft = i12 ^ (Integers.rotateLeft(i12, 8) ^ Integers.rotateLeft(i12, 24));
            int i13 = i9 ^ i11;
            int rotateLeft2 = (Integers.rotateLeft(i13, 8) ^ Integers.rotateLeft(i13, 24)) ^ i13;
            int i14 = i9 ^ rotateLeft;
            int i15 = i11 ^ rotateLeft;
            int[] iArr2 = this.f24973k;
            iArr2[0] = i ^ rotateLeft2;
            iArr2[1] = i14;
            iArr2[2] = i10 ^ rotateLeft2;
            iArr2[3] = i15;
        }
        this._forEncryption = z10;
        this._initialised = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        if (!this._initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i > bArr.length - 16) {
            throw new DataLengthException("input buffer too short");
        }
        if (i9 <= bArr2.length - 16) {
            return this._forEncryption ? encryptBlock(bArr, i, bArr2, i9) : decryptBlock(bArr, i, bArr2, i9);
        }
        throw new OutputLengthException("output buffer too short");
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
