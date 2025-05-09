package com.google.android.gms.internal.measurement;

import android.util.Log;
import s3.b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
final class zzho extends zzhu<Boolean> {
    public zzho(zzhr zzhrVar, String str, Boolean bool, boolean z10) {
        super(zzhrVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzhu
    public final /* bridge */ /* synthetic */ Boolean zza(Object obj) {
        if (zzgv.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzgv.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        String zzc = zzc();
        String str = (String) obj;
        Log.e("PhenotypeFlag", b.o(new StringBuilder(str.length() + String.valueOf(zzc).length() + 28), "Invalid boolean value for ", zzc, ": ", str));
        return null;
    }
}
