package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
final class zzfq<V> extends FutureTask<V> implements Comparable<zzfq<V>> {
    final boolean zza;
    final /* synthetic */ zzfs zzb;
    private final long zzc;
    private final String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfq(zzfs zzfsVar, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.zzb = zzfsVar;
        Preconditions.checkNotNull(str);
        atomicLong = zzfs.zza;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = str;
        this.zza = z10;
        if (andIncrement == Long.MAX_VALUE) {
            androidx.camera.core.impl.utils.a.t(zzfsVar.zzs, "Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzfq zzfqVar = (zzfq) obj;
        boolean z10 = this.zza;
        if (z10 == zzfqVar.zza) {
            long j10 = this.zzc;
            long j11 = zzfqVar.zzc;
            if (j10 < j11) {
                return -1;
            }
            if (j10 <= j11) {
                this.zzb.zzs.zzay().zzh().zzb("Two tasks share the same index. index", Long.valueOf(this.zzc));
                return 0;
            }
        } else if (z10) {
            return -1;
        }
        return 1;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.zzb.zzs.zzay().zzd().zzb(this.zzd, th);
        if ((th instanceof zzfo) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfq(zzfs zzfsVar, Callable<V> callable, boolean z10, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.zzb = zzfsVar;
        Preconditions.checkNotNull("Task exception on worker thread");
        atomicLong = zzfs.zza;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = "Task exception on worker thread";
        this.zza = z10;
        if (andIncrement == Long.MAX_VALUE) {
            androidx.camera.core.impl.utils.a.t(zzfsVar.zzs, "Tasks index overflow");
        }
    }
}
