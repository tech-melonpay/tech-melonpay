package org.bouncycastle.tls;

import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.tls.crypto.TlsHash;
import org.bouncycastle.util.Shorts;

/* loaded from: classes3.dex */
class DeferredHash implements TlsHandshakeHash {
    protected static final int BUFFERING_HASH_LIMIT = 4;
    private DigestInputBuffer buf;
    protected TlsContext context;
    private boolean forceBuffering;
    private Hashtable<Short, TlsHash> hashes;
    private boolean sealed;

    public DeferredHash(TlsContext tlsContext) {
        this.context = tlsContext;
        this.buf = new DigestInputBuffer();
        this.hashes = new Hashtable<>();
        this.forceBuffering = false;
        this.sealed = false;
    }

    @Override // org.bouncycastle.tls.crypto.TlsHash
    public byte[] calculateHash() {
        throw new IllegalStateException("Use fork() to get a definite Digest");
    }

    public void checkStopBuffering() {
        if (this.forceBuffering || !this.sealed || this.buf == null || this.hashes.size() > 4) {
            return;
        }
        Enumeration<TlsHash> elements = this.hashes.elements();
        while (elements.hasMoreElements()) {
            this.buf.updateDigest(elements.nextElement());
        }
        this.buf = null;
    }

    public void checkTrackingHash(Short sh) {
        if (this.hashes.containsKey(sh)) {
            return;
        }
        this.hashes.put(sh, this.context.getCrypto().createHash(sh.shortValue()));
    }

    @Override // org.bouncycastle.tls.crypto.TlsHash
    public Object clone() {
        throw new IllegalStateException("attempt to clone a DeferredHash");
    }

    public TlsHash cloneHash(Short sh) {
        return (TlsHash) this.hashes.get(sh).clone();
    }

    @Override // org.bouncycastle.tls.TlsHandshakeHash
    public void copyBufferTo(OutputStream outputStream) {
        DigestInputBuffer digestInputBuffer = this.buf;
        if (digestInputBuffer == null) {
            throw new IllegalStateException("Not buffering");
        }
        digestInputBuffer.copyTo(outputStream);
    }

    @Override // org.bouncycastle.tls.TlsHandshakeHash
    public void forceBuffering() {
        if (this.sealed) {
            throw new IllegalStateException("Too late to force buffering");
        }
        this.forceBuffering = true;
    }

    @Override // org.bouncycastle.tls.TlsHandshakeHash
    public TlsHash forkPRFHash() {
        checkStopBuffering();
        int prfAlgorithm = this.context.getSecurityParametersHandshake().getPrfAlgorithm();
        TlsHash combinedHash = prfAlgorithm == 0 ? new CombinedHash(this.context, cloneHash((short) 1), cloneHash((short) 2)) : cloneHash(TlsUtils.getHashAlgorithmForPRFAlgorithm(prfAlgorithm));
        DigestInputBuffer digestInputBuffer = this.buf;
        if (digestInputBuffer != null) {
            digestInputBuffer.updateDigest(combinedHash);
        }
        return combinedHash;
    }

    @Override // org.bouncycastle.tls.TlsHandshakeHash
    public byte[] getFinalHash(short s10) {
        TlsHash tlsHash = this.hashes.get(Shorts.valueOf(s10));
        if (tlsHash == null) {
            throw new IllegalStateException("HashAlgorithm." + HashAlgorithm.getText(s10) + " is not being tracked");
        }
        TlsHash tlsHash2 = (TlsHash) tlsHash.clone();
        DigestInputBuffer digestInputBuffer = this.buf;
        if (digestInputBuffer != null) {
            digestInputBuffer.updateDigest(tlsHash2);
        }
        return tlsHash2.calculateHash();
    }

    @Override // org.bouncycastle.tls.TlsHandshakeHash
    public TlsHandshakeHash notifyPRFDetermined() {
        short hashAlgorithmForPRFAlgorithm;
        int prfAlgorithm = this.context.getSecurityParametersHandshake().getPrfAlgorithm();
        if (prfAlgorithm == 0) {
            checkTrackingHash(Shorts.valueOf((short) 1));
            hashAlgorithmForPRFAlgorithm = 2;
        } else {
            hashAlgorithmForPRFAlgorithm = TlsUtils.getHashAlgorithmForPRFAlgorithm(prfAlgorithm);
        }
        checkTrackingHash(Shorts.valueOf(hashAlgorithmForPRFAlgorithm));
        return this;
    }

    @Override // org.bouncycastle.tls.crypto.TlsHash
    public void reset() {
        this.forceBuffering = false;
        this.sealed = false;
        DigestInputBuffer digestInputBuffer = this.buf;
        if (digestInputBuffer != null) {
            digestInputBuffer.reset();
            return;
        }
        Enumeration<TlsHash> elements = this.hashes.elements();
        while (elements.hasMoreElements()) {
            elements.nextElement().reset();
        }
    }

    @Override // org.bouncycastle.tls.TlsHandshakeHash
    public void sealHashAlgorithms() {
        if (this.sealed) {
            return;
        }
        this.sealed = true;
        checkStopBuffering();
    }

    @Override // org.bouncycastle.tls.TlsHandshakeHash
    public TlsHandshakeHash stopTracking() {
        short hashAlgorithmForPRFAlgorithm;
        Hashtable hashtable = new Hashtable();
        int prfAlgorithm = this.context.getSecurityParametersHandshake().getPrfAlgorithm();
        if (prfAlgorithm == 0) {
            cloneHash(hashtable, (short) 1);
            hashAlgorithmForPRFAlgorithm = 2;
        } else {
            hashAlgorithmForPRFAlgorithm = TlsUtils.getHashAlgorithmForPRFAlgorithm(prfAlgorithm);
        }
        cloneHash(hashtable, hashAlgorithmForPRFAlgorithm);
        return new DeferredHash(this.context, hashtable);
    }

    @Override // org.bouncycastle.tls.TlsHandshakeHash
    public void trackHashAlgorithm(short s10) {
        if (this.sealed) {
            throw new IllegalStateException("Too late to track more hash algorithms");
        }
        checkTrackingHash(Shorts.valueOf(s10));
    }

    @Override // org.bouncycastle.tls.crypto.TlsHash
    public void update(byte[] bArr, int i, int i9) {
        DigestInputBuffer digestInputBuffer = this.buf;
        if (digestInputBuffer != null) {
            digestInputBuffer.write(bArr, i, i9);
            return;
        }
        Enumeration<TlsHash> elements = this.hashes.elements();
        while (elements.hasMoreElements()) {
            elements.nextElement().update(bArr, i, i9);
        }
    }

    private DeferredHash(TlsContext tlsContext, Hashtable hashtable) {
        this.context = tlsContext;
        this.buf = null;
        this.hashes = hashtable;
        this.forceBuffering = false;
        this.sealed = true;
    }

    public TlsHash cloneHash(short s10) {
        return cloneHash(Shorts.valueOf(s10));
    }

    public void cloneHash(Hashtable hashtable, Short sh) {
        TlsHash cloneHash = cloneHash(sh);
        DigestInputBuffer digestInputBuffer = this.buf;
        if (digestInputBuffer != null) {
            digestInputBuffer.updateDigest(cloneHash);
        }
        hashtable.put(sh, cloneHash);
    }

    public void cloneHash(Hashtable hashtable, short s10) {
        cloneHash(hashtable, Shorts.valueOf(s10));
    }
}
