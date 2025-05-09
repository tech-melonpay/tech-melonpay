package org.bouncycastle.util.encoders;

/* loaded from: classes3.dex */
public interface Translator {
    int decode(byte[] bArr, int i, int i9, byte[] bArr2, int i10);

    int encode(byte[] bArr, int i, int i9, byte[] bArr2, int i10);

    int getDecodedBlockSize();

    int getEncodedBlockSize();
}
