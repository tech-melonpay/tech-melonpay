package org.bouncycastle.pqc.crypto.sphincsplus;

/* loaded from: classes3.dex */
class IndexedDigest {
    final byte[] digest;
    final int idx_leaf;
    final long idx_tree;

    public IndexedDigest(long j10, int i, byte[] bArr) {
        this.idx_tree = j10;
        this.idx_leaf = i;
        this.digest = bArr;
    }
}
