package org.bouncycastle.pqc.crypto.frodo;

import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Exceptions;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
abstract class FrodoMatrixGenerator {

    /* renamed from: n, reason: collision with root package name */
    int f25363n;

    /* renamed from: q, reason: collision with root package name */
    int f25364q;

    public static class Aes128MatrixGenerator extends FrodoMatrixGenerator {
        BufferedBlockCipher cipher;

        public Aes128MatrixGenerator(int i, int i9) {
            super(i, i9);
            this.cipher = new BufferedBlockCipher(new AESEngine());
        }

        public void aes128(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            try {
                this.cipher.init(true, new KeyParameter(bArr2));
                this.cipher.doFinal(bArr, this.cipher.processBytes(bArr3, 0, bArr3.length, bArr, 0));
            } catch (InvalidCipherTextException e10) {
                throw Exceptions.illegalStateException(e10.toString(), e10);
            }
        }

        @Override // org.bouncycastle.pqc.crypto.frodo.FrodoMatrixGenerator
        public short[] genMatrix(byte[] bArr) {
            int i = this.f25363n;
            short[] sArr = new short[i * i];
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[16];
            for (int i9 = 0; i9 < this.f25363n; i9++) {
                for (int i10 = 0; i10 < this.f25363n; i10 += 8) {
                    System.arraycopy(Pack.shortToLittleEndian((short) (i9 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)), 0, bArr2, 0, 2);
                    System.arraycopy(Pack.shortToLittleEndian((short) (65535 & i10)), 0, bArr2, 2, 2);
                    aes128(bArr3, bArr, bArr2);
                    for (int i11 = 0; i11 < 8; i11++) {
                        sArr[(this.f25363n * i9) + i10 + i11] = (short) (Pack.littleEndianToShort(bArr3, i11 * 2) % this.f25364q);
                    }
                }
            }
            return sArr;
        }
    }

    public static class Shake128MatrixGenerator extends FrodoMatrixGenerator {
        public Shake128MatrixGenerator(int i, int i9) {
            super(i, i9);
        }

        @Override // org.bouncycastle.pqc.crypto.frodo.FrodoMatrixGenerator
        public short[] genMatrix(byte[] bArr) {
            int i = this.f25363n;
            short[] sArr = new short[i * i];
            int i9 = (i * 16) / 8;
            byte[] bArr2 = new byte[i9];
            for (short s10 = 0; s10 < this.f25363n; s10 = (short) (s10 + 1)) {
                byte[] concatenate = Arrays.concatenate(Pack.shortToLittleEndian(s10), bArr);
                SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
                sHAKEDigest.update(concatenate, 0, concatenate.length);
                sHAKEDigest.doFinal(bArr2, 0, i9);
                short s11 = 0;
                while (true) {
                    int i10 = this.f25363n;
                    if (s11 < i10) {
                        sArr[(i10 * s10) + s11] = (short) (Pack.littleEndianToShort(bArr2, s11 * 2) % this.f25364q);
                        s11 = (short) (s11 + 1);
                    }
                }
            }
            return sArr;
        }
    }

    public FrodoMatrixGenerator(int i, int i9) {
        this.f25363n = i;
        this.f25364q = i9;
    }

    public abstract short[] genMatrix(byte[] bArr);
}
