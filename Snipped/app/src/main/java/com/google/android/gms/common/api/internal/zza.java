package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
final class zza implements Runnable {
    final /* synthetic */ LifecycleCallback zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzb zzc;

    public zza(zzb zzbVar, LifecycleCallback lifecycleCallback, String str) {
        this.zzc = zzbVar;
        this.zza = lifecycleCallback;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i9;
        int i10;
        int i11;
        int i12;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        zzb zzbVar = this.zzc;
        i = zzbVar.zzc;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.zza;
            bundle = zzbVar.zzd;
            if (bundle != null) {
                String str = this.zzb;
                bundle3 = zzbVar.zzd;
                bundle2 = bundle3.getBundle(str);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
        i9 = this.zzc.zzc;
        if (i9 >= 2) {
            this.zza.onStart();
        }
        i10 = this.zzc.zzc;
        if (i10 >= 3) {
            this.zza.onResume();
        }
        i11 = this.zzc.zzc;
        if (i11 >= 4) {
            this.zza.onStop();
        }
        i12 = this.zzc.zzc;
        if (i12 >= 5) {
            this.zza.onDestroy();
        }
    }
}
