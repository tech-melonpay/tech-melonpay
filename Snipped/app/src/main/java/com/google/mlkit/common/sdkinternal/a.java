package com.google.mlkit.common.sdkinternal;

import A3.k;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.mlkit:common@@18.7.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f10521b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static a f10522c;

    /* renamed from: a, reason: collision with root package name */
    public final zza f10523a;

    public a(Looper looper) {
        this.f10523a = new zza(looper);
    }

    @KeepForSdk
    public static a a() {
        a aVar;
        synchronized (f10521b) {
            try {
                if (f10522c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f10522c = new a(handlerThread.getLooper());
                }
                aVar = f10522c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @KeepForSdk
    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zzh.f10525a.execute(new k(1, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @KeepForSdk
    public static Executor c() {
        return zzh.f10525a;
    }
}
