package org.bouncycastle.pqc.crypto.mceliece;

import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;

/* loaded from: classes3.dex */
public class McEliecePublicKeyParameters extends McElieceKeyParameters {

    /* renamed from: g, reason: collision with root package name */
    private GF2Matrix f25436g;

    /* renamed from: n, reason: collision with root package name */
    private int f25437n;

    /* renamed from: t, reason: collision with root package name */
    private int f25438t;

    public McEliecePublicKeyParameters(int i, int i9, GF2Matrix gF2Matrix) {
        super(false, null);
        this.f25437n = i;
        this.f25438t = i9;
        this.f25436g = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.f25436g;
    }

    public int getK() {
        return this.f25436g.getNumRows();
    }

    public int getN() {
        return this.f25437n;
    }

    public int getT() {
        return this.f25438t;
    }
}
