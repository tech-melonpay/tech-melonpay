package com.google.android.gms.internal.measurement;

import androidx.camera.core.impl.utils.a;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
final class zzlp {
    private static final Class<?> zza;
    private static final zzmb<?, ?> zzb;
    private static final zzmb<?, ?> zzc;
    private static final zzmb<?, ?> zzd;

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
        zzd = new zzmd();
    }

    public static zzmb<?, ?> zzA() {
        return zzc;
    }

    public static zzmb<?, ?> zzB() {
        return zzd;
    }

    public static <UT, UB> UB zzC(int i, List<Integer> list, zzkb zzkbVar, UB ub, zzmb<UT, UB> zzmbVar) {
        if (zzkbVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Integer num = list.get(i10);
                int intValue = num.intValue();
                if (zzkbVar.zza(intValue)) {
                    if (i10 != i9) {
                        list.set(i9, num);
                    }
                    i9++;
                } else {
                    ub = (UB) zzD(i, intValue, ub, zzmbVar);
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
                if (!zzkbVar.zza(intValue2)) {
                    ub = (UB) zzD(i, intValue2, ub, zzmbVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static <UT, UB> UB zzD(int i, int i9, UB ub, zzmb<UT, UB> zzmbVar) {
        if (ub == null) {
            ub = zzmbVar.zze();
        }
        zzmbVar.zzf(ub, i, i9);
        return ub;
    }

    public static <T, FT extends zzjn<FT>> void zzE(zzjk<FT> zzjkVar, T t3, T t10) {
        zzjkVar.zza(t10);
        throw null;
    }

    public static <T, UT, UB> void zzF(zzmb<UT, UB> zzmbVar, T t3, T t10) {
        zzmbVar.zzh(t3, zzmbVar.zzd(zzmbVar.zzc(t3), zzmbVar.zzc(t10)));
    }

    public static void zzG(Class<?> cls) {
        Class<?> cls2;
        if (!zzjx.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zzH(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static <T> void zzI(zzkx zzkxVar, T t3, T t10, long j10) {
        zzml.zzs(t3, j10, zzkx.zzb(zzml.zzf(t3, j10), zzml.zzf(t10, j10)));
    }

    public static void zzJ(int i, List<Boolean> list, zzjf zzjfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzc(i, list, z10);
    }

    public static void zzK(int i, List<zzix> list, zzjf zzjfVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zze(i, list);
    }

    public static void zzL(int i, List<Double> list, zzjf zzjfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzg(i, list, z10);
    }

    public static void zzM(int i, List<Integer> list, zzjf zzjfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzj(i, list, z10);
    }

    public static void zzN(int i, List<Integer> list, zzjf zzjfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzl(i, list, z10);
    }

    public static void zzO(int i, List<Long> list, zzjf zzjfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzn(i, list, z10);
    }

    public static void zzP(int i, List<Float> list, zzjf zzjfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzp(i, list, z10);
    }

    public static void zzQ(int i, List<?> list, zzjf zzjfVar, zzln zzlnVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            zzjfVar.zzq(i, list.get(i9), zzlnVar);
        }
    }

    public static void zzR(int i, List<Integer> list, zzjf zzjfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzs(i, list, z10);
    }

    public static void zzS(int i, List<Long> list, zzjf zzjfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzu(i, list, z10);
    }

    public static void zzT(int i, List<?> list, zzjf zzjfVar, zzln zzlnVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            zzjfVar.zzv(i, list.get(i9), zzlnVar);
        }
    }

    public static void zzU(int i, List<Integer> list, zzjf zzjfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzx(i, list, z10);
    }

    public static void zzV(int i, List<Long> list, zzjf zzjfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzz(i, list, z10);
    }

    public static void zzW(int i, List<Integer> list, zzjf zzjfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzB(i, list, z10);
    }

    public static void zzX(int i, List<Long> list, zzjf zzjfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzD(i, list, z10);
    }

    public static void zzY(int i, List<String> list, zzjf zzjfVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzG(i, list);
    }

    public static void zzZ(int i, List<Integer> list, zzjf zzjfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzI(i, list, z10);
    }

    public static int zza(int i, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzje.zzA(i << 3) + 1) * size;
    }

    public static void zzaa(int i, List<Long> list, zzjf zzjfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzK(i, list, z10);
    }

    private static zzmb<?, ?> zzab(boolean z10) {
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
            return (zzmb) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zzb(List<?> list) {
        return list.size();
    }

    public static int zzc(int i, List<zzix> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzje.zzz(i) * size;
        for (int i9 = 0; i9 < list.size(); i9++) {
            zzz += zzje.zzt(list.get(i9));
        }
        return zzz;
    }

    public static int zzd(int i, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzje.zzz(i) * size) + zze(list);
    }

    public static int zze(List<Integer> list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            i = 0;
            while (i9 < size) {
                i += zzje.zzv(zzjyVar.zze(i9));
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                i += zzje.zzv(list.get(i9).intValue());
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
        return (zzje.zzA(i << 3) + 4) * size;
    }

    public static int zzg(List<?> list) {
        return list.size() * 4;
    }

    public static int zzh(int i, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzje.zzA(i << 3) + 8) * size;
    }

    public static int zzi(List<?> list) {
        return list.size() * 8;
    }

    public static int zzj(int i, List<zzlc> list, zzln zzlnVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += zzje.zzu(i, list.get(i10), zzlnVar);
        }
        return i9;
    }

    public static int zzk(int i, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzje.zzz(i) * size) + zzl(list);
    }

    public static int zzl(List<Integer> list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            i = 0;
            while (i9 < size) {
                i += zzje.zzv(zzjyVar.zze(i9));
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                i += zzje.zzv(list.get(i9).intValue());
                i9++;
            }
        }
        return i;
    }

    public static int zzm(int i, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzje.zzz(i) * list.size()) + zzn(list);
    }

    public static int zzn(List<Long> list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkr) {
            zzkr zzkrVar = (zzkr) list;
            i = 0;
            while (i9 < size) {
                i += zzje.zzB(zzkrVar.zza(i9));
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                i += zzje.zzB(list.get(i9).longValue());
                i9++;
            }
        }
        return i;
    }

    public static int zzo(int i, Object obj, zzln zzlnVar) {
        if (!(obj instanceof zzkk)) {
            return zzje.zzx((zzlc) obj, zzlnVar) + zzje.zzA(i << 3);
        }
        int zzA = zzje.zzA(i << 3);
        int zza2 = ((zzkk) obj).zza();
        return a.v(zza2, zza2, zzA);
    }

    public static int zzp(int i, List<?> list, zzln zzlnVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzje.zzz(i) * size;
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = list.get(i9);
            zzz = (obj instanceof zzkk ? zzje.zzw((zzkk) obj) : zzje.zzx((zzlc) obj, zzlnVar)) + zzz;
        }
        return zzz;
    }

    public static int zzq(int i, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzje.zzz(i) * size) + zzr(list);
    }

    public static int zzr(List<Integer> list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            i = 0;
            while (i9 < size) {
                int zze = zzjyVar.zze(i9);
                i += zzje.zzA((zze >> 31) ^ (zze + zze));
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                int intValue = list.get(i9).intValue();
                i += zzje.zzA((intValue >> 31) ^ (intValue + intValue));
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
        return (zzje.zzz(i) * size) + zzt(list);
    }

    public static int zzt(List<Long> list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkr) {
            zzkr zzkrVar = (zzkr) list;
            i = 0;
            while (i9 < size) {
                long zza2 = zzkrVar.zza(i9);
                i += zzje.zzB((zza2 >> 63) ^ (zza2 + zza2));
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                long longValue = list.get(i9).longValue();
                i += zzje.zzB((longValue >> 63) ^ (longValue + longValue));
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
        int zzz = zzje.zzz(i) * size;
        if (list instanceof zzkm) {
            zzkm zzkmVar = (zzkm) list;
            while (i9 < size) {
                Object zzf = zzkmVar.zzf(i9);
                zzz = (zzf instanceof zzix ? zzje.zzt((zzix) zzf) : zzje.zzy((String) zzf)) + zzz;
                i9++;
            }
        } else {
            while (i9 < size) {
                Object obj = list.get(i9);
                zzz = (obj instanceof zzix ? zzje.zzt((zzix) obj) : zzje.zzy((String) obj)) + zzz;
                i9++;
            }
        }
        return zzz;
    }

    public static int zzv(int i, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzje.zzz(i) * size) + zzw(list);
    }

    public static int zzw(List<Integer> list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            i = 0;
            while (i9 < size) {
                i += zzje.zzA(zzjyVar.zze(i9));
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                i += zzje.zzA(list.get(i9).intValue());
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
        return (zzje.zzz(i) * size) + zzy(list);
    }

    public static int zzy(List<Long> list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkr) {
            zzkr zzkrVar = (zzkr) list;
            i = 0;
            while (i9 < size) {
                i += zzje.zzB(zzkrVar.zza(i9));
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                i += zzje.zzB(list.get(i9).longValue());
                i9++;
            }
        }
        return i;
    }

    public static zzmb<?, ?> zzz() {
        return zzb;
    }
}
