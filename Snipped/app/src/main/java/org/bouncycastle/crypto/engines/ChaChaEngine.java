package org.bouncycastle.crypto.engines;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class ChaChaEngine extends Salsa20Engine {
    public ChaChaEngine() {
    }

    public static void chachaCore(int i, int[] iArr, int[] iArr2) {
        int i9 = 16;
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        char c2 = 0;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = 7;
        int i18 = iArr[7];
        int i19 = 8;
        int i20 = iArr[8];
        int i21 = iArr[9];
        int i22 = iArr[10];
        int i23 = iArr[11];
        int i24 = 12;
        int i25 = iArr[12];
        int i26 = iArr[13];
        int i27 = iArr[14];
        int i28 = iArr[15];
        int i29 = i27;
        int i30 = i26;
        int i31 = i25;
        int i32 = i23;
        int i33 = i22;
        int i34 = i21;
        int i35 = i20;
        int i36 = i18;
        int i37 = i16;
        int i38 = i15;
        int i39 = i14;
        int i40 = i13;
        int i41 = i12;
        int i42 = i11;
        int i43 = i10;
        int i44 = i;
        while (i44 > 0) {
            int i45 = i43 + i39;
            int rotateLeft = Integers.rotateLeft(i31 ^ i45, i9);
            int i46 = i35 + rotateLeft;
            int rotateLeft2 = Integers.rotateLeft(i39 ^ i46, i24);
            int i47 = i45 + rotateLeft2;
            int rotateLeft3 = Integers.rotateLeft(rotateLeft ^ i47, i19);
            int i48 = i46 + rotateLeft3;
            int rotateLeft4 = Integers.rotateLeft(rotateLeft2 ^ i48, i17);
            int i49 = i42 + i38;
            int rotateLeft5 = Integers.rotateLeft(i30 ^ i49, i9);
            int i50 = i34 + rotateLeft5;
            int rotateLeft6 = Integers.rotateLeft(i38 ^ i50, i24);
            int i51 = i49 + rotateLeft6;
            int rotateLeft7 = Integers.rotateLeft(rotateLeft5 ^ i51, i19);
            int i52 = i50 + rotateLeft7;
            int rotateLeft8 = Integers.rotateLeft(rotateLeft6 ^ i52, i17);
            int i53 = i41 + i37;
            int rotateLeft9 = Integers.rotateLeft(i29 ^ i53, i9);
            int i54 = i33 + rotateLeft9;
            int rotateLeft10 = Integers.rotateLeft(i37 ^ i54, i24);
            int i55 = i53 + rotateLeft10;
            int rotateLeft11 = Integers.rotateLeft(rotateLeft9 ^ i55, i19);
            int i56 = i54 + rotateLeft11;
            int rotateLeft12 = Integers.rotateLeft(rotateLeft10 ^ i56, i17);
            int i57 = i40 + i36;
            int rotateLeft13 = Integers.rotateLeft(i28 ^ i57, 16);
            int i58 = i32 + rotateLeft13;
            int rotateLeft14 = Integers.rotateLeft(i36 ^ i58, i24);
            int i59 = i57 + rotateLeft14;
            int rotateLeft15 = Integers.rotateLeft(rotateLeft13 ^ i59, 8);
            int i60 = i58 + rotateLeft15;
            int rotateLeft16 = Integers.rotateLeft(rotateLeft14 ^ i60, 7);
            int i61 = i47 + rotateLeft8;
            int rotateLeft17 = Integers.rotateLeft(rotateLeft15 ^ i61, 16);
            int i62 = i56 + rotateLeft17;
            int rotateLeft18 = Integers.rotateLeft(rotateLeft8 ^ i62, 12);
            i43 = i61 + rotateLeft18;
            i28 = Integers.rotateLeft(rotateLeft17 ^ i43, 8);
            i33 = i62 + i28;
            i38 = Integers.rotateLeft(rotateLeft18 ^ i33, 7);
            int i63 = i51 + rotateLeft12;
            int rotateLeft19 = Integers.rotateLeft(rotateLeft3 ^ i63, 16);
            int i64 = i60 + rotateLeft19;
            int rotateLeft20 = Integers.rotateLeft(rotateLeft12 ^ i64, 12);
            i42 = i63 + rotateLeft20;
            i31 = Integers.rotateLeft(rotateLeft19 ^ i42, 8);
            i32 = i64 + i31;
            i37 = Integers.rotateLeft(rotateLeft20 ^ i32, 7);
            int i65 = i55 + rotateLeft16;
            int rotateLeft21 = Integers.rotateLeft(rotateLeft7 ^ i65, 16);
            int i66 = i48 + rotateLeft21;
            int rotateLeft22 = Integers.rotateLeft(rotateLeft16 ^ i66, 12);
            i41 = i65 + rotateLeft22;
            i30 = Integers.rotateLeft(rotateLeft21 ^ i41, 8);
            i35 = i66 + i30;
            i36 = Integers.rotateLeft(rotateLeft22 ^ i35, 7);
            int i67 = i59 + rotateLeft4;
            i9 = 16;
            int rotateLeft23 = Integers.rotateLeft(rotateLeft11 ^ i67, 16);
            int i68 = i52 + rotateLeft23;
            int rotateLeft24 = Integers.rotateLeft(rotateLeft4 ^ i68, 12);
            i40 = i67 + rotateLeft24;
            i29 = Integers.rotateLeft(rotateLeft23 ^ i40, 8);
            i34 = i68 + i29;
            i39 = Integers.rotateLeft(rotateLeft24 ^ i34, 7);
            i44 -= 2;
            c2 = 0;
            i24 = 12;
            i19 = 8;
            i17 = 7;
        }
        iArr2[c2] = i43 + iArr[c2];
        iArr2[1] = i42 + iArr[1];
        iArr2[2] = i41 + iArr[2];
        iArr2[3] = i40 + iArr[3];
        iArr2[4] = i39 + iArr[4];
        iArr2[5] = i38 + iArr[5];
        iArr2[6] = i37 + iArr[6];
        iArr2[7] = i36 + iArr[7];
        iArr2[8] = i35 + iArr[8];
        iArr2[9] = i34 + iArr[9];
        iArr2[10] = i33 + iArr[10];
        iArr2[11] = i32 + iArr[11];
        iArr2[12] = i31 + iArr[12];
        iArr2[13] = i30 + iArr[13];
        iArr2[14] = i29 + iArr[14];
        iArr2[15] = i28 + iArr[15];
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void advanceCounter() {
        int[] iArr = this.engineState;
        int i = iArr[12] + 1;
        iArr[12] = i;
        if (i == 0) {
            iArr[13] = iArr[13] + 1;
        }
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void generateKeyStream(byte[] bArr) {
        chachaCore(this.rounds, this.engineState, this.f24980x);
        Pack.intToLittleEndian(this.f24980x, bArr, 0);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine, org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "ChaCha" + this.rounds;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public long getCounter() {
        int[] iArr = this.engineState;
        return (iArr[13] << 32) | (iArr[12] & BodyPartID.bodyIdMax);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void resetCounter() {
        int[] iArr = this.engineState;
        iArr[13] = 0;
        iArr[12] = 0;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void retreatCounter() {
        int[] iArr = this.engineState;
        int i = iArr[12];
        if (i == 0 && iArr[13] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        int i9 = i - 1;
        iArr[12] = i9;
        if (i9 == -1) {
            iArr[13] = iArr[13] - 1;
        }
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            packTauOrSigma(bArr.length, this.engineState, 0);
            Pack.littleEndianToInt(bArr, 0, this.engineState, 4, 4);
            Pack.littleEndianToInt(bArr, bArr.length - 16, this.engineState, 8, 4);
        }
        Pack.littleEndianToInt(bArr2, 0, this.engineState, 14, 2);
    }

    public ChaChaEngine(int i) {
        super(i);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void advanceCounter(long j10) {
        int i = (int) (j10 >>> 32);
        int i9 = (int) j10;
        if (i > 0) {
            int[] iArr = this.engineState;
            iArr[13] = iArr[13] + i;
        }
        int[] iArr2 = this.engineState;
        int i10 = iArr2[12];
        int i11 = i9 + i10;
        iArr2[12] = i11;
        if (i10 == 0 || i11 >= i10) {
            return;
        }
        iArr2[13] = iArr2[13] + 1;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void retreatCounter(long j10) {
        int i = (int) (j10 >>> 32);
        int i9 = (int) j10;
        if (i != 0) {
            int[] iArr = this.engineState;
            int i10 = iArr[13];
            if ((i10 & BodyPartID.bodyIdMax) < (i & BodyPartID.bodyIdMax)) {
                throw new IllegalStateException("attempt to reduce counter past zero.");
            }
            iArr[13] = i10 - i;
        }
        int[] iArr2 = this.engineState;
        int i11 = iArr2[12];
        if ((i11 & BodyPartID.bodyIdMax) >= (BodyPartID.bodyIdMax & i9)) {
            iArr2[12] = i11 - i9;
            return;
        }
        int i12 = iArr2[13];
        if (i12 == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        iArr2[13] = i12 - 1;
        iArr2[12] = i11 - i9;
    }
}
