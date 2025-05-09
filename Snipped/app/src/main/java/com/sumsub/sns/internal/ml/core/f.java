package com.sumsub.sns.internal.ml.core;

import com.sumsub.sns.internal.ml.core.b;
import java.util.concurrent.ThreadFactory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17679b;

    public /* synthetic */ f(Object obj, int i) {
        this.f17678a = i;
        this.f17679b = obj;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f17678a) {
            case 0:
                return b.c.a((b) this.f17679b, runnable);
            case 1:
                return b.j.a((b) this.f17679b, runnable);
            default:
                Thread thread = new Thread(runnable, (String) this.f17679b);
                thread.setPriority(10);
                return thread;
        }
    }
}
