package org.bouncycastle.crypto.prng;

/* loaded from: classes2.dex */
public class EntropyUtil {
    public static byte[] generateSeed(EntropySource entropySource, int i) {
        byte[] bArr = new byte[i];
        if (i * 8 <= entropySource.entropySize()) {
            System.arraycopy(entropySource.getEntropy(), 0, bArr, 0, i);
        } else {
            int entropySize = entropySource.entropySize() / 8;
            for (int i9 = 0; i9 < i; i9 += entropySize) {
                byte[] entropy = entropySource.getEntropy();
                int i10 = i - i9;
                if (entropy.length <= i10) {
                    System.arraycopy(entropy, 0, bArr, i9, entropy.length);
                } else {
                    System.arraycopy(entropy, 0, bArr, i9, i10);
                }
            }
        }
        return bArr;
    }
}
