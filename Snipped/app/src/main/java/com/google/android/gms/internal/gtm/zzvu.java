package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zzvu extends zzvy {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ zzvu(zzvt zzvtVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> zzf(Object obj, long j10, int i) {
        zzvr zzvrVar;
        List<L> list = (List) zzxy.zzf(obj, j10);
        if (list.isEmpty()) {
            List<L> zzvrVar2 = list instanceof zzvs ? new zzvr(i) : ((list instanceof zzws) && (list instanceof zzvh)) ? ((zzvh) list).zzd(i) : new ArrayList<>(i);
            zzxy.zzs(obj, j10, zzvrVar2);
            return zzvrVar2;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            zzxy.zzs(obj, j10, arrayList);
            zzvrVar = arrayList;
        } else {
            if (!(list instanceof zzxt)) {
                if (!(list instanceof zzws) || !(list instanceof zzvh)) {
                    return list;
                }
                zzvh zzvhVar = (zzvh) list;
                if (zzvhVar.zzc()) {
                    return list;
                }
                zzvh zzd = zzvhVar.zzd(list.size() + i);
                zzxy.zzs(obj, j10, zzd);
                return zzd;
            }
            zzvr zzvrVar3 = new zzvr(list.size() + i);
            zzvrVar3.addAll(zzvrVar3.size(), (zzxt) list);
            zzxy.zzs(obj, j10, zzvrVar3);
            zzvrVar = zzvrVar3;
        }
        return zzvrVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzvy
    public final <L> List<L> zza(Object obj, long j10) {
        return zzf(obj, j10, 10);
    }

    @Override // com.google.android.gms.internal.gtm.zzvy
    public final void zzb(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) zzxy.zzf(obj, j10);
        if (list instanceof zzvs) {
            unmodifiableList = ((zzvs) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzws) && (list instanceof zzvh)) {
                zzvh zzvhVar = (zzvh) list;
                if (zzvhVar.zzc()) {
                    zzvhVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzxy.zzs(obj, j10, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.gtm.zzvy
    public final <E> void zzc(Object obj, Object obj2, long j10) {
        List list = (List) zzxy.zzf(obj2, j10);
        List zzf = zzf(obj, j10, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzxy.zzs(obj, j10, list);
    }

    private zzvu() {
        super(null);
    }
}
