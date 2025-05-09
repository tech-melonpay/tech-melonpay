package org.bouncycastle.pqc.crypto.gmss;

import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class GMSSParameters {

    /* renamed from: K, reason: collision with root package name */
    private int[] f25371K;
    private int[] heightOfTrees;
    private int numOfLayers;
    private int[] winternitzParameter;

    public GMSSParameters(int i) {
        if (i <= 10) {
            init(1, new int[]{10}, new int[]{3}, new int[]{2});
        } else if (i <= 20) {
            init(2, new int[]{10, 10}, new int[]{5, 4}, new int[]{2, 2});
        } else {
            init(4, new int[]{10, 10, 10, 10}, new int[]{9, 9, 9, 3}, new int[]{2, 2, 2, 2});
        }
    }

    private void init(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        String str;
        boolean z10;
        this.numOfLayers = i;
        if (i == iArr2.length && i == iArr.length && i == iArr3.length) {
            z10 = true;
            str = "";
        } else {
            str = "Unexpected parameterset format";
            z10 = false;
        }
        for (int i9 = 0; i9 < this.numOfLayers; i9++) {
            int i10 = iArr3[i9];
            if (i10 < 2 || (iArr[i9] - i10) % 2 != 0) {
                str = "Wrong parameter K (K >= 2 and H-K even required)!";
                z10 = false;
            }
            if (iArr[i9] < 4 || iArr2[i9] < 2) {
                str = "Wrong parameter H or w (H > 3 and w > 1 required)!";
                z10 = false;
            }
        }
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
        this.heightOfTrees = Arrays.clone(iArr);
        this.winternitzParameter = Arrays.clone(iArr2);
        this.f25371K = Arrays.clone(iArr3);
    }

    public int[] getHeightOfTrees() {
        return Arrays.clone(this.heightOfTrees);
    }

    public int[] getK() {
        return Arrays.clone(this.f25371K);
    }

    public int getNumOfLayers() {
        return this.numOfLayers;
    }

    public int[] getWinternitzParameter() {
        return Arrays.clone(this.winternitzParameter);
    }

    public GMSSParameters(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        init(i, iArr, iArr2, iArr3);
    }
}
