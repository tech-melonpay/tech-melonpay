package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.camera.core.impl.utils.a;
import java.util.List;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
final class zzgj {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzgy zzc;
    private static final zzgy zzd;
    private static final zzgy zze;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        zzc = zzY(false);
        zzd = zzY(true);
        zze = new zzha();
    }

    public static zzgy zzA() {
        return zze;
    }

    public static Object zzB(Object obj, int i, int i9, Object obj2, zzgy zzgyVar) {
        if (obj2 == null) {
            obj2 = zzgyVar.zzc(obj);
        }
        zzgyVar.zzf(obj2, i, i9);
        return obj2;
    }

    public static void zzC(zzdp zzdpVar, Object obj, Object obj2) {
        zzdt zzb2 = zzdpVar.zzb(obj2);
        if (zzb2.zza.isEmpty()) {
            return;
        }
        zzdpVar.zzc(obj).zzh(zzb2);
    }

    public static void zzD(zzgy zzgyVar, Object obj, Object obj2) {
        zzgyVar.zzh(obj, zzgyVar.zze(zzgyVar.zzd(obj), zzgyVar.zzd(obj2)));
    }

    public static void zzE(Class cls) {
        Class cls2;
        if (!zzed.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzF(int i, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzc(i, list, z10);
    }

    public static void zzG(int i, List list, zzhq zzhqVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zze(i, list);
    }

    public static void zzH(int i, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzg(i, list, z10);
    }

    public static void zzI(int i, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzj(i, list, z10);
    }

    public static void zzJ(int i, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzl(i, list, z10);
    }

    public static void zzK(int i, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzn(i, list, z10);
    }

    public static void zzL(int i, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzp(i, list, z10);
    }

    public static void zzM(int i, List list, zzhq zzhqVar, zzgh zzghVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((zzdk) zzhqVar).zzq(i, list.get(i9), zzghVar);
        }
    }

    public static void zzN(int i, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzs(i, list, z10);
    }

    public static void zzO(int i, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzu(i, list, z10);
    }

    public static void zzP(int i, List list, zzhq zzhqVar, zzgh zzghVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((zzdk) zzhqVar).zzv(i, list.get(i9), zzghVar);
        }
    }

    public static void zzQ(int i, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzy(i, list, z10);
    }

    public static void zzR(int i, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzA(i, list, z10);
    }

    public static void zzS(int i, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzC(i, list, z10);
    }

    public static void zzT(int i, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzE(i, list, z10);
    }

    public static void zzU(int i, List list, zzhq zzhqVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzH(i, list);
    }

    public static void zzV(int i, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzJ(i, list, z10);
    }

    public static void zzW(int i, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzL(i, list, z10);
    }

    public static boolean zzX(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private static zzgy zzY(boolean z10) {
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
            return (zzgy) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zza(int i, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdj.zzy(i << 3) + 1) * size;
    }

    public static int zzb(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzy = zzdj.zzy(i << 3) * size;
        for (int i9 = 0; i9 < list.size(); i9++) {
            int zzd2 = ((zzdb) list.get(i9)).zzd();
            zzy = a.z(zzd2, zzd2, zzy);
        }
        return zzy;
    }

    public static int zzc(int i, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdj.zzy(i << 3) * size) + zzd(list);
    }

    public static int zzd(List list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzee) {
            zzee zzeeVar = (zzee) list;
            i = 0;
            while (i9 < size) {
                i += zzdj.zzu(zzeeVar.zze(i9));
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                i += zzdj.zzu(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i;
    }

    public static int zze(int i, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdj.zzy(i << 3) + 4) * size;
    }

    public static int zzf(List list) {
        return list.size() * 4;
    }

    public static int zzg(int i, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdj.zzy(i << 3) + 8) * size;
    }

    public static int zzh(List list) {
        return list.size() * 8;
    }

    public static int zzi(int i, List list, zzgh zzghVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += zzdj.zzt(i, (zzfo) list.get(i10), zzghVar);
        }
        return i9;
    }

    public static int zzj(int i, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdj.zzy(i << 3) * size) + zzk(list);
    }

    public static int zzk(List list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzee) {
            zzee zzeeVar = (zzee) list;
            i = 0;
            while (i9 < size) {
                i += zzdj.zzu(zzeeVar.zze(i9));
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                i += zzdj.zzu(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i;
    }

    public static int zzl(int i, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzdj.zzy(i << 3) * list.size()) + zzm(list);
    }

    public static int zzm(List list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfd) {
            zzfd zzfdVar = (zzfd) list;
            i = 0;
            while (i9 < size) {
                i += zzdj.zzz(zzfdVar.zze(i9));
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                i += zzdj.zzz(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return i;
    }

    public static int zzn(int i, Object obj, zzgh zzghVar) {
        if (!(obj instanceof zzeu)) {
            return zzdj.zzy(i << 3) + zzdj.zzw((zzfo) obj, zzghVar);
        }
        int i9 = zzdj.zzb;
        int zza2 = ((zzeu) obj).zza();
        return zzdj.zzy(i << 3) + zzdj.zzy(zza2) + zza2;
    }

    public static int zzo(int i, List list, zzgh zzghVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzy = zzdj.zzy(i << 3) * size;
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = list.get(i9);
            if (obj instanceof zzeu) {
                int zza2 = ((zzeu) obj).zza();
                zzy = a.z(zza2, zza2, zzy);
            } else {
                zzy = zzdj.zzw((zzfo) obj, zzghVar) + zzy;
            }
        }
        return zzy;
    }

    public static int zzp(int i, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdj.zzy(i << 3) * size) + zzq(list);
    }

    public static int zzq(List list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzee) {
            zzee zzeeVar = (zzee) list;
            i = 0;
            while (i9 < size) {
                int zze2 = zzeeVar.zze(i9);
                i += zzdj.zzy((zze2 >> 31) ^ (zze2 + zze2));
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                int intValue = ((Integer) list.get(i9)).intValue();
                i += zzdj.zzy((intValue >> 31) ^ (intValue + intValue));
                i9++;
            }
        }
        return i;
    }

    public static int zzr(int i, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdj.zzy(i << 3) * size) + zzs(list);
    }

    public static int zzs(List list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfd) {
            zzfd zzfdVar = (zzfd) list;
            i = 0;
            while (i9 < size) {
                long zze2 = zzfdVar.zze(i9);
                i += zzdj.zzz((zze2 >> 63) ^ (zze2 + zze2));
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                long longValue = ((Long) list.get(i9)).longValue();
                i += zzdj.zzz((longValue >> 63) ^ (longValue + longValue));
                i9++;
            }
        }
        return i;
    }

    public static int zzt(int i, List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        int i10 = zzdj.zzb;
        boolean z10 = list instanceof zzew;
        int zzy = zzdj.zzy(i << 3) * size;
        if (z10) {
            zzew zzewVar = (zzew) list;
            while (i9 < size) {
                Object zzf = zzewVar.zzf(i9);
                if (zzf instanceof zzdb) {
                    int zzd2 = ((zzdb) zzf).zzd();
                    zzy = a.z(zzd2, zzd2, zzy);
                } else {
                    zzy = zzdj.zzx((String) zzf) + zzy;
                }
                i9++;
            }
        } else {
            while (i9 < size) {
                Object obj = list.get(i9);
                if (obj instanceof zzdb) {
                    int zzd3 = ((zzdb) obj).zzd();
                    zzy = a.z(zzd3, zzd3, zzy);
                } else {
                    zzy = zzdj.zzx((String) obj) + zzy;
                }
                i9++;
            }
        }
        return zzy;
    }

    public static int zzu(int i, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdj.zzy(i << 3) * size) + zzv(list);
    }

    public static int zzv(List list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzee) {
            zzee zzeeVar = (zzee) list;
            i = 0;
            while (i9 < size) {
                i += zzdj.zzy(zzeeVar.zze(i9));
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                i += zzdj.zzy(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i;
    }

    public static int zzw(int i, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdj.zzy(i << 3) * size) + zzx(list);
    }

    public static int zzx(List list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfd) {
            zzfd zzfdVar = (zzfd) list;
            i = 0;
            while (i9 < size) {
                i += zzdj.zzz(zzfdVar.zze(i9));
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                i += zzdj.zzz(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return i;
    }

    public static zzgy zzy() {
        return zzc;
    }

    public static zzgy zzz() {
        return zzd;
    }
}
