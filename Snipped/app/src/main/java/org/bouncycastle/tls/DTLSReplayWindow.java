package org.bouncycastle.tls;

/* loaded from: classes3.dex */
class DTLSReplayWindow {
    private static final long VALID_SEQ_MASK = 281474976710655L;
    private static final long WINDOW_SIZE = 64;
    private long latestConfirmedSeq = -1;
    private long bitmap = 0;

    public void reportAuthenticated(long j10) {
        if ((VALID_SEQ_MASK & j10) != j10) {
            throw new IllegalArgumentException("'seq' out of range");
        }
        long j11 = this.latestConfirmedSeq;
        if (j10 <= j11) {
            long j12 = j11 - j10;
            if (j12 < WINDOW_SIZE) {
                this.bitmap |= 1 << ((int) j12);
                return;
            }
            return;
        }
        long j13 = j10 - j11;
        if (j13 >= WINDOW_SIZE) {
            this.bitmap = 1L;
        } else {
            this.bitmap = (this.bitmap << ((int) j13)) | 1;
        }
        this.latestConfirmedSeq = j10;
    }

    public void reset() {
        this.latestConfirmedSeq = -1L;
        this.bitmap = 0L;
    }

    public boolean shouldDiscard(long j10) {
        if ((VALID_SEQ_MASK & j10) != j10) {
            return true;
        }
        long j11 = this.latestConfirmedSeq;
        if (j10 > j11) {
            return false;
        }
        long j12 = j11 - j10;
        return j12 >= WINDOW_SIZE || (this.bitmap & (1 << ((int) j12))) != 0;
    }
}
