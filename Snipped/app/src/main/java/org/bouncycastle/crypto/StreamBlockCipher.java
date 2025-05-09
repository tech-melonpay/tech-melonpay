package org.bouncycastle.crypto;

/* loaded from: classes2.dex */
public abstract class StreamBlockCipher implements BlockCipher, StreamCipher {
    private final BlockCipher cipher;

    public StreamBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
    }

    public abstract byte calculateByte(byte b9);

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i9, byte[] bArr2, int i10) {
        int i11 = i + i9;
        if (i11 > bArr.length) {
            throw new DataLengthException("input buffer too small");
        }
        if (i10 + i9 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        while (i < i11) {
            bArr2[i10] = calculateByte(bArr[i]);
            i10++;
            i++;
        }
        return i9;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public final byte returnByte(byte b9) {
        return calculateByte(b9);
    }
}
