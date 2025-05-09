package org.bouncycastle.pqc.crypto.mceliece;

/* loaded from: classes3.dex */
public class McElieceCCA2Parameters extends McElieceParameters {
    private final String digest;

    public McElieceCCA2Parameters() {
        this(11, 50, "SHA-256");
    }

    public String getDigest() {
        return this.digest;
    }

    public McElieceCCA2Parameters(int i) {
        this(i, "SHA-256");
    }

    public McElieceCCA2Parameters(int i, int i9) {
        this(i, i9, "SHA-256");
    }

    public McElieceCCA2Parameters(int i, int i9, int i10) {
        this(i, i9, i10, "SHA-256");
    }

    public McElieceCCA2Parameters(int i, int i9, int i10, String str) {
        super(i, i9, i10);
        this.digest = str;
    }

    public McElieceCCA2Parameters(int i, int i9, String str) {
        super(i, i9);
        this.digest = str;
    }

    public McElieceCCA2Parameters(int i, String str) {
        super(i);
        this.digest = str;
    }

    public McElieceCCA2Parameters(String str) {
        this(11, 50, str);
    }
}
