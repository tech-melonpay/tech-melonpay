package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public final class KDFFeedbackParameters implements DerivationParameters {
    private static final int UNUSED_R = -1;
    private final byte[] fixedInputData;
    private final byte[] iv;
    private final byte[] ki;

    /* renamed from: r, reason: collision with root package name */
    private final int f25111r;
    private final boolean useCounter;

    private KDFFeedbackParameters(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, boolean z10) {
        if (bArr == null) {
            throw new IllegalArgumentException("A KDF requires Ki (a seed) as input");
        }
        this.ki = Arrays.clone(bArr);
        if (bArr3 == null) {
            this.fixedInputData = new byte[0];
        } else {
            this.fixedInputData = Arrays.clone(bArr3);
        }
        this.f25111r = i;
        if (bArr2 == null) {
            this.iv = new byte[0];
        } else {
            this.iv = Arrays.clone(bArr2);
        }
        this.useCounter = z10;
    }

    public static KDFFeedbackParameters createWithCounter(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        if (i == 8 || i == 16 || i == 24 || i == 32) {
            return new KDFFeedbackParameters(bArr, bArr2, bArr3, i, true);
        }
        throw new IllegalArgumentException("Length of counter should be 8, 16, 24 or 32");
    }

    public static KDFFeedbackParameters createWithoutCounter(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return new KDFFeedbackParameters(bArr, bArr2, bArr3, -1, false);
    }

    public byte[] getFixedInputData() {
        return Arrays.clone(this.fixedInputData);
    }

    public byte[] getIV() {
        return this.iv;
    }

    public byte[] getKI() {
        return this.ki;
    }

    public int getR() {
        return this.f25111r;
    }

    public boolean useCounter() {
        return this.useCounter;
    }
}
