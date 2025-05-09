package com.google.android.gms.analytics;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zzf implements Comparator<zzj> {
    public zzf(zzg zzgVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzj zzjVar, zzj zzjVar2) {
        return zzjVar.getClass().getCanonicalName().compareTo(zzjVar2.getClass().getCanonicalName());
    }
}
