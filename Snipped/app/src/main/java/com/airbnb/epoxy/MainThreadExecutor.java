package com.airbnb.epoxy;

/* loaded from: classes.dex */
class MainThreadExecutor extends HandlerExecutor {
    static final MainThreadExecutor INSTANCE = new MainThreadExecutor(false);
    static final MainThreadExecutor ASYNC_INSTANCE = new MainThreadExecutor(true);

    public MainThreadExecutor(boolean z10) {
        super(z10 ? EpoxyAsyncUtil.AYSNC_MAIN_THREAD_HANDLER : EpoxyAsyncUtil.MAIN_THREAD_HANDLER);
    }
}
