package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import java.util.List;
import java.util.Queue;

/* loaded from: classes.dex */
public class ListPreloader<T> implements AbsListView.OnScrollListener {
    private int lastEnd;
    private int lastStart;
    private final int maxPreload;
    private final PreloadSizeProvider<T> preloadDimensionProvider;
    private final PreloadModelProvider<T> preloadModelProvider;
    private final PreloadTargetQueue preloadTargetQueue;
    private final RequestManager requestManager;
    private int totalItemCount;
    private int lastFirstVisible = -1;
    private boolean isIncreasing = true;

    public interface PreloadModelProvider<U> {
        List<U> getPreloadItems(int i);

        RequestBuilder<?> getPreloadRequestBuilder(U u6);
    }

    public interface PreloadSizeProvider<T> {
        int[] getPreloadSize(T t3, int i, int i9);
    }

    public static final class PreloadTargetQueue {
        final Queue<PreloadTarget> queue;

        public PreloadTargetQueue(int i) {
            this.queue = Util.createQueue(i);
            for (int i9 = 0; i9 < i; i9++) {
                this.queue.offer(new PreloadTarget());
            }
        }

        public PreloadTarget next(int i, int i9) {
            PreloadTarget poll = this.queue.poll();
            this.queue.offer(poll);
            poll.photoWidth = i;
            poll.photoHeight = i9;
            return poll;
        }
    }

    public ListPreloader(RequestManager requestManager, PreloadModelProvider<T> preloadModelProvider, PreloadSizeProvider<T> preloadSizeProvider, int i) {
        this.requestManager = requestManager;
        this.preloadModelProvider = preloadModelProvider;
        this.preloadDimensionProvider = preloadSizeProvider;
        this.maxPreload = i;
        this.preloadTargetQueue = new PreloadTargetQueue(i + 1);
    }

    private void cancelAll() {
        for (int i = 0; i < this.preloadTargetQueue.queue.size(); i++) {
            this.requestManager.clear(this.preloadTargetQueue.next(0, 0));
        }
    }

    private void preload(int i, boolean z10) {
        if (this.isIncreasing != z10) {
            this.isIncreasing = z10;
            cancelAll();
        }
        preload(i, (z10 ? this.maxPreload : -this.maxPreload) + i);
    }

    private void preloadAdapterPosition(List<T> list, int i, boolean z10) {
        int size = list.size();
        if (z10) {
            for (int i9 = 0; i9 < size; i9++) {
                preloadItem(list.get(i9), i, i9);
            }
            return;
        }
        for (int i10 = size - 1; i10 >= 0; i10--) {
            preloadItem(list.get(i10), i, i10);
        }
    }

    private void preloadItem(T t3, int i, int i9) {
        int[] preloadSize;
        RequestBuilder<?> preloadRequestBuilder;
        if (t3 == null || (preloadSize = this.preloadDimensionProvider.getPreloadSize(t3, i, i9)) == null || (preloadRequestBuilder = this.preloadModelProvider.getPreloadRequestBuilder(t3)) == null) {
            return;
        }
        preloadRequestBuilder.into((RequestBuilder<?>) this.preloadTargetQueue.next(preloadSize[0], preloadSize[1]));
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i9, int i10) {
        if (this.totalItemCount == 0 && i10 == 0) {
            return;
        }
        this.totalItemCount = i10;
        int i11 = this.lastFirstVisible;
        if (i > i11) {
            preload(i9 + i, true);
        } else if (i < i11) {
            preload(i, false);
        }
        this.lastFirstVisible = i;
    }

    private void preload(int i, int i9) {
        int min;
        int i10;
        if (i < i9) {
            i10 = Math.max(this.lastEnd, i);
            min = i9;
        } else {
            min = Math.min(this.lastStart, i);
            i10 = i9;
        }
        int min2 = Math.min(this.totalItemCount, min);
        int min3 = Math.min(this.totalItemCount, Math.max(0, i10));
        if (i < i9) {
            for (int i11 = min3; i11 < min2; i11++) {
                preloadAdapterPosition(this.preloadModelProvider.getPreloadItems(i11), i11, true);
            }
        } else {
            for (int i12 = min2 - 1; i12 >= min3; i12--) {
                preloadAdapterPosition(this.preloadModelProvider.getPreloadItems(i12), i12, false);
            }
        }
        this.lastStart = min3;
        this.lastEnd = min2;
    }

    public static final class PreloadTarget implements Target<Object> {
        int photoHeight;
        int photoWidth;
        private Request request;

        @Override // com.bumptech.glide.request.target.Target
        public Request getRequest() {
            return this.request;
        }

        @Override // com.bumptech.glide.request.target.Target
        public void getSize(SizeReadyCallback sizeReadyCallback) {
            sizeReadyCallback.onSizeReady(this.photoWidth, this.photoHeight);
        }

        @Override // com.bumptech.glide.request.target.Target
        public void setRequest(Request request) {
            this.request = request;
        }

        @Override // com.bumptech.glide.manager.LifecycleListener
        public void onDestroy() {
        }

        @Override // com.bumptech.glide.manager.LifecycleListener
        public void onStart() {
        }

        @Override // com.bumptech.glide.manager.LifecycleListener
        public void onStop() {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadCleared(Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadFailed(Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadStarted(Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void removeCallback(SizeReadyCallback sizeReadyCallback) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onResourceReady(Object obj, Transition<? super Object> transition) {
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
