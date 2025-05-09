package com.airbnb.epoxy;

import android.os.Handler;
import androidx.recyclerview.widget.q;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class AsyncEpoxyDiffer {
    private final q.e<EpoxyModel<?>> diffCallback;
    private final Executor executor;
    private volatile List<? extends EpoxyModel<?>> list;
    private final ResultCallback resultCallback;
    private final GenerationTracker generationTracker = new GenerationTracker();
    private volatile List<? extends EpoxyModel<?>> readOnlyList = Collections.emptyList();

    public static class DiffCallback extends q.b {
        private final q.e<EpoxyModel<?>> diffCallback;
        final List<? extends EpoxyModel<?>> newList;
        final List<? extends EpoxyModel<?>> oldList;

        public DiffCallback(List<? extends EpoxyModel<?>> list, List<? extends EpoxyModel<?>> list2, q.e<EpoxyModel<?>> eVar) {
            this.oldList = list;
            this.newList = list2;
            this.diffCallback = eVar;
        }

        @Override // androidx.recyclerview.widget.q.b
        public boolean areContentsTheSame(int i, int i9) {
            return this.diffCallback.areContentsTheSame(this.oldList.get(i), this.newList.get(i9));
        }

        @Override // androidx.recyclerview.widget.q.b
        public boolean areItemsTheSame(int i, int i9) {
            return this.diffCallback.areItemsTheSame(this.oldList.get(i), this.newList.get(i9));
        }

        @Override // androidx.recyclerview.widget.q.b
        public Object getChangePayload(int i, int i9) {
            return this.diffCallback.getChangePayload(this.oldList.get(i), this.newList.get(i9));
        }

        @Override // androidx.recyclerview.widget.q.b
        public int getNewListSize() {
            return this.newList.size();
        }

        @Override // androidx.recyclerview.widget.q.b
        public int getOldListSize() {
            return this.oldList.size();
        }
    }

    public static class GenerationTracker {
        private volatile int maxFinishedGeneration;
        private volatile int maxScheduledGeneration;

        private GenerationTracker() {
        }

        public synchronized boolean finishGeneration(int i) {
            boolean z10;
            try {
                z10 = this.maxScheduledGeneration == i && i > this.maxFinishedGeneration;
                if (z10) {
                    this.maxFinishedGeneration = i;
                }
            } catch (Throwable th) {
                throw th;
            }
            return z10;
        }

        public synchronized boolean finishMaxGeneration() {
            boolean hasUnfinishedGeneration;
            hasUnfinishedGeneration = hasUnfinishedGeneration();
            this.maxFinishedGeneration = this.maxScheduledGeneration;
            return hasUnfinishedGeneration;
        }

        public synchronized boolean hasUnfinishedGeneration() {
            return this.maxScheduledGeneration > this.maxFinishedGeneration;
        }

        public synchronized int incrementAndGetNextScheduled() {
            int i;
            i = this.maxScheduledGeneration + 1;
            this.maxScheduledGeneration = i;
            return i;
        }
    }

    public interface ResultCallback {
        void onResult(DiffResult diffResult);
    }

    public AsyncEpoxyDiffer(Handler handler, ResultCallback resultCallback, q.e<EpoxyModel<?>> eVar) {
        this.executor = new HandlerExecutor(handler);
        this.resultCallback = resultCallback;
        this.diffCallback = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onRunCompleted(final int i, final List<? extends EpoxyModel<?>> list, final DiffResult diffResult) {
        MainThreadExecutor.ASYNC_INSTANCE.execute(new Runnable() { // from class: com.airbnb.epoxy.AsyncEpoxyDiffer.2
            @Override // java.lang.Runnable
            public void run() {
                boolean tryLatchList = AsyncEpoxyDiffer.this.tryLatchList(list, i);
                if (diffResult == null || !tryLatchList) {
                    return;
                }
                AsyncEpoxyDiffer.this.resultCallback.onResult(diffResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean tryLatchList(List<? extends EpoxyModel<?>> list, int i) {
        try {
            if (!this.generationTracker.finishGeneration(i)) {
                return false;
            }
            this.list = list;
            if (list == null) {
                this.readOnlyList = Collections.emptyList();
            } else {
                this.readOnlyList = Collections.unmodifiableList(list);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean cancelDiff() {
        return this.generationTracker.finishMaxGeneration();
    }

    public synchronized boolean forceListOverride(List<EpoxyModel<?>> list) {
        boolean cancelDiff;
        cancelDiff = cancelDiff();
        tryLatchList(list, this.generationTracker.incrementAndGetNextScheduled());
        return cancelDiff;
    }

    public List<? extends EpoxyModel<?>> getCurrentList() {
        return this.readOnlyList;
    }

    public boolean isDiffInProgress() {
        return this.generationTracker.hasUnfinishedGeneration();
    }

    public void submitList(final List<? extends EpoxyModel<?>> list) {
        final int incrementAndGetNextScheduled;
        final List<? extends EpoxyModel<?>> list2;
        synchronized (this) {
            incrementAndGetNextScheduled = this.generationTracker.incrementAndGetNextScheduled();
            list2 = this.list;
        }
        if (list == list2) {
            onRunCompleted(incrementAndGetNextScheduled, list, DiffResult.noOp(list2));
            return;
        }
        if (list == null || list.isEmpty()) {
            onRunCompleted(incrementAndGetNextScheduled, null, (list2 == null || list2.isEmpty()) ? null : DiffResult.clear(list2));
        } else if (list2 == null || list2.isEmpty()) {
            onRunCompleted(incrementAndGetNextScheduled, list, DiffResult.inserted(list));
        } else {
            final DiffCallback diffCallback = new DiffCallback(list2, list, this.diffCallback);
            this.executor.execute(new Runnable() { // from class: com.airbnb.epoxy.AsyncEpoxyDiffer.1
                @Override // java.lang.Runnable
                public void run() {
                    q.d a10 = q.a(diffCallback);
                    AsyncEpoxyDiffer asyncEpoxyDiffer = AsyncEpoxyDiffer.this;
                    int i = incrementAndGetNextScheduled;
                    List list3 = list;
                    asyncEpoxyDiffer.onRunCompleted(i, list3, DiffResult.diff(list2, list3, a10));
                }
            });
        }
    }
}
