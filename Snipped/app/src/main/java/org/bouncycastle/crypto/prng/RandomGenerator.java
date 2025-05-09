package org.bouncycastle.crypto.prng;

/* loaded from: classes2.dex */
public interface RandomGenerator {
    void addSeedMaterial(long j10);

    void addSeedMaterial(byte[] bArr);

    void nextBytes(byte[] bArr);

    void nextBytes(byte[] bArr, int i, int i9);
}
