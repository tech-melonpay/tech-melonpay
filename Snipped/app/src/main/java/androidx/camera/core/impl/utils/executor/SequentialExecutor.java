package androidx.camera.core.impl.utils.executor;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class SequentialExecutor implements Executor {
    private static final String TAG = "SequentialExecutor";
    private final Executor mExecutor;
    final Deque<Runnable> mQueue = new ArrayDeque();
    private final QueueWorker mWorker = new QueueWorker();
    WorkerRunningState mWorkerRunningState = WorkerRunningState.IDLE;
    long mWorkerRunCount = 0;

    public final class QueueWorker implements Runnable {
        public QueueWorker() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        
            androidx.camera.core.Logger.e(androidx.camera.core.impl.utils.executor.SequentialExecutor.TAG, "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void workOnQueue() {
            /*
                r9 = this;
                r0 = 0
                r1 = r0
            L2:
                androidx.camera.core.impl.utils.executor.SequentialExecutor r2 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L4f
                java.util.Deque<java.lang.Runnable> r2 = r2.mQueue     // Catch: java.lang.Throwable -> L4f
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L4f
                if (r0 != 0) goto L28
                androidx.camera.core.impl.utils.executor.SequentialExecutor r0 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L1c
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r3 = r0.mWorkerRunningState     // Catch: java.lang.Throwable -> L1c
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r4 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L1c
                if (r3 != r4) goto L1e
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L1b
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1b:
                return
            L1c:
                r0 = move-exception
                goto L69
            L1e:
                long r5 = r0.mWorkerRunCount     // Catch: java.lang.Throwable -> L1c
                r7 = 1
                long r5 = r5 + r7
                r0.mWorkerRunCount = r5     // Catch: java.lang.Throwable -> L1c
                r0.mWorkerRunningState = r4     // Catch: java.lang.Throwable -> L1c
                r0 = 1
            L28:
                androidx.camera.core.impl.utils.executor.SequentialExecutor r3 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L1c
                java.util.Deque<java.lang.Runnable> r3 = r3.mQueue     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1c
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L1c
                if (r3 != 0) goto L45
                androidx.camera.core.impl.utils.executor.SequentialExecutor r0 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L1c
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r3 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L1c
                r0.mWorkerRunningState = r3     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L44
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L44:
                return
            L45:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4f
                r1 = r1 | r2
                r3.run()     // Catch: java.lang.Throwable -> L4f java.lang.RuntimeException -> L51
                goto L2
            L4f:
                r0 = move-exception
                goto L6b
            L51:
                r2 = move-exception
                java.lang.String r4 = "SequentialExecutor"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
                r5.<init>()     // Catch: java.lang.Throwable -> L4f
                java.lang.String r6 = "Exception while executing runnable "
                r5.append(r6)     // Catch: java.lang.Throwable -> L4f
                r5.append(r3)     // Catch: java.lang.Throwable -> L4f
                java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L4f
                androidx.camera.core.Logger.e(r4, r3, r2)     // Catch: java.lang.Throwable -> L4f
                goto L2
            L69:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                throw r0     // Catch: java.lang.Throwable -> L4f
            L6b:
                if (r1 == 0) goto L74
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L74:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.executor.SequentialExecutor.QueueWorker.workOnQueue():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                workOnQueue();
            } catch (Error e10) {
                synchronized (SequentialExecutor.this.mQueue) {
                    SequentialExecutor.this.mWorkerRunningState = WorkerRunningState.IDLE;
                    throw e10;
                }
            }
        }
    }

    public enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public SequentialExecutor(Executor executor) {
        executor.getClass();
        this.mExecutor = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0066 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void execute(final java.lang.Runnable r8) {
        /*
            r7 = this;
            r8.getClass()
            java.util.Deque<java.lang.Runnable> r0 = r7.mQueue
            monitor-enter(r0)
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r1 = r7.mWorkerRunningState     // Catch: java.lang.Throwable -> L6d
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r2 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L6d
            if (r1 == r2) goto L6f
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r2 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.QUEUED     // Catch: java.lang.Throwable -> L6d
            if (r1 != r2) goto L11
            goto L6f
        L11:
            long r3 = r7.mWorkerRunCount     // Catch: java.lang.Throwable -> L6d
            androidx.camera.core.impl.utils.executor.SequentialExecutor$1 r1 = new androidx.camera.core.impl.utils.executor.SequentialExecutor$1     // Catch: java.lang.Throwable -> L6d
            r1.<init>()     // Catch: java.lang.Throwable -> L6d
            java.util.Deque<java.lang.Runnable> r8 = r7.mQueue     // Catch: java.lang.Throwable -> L6d
            r8.add(r1)     // Catch: java.lang.Throwable -> L6d
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r8 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.QUEUING     // Catch: java.lang.Throwable -> L6d
            r7.mWorkerRunningState = r8     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.Executor r0 = r7.mExecutor     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            androidx.camera.core.impl.utils.executor.SequentialExecutor$QueueWorker r5 = r7.mWorker     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            r0.execute(r5)     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r0 = r7.mWorkerRunningState
            if (r0 == r8) goto L2e
            return
        L2e:
            java.util.Deque<java.lang.Runnable> r0 = r7.mQueue
            monitor-enter(r0)
            long r5 = r7.mWorkerRunCount     // Catch: java.lang.Throwable -> L3e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L40
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r1 = r7.mWorkerRunningState     // Catch: java.lang.Throwable -> L3e
            if (r1 != r8) goto L40
            r7.mWorkerRunningState = r2     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r8 = move-exception
            goto L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r8
        L44:
            r8 = move-exception
            goto L47
        L46:
            r8 = move-exception
        L47:
            java.util.Deque<java.lang.Runnable> r2 = r7.mQueue
            monitor-enter(r2)
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r0 = r7.mWorkerRunningState     // Catch: java.lang.Throwable -> L55
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r3 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L55
            if (r0 == r3) goto L57
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r3 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.QUEUING     // Catch: java.lang.Throwable -> L55
            if (r0 != r3) goto L61
            goto L57
        L55:
            r8 = move-exception
            goto L6b
        L57:
            java.util.Deque<java.lang.Runnable> r0 = r7.mQueue     // Catch: java.lang.Throwable -> L55
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L6a
            if (r0 != 0) goto L6a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            return
        L6a:
            throw r8     // Catch: java.lang.Throwable -> L55
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            throw r8
        L6d:
            r8 = move-exception
            goto L76
        L6f:
            java.util.Deque<java.lang.Runnable> r1 = r7.mQueue     // Catch: java.lang.Throwable -> L6d
            r1.add(r8)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.executor.SequentialExecutor.execute(java.lang.Runnable):void");
    }
}
