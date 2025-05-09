package org.bouncycastle.math.field;

import org.bouncycastle.util.Arrays;

/* loaded from: classes.dex */
class GF2Polynomial implements Polynomial {
    protected final int[] exponents;

    public GF2Polynomial(int[] iArr) {
        this.exponents = Arrays.clone(iArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GF2Polynomial) {
            return Arrays.areEqual(this.exponents, ((GF2Polynomial) obj).exponents);
        }
        return false;
    }

    @Override // org.bouncycastle.math.field.Polynomial
    public int getDegree() {
        return this.exponents[r0.length - 1];
    }

    @Override // org.bouncycastle.math.field.Polynomial
    public int[] getExponentsPresent() {
        return Arrays.clone(this.exponents);
    }

    public int hashCode() {
        return Arrays.hashCode(this.exponents);
    }
}
