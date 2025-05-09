package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.KeySpec;
import org.bouncycastle.pqc.crypto.rainbow.Layer;

/* loaded from: classes3.dex */
public class RainbowPrivateKeySpec implements KeySpec {
    private short[][] A1inv;
    private short[][] A2inv;

    /* renamed from: b1, reason: collision with root package name */
    private short[] f25472b1;

    /* renamed from: b2, reason: collision with root package name */
    private short[] f25473b2;
    private Layer[] layers;
    private int[] vi;

    public RainbowPrivateKeySpec(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, Layer[] layerArr) {
        this.A1inv = sArr;
        this.f25472b1 = sArr2;
        this.A2inv = sArr3;
        this.f25473b2 = sArr4;
        this.vi = iArr;
        this.layers = layerArr;
    }

    public short[] getB1() {
        return this.f25472b1;
    }

    public short[] getB2() {
        return this.f25473b2;
    }

    public short[][] getInvA1() {
        return this.A1inv;
    }

    public short[][] getInvA2() {
        return this.A2inv;
    }

    public Layer[] getLayers() {
        return this.layers;
    }

    public int[] getVi() {
        return this.vi;
    }
}
