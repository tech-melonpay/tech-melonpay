package org.bouncycastle.pqc.crypto.gmss;

import C.v;
import androidx.camera.core.impl.utils.a;
import java.lang.reflect.Array;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.util.encoders.Hex;
import s3.b;

/* loaded from: classes3.dex */
public class GMSSRootSig {
    private long big8;
    private int checksum;
    private int counter;
    private GMSSRandom gmssRandom;
    private byte[] hash;
    private int height;
    private int ii;

    /* renamed from: k, reason: collision with root package name */
    private int f25374k;
    private int keysize;
    private int mdsize;
    private Digest messDigestOTS;
    private int messagesize;
    private byte[] privateKeyOTS;

    /* renamed from: r, reason: collision with root package name */
    private int f25375r;
    private byte[] seed;
    private byte[] sign;
    private int steps;
    private int test;
    private long test8;

    /* renamed from: w, reason: collision with root package name */
    private int f25376w;

    public GMSSRootSig(Digest digest, int i, int i9) {
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.mdsize = this.messDigestOTS.getDigestSize();
        this.f25376w = i;
        this.height = i9;
        this.f25374k = (1 << i) - 1;
        this.messagesize = (int) Math.ceil((r3 << 3) / i);
    }

    private void oneStep() {
        long j10;
        int i = this.f25376w;
        if (8 % i == 0) {
            int i9 = this.test;
            if (i9 == 0) {
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
                int i10 = this.ii;
                if (i10 < this.mdsize) {
                    byte[] bArr = this.hash;
                    byte b9 = bArr[i10];
                    this.test = this.f25374k & b9;
                    bArr[i10] = (byte) (b9 >>> this.f25376w);
                } else {
                    int i11 = this.checksum;
                    this.test = this.f25374k & i11;
                    this.checksum = i11 >>> this.f25376w;
                }
            } else if (i9 > 0) {
                Digest digest = this.messDigestOTS;
                byte[] bArr2 = this.privateKeyOTS;
                digest.update(bArr2, 0, bArr2.length);
                byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
                this.privateKeyOTS = bArr3;
                this.messDigestOTS.doFinal(bArr3, 0);
                this.test--;
            }
            if (this.test == 0) {
                byte[] bArr4 = this.privateKeyOTS;
                byte[] bArr5 = this.sign;
                int i12 = this.counter;
                int i13 = this.mdsize;
                System.arraycopy(bArr4, 0, bArr5, i12 * i13, i13);
                int i14 = this.counter + 1;
                this.counter = i14;
                if (i14 % (8 / this.f25376w) == 0) {
                    this.ii++;
                    return;
                }
                return;
            }
            return;
        }
        if (i < 8) {
            int i15 = this.test;
            if (i15 == 0) {
                int i16 = this.counter;
                if (i16 % 8 == 0) {
                    int i17 = this.ii;
                    int i18 = this.mdsize;
                    if (i17 < i18) {
                        this.big8 = 0L;
                        if (i16 < ((i18 / i) << 3)) {
                            for (int i19 = 0; i19 < this.f25376w; i19++) {
                                long j11 = this.big8;
                                byte[] bArr6 = this.hash;
                                int i20 = this.ii;
                                this.big8 = j11 ^ ((bArr6[i20] & 255) << (i19 << 3));
                                this.ii = i20 + 1;
                            }
                        } else {
                            for (int i21 = 0; i21 < this.mdsize % this.f25376w; i21++) {
                                long j12 = this.big8;
                                byte[] bArr7 = this.hash;
                                int i22 = this.ii;
                                this.big8 = j12 ^ ((bArr7[i22] & 255) << (i21 << 3));
                                this.ii = i22 + 1;
                            }
                        }
                    }
                }
                if (this.counter == this.messagesize) {
                    this.big8 = this.checksum;
                }
                this.test = (int) (this.big8 & this.f25374k);
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            } else if (i15 > 0) {
                Digest digest2 = this.messDigestOTS;
                byte[] bArr8 = this.privateKeyOTS;
                digest2.update(bArr8, 0, bArr8.length);
                byte[] bArr9 = new byte[this.messDigestOTS.getDigestSize()];
                this.privateKeyOTS = bArr9;
                this.messDigestOTS.doFinal(bArr9, 0);
                this.test--;
            }
            if (this.test != 0) {
                return;
            }
            byte[] bArr10 = this.privateKeyOTS;
            byte[] bArr11 = this.sign;
            int i23 = this.counter;
            int i24 = this.mdsize;
            System.arraycopy(bArr10, 0, bArr11, i23 * i24, i24);
            this.big8 >>>= this.f25376w;
        } else {
            if (i >= 57) {
                return;
            }
            long j13 = this.test8;
            if (j13 == 0) {
                this.big8 = 0L;
                this.ii = 0;
                int i25 = this.f25375r;
                int i26 = i25 % 8;
                int i27 = i25 >>> 3;
                int i28 = this.mdsize;
                if (i27 < i28) {
                    if (i25 <= (i28 << 3) - i) {
                        int i29 = i25 + i;
                        this.f25375r = i29;
                        i28 = (i29 + 7) >>> 3;
                    } else {
                        this.f25375r = i25 + i;
                    }
                    while (true) {
                        j10 = this.big8;
                        if (i27 >= i28) {
                            break;
                        }
                        int i30 = this.hash[i27] & 255;
                        int i31 = this.ii;
                        this.big8 = j10 ^ (i30 << (i31 << 3));
                        this.ii = i31 + 1;
                        i27++;
                    }
                    long j14 = j10 >>> i26;
                    this.big8 = j14;
                    this.test8 = j14 & this.f25374k;
                } else {
                    int i32 = this.checksum;
                    this.test8 = this.f25374k & i32;
                    this.checksum = i32 >>> i;
                }
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            } else if (j13 > 0) {
                Digest digest3 = this.messDigestOTS;
                byte[] bArr12 = this.privateKeyOTS;
                digest3.update(bArr12, 0, bArr12.length);
                byte[] bArr13 = new byte[this.messDigestOTS.getDigestSize()];
                this.privateKeyOTS = bArr13;
                this.messDigestOTS.doFinal(bArr13, 0);
                this.test8--;
            }
            if (this.test8 != 0) {
                return;
            }
            byte[] bArr14 = this.privateKeyOTS;
            byte[] bArr15 = this.sign;
            int i33 = this.counter;
            int i34 = this.mdsize;
            System.arraycopy(bArr14, 0, bArr15, i33 * i34, i34);
        }
        this.counter++;
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

    public byte[] getSig() {
        return this.sign;
    }

    public byte[][] getStatByte() {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 5, this.mdsize);
        bArr[0] = this.privateKeyOTS;
        bArr[1] = this.seed;
        bArr[2] = this.hash;
        bArr[3] = this.sign;
        bArr[4] = getStatLong();
        return bArr;
    }

