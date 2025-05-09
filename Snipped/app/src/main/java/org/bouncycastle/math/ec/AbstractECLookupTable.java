package org.bouncycastle.math.ec;

/* loaded from: classes.dex */
public abstract class AbstractECLookupTable implements ECLookupTable {
    @Override // org.bouncycastle.math.ec.ECLookupTable
    public ECPoint lookupVar(int i) {
        return lookup(i);
    }
}
