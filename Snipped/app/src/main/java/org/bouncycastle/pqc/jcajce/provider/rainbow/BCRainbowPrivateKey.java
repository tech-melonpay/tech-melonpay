package org.bouncycastle.pqc.jcajce.provider.rainbow;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.RainbowPrivateKey;
import org.bouncycastle.pqc.crypto.rainbow.Layer;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil;
import org.bouncycastle.pqc.jcajce.spec.RainbowPrivateKeySpec;

/* loaded from: classes3.dex */
public class BCRainbowPrivateKey implements PrivateKey {
    private static final long serialVersionUID = 1;
    private short[][] A1inv;
    private short[][] A2inv;

    /* renamed from: b1, reason: collision with root package name */
    private short[] f25464b1;

    /* renamed from: b2, reason: collision with root package name */
    private short[] f25465b2;
    private Layer[] layers;
    private int[] vi;

    public BCRainbowPrivateKey(RainbowPrivateKeyParameters rainbowPrivateKeyParameters) {
        this(rainbowPrivateKeyParameters.getInvA1(), rainbowPrivateKeyParameters.getB1(), rainbowPrivateKeyParameters.getInvA2(), rainbowPrivateKeyParameters.getB2(), rainbowPrivateKeyParameters.getVi(), rainbowPrivateKeyParameters.getLayers());
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCRainbowPrivateKey)) {
            return false;
        }
        BCRainbowPrivateKey bCRainbowPrivateKey = (BCRainbowPrivateKey) obj;
        boolean z10 = RainbowUtil.equals(this.A1inv, bCRainbowPrivateKey.getInvA1()) && RainbowUtil.equals(this.A2inv, bCRainbowPrivateKey.getInvA2()) && RainbowUtil.equals(this.f25464b1, bCRainbowPrivateKey.getB1()) && RainbowUtil.equals(this.f25465b2, bCRainbowPrivateKey.getB2()) && Arrays.equals(this.vi, bCRainbowPrivateKey.getVi());
        if (this.layers.length != bCRainbowPrivateKey.getLayers().length) {
            return false;
        }
        for (int length = this.layers.length - 1; length >= 0; length--) {
            z10 &= this.layers[length].equals(bCRainbowPrivateKey.getLayers()[length]);
        }
        return z10;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    public short[] getB1() {
        return this.f25464b1;
    }

    public short[] getB2() {
        return this.f25465b2;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new PrivateKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.rainbow, DERNull.INSTANCE), new RainbowPrivateKey(this.A1inv, this.f25464b1, this.A2inv, this.f25465b2, this.vi, this.layers)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
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

    public int hashCode() {
        int hashCode = org.bouncycastle.util.Arrays.hashCode(this.vi) + ((org.bouncycastle.util.Arrays.hashCode(this.f25465b2) + ((org.bouncycastle.util.Arrays.hashCode(this.A2inv) + ((org.bouncycastle.util.Arrays.hashCode(this.f25464b1) + ((org.bouncycastle.util.Arrays.hashCode(this.A1inv) + (this.layers.length * 37)) * 37)) * 37)) * 37)) * 37);
        for (int length = this.layers.length - 1; length >= 0; length--) {
            hashCode = (hashCode * 37) + this.layers[length].hashCode();
        }
        return hashCode;
    }

    public BCRainbowPrivateKey(RainbowPrivateKeySpec rainbowPrivateKeySpec) {
        this(rainbowPrivateKeySpec.getInvA1(), rainbowPrivateKeySpec.getB1(), rainbowPrivateKeySpec.getInvA2(), rainbowPrivateKeySpec.getB2(), rainbowPrivateKeySpec.getVi(), rainbowPrivateKeySpec.getLayers());
    }

    public BCRainbowPrivateKey(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, Layer[] layerArr) {
        this.A1inv = sArr;
        this.f25464b1 = sArr2;
        this.A2inv = sArr3;
        this.f25465b2 = sArr4;
        this.vi = iArr;
        this.layers = layerArr;
    }
}
