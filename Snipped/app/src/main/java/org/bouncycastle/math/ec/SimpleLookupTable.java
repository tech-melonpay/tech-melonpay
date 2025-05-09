package org.bouncycastle.math.ec;

/* loaded from: classes.dex */
public class SimpleLookupTable extends AbstractECLookupTable {
    private final ECPoint[] points;

    public SimpleLookupTable(ECPoint[] eCPointArr, int i, int i9) {
        this.points = copy(eCPointArr, i, i9);
    }

    private static ECPoint[] copy(ECPoint[] eCPointArr, int i, int i9) {
        ECPoint[] eCPointArr2 = new ECPoint[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            eCPointArr2[i10] = eCPointArr[i + i10];
        }
        return eCPointArr2;
    }

    @Override // org.bouncycastle.math.ec.ECLookupTable
    public int getSize() {
        return this.points.length;
    }

    @Override // org.bouncycastle.math.ec.ECLookupTable
    public ECPoint lookup(int i) {
        throw new UnsupportedOperationException("Constant-time lookup not supported");
    }

    @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
    public ECPoint lookupVar(int i) {
        return this.points[i];
    }
}
