package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes.dex */
final class zzet extends BroadcastReceiver {

    @VisibleForTesting
    static final String zza = "com.google.android.gms.measurement.internal.zzet";
    private final zzks zzb;
    private boolean zzc;
    private boolean zzd;

    public zzet(zzks zzksVar) {
        Preconditions.checkNotNull(zzksVar);
        this.zzb = zzksVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zzb.zzB();
        String action = intent.getAction();
        this.zzb.zzay().zzj().zzb("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.zzb.zzay().zzk().zzb("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zza2 = this.zzb.zzl().zza();
        if (this.zzd != zza2) {
            this.zzd = zza2;
            this.zzb.zzaz().zzp(new zzes(this, zza2));
        }
    }

    public final void zzb() {
        this.zzb.zzB();
        this.zzb.zzaz().zzg();
        if (this.zzc) {
            return;
        }
        this.zzb.zzau().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.zzd = this.zzb.zzl().zza();
        this.zzb.zzay().zzj().zzb("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzd));
        this.zzc = true;
    }

    public final void zzc() {
        this.zzb.zzB();
        this.zzb.zzaz().zzg();
        this.zzb.zzaz().zzg();
        if (this.zzc) {
            this.zzb.zzay().zzj().zza("Unregistering connectivity change receiver");
            this.zzc = false;
            this.zzd = false;
            try {
                this.zzb.zzau().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.zzb.zzay().zzd().zzb("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }
}
