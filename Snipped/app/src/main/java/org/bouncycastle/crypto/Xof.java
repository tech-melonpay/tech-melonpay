package org.bouncycastle.crypto;

/* loaded from: classes2.dex */
public interface Xof extends ExtendedDigest {
    int doFinal(byte[] bArr, int i, int i9);

    int doOutput(byte[] bArr, int i, int i9);
}
