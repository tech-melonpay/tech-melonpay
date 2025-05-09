package com.google.android.gms.analytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzav;
import com.google.android.gms.internal.gtm.zzba;
import com.google.android.gms.internal.gtm.zzfs;
import java.lang.Thread;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
@VisibleForTesting
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class zzr {
    private static volatile zzr zza;
    private final Context zzb;
    private final List<zzs> zzc;
    private final zzg zzd;
    private final zzn zze;
    private volatile zzav zzf;
    private Thread.UncaughtExceptionHandler zzg;

    @VisibleForTesting
    public zzr(Context context) {
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.zzb = applicationContext;
        this.zze = new zzn(this);
        this.zzc = new CopyOnWriteArrayList();
        this.zzd = new zzg();
    }

    public static zzr zzb(Context context) {
        Preconditions.checkNotNull(context);
        if (zza == null) {
            synchronized (zzr.class) {
                try {
                    if (zza == null) {
                        zza = new zzr(context);
                    }
                } finally {
                }
            }
        }
        return zza;
    }

    public static void zzh() {
        if (!(Thread.currentThread() instanceof zzq)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final Context zza() {
        return this.zzb;
    }

    public final zzav zzc() {
        String packageName;
        if (this.zzf == null) {
            synchronized (this) {
                try {
                } catch (PackageManager.NameNotFoundException unused) {
                    String valueOf = String.valueOf(packageName);
                    Log.e("GAv4", valueOf.length() != 0 ? "Error retrieving package info: appName set to ".concat(valueOf) : new String("Error retrieving package info: appName set to "));
                } finally {
                }
                if (this.zzf == null) {
                    zzav zzavVar = new zzav();
                    PackageManager packageManager = this.zzb.getPackageManager();
                    packageName = this.zzb.getPackageName();
                    zzavVar.zzi(packageName);
                    zzavVar.zzj(packageManager.getInstallerPackageName(packageName));
                    String str = null;
                    PackageInfo packageInfo = packageManager.getPackageInfo(this.zzb.getPackageName(), 0);
                    if (packageInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        if (!TextUtils.isEmpty(applicationLabel)) {
                            packageName = applicationLabel.toString();
                        }
                        str = packageInfo.versionName;
                    }
                    zzavVar.zzk(packageName);
                    zzavVar.zzl(str);
                    this.zzf = zzavVar;
                }
            }
        }
        return this.zzf;
    }

    public final zzba zzd() {
        DisplayMetrics displayMetrics = this.zzb.getResources().getDisplayMetrics();
        zzba zzbaVar = new zzba();
        zzbaVar.zze(zzfs.zzd(Locale.getDefault()));
        zzbaVar.zza = displayMetrics.widthPixels;
        zzbaVar.zzb = displayMetrics.heightPixels;
        return zzbaVar;
    }

    public final <V> Future<V> zzg(Callable<V> callable) {
        Preconditions.checkNotNull(callable);
        if (!(Thread.currentThread() instanceof zzq)) {
            return this.zze.submit(callable);
        }
        FutureTask futureTask = new FutureTask(callable);
        futureTask.run();
        return futureTask;
    }

    public final void zzi(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        this.zze.submit(runnable);
    }

    public final void zzj(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zzg = uncaughtExceptionHandler;
    }

    public final void zzk(zzh zzhVar) {
        if (zzhVar.zzl()) {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        }
        if (zzhVar.zzm()) {
            throw new IllegalStateException("Measurement can only be submitted once");
        }
        zzh zzhVar2 = new zzh(zzhVar);
        zzhVar2.zzi();
        this.zze.execute(new zzl(this, zzhVar2));
    }
}