    public int[] getStatInt() {
        return new int[]{this.counter, this.test, this.ii, this.f25375r, this.steps, this.keysize, this.height, this.f25376w, this.checksum};
    }

    public byte[] getStatLong() {
        long j10 = this.test8;
        long j11 = this.big8;
        return new byte[]{(byte) (j10 & 255), (byte) ((j10 >> 8) & 255), (byte) ((j10 >> 16) & 255), (byte) ((j10 >> 24) & 255), (byte) ((j10 >> 32) & 255), (byte) ((j10 >> 40) & 255), (byte) ((j10 >> 48) & 255), (byte) ((j10 >> 56) & 255), (byte) (j11 & 255), (byte) ((j11 >> 8) & 255), (byte) ((j11 >> 16) & 255), (byte) ((j11 >> 24) & 255), (byte) ((j11 >> 32) & 255), (byte) ((j11 >> 40) & 255), (byte) ((j11 >> 48) & 255), (byte) (255 & (j11 >> 56))};
    }

    public void initSign(byte[] bArr, byte[] bArr2) {
        int i;
        int i9;
        this.hash = new byte[this.mdsize];
        this.messDigestOTS.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
        this.hash = bArr3;
        this.messDigestOTS.doFinal(bArr3, 0);
        int i10 = this.mdsize;
        byte[] bArr4 = new byte[i10];
        System.arraycopy(this.hash, 0, bArr4, 0, i10);
        int log = getLog((this.messagesize << this.f25376w) + 1);
        int i11 = this.f25376w;
        int i12 = 8;
        if (8 % i11 == 0) {
            int i13 = 8 / i11;
            i = 0;
            for (int i14 = 0; i14 < this.mdsize; i14++) {
                for (int i15 = 0; i15 < i13; i15++) {
                    byte b9 = bArr4[i14];
                    i += this.f25374k & b9;
                    bArr4[i14] = (byte) (b9 >>> this.f25376w);
                }
            }
            int i16 = (this.messagesize << this.f25376w) - i;
            this.checksum = i16;
            int i17 = 0;
            while (i17 < log) {
                i += this.f25374k & i16;
                int i18 = this.f25376w;
                i16 >>>= i18;
                i17 += i18;
            }
        } else if (i11 < 8) {
            int i19 = this.mdsize / i11;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (i20 < i19) {
                long j10 = 0;
                for (int i23 = 0; i23 < this.f25376w; i23++) {
                    j10 ^= (bArr4[i21] & 255) << (i23 << 3);
                    i21++;
                }
                int i24 = 0;
                while (i24 < i12) {
                    i22 += (int) (this.f25374k & j10);
                    j10 >>>= this.f25376w;
                    i24++;
                    i19 = i19;
                    i12 = 8;
                }
                i20++;
                i12 = 8;
            }
            int i25 = this.mdsize % this.f25376w;
            long j11 = 0;
            for (int i26 = 0; i26 < i25; i26++) {
                j11 ^= (bArr4[i21] & 255) << (i26 << 3);
                i21++;
            }
            int i27 = i25 << 3;
            int i28 = 0;
            while (i28 < i27) {
                i22 += (int) (this.f25374k & j11);
                int i29 = this.f25376w;
                j11 >>>= i29;
                i28 += i29;
            }
            int i30 = (this.messagesize << this.f25376w) - i22;
            this.checksum = i30;
            int i31 = 0;
            i = i22;
            while (i31 < log) {
                i += this.f25374k & i30;
                int i32 = this.f25376w;
                i30 >>>= i32;
                i31 += i32;
            }
        } else if (i11 < 57) {
            int i33 = 0;
            int i34 = 0;
            while (true) {
                i9 = this.mdsize;
                int i35 = this.f25376w;
                if (i33 > (i9 << 3) - i35) {
                    break;
                }
                int i36 = i33 % 8;
                i33 += i35;
                int i37 = 0;
                long j12 = 0;
                for (int i38 = i33 >>> 3; i38 < ((i33 + 7) >>> 3); i38++) {
                    j12 ^= (bArr4[i38] & 255) << (i37 << 3);
                    i37++;
                }
                i34 = (int) (i34 + ((j12 >>> i36) & this.f25374k));
            }
            int i39 = i33 >>> 3;
            if (i39 < i9) {
                int i40 = i33 % 8;
                int i41 = 0;
                long j13 = 0;
                while (i39 < this.mdsize) {
                    j13 ^= (bArr4[i39] & 255) << (i41 << 3);
                    i41++;
                    i39++;
                }
                i34 = (int) (i34 + ((j13 >>> i40) & this.f25374k));
            }
            int i42 = (this.messagesize << this.f25376w) - i34;
            this.checksum = i42;
            int i43 = 0;
            i = i34;
            while (i43 < log) {
                i += this.f25374k & i42;
                int i44 = this.f25376w;
                i42 >>>= i44;
                i43 += i44;
            }
        } else {
            i = 0;
        }
        this.keysize = this.messagesize + ((int) Math.ceil(log / this.f25376w));
        this.steps = (int) Math.ceil((r2 + i) / (1 << this.height));
        int i45 = this.keysize;
        int i46 = this.mdsize;
        this.sign = new byte[i45 * i46];
        this.counter = 0;
        this.test = 0;
        this.ii = 0;
        this.test8 = 0L;
        this.f25375r = 0;
        this.privateKeyOTS = new byte[i46];
        byte[] bArr5 = new byte[i46];
        this.seed = bArr5;
        System.arraycopy(bArr, 0, bArr5, 0, i46);
    }

