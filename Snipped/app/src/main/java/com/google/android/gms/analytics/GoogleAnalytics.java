package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzet;
import com.google.android.gms.internal.gtm.zzeu;
import com.google.android.gms.internal.gtm.zzfa;
import com.google.android.gms.internal.gtm.zzfq;
import com.google.android.gms.internal.gtm.zzfr;
import com.google.android.gms.internal.gtm.zzft;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class GoogleAnalytics extends zza {
    private static List<Runnable> zzb = new ArrayList();
    private boolean zzc;
    private Set<zzv> zzd;
    private boolean zze;
    private boolean zzf;
    private volatile boolean zzg;
    private boolean zzh;

    @VisibleForTesting
    public GoogleAnalytics(zzbv zzbvVar) {
        super(zzbvVar);
        this.zzd = new HashSet();
    }

    public static GoogleAnalytics getInstance(Context context) {
        return zzbv.zzg(context).zzc();
    }

    public static void zzf() {
        synchronized (GoogleAnalytics.class) {
            try {
                List<Runnable> list = zzb;
                if (list != null) {
                    Iterator<Runnable> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().run();
                    }
                    zzb = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void dispatchLocalHits() {
        zzb().zzf().zzc();
    }

    @TargetApi(14)
    public void enableAutoActivityReports(Application application) {
        if (this.zze) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new zze(this));
        this.zze = true;
    }

    public boolean getAppOptOut() {
        return this.zzg;
    }

    @Deprecated
    public Logger getLogger() {
        return zzfa.zza();
    }

    public boolean isDryRunEnabled() {
        return this.zzf;
    }

    public Tracker newTracker(int i) {
        Tracker tracker;
        zzfr zza;
        synchronized (this) {
            try {
                tracker = new Tracker(zzb(), null, null);
                if (i > 0 && (zza = new zzfq(zzb()).zza(i)) != null) {
                    tracker.zzm(zza);
                }
                tracker.zzX();
            } catch (Throwable th) {
                throw th;
            }
        }
        return tracker;
    }

    public void reportActivityStart(Activity activity) {
        if (this.zze) {
            return;
        }
        zzh(activity);
    }

    public void reportActivityStop(Activity activity) {
        if (this.zze) {
            return;
        }
        zzi(activity);
    }

    public void setAppOptOut(boolean z10) {
        this.zzg = z10;
        if (this.zzg) {
            zzb().zzf().zzg();
        }
    }

    public void setDryRun(boolean z10) {
        this.zzf = z10;
    }

    public void setLocalDispatchPeriod(int i) {
        zzb().zzf().zzl(i);
    }

    @Deprecated
    public void setLogger(Logger logger) {
        zzfa.zzc(logger);
        if (this.zzh) {
            return;
        }
        zzet<String> zzetVar = zzeu.zzc;
        String zzb2 = zzetVar.zzb();
        String zzb3 = zzetVar.zzb();
        StringBuilder sb2 = new StringBuilder(zzb3.length() + 112);
        sb2.append("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.");
        sb2.append(zzb3);
        sb2.append(" DEBUG");
        Log.i(zzb2, sb2.toString());
        this.zzh = true;
    }

    public final void zzg() {
        zzft zzq = zzb().zzq();
        zzq.zzf();
        if (zzq.zze()) {
            setDryRun(zzq.zzc());
        }
        zzq.zzf();
        this.zzc = true;
    }

    @VisibleForTesting
    public final void zzh(Activity activity) {
        Iterator<zzv> it = this.zzd.iterator();
        while (it.hasNext()) {
            it.next().zza(activity);
        }
    }

    @VisibleForTesting
    public final void zzi(Activity activity) {
        Iterator<zzv> it = this.zzd.iterator();
        while (it.hasNext()) {
            it.next().zzb(activity);
        }
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final void zzk(zzv zzvVar) {
        this.zzd.add(zzvVar);
        Context zza = zzb().zza();
        if (zza instanceof Application) {
            enableAutoActivityReports((Application) zza);
        }
    }

    public final void zzl(zzv zzvVar) {
        this.zzd.remove(zzvVar);
    }

    public Tracker newTracker(String str) {
        Tracker tracker;
        synchronized (this) {
            tracker = new Tracker(zzb(), str, null);
            tracker.zzX();
        }
        return tracker;
    }
}
