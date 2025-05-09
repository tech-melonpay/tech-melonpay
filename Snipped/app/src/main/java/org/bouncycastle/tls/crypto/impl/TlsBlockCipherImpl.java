package org.bouncycastle.tls.crypto.impl;

/* loaded from: classes3.dex */
public interface TlsBlockCipherImpl {
    int doFinal(byte[] bArr, int i, int i9, byte[] bArr2, int i10);

    int getBlockSize();

    void init(byte[] bArr, int i, int i9);

    void setKey(byte[] bArr, int i, int i9);
}
