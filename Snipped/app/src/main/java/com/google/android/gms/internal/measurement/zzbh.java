package com.google.android.gms.internal.measurement;

import androidx.camera.core.impl.utils.a;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes.dex */
public final class zzbh extends zzaw {
    public zzbh() {
        this.zza.add(zzbl.FOR_IN);
        this.zza.add(zzbl.FOR_IN_CONST);
        this.zza.add(zzbl.FOR_IN_LET);
        this.zza.add(zzbl.FOR_LET);
        this.zza.add(zzbl.FOR_OF);
        this.zza.add(zzbl.FOR_OF_CONST);
        this.zza.add(zzbl.FOR_OF_LET);
        this.zza.add(zzbl.WHILE);
    }

    private static zzap zzc(zzbf zzbfVar, Iterator<zzap> it, zzap zzapVar) {
        if (it != null) {
            while (it.hasNext()) {
                zzap zzc = zzbfVar.zza(it.next()).zzc((zzae) zzapVar);
                if (zzc instanceof zzag) {
                    zzag zzagVar = (zzag) zzc;
                    if ("break".equals(zzagVar.zzc())) {
                        return zzap.zzf;
                    }
                    if ("return".equals(zzagVar.zzc())) {
                        return zzagVar;
                    }
                }
            }
        }
        return zzap.zzf;
    }

    private static zzap zzd(zzbf zzbfVar, zzap zzapVar, zzap zzapVar2) {
        return zzc(zzbfVar, zzapVar.zzl(), zzapVar2);
    }

    private static zzap zze(zzbf zzbfVar, zzap zzapVar, zzap zzapVar2) {
        if (zzapVar instanceof Iterable) {
            return zzc(zzbfVar, ((Iterable) zzapVar).iterator(), zzapVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List<zzap> list) {
        zzbl zzblVar = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 65) {
            zzap zzapVar = (zzap) a.e(zzbl.WHILE, 4, list, 0);
            zzap zzapVar2 = list.get(1);
            zzap zzapVar3 = list.get(2);
            zzap zzb = zzgVar.zzb(list.get(3));
            if (zzgVar.zzb(zzapVar3).zzg().booleanValue()) {
                zzap zzc = zzgVar.zzc((zzae) zzb);
                if (zzc instanceof zzag) {
                    zzag zzagVar = (zzag) zzc;
                    if ("break".equals(zzagVar.zzc())) {
                        return zzap.zzf;
                    }
                    if ("return".equals(zzagVar.zzc())) {
                        return zzagVar;
                    }
                }
            }
            while (zzgVar.zzb(zzapVar).zzg().booleanValue()) {
                zzap zzc2 = zzgVar.zzc((zzae) zzb);
                if (zzc2 instanceof zzag) {
                    zzag zzagVar2 = (zzag) zzc2;
                    if ("break".equals(zzagVar2.zzc())) {
                        return zzap.zzf;
                    }
                    if ("return".equals(zzagVar2.zzc())) {
                        return zzagVar2;
                    }
                }
                zzgVar.zzb(zzapVar2);
            }
            return zzap.zzf;
        }
        switch (ordinal) {
            case 26:
                if (!(a.e(zzbl.FOR_IN, 3, list, 0) instanceof zzat)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                return zzd(new zzbg(zzgVar, list.get(0).zzi()), zzgVar.zzb(list.get(1)), zzgVar.zzb(list.get(2)));
            case 27:
                if (!(a.e(zzbl.FOR_IN_CONST, 3, list, 0) instanceof zzat)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return zzd(new zzbd(zzgVar, list.get(0).zzi()), zzgVar.zzb(list.get(1)), zzgVar.zzb(list.get(2)));
            case 28:
                if (!(a.e(zzbl.FOR_IN_LET, 3, list, 0) instanceof zzat)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                return zzd(new zzbe(zzgVar, list.get(0).zzi()), zzgVar.zzb(list.get(1)), zzgVar.zzb(list.get(2)));
            case 29:
                zzap zzb2 = zzgVar.zzb((zzap) a.e(zzbl.FOR_LET, 4, list, 0));
                if (!(zzb2 instanceof zzae)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                zzae zzaeVar = (zzae) zzb2;
                zzap zzapVar4 = list.get(1);
                zzap zzapVar5 = list.get(2);
                zzap zzb3 = zzgVar.zzb(list.get(3));
                zzg zza = zzgVar.zza();
                for (int i = 0; i < zzaeVar.zzc(); i++) {
                    String zzi = zzaeVar.zze(i).zzi();
                    zza.zzg(zzi, zzgVar.zzd(zzi));
                }
                while (zzgVar.zzb(zzapVar4).zzg().booleanValue()) {
                    zzap zzc3 = zzgVar.zzc((zzae) zzb3);
                    if (zzc3 instanceof zzag) {
                        zzag zzagVar3 = (zzag) zzc3;
                        if ("break".equals(zzagVar3.zzc())) {
                            return zzap.zzf;
                        }
                        if ("return".equals(zzagVar3.zzc())) {
                            return zzagVar3;
                        }
                    }
                    zzg zza2 = zzgVar.zza();
                    for (int i9 = 0; i9 < zzaeVar.zzc(); i9++) {
                        String zzi2 = zzaeVar.zze(i9).zzi();
                        zza2.zzg(zzi2, zza.zzd(zzi2));
                    }
                    zza2.zzb(zzapVar5);
                    zza = zza2;
                }
                return zzap.zzf;
            case 30:
                if (!(a.e(zzbl.FOR_OF, 3, list, 0) instanceof zzat)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return zze(new zzbg(zzgVar, list.get(0).zzi()), zzgVar.zzb(list.get(1)), zzgVar.zzb(list.get(2)));
            case 31:
                if (!(a.e(zzbl.FOR_OF_CONST, 3, list, 0) instanceof zzat)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return zze(new zzbd(zzgVar, list.get(0).zzi()), zzgVar.zzb(list.get(1)), zzgVar.zzb(list.get(2)));
            case 32:
                if (!(a.e(zzbl.FOR_OF_LET, 3, list, 0) instanceof zzat)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return zze(new zzbe(zzgVar, list.get(0).zzi()), zzgVar.zzb(list.get(1)), zzgVar.zzb(list.get(2)));
            default:
                return zzb(str);
        }
    }
}
