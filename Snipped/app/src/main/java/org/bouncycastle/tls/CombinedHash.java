package org.bouncycastle.tls;

import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsHash;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class CombinedHash implements TlsHash {
    protected TlsContext context;
    protected TlsCrypto crypto;
    protected TlsHash md5;
    protected TlsHash sha1;

    public CombinedHash(CombinedHash combinedHash) {
        this.context = combinedHash.context;
        this.crypto = combinedHash.crypto;
        this.md5 = (TlsHash) combinedHash.md5.clone();
        this.sha1 = (TlsHash) combinedHash.sha1.clone();
    }

    @Override // org.bouncycastle.tls.crypto.TlsHash
    public byte[] calculateHash() {
        return Arrays.concatenate(this.md5.calculateHash(), this.sha1.calculateHash());
    }

    @Override // org.bouncycastle.tls.crypto.TlsHash
    public Object clone() {
        return new CombinedHash(this);
    }

    @Override // org.bouncycastle.tls.crypto.TlsHash
    public void reset() {
        this.md5.reset();
        this.sha1.reset();
    }

    @Override // org.bouncycastle.tls.crypto.TlsHash
    public void update(byte[] bArr, int i, int i9) {
        this.md5.update(bArr, i, i9);
        this.sha1.update(bArr, i, i9);
    }

    public CombinedHash(TlsContext tlsContext, TlsHash tlsHash, TlsHash tlsHash2) {
        this.context = tlsContext;
        this.crypto = tlsContext.getCrypto();
        this.md5 = tlsHash;
        this.sha1 = tlsHash2;
    }

    public CombinedHash(TlsCrypto tlsCrypto) {
        this.crypto = tlsCrypto;
        this.md5 = tlsCrypto.createHash((short) 1);
        this.sha1 = tlsCrypto.createHash((short) 2);
    }
}
