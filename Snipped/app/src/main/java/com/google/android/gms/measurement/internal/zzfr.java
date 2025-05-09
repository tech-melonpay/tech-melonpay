package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
final class zzfr extends Thread {
    final /* synthetic */ zzfs zza;
    private final Object zzb;
    private final BlockingQueue<zzfq<?>> zzc;
    private boolean zzd = false;

    public zzfr(zzfs zzfsVar, String str, BlockingQueue<zzfq<?>> blockingQueue) {
        this.zza = zzfsVar;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.zzb = new Object();
        this.zzc = blockingQueue;
        setName(str);
    }

    private final void zzb() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        zzfr zzfrVar;
        zzfr zzfrVar2;
        obj = this.zza.zzh;
        synchronized (obj) {
            try {
                if (!this.zzd) {
                    semaphore = this.zza.zzi;
                    semaphore.release();
                    obj2 = this.zza.zzh;
                    obj2.notifyAll();
                    zzfrVar = this.zza.zzb;
                    if (this == zzfrVar) {
                        this.zza.zzb = null;
                    } else {
                        zzfrVar2 = this.zza.zzc;
                        if (this == zzfrVar2) {
                            this.zza.zzc = null;
                        } else {
                            this.zza.zzs.zzay().zzd().zza("Current scheduler thread is neither worker nor network");
                        }
                    }
                    this.zzd = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzc(InterruptedException interruptedException) {
        this.zza.zzs.zzay().zzk().zzb(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        Object obj;
        boolean z10 = false;
        while (!z10) {
            try {
                semaphore = this.zza.zzi;
                semaphore.acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                zzc(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                zzfq<?> poll = this.zzc.poll();
                if (poll != null) {
                    Process.setThreadPriority(true != poll.zza ? 10 : threadPriority);
                    poll.run();
                } else {
                    synchronized (this.zzb) {
                        if (this.zzc.peek() == null) {
                            zzfs.zzr(this.zza);
                            try {
                                this.zzb.wait(30000L);
                            } catch (InterruptedException e11) {
                                zzc(e11);
                            }
                        }
                    }
                    obj = this.zza.zzh;
                    synchronized (obj) {
                        try {
                            if (this.zzc.peek() == null) {
                                break;
                            }
                        } finally {
                        }
                    }
                }
            }
            if (this.zza.zzs.zzf().zzs(null, zzdy.zzaj)) {
                zzb();
            }
            zzb();
        } catch (Throwable th) {
            zzb();
            throw th;
        }
    }

    public final void zza() {
        synchronized (this.zzb) {
            this.zzb.notifyAll();
        }
    }
}