    public String toString() {
        String str = "" + this.big8 + "  ";
        int[] statInt = getStatInt();
        byte[][] statByte = getStatByte();
        for (int i = 0; i < 9; i++) {
            str = b.m(v.s(str), statInt[i], " ");
        }
        for (int i9 = 0; i9 < 5; i9++) {
            str = a.n(v.s(str), new String(Hex.encode(statByte[i9])), " ");
        }
        return str;
    }

    public boolean updateSign() {
        for (int i = 0; i < this.steps; i++) {
            if (this.counter < this.keysize) {
                oneStep();
            }
            if (this.counter == this.keysize) {
                return true;
            }
        }
        return false;
    }

    public GMSSRootSig(Digest digest, byte[][] bArr, int[] iArr) {
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.counter = iArr[0];
        this.test = iArr[1];
        this.ii = iArr[2];
        this.f25375r = iArr[3];
        this.steps = iArr[4];
        this.keysize = iArr[5];
        this.height = iArr[6];
        this.f25376w = iArr[7];
        this.checksum = iArr[8];
        this.mdsize = this.messDigestOTS.getDigestSize();
        int i = this.f25376w;
        this.f25374k = (1 << i) - 1;
        this.messagesize = (int) Math.ceil((r10 << 3) / i);
        this.privateKeyOTS = bArr[0];
        this.seed = bArr[1];
        this.hash = bArr[2];
        this.sign = bArr[3];
        byte[] bArr2 = bArr[4];
        this.test8 = ((bArr2[1] & 255) << 8) | (bArr2[0] & 255) | ((bArr2[2] & 255) << 16) | ((bArr2[3] & 255) << 24) | ((bArr2[4] & 255) << 32) | ((bArr2[5] & 255) << 40) | ((bArr2[6] & 255) << 48) | ((bArr2[7] & 255) << 56);
        this.big8 = (bArr2[8] & 255) | ((bArr2[9] & 255) << 8) | ((bArr2[10] & 255) << 16) | ((bArr2[11] & 255) << 24) | ((bArr2[12] & 255) << 32) | ((bArr2[13] & 255) << 40) | ((bArr2[14] & 255) << 48) | ((bArr2[15] & 255) << 56);
    }
}
