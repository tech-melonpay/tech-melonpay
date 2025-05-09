package com.airbnb.epoxy;

import android.os.Handler;

/* loaded from: classes.dex */
public abstract class AsyncEpoxyController extends EpoxyController {
    public AsyncEpoxyController() {
        this(true);
    }

    private static Handler getHandler(boolean z10) {
        return z10 ? EpoxyAsyncUtil.getAsyncBackgroundHandler() : EpoxyAsyncUtil.MAIN_THREAD_HANDLER;
    }

    public AsyncEpoxyController(boolean z10) {
        this(z10, z10);
    }

    public AsyncEpoxyController(boolean z10, boolean z11) {
        super(getHandler(z10), getHandler(z11));
    }
}
