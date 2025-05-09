package com.google.firebase.heartbeatinfo;

import java.util.concurrent.ThreadFactory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread lambda$static$0;
        lambda$static$0 = DefaultHeartBeatInfo.lambda$static$0(runnable);
        return lambda$static$0;
    }
}
