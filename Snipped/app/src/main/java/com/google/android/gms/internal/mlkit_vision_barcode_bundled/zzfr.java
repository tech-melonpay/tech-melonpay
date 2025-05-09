package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.camera.core.impl.utils.a;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import s3.b;
import sun.misc.Unsafe;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
final class zzfr<T> implements zzgh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhi.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfo zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzfc zzm;
    private final zzgy zzn;
    private final zzdp zzo;
    private final zzfu zzp;
    private final zzfj zzq;

    private zzfr(int[] iArr, Object[] objArr, int i, int i9, zzfo zzfoVar, boolean z10, boolean z11, int[] iArr2, int i10, int i11, zzfu zzfuVar, zzfc zzfcVar, zzgy zzgyVar, zzdp zzdpVar, zzfj zzfjVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i9;
        this.zzi = z10;
        boolean z12 = false;
        if (zzdpVar != null && zzdpVar.zzg(zzfoVar)) {
            z12 = true;
        }
        this.zzh = z12;
        this.zzj = iArr2;
        this.zzk = i10;
        this.zzl = i11;
        this.zzp = zzfuVar;
        this.zzm = zzfcVar;
        this.zzn = zzgyVar;
        this.zzo = zzdpVar;
        this.zzg = zzfoVar;
        this.zzq = zzfjVar;
    }

    private final zzeh zzA(int i) {
        int i9 = i / 3;
        return (zzeh) this.zzd[i9 + i9 + 1];
    }

    private final zzgh zzB(int i) {
        int i9 = i / 3;
        int i10 = i9 + i9;
        zzgh zzghVar = (zzgh) this.zzd[i10];
        if (zzghVar != null) {
            return zzghVar;
        }
        zzgh zzb2 = zzfx.zza().zzb((Class) this.zzd[i10 + 1]);
        this.zzd[i10] = zzb2;
        return zzb2;
    }

    private final Object zzC(int i) {
        int i9 = i / 3;
        return this.zzd[i9 + i9];
    }

    private final Object zzD(Object obj, int i) {
        zzgh zzB = zzB(i);
        int zzy = zzy(i) & 1048575;
        if (!zzP(obj, i)) {
            return zzB.zze();
        }
        Object object = zzb.getObject(obj, zzy);
        if (zzS(object)) {
            return object;
        }
        Object zze = zzB.zze();
        if (object != null) {
            zzB.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzE(Object obj, int i, int i9) {
        zzgh zzB = zzB(i9);
        if (!zzT(obj, i, i9)) {
            return zzB.zze();
        }
        Object object = zzb.getObject(obj, zzy(i9) & 1048575);
        if (zzS(object)) {
            return object;
        }
        Object zze = zzB.zze();
        if (object != null) {
            zzB.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzF(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder p10 = b.p("Field ", str, " for ", name, " not found. Known fields are ");
            p10.append(arrays);
            throw new RuntimeException(p10.toString());
        }
    }

    private static void zzG(Object obj) {
        if (!zzS(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzH(Object obj, Object obj2, int i) {
        if (zzP(obj2, i)) {
            int zzy = zzy(i) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = zzy;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzgh zzB = zzB(i);
            if (!zzP(obj, i)) {
                if (zzS(object)) {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzJ(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzS(object2)) {
                Object zze2 = zzB.zze();
                zzB.zzg(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            zzB.zzg(object2, object);
        }
    }

    private final void zzI(Object obj, Object obj2, int i) {
        int i9 = this.zzc[i];
        if (zzT(obj2, i9, i)) {
            int zzy = zzy(i) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = zzy;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzgh zzB = zzB(i);
            if (!zzT(obj, i9, i)) {
                if (zzS(object)) {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzK(obj, i9, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzS(object2)) {
                Object zze2 = zzB.zze();
                zzB.zzg(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            zzB.zzg(object2, object);
        }
    }

    private final void zzJ(Object obj, int i) {
        int zzv = zzv(i);
        long j10 = 1048575 & zzv;
        if (j10 == 1048575) {
            return;
        }
        zzhi.zzq(obj, j10, (1 << (zzv >>> 20)) | zzhi.zzc(obj, j10));
    }

    private final void zzK(Object obj, int i, int i9) {
        zzhi.zzq(obj, zzv(i9) & 1048575, i);
    }

    private final void zzL(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzy(i) & 1048575, obj2);
        zzJ(obj, i);
    }

    private final void zzM(Object obj, int i, int i9, Object obj2) {
        zzb.putObject(obj, zzy(i9) & 1048575, obj2);
        zzK(obj, i, i9);
    }

    private final void zzN(zzhq zzhqVar, int i, Object obj, int i9) {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzO(Object obj, Object obj2, int i) {
        return zzP(obj, i) == zzP(obj2, i);
    }

    private final boolean zzP(Object obj, int i) {
        int zzv = zzv(i);
        long j10 = zzv & 1048575;
        if (j10 != 1048575) {
            return (zzhi.zzc(obj, j10) & (1 << (zzv >>> 20))) != 0;
        }
        int zzy = zzy(i);
        long j11 = zzy & 1048575;
        switch (zzx(zzy)) {
            case 0:
                return Double.doubleToRawLongBits(zzhi.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhi.zzb(obj, j11)) != 0;
            case 2:
                return zzhi.zzd(obj, j11) != 0;
            case 3:
                return zzhi.zzd(obj, j11) != 0;
            case 4:
                return zzhi.zzc(obj, j11) != 0;
            case 5:
                return zzhi.zzd(obj, j11) != 0;
            case 6:
                return zzhi.zzc(obj, j11) != 0;
            case 7:
                return zzhi.zzw(obj, j11);
            case 8:
                Object zzf = zzhi.zzf(obj, j11);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzdb) {
                    return !zzdb.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhi.zzf(obj, j11) != null;
            case 10:
                return !zzdb.zzb.equals(zzhi.zzf(obj, j11));
            case 11:
                return zzhi.zzc(obj, j11) != 0;
            case 12:
                return zzhi.zzc(obj, j11) != 0;
            case 13:
                return zzhi.zzc(obj, j11) != 0;
            case 14:
                return zzhi.zzd(obj, j11) != 0;
            case 15:
                return zzhi.zzc(obj, j11) != 0;
            case 16:
                return zzhi.zzd(obj, j11) != 0;
            case 17:
                return zzhi.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzQ(Object obj, int i, int i9, int i10, int i11) {
        return i9 == 1048575 ? zzP(obj, i) : (i10 & i11) != 0;
    }

    private static boolean zzR(Object obj, int i, zzgh zzghVar) {
        return zzghVar.zzk(zzhi.zzf(obj, i & 1048575));
    }

    private static boolean zzS(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzed) {
            return ((zzed) obj).zzX();
        }
        return true;
    }

    private final boolean zzT(Object obj, int i, int i9) {
        return zzhi.zzc(obj, (long) (zzv(i9) & 1048575)) == i;
    }

    private static boolean zzU(Object obj, long j10) {
        return ((Boolean) zzhi.zzf(obj, j10)).booleanValue();
    }

    private static final void zzV(int i, Object obj, zzhq zzhqVar) {
        if (obj instanceof String) {
            zzhqVar.zzG(i, (String) obj);
        } else {
            zzhqVar.zzd(i, (zzdb) obj);
        }
    }

    public static zzgz zzd(Object obj) {
        zzed zzedVar = (zzed) obj;
        zzgz zzgzVar = zzedVar.zzc;
        if (zzgzVar != zzgz.zzc()) {
            return zzgzVar;
        }
        zzgz zzf = zzgz.zzf();
        zzedVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfr zzl(java.lang.Class r32, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl r33, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfu r34, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfc r35, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy r36, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdp r37, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfj r38) {
        /*
            Method dump skipped, instructions count: 1015
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfr.zzl(java.lang.Class, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfu, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfc, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdp, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfj):com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfr");
    }

    private static double zzm(Object obj, long j10) {
        return ((Double) zzhi.zzf(obj, j10)).doubleValue();
    }

    private static float zzn(Object obj, long j10) {
        return ((Float) zzhi.zzf(obj, j10)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzo(Object obj) {
        int i;
        int zzn;
        int zzz;
        int zzt;
        boolean z10;
        int zzc;
        int zzz2;
        Unsafe unsafe = zzb;
        int i9 = 1048575;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < this.zzc.length) {
            int zzy = zzy(i11);
            int[] iArr = this.zzc;
            int i14 = iArr[i11];
            int zzx = zzx(zzy);
            if (zzx <= 17) {
                int i15 = iArr[i11 + 2];
                int i16 = i15 & i9;
                int i17 = i15 >>> 20;
                if (i16 != i10) {
                    i13 = unsafe.getInt(obj, i16);
                    i10 = i16;
                }
                i = 1 << i17;
            } else {
                i = 0;
            }
            long j10 = zzy & i9;
            switch (zzx) {
                case 0:
                    if ((i13 & i) != 0) {
                        i12 = a.z(i14 << 3, 8, i12);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i13 & i) != 0) {
                        i12 = a.z(i14 << 3, 4, i12);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i13 & i) != 0) {
                        i12 = a.z(i14 << 3, zzdj.zzz(unsafe.getLong(obj, j10)), i12);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i13 & i) != 0) {
                        i12 = a.z(i14 << 3, zzdj.zzz(unsafe.getLong(obj, j10)), i12);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i13 & i) != 0) {
                        i12 = a.z(i14 << 3, zzdj.zzu(unsafe.getInt(obj, j10)), i12);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i13 & i) != 0) {
                        i12 = a.z(i14 << 3, 8, i12);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i13 & i) != 0) {
                        i12 = a.z(i14 << 3, 4, i12);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i13 & i) != 0) {
                        i12 = a.z(i14 << 3, 1, i12);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i13 & i) != 0) {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof zzdb) {
                            int i18 = zzdj.zzb;
                            int zzd = ((zzdb) object).zzd();
                            i12 = a.z(i14 << 3, zzdj.zzy(zzd) + zzd, i12);
                            break;
                        } else {
                            i12 = a.z(i14 << 3, zzdj.zzx((String) object), i12);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if ((i13 & i) != 0) {
                        zzn = zzgj.zzn(i14, unsafe.getObject(obj, j10), zzB(i11));
                        i12 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i13 & i) != 0) {
                        zzdb zzdbVar = (zzdb) unsafe.getObject(obj, j10);
                        int i19 = zzdj.zzb;
                        int zzd2 = zzdbVar.zzd();
                        i12 = a.z(i14 << 3, zzdj.zzy(zzd2) + zzd2, i12);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i13 & i) != 0) {
                        i12 = a.z(i14 << 3, zzdj.zzy(unsafe.getInt(obj, j10)), i12);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i13 & i) != 0) {
                        i12 = a.z(i14 << 3, zzdj.zzu(unsafe.getInt(obj, j10)), i12);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i13 & i) != 0) {
                        i12 = a.z(i14 << 3, 4, i12);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i13 & i) != 0) {
                        i12 = a.z(i14 << 3, 8, i12);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i13 & i) != 0) {
                        int i20 = unsafe.getInt(obj, j10);
                        i12 = a.z((i20 >> 31) ^ (i20 + i20), zzdj.zzy(i14 << 3), i12);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i13 & i) != 0) {
                        long j11 = unsafe.getLong(obj, j10);
                        zzz = zzdj.zzz((j11 >> 63) ^ (j11 + j11)) + zzdj.zzy(i14 << 3);
                        i12 += zzz;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i13 & i) != 0) {
                        zzz = zzdj.zzt(i14, (zzfo) unsafe.getObject(obj, j10), zzB(i11));
                        i12 += zzz;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzn = zzgj.zzg(i14, (List) unsafe.getObject(obj, j10), false);
                    i12 += zzn;
                    break;
                case 19:
                    zzn = zzgj.zze(i14, (List) unsafe.getObject(obj, j10), false);
                    i12 += zzn;
                    break;
                case 20:
                    zzn = zzgj.zzl(i14, (List) unsafe.getObject(obj, j10), false);
                    i12 += zzn;
                    break;
                case 21:
                    zzn = zzgj.zzw(i14, (List) unsafe.getObject(obj, j10), false);
                    i12 += zzn;
                    break;
                case 22:
                    zzn = zzgj.zzj(i14, (List) unsafe.getObject(obj, j10), false);
                    i12 += zzn;
                    break;
                case 23:
                    zzn = zzgj.zzg(i14, (List) unsafe.getObject(obj, j10), false);
                    i12 += zzn;
                    break;
                case 24:
                    zzn = zzgj.zze(i14, (List) unsafe.getObject(obj, j10), false);
                    i12 += zzn;
                    break;
                case 25:
                    zzn = zzgj.zza(i14, (List) unsafe.getObject(obj, j10), false);
                    i12 += zzn;
                    break;
                case 26:
                    zzt = zzgj.zzt(i14, (List) unsafe.getObject(obj, j10));
                    i12 += zzt;
                    break;
                case 27:
                    zzt = zzgj.zzo(i14, (List) unsafe.getObject(obj, j10), zzB(i11));
                    i12 += zzt;
                    break;
                case 28:
                    zzt = zzgj.zzb(i14, (List) unsafe.getObject(obj, j10));
                    i12 += zzt;
                    break;
                case 29:
                    zzt = zzgj.zzu(i14, (List) unsafe.getObject(obj, j10), false);
                    i12 += zzt;
                    break;
                case 30:
                    z10 = false;
                    zzc = zzgj.zzc(i14, (List) unsafe.getObject(obj, j10), false);
                    i12 += zzc;
                    break;
                case 31:
                    z10 = false;
                    zzc = zzgj.zze(i14, (List) unsafe.getObject(obj, j10), false);
                    i12 += zzc;
                    break;
                case 32:
                    z10 = false;
                    zzc = zzgj.zzg(i14, (List) unsafe.getObject(obj, j10), false);
                    i12 += zzc;
                    break;
                case 33:
                    z10 = false;
                    zzc = zzgj.zzp(i14, (List) unsafe.getObject(obj, j10), false);
                    i12 += zzc;
                    break;
                case 34:
                    z10 = false;
                    zzc = zzgj.zzr(i14, (List) unsafe.getObject(obj, j10), false);
                    i12 += zzc;
                    break;
                case 35:
                    int zzh = zzgj.zzh((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        i12 = a.C(i14 << 3, zzdj.zzy(zzh), zzh, i12);
                    }
                    break;
                case 36:
                    int zzf = zzgj.zzf((List) unsafe.getObject(obj, j10));
                    if (zzf > 0) {
                        i12 = a.C(i14 << 3, zzdj.zzy(zzf), zzf, i12);
                    }
                    break;
                case 37:
                    int zzm = zzgj.zzm((List) unsafe.getObject(obj, j10));
                    if (zzm > 0) {
                        i12 = a.C(i14 << 3, zzdj.zzy(zzm), zzm, i12);
                    }
                    break;
                case 38:
                    int zzx2 = zzgj.zzx((List) unsafe.getObject(obj, j10));
                    if (zzx2 > 0) {
                        i12 = a.C(i14 << 3, zzdj.zzy(zzx2), zzx2, i12);
                    }
                    break;
                case 39:
                    int zzk = zzgj.zzk((List) unsafe.getObject(obj, j10));
                    if (zzk > 0) {
                        i12 = a.C(i14 << 3, zzdj.zzy(zzk), zzk, i12);
                    }
                    break;
                case 40:
                    int zzh2 = zzgj.zzh((List) unsafe.getObject(obj, j10));
                    if (zzh2 > 0) {
                        i12 = a.C(i14 << 3, zzdj.zzy(zzh2), zzh2, i12);
                    }
                    break;
                case 41:
                    int zzf2 = zzgj.zzf((List) unsafe.getObject(obj, j10));
                    if (zzf2 > 0) {
                        i12 = a.C(i14 << 3, zzdj.zzy(zzf2), zzf2, i12);
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i21 = zzgj.zza;
                    int size = list.size();
                    if (size > 0) {
                        i12 = a.C(i14 << 3, zzdj.zzy(size), size, i12);
                    }
                    break;
                case 43:
                    int zzv = zzgj.zzv((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        i12 = a.C(i14 << 3, zzdj.zzy(zzv), zzv, i12);
                    }
                    break;
                case 44:
                    int zzd3 = zzgj.zzd((List) unsafe.getObject(obj, j10));
                    if (zzd3 > 0) {
                        i12 = a.C(i14 << 3, zzdj.zzy(zzd3), zzd3, i12);
                    }
                    break;
                case 45:
                    int zzf3 = zzgj.zzf((List) unsafe.getObject(obj, j10));
                    if (zzf3 > 0) {
                        i12 = a.C(i14 << 3, zzdj.zzy(zzf3), zzf3, i12);
                    }
                    break;
                case 46:
                    int zzh3 = zzgj.zzh((List) unsafe.getObject(obj, j10));
                    if (zzh3 > 0) {
                        i12 = a.C(i14 << 3, zzdj.zzy(zzh3), zzh3, i12);
                    }
                    break;
                case 47:
                    int zzq = zzgj.zzq((List) unsafe.getObject(obj, j10));
                    if (zzq > 0) {
                        i12 = a.C(i14 << 3, zzdj.zzy(zzq), zzq, i12);
                    }
                    break;
                case 48:
                    int zzs = zzgj.zzs((List) unsafe.getObject(obj, j10));
                    if (zzs > 0) {
                        i12 = a.C(i14 << 3, zzdj.zzy(zzs), zzs, i12);
                    }
                    break;
                case 49:
                    zzt = zzgj.zzi(i14, (List) unsafe.getObject(obj, j10), zzB(i11));
                    i12 += zzt;
                    break;
                case 50:
                    zzfj.zza(i14, unsafe.getObject(obj, j10), zzC(i11));
                    break;
                case 51:
                    if (zzT(obj, i14, i11)) {
                        i12 = a.z(i14 << 3, 8, i12);
                    }
                    break;
                case 52:
                    if (zzT(obj, i14, i11)) {
                        i12 = a.z(i14 << 3, 4, i12);
                    }
                    break;
                case 53:
                    if (zzT(obj, i14, i11)) {
                        i12 = a.z(i14 << 3, zzdj.zzz(zzz(obj, j10)), i12);
                    }
                    break;
                case 54:
                    if (zzT(obj, i14, i11)) {
                        i12 = a.z(i14 << 3, zzdj.zzz(zzz(obj, j10)), i12);
                    }
                    break;
                case 55:
                    if (zzT(obj, i14, i11)) {
                        i12 = a.z(i14 << 3, zzdj.zzu(zzp(obj, j10)), i12);
                    }
                    break;
                case 56:
                    if (zzT(obj, i14, i11)) {
                        i12 = a.z(i14 << 3, 8, i12);
                    }
                    break;
                case 57:
                    if (zzT(obj, i14, i11)) {
                        i12 = a.z(i14 << 3, 4, i12);
                    }
                    break;
                case 58:
                    if (zzT(obj, i14, i11)) {
                        i12 = a.z(i14 << 3, 1, i12);
                    }
                    break;
                case 59:
                    if (zzT(obj, i14, i11)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzdb) {
                            int i22 = zzdj.zzb;
                            int zzd4 = ((zzdb) object2).zzd();
                            i12 = a.z(i14 << 3, zzdj.zzy(zzd4) + zzd4, i12);
                        } else {
                            i12 = a.z(i14 << 3, zzdj.zzx((String) object2), i12);
                        }
                    }
                    break;
                case 60:
                    if (zzT(obj, i14, i11)) {
                        zzt = zzgj.zzn(i14, unsafe.getObject(obj, j10), zzB(i11));
                        i12 += zzt;
                    }
                    break;
                case 61:
                    if (zzT(obj, i14, i11)) {
                        zzdb zzdbVar2 = (zzdb) unsafe.getObject(obj, j10);
                        int i23 = zzdj.zzb;
                        int zzd5 = zzdbVar2.zzd();
                        i12 = a.z(i14 << 3, zzdj.zzy(zzd5) + zzd5, i12);
                    }
                    break;
                case 62:
                    if (zzT(obj, i14, i11)) {
                        i12 = a.z(i14 << 3, zzdj.zzy(zzp(obj, j10)), i12);
                    }
                    break;
                case 63:
                    if (zzT(obj, i14, i11)) {
                        i12 = a.z(i14 << 3, zzdj.zzu(zzp(obj, j10)), i12);
                    }
                    break;
                case 64:
                    if (zzT(obj, i14, i11)) {
                        i12 = a.z(i14 << 3, 4, i12);
                    }
                    break;
                case 65:
                    if (zzT(obj, i14, i11)) {
                        i12 = a.z(i14 << 3, 8, i12);
                    }
                    break;
                case 66:
                    if (zzT(obj, i14, i11)) {
                        int zzp = zzp(obj, j10);
                        i12 = a.z((zzp >> 31) ^ (zzp + zzp), zzdj.zzy(i14 << 3), i12);
                    }
                    break;
                case 67:
                    if (zzT(obj, i14, i11)) {
                        long zzz3 = zzz(obj, j10);
                        zzz2 = zzdj.zzz((zzz3 >> 63) ^ (zzz3 + zzz3)) + zzdj.zzy(i14 << 3);
                        i12 += zzz2;
                    }
                    break;
                case 68:
                    if (zzT(obj, i14, i11)) {
                        zzz2 = zzdj.zzt(i14, (zzfo) unsafe.getObject(obj, j10), zzB(i11));
                        i12 += zzz2;
                    }
                    break;
            }
            i11 += 3;
            i9 = 1048575;
        }
        int i24 = 0;
        zzgy zzgyVar = this.zzn;
        int zza2 = i12 + zzgyVar.zza(zzgyVar.zzd(obj));
        if (!this.zzh) {
            return zza2;
        }
        zzdt zzb2 = this.zzo.zzb(obj);
        for (int i25 = 0; i25 < zzb2.zza.zzb(); i25++) {
            Map.Entry zzg = zzb2.zza.zzg(i25);
            i24 += zzdt.zza((zzds) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : zzb2.zza.zzc()) {
            i24 += zzdt.zza((zzds) entry.getKey(), entry.getValue());
        }
        return zza2 + i24;
    }

    private static int zzp(Object obj, long j10) {
        return ((Integer) zzhi.zzf(obj, j10)).intValue();
    }

    private final int zzq(Object obj, byte[] bArr, int i, int i9, int i10, long j10, zzco zzcoVar) {
        Unsafe unsafe = zzb;
        Object zzC = zzC(i10);
        Object object = unsafe.getObject(obj, j10);
        if (!((zzfi) object).zze()) {
            zzfi zzb2 = zzfi.zza().zzb();
            zzfj.zzb(zzb2, object);
            unsafe.putObject(obj, j10, zzb2);
        }
        throw null;
    }

    private final int zzr(Object obj, byte[] bArr, int i, int i9, int i10, int i11, int i12, int i13, int i14, long j10, int i15, zzco zzcoVar) {
        Unsafe unsafe = zzb;
        long j11 = this.zzc[i15 + 2] & 1048575;
        switch (i14) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(zzcp.zzq(bArr, i))));
                    int i16 = i + 8;
                    unsafe.putInt(obj, j11, i11);
                    return i16;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(zzcp.zzb(bArr, i))));
                    int i17 = i + 4;
                    unsafe.putInt(obj, j11, i11);
                    return i17;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int zzm = zzcp.zzm(bArr, i, zzcoVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zzcoVar.zzb));
                    unsafe.putInt(obj, j11, i11);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int zzj = zzcp.zzj(bArr, i, zzcoVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zzcoVar.zza));
                    unsafe.putInt(obj, j11, i11);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(zzcp.zzq(bArr, i)));
                    int i18 = i + 8;
                    unsafe.putInt(obj, j11, i11);
                    return i18;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(zzcp.zzb(bArr, i)));
                    int i19 = i + 4;
                    unsafe.putInt(obj, j11, i11);
                    return i19;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int zzm2 = zzcp.zzm(bArr, i, zzcoVar);
                    unsafe.putObject(obj, j10, Boolean.valueOf(zzcoVar.zzb != 0));
                    unsafe.putInt(obj, j11, i11);
                    return zzm2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int zzj2 = zzcp.zzj(bArr, i, zzcoVar);
                    int i20 = zzcoVar.zza;
                    if (i20 == 0) {
                        unsafe.putObject(obj, j10, "");
                    } else {
                        if ((i13 & PKIFailureInfo.duplicateCertReq) != 0 && !zzhn.zzh(bArr, zzj2, zzj2 + i20)) {
                            throw zzeo.zzc();
                        }
                        unsafe.putObject(obj, j10, new String(bArr, zzj2, i20, zzem.zzb));
                        zzj2 += i20;
                    }
                    unsafe.putInt(obj, j11, i11);
                    return zzj2;
                }
                break;
            case 60:
                if (i12 == 2) {
                    Object zzE = zzE(obj, i11, i15);
                    int zzo = zzcp.zzo(zzE, zzB(i15), bArr, i, i9, zzcoVar);
                    zzM(obj, i11, i15, zzE);
                    return zzo;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int zza2 = zzcp.zza(bArr, i, zzcoVar);
                    unsafe.putObject(obj, j10, zzcoVar.zzc);
                    unsafe.putInt(obj, j11, i11);
                    return zza2;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int zzj3 = zzcp.zzj(bArr, i, zzcoVar);
                    int i21 = zzcoVar.zza;
                    zzeh zzA = zzA(i15);
                    if (zzA == null || zzA.zza(i21)) {
                        unsafe.putObject(obj, j10, Integer.valueOf(i21));
                        unsafe.putInt(obj, j11, i11);
                    } else {
                        zzd(obj).zzj(i10, Long.valueOf(i21));
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int zzj4 = zzcp.zzj(bArr, i, zzcoVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zzdf.zzb(zzcoVar.zza)));
                    unsafe.putInt(obj, j11, i11);
                    return zzj4;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int zzm3 = zzcp.zzm(bArr, i, zzcoVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zzdf.zzc(zzcoVar.zzb)));
                    unsafe.putInt(obj, j11, i11);
                    return zzm3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    Object zzE2 = zzE(obj, i11, i15);
                    int zzn = zzcp.zzn(zzE2, zzB(i15), bArr, i, i9, (i10 & (-8)) | 4, zzcoVar);
                    zzM(obj, i11, i15, zzE2);
                    return zzn;
                }
                break;
        }
        return i;
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i9, int i10, int i11, int i12, int i13, long j10, int i14, long j11, zzco zzcoVar) {
        int i15;
        int i16;
        int i17;
        int i18;
        int zzl;
        int i19 = i;
        Unsafe unsafe = zzb;
        zzel zzelVar = (zzel) unsafe.getObject(obj, j11);
        if (!zzelVar.zzc()) {
            int size = zzelVar.size();
            zzelVar = zzelVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j11, zzelVar);
        }
        switch (i14) {
            case 18:
            case 35:
                if (i12 == 2) {
                    zzdl zzdlVar = (zzdl) zzelVar;
                    int zzj = zzcp.zzj(bArr, i19, zzcoVar);
                    int i20 = zzcoVar.zza + zzj;
                    while (zzj < i20) {
                        zzdlVar.zze(Double.longBitsToDouble(zzcp.zzq(bArr, zzj)));
                        zzj += 8;
                    }
                    if (zzj == i20) {
                        return zzj;
                    }
                    throw zzeo.zzg();
                }
                if (i12 == 1) {
                    zzdl zzdlVar2 = (zzdl) zzelVar;
                    zzdlVar2.zze(Double.longBitsToDouble(zzcp.zzq(bArr, i)));
                    while (true) {
                        i15 = i19 + 8;
                        if (i15 < i9) {
                            i19 = zzcp.zzj(bArr, i15, zzcoVar);
                            if (i10 == zzcoVar.zza) {
                                zzdlVar2.zze(Double.longBitsToDouble(zzcp.zzq(bArr, i19)));
                            }
                        }
                    }
                    return i15;
                }
                break;
            case 19:
            case 36:
                if (i12 == 2) {
                    zzdv zzdvVar = (zzdv) zzelVar;
                    int zzj2 = zzcp.zzj(bArr, i19, zzcoVar);
                    int i21 = zzcoVar.zza + zzj2;
                    while (zzj2 < i21) {
                        zzdvVar.zzg(Float.intBitsToFloat(zzcp.zzb(bArr, zzj2)));
                        zzj2 += 4;
                    }
                    if (zzj2 == i21) {
                        return zzj2;
                    }
                    throw zzeo.zzg();
                }
                if (i12 == 5) {
                    zzdv zzdvVar2 = (zzdv) zzelVar;
                    zzdvVar2.zzg(Float.intBitsToFloat(zzcp.zzb(bArr, i)));
                    while (true) {
                        i16 = i19 + 4;
                        if (i16 < i9) {
                            i19 = zzcp.zzj(bArr, i16, zzcoVar);
                            if (i10 == zzcoVar.zza) {
                                zzdvVar2.zzg(Float.intBitsToFloat(zzcp.zzb(bArr, i19)));
                            }
                        }
                    }
                    return i16;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i12 == 2) {
                    zzfd zzfdVar = (zzfd) zzelVar;
                    int zzj3 = zzcp.zzj(bArr, i19, zzcoVar);
                    int i22 = zzcoVar.zza + zzj3;
                    while (zzj3 < i22) {
                        zzj3 = zzcp.zzm(bArr, zzj3, zzcoVar);
                        zzfdVar.zzf(zzcoVar.zzb);
                    }
                    if (zzj3 == i22) {
                        return zzj3;
                    }
                    throw zzeo.zzg();
                }
                if (i12 == 0) {
                    zzfd zzfdVar2 = (zzfd) zzelVar;
                    int zzm = zzcp.zzm(bArr, i19, zzcoVar);
                    zzfdVar2.zzf(zzcoVar.zzb);
                    while (zzm < i9) {
                        int zzj4 = zzcp.zzj(bArr, zzm, zzcoVar);
                        if (i10 != zzcoVar.zza) {
                            return zzm;
                        }
                        zzm = zzcp.zzm(bArr, zzj4, zzcoVar);
                        zzfdVar2.zzf(zzcoVar.zzb);
                    }
                    return zzm;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i12 == 2) {
                    return zzcp.zzf(bArr, i19, zzelVar, zzcoVar);
                }
                if (i12 == 0) {
                    return zzcp.zzl(i10, bArr, i, i9, zzelVar, zzcoVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i12 == 2) {
                    zzfd zzfdVar3 = (zzfd) zzelVar;
                    int zzj5 = zzcp.zzj(bArr, i19, zzcoVar);
                    int i23 = zzcoVar.zza + zzj5;
                    while (zzj5 < i23) {
                        zzfdVar3.zzf(zzcp.zzq(bArr, zzj5));
                        zzj5 += 8;
                    }
                    if (zzj5 == i23) {
                        return zzj5;
                    }
                    throw zzeo.zzg();
                }
                if (i12 == 1) {
                    zzfd zzfdVar4 = (zzfd) zzelVar;
                    zzfdVar4.zzf(zzcp.zzq(bArr, i));
                    while (true) {
                        i17 = i19 + 8;
                        if (i17 < i9) {
                            i19 = zzcp.zzj(bArr, i17, zzcoVar);
                            if (i10 == zzcoVar.zza) {
                                zzfdVar4.zzf(zzcp.zzq(bArr, i19));
                            }
                        }
                    }
                    return i17;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i12 == 2) {
                    zzee zzeeVar = (zzee) zzelVar;
                    int zzj6 = zzcp.zzj(bArr, i19, zzcoVar);
                    int i24 = zzcoVar.zza + zzj6;
                    while (zzj6 < i24) {
                        zzeeVar.zzg(zzcp.zzb(bArr, zzj6));
                        zzj6 += 4;
                    }
                    if (zzj6 == i24) {
                        return zzj6;
                    }
                    throw zzeo.zzg();
                }
                if (i12 == 5) {
                    zzee zzeeVar2 = (zzee) zzelVar;
                    zzeeVar2.zzg(zzcp.zzb(bArr, i));
                    while (true) {
                        i18 = i19 + 4;
                        if (i18 < i9) {
                            i19 = zzcp.zzj(bArr, i18, zzcoVar);
                            if (i10 == zzcoVar.zza) {
                                zzeeVar2.zzg(zzcp.zzb(bArr, i19));
                            }
                        }
                    }
                    return i18;
                }
                break;
            case 25:
            case 42:
                if (i12 == 2) {
                    zzcq zzcqVar = (zzcq) zzelVar;
                    int zzj7 = zzcp.zzj(bArr, i19, zzcoVar);
                    int i25 = zzcoVar.zza + zzj7;
                    while (zzj7 < i25) {
                        zzj7 = zzcp.zzm(bArr, zzj7, zzcoVar);
                        zzcqVar.zze(zzcoVar.zzb != 0);
                    }
                    if (zzj7 == i25) {
                        return zzj7;
                    }
                    throw zzeo.zzg();
                }
                if (i12 == 0) {
                    zzcq zzcqVar2 = (zzcq) zzelVar;
                    int zzm2 = zzcp.zzm(bArr, i19, zzcoVar);
                    zzcqVar2.zze(zzcoVar.zzb != 0);
                    while (zzm2 < i9) {
                        int zzj8 = zzcp.zzj(bArr, zzm2, zzcoVar);
                        if (i10 != zzcoVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzcp.zzm(bArr, zzj8, zzcoVar);
                        zzcqVar2.zze(zzcoVar.zzb != 0);
                    }
                    return zzm2;
                }
                break;
            case 26:
                if (i12 == 2) {
                    if ((j10 & 536870912) == 0) {
                        int zzj9 = zzcp.zzj(bArr, i19, zzcoVar);
                        int i26 = zzcoVar.zza;
                        if (i26 < 0) {
                            throw zzeo.zzd();
                        }
                        if (i26 == 0) {
                            zzelVar.add("");
                        } else {
                            zzelVar.add(new String(bArr, zzj9, i26, zzem.zzb));
                            zzj9 += i26;
                        }
                        while (zzj9 < i9) {
                            int zzj10 = zzcp.zzj(bArr, zzj9, zzcoVar);
                            if (i10 != zzcoVar.zza) {
                                return zzj9;
                            }
                            zzj9 = zzcp.zzj(bArr, zzj10, zzcoVar);
                            int i27 = zzcoVar.zza;
                            if (i27 < 0) {
                                throw zzeo.zzd();
                            }
                            if (i27 == 0) {
                                zzelVar.add("");
                            } else {
                                zzelVar.add(new String(bArr, zzj9, i27, zzem.zzb));
                                zzj9 += i27;
                            }
                        }
                        return zzj9;
                    }
                    int zzj11 = zzcp.zzj(bArr, i19, zzcoVar);
                    int i28 = zzcoVar.zza;
                    if (i28 < 0) {
                        throw zzeo.zzd();
                    }
                    if (i28 == 0) {
                        zzelVar.add("");
                    } else {
                        int i29 = zzj11 + i28;
                        if (!zzhn.zzh(bArr, zzj11, i29)) {
                            throw zzeo.zzc();
                        }
                        zzelVar.add(new String(bArr, zzj11, i28, zzem.zzb));
                        zzj11 = i29;
                    }
                    while (zzj11 < i9) {
                        int zzj12 = zzcp.zzj(bArr, zzj11, zzcoVar);
                        if (i10 != zzcoVar.zza) {
                            return zzj11;
                        }
                        zzj11 = zzcp.zzj(bArr, zzj12, zzcoVar);
                        int i30 = zzcoVar.zza;
                        if (i30 < 0) {
                            throw zzeo.zzd();
                        }
                        if (i30 == 0) {
                            zzelVar.add("");
                        } else {
                            int i31 = zzj11 + i30;
                            if (!zzhn.zzh(bArr, zzj11, i31)) {
                                throw zzeo.zzc();
                            }
                            zzelVar.add(new String(bArr, zzj11, i30, zzem.zzb));
                            zzj11 = i31;
                        }
                    }
                    return zzj11;
                }
                break;
            case 27:
                if (i12 == 2) {
                    return zzcp.zze(zzB(i13), i10, bArr, i, i9, zzelVar, zzcoVar);
                }
                break;
            case 28:
                if (i12 == 2) {
                    int zzj13 = zzcp.zzj(bArr, i19, zzcoVar);
                    int i32 = zzcoVar.zza;
                    if (i32 < 0) {
                        throw zzeo.zzd();
                    }
                    if (i32 > bArr.length - zzj13) {
                        throw zzeo.zzg();
                    }
                    if (i32 == 0) {
                        zzelVar.add(zzdb.zzb);
                    } else {
                        zzelVar.add(zzdb.zzr(bArr, zzj13, i32));
                        zzj13 += i32;
                    }
                    while (zzj13 < i9) {
                        int zzj14 = zzcp.zzj(bArr, zzj13, zzcoVar);
                        if (i10 != zzcoVar.zza) {
                            return zzj13;
                        }
                        zzj13 = zzcp.zzj(bArr, zzj14, zzcoVar);
                        int i33 = zzcoVar.zza;
                        if (i33 < 0) {
                            throw zzeo.zzd();
                        }
                        if (i33 > bArr.length - zzj13) {
                            throw zzeo.zzg();
                        }
                        if (i33 == 0) {
                            zzelVar.add(zzdb.zzb);
                        } else {
                            zzelVar.add(zzdb.zzr(bArr, zzj13, i33));
                            zzj13 += i33;
                        }
                    }
                    return zzj13;
                }
                break;
            case 30:
            case 44:
                if (i12 == 2) {
                    zzl = zzcp.zzf(bArr, i19, zzelVar, zzcoVar);
                } else if (i12 == 0) {
                    zzl = zzcp.zzl(i10, bArr, i, i9, zzelVar, zzcoVar);
                }
                zzeh zzA = zzA(i13);
                zzgy zzgyVar = this.zzn;
                int i34 = zzgj.zza;
                if (zzA != null) {
                    Object obj2 = null;
                    if (zzelVar instanceof RandomAccess) {
                        int size2 = zzelVar.size();
                        int i35 = 0;
                        for (int i36 = 0; i36 < size2; i36++) {
                            Integer num = (Integer) zzelVar.get(i36);
                            int intValue = num.intValue();
                            if (zzA.zza(intValue)) {
                                if (i36 != i35) {
                                    zzelVar.set(i35, num);
                                }
                                i35++;
                            } else {
                                obj2 = zzgj.zzB(obj, i11, intValue, obj2, zzgyVar);
                            }
                        }
                        if (i35 != size2) {
                            zzelVar.subList(i35, size2).clear();
                            return zzl;
                        }
                    } else {
                        Iterator it = zzelVar.iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Integer) it.next()).intValue();
                            if (!zzA.zza(intValue2)) {
                                obj2 = zzgj.zzB(obj, i11, intValue2, obj2, zzgyVar);
                                it.remove();
                            }
                        }
                    }
                }
                return zzl;
            case 33:
            case 47:
                if (i12 == 2) {
                    zzee zzeeVar3 = (zzee) zzelVar;
                    int zzj15 = zzcp.zzj(bArr, i19, zzcoVar);
                    int i37 = zzcoVar.zza + zzj15;
                    while (zzj15 < i37) {
                        zzj15 = zzcp.zzj(bArr, zzj15, zzcoVar);
                        zzeeVar3.zzg(zzdf.zzb(zzcoVar.zza));
                    }
                    if (zzj15 == i37) {
                        return zzj15;
                    }
                    throw zzeo.zzg();
                }
                if (i12 == 0) {
                    zzee zzeeVar4 = (zzee) zzelVar;
                    int zzj16 = zzcp.zzj(bArr, i19, zzcoVar);
                    zzeeVar4.zzg(zzdf.zzb(zzcoVar.zza));
                    while (zzj16 < i9) {
                        int zzj17 = zzcp.zzj(bArr, zzj16, zzcoVar);
                        if (i10 != zzcoVar.zza) {
                            return zzj16;
                        }
                        zzj16 = zzcp.zzj(bArr, zzj17, zzcoVar);
                        zzeeVar4.zzg(zzdf.zzb(zzcoVar.zza));
                    }
                    return zzj16;
                }
                break;
            case 34:
            case 48:
                if (i12 == 2) {
                    zzfd zzfdVar5 = (zzfd) zzelVar;
                    int zzj18 = zzcp.zzj(bArr, i19, zzcoVar);
                    int i38 = zzcoVar.zza + zzj18;
                    while (zzj18 < i38) {
                        zzj18 = zzcp.zzm(bArr, zzj18, zzcoVar);
                        zzfdVar5.zzf(zzdf.zzc(zzcoVar.zzb));
                    }
                    if (zzj18 == i38) {
                        return zzj18;
                    }
                    throw zzeo.zzg();
                }
                if (i12 == 0) {
                    zzfd zzfdVar6 = (zzfd) zzelVar;
                    int zzm3 = zzcp.zzm(bArr, i19, zzcoVar);
                    zzfdVar6.zzf(zzdf.zzc(zzcoVar.zzb));
                    while (zzm3 < i9) {
                        int zzj19 = zzcp.zzj(bArr, zzm3, zzcoVar);
                        if (i10 != zzcoVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzcp.zzm(bArr, zzj19, zzcoVar);
                        zzfdVar6.zzf(zzdf.zzc(zzcoVar.zzb));
                    }
                    return zzm3;
                }
                break;
            default:
                if (i12 == 3) {
                    zzgh zzB = zzB(i13);
                    int i39 = (i10 & (-8)) | 4;
                    int zzc = zzcp.zzc(zzB, bArr, i, i9, i39, zzcoVar);
                    zzelVar.add(zzcoVar.zzc);
                    while (zzc < i9) {
                        int zzj20 = zzcp.zzj(bArr, zzc, zzcoVar);
                        if (i10 != zzcoVar.zza) {
                            return zzc;
                        }
                        zzc = zzcp.zzc(zzB, bArr, zzj20, i9, i39, zzcoVar);
                        zzelVar.add(zzcoVar.zzc);
                    }
                    return zzc;
                }
                break;
        }
        return i19;
    }

    private final int zzt(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzw(i, 0);
    }

    private final int zzu(int i, int i9) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzw(i, i9);
    }

    private final int zzv(int i) {
        return this.zzc[i + 2];
    }

    private final int zzw(int i, int i9) {
        int length = (this.zzc.length / 3) - 1;
        while (i9 <= length) {
            int i10 = (length + i9) >>> 1;
            int i11 = i10 * 3;
            int i12 = this.zzc[i11];
            if (i == i12) {
                return i11;
            }
            if (i < i12) {
                length = i10 - 1;
            } else {
                i9 = i10 + 1;
            }
        }
        return -1;
    }

    private static int zzx(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzy(int i) {
        return this.zzc[i + 1];
    }

    private static long zzz(Object obj, long j10) {
        return ((Long) zzhi.zzf(obj, j10)).longValue();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh
    public final int zza(Object obj) {
        int zzn;
        int zzy;
        int zzz;
        int zzt;
        if (!this.zzi) {
            return zzo(obj);
        }
        Unsafe unsafe = zzb;
        int i = 0;
        for (int i9 = 0; i9 < this.zzc.length; i9 += 3) {
            int zzy2 = zzy(i9);
            int zzx = zzx(zzy2);
            int i10 = this.zzc[i9];
            int i11 = zzy2 & 1048575;
            if (zzx >= zzdu.zzJ.zza() && zzx <= zzdu.zzW.zza()) {
                int i12 = this.zzc[i9 + 2];
            }
            long j10 = i11;
            switch (zzx) {
                case 0:
                    if (zzP(obj, i9)) {
                        i = a.z(i10 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzP(obj, i9)) {
                        i = a.z(i10 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzP(obj, i9)) {
                        i = a.z(i10 << 3, zzdj.zzz(zzhi.zzd(obj, j10)), i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzP(obj, i9)) {
                        i = a.z(i10 << 3, zzdj.zzz(zzhi.zzd(obj, j10)), i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzP(obj, i9)) {
                        i = a.z(i10 << 3, zzdj.zzu(zzhi.zzc(obj, j10)), i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzP(obj, i9)) {
                        i = a.z(i10 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzP(obj, i9)) {
                        i = a.z(i10 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzP(obj, i9)) {
                        i = a.z(i10 << 3, 1, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzP(obj, i9)) {
                        Object zzf = zzhi.zzf(obj, j10);
                        if (zzf instanceof zzdb) {
                            int i13 = i10 << 3;
                            int i14 = zzdj.zzb;
                            int zzd = ((zzdb) zzf).zzd();
                            i = a.z(i13, zzdj.zzy(zzd) + zzd, i);
                            break;
                        } else {
                            i = a.z(i10 << 3, zzdj.zzx((String) zzf), i);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzP(obj, i9)) {
                        zzn = zzgj.zzn(i10, zzhi.zzf(obj, j10), zzB(i9));
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzP(obj, i9)) {
                        zzdb zzdbVar = (zzdb) zzhi.zzf(obj, j10);
                        int i15 = i10 << 3;
                        int i16 = zzdj.zzb;
                        int zzd2 = zzdbVar.zzd();
                        i = a.z(i15, zzdj.zzy(zzd2) + zzd2, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzP(obj, i9)) {
                        i = a.z(i10 << 3, zzdj.zzy(zzhi.zzc(obj, j10)), i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzP(obj, i9)) {
                        i = a.z(i10 << 3, zzdj.zzu(zzhi.zzc(obj, j10)), i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzP(obj, i9)) {
                        i = a.z(i10 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzP(obj, i9)) {
                        i = a.z(i10 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzP(obj, i9)) {
                        int zzc = zzhi.zzc(obj, j10);
                        i = a.z((zzc >> 31) ^ (zzc + zzc), zzdj.zzy(i10 << 3), i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzP(obj, i9)) {
                        long zzd3 = zzhi.zzd(obj, j10);
                        zzy = zzdj.zzy(i10 << 3);
                        zzz = zzdj.zzz((zzd3 >> 63) ^ (zzd3 + zzd3));
                        zzt = zzz + zzy;
                        i += zzt;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzP(obj, i9)) {
                        zzt = zzdj.zzt(i10, (zzfo) zzhi.zzf(obj, j10), zzB(i9));
                        i += zzt;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzn = zzgj.zzg(i10, (List) zzhi.zzf(obj, j10), false);
                    i += zzn;
                    break;
                case 19:
                    zzn = zzgj.zze(i10, (List) zzhi.zzf(obj, j10), false);
                    i += zzn;
                    break;
                case 20:
                    zzn = zzgj.zzl(i10, (List) zzhi.zzf(obj, j10), false);
                    i += zzn;
                    break;
                case 21:
                    zzn = zzgj.zzw(i10, (List) zzhi.zzf(obj, j10), false);
                    i += zzn;
                    break;
                case 22:
                    zzn = zzgj.zzj(i10, (List) zzhi.zzf(obj, j10), false);
                    i += zzn;
                    break;
                case 23:
                    zzn = zzgj.zzg(i10, (List) zzhi.zzf(obj, j10), false);
                    i += zzn;
                    break;
                case 24:
                    zzn = zzgj.zze(i10, (List) zzhi.zzf(obj, j10), false);
                    i += zzn;
                    break;
                case 25:
                    zzn = zzgj.zza(i10, (List) zzhi.zzf(obj, j10), false);
                    i += zzn;
                    break;
                case 26:
                    zzn = zzgj.zzt(i10, (List) zzhi.zzf(obj, j10));
                    i += zzn;
                    break;
                case 27:
                    zzn = zzgj.zzo(i10, (List) zzhi.zzf(obj, j10), zzB(i9));
                    i += zzn;
                    break;
                case 28:
                    zzn = zzgj.zzb(i10, (List) zzhi.zzf(obj, j10));
                    i += zzn;
                    break;
                case 29:
                    zzn = zzgj.zzu(i10, (List) zzhi.zzf(obj, j10), false);
                    i += zzn;
                    break;
                case 30:
                    zzn = zzgj.zzc(i10, (List) zzhi.zzf(obj, j10), false);
                    i += zzn;
                    break;
                case 31:
                    zzn = zzgj.zze(i10, (List) zzhi.zzf(obj, j10), false);
                    i += zzn;
                    break;
                case 32:
                    zzn = zzgj.zzg(i10, (List) zzhi.zzf(obj, j10), false);
                    i += zzn;
                    break;
                case 33:
                    zzn = zzgj.zzp(i10, (List) zzhi.zzf(obj, j10), false);
                    i += zzn;
                    break;
                case 34:
                    zzn = zzgj.zzr(i10, (List) zzhi.zzf(obj, j10), false);
                    i += zzn;
                    break;
                case 35:
                    int zzh = zzgj.zzh((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        i = a.C(i10 << 3, zzdj.zzy(zzh), zzh, i);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int zzf2 = zzgj.zzf((List) unsafe.getObject(obj, j10));
                    if (zzf2 > 0) {
                        i = a.C(i10 << 3, zzdj.zzy(zzf2), zzf2, i);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int zzm = zzgj.zzm((List) unsafe.getObject(obj, j10));
                    if (zzm > 0) {
                        i = a.C(i10 << 3, zzdj.zzy(zzm), zzm, i);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int zzx2 = zzgj.zzx((List) unsafe.getObject(obj, j10));
                    if (zzx2 > 0) {
                        i = a.C(i10 << 3, zzdj.zzy(zzx2), zzx2, i);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int zzk = zzgj.zzk((List) unsafe.getObject(obj, j10));
                    if (zzk > 0) {
                        i = a.C(i10 << 3, zzdj.zzy(zzk), zzk, i);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int zzh2 = zzgj.zzh((List) unsafe.getObject(obj, j10));
                    if (zzh2 > 0) {
                        i = a.C(i10 << 3, zzdj.zzy(zzh2), zzh2, i);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int zzf3 = zzgj.zzf((List) unsafe.getObject(obj, j10));
                    if (zzf3 > 0) {
                        i = a.C(i10 << 3, zzdj.zzy(zzf3), zzf3, i);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i17 = zzgj.zza;
                    int size = list.size();
                    if (size > 0) {
                        i = a.C(i10 << 3, zzdj.zzy(size), size, i);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int zzv = zzgj.zzv((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        i = a.C(i10 << 3, zzdj.zzy(zzv), zzv, i);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int zzd4 = zzgj.zzd((List) unsafe.getObject(obj, j10));
                    if (zzd4 > 0) {
                        i = a.C(i10 << 3, zzdj.zzy(zzd4), zzd4, i);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int zzf4 = zzgj.zzf((List) unsafe.getObject(obj, j10));
                    if (zzf4 > 0) {
                        i = a.C(i10 << 3, zzdj.zzy(zzf4), zzf4, i);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int zzh3 = zzgj.zzh((List) unsafe.getObject(obj, j10));
                    if (zzh3 > 0) {
                        i = a.C(i10 << 3, zzdj.zzy(zzh3), zzh3, i);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int zzq = zzgj.zzq((List) unsafe.getObject(obj, j10));
                    if (zzq > 0) {
                        i = a.C(i10 << 3, zzdj.zzy(zzq), zzq, i);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int zzs = zzgj.zzs((List) unsafe.getObject(obj, j10));
                    if (zzs > 0) {
                        i = a.C(i10 << 3, zzdj.zzy(zzs), zzs, i);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzn = zzgj.zzi(i10, (List) zzhi.zzf(obj, j10), zzB(i9));
                    i += zzn;
                    break;
                case 50:
                    zzfj.zza(i10, zzhi.zzf(obj, j10), zzC(i9));
                    break;
                case 51:
                    if (zzT(obj, i10, i9)) {
                        i = a.z(i10 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i10, i9)) {
                        i = a.z(i10 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i10, i9)) {
                        i = a.z(i10 << 3, zzdj.zzz(zzz(obj, j10)), i);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i10, i9)) {
                        i = a.z(i10 << 3, zzdj.zzz(zzz(obj, j10)), i);
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(obj, i10, i9)) {
                        i = a.z(i10 << 3, zzdj.zzu(zzp(obj, j10)), i);
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(obj, i10, i9)) {
                        i = a.z(i10 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(obj, i10, i9)) {
                        i = a.z(i10 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(obj, i10, i9)) {
                        i = a.z(i10 << 3, 1, i);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(obj, i10, i9)) {
                        Object zzf5 = zzhi.zzf(obj, j10);
                        if (zzf5 instanceof zzdb) {
                            int i18 = i10 << 3;
                            int i19 = zzdj.zzb;
                            int zzd5 = ((zzdb) zzf5).zzd();
                            i = a.z(i18, zzdj.zzy(zzd5) + zzd5, i);
                            break;
                        } else {
                            i = a.z(i10 << 3, zzdj.zzx((String) zzf5), i);
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i10, i9)) {
                        zzn = zzgj.zzn(i10, zzhi.zzf(obj, j10), zzB(i9));
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i10, i9)) {
                        zzdb zzdbVar2 = (zzdb) zzhi.zzf(obj, j10);
                        int i20 = i10 << 3;
                        int i21 = zzdj.zzb;
                        int zzd6 = zzdbVar2.zzd();
                        i = a.z(i20, zzdj.zzy(zzd6) + zzd6, i);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i10, i9)) {
                        i = a.z(i10 << 3, zzdj.zzy(zzp(obj, j10)), i);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(obj, i10, i9)) {
                        i = a.z(i10 << 3, zzdj.zzu(zzp(obj, j10)), i);
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i10, i9)) {
                        i = a.z(i10 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i10, i9)) {
                        i = a.z(i10 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i10, i9)) {
                        int zzp = zzp(obj, j10);
                        i = a.z((zzp >> 31) ^ (zzp + zzp), zzdj.zzy(i10 << 3), i);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(obj, i10, i9)) {
                        long zzz2 = zzz(obj, j10);
                        zzy = zzdj.zzy(i10 << 3);
                        zzz = zzdj.zzz((zzz2 >> 63) ^ (zzz2 + zzz2));
                        zzt = zzz + zzy;
                        i += zzt;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i10, i9)) {
                        zzt = zzdj.zzt(i10, (zzfo) zzhi.zzf(obj, j10), zzB(i9));
                        i += zzt;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzgy zzgyVar = this.zzn;
        return i + zzgyVar.zza(zzgyVar.zzd(obj));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int i9;
        int floatToIntBits;
        int zzc;
        int length = this.zzc.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int zzy = zzy(i11);
            int i12 = this.zzc[i11];
            long j10 = 1048575 & zzy;
            int i13 = 37;
            switch (zzx(zzy)) {
                case 0:
                    i = i10 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzhi.zza(obj, j10));
                    byte[] bArr = zzem.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i + zzc;
                    break;
                case 1:
                    i9 = i10 * 53;
                    floatToIntBits = Float.floatToIntBits(zzhi.zzb(obj, j10));
                    i10 = floatToIntBits + i9;
                    break;
                case 2:
                    i = i10 * 53;
                    doubleToLongBits = zzhi.zzd(obj, j10);
                    byte[] bArr2 = zzem.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i + zzc;
                    break;
                case 3:
                    i = i10 * 53;
                    doubleToLongBits = zzhi.zzd(obj, j10);
                    byte[] bArr3 = zzem.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i + zzc;
                    break;
                case 4:
                    i = i10 * 53;
                    zzc = zzhi.zzc(obj, j10);
                    i10 = i + zzc;
                    break;
                case 5:
                    i = i10 * 53;
                    doubleToLongBits = zzhi.zzd(obj, j10);
                    byte[] bArr4 = zzem.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i + zzc;
                    break;
                case 6:
                    i = i10 * 53;
                    zzc = zzhi.zzc(obj, j10);
                    i10 = i + zzc;
                    break;
                case 7:
                    i9 = i10 * 53;
                    floatToIntBits = zzem.zza(zzhi.zzw(obj, j10));
                    i10 = floatToIntBits + i9;
                    break;
                case 8:
                    i9 = i10 * 53;
                    floatToIntBits = ((String) zzhi.zzf(obj, j10)).hashCode();
                    i10 = floatToIntBits + i9;
                    break;
                case 9:
                    Object zzf = zzhi.zzf(obj, j10);
                    if (zzf != null) {
                        i13 = zzf.hashCode();
                    }
                    i10 = (i10 * 53) + i13;
                    break;
                case 10:
                    i9 = i10 * 53;
                    floatToIntBits = zzhi.zzf(obj, j10).hashCode();
                    i10 = floatToIntBits + i9;
                    break;
                case 11:
                    i = i10 * 53;
                    zzc = zzhi.zzc(obj, j10);
                    i10 = i + zzc;
                    break;
                case 12:
                    i = i10 * 53;
                    zzc = zzhi.zzc(obj, j10);
                    i10 = i + zzc;
                    break;
                case 13:
                    i = i10 * 53;
                    zzc = zzhi.zzc(obj, j10);
                    i10 = i + zzc;
                    break;
                case 14:
                    i = i10 * 53;
                    doubleToLongBits = zzhi.zzd(obj, j10);
                    byte[] bArr5 = zzem.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i + zzc;
                    break;
                case 15:
                    i = i10 * 53;
                    zzc = zzhi.zzc(obj, j10);
                    i10 = i + zzc;
                    break;
                case 16:
                    i = i10 * 53;
                    doubleToLongBits = zzhi.zzd(obj, j10);
                    byte[] bArr6 = zzem.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i + zzc;
                    break;
                case 17:
                    Object zzf2 = zzhi.zzf(obj, j10);
                    if (zzf2 != null) {
                        i13 = zzf2.hashCode();
                    }
                    i10 = (i10 * 53) + i13;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i9 = i10 * 53;
                    floatToIntBits = zzhi.zzf(obj, j10).hashCode();
                    i10 = floatToIntBits + i9;
                    break;
                case 50:
                    i9 = i10 * 53;
                    floatToIntBits = zzhi.zzf(obj, j10).hashCode();
                    i10 = floatToIntBits + i9;
                    break;
                case 51:
                    if (zzT(obj, i12, i11)) {
                        i = i10 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j10));
                        byte[] bArr7 = zzem.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j10));
                        i10 = floatToIntBits + i9;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i12, i11)) {
                        i = i10 * 53;
                        doubleToLongBits = zzz(obj, j10);
                        byte[] bArr8 = zzem.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i12, i11)) {
                        i = i10 * 53;
                        doubleToLongBits = zzz(obj, j10);
                        byte[] bArr9 = zzem.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(obj, i12, i11)) {
                        i = i10 * 53;
                        zzc = zzp(obj, j10);
                        i10 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(obj, i12, i11)) {
                        i = i10 * 53;
                        doubleToLongBits = zzz(obj, j10);
                        byte[] bArr10 = zzem.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(obj, i12, i11)) {
                        i = i10 * 53;
                        zzc = zzp(obj, j10);
                        i10 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = zzem.zza(zzU(obj, j10));
                        i10 = floatToIntBits + i9;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = ((String) zzhi.zzf(obj, j10)).hashCode();
                        i10 = floatToIntBits + i9;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = zzhi.zzf(obj, j10).hashCode();
                        i10 = floatToIntBits + i9;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = zzhi.zzf(obj, j10).hashCode();
                        i10 = floatToIntBits + i9;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i12, i11)) {
                        i = i10 * 53;
                        zzc = zzp(obj, j10);
                        i10 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(obj, i12, i11)) {
                        i = i10 * 53;
                        zzc = zzp(obj, j10);
                        i10 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i12, i11)) {
                        i = i10 * 53;
                        zzc = zzp(obj, j10);
                        i10 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i12, i11)) {
                        i = i10 * 53;
                        doubleToLongBits = zzz(obj, j10);
                        byte[] bArr11 = zzem.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i12, i11)) {
                        i = i10 * 53;
                        zzc = zzp(obj, j10);
                        i10 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(obj, i12, i11)) {
                        i = i10 * 53;
                        doubleToLongBits = zzz(obj, j10);
                        byte[] bArr12 = zzem.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = zzhi.zzf(obj, j10).hashCode();
                        i10 = floatToIntBits + i9;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzn.zzd(obj).hashCode() + (i10 * 53);
        return this.zzh ? (hashCode * 53) + this.zzo.zzb(obj).zza.hashCode() : hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0510, code lost:
    
        if (r6 == r1) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0512, code lost:
    
        r30.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0518, code lost:
    
        r2 = r9.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x051c, code lost:
    
        if (r2 >= r9.zzl) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x051e, code lost:
    
        r4 = r9.zzj[r2];
        r5 = r9.zzc[r4];
        r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhi.zzf(r12, r9.zzy(r4) & r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0530, code lost:
    
        if (r5 != null) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0537, code lost:
    
        if (r9.zzA(r4) != null) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x053c, code lost:
    
        r5 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfi) r5;
        r0 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfh) r9.zzC(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0544, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0539, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0545, code lost:
    
        if (r7 != 0) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0549, code lost:
    
        if (r0 != r35) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0550, code lost:
    
        throw com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0557, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0553, code lost:
    
        if (r0 > r35) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0555, code lost:
    
        if (r3 != r7) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x055c, code lost:
    
        throw com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco r37) {
        /*
            Method dump skipped, instructions count: 1452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfr.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco):int");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh
    public final Object zze() {
        return ((zzed) this.zzg).zzJ();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh
    public final void zzf(Object obj) {
        if (zzS(obj)) {
            if (obj instanceof zzed) {
                zzed zzedVar = (zzed) obj;
                zzedVar.zzV(Integer.MAX_VALUE);
                zzedVar.zzb = 0;
                zzedVar.zzT();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzy = zzy(i);
                int i9 = 1048575 & zzy;
                int zzx = zzx(zzy);
                long j10 = i9;
                if (zzx != 9) {
                    if (zzx != 60 && zzx != 68) {
                        switch (zzx) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.zzm.zza(obj, j10);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzfi) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzT(obj, this.zzc[i], i)) {
                        zzB(i).zzf(zzb.getObject(obj, j10));
                    }
                }
                if (zzP(obj, i)) {
                    zzB(i).zzf(zzb.getObject(obj, j10));
                }
            }
            this.zzn.zzg(obj);
            if (this.zzh) {
                this.zzo.zze(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh
    public final void zzg(Object obj, Object obj2) {
        zzG(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzy = zzy(i);
            int i9 = this.zzc[i];
            long j10 = 1048575 & zzy;
            switch (zzx(zzy)) {
                case 0:
                    if (zzP(obj2, i)) {
                        zzhi.zzo(obj, j10, zzhi.zza(obj2, j10));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzP(obj2, i)) {
                        zzhi.zzp(obj, j10, zzhi.zzb(obj2, j10));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzP(obj2, i)) {
                        zzhi.zzr(obj, j10, zzhi.zzd(obj2, j10));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzP(obj2, i)) {
                        zzhi.zzr(obj, j10, zzhi.zzd(obj2, j10));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzP(obj2, i)) {
                        zzhi.zzq(obj, j10, zzhi.zzc(obj2, j10));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzP(obj2, i)) {
                        zzhi.zzr(obj, j10, zzhi.zzd(obj2, j10));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzP(obj2, i)) {
                        zzhi.zzq(obj, j10, zzhi.zzc(obj2, j10));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzP(obj2, i)) {
                        zzhi.zzm(obj, j10, zzhi.zzw(obj2, j10));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzP(obj2, i)) {
                        zzhi.zzs(obj, j10, zzhi.zzf(obj2, j10));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i);
                    break;
                case 10:
                    if (zzP(obj2, i)) {
                        zzhi.zzs(obj, j10, zzhi.zzf(obj2, j10));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzP(obj2, i)) {
                        zzhi.zzq(obj, j10, zzhi.zzc(obj2, j10));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzP(obj2, i)) {
                        zzhi.zzq(obj, j10, zzhi.zzc(obj2, j10));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzP(obj2, i)) {
                        zzhi.zzq(obj, j10, zzhi.zzc(obj2, j10));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzP(obj2, i)) {
                        zzhi.zzr(obj, j10, zzhi.zzd(obj2, j10));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzP(obj2, i)) {
                        zzhi.zzq(obj, j10, zzhi.zzc(obj2, j10));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzP(obj2, i)) {
                        zzhi.zzr(obj, j10, zzhi.zzd(obj2, j10));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzm.zzb(obj, obj2, j10);
                    break;
                case 50:
                    int i10 = zzgj.zza;
                    zzhi.zzs(obj, j10, zzfj.zzb(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzT(obj2, i9, i)) {
                        zzhi.zzs(obj, j10, zzhi.zzf(obj2, j10));
                        zzK(obj, i9, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzI(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzT(obj2, i9, i)) {
                        zzhi.zzs(obj, j10, zzhi.zzf(obj2, j10));
                        zzK(obj, i9, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i);
                    break;
            }
        }
        zzgj.zzD(this.zzn, obj, obj2);
        if (this.zzh) {
            zzgj.zzC(this.zzo, obj, obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x02e7, code lost:
    
        if (r0 != r24) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02e9, code lost:
    
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r15;
        r10 = r18;
        r1 = r23;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0301, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0331, code lost:
    
        if (r0 != r14) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0350, code lost:
    
        if (r0 != r14) goto L103;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x0095. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco r35) {
        /*
            Method dump skipped, instructions count: 966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfr.zzh(java.lang.Object, byte[], int, int, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x09e7  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(java.lang.Object r18, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq r19) {
        /*
            Method dump skipped, instructions count: 2850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfr.zzi(java.lang.Object, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzX;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzy = zzy(i);
            long j10 = zzy & 1048575;
            switch (zzx(zzy)) {
                case 0:
                    if (zzO(obj, obj2, i) && Double.doubleToLongBits(zzhi.zza(obj, j10)) == Double.doubleToLongBits(zzhi.zza(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzO(obj, obj2, i) && Float.floatToIntBits(zzhi.zzb(obj, j10)) == Float.floatToIntBits(zzhi.zzb(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzO(obj, obj2, i) && zzhi.zzd(obj, j10) == zzhi.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzO(obj, obj2, i) && zzhi.zzd(obj, j10) == zzhi.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzO(obj, obj2, i) && zzhi.zzc(obj, j10) == zzhi.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzO(obj, obj2, i) && zzhi.zzd(obj, j10) == zzhi.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzO(obj, obj2, i) && zzhi.zzc(obj, j10) == zzhi.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzO(obj, obj2, i) && zzhi.zzw(obj, j10) == zzhi.zzw(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzO(obj, obj2, i) && zzgj.zzX(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzO(obj, obj2, i) && zzgj.zzX(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzO(obj, obj2, i) && zzgj.zzX(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzO(obj, obj2, i) && zzhi.zzc(obj, j10) == zzhi.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzO(obj, obj2, i) && zzhi.zzc(obj, j10) == zzhi.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzO(obj, obj2, i) && zzhi.zzc(obj, j10) == zzhi.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzO(obj, obj2, i) && zzhi.zzd(obj, j10) == zzhi.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzO(obj, obj2, i) && zzhi.zzc(obj, j10) == zzhi.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzO(obj, obj2, i) && zzhi.zzd(obj, j10) == zzhi.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzO(obj, obj2, i) && zzgj.zzX(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzX = zzgj.zzX(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10));
                    break;
                case 50:
                    zzX = zzgj.zzX(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzv = zzv(i) & 1048575;
                    if (zzhi.zzc(obj, zzv) == zzhi.zzc(obj2, zzv) && zzgj.zzX(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzX) {
                return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzo.zzb(obj).equals(this.zzo.zzb(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh
    public final boolean zzk(Object obj) {
        int i;
        int i9;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        while (i11 < this.zzk) {
            int i13 = this.zzj[i11];
            int i14 = this.zzc[i13];
            int zzy = zzy(i13);
            int i15 = this.zzc[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i12) {
                if (i16 != 1048575) {
                    i10 = zzb.getInt(obj, i16);
                }
                i9 = i10;
                i = i16;
            } else {
                i = i12;
                i9 = i10;
            }
            if ((268435456 & zzy) != 0 && !zzQ(obj, i13, i, i9, i17)) {
                return false;
            }
            int zzx = zzx(zzy);
            if (zzx != 9 && zzx != 17) {
                if (zzx != 27) {
                    if (zzx == 60 || zzx == 68) {
                        if (zzT(obj, i14, i13) && !zzR(obj, zzy, zzB(i13))) {
                            return false;
                        }
                    } else if (zzx != 49) {
                        if (zzx == 50 && !((zzfi) zzhi.zzf(obj, zzy & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzhi.zzf(obj, zzy & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgh zzB = zzB(i13);
                    for (int i18 = 0; i18 < list.size(); i18++) {
                        if (!zzB.zzk(list.get(i18))) {
                            return false;
                        }
                    }
                }
            } else if (zzQ(obj, i13, i, i9, i17) && !zzR(obj, zzy, zzB(i13))) {
                return false;
            }
            i11++;
            i12 = i;
            i10 = i9;
        }
        return !this.zzh || this.zzo.zzb(obj).zzk();
    }
}
