package org.bouncycastle.pqc.crypto.gmss.util;

import org.bouncycastle.crypto.Digest;

/* loaded from: classes3.dex */
public class WinternitzOTSignature {
    private int checksumsize;
    private GMSSRandom gmssRandom;
    private int keysize;
    private int mdsize;
    private Digest messDigestOTS;
    private int messagesize;
    private byte[][] privateKeyOTS;

    /* renamed from: w, reason: collision with root package name */
    private int f25378w;

    public WinternitzOTSignature(byte[] bArr, Digest digest, int i) {
        this.f25378w = i;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.mdsize = this.messDigestOTS.getDigestSize();
        int i9 = (((r3 << 3) + i) - 1) / i;
        this.messagesize = i9;
        this.checksumsize = getLog((i9 << i) + 1);
        int i10 = (((r3 + i) - 1) / i) + this.messagesize;
        this.keysize = i10;
        this.privateKeyOTS = new byte[i10][];
        int i11 = this.mdsize;
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        for (int i12 = 0; i12 < this.keysize; i12++) {
            this.privateKeyOTS[i12] = this.gmssRandom.nextSeed(bArr2);
        }
    }

    private void hashPrivateKeyBlock(int i, int i9, byte[] bArr, int i10) {
        if (i9 < 1) {
            System.arraycopy(this.privateKeyOTS[i], 0, bArr, i10, this.mdsize);
            return;
        }
        this.messDigestOTS.update(this.privateKeyOTS[i], 0, this.mdsize);
        while (true) {
            this.messDigestOTS.doFinal(bArr, i10);
            i9--;
            if (i9 <= 0) {
                return;
            } else {
                this.messDigestOTS.update(bArr, i10, this.mdsize);
            }
        }
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

    public byte[][] getPrivateKey() {
        return this.privateKeyOTS;
    }

    public byte[] getPublicKey() {
        int i = this.keysize * this.mdsize;
        byte[] bArr = new byte[i];
        int i9 = (1 << this.f25378w) - 1;
        int i10 = 0;
        for (int i11 = 0; i11 < this.keysize; i11++) {
            hashPrivateKeyBlock(i11, i9, bArr, i10);
            i10 += this.mdsize;
        }
        this.messDigestOTS.update(bArr, 0, i);
        byte[] bArr2 = new byte[this.mdsize];
        this.messDigestOTS.doFinal(bArr2, 0);
        return bArr2;
    }

    public byte[] getSignature(byte[] bArr) {
        int i;
        int i9 = this.keysize;
        int i10 = this.mdsize;
        byte[] bArr2 = new byte[i9 * i10];
        byte[] bArr3 = new byte[i10];
        int i11 = 0;
        this.messDigestOTS.update(bArr, 0, bArr.length);
        this.messDigestOTS.doFinal(bArr3, 0);
        int i12 = this.f25378w;
        int i13 = 8;
        if (8 % i12 == 0) {
            int i14 = 8 / i12;
            int i15 = (1 << i12) - 1;
            int i16 = 0;
            int i17 = 0;
            for (int i18 = 0; i18 < i10; i18++) {
                for (int i19 = 0; i19 < i14; i19++) {
                    int i20 = bArr3[i18] & i15;
                    i16 += i20;
                    hashPrivateKeyBlock(i17, i20, bArr2, this.mdsize * i17);
                    bArr3[i18] = (byte) (bArr3[i18] >>> this.f25378w);
                    i17++;
                }
            }
            int i21 = (this.messagesize << this.f25378w) - i16;
            while (i11 < this.checksumsize) {
                hashPrivateKeyBlock(i17, i21 & i15, bArr2, this.mdsize * i17);
                int i22 = this.f25378w;
                i21 >>>= i22;
                i17++;
                i11 += i22;
            }
        } else if (i12 < 8) {
            int i23 = this.mdsize / i12;
            int i24 = (1 << i12) - 1;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            while (i25 < i23) {
                long j10 = 0;
                for (int i29 = 0; i29 < this.f25378w; i29++) {
                    j10 ^= (bArr3[i26] & 255) << (i29 << 3);
                    i26++;
                }
                int i30 = 0;
                long j11 = j10;
                while (i30 < i13) {
                    int i31 = ((int) j11) & i24;
                    i28 += i31;
                    hashPrivateKeyBlock(i27, i31, bArr2, this.mdsize * i27);
                    j11 >>>= this.f25378w;
                    i27++;
                    i30++;
                    i13 = 8;
                }
                i25++;
                i13 = 8;
            }
            int i32 = this.mdsize % this.f25378w;
            long j12 = 0;
            for (int i33 = 0; i33 < i32; i33++) {
                j12 ^= (bArr3[i26] & 255) << (i33 << 3);
                i26++;
            }
            int i34 = i32 << 3;
            int i35 = 0;
            while (i35 < i34) {
                int i36 = ((int) j12) & i24;
                i28 += i36;
                hashPrivateKeyBlock(i27, i36, bArr2, this.mdsize * i27);
                int i37 = this.f25378w;
                j12 >>>= i37;
                i27++;
                i35 += i37;
            }
            int i38 = (this.messagesize << this.f25378w) - i28;
            while (i11 < this.checksumsize) {
                hashPrivateKeyBlock(i27, i38 & i24, bArr2, this.mdsize * i27);
                int i39 = this.f25378w;
                i38 >>>= i39;
                i27++;
                i11 += i39;
            }
        } else if (i12 < 57) {
            int i40 = this.mdsize;
            int i41 = (i40 << 3) - i12;
            int i42 = (1 << i12) - 1;
            byte[] bArr4 = new byte[i40];
            int i43 = 0;
            int i44 = 0;
            int i45 = 0;
            while (i43 <= i41) {
                int i46 = i43 >>> 3;
                int i47 = i43 % 8;
                i43 += this.f25378w;
                int i48 = i11;
                long j13 = 0;
                while (i46 < ((i43 + 7) >>> 3)) {
                    j13 ^= (bArr3[i46] & 255) << (i48 << 3);
                    i48++;
                    i46++;
                    bArr3 = bArr3;
                    i41 = i41;
                }
                byte[] bArr5 = bArr3;
                int i49 = i41;
                long j14 = (j13 >>> i47) & i42;
                i45 = (int) (i45 + j14);
                System.arraycopy(this.privateKeyOTS[i44], 0, bArr4, 0, this.mdsize);
                while (j14 > 0) {
                    this.messDigestOTS.update(bArr4, 0, i40);
                    this.messDigestOTS.doFinal(bArr4, 0);
                    j14--;
                }
                int i50 = this.mdsize;
                System.arraycopy(bArr4, 0, bArr2, i44 * i50, i50);
                i44++;
                bArr3 = bArr5;
                i41 = i49;
                i11 = 0;
            }
            byte[] bArr6 = bArr3;
            int i51 = i43 >>> 3;
            if (i51 < this.mdsize) {
                int i52 = i43 % 8;
                int i53 = 0;
                long j15 = 0;
                while (true) {
                    i = this.mdsize;
                    if (i51 >= i) {
                        break;
                    }
                    j15 ^= (bArr6[i51] & 255) << (i53 << 3);
                    i53++;
                    i51++;
                }
                long j16 = (j15 >>> i52) & i42;
                i45 = (int) (i45 + j16);
                System.arraycopy(this.privateKeyOTS[i44], 0, bArr4, 0, i);
                while (j16 > 0) {
                    this.messDigestOTS.update(bArr4, 0, i40);
                    this.messDigestOTS.doFinal(bArr4, 0);
                    j16--;
                }
                int i54 = this.mdsize;
                System.arraycopy(bArr4, 0, bArr2, i44 * i54, i54);
                i44++;
            }
            int i55 = (this.messagesize << this.f25378w) - i45;
            int i56 = 0;
            while (i56 < this.checksumsize) {
                System.arraycopy(this.privateKeyOTS[i44], 0, bArr4, 0, this.mdsize);
                for (long j17 = i55 & i42; j17 > 0; j17--) {
                    this.messDigestOTS.update(bArr4, 0, i40);
                    this.messDigestOTS.doFinal(bArr4, 0);
                }
                int i57 = this.mdsize;
                System.arraycopy(bArr4, 0, bArr2, i44 * i57, i57);
                int i58 = this.f25378w;
                i55 >>>= i58;
                i44++;
                i56 += i58;
            }
        }
        return bArr2;
    }
}
