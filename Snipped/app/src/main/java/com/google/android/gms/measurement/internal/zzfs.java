package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
public final class zzfs extends zzgp {
    private static final AtomicLong zza = new AtomicLong(Long.MIN_VALUE);
    private zzfr zzb;
    private zzfr zzc;
    private final PriorityBlockingQueue<zzfq<?>> zzd;
    private final BlockingQueue<zzfq<?>> zze;
    private final Thread.UncaughtExceptionHandler zzf;
    private final Thread.UncaughtExceptionHandler zzg;
    private final Object zzh;
    private final Semaphore zzi;
    private volatile boolean zzj;

    public zzfs(zzfv zzfvVar) {
        super(zzfvVar);
        this.zzh = new Object();
        this.zzi = new Semaphore(2);
        this.zzd = new PriorityBlockingQueue<>();
        this.zze = new LinkedBlockingQueue();
        this.zzf = new zzfp(this, "Thread death: Uncaught exception on worker thread");
        this.zzg = new zzfp(this, "Thread death: Uncaught exception on network thread");
    }

    public static /* bridge */ /* synthetic */ boolean zzr(zzfs zzfsVar) {
        boolean z10 = zzfsVar.zzj;
        return false;
    }

    private final void zzt(zzfq<?> zzfqVar) {
        synchronized (this.zzh) {
            try {
                this.zzd.add(zzfqVar);
                zzfr zzfrVar = this.zzb;
                if (zzfrVar == null) {
                    zzfr zzfrVar2 = new zzfr(this, "Measurement Worker", this.zzd);
                    this.zzb = zzfrVar2;
                    zzfrVar2.setUncaughtExceptionHandler(this.zzf);
                    this.zzb.start();
                } else {
                    zzfrVar.zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgo
    public final void zzax() {
        if (Thread.currentThread() != this.zzc) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final <T> T zzd(AtomicReference<T> atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.zzs.zzaz().zzp(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                this.zzs.zzay().zzk().zza(str.length() != 0 ? "Interrupted waiting for ".concat(str) : new String("Interrupted waiting for "));
                return null;
            }
        }
        T t3 = atomicReference.get();
        if (t3 == null) {
            this.zzs.zzay().zzk().zza(str.length() != 0 ? "Timed out waiting for ".concat(str) : new String("Timed out waiting for "));
        }
        return t3;
    }

    @Override // com.google.android.gms.measurement.internal.zzgp
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzgo
    public final void zzg() {
        if (Thread.currentThread() != this.zzb) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final <V> Future<V> zzh(Callable<V> callable) {
        zzu();
        Preconditions.checkNotNull(callable);
        zzfq<?> zzfqVar = new zzfq<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.zzb) {
            if (!this.zzd.isEmpty()) {
                androidx.camera.core.impl.utils.a.y(this.zzs, "Callable skipped the worker queue.");
            }
            zzfqVar.run();
        } else {
            zzt(zzfqVar);
        }
        return zzfqVar;
    }

    public final <V> Future<V> zzi(Callable<V> callable) {
        zzu();
        Preconditions.checkNotNull(callable);
        zzfq<?> zzfqVar = new zzfq<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.zzb) {
            zzfqVar.run();
        } else {
            zzt(zzfqVar);
        }
        return zzfqVar;
    }

    public final void zzo(Runnable runnable) {
        zzu();
        Preconditions.checkNotNull(runnable);
        zzfq<?> zzfqVar = new zzfq<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.zzh) {
            try {
                this.zze.add(zzfqVar);
                zzfr zzfrVar = this.zzc;
                if (zzfrVar == null) {
                    zzfr zzfrVar2 = new zzfr(this, "Measurement Network", this.zze);
                    this.zzc = zzfrVar2;
                    zzfrVar2.setUncaughtExceptionHandler(this.zzg);
                    this.zzc.start();
                } else {
                    zzfrVar.zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzp(Runnable runnable) {
        zzu();
        Preconditions.checkNotNull(runnable);
        zzt(new zzfq<>(this, runnable, false, "Task exception on worker thread"));
    }

    public final void zzq(Runnable runnable) {
        zzu();
        Preconditions.checkNotNull(runnable);
        zzt(new zzfq<>(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean zzs() {
        return Thread.currentThread() == this.zzb;
    }
}
