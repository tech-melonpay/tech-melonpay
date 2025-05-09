package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
final class zzko extends zzkq {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ zzko(zzkn zzknVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final void zza(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) zzml.zzf(obj, j10);
        if (list instanceof zzkm) {
            unmodifiableList = ((zzkm) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzlj) && (list instanceof zzke)) {
                zzke zzkeVar = (zzke) list;
                if (zzkeVar.zzc()) {
                    zzkeVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzml.zzs(obj, j10, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzkq
    public final <E> void zzb(Object obj, Object obj2, long j10) {
        zzkl zzklVar;
        List list = (List) zzml.zzf(obj2, j10);
        int size = list.size();
        List list2 = (List) zzml.zzf(obj, j10);
        if (list2.isEmpty()) {
            list2 = list2 instanceof zzkm ? new zzkl(size) : ((list2 instanceof zzlj) && (list2 instanceof zzke)) ? ((zzke) list2).zzd(size) : new ArrayList(size);
            zzml.zzs(obj, j10, list2);
        } else {
            if (zza.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                zzml.zzs(obj, j10, arrayList);
                zzklVar = arrayList;
            } else if (list2 instanceof zzmg) {
                zzkl zzklVar2 = new zzkl(list2.size() + size);
                zzklVar2.addAll(zzklVar2.size(), (zzmg) list2);
                zzml.zzs(obj, j10, zzklVar2);
                zzklVar = zzklVar2;
            } else if ((list2 instanceof zzlj) && (list2 instanceof zzke)) {
                zzke zzkeVar = (zzke) list2;
                if (!zzkeVar.zzc()) {
                    list2 = zzkeVar.zzd(list2.size() + size);
                    zzml.zzs(obj, j10, list2);
                }
            }
            list2 = zzklVar;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        zzml.zzs(obj, j10, list);
    }

    private zzko() {
        super(null);
    }
}
