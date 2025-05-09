package com.google.android.gms.internal.measurement;

import android.util.Log;
import s3.b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
final class zzhn extends zzhu<Long> {
    public zzhn(zzhr zzhrVar, String str, Long l10, boolean z10) {
        super(zzhrVar, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    public final /* bridge */ /* synthetic */ Long zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String zzc = zzc();
            String str = (String) obj;
            Log.e("PhenotypeFlag", b.o(new StringBuilder(str.length() + String.valueOf(zzc).length() + 25), "Invalid long value for ", zzc, ": ", str));
            return null;
        }
    }
}
