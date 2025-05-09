package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.pqc.crypto.xmss.XMSSAddress;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
final class LTreeAddress extends XMSSAddress {
    private static final int TYPE = 1;
    private final int lTreeAddress;
    private final int treeHeight;
    private final int treeIndex;

    public static class Builder extends XMSSAddress.Builder<Builder> {
        private int lTreeAddress;
        private int treeHeight;
        private int treeIndex;

        public Builder() {
            super(1);
            this.lTreeAddress = 0;
            this.treeHeight = 0;
            this.treeIndex = 0;
        }

        @Override // org.bouncycastle.pqc.crypto.xmss.XMSSAddress.Builder
        public XMSSAddress build() {
            return new LTreeAddress(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.bouncycastle.pqc.crypto.xmss.XMSSAddress.Builder
        public Builder getThis() {
            return this;
        }

        public Builder withLTreeAddress(int i) {
            this.lTreeAddress = i;
            return this;
        }

        public Builder withTreeHeight(int i) {
            this.treeHeight = i;
            return this;
        }

        public Builder withTreeIndex(int i) {
            this.treeIndex = i;
            return this;
        }
    }

    private LTreeAddress(Builder builder) {
        super(builder);
        this.lTreeAddress = builder.lTreeAddress;
        this.treeHeight = builder.treeHeight;
        this.treeIndex = builder.treeIndex;
    }

    public int getLTreeAddress() {
        return this.lTreeAddress;
    }

    public int getTreeHeight() {
        return this.treeHeight;
    }

    public int getTreeIndex() {
        return this.treeIndex;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSAddress
    public byte[] toByteArray() {
        byte[] byteArray = super.toByteArray();
        Pack.intToBigEndian(this.lTreeAddress, byteArray, 16);
        Pack.intToBigEndian(this.treeHeight, byteArray, 20);
        Pack.intToBigEndian(this.treeIndex, byteArray, 24);
        return byteArray;
    }
}
