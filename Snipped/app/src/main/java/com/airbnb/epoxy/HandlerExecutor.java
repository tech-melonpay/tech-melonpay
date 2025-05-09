package com.airbnb.epoxy;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class HandlerExecutor implements Executor {
    final Handler handler;

    public HandlerExecutor(Handler handler) {
        this.handler = handler;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (Looper.myLooper() == this.handler.getLooper()) {
            runnable.run();
        } else {
            this.handler.post(runnable);
        }
    }
}
