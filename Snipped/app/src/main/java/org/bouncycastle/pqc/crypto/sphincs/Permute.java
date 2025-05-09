package org.bouncycastle.pqc.crypto.sphincs;

import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
class Permute {
    private static final int CHACHA_ROUNDS = 12;

    public static void permute(int i, int[] iArr) {
        int i9 = 16;
        if (iArr.length != 16) {
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
        int i24 = iArr[12];
        int i25 = iArr[13];
        int i26 = iArr[14];
        int i27 = iArr[15];
        int i28 = i26;
        int i29 = i25;
        int i30 = i24;
        int i31 = i23;
        int i32 = i22;
        int i33 = i21;
        int i34 = i20;
        int i35 = i18;
        int i36 = i16;
        int i37 = i15;
        int i38 = i14;
        int i39 = i13;
        int i40 = i12;
        int i41 = i11;
        int i42 = i10;
        int i43 = i;
        while (i43 > 0) {
            int i44 = i42 + i38;
            int rotl = rotl(i30 ^ i44, i9);
            int i45 = i34 + rotl;
            int rotl2 = rotl(i38 ^ i45, 12);
            int i46 = i44 + rotl2;
            int rotl3 = rotl(rotl ^ i46, i19);
            int i47 = i45 + rotl3;
            int rotl4 = rotl(rotl2 ^ i47, i17);
            int i48 = i41 + i37;
            int rotl5 = rotl(i29 ^ i48, i9);
            int i49 = i33 + rotl5;
            int rotl6 = rotl(i37 ^ i49, 12);
            int i50 = i48 + rotl6;
            int rotl7 = rotl(rotl5 ^ i50, i19);
            int i51 = i49 + rotl7;
            int rotl8 = rotl(rotl6 ^ i51, i17);
            int i52 = i40 + i36;
            int rotl9 = rotl(i28 ^ i52, i9);
            int i53 = i32 + rotl9;
            int rotl10 = rotl(i36 ^ i53, 12);
            int i54 = i52 + rotl10;
            int rotl11 = rotl(rotl9 ^ i54, i19);
            int i55 = i53 + rotl11;
            int rotl12 = rotl(rotl10 ^ i55, i17);
            int i56 = i39 + i35;
            int rotl13 = rotl(i27 ^ i56, i9);
            int i57 = i31 + rotl13;
            int rotl14 = rotl(i35 ^ i57, 12);
            int i58 = i56 + rotl14;
            int rotl15 = rotl(rotl13 ^ i58, i19);
            int i59 = i57 + rotl15;
            int rotl16 = rotl(rotl14 ^ i59, 7);
            int i60 = i46 + rotl8;
            int rotl17 = rotl(rotl15 ^ i60, 16);
            int i61 = i55 + rotl17;
            int rotl18 = rotl(rotl8 ^ i61, 12);
            i42 = i60 + rotl18;
            i27 = rotl(rotl17 ^ i42, 8);
            i32 = i61 + i27;
            i37 = rotl(rotl18 ^ i32, 7);
            int i62 = i50 + rotl12;
            int rotl19 = rotl(rotl3 ^ i62, 16);
            int i63 = i59 + rotl19;
            int rotl20 = rotl(rotl12 ^ i63, 12);
            i41 = i62 + rotl20;
            i30 = rotl(rotl19 ^ i41, 8);
            i31 = i63 + i30;
            i36 = rotl(rotl20 ^ i31, 7);
            int i64 = i54 + rotl16;
            int rotl21 = rotl(rotl7 ^ i64, 16);
            int i65 = i47 + rotl21;
            int rotl22 = rotl(rotl16 ^ i65, 12);
            i40 = i64 + rotl22;
            i29 = rotl(rotl21 ^ i40, 8);
            i34 = i65 + i29;
            i35 = rotl(rotl22 ^ i34, 7);
            int i66 = i58 + rotl4;
            i9 = 16;
            int rotl23 = rotl(rotl11 ^ i66, 16);
            int i67 = i51 + rotl23;
            int rotl24 = rotl(rotl4 ^ i67, 12);
            i39 = i66 + rotl24;
            i28 = rotl(rotl23 ^ i39, 8);
            i33 = i67 + i28;
            i38 = rotl(rotl24 ^ i33, 7);
            i43 -= 2;
            i17 = 7;
            c2 = 0;
            i19 = 8;
        }
        iArr[c2] = i42;
        iArr[1] = i41;
        iArr[2] = i40;
        iArr[3] = i39;
        iArr[4] = i38;
        iArr[5] = i37;
        iArr[6] = i36;
        iArr[i17] = i35;
        iArr[8] = i34;
        iArr[9] = i33;
        iArr[10] = i32;
        iArr[11] = i31;
        iArr[12] = i30;
        iArr[13] = i29;
        iArr[14] = i28;
        iArr[15] = i27;
    }

    public static int rotl(int i, int i9) {
        return (i >>> (-i9)) | (i << i9);
    }

    public void chacha_permute(byte[] bArr, byte[] bArr2) {
        int[] iArr = new int[16];
        for (int i = 0; i < 16; i++) {
            iArr[i] = Pack.littleEndianToInt(bArr2, i * 4);
        }
        permute(12, iArr);
        for (int i9 = 0; i9 < 16; i9++) {
            Pack.intToLittleEndian(iArr[i9], bArr, i9 * 4);
        }
    }
}
