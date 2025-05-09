package org.bouncycastle.pqc.crypto.mceliece;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2;

/* loaded from: classes3.dex */
public class McElieceParameters implements CipherParameters {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    private Digest digest;
    private int fieldPoly;

    /* renamed from: m, reason: collision with root package name */
    private int f25425m;

    /* renamed from: n, reason: collision with root package name */
    private int f25426n;

    /* renamed from: t, reason: collision with root package name */
    private int f25427t;

    public McElieceParameters() {
        this(11, 50);
    }

    public int getFieldPoly() {
        return this.fieldPoly;
    }

    public int getM() {
        return this.f25425m;
    }

    public int getN() {
        return this.f25426n;
    }

    public int getT() {
        return this.f25427t;
    }

    public McElieceParameters(int i) {
        this(i, (Digest) null);
    }

    public McElieceParameters(int i, int i9) {
        this(i, i9, (Digest) null);
    }

    public McElieceParameters(int i, int i9, int i10) {
        this(i, i9, i10, null);
    }

    public McElieceParameters(int i, int i9, int i10, Digest digest) {
        this.f25425m = i;
        if (i < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i > 32) {
            throw new IllegalArgumentException(" m is too large");
        }
        int i11 = 1 << i;
        this.f25426n = i11;
        this.f25427t = i9;
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
        this.digest = digest;
    }

    public McElieceParameters(int i, int i9, Digest digest) {
        if (i < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i > 32) {
            throw new IllegalArgumentException("m is too large");
        }
        this.f25425m = i;
        int i10 = 1 << i;
        this.f25426n = i10;
        if (i9 < 0) {
            throw new IllegalArgumentException("t must be positive");
        }
        if (i9 > i10) {
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        this.f25427t = i9;
        this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i);
        this.digest = digest;
    }

    public McElieceParameters(int i, Digest digest) {
        if (i < 1) {
            throw new IllegalArgumentException("key size must be positive");
        }
        this.f25425m = 0;
        this.f25426n = 1;
        while (true) {
            int i9 = this.f25426n;
            if (i9 >= i) {
                int i10 = i9 >>> 1;
                this.f25427t = i10;
                int i11 = this.f25425m;
                this.f25427t = i10 / i11;
                this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i11);
                this.digest = digest;
                return;
            }
            this.f25426n = i9 << 1;
            this.f25425m++;
        }
    }

    public McElieceParameters(Digest digest) {
        this(11, 50, digest);
    }
}
