package org.bouncycastle.pqc.crypto.saber;

import org.jmrtd.PassportService;

/* loaded from: classes3.dex */
class Utils {
    private final int SABER_EP;
    private final int SABER_ET;
    private final int SABER_KEYBYTES;
    private final int SABER_L;
    private final int SABER_N;
    private final int SABER_POLYBYTES;

    public Utils(SABEREngine sABEREngine) {
        this.SABER_N = sABEREngine.getSABER_N();
        this.SABER_L = sABEREngine.getSABER_L();
        this.SABER_ET = sABEREngine.getSABER_ET();
        this.SABER_POLYBYTES = sABEREngine.getSABER_POLYBYTES();
        this.SABER_EP = sABEREngine.getSABER_EP();
        this.SABER_KEYBYTES = sABEREngine.getSABER_KEYBYTES();
    }

    private void BS2POLq(byte[] bArr, int i, short[] sArr) {
        for (short s10 = 0; s10 < this.SABER_N / 8; s10 = (short) (s10 + 1)) {
            short s11 = (short) (s10 * 8);
            int i9 = ((short) (s10 * 13)) + i;
            int i10 = bArr[i9] & 255;
            byte b9 = bArr[i9 + 1];
            sArr[s11] = (short) (i10 | ((b9 & 31) << 8));
            int i11 = ((b9 >> 5) & 7) | ((bArr[i9 + 2] & 255) << 3);
            byte b10 = bArr[i9 + 3];
            sArr[s11 + 1] = (short) (i11 | ((b10 & 3) << 11));
            int i12 = (b10 >> 2) & 63;
            byte b11 = bArr[i9 + 4];
            sArr[s11 + 2] = (short) (i12 | ((b11 & Byte.MAX_VALUE) << 6));
            int i13 = ((b11 >> 7) & 1) | ((bArr[i9 + 5] & 255) << 1);
            byte b12 = bArr[i9 + 6];
            sArr[s11 + 3] = (short) (i13 | ((b12 & PassportService.SFI_DG15) << 9));
            int i14 = ((b12 >> 4) & 15) | ((bArr[i9 + 7] & 255) << 4);
            byte b13 = bArr[i9 + 8];
            sArr[s11 + 4] = (short) (i14 | ((b13 & 1) << 12));
            int i15 = (b13 >> 1) & 127;
            byte b14 = bArr[i9 + 9];
            sArr[s11 + 5] = (short) (i15 | ((b14 & 63) << 7));
            int i16 = ((b14 >> 6) & 3) | ((bArr[i9 + 10] & 255) << 2);
            byte b15 = bArr[i9 + 11];
            sArr[s11 + 6] = (short) (i16 | ((b15 & 7) << 10));
            sArr[s11 + 7] = (short) (((bArr[i9 + 12] & 255) << 5) | ((b15 >> 3) & 31));
        }
    }

    private void POLp2BS(byte[] bArr, int i, short[] sArr) {
        for (short s10 = 0; s10 < this.SABER_N / 4; s10 = (short) (s10 + 1)) {
            short s11 = (short) (s10 * 4);
            int i9 = ((short) (s10 * 5)) + i;
            short s12 = sArr[s11];
            bArr[i9] = (byte) (s12 & 255);
            short s13 = sArr[s11 + 1];
            bArr[i9 + 1] = (byte) (((s12 >> 8) & 3) | ((s13 & 63) << 2));
            int i10 = (s13 >> 6) & 15;
            short s14 = sArr[s11 + 2];
            bArr[i9 + 2] = (byte) (i10 | ((s14 & 15) << 4));
            short s15 = sArr[s11 + 3];
            bArr[i9 + 3] = (byte) (((s14 >> 4) & 63) | ((s15 & 3) << 6));
            bArr[i9 + 4] = (byte) ((s15 >> 2) & 255);
        }
    }

