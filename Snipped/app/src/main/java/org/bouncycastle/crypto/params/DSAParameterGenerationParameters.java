package org.bouncycastle.crypto.params;

import java.security.SecureRandom;

/* loaded from: classes2.dex */
public class DSAParameterGenerationParameters {
    public static final int DIGITAL_SIGNATURE_USAGE = 1;
    public static final int KEY_ESTABLISHMENT_USAGE = 2;
    private final int certainty;

    /* renamed from: l, reason: collision with root package name */
    private final int f25085l;

    /* renamed from: n, reason: collision with root package name */
    private final int f25086n;
    private final SecureRandom random;
    private final int usageIndex;

    public DSAParameterGenerationParameters(int i, int i9, int i10, SecureRandom secureRandom) {
        this(i, i9, i10, secureRandom, -1);
    }

    public int getCertainty() {
        return this.certainty;
    }

    public int getL() {
        return this.f25085l;
    }

    public int getN() {
        return this.f25086n;
    }

    public SecureRandom getRandom() {
        return this.random;
    }

    public int getUsageIndex() {
        return this.usageIndex;
    }

    public DSAParameterGenerationParameters(int i, int i9, int i10, SecureRandom secureRandom, int i11) {
        this.f25085l = i;
        this.f25086n = i9;
        this.certainty = i10;
        this.usageIndex = i11;
        this.random = secureRandom;
    }
}
