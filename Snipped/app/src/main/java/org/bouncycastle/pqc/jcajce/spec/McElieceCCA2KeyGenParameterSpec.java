package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2;

/* loaded from: classes3.dex */
public class McElieceCCA2KeyGenParameterSpec implements AlgorithmParameterSpec {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    public static final String SHA1 = "SHA-1";
    public static final String SHA224 = "SHA-224";
    public static final String SHA256 = "SHA-256";
    public static final String SHA384 = "SHA-384";
    public static final String SHA512 = "SHA-512";
    private final String digest;
    private int fieldPoly;

    /* renamed from: m, reason: collision with root package name */
    private final int f25466m;

    /* renamed from: n, reason: collision with root package name */
    private final int f25467n;

    /* renamed from: t, reason: collision with root package name */
    private final int f25468t;

    public McElieceCCA2KeyGenParameterSpec() {
        this(11, 50, "SHA-256");
    }

    public String getDigest() {
        return this.digest;
    }

    public int getFieldPoly() {
        return this.fieldPoly;
    }

    public int getM() {
        return this.f25466m;
    }

    public int getN() {
        return this.f25467n;
    }

    public int getT() {
        return this.f25468t;
    }

    public McElieceCCA2KeyGenParameterSpec(int i) {
        this(i, "SHA-256");
    }

    public McElieceCCA2KeyGenParameterSpec(int i, int i9) {
        this(i, i9, "SHA-256");
    }

    public McElieceCCA2KeyGenParameterSpec(int i, int i9, int i10) {
        this(i, i9, i10, "SHA-256");
    }

    public McElieceCCA2KeyGenParameterSpec(int i, int i9, int i10, String str) {
        this.f25466m = i;
        if (i < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i > 32) {
            throw new IllegalArgumentException(" m is too large");
        }
        int i11 = 1 << i;
        this.f25467n = i11;
        this.f25468t = i9;
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
        this.digest = str;
    }

    public McElieceCCA2KeyGenParameterSpec(int i, int i9, String str) {
        if (i < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i > 32) {
            throw new IllegalArgumentException("m is too large");
        }
        this.f25466m = i;
        int i10 = 1 << i;
        this.f25467n = i10;
        if (i9 < 0) {
            throw new IllegalArgumentException("t must be positive");
        }
        if (i9 > i10) {
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        this.f25468t = i9;
        this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i);
        this.digest = str;
    }

    public McElieceCCA2KeyGenParameterSpec(int i, String str) {
        int i9 = 1;
        if (i < 1) {
            throw new IllegalArgumentException("key size must be positive");
        }
        int i10 = 0;
        while (i9 < i) {
            i9 <<= 1;
            i10++;
        }
        this.f25468t = (i9 >>> 1) / i10;
        this.f25466m = i10;
        this.f25467n = i9;
        this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i10);
        this.digest = str;
    }
}
