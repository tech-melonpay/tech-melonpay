package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2;

/* loaded from: classes3.dex */
public class McElieceKeyGenParameterSpec implements AlgorithmParameterSpec {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    private int fieldPoly;

    /* renamed from: m, reason: collision with root package name */
    private int f25469m;

    /* renamed from: n, reason: collision with root package name */
    private int f25470n;

    /* renamed from: t, reason: collision with root package name */
    private int f25471t;

    public McElieceKeyGenParameterSpec() {
        this(11, 50);
    }

    public int getFieldPoly() {
        return this.fieldPoly;
    }

    public int getM() {
        return this.f25469m;
    }

    public int getN() {
        return this.f25470n;
    }

    public int getT() {
        return this.f25471t;
    }

    public McElieceKeyGenParameterSpec(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("key size must be positive");
        }
        this.f25469m = 0;
        this.f25470n = 1;
        while (true) {
            int i9 = this.f25470n;
            if (i9 >= i) {
                int i10 = i9 >>> 1;
                this.f25471t = i10;
                int i11 = this.f25469m;
                this.f25471t = i10 / i11;
                this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i11);
                return;
            }
            this.f25470n = i9 << 1;
            this.f25469m++;
        }
    }

    public McElieceKeyGenParameterSpec(int i, int i9) {
        if (i < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i > 32) {
            throw new IllegalArgumentException("m is too large");
        }
        this.f25469m = i;
        int i10 = 1 << i;
        this.f25470n = i10;
        if (i9 < 0) {
            throw new IllegalArgumentException("t must be positive");
        }
        if (i9 > i10) {
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        this.f25471t = i9;
        this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i);
    }

    public McElieceKeyGenParameterSpec(int i, int i9, int i10) {
        this.f25469m = i;
        if (i < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i > 32) {
            throw new IllegalArgumentException(" m is too large");
        }
        int i11 = 1 << i;
        this.f25470n = i11;
        this.f25471t = i9;
        if (i9 < 0) {
            throw new IllegalArgumentException("t must be positive");
        }
        if (i9 > i11) {
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        if (PolynomialRingGF2.degree(i10) != i || !PolynomialRingGF2.isIrreducible(i10)) {
            throw new IllegalArgumentException("polynomial is not a field polynomial for GF(2^m)");
        }
        this.fieldPoly = i10;
    }
}
