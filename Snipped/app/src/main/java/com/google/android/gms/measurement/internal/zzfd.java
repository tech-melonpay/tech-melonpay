package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes.dex */
public final class zzfd {
    final zzfv zza;

    public zzfd(zzks zzksVar) {
        this.zza = zzksVar.zzq();
    }

    @VisibleForTesting
    public final boolean zza() {
        try {
            PackageManagerWrapper packageManager = Wrappers.packageManager(this.zza.zzau());
            if (packageManager != null) {
                return packageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            this.zza.zzay().zzj().zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.zza.zzay().zzj().zzb("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