    private void POLq2BS(byte[] bArr, int i, short[] sArr) {
        for (short s10 = 0; s10 < this.SABER_N / 8; s10 = (short) (s10 + 1)) {
            short s11 = (short) (s10 * 8);
            int i9 = ((short) (s10 * 13)) + i;
            short s12 = sArr[s11];
            bArr[i9] = (byte) (s12 & 255);
            short s13 = sArr[s11 + 1];
            bArr[i9 + 1] = (byte) (((s12 >> 8) & 31) | ((s13 & 7) << 5));
            bArr[i9 + 2] = (byte) ((s13 >> 3) & 255);
            int i10 = (s13 >> 11) & 3;
            short s14 = sArr[s11 + 2];
            bArr[i9 + 3] = (byte) (i10 | ((s14 & 63) << 2));
            int i11 = (s14 >> 6) & 127;
            short s15 = sArr[s11 + 3];
            bArr[i9 + 4] = (byte) (i11 | ((s15 & 1) << 7));
            bArr[i9 + 5] = (byte) ((s15 >> 1) & 255);
            int i12 = (s15 >> 9) & 15;
            short s16 = sArr[s11 + 4];
            bArr[i9 + 6] = (byte) (i12 | ((s16 & 15) << 4));
            bArr[i9 + 7] = (byte) ((s16 >> 4) & 255);
            int i13 = (s16 >> 12) & 1;
            short s17 = sArr[s11 + 5];
            bArr[i9 + 8] = (byte) (i13 | ((s17 & 127) << 1));
            int i14 = (s17 >> 7) & 63;
            short s18 = sArr[s11 + 6];
            bArr[i9 + 9] = (byte) (i14 | ((s18 & 3) << 6));
            bArr[i9 + 10] = (byte) ((s18 >> 2) & 255);
            short s19 = sArr[s11 + 7];
            bArr[i9 + 11] = (byte) (((s18 >> 10) & 7) | ((s19 & 31) << 3));
            bArr[i9 + 12] = (byte) ((s19 >> 5) & 255);
        }
    }

    public void BS2POLT(byte[] bArr, int i, short[] sArr) {
        int i9 = this.SABER_ET;
        short s10 = 0;
        if (i9 == 3) {
            while (s10 < this.SABER_N / 8) {
                short s11 = (short) (s10 * 8);
                int i10 = ((short) (s10 * 3)) + i;
                byte b9 = bArr[i10];
                sArr[s11] = (short) (b9 & 7);
                sArr[s11 + 1] = (short) ((b9 >> 3) & 7);
                byte b10 = bArr[i10 + 1];
                sArr[s11 + 2] = (short) (((b9 >> 6) & 3) | ((b10 & 1) << 2));
                sArr[s11 + 3] = (short) ((b10 >> 1) & 7);
                sArr[s11 + 4] = (short) ((b10 >> 4) & 7);
                byte b11 = bArr[i10 + 2];
                sArr[s11 + 5] = (short) (((b10 >> 7) & 1) | ((b11 & 3) << 1));
                sArr[s11 + 6] = (short) ((b11 >> 2) & 7);
                sArr[s11 + 7] = (short) ((b11 >> 5) & 7);
                s10 = (short) (s10 + 1);
            }
            return;
        }
        if (i9 == 4) {
            while (s10 < this.SABER_N / 2) {
                short s12 = (short) (s10 * 2);
                byte b12 = bArr[i + s10];
                sArr[s12] = (short) (b12 & PassportService.SFI_DG15);
                sArr[s12 + 1] = (short) ((b12 >> 4) & 15);
                s10 = (short) (s10 + 1);
            }
            return;
        }
        if (i9 == 6) {
            while (s10 < this.SABER_N / 4) {
                short s13 = (short) (s10 * 4);
                int i11 = ((short) (s10 * 3)) + i;
                byte b13 = bArr[i11];
                sArr[s13] = (short) (b13 & 63);
                byte b14 = bArr[i11 + 1];
                sArr[s13 + 1] = (short) (((b13 >> 6) & 3) | ((b14 & PassportService.SFI_DG15) << 2));
                byte b15 = bArr[i11 + 2];
                sArr[s13 + 2] = (short) (((b14 & 255) >> 4) | ((b15 & 3) << 4));
                sArr[s13 + 3] = (short) ((b15 & 255) >> 2);
                s10 = (short) (s10 + 1);
            }
        }
    }

    public void BS2POLVECp(byte[] bArr, short[][] sArr) {
        for (byte b9 = 0; b9 < this.SABER_L; b9 = (byte) (b9 + 1)) {
            BS2POLp(bArr, ((this.SABER_EP * this.SABER_N) / 8) * b9, sArr[b9]);
        }
    }

    public void BS2POLVECq(byte[] bArr, int i, short[][] sArr) {
        for (byte b9 = 0; b9 < this.SABER_L; b9 = (byte) (b9 + 1)) {
            BS2POLq(bArr, (this.SABER_POLYBYTES * b9) + i, sArr[b9]);
        }
    }

