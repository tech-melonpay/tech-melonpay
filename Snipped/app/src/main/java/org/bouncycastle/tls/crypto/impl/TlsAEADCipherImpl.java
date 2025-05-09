package org.bouncycastle.tls.crypto.impl;

/* loaded from: classes3.dex */
public interface TlsAEADCipherImpl {
    int doFinal(byte[] bArr, int i, int i9, byte[] bArr2, int i10);

    int getOutputSize(int i);

    void init(byte[] bArr, int i, byte[] bArr2);

    void setKey(byte[] bArr, int i, int i9);
}
