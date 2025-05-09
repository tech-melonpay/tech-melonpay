package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.messaging.ServiceStarter;
import java.lang.reflect.InvocationTargetException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
public final class zzaf extends zzgo {
    private Boolean zza;
    private zzae zzb;
    private Boolean zzc;

    public zzaf(zzfv zzfvVar) {
        super(zzfvVar);
        this.zzb = new zzae() { // from class: com.google.android.gms.measurement.internal.zzad
            @Override // com.google.android.gms.measurement.internal.zzae
            public final String zza(String str, String str2) {
                return null;
            }
        };
    }

    public static final long zzA() {
        return zzdy.zzC.zza(null).longValue();
    }

    private final String zzB(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.checkNotNull(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            this.zzs.zzay().zzd().zzb("Could not find SystemProperties class", e10);
            return "";
        } catch (IllegalAccessException e11) {
            this.zzs.zzay().zzd().zzb("Could not access SystemProperties.get()", e11);
            return "";
        } catch (NoSuchMethodException e12) {
            this.zzs.zzay().zzd().zzb("Could not find SystemProperties.get() method", e12);
            return "";
        } catch (InvocationTargetException e13) {
            this.zzs.zzay().zzd().zzb("SystemProperties.get() threw an exception", e13);
            return "";
        }
    }

    public static final long zzz() {
        return zzdy.zzc.zza(null).longValue();
    }

    public final double zza(String str, zzdx<Double> zzdxVar) {
        if (str == null) {
            return zzdxVar.zza(null).doubleValue();
        }
        String zza = this.zzb.zza(str, zzdxVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return zzdxVar.zza(null).doubleValue();
        }
        try {
            return zzdxVar.zza(Double.valueOf(Double.parseDouble(zza))).doubleValue();
        } catch (NumberFormatException unused) {
            return zzdxVar.zza(null).doubleValue();
        }
    }

    public final int zzb(String str) {
        return zzf(str, zzdy.zzG, ServiceStarter.ERROR_UNKNOWN, 2000);
    }