    public void BS2POLmsg(byte[] bArr, short[] sArr) {
        for (byte b9 = 0; b9 < this.SABER_KEYBYTES; b9 = (byte) (b9 + 1)) {
            for (byte b10 = 0; b10 < 8; b10 = (byte) (b10 + 1)) {
                sArr[(b9 * 8) + b10] = (short) ((bArr[b9] >> b10) & 1);
            }
        }
    }

    public void BS2POLp(byte[] bArr, int i, short[] sArr) {
        for (short s10 = 0; s10 < this.SABER_N / 4; s10 = (short) (s10 + 1)) {
            short s11 = (short) (s10 * 4);
            int i9 = ((short) (s10 * 5)) + i;
            int i10 = bArr[i9] & 255;
            byte b9 = bArr[i9 + 1];
            sArr[s11] = (short) (i10 | ((b9 & 3) << 8));
            byte b10 = bArr[i9 + 2];
            sArr[s11 + 1] = (short) (((b9 >> 2) & 63) | ((b10 & PassportService.SFI_DG15) << 6));
            int i11 = (b10 >> 4) & 15;
            byte b11 = bArr[i9 + 3];
            sArr[s11 + 2] = (short) (i11 | ((b11 & 63) << 4));
            sArr[s11 + 3] = (short) (((bArr[i9 + 4] & 255) << 2) | ((b11 >> 6) & 3));
        }
    }

    public void POLT2BS(byte[] bArr, int i, short[] sArr) {
        int i9 = this.SABER_ET;
        short s10 = 0;
        if (i9 == 3) {
            while (s10 < this.SABER_N / 8) {
                short s11 = (short) (s10 * 8);
                int i10 = ((short) (s10 * 3)) + i;
                int i11 = (sArr[s11] & 7) | ((sArr[s11 + 1] & 7) << 3);
                short s12 = sArr[s11 + 2];
                bArr[i10] = (byte) (i11 | ((s12 & 3) << 6));
                int i12 = ((s12 >> 2) & 1) | ((sArr[s11 + 3] & 7) << 1) | ((sArr[s11 + 4] & 7) << 4);
                short s13 = sArr[s11 + 5];
                bArr[i10 + 1] = (byte) (i12 | ((s13 & 1) << 7));
                bArr[i10 + 2] = (byte) (((sArr[s11 + 7] & 7) << 5) | ((s13 >> 1) & 3) | ((sArr[s11 + 6] & 7) << 2));
                s10 = (short) (s10 + 1);
            }
            return;
        }
        if (i9 == 4) {
            while (s10 < this.SABER_N / 2) {
                short s14 = (short) (s10 * 2);
                bArr[i + s10] = (byte) (((sArr[s14 + 1] & 15) << 4) | (sArr[s14] & 15));
                s10 = (short) (s10 + 1);
            }
            return;
        }
        if (i9 == 6) {
            while (s10 < this.SABER_N / 4) {
                short s15 = (short) (s10 * 4);
                int i13 = ((short) (s10 * 3)) + i;
                int i14 = sArr[s15] & 63;
                short s16 = sArr[s15 + 1];
                bArr[i13] = (byte) (i14 | ((s16 & 3) << 6));
                short s17 = sArr[s15 + 2];
                bArr[i13 + 1] = (byte) (((s16 >> 2) & 15) | ((s17 & 15) << 4));
                bArr[i13 + 2] = (byte) (((sArr[s15 + 3] & 63) << 2) | ((s17 >> 4) & 3));
                s10 = (short) (s10 + 1);
            }
        }
    }

    public void POLVECp2BS(byte[] bArr, short[][] sArr) {
        for (byte b9 = 0; b9 < this.SABER_L; b9 = (byte) (b9 + 1)) {
            POLp2BS(bArr, ((this.SABER_EP * this.SABER_N) / 8) * b9, sArr[b9]);
        }
    }

    public void POLVECq2BS(byte[] bArr, short[][] sArr) {
        for (byte b9 = 0; b9 < this.SABER_L; b9 = (byte) (b9 + 1)) {
            POLq2BS(bArr, this.SABER_POLYBYTES * b9, sArr[b9]);
        }
    }

    public void POLmsg2BS(byte[] bArr, short[] sArr) {
        for (byte b9 = 0; b9 < this.SABER_KEYBYTES; b9 = (byte) (b9 + 1)) {
            for (byte b10 = 0; b10 < 8; b10 = (byte) (b10 + 1)) {
                bArr[b9] = (byte) (bArr[b9] | ((sArr[(b9 * 8) + b10] & 1) << b10));
            }
        }
    }
}
