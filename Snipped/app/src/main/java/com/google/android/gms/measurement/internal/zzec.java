package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zznx;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
public final class zzec extends zzf {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private List<String> zzh;
    private int zzi;
    private String zzj;
    private String zzk;
    private String zzl;

    public zzec(zzfv zzfvVar, long j10) {
        super(zzfvVar);
        this.zzg = j10;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:0|1|(1:3)(6:84|85|(1:87)(2:102|(1:104))|88|89|(22:91|(1:93)(1:100)|95|96|5|(1:83)(1:9)|10|11|13|(1:15)|16|17|18|(1:20)(1:71)|21|22|(7:24|(1:26)(1:63)|27|(1:29)|30|(2:32|(1:34))|62)(2:64|(3:66|(1:68)(1:70)|69))|(3:36|(1:38)(1:41)|39)|42|(3:44|(1:46)(3:53|(3:56|(1:58)(1:59)|54)|60)|(2:48|49)(2:51|52))|61|(0)(0)))|4|5|(1:7)|83|10|11|13|(0)|16|17|18|(0)(0)|21|22|(0)(0)|(0)|42|(0)|61|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c7, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x021b, code lost:
    
        r13.zzs.zzay().zzd().zzc("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.zzel.zzn(r0), r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x018d A[Catch: IllegalStateException -> 0x01c7, TRY_ENTER, TryCatch #3 {IllegalStateException -> 0x01c7, blocks: (B:18:0x015d, B:21:0x0178, B:24:0x018d, B:27:0x01ab, B:30:0x01b8, B:32:0x01c0, B:36:0x01fc, B:38:0x0212, B:39:0x0217, B:41:0x0215, B:62:0x01c9, B:63:0x01a7, B:64:0x01d0, B:66:0x01d6, B:69:0x01f4, B:70:0x01f0), top: B:17:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01fc A[Catch: IllegalStateException -> 0x01c7, TryCatch #3 {IllegalStateException -> 0x01c7, blocks: (B:18:0x015d, B:21:0x0178, B:24:0x018d, B:27:0x01ab, B:30:0x01b8, B:32:0x01c0, B:36:0x01fc, B:38:0x0212, B:39:0x0217, B:41:0x0215, B:62:0x01c9, B:63:0x01a7, B:64:0x01d0, B:66:0x01d6, B:69:0x01f4, B:70:0x01f0), top: B:17:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d0 A[Catch: IllegalStateException -> 0x01c7, TryCatch #3 {IllegalStateException -> 0x01c7, blocks: (B:18:0x015d, B:21:0x0178, B:24:0x018d, B:27:0x01ab, B:30:0x01b8, B:32:0x01c0, B:36:0x01fc, B:38:0x0212, B:39:0x0217, B:41:0x0215, B:62:0x01c9, B:63:0x01a7, B:64:0x01d0, B:66:0x01d6, B:69:0x01f4, B:70:0x01f0), top: B:17:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0140  */
    @Override // com.google.android.gms.measurement.internal.zzf
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd() {
        /*
            Method dump skipped, instructions count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzec.zzd():void");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return true;
    }

    public final int zzh() {
        zza();
        return this.zzi;
    }

    public final int zzi() {
        zza();
        return this.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzp zzj(java.lang.String r35) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzec.zzj(java.lang.String):com.google.android.gms.measurement.internal.zzp");
    }

    public final String zzk() {
        zza();
        return this.zzk;
    }

    public final String zzl() {
        zza();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    public final String zzm() {
        zza();
        Preconditions.checkNotNull(this.zzl);
        return this.zzl;
    }

    public final String zzn() {
        zznx.zzc();
        if (this.zzs.zzf().zzs(null, zzdy.zzas)) {
            zzg();
        }
        zza();
        Preconditions.checkNotNull(this.zzj);
        return this.zzj;
    }

    public final List<String> zzo() {
        return this.zzh;
    }
}
