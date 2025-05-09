package com.google.android.gms.internal.measurement;

import android.util.Log;
import s3.b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
final class zzhp extends zzhu<Double> {
    public zzhp(zzhr zzhrVar, String str, Double d10, boolean z10) {
        super(zzhrVar, "measurement.test.double_flag", d10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    public final /* bridge */ /* synthetic */ Double zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String zzc = zzc();
            String str = (String) obj;
            Log.e("PhenotypeFlag", b.o(new StringBuilder(str.length() + String.valueOf(zzc).length() + 27), "Invalid double value for ", zzc, ": ", str));
            return null;
        }
    }
}
