package org.bouncycastle.pqc.crypto.gmss;

import C.v;
import androidx.camera.core.impl.utils.a;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;
import s3.b;

/* loaded from: classes3.dex */
public class GMSSLeaf {
    private byte[] concHashs;
    private GMSSRandom gmssRandom;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f25369j;
    private int keysize;
    private byte[] leaf;
    private int mdsize;
    private Digest messDigestOTS;
    byte[] privateKeyOTS;
    private byte[] seed;
    private int steps;
    private int two_power_w;

    /* renamed from: w, reason: collision with root package name */
    private int f25370w;

    public GMSSLeaf(Digest digest, int i, int i9) {
        this.f25370w = i;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.mdsize = this.messDigestOTS.getDigestSize();
        double d10 = i;
        this.keysize = ((int) Math.ceil((r7 << 3) / d10)) + ((int) Math.ceil(getLog((r7 << i) + 1) / d10));
        this.two_power_w = 1 << i;
        this.steps = (int) Math.ceil(((((r8 - 1) * r7) + 1) + r7) / i9);
        int i10 = this.mdsize;
        this.seed = new byte[i10];
        this.leaf = new byte[i10];
        this.privateKeyOTS = new byte[i10];
        this.concHashs = new byte[i10 * this.keysize];
    }

    private int getLog(int i) {
        int i9 = 1;
        int i10 = 2;
        while (i10 < i) {
            i10 <<= 1;
            i9++;
        }
        return i9;
    }

    private void updateLeafCalc() {
        byte[] bArr = new byte[this.messDigestOTS.getDigestSize()];
        for (int i = 0; i < this.steps + ModuleDescriptor.MODULE_VERSION; i++) {
            int i9 = this.i;
            if (i9 == this.keysize && this.f25369j == this.two_power_w - 1) {
                Digest digest = this.messDigestOTS;
                byte[] bArr2 = this.concHashs;
                digest.update(bArr2, 0, bArr2.length);
                byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
                this.leaf = bArr3;
                this.messDigestOTS.doFinal(bArr3, 0);
                return;
            }
            if (i9 == 0 || this.f25369j == this.two_power_w - 1) {
                this.i = i9 + 1;
                this.f25369j = 0;
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            } else {
                Digest digest2 = this.messDigestOTS;
                byte[] bArr4 = this.privateKeyOTS;
                digest2.update(bArr4, 0, bArr4.length);
                this.privateKeyOTS = bArr;
                this.messDigestOTS.doFinal(bArr, 0);
                int i10 = this.f25369j + 1;
                this.f25369j = i10;
                if (i10 == this.two_power_w - 1) {
                    byte[] bArr5 = this.privateKeyOTS;
                    byte[] bArr6 = this.concHashs;
                    int i11 = this.mdsize;
                    System.arraycopy(bArr5, 0, bArr6, (this.i - 1) * i11, i11);
                }
            }
        }
        throw new IllegalStateException("unable to updateLeaf in steps: " + this.steps + " " + this.i + " " + this.f25369j);
    }

    public byte[] getLeaf() {
        return Arrays.clone(this.leaf);
    }

    public byte[][] getStatByte() {
        return new byte[][]{this.privateKeyOTS, this.seed, this.concHashs, this.leaf};
    }

    public int[] getStatInt() {
        return new int[]{this.i, this.f25369j, this.steps, this.f25370w};
    }

    public void initLeafCalc(byte[] bArr) {
        this.i = 0;
        this.f25369j = 0;
        byte[] bArr2 = new byte[this.mdsize];
        System.arraycopy(bArr, 0, bArr2, 0, this.seed.length);
        this.seed = this.gmssRandom.nextSeed(bArr2);
    }

    public GMSSLeaf nextLeaf() {
        GMSSLeaf gMSSLeaf = new GMSSLeaf(this);
        gMSSLeaf.updateLeafCalc();
        return gMSSLeaf;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < 4; i++) {
            str = b.m(v.s(str), getStatInt()[i], " ");
        }
        StringBuilder r8 = a.r(str, " ");
        r8.append(this.mdsize);
        r8.append(" ");
        r8.append(this.keysize);
        r8.append(" ");
        String m2 = b.m(r8, this.two_power_w, " ");
        byte[][] statByte = getStatByte();
        for (int i9 = 0; i9 < 4; i9++) {
            m2 = statByte[i9] != null ? a.n(v.s(m2), new String(Hex.encode(statByte[i9])), " ") : v.n(m2, "null ");
        }
        return m2;
    }

    public GMSSLeaf(Digest digest, int i, int i9, byte[] bArr) {
        this.f25370w = i;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.mdsize = this.messDigestOTS.getDigestSize();
        double d10 = i;
        this.keysize = ((int) Math.ceil((r7 << 3) / d10)) + ((int) Math.ceil(getLog((r7 << i) + 1) / d10));
        this.two_power_w = 1 << i;
        this.steps = (int) Math.ceil(((((r8 - 1) * r7) + 1) + r7) / i9);
        int i10 = this.mdsize;
        this.seed = new byte[i10];
        this.leaf = new byte[i10];
        this.privateKeyOTS = new byte[i10];
        this.concHashs = new byte[i10 * this.keysize];
        initLeafCalc(bArr);
    }

    public GMSSLeaf(Digest digest, byte[][] bArr, int[] iArr) {
        this.i = iArr[0];
        this.f25369j = iArr[1];
        this.steps = iArr[2];
        this.f25370w = iArr[3];
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.mdsize = this.messDigestOTS.getDigestSize();
        this.keysize = ((int) Math.ceil((r9 << 3) / this.f25370w)) + ((int) Math.ceil(getLog((r9 << this.f25370w) + 1) / this.f25370w));
        this.two_power_w = 1 << this.f25370w;
        this.privateKeyOTS = bArr[0];
        this.seed = bArr[1];
        this.concHashs = bArr[2];
        this.leaf = bArr[3];
    }

    private GMSSLeaf(GMSSLeaf gMSSLeaf) {
        this.messDigestOTS = gMSSLeaf.messDigestOTS;
        this.mdsize = gMSSLeaf.mdsize;
        this.keysize = gMSSLeaf.keysize;
        this.gmssRandom = gMSSLeaf.gmssRandom;
        this.leaf = Arrays.clone(gMSSLeaf.leaf);
        this.concHashs = Arrays.clone(gMSSLeaf.concHashs);
        this.i = gMSSLeaf.i;
        this.f25369j = gMSSLeaf.f25369j;
        this.two_power_w = gMSSLeaf.two_power_w;
        this.f25370w = gMSSLeaf.f25370w;
        this.steps = gMSSLeaf.steps;
        this.seed = Arrays.clone(gMSSLeaf.seed);
        this.privateKeyOTS = Arrays.clone(gMSSLeaf.privateKeyOTS);
    }
}
