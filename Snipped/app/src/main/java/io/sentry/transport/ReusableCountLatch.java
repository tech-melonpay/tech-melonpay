package io.sentry.transport;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* loaded from: classes2.dex */
public final class ReusableCountLatch {

    /* renamed from: a, reason: collision with root package name */
    public final Sync f22204a = new Sync();

    public static final class Sync extends AbstractQueuedSynchronizer {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f22205a = 0;
        private static final long serialVersionUID = 5970133580157457018L;

        public Sync() {
            setState(0);
        }

        public static int a(Sync sync) {
            return sync.getState();
        }

        public static void b(Sync sync) {
            int state;
            do {
                state = sync.getState();
            } while (!sync.compareAndSetState(state, state + 1));
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public final int tryAcquireShared(int i) {
            return getState() == 0 ? 1 : -1;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public final boolean tryReleaseShared(int i) {
            int state;
            int i9;
            do {
                state = getState();
                if (state == 0) {
                    return false;
                }
                i9 = state - 1;
            } while (!compareAndSetState(state, i9));
            return i9 == 0;
        }
    }
}
