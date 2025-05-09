package com.google.android.gms.internal.mlkit_vision_barcode;

import A3.c;
import A3.j;
import E3.e;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import t0.g;
import t0.i;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
public final class zzrl {
    private static zzcd zza;
    private static final zzcf zzb = zzcf.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzrb zze;
    private final j zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzrl(Context context, final j jVar, zzrb zzrbVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = c.a(context);
        this.zzf = jVar;
        this.zze = zzrbVar;
        zzrx.zza();
        this.zzi = str;
        a a10 = a.a();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzrf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzrl.this.zzb();
            }
        };
        a10.getClass();
        this.zzg = a.b(callable);
        a a11 = a.a();
        jVar.getClass();
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzrg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return j.this.a();
            }
        };
        a11.getClass();
        this.zzh = a.b(callable2);
        zzcf zzcfVar = zzb;
        this.zzj = zzcfVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzcfVar.get(str)) : -1;
    }

    public static long zza(List list, double d10) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d10 / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    private static synchronized zzcd zzi() {
        synchronized (zzrl.class) {
            try {
                zzcd zzcdVar = zza;
                if (zzcdVar != null) {
                    return zzcdVar;
                }
                g gVar = new g(new i(Resources.getSystem().getConfiguration().getLocales()));
                zzca zzcaVar = new zzca();
                for (int i = 0; i < gVar.f27402a.size(); i++) {
                    zzcaVar.zzd(c.b(gVar.f27402a.get(i)));
                }
                zzcd zzf = zzcaVar.zzf();
                zza = zzf;
                return zzf;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final String zzj() {
        return this.zzg.isSuccessful() ? (String) this.zzg.getResult() : LibraryVersion.getInstance().getVersion(this.zzi);
    }

    private final boolean zzk(zzne zzneVar, long j10, long j11) {
        return this.zzk.get(zzneVar) == null || j10 - ((Long) this.zzk.get(zzneVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    public final /* synthetic */ String zzb() {
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    public final /* synthetic */ void zzc(zzra zzraVar, zzne zzneVar, String str) {
        zzraVar.zzb(zzneVar);
        String zzd = zzraVar.zzd();
        zzpx zzpxVar = new zzpx();
        zzpxVar.zzb(this.zzc);
        zzpxVar.zzc(this.zzd);
        zzpxVar.zzh(zzi());
        zzpxVar.zzg(Boolean.TRUE);
        zzpxVar.zzl(zzd);
        zzpxVar.zzj(str);
        zzpxVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.a());
        zzpxVar.zzd(10);
        zzpxVar.zzk(Integer.valueOf(this.zzj));
        zzraVar.zzc(zzpxVar);
        this.zze.zza(zzraVar);
    }

    public final void zzd(zzra zzraVar, zzne zzneVar) {
        zze(zzraVar, zzneVar, zzj());
    }

    public final void zze(final zzra zzraVar, final zzne zzneVar, final String str) {
        a.c().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzrh
            @Override // java.lang.Runnable
            public final void run() {
                zzrl.this.zzc(zzraVar, zzneVar, str);
            }
        });
    }

    public final void zzf(zzrk zzrkVar, zzne zzneVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzneVar, elapsedRealtime, 30L)) {
            this.zzk.put(zzneVar, Long.valueOf(elapsedRealtime));
            zze(zzrkVar.zza(), zzneVar, zzj());
        }
    }

    public final void zzg(zzne zzneVar, e eVar) {
        zzci zzciVar = (zzci) this.zzl.get(zzneVar);
        if (zzciVar != null) {
            Iterator it = zzciVar.zzo().iterator();
            if (!it.hasNext()) {
                this.zzl.remove(zzneVar);
                return;
            }
            ArrayList arrayList = new ArrayList(zzciVar.zzc(it.next()));
            Collections.sort(arrayList);
            zzmh zzmhVar = new zzmh();
            Iterator it2 = arrayList.iterator();
            long j10 = 0;
            while (it2.hasNext()) {
                j10 += ((Long) it2.next()).longValue();
            }
            zzmhVar.zza(Long.valueOf(j10 / arrayList.size()));
            zzmhVar.zzc(Long.valueOf(zza(arrayList, 100.0d)));
            zzmhVar.zzf(Long.valueOf(zza(arrayList, 75.0d)));
            zzmhVar.zzd(Long.valueOf(zza(arrayList, 50.0d)));
            zzmhVar.zzb(Long.valueOf(zza(arrayList, 25.0d)));
            zzmhVar.zze(Long.valueOf(zza(arrayList, 0.0d)));
            zzmhVar.zzg();
            arrayList.size();
            throw null;
        }
    }

    public final /* synthetic */ void zzh(final zzne zzneVar, Object obj, long j10, final e eVar) {
        if (!this.zzl.containsKey(zzneVar)) {
            this.zzl.put(zzneVar, zzbh.zzp());
        }
        ((zzci) this.zzl.get(zzneVar)).zzm(obj, Long.valueOf(j10));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzneVar, elapsedRealtime, 30L)) {
            this.zzk.put(zzneVar, Long.valueOf(elapsedRealtime));
            a.c().execute(new Runnable(zzneVar, eVar) { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzrj
                public final /* synthetic */ zzne zzb;
                public final /* synthetic */ e zzc;

                @Override // java.lang.Runnable
                public final void run() {
                    zzrl.this.zzg(this.zzb, null);
                }
            });
        }
    }
}
