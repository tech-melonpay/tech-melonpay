package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
final class zziq implements Comparator<zzix> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzix zzixVar, zzix zzixVar2) {
        zzix zzixVar3 = zzixVar;
        zzix zzixVar4 = zzixVar2;
        zzio zzioVar = new zzio(zzixVar3);
        zzio zzioVar2 = new zzio(zzixVar4);
        while (zzioVar.hasNext() && zzioVar2.hasNext()) {
            int zza = zzip.zza(zzioVar.zza() & 255, zzioVar2.zza() & 255);
            if (zza != 0) {
                return zza;
            }
        }
        return zzip.zza(zzixVar3.zzd(), zzixVar4.zzd());
    }
}
