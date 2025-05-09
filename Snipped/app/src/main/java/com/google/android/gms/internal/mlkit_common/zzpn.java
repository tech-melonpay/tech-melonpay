package com.google.android.gms.internal.mlkit_common;

import A3.c;
import A3.j;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import t0.g;
import t0.i;
import z3.AbstractC1643b;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public final class zzpn {
    private static zzar zza;
    private static final zzau zzb = zzau.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzpf zze;
    private final j zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzpn(Context context, final j jVar, zzpf zzpfVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = c.a(context);
        this.zzf = jVar;
        this.zze = zzpfVar;
        zzqb.zza();
        this.zzi = str;
        a a10 = a.a();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzpj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzpn.this.zza();
            }
        };
        a10.getClass();
        this.zzg = a.b(callable);
        a a11 = a.a();
        jVar.getClass();
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzpk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return j.this.a();
            }
        };
        a11.getClass();
        this.zzh = a.b(callable2);
        zzau zzauVar = zzb;
        this.zzj = zzauVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzauVar.get(str)) : -1;
    }

    private static synchronized zzar zzh() {
        synchronized (zzpn.class) {
            try {
                zzar zzarVar = zza;
                if (zzarVar != null) {
                    return zzarVar;
                }
                g gVar = new g(new i(Resources.getSystem().getConfiguration().getLocales()));
                zzao zzaoVar = new zzao();
                for (int i = 0; i < gVar.f27402a.size(); i++) {
                    zzaoVar.zzb(c.b(gVar.f27402a.get(i)));
                }
                zzar zzc = zzaoVar.zzc();
                zza = zzc;
                return zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final zznz zzi(String str, String str2) {
        zznz zznzVar = new zznz();
        zznzVar.zzb(this.zzc);
        zznzVar.zzc(this.zzd);
        zznzVar.zzh(zzh());
        zznzVar.zzg(Boolean.TRUE);
        zznzVar.zzl(str);
        zznzVar.zzj(str2);
        zznzVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.a());
        zznzVar.zzd(10);
        zznzVar.zzk(Integer.valueOf(this.zzj));
        return zznzVar;
    }

    private final String zzj() {
        return this.zzg.isSuccessful() ? (String) this.zzg.getResult() : LibraryVersion.getInstance().getVersion(this.zzi);
    }

    public final /* synthetic */ String zza() {
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    public final /* synthetic */ void zzb(zzpe zzpeVar, zzld zzldVar, String str) {
        zzpeVar.zza(zzldVar);
        zzpeVar.zzc(zzi(zzpeVar.zzd(), str));
        this.zze.zza(zzpeVar);
    }

    public final /* synthetic */ void zzc(zzpe zzpeVar, zzpp zzppVar, AbstractC1643b abstractC1643b) {
        zzpeVar.zza(zzld.MODEL_DOWNLOAD);
        zzpeVar.zzc(zzi(zzppVar.zze(), zzj()));
        zzpeVar.zzb(zzpz.zza(abstractC1643b, this.zzf, zzppVar));
        this.zze.zza(zzpeVar);
    }

    public final void zzd(final zzpe zzpeVar, final zzld zzldVar) {
        final String zzj = zzj();
        a.c().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_common.zzpl
            @Override // java.lang.Runnable
            public final void run() {
                zzpn.this.zzb(zzpeVar, zzldVar, zzj);
            }
        });
    }

    public final void zze(zzpe zzpeVar, AbstractC1643b abstractC1643b, boolean z10, int i) {
        zzpo zzh = zzpp.zzh();
        zzh.zzf(false);
        abstractC1643b.getClass();
        zzh.zzd(null);
        zzh.zza(zzli.FAILED);
        zzh.zzb(zzlc.DOWNLOAD_FAILED);
        zzh.zzc(i);
        zzg(zzpeVar, abstractC1643b, zzh.zzh());
    }

    public final void zzf(zzpe zzpeVar, AbstractC1643b abstractC1643b, zzlc zzlcVar, boolean z10, ModelType modelType, zzli zzliVar) {
        zzpo zzh = zzpp.zzh();
        zzh.zzf(z10);
        zzh.zzd(modelType);
        zzh.zzb(zzlcVar);
        zzh.zza(zzliVar);
        zzg(zzpeVar, abstractC1643b, zzh.zzh());
    }

    public final void zzg(final zzpe zzpeVar, final AbstractC1643b abstractC1643b, final zzpp zzppVar) {
        a.c().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_common.zzpm
            @Override // java.lang.Runnable
            public final void run() {
                zzpn.this.zzc(zzpeVar, zzppVar, abstractC1643b);
            }
        });
    }
}
