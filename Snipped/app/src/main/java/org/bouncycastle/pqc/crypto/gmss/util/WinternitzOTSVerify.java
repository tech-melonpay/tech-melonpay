package org.bouncycastle.pqc.crypto.gmss.util;

import org.bouncycastle.crypto.Digest;

/* loaded from: classes3.dex */
public class WinternitzOTSVerify {
    private int mdsize;
    private Digest messDigestOTS;

    /* renamed from: w, reason: collision with root package name */
    private int f25377w;

    public WinternitzOTSVerify(Digest digest, int i) {
        this.f25377w = i;
        this.messDigestOTS = digest;
        this.mdsize = digest.getDigestSize();
    }

    private void hashSignatureBlock(byte[] bArr, int i, int i9, byte[] bArr2, int i10) {
        if (i9 < 1) {
            System.arraycopy(bArr, i, bArr2, i10, this.mdsize);
            return;
        }
        this.messDigestOTS.update(bArr, i, this.mdsize);
        while (true) {
            this.messDigestOTS.doFinal(bArr2, i10);
            i9--;
            if (i9 <= 0) {
                return;
            } else {
                this.messDigestOTS.update(bArr2, i10, this.mdsize);
            }
        }
    }

    public byte[] Verify(byte[] bArr, byte[] bArr2) {
        int i;
        int i9;
        int i10;
        WinternitzOTSVerify winternitzOTSVerify = this;
        int i11 = winternitzOTSVerify.mdsize;
        byte[] bArr3 = new byte[i11];
        int i12 = 0;
        winternitzOTSVerify.messDigestOTS.update(bArr, 0, bArr.length);
        winternitzOTSVerify.messDigestOTS.doFinal(bArr3, 0);
        int i13 = winternitzOTSVerify.mdsize << 3;
        int i14 = winternitzOTSVerify.f25377w;
        int i15 = ((i14 - 1) + i13) / i14;
        int log = winternitzOTSVerify.getLog((i15 << i14) + 1);
        int i16 = winternitzOTSVerify.f25377w;
        int i17 = winternitzOTSVerify.mdsize;
        int i18 = i17 * ((((log + i16) - 1) / i16) + i15);
        if (i18 != bArr2.length) {
            return null;
        }
        byte[] bArr4 = new byte[i18];
        int i19 = 8;
        if (8 % i16 == 0) {
            int i20 = 8 / i16;
            int i21 = (1 << i16) - 1;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            while (i24 < i11) {
                int i25 = i23;
                int i26 = 0;
                while (i26 < i20) {
                    int i27 = bArr3[i24] & i21;
                    int i28 = i22 + i27;
                    int i29 = winternitzOTSVerify.mdsize;
                    int i30 = i24;
                    hashSignatureBlock(bArr2, i25 * i29, i21 - i27, bArr4, i25 * i29);
                    bArr3[i30] = (byte) (bArr3[i30] >>> winternitzOTSVerify.f25377w);
                    i25++;
                    i26++;
                    i22 = i28;
                    i24 = i30;
                    i20 = i20;
                }
                i24++;
                i23 = i25;
            }
            int i31 = i23;
            int i32 = (i15 << winternitzOTSVerify.f25377w) - i22;
            int i33 = 0;
            while (i33 < log) {
                int i34 = winternitzOTSVerify.mdsize;
                hashSignatureBlock(bArr2, i31 * i34, i21 - (i32 & i21), bArr4, i31 * i34);
                int i35 = winternitzOTSVerify.f25377w;
                i32 >>>= i35;
                i31++;
                i33 += i35;
            }
            i10 = 0;
            i = i18;
        } else {
            long j10 = 0;
            if (i16 < 8) {
                int i36 = i17 / i16;
                int i37 = (1 << i16) - 1;
                int i38 = 0;
                int i39 = 0;
                int i40 = 0;
                int i41 = 0;
                while (i41 < i36) {
                    int i42 = i38;
                    int i43 = i12;
                    long j11 = 0;
                    while (i43 < winternitzOTSVerify.f25377w) {
                        j11 ^= (bArr3[i42] & 255) << (i43 << 3);
                        i42++;
                        i43++;
                        log = log;
                    }
                    int i44 = log;
                    int i45 = i40;
                    int i46 = 0;
                    while (i46 < i19) {
                        int i47 = (int) (j11 & i37);
                        int i48 = i39 + i47;
                        int i49 = this.mdsize;
                        winternitzOTSVerify = this;
                        hashSignatureBlock(bArr2, i45 * i49, i37 - i47, bArr4, i45 * i49);
                        j11 >>>= winternitzOTSVerify.f25377w;
                        i45++;
                        i46++;
                        i37 = i37;
                        i19 = 8;
                        i41 = i41;
                        i39 = i48;
                    }
                    i41++;
                    i40 = i45;
                    i38 = i42;
                    log = i44;
                    i12 = 0;
                }
                int i50 = log;
                int i51 = i37;
                int i52 = winternitzOTSVerify.mdsize % winternitzOTSVerify.f25377w;
                int i53 = 0;
                while (i53 < i52) {
                    j10 ^= (bArr3[i38] & 255) << (i53 << 3);
                    i38++;
                    i53++;
                    i39 = i39;
                    i40 = i40;
                }
                int i54 = i40;
                int i55 = i52 << 3;
                int i56 = 0;
                while (i56 < i55) {
                    int i57 = (int) (j10 & i51);
                    int i58 = i39 + i57;
                    int i59 = winternitzOTSVerify.mdsize;
                    hashSignatureBlock(bArr2, i54 * i59, i51 - i57, bArr4, i54 * i59);
                    int i60 = winternitzOTSVerify.f25377w;
                    j10 >>>= i60;
                    i54++;
                    i56 += i60;
                    i39 = i58;
                }
                int i61 = (i15 << winternitzOTSVerify.f25377w) - i39;
                int i62 = 0;
                while (i62 < i50) {
                    int i63 = winternitzOTSVerify.mdsize;
                    hashSignatureBlock(bArr2, i54 * i63, i51 - (i61 & i51), bArr4, i54 * i63);
                    int i64 = winternitzOTSVerify.f25377w;
                    i61 >>>= i64;
                    i54++;
                    i62 += i64;
                }
            } else if (i16 < 57) {
                int i65 = (i17 << 3) - i16;
                int i66 = (1 << i16) - 1;
                byte[] bArr5 = new byte[i17];
                int i67 = 0;
                int i68 = 0;
                int i69 = 0;
                while (i67 <= i65) {
                    int i70 = i67 >>> 3;
                    int i71 = i67 % 8;
                    int i72 = i65;
                    int i73 = i67 + winternitzOTSVerify.f25377w;
                    int i74 = (i73 + 7) >>> 3;
                    long j12 = 0;
                    int i75 = 0;
                    while (i70 < i74) {
                        j12 ^= (bArr3[i70] & 255) << (i75 << 3);
                        i75++;
                        i70++;
                        i74 = i74;
                        i73 = i73;
                    }
                    int i76 = i73;
                    long j13 = j12 >>> i71;
                    int i77 = i18;
                    long j14 = i66;
                    long j15 = j13 & j14;
                    int i78 = i15;
                    i68 = (int) (i68 + j15);
                    int i79 = winternitzOTSVerify.mdsize;
                    System.arraycopy(bArr2, i69 * i79, bArr5, 0, i79);
                    for (long j16 = j15; j16 < j14; j16++) {
                        winternitzOTSVerify.messDigestOTS.update(bArr5, 0, i17);
                        winternitzOTSVerify.messDigestOTS.doFinal(bArr5, 0);
                    }
                    int i80 = winternitzOTSVerify.mdsize;
                    System.arraycopy(bArr5, 0, bArr4, i69 * i80, i80);
                    i69++;
                    i65 = i72;
                    i15 = i78;
                    i18 = i77;
                    i67 = i76;
                }
                int i81 = i15;
                i = i18;
                int i82 = i67 >>> 3;
                if (i82 < winternitzOTSVerify.mdsize) {
                    int i83 = i67 % 8;
                    int i84 = 0;
                    while (true) {
                        i9 = winternitzOTSVerify.mdsize;
                        if (i82 >= i9) {
                            break;
                        }
                        j10 ^= (bArr3[i82] & 255) << (i84 << 3);
                        i84++;
                        i82++;
                    }
                    long j17 = i66;
                    long j18 = (j10 >>> i83) & j17;
                    i68 = (int) (i68 + j18);
                    System.arraycopy(bArr2, i69 * i9, bArr5, 0, i9);
                    while (j18 < j17) {
                        winternitzOTSVerify.messDigestOTS.update(bArr5, 0, i17);
                        winternitzOTSVerify.messDigestOTS.doFinal(bArr5, 0);
                        j18++;
                    }
                    int i85 = winternitzOTSVerify.mdsize;
                    System.arraycopy(bArr5, 0, bArr4, i69 * i85, i85);
                    i69++;
                }
                int i86 = (i81 << winternitzOTSVerify.f25377w) - i68;
                int i87 = 0;
                while (i87 < log) {
                    int i88 = winternitzOTSVerify.mdsize;
                    System.arraycopy(bArr2, i69 * i88, bArr5, 0, i88);
                    for (long j19 = i86 & i66; j19 < i66; j19++) {
                        winternitzOTSVerify.messDigestOTS.update(bArr5, 0, i17);
                        winternitzOTSVerify.messDigestOTS.doFinal(bArr5, 0);
                    }
                    int i89 = winternitzOTSVerify.mdsize;
                    System.arraycopy(bArr5, 0, bArr4, i69 * i89, i89);
                    int i90 = winternitzOTSVerify.f25377w;
                    i86 >>>= i90;
                    i69++;
                    i87 += i90;
                }
                i10 = 0;
            }
            i = i18;
            i10 = 0;
        }
        winternitzOTSVerify.messDigestOTS.update(bArr4, i10, i);
        byte[] bArr6 = new byte[winternitzOTSVerify.mdsize];
        winternitzOTSVerify.messDigestOTS.doFinal(bArr6, i10);
        return bArr6;
    }

    public int getLog(int i) {
        int i9 = 1;
        int i10 = 2;
        while (i10 < i) {
            i10 <<= 1;
            i9++;
        }
        return i9;
    }

    public int getSignatureLength() {
        int digestSize = this.messDigestOTS.getDigestSize();
        int i = this.f25377w;
        int i9 = ((i - 1) + (digestSize << 3)) / i;
        int log = getLog((i9 << i) + 1);
        return ((((log + r2) - 1) / this.f25377w) + i9) * digestSize;
    }
}
