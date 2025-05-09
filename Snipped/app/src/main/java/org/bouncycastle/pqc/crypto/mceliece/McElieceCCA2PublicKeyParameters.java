package org.bouncycastle.pqc.crypto.mceliece;

import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;

/* loaded from: classes3.dex */
public class McElieceCCA2PublicKeyParameters extends McElieceCCA2KeyParameters {
    private GF2Matrix matrixG;

    /* renamed from: n, reason: collision with root package name */
    private int f25411n;

    /* renamed from: t, reason: collision with root package name */
    private int f25412t;

    public McElieceCCA2PublicKeyParameters(int i, int i9, GF2Matrix gF2Matrix, String str) {
        super(false, str);
        this.f25411n = i;
        this.f25412t = i9;
        this.matrixG = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.matrixG;
    }

    public int getK() {
        return this.matrixG.getNumRows();
    }

    public int getN() {
        return this.f25411n;
    }

    public int getT() {
        return this.f25412t;
    }
}