    public final int zzc() {
        zzkz zzv = this.zzs.zzv();
        Boolean zzj = zzv.zzs.zzt().zzj();
        if (zzv.zzm() < 201500) {
            return (zzj == null || zzj.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int zzd(String str) {
        return zzf(str, zzdy.zzH, 25, 100);
    }

    public final int zze(String str, zzdx<Integer> zzdxVar) {
        if (str == null) {
            return zzdxVar.zza(null).intValue();
        }
        String zza = this.zzb.zza(str, zzdxVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return zzdxVar.zza(null).intValue();
        }
        try {
            return zzdxVar.zza(Integer.valueOf(Integer.parseInt(zza))).intValue();
        } catch (NumberFormatException unused) {
            return zzdxVar.zza(null).intValue();
        }
    }

    public final int zzf(String str, zzdx<Integer> zzdxVar, int i, int i9) {
        return Math.max(Math.min(zze(str, zzdxVar), i9), i);
    }

    public final long zzh() {
        this.zzs.zzaw();
        return 46000L;
    }

    public final long zzi(String str, zzdx<Long> zzdxVar) {
        if (str == null) {
            return zzdxVar.zza(null).longValue();
        }
        String zza = this.zzb.zza(str, zzdxVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return zzdxVar.zza(null).longValue();
        }
        try {
            return zzdxVar.zza(Long.valueOf(Long.parseLong(zza))).longValue();
        } catch (NumberFormatException unused) {
            return zzdxVar.zza(null).longValue();
        }
    }

    @VisibleForTesting
    public final Bundle zzj() {
        try {
            if (this.zzs.zzau().getPackageManager() == null) {
                this.zzs.zzay().zzd().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(this.zzs.zzau()).getApplicationInfo(this.zzs.zzau().getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            this.zzs.zzay().zzd().zza("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            this.zzs.zzay().zzd().zzb("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    @VisibleForTesting
    public final Boolean zzk(String str) {
        Preconditions.checkNotEmpty(str);
        Bundle zzj = zzj();
        if (zzj == null) {
            androidx.camera.core.impl.utils.a.t(this.zzs, "Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (zzj.containsKey(str)) {
            return Boolean.valueOf(zzj.getBoolean(str));
        }
        return null;
    }

    public final String zzl() {
        return zzB("debug.firebase.analytics.app", "");
    }

    public final String zzm() {
        return zzB("debug.deferred.deeplink", "");
    }

    public final String zzn() {
        this.zzs.zzaw();
        return "FA";
    }

    public final String zzo(String str, zzdx<String> zzdxVar) {
        return str == null ? zzdxVar.zza(null) : zzdxVar.zza(this.zzb.zza(str, zzdxVar.zzb()));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @com.google.android.gms.common.util.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> zzp(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            android.os.Bundle r0 = r3.zzj()
            r1 = 0
            if (r0 != 0) goto L15
            com.google.android.gms.measurement.internal.zzfv r4 = r3.zzs
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            androidx.camera.core.impl.utils.a.t(r4, r0)
        L13:
            r4 = r1
            goto L24
        L15:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L1c
            goto L13
        L1c:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L24:
            if (r4 == 0) goto L50
            com.google.android.gms.measurement.internal.zzfv r0 = r3.zzs     // Catch: android.content.res.Resources.NotFoundException -> L40
            android.content.Context r0 = r0.zzau()     // Catch: android.content.res.Resources.NotFoundException -> L40
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L40
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L40
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L40
            if (r4 != 0) goto L3b
            return r1
        L3b:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L40
            return r4
        L40:
            r4 = move-exception
            com.google.android.gms.measurement.internal.zzfv r0 = r3.zzs
            com.google.android.gms.measurement.internal.zzel r0 = r0.zzay()
            com.google.android.gms.measurement.internal.zzej r0 = r0.zzd()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.zzb(r2, r4)
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaf.zzp(java.lang.String):java.util.List");
    }

    public final void zzq(zzae zzaeVar) {
        this.zzb = zzaeVar;
    }

    public final boolean zzr() {
        Boolean zzk = zzk("google_analytics_adid_collection_enabled");
        return zzk == null || zzk.booleanValue();
    }

    public final boolean zzs(String str, zzdx<Boolean> zzdxVar) {
        if (str == null) {
            return zzdxVar.zza(null).booleanValue();
        }
        String zza = this.zzb.zza(str, zzdxVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return zzdxVar.zza(null).booleanValue();
        }
        return zzdxVar.zza(Boolean.valueOf(this.zzs.zzf().zzs(null, zzdy.zzaB) ? "1".equals(zza) : Boolean.parseBoolean(zza))).booleanValue();
    }

    public final boolean zzt(String str) {
        return "1".equals(this.zzb.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzu() {
        Boolean zzk = zzk("google_analytics_automatic_screen_reporting_enabled");
        return zzk == null || zzk.booleanValue();
    }

    public final boolean zzv() {
        this.zzs.zzaw();
        Boolean zzk = zzk("firebase_analytics_collection_deactivated");
        return zzk != null && zzk.booleanValue();
    }

    public final boolean zzw(String str) {
        return "1".equals(this.zzb.zza(str, "measurement.event_sampling_enabled"));
    }

    public final boolean zzx() {
        if (this.zza == null) {
            Boolean zzk = zzk("app_measurement_lite");
            this.zza = zzk;
            if (zzk == null) {
                this.zza = Boolean.FALSE;
            }
        }
        return this.zza.booleanValue() || !this.zzs.zzN();
    }

    @EnsuresNonNull({"this.isMainProcess"})
    public final boolean zzy() {
        if (this.zzc == null) {
            synchronized (this) {
                try {
                    if (this.zzc == null) {
                        ApplicationInfo applicationInfo = this.zzs.zzau().getApplicationInfo();
                        String myProcessName = ProcessUtils.getMyProcessName();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z10 = false;
                            if (str != null && str.equals(myProcessName)) {
                                z10 = true;
                            }
                            this.zzc = Boolean.valueOf(z10);
                        }
                        if (this.zzc == null) {
                            this.zzc = Boolean.TRUE;
                            this.zzs.zzay().zzd().zza("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.zzc.booleanValue();
    }
}
