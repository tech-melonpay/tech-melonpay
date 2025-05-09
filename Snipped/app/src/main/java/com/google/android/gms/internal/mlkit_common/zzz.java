package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public final class zzz {
    private final String zza;
    private final zzx zzb;
    private zzx zzc;

    public /* synthetic */ zzz(String str, zzy zzyVar) {
        zzx zzxVar = new zzx(null);
        this.zzb = zzxVar;
        this.zzc = zzxVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzx zzxVar = this.zzb.zzc;
        String str = "";
        while (zzxVar != null) {
            Object obj = zzxVar.zzb;
            boolean z10 = zzxVar instanceof zzv;
            sb2.append(str);
            String str2 = zzxVar.zza;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            zzxVar = zzxVar.zzc;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzz zza(String str, Object obj) {
        zzx zzxVar = new zzx(null);
        this.zzc.zzc = zzxVar;
        this.zzc = zzxVar;
        zzxVar.zzb = obj;
        zzxVar.zza = str;
        return this;
    }

    public final zzz zzb(String str, boolean z10) {
        String valueOf = String.valueOf(z10);
        zzv zzvVar = new zzv(null);
        this.zzc.zzc = zzvVar;
        this.zzc = zzvVar;
        zzvVar.zzb = valueOf;
        zzvVar.zza = "isManifestFile";
        return this;
    }
}
