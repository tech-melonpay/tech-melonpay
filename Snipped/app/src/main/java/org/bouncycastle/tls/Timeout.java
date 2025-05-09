package org.bouncycastle.tls;

/* loaded from: classes3.dex */
class Timeout {
    private long durationMillis;
    private long startMillis;

    public Timeout(long j10) {
        this(j10, System.currentTimeMillis());
    }

    public static int constrainWaitMillis(int i, Timeout timeout, long j10) {
        int waitMillis;
        if (i >= 0 && (waitMillis = getWaitMillis(timeout, j10)) >= 0) {
            return i == 0 ? waitMillis : waitMillis == 0 ? i : Math.min(i, waitMillis);
        }
        return -1;
    }

    public static Timeout forWaitMillis(int i) {
        return forWaitMillis(i, System.currentTimeMillis());
    }

    public static int getWaitMillis(Timeout timeout, long j10) {
        if (timeout == null) {
            return 0;
        }
        long remainingMillis = timeout.remainingMillis(j10);
        if (remainingMillis < 1) {
            return -1;
        }
        if (remainingMillis > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) remainingMillis;
    }

    public static boolean hasExpired(Timeout timeout, long j10) {
        return timeout != null && timeout.remainingMillis(j10) < 1;
    }

    public synchronized long remainingMillis(long j10) {
        long j11 = this.startMillis;
        if (j11 > j10) {
            this.startMillis = j10;
            return this.durationMillis;
        }
        long j12 = this.durationMillis - (j10 - j11);
        if (j12 > 0) {
            return j12;
        }
        this.durationMillis = 0L;
        return 0L;
    }

    public Timeout(long j10, long j11) {
        this.durationMillis = Math.max(0L, j10);
        this.startMillis = Math.max(0L, j11);
    }

    public static Timeout forWaitMillis(int i, long j10) {
        if (i < 0) {
            throw new IllegalArgumentException("'waitMillis' cannot be negative");
        }
        if (i > 0) {
            return new Timeout(i, j10);
        }
        return null;
    }
}
