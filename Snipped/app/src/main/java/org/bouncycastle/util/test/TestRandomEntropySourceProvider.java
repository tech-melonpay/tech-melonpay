package org.bouncycastle.util.test;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.crypto.prng.EntropySourceProvider;

/* loaded from: classes3.dex */
public class TestRandomEntropySourceProvider implements EntropySourceProvider {
    private final boolean _predictionResistant;
    private final SecureRandom _sr = new SecureRandom();

    public TestRandomEntropySourceProvider(boolean z10) {
        this._predictionResistant = z10;
    }

    @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
    public EntropySource get(final int i) {
        return new EntropySource() { // from class: org.bouncycastle.util.test.TestRandomEntropySourceProvider.1
            @Override // org.bouncycastle.crypto.prng.EntropySource
            public int entropySize() {
                return i;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public byte[] getEntropy() {
                byte[] bArr = new byte[(i + 7) / 8];
                TestRandomEntropySourceProvider.this._sr.nextBytes(bArr);
                return bArr;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public boolean isPredictionResistant() {
                return TestRandomEntropySourceProvider.this._predictionResistant;
            }
        };
    }
}
