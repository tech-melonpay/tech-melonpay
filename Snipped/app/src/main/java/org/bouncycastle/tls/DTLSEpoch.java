package org.bouncycastle.tls;

import org.bouncycastle.tls.crypto.TlsCipher;

/* loaded from: classes3.dex */
class DTLSEpoch {
    private final TlsCipher cipher;
    private final int epoch;
    private final DTLSReplayWindow replayWindow = new DTLSReplayWindow();
    private long sequenceNumber = 0;

    public DTLSEpoch(int i, TlsCipher tlsCipher) {
        if (i < 0) {
            throw new IllegalArgumentException("'epoch' must be >= 0");
        }
        if (tlsCipher == null) {
            throw new IllegalArgumentException("'cipher' cannot be null");
        }
        this.epoch = i;
        this.cipher = tlsCipher;
    }

    public synchronized long allocateSequenceNumber() {
        long j10;
        j10 = this.sequenceNumber;
        if (j10 >= 281474976710656L) {
            throw new TlsFatalAlert((short) 80);
        }
        this.sequenceNumber = 1 + j10;
        return j10;
    }

    public TlsCipher getCipher() {
        return this.cipher;
    }

    public int getEpoch() {
        return this.epoch;
    }

    public DTLSReplayWindow getReplayWindow() {
        return this.replayWindow;
    }

    public synchronized long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public synchronized void setSequenceNumber(long j10) {
        this.sequenceNumber = j10;
    }
}
