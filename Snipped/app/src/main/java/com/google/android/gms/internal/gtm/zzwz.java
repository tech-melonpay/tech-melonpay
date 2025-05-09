package com.google.android.gms.internal.gtm;

import androidx.camera.core.impl.utils.a;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zzwz {
    private static final Class<?> zza;
    private static final zzxo<?, ?> zzb;
    private static final zzxo<?, ?> zzc;
    private static final zzxo<?, ?> zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzab(false);
        zzc = zzab(true);
        zzd = new zzxq();
    }

    public static zzxo<?, ?> zzA() {
        return zzc;
    }

    public static zzxo<?, ?> zzB() {
        return zzd;
    }

    public static <UT, UB> UB zzC(int i, List<Integer> list, zzvd zzvdVar, UB ub, zzxo<UT, UB> zzxoVar) {
        if (zzvdVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Integer num = list.get(i10);
                int intValue = num.intValue();
                if (zzvdVar.zza(intValue)) {
                    if (i10 != i9) {
                        list.set(i9, num);
                    }
                    i9++;
                } else {
                    ub = (UB) zzD(i, intValue, ub, zzxoVar);
                }
            }
            if (i9 != size) {
                list.subList(i9, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzvdVar.zza(intValue2)) {
                    ub = (UB) zzD(i, intValue2, ub, zzxoVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static <UT, UB> UB zzD(int i, int i9, UB ub, zzxo<UT, UB> zzxoVar) {
        if (ub == null) {
            ub = zzxoVar.zzf();
        }
        zzxoVar.zzl(ub, i, i9);
        return ub;
    }

    public static <T, FT extends zzun<FT>> void zzE(zzuk<FT> zzukVar, T t3, T t10) {
        zzuo<FT> zzb2 = zzukVar.zzb(t10);
        if (zzb2.zza.isEmpty()) {
            return;
        }
        zzukVar.zzc(t3).zzh(zzb2);
    }

    public static <T, UT, UB> void zzF(zzxo<UT, UB> zzxoVar, T t3, T t10) {
        zzxoVar.zzo(t3, zzxoVar.zze(zzxoVar.zzd(t3), zzxoVar.zzd(t10)));
    }

    public static void zzG(Class<?> cls) {
        Class<?> cls2;
        if (!zzuz.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zzH(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static <T> void zzI(zzwf zzwfVar, T t3, T t10, long j10) {
        zzxy.zzs(t3, j10, zzwf.zzc(zzxy.zzf(t3, j10), zzxy.zzf(t10, j10)));
    }

    public static void zzJ(int i, List<Boolean> list, zztp zztpVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzc(i, list, z10);
    }

    public static void zzK(int i, List<zztd> list, zztp zztpVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zze(i, list);
    }

    public static void zzL(int i, List<Double> list, zztp zztpVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzg(i, list, z10);
    }

    public static void zzM(int i, List<Integer> list, zztp zztpVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzj(i, list, z10);
    }

    public static void zzN(int i, List<Integer> list, zztp zztpVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzl(i, list, z10);
    }

    public static void zzO(int i, List<Long> list, zztp zztpVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzn(i, list, z10);
    }

    public static void zzP(int i, List<Float> list, zztp zztpVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzp(i, list, z10);
    }

    public static void zzQ(int i, List<?> list, zztp zztpVar, zzwx zzwxVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            zztpVar.zzq(i, list.get(i9), zzwxVar);
        }
    }

    public static void zzR(int i, List<Integer> list, zztp zztpVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzs(i, list, z10);
    }

    public static void zzS(int i, List<Long> list, zztp zztpVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzu(i, list, z10);
    }

    public static void zzT(int i, List<?> list, zztp zztpVar, zzwx zzwxVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            zztpVar.zzv(i, list.get(i9), zzwxVar);
        }
    }

    public static void zzU(int i, List<Integer> list, zztp zztpVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzy(i, list, z10);
    }

    public static void zzV(int i, List<Long> list, zztp zztpVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzA(i, list, z10);
    }

    public static void zzW(int i, List<Integer> list, zztp zztpVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzC(i, list, z10);
    }

    public static void zzX(int i, List<Long> list, zztp zztpVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzE(i, list, z10);
    }

    public static void zzY(int i, List<String> list, zztp zztpVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzH(i, list);
    }

    public static void zzZ(int i, List<Integer> list, zztp zztpVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzJ(i, list, z10);
    }

    public static int zza(int i, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzto.zzD(i << 3) + 1) * size;
    }

    public static void zzaa(int i, List<Long> list, zztp zztpVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzL(i, list, z10);
    }

    private static zzxo<?, ?> zzab(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzxo) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zzb(List<?> list) {
        return list.size();
    }

    public static int zzc(int i, List<zztd> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzC = zzto.zzC(i) * size;
        for (int i9 = 0; i9 < list.size(); i9++) {
            zzC += zzto.zzu(list.get(i9));
        }
        return zzC;
    }

    public static int zzd(int i, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzto.zzC(i) * size) + zze(list);
    }

    public static int zze(List<Integer> list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzva) {
            zzva zzvaVar = (zzva) list;
            i = 0;
            while (i9 < size) {
                i += zzto.zzx(zzvaVar.zze(i9));
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                i += zzto.zzx(list.get(i9).intValue());
                i9++;
            }
        }
        return i;
    }

    public static int zzf(int i, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzto.zzD(i << 3) + 4) * size;
    }

    public static int zzg(List<?> list) {
        return list.size() * 4;
    }

    public static int zzh(int i, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzto.zzD(i << 3) + 8) * size;
    }

    public static int zzi(List<?> list) {
        return list.size() * 8;
    }

    public static int zzj(int i, List<zzwk> list, zzwx zzwxVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += zzto.zzv(i, list.get(i10), zzwxVar);
        }
        return i9;
    }

    public static int zzk(int i, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzto.zzC(i) * size) + zzl(list);
    }

    public static int zzl(List<Integer> list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzva) {
            zzva zzvaVar = (zzva) list;
            i = 0;
            while (i9 < size) {
                i += zzto.zzx(zzvaVar.zze(i9));
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                i += zzto.zzx(list.get(i9).intValue());
                i9++;
            }
        }
        return i;
    }

    public static int zzm(int i, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzto.zzC(i) * list.size()) + zzn(list);
    }

    public static int zzn(List<Long> list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzvz) {
            zzvz zzvzVar = (zzvz) list;
            i = 0;
            while (i9 < size) {
                i += zzto.zzE(zzvzVar.zze(i9));
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                i += zzto.zzE(list.get(i9).longValue());
                i9++;
            }
        }
        return i;
    }

    public static int zzo(int i, Object obj, zzwx zzwxVar) {
        if (!(obj instanceof zzvq)) {
            return zzto.zzA((zzwk) obj, zzwxVar) + zzto.zzD(i << 3);
        }
        int zzD = zzto.zzD(i << 3);
        int zza2 = ((zzvq) obj).zza();
        return a.a(zza2, zza2, zzD);
    }

    public static int zzp(int i, List<?> list, zzwx zzwxVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzC = zzto.zzC(i) * size;
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = list.get(i9);
            zzC = (obj instanceof zzvq ? zzto.zzy((zzvq) obj) : zzto.zzA((zzwk) obj, zzwxVar)) + zzC;
        }
        return zzC;
    }

    public static int zzq(int i, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzto.zzC(i) * size) + zzr(list);
    }

    public static int zzr(List<Integer> list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzva) {
            zzva zzvaVar = (zzva) list;
            i = 0;
            while (i9 < size) {
                int zze = zzvaVar.zze(i9);
                i += zzto.zzD((zze >> 31) ^ (zze + zze));
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                int intValue = list.get(i9).intValue();
                i += zzto.zzD((intValue >> 31) ^ (intValue + intValue));
                i9++;
            }
        }
        return i;
    }

    public static int zzs(int i, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzto.zzC(i) * size) + zzt(list);
    }

    public static int zzt(List<Long> list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzvz) {
            zzvz zzvzVar = (zzvz) list;
            i = 0;
            while (i9 < size) {
                long zze = zzvzVar.zze(i9);
                i += zzto.zzE((zze >> 63) ^ (zze + zze));
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                long longValue = list.get(i9).longValue();
                i += zzto.zzE((longValue >> 63) ^ (longValue + longValue));
                i9++;
            }
        }
        return i;
    }

    public static int zzu(int i, List<?> list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        int zzC = zzto.zzC(i) * size;
        if (list instanceof zzvs) {
            zzvs zzvsVar = (zzvs) list;
            while (i9 < size) {
                Object zzf = zzvsVar.zzf(i9);
                zzC = (zzf instanceof zztd ? zzto.zzu((zztd) zzf) : zzto.zzB((String) zzf)) + zzC;
                i9++;
            }
        } else {
            while (i9 < size) {
                Object obj = list.get(i9);
                zzC = (obj instanceof zztd ? zzto.zzu((zztd) obj) : zzto.zzB((String) obj)) + zzC;
                i9++;
            }
        }
        return zzC;
    }

    public static int zzv(int i, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzto.zzC(i) * size) + zzw(list);
    }

    public static int zzw(List<Integer> list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzva) {
            zzva zzvaVar = (zzva) list;
            i = 0;
            while (i9 < size) {
                i += zzto.zzD(zzvaVar.zze(i9));
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                i += zzto.zzD(list.get(i9).intValue());
                i9++;
            }
        }
        return i;
    }

    public static int zzx(int i, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzto.zzC(i) * size) + zzy(list);
    }

    public static int zzy(List<Long> list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzvz) {
            zzvz zzvzVar = (zzvz) list;
            i = 0;
            while (i9 < size) {
                i += zzto.zzE(zzvzVar.zze(i9));
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                i += zzto.zzE(list.get(i9).longValue());
                i9++;
            }
        }
        return i;
    }

    public static zzxo<?, ?> zzz() {
        return zzb;
    }
}
