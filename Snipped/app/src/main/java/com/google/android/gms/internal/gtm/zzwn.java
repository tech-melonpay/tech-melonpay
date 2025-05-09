package com.google.android.gms.internal.gtm;

import com.google.android.gms.measurement.internal.a;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zzwn<T> implements zzwx<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzxy.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzwk zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzvy zzn;
    private final zzxo<?, ?> zzo;
    private final zzuk<?> zzp;
    private final zzwq zzq;
    private final zzwf zzr;

    /* JADX WARN: Multi-variable type inference failed */
    private zzwn(int[] iArr, int[] iArr2, Object[] objArr, int i, int i9, zzwk zzwkVar, boolean z10, boolean z11, int[] iArr3, int i10, int i11, zzwq zzwqVar, zzvy zzvyVar, zzxo<?, ?> zzxoVar, zzuk<?> zzukVar, zzwf zzwfVar) {
        this.zzc = iArr;
        this.zzd = iArr2;
        this.zze = objArr;
        this.zzf = i;
        this.zzi = i9 instanceof zzuz;
        this.zzj = zzwkVar;
        boolean z12 = false;
        if (zzxoVar != 0 && zzxoVar.zzi(i9)) {
            z12 = true;
        }
        this.zzh = z12;
        this.zzk = z11;
        this.zzl = iArr3;
        this.zzm = i10;
        this.zzq = i11;
        this.zzn = zzwqVar;
        this.zzo = zzvyVar;
        this.zzp = zzxoVar;
        this.zzg = i9;
        this.zzr = zzukVar;
    }

    private final int zzA(int i, int i9) {
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

    private static int zzB(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzC(int i) {
        return this.zzc[i + 1];
    }

    private static <T> long zzD(T t3, long j10) {
        return ((Long) zzxy.zzf(t3, j10)).longValue();
    }

    private final zzvd zzE(int i) {
        int i9 = i / 3;
        return (zzvd) this.zzd[i9 + i9 + 1];
    }

    private final zzwx zzF(int i) {
        int i9 = i / 3;
        int i10 = i9 + i9;
        zzwx zzwxVar = (zzwx) this.zzd[i10];
        if (zzwxVar != null) {
            return zzwxVar;
        }
        zzwx<T> zzb2 = zzwt.zza().zzb((Class) this.zzd[i10 + 1]);
        this.zzd[i10] = zzb2;
        return zzb2;
    }

    private final <UT, UB> UB zzG(Object obj, int i, UB ub, zzxo<UT, UB> zzxoVar) {
        int i9 = this.zzc[i];
        Object zzf = zzxy.zzf(obj, zzC(i) & 1048575);
        if (zzf == null) {
            return ub;
        }
        if (zzE(i) == null) {
            return ub;
        }
        throw null;
    }

    private final Object zzH(int i) {
        int i9 = i / 3;
        return this.zzd[i9 + i9];
    }

    private static Field zzI(Class<?> cls, String str) {
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
            StringBuilder sb2 = new StringBuilder(a.u(String.valueOf(str).length(), 40, name.length(), String.valueOf(arrays).length()));
            androidx.camera.core.impl.utils.a.u(sb2, "Field ", str, " for ", name);
            throw new RuntimeException(androidx.camera.core.impl.utils.a.n(sb2, " not found. Known fields are ", arrays));
        }
    }

    private final void zzJ(T t3, T t10, int i) {
        long zzC = zzC(i) & 1048575;
        if (zzQ(t10, i)) {
            Object zzf = zzxy.zzf(t3, zzC);
            Object zzf2 = zzxy.zzf(t10, zzC);
            if (zzf != null && zzf2 != null) {
                zzxy.zzs(t3, zzC, zzvi.zzg(zzf, zzf2));
                zzM(t3, i);
            } else if (zzf2 != null) {
                zzxy.zzs(t3, zzC, zzf2);
                zzM(t3, i);
            }
        }
    }

    private final void zzK(T t3, T t10, int i) {
        int zzC = zzC(i);
        int i9 = this.zzc[i];
        long j10 = zzC & 1048575;
        if (zzT(t10, i9, i)) {
            Object zzf = zzT(t3, i9, i) ? zzxy.zzf(t3, j10) : null;
            Object zzf2 = zzxy.zzf(t10, j10);
            if (zzf != null && zzf2 != null) {
                zzxy.zzs(t3, j10, zzvi.zzg(zzf, zzf2));
                zzN(t3, i9, i);
            } else if (zzf2 != null) {
                zzxy.zzs(t3, j10, zzf2);
                zzN(t3, i9, i);
            }
        }
    }

    private final void zzL(Object obj, int i, zzww zzwwVar) {
        if (zzP(i)) {
            zzxy.zzs(obj, i & 1048575, zzwwVar.zzx());
        } else if (this.zzi) {
            zzxy.zzs(obj, i & 1048575, zzwwVar.zzv());
        } else {
            zzxy.zzs(obj, i & 1048575, zzwwVar.zzq());
        }
    }

    private final void zzM(T t3, int i) {
        int zzz = zzz(i);
        long j10 = 1048575 & zzz;
        if (j10 == 1048575) {
            return;
        }
        zzxy.zzq(t3, j10, (1 << (zzz >>> 20)) | zzxy.zzc(t3, j10));
    }

    private final void zzN(T t3, int i, int i9) {
        zzxy.zzq(t3, zzz(i9) & 1048575, i);
    }

    private final boolean zzO(T t3, T t10, int i) {
        return zzQ(t3, i) == zzQ(t10, i);
    }

    private static boolean zzP(int i) {
        return (i & PKIFailureInfo.duplicateCertReq) != 0;
    }

    private final boolean zzQ(T t3, int i) {
        int zzz = zzz(i);
        long j10 = zzz & 1048575;
        if (j10 != 1048575) {
            return (zzxy.zzc(t3, j10) & (1 << (zzz >>> 20))) != 0;
        }
        int zzC = zzC(i);
        long j11 = zzC & 1048575;
        switch (zzB(zzC)) {
            case 0:
                return zzxy.zza(t3, j11) != 0.0d;
            case 1:
                return zzxy.zzb(t3, j11) != 0.0f;
            case 2:
                return zzxy.zzd(t3, j11) != 0;
            case 3:
                return zzxy.zzd(t3, j11) != 0;
            case 4:
                return zzxy.zzc(t3, j11) != 0;
            case 5:
                return zzxy.zzd(t3, j11) != 0;
            case 6:
                return zzxy.zzc(t3, j11) != 0;
            case 7:
                return zzxy.zzw(t3, j11);
            case 8:
                Object zzf = zzxy.zzf(t3, j11);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zztd) {
                    return !zztd.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzxy.zzf(t3, j11) != null;
            case 10:
                return !zztd.zzb.equals(zzxy.zzf(t3, j11));
            case 11:
                return zzxy.zzc(t3, j11) != 0;
            case 12:
                return zzxy.zzc(t3, j11) != 0;
            case 13:
                return zzxy.zzc(t3, j11) != 0;
            case 14:
                return zzxy.zzd(t3, j11) != 0;
            case 15:
                return zzxy.zzc(t3, j11) != 0;
            case 16:
                return zzxy.zzd(t3, j11) != 0;
            case 17:
                return zzxy.zzf(t3, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzR(T t3, int i, int i9, int i10, int i11) {
        return i9 == 1048575 ? zzQ(t3, i) : (i10 & i11) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zzS(Object obj, int i, zzwx zzwxVar) {
        return zzwxVar.zzk(zzxy.zzf(obj, i & 1048575));
    }

    private final boolean zzT(T t3, int i, int i9) {
        return zzxy.zzc(t3, (long) (zzz(i9) & 1048575)) == i;
    }

    private static <T> boolean zzU(T t3, long j10) {
        return ((Boolean) zzxy.zzf(t3, j10)).booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:224:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzV(T r18, com.google.android.gms.internal.gtm.zztp r19) {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzwn.zzV(java.lang.Object, com.google.android.gms.internal.gtm.zztp):void");
    }

    private final <K, V> void zzW(zztp zztpVar, int i, Object obj, int i9) {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private static final void zzX(int i, Object obj, zztp zztpVar) {
        if (obj instanceof String) {
            zztpVar.zzG(i, (String) obj);
        } else {
            zztpVar.zzd(i, (zztd) obj);
        }
    }

    public static zzxp zzd(Object obj) {
        zzuz zzuzVar = (zzuz) obj;
        zzxp zzxpVar = zzuzVar.zzc;
        if (zzxpVar != zzxp.zzc()) {
            return zzxpVar;
        }
        zzxp zze = zzxp.zze();
        zzuzVar.zzc = zze;
        return zze;
    }

    public static <T> zzwn<T> zzl(Class<T> cls, zzwh zzwhVar, zzwq zzwqVar, zzvy zzvyVar, zzxo<?, ?> zzxoVar, zzuk<?> zzukVar, zzwf zzwfVar) {
        if (zzwhVar instanceof zzwv) {
            return zzm((zzwv) zzwhVar, zzwqVar, zzvyVar, zzxoVar, zzukVar, zzwfVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.google.android.gms.internal.gtm.zzwn<T> zzm(com.google.android.gms.internal.gtm.zzwv r34, com.google.android.gms.internal.gtm.zzwq r35, com.google.android.gms.internal.gtm.zzvy r36, com.google.android.gms.internal.gtm.zzxo<?, ?> r37, com.google.android.gms.internal.gtm.zzuk<?> r38, com.google.android.gms.internal.gtm.zzwf r39) {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzwn.zzm(com.google.android.gms.internal.gtm.zzwv, com.google.android.gms.internal.gtm.zzwq, com.google.android.gms.internal.gtm.zzvy, com.google.android.gms.internal.gtm.zzxo, com.google.android.gms.internal.gtm.zzuk, com.google.android.gms.internal.gtm.zzwf):com.google.android.gms.internal.gtm.zzwn");
    }

    private static <T> double zzo(T t3, long j10) {
        return ((Double) zzxy.zzf(t3, j10)).doubleValue();
    }

    private static <T> float zzp(T t3, long j10) {
        return ((Float) zzxy.zzf(t3, j10)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzq(T t3) {
        int i;
        int zzD;
        int zzE;
        int i9;
        int zzD2;
        int zzx;
        int zzo;
        int zzu;
        boolean z10;
        int zzd;
        int zzD3;
        int zzE2;
        int i10;
        int zzD4;
        int zzx2;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < this.zzc.length) {
            int zzC = zzC(i13);
            int i16 = this.zzc[i13];
            int zzB = zzB(zzC);
            if (zzB <= 17) {
                int i17 = this.zzc[i13 + 2];
                int i18 = i17 & i11;
                i = 1 << (i17 >>> 20);
                if (i18 != i12) {
                    i15 = unsafe.getInt(t3, i18);
                    i12 = i18;
                }
            } else {
                i = 0;
            }
            long j10 = zzC & i11;
            switch (zzB) {
                case 0:
                    if ((i15 & i) != 0) {
                        i14 = androidx.camera.core.impl.utils.a.a(i16 << 3, 8, i14);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i15 & i) != 0) {
                        i14 = androidx.camera.core.impl.utils.a.a(i16 << 3, 4, i14);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i15 & i) != 0) {
                        long j11 = unsafe.getLong(t3, j10);
                        zzD = zzto.zzD(i16 << 3);
                        zzE = zzto.zzE(j11);
                        i9 = zzE + zzD;
                        i14 += i9;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i15 & i) != 0) {
                        long j12 = unsafe.getLong(t3, j10);
                        zzD = zzto.zzD(i16 << 3);
                        zzE = zzto.zzE(j12);
                        i9 = zzE + zzD;
                        i14 += i9;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i15 & i) != 0) {
                        int i19 = unsafe.getInt(t3, j10);
                        zzD2 = zzto.zzD(i16 << 3);
                        zzx = zzto.zzx(i19);
                        i9 = zzx + zzD2;
                        i14 += i9;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i15 & i) != 0) {
                        i14 = androidx.camera.core.impl.utils.a.a(i16 << 3, 8, i14);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i15 & i) != 0) {
                        i14 = androidx.camera.core.impl.utils.a.a(i16 << 3, 4, i14);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i15 & i) != 0) {
                        i14 = androidx.camera.core.impl.utils.a.a(i16 << 3, 1, i14);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i15 & i) != 0) {
                        Object object = unsafe.getObject(t3, j10);
                        if (object instanceof zztd) {
                            int zzD5 = zzto.zzD(i16 << 3);
                            int zzd2 = ((zztd) object).zzd();
                            i14 = androidx.camera.core.impl.utils.a.w(zzd2, zzd2, zzD5, i14);
                            break;
                        } else {
                            zzD2 = zzto.zzD(i16 << 3);
                            zzx = zzto.zzB((String) object);
                            i9 = zzx + zzD2;
                            i14 += i9;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if ((i15 & i) != 0) {
                        zzo = zzwz.zzo(i16, unsafe.getObject(t3, j10), zzF(i13));
                        i14 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i15 & i) != 0) {
                        zztd zztdVar = (zztd) unsafe.getObject(t3, j10);
                        int zzD6 = zzto.zzD(i16 << 3);
                        int zzd3 = zztdVar.zzd();
                        i14 = androidx.camera.core.impl.utils.a.w(zzd3, zzd3, zzD6, i14);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i15 & i) != 0) {
                        i14 = androidx.camera.core.impl.utils.a.a(unsafe.getInt(t3, j10), zzto.zzD(i16 << 3), i14);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i15 & i) != 0) {
                        int i20 = unsafe.getInt(t3, j10);
                        zzD2 = zzto.zzD(i16 << 3);
                        zzx = zzto.zzx(i20);
                        i9 = zzx + zzD2;
                        i14 += i9;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i15 & i) != 0) {
                        i14 = androidx.camera.core.impl.utils.a.a(i16 << 3, 4, i14);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i15 & i) != 0) {
                        i14 = androidx.camera.core.impl.utils.a.a(i16 << 3, 8, i14);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i15 & i) != 0) {
                        int i21 = unsafe.getInt(t3, j10);
                        i14 = androidx.camera.core.impl.utils.a.a((i21 >> 31) ^ (i21 + i21), zzto.zzD(i16 << 3), i14);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i15 & i) != 0) {
                        long j13 = unsafe.getLong(t3, j10);
                        i9 = zzto.zzE((j13 >> 63) ^ (j13 + j13)) + zzto.zzD(i16 << 3);
                        i14 += i9;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i15 & i) != 0) {
                        i9 = zzto.zzv(i16, (zzwk) unsafe.getObject(t3, j10), zzF(i13));
                        i14 += i9;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzwz.zzh(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzo;
                    break;
                case 19:
                    zzo = zzwz.zzf(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzo;
                    break;
                case 20:
                    zzo = zzwz.zzm(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzo;
                    break;
                case 21:
                    zzo = zzwz.zzx(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzo;
                    break;
                case 22:
                    zzo = zzwz.zzk(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzo;
                    break;
                case 23:
                    zzo = zzwz.zzh(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzo;
                    break;
                case 24:
                    zzo = zzwz.zzf(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzo;
                    break;
                case 25:
                    zzo = zzwz.zza(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzo;
                    break;
                case 26:
                    zzu = zzwz.zzu(i16, (List) unsafe.getObject(t3, j10));
                    i14 += zzu;
                    break;
                case 27:
                    zzu = zzwz.zzp(i16, (List) unsafe.getObject(t3, j10), zzF(i13));
                    i14 += zzu;
                    break;
                case 28:
                    zzu = zzwz.zzc(i16, (List) unsafe.getObject(t3, j10));
                    i14 += zzu;
                    break;
                case 29:
                    zzu = zzwz.zzv(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzu;
                    break;
                case 30:
                    z10 = false;
                    zzd = zzwz.zzd(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzd;
                    break;
                case 31:
                    z10 = false;
                    zzd = zzwz.zzf(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzd;
                    break;
                case 32:
                    z10 = false;
                    zzd = zzwz.zzh(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzd;
                    break;
                case 33:
                    z10 = false;
                    zzd = zzwz.zzq(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzd;
                    break;
                case 34:
                    z10 = false;
                    zzd = zzwz.zzs(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzd;
                    break;
                case 35:
                    int zzi = zzwz.zzi((List) unsafe.getObject(t3, j10));
                    if (zzi > 0) {
                        i14 = androidx.camera.core.impl.utils.a.w(zzi, zzto.zzC(i16), zzi, i14);
                    }
                    break;
                case 36:
                    int zzg = zzwz.zzg((List) unsafe.getObject(t3, j10));
                    if (zzg > 0) {
                        i14 = androidx.camera.core.impl.utils.a.w(zzg, zzto.zzC(i16), zzg, i14);
                    }
                    break;
                case 37:
                    int zzn = zzwz.zzn((List) unsafe.getObject(t3, j10));
                    if (zzn > 0) {
                        i14 = androidx.camera.core.impl.utils.a.w(zzn, zzto.zzC(i16), zzn, i14);
                    }
                    break;
                case 38:
                    int zzy = zzwz.zzy((List) unsafe.getObject(t3, j10));
                    if (zzy > 0) {
                        i14 = androidx.camera.core.impl.utils.a.w(zzy, zzto.zzC(i16), zzy, i14);
                    }
                    break;
                case 39:
                    int zzl = zzwz.zzl((List) unsafe.getObject(t3, j10));
                    if (zzl > 0) {
                        i14 = androidx.camera.core.impl.utils.a.w(zzl, zzto.zzC(i16), zzl, i14);
                    }
                    break;
                case 40:
                    int zzi2 = zzwz.zzi((List) unsafe.getObject(t3, j10));
                    if (zzi2 > 0) {
                        i14 = androidx.camera.core.impl.utils.a.w(zzi2, zzto.zzC(i16), zzi2, i14);
                    }
                    break;
                case 41:
                    int zzg2 = zzwz.zzg((List) unsafe.getObject(t3, j10));
                    if (zzg2 > 0) {
                        i14 = androidx.camera.core.impl.utils.a.w(zzg2, zzto.zzC(i16), zzg2, i14);
                    }
                    break;
                case 42:
                    int zzb2 = zzwz.zzb((List) unsafe.getObject(t3, j10));
                    if (zzb2 > 0) {
                        i14 = androidx.camera.core.impl.utils.a.w(zzb2, zzto.zzC(i16), zzb2, i14);
                    }
                    break;
                case 43:
                    int zzw = zzwz.zzw((List) unsafe.getObject(t3, j10));
                    if (zzw > 0) {
                        i14 = androidx.camera.core.impl.utils.a.w(zzw, zzto.zzC(i16), zzw, i14);
                    }
                    break;
                case 44:
                    int zze = zzwz.zze((List) unsafe.getObject(t3, j10));
                    if (zze > 0) {
                        i14 = androidx.camera.core.impl.utils.a.w(zze, zzto.zzC(i16), zze, i14);
                    }
                    break;
                case 45:
                    int zzg3 = zzwz.zzg((List) unsafe.getObject(t3, j10));
                    if (zzg3 > 0) {
                        i14 = androidx.camera.core.impl.utils.a.w(zzg3, zzto.zzC(i16), zzg3, i14);
                    }
                    break;
                case 46:
                    int zzi3 = zzwz.zzi((List) unsafe.getObject(t3, j10));
                    if (zzi3 > 0) {
                        i14 = androidx.camera.core.impl.utils.a.w(zzi3, zzto.zzC(i16), zzi3, i14);
                    }
                    break;
                case 47:
                    int zzr = zzwz.zzr((List) unsafe.getObject(t3, j10));
                    if (zzr > 0) {
                        i14 = androidx.camera.core.impl.utils.a.w(zzr, zzto.zzC(i16), zzr, i14);
                    }
                    break;
                case 48:
                    int zzt = zzwz.zzt((List) unsafe.getObject(t3, j10));
                    if (zzt > 0) {
                        i14 = androidx.camera.core.impl.utils.a.w(zzt, zzto.zzC(i16), zzt, i14);
                    }
                    break;
                case 49:
                    zzu = zzwz.zzj(i16, (List) unsafe.getObject(t3, j10), zzF(i13));
                    i14 += zzu;
                    break;
                case 50:
                    zzwf.zza(i16, unsafe.getObject(t3, j10), zzH(i13));
                    break;
                case 51:
                    if (zzT(t3, i16, i13)) {
                        i14 = androidx.camera.core.impl.utils.a.a(i16 << 3, 8, i14);
                    }
                    break;
                case 52:
                    if (zzT(t3, i16, i13)) {
                        i14 = androidx.camera.core.impl.utils.a.a(i16 << 3, 4, i14);
                    }
                    break;
                case 53:
                    if (zzT(t3, i16, i13)) {
                        long zzD7 = zzD(t3, j10);
                        zzD3 = zzto.zzD(i16 << 3);
                        zzE2 = zzto.zzE(zzD7);
                        i10 = zzE2 + zzD3;
                        i14 += i10;
                    }
                    break;
                case 54:
                    if (zzT(t3, i16, i13)) {
                        long zzD8 = zzD(t3, j10);
                        zzD3 = zzto.zzD(i16 << 3);
                        zzE2 = zzto.zzE(zzD8);
                        i10 = zzE2 + zzD3;
                        i14 += i10;
                    }
                    break;
                case 55:
                    if (zzT(t3, i16, i13)) {
                        int zzs = zzs(t3, j10);
                        zzD4 = zzto.zzD(i16 << 3);
                        zzx2 = zzto.zzx(zzs);
                        i10 = zzx2 + zzD4;
                        i14 += i10;
                    }
                    break;
                case 56:
                    if (zzT(t3, i16, i13)) {
                        i14 = androidx.camera.core.impl.utils.a.a(i16 << 3, 8, i14);
                    }
                    break;
                case 57:
                    if (zzT(t3, i16, i13)) {
                        i14 = androidx.camera.core.impl.utils.a.a(i16 << 3, 4, i14);
                    }
                    break;
                case 58:
                    if (zzT(t3, i16, i13)) {
                        i14 = androidx.camera.core.impl.utils.a.a(i16 << 3, 1, i14);
                    }
                    break;
                case 59:
                    if (zzT(t3, i16, i13)) {
                        Object object2 = unsafe.getObject(t3, j10);
                        if (object2 instanceof zztd) {
                            int zzD9 = zzto.zzD(i16 << 3);
                            int zzd4 = ((zztd) object2).zzd();
                            i14 = androidx.camera.core.impl.utils.a.w(zzd4, zzd4, zzD9, i14);
                        } else {
                            zzD4 = zzto.zzD(i16 << 3);
                            zzx2 = zzto.zzB((String) object2);
                            i10 = zzx2 + zzD4;
                            i14 += i10;
                        }
                    }
                    break;
                case 60:
                    if (zzT(t3, i16, i13)) {
                        zzu = zzwz.zzo(i16, unsafe.getObject(t3, j10), zzF(i13));
                        i14 += zzu;
                    }
                    break;
                case 61:
                    if (zzT(t3, i16, i13)) {
                        zztd zztdVar2 = (zztd) unsafe.getObject(t3, j10);
                        int zzD10 = zzto.zzD(i16 << 3);
                        int zzd5 = zztdVar2.zzd();
                        i14 = androidx.camera.core.impl.utils.a.w(zzd5, zzd5, zzD10, i14);
                    }
                    break;
                case 62:
                    if (zzT(t3, i16, i13)) {
                        i14 = androidx.camera.core.impl.utils.a.a(zzs(t3, j10), zzto.zzD(i16 << 3), i14);
                    }
                    break;
                case 63:
                    if (zzT(t3, i16, i13)) {
                        int zzs2 = zzs(t3, j10);
                        zzD4 = zzto.zzD(i16 << 3);
                        zzx2 = zzto.zzx(zzs2);
                        i10 = zzx2 + zzD4;
                        i14 += i10;
                    }
                    break;
                case 64:
                    if (zzT(t3, i16, i13)) {
                        i14 = androidx.camera.core.impl.utils.a.a(i16 << 3, 4, i14);
                    }
                    break;
                case 65:
                    if (zzT(t3, i16, i13)) {
                        i14 = androidx.camera.core.impl.utils.a.a(i16 << 3, 8, i14);
                    }
                    break;
                case 66:
                    if (zzT(t3, i16, i13)) {
                        int zzs3 = zzs(t3, j10);
                        i14 = androidx.camera.core.impl.utils.a.a((zzs3 >> 31) ^ (zzs3 + zzs3), zzto.zzD(i16 << 3), i14);
                    }
                    break;
                case 67:
                    if (zzT(t3, i16, i13)) {
                        long zzD11 = zzD(t3, j10);
                        i10 = zzto.zzE((zzD11 >> 63) ^ (zzD11 + zzD11)) + zzto.zzD(i16 << 3);
                        i14 += i10;
                    }
                    break;
                case 68:
                    if (zzT(t3, i16, i13)) {
                        i10 = zzto.zzv(i16, (zzwk) unsafe.getObject(t3, j10), zzF(i13));
                        i14 += i10;
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        int i22 = 0;
        zzxo<?, ?> zzxoVar = this.zzo;
        int zza2 = i14 + zzxoVar.zza(zzxoVar.zzd(t3));
        if (!this.zzh) {
            return zza2;
        }
        zzuo<?> zzb3 = this.zzp.zzb(t3);
        for (int i23 = 0; i23 < zzb3.zza.zzb(); i23++) {
            Map.Entry<?, Object> zzg4 = zzb3.zza.zzg(i23);
            i22 += zzuo.zza((zzun) zzg4.getKey(), zzg4.getValue());
        }
        for (Map.Entry<?, Object> entry : zzb3.zza.zzc()) {
            i22 += zzuo.zza((zzun) entry.getKey(), entry.getValue());
        }
        return zza2 + i22;
    }

    private final int zzr(T t3) {
        int zzD;
        int zzE;
        int zzD2;
        int zzx;
        int zzo;
        int zzv;
        Unsafe unsafe = zzb;
        int i = 0;
        for (int i9 = 0; i9 < this.zzc.length; i9 += 3) {
            int zzC = zzC(i9);
            int zzB = zzB(zzC);
            int i10 = this.zzc[i9];
            long j10 = zzC & 1048575;
            if (zzB >= zzup.zzJ.zza() && zzB <= zzup.zzW.zza()) {
                int i11 = this.zzc[i9 + 2];
            }
            switch (zzB) {
                case 0:
                    if (zzQ(t3, i9)) {
                        i = androidx.camera.core.impl.utils.a.a(i10 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzQ(t3, i9)) {
                        i = androidx.camera.core.impl.utils.a.a(i10 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzQ(t3, i9)) {
                        long zzd = zzxy.zzd(t3, j10);
                        zzD = zzto.zzD(i10 << 3);
                        zzE = zzto.zzE(zzd);
                        zzv = zzE + zzD;
                        i += zzv;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzQ(t3, i9)) {
                        long zzd2 = zzxy.zzd(t3, j10);
                        zzD = zzto.zzD(i10 << 3);
                        zzE = zzto.zzE(zzd2);
                        zzv = zzE + zzD;
                        i += zzv;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzQ(t3, i9)) {
                        int zzc = zzxy.zzc(t3, j10);
                        zzD2 = zzto.zzD(i10 << 3);
                        zzx = zzto.zzx(zzc);
                        zzv = zzx + zzD2;
                        i += zzv;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzQ(t3, i9)) {
                        i = androidx.camera.core.impl.utils.a.a(i10 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzQ(t3, i9)) {
                        i = androidx.camera.core.impl.utils.a.a(i10 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzQ(t3, i9)) {
                        i = androidx.camera.core.impl.utils.a.a(i10 << 3, 1, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzQ(t3, i9)) {
                        Object zzf = zzxy.zzf(t3, j10);
                        if (zzf instanceof zztd) {
                            int zzD3 = zzto.zzD(i10 << 3);
                            int zzd3 = ((zztd) zzf).zzd();
                            i = androidx.camera.core.impl.utils.a.w(zzd3, zzd3, zzD3, i);
                            break;
                        } else {
                            zzD2 = zzto.zzD(i10 << 3);
                            zzx = zzto.zzB((String) zzf);
                            zzv = zzx + zzD2;
                            i += zzv;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzQ(t3, i9)) {
                        zzo = zzwz.zzo(i10, zzxy.zzf(t3, j10), zzF(i9));
                        i += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzQ(t3, i9)) {
                        zztd zztdVar = (zztd) zzxy.zzf(t3, j10);
                        int zzD4 = zzto.zzD(i10 << 3);
                        int zzd4 = zztdVar.zzd();
                        i = androidx.camera.core.impl.utils.a.w(zzd4, zzd4, zzD4, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzQ(t3, i9)) {
                        i = androidx.camera.core.impl.utils.a.a(zzxy.zzc(t3, j10), zzto.zzD(i10 << 3), i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzQ(t3, i9)) {
                        int zzc2 = zzxy.zzc(t3, j10);
                        zzD2 = zzto.zzD(i10 << 3);
                        zzx = zzto.zzx(zzc2);
                        zzv = zzx + zzD2;
                        i += zzv;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzQ(t3, i9)) {
                        i = androidx.camera.core.impl.utils.a.a(i10 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzQ(t3, i9)) {
                        i = androidx.camera.core.impl.utils.a.a(i10 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzQ(t3, i9)) {
                        int zzc3 = zzxy.zzc(t3, j10);
                        i = androidx.camera.core.impl.utils.a.a((zzc3 >> 31) ^ (zzc3 + zzc3), zzto.zzD(i10 << 3), i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzQ(t3, i9)) {
                        long zzd5 = zzxy.zzd(t3, j10);
                        zzD = zzto.zzD(i10 << 3);
                        zzE = zzto.zzE((zzd5 >> 63) ^ (zzd5 + zzd5));
                        zzv = zzE + zzD;
                        i += zzv;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzQ(t3, i9)) {
                        zzv = zzto.zzv(i10, (zzwk) zzxy.zzf(t3, j10), zzF(i9));
                        i += zzv;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzwz.zzh(i10, (List) zzxy.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 19:
                    zzo = zzwz.zzf(i10, (List) zzxy.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 20:
                    zzo = zzwz.zzm(i10, (List) zzxy.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 21:
                    zzo = zzwz.zzx(i10, (List) zzxy.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 22:
                    zzo = zzwz.zzk(i10, (List) zzxy.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 23:
                    zzo = zzwz.zzh(i10, (List) zzxy.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 24:
                    zzo = zzwz.zzf(i10, (List) zzxy.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 25:
                    zzo = zzwz.zza(i10, (List) zzxy.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 26:
                    zzo = zzwz.zzu(i10, (List) zzxy.zzf(t3, j10));
                    i += zzo;
                    break;
                case 27:
                    zzo = zzwz.zzp(i10, (List) zzxy.zzf(t3, j10), zzF(i9));
                    i += zzo;
                    break;
                case 28:
                    zzo = zzwz.zzc(i10, (List) zzxy.zzf(t3, j10));
                    i += zzo;
                    break;
                case 29:
                    zzo = zzwz.zzv(i10, (List) zzxy.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 30:
                    zzo = zzwz.zzd(i10, (List) zzxy.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 31:
                    zzo = zzwz.zzf(i10, (List) zzxy.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 32:
                    zzo = zzwz.zzh(i10, (List) zzxy.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 33:
                    zzo = zzwz.zzq(i10, (List) zzxy.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 34:
                    zzo = zzwz.zzs(i10, (List) zzxy.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 35:
                    int zzi = zzwz.zzi((List) unsafe.getObject(t3, j10));
                    if (zzi > 0) {
                        i = androidx.camera.core.impl.utils.a.w(zzi, zzto.zzC(i10), zzi, i);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int zzg = zzwz.zzg((List) unsafe.getObject(t3, j10));
                    if (zzg > 0) {
                        i = androidx.camera.core.impl.utils.a.w(zzg, zzto.zzC(i10), zzg, i);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int zzn = zzwz.zzn((List) unsafe.getObject(t3, j10));
                    if (zzn > 0) {
                        i = androidx.camera.core.impl.utils.a.w(zzn, zzto.zzC(i10), zzn, i);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int zzy = zzwz.zzy((List) unsafe.getObject(t3, j10));
                    if (zzy > 0) {
                        i = androidx.camera.core.impl.utils.a.w(zzy, zzto.zzC(i10), zzy, i);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int zzl = zzwz.zzl((List) unsafe.getObject(t3, j10));
                    if (zzl > 0) {
                        i = androidx.camera.core.impl.utils.a.w(zzl, zzto.zzC(i10), zzl, i);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int zzi2 = zzwz.zzi((List) unsafe.getObject(t3, j10));
                    if (zzi2 > 0) {
                        i = androidx.camera.core.impl.utils.a.w(zzi2, zzto.zzC(i10), zzi2, i);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int zzg2 = zzwz.zzg((List) unsafe.getObject(t3, j10));
                    if (zzg2 > 0) {
                        i = androidx.camera.core.impl.utils.a.w(zzg2, zzto.zzC(i10), zzg2, i);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int zzb2 = zzwz.zzb((List) unsafe.getObject(t3, j10));
                    if (zzb2 > 0) {
                        i = androidx.camera.core.impl.utils.a.w(zzb2, zzto.zzC(i10), zzb2, i);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int zzw = zzwz.zzw((List) unsafe.getObject(t3, j10));
                    if (zzw > 0) {
                        i = androidx.camera.core.impl.utils.a.w(zzw, zzto.zzC(i10), zzw, i);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int zze = zzwz.zze((List) unsafe.getObject(t3, j10));
                    if (zze > 0) {
                        i = androidx.camera.core.impl.utils.a.w(zze, zzto.zzC(i10), zze, i);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int zzg3 = zzwz.zzg((List) unsafe.getObject(t3, j10));
                    if (zzg3 > 0) {
                        i = androidx.camera.core.impl.utils.a.w(zzg3, zzto.zzC(i10), zzg3, i);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int zzi3 = zzwz.zzi((List) unsafe.getObject(t3, j10));
                    if (zzi3 > 0) {
                        i = androidx.camera.core.impl.utils.a.w(zzi3, zzto.zzC(i10), zzi3, i);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int zzr = zzwz.zzr((List) unsafe.getObject(t3, j10));
                    if (zzr > 0) {
                        i = androidx.camera.core.impl.utils.a.w(zzr, zzto.zzC(i10), zzr, i);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int zzt = zzwz.zzt((List) unsafe.getObject(t3, j10));
                    if (zzt > 0) {
                        i = androidx.camera.core.impl.utils.a.w(zzt, zzto.zzC(i10), zzt, i);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo = zzwz.zzj(i10, (List) zzxy.zzf(t3, j10), zzF(i9));
                    i += zzo;
                    break;
                case 50:
                    zzwf.zza(i10, zzxy.zzf(t3, j10), zzH(i9));
                    break;
                case 51:
                    if (zzT(t3, i10, i9)) {
                        i = androidx.camera.core.impl.utils.a.a(i10 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(t3, i10, i9)) {
                        i = androidx.camera.core.impl.utils.a.a(i10 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(t3, i10, i9)) {
                        long zzD5 = zzD(t3, j10);
                        zzD = zzto.zzD(i10 << 3);
                        zzE = zzto.zzE(zzD5);
                        zzv = zzE + zzD;
                        i += zzv;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(t3, i10, i9)) {
                        long zzD6 = zzD(t3, j10);
                        zzD = zzto.zzD(i10 << 3);
                        zzE = zzto.zzE(zzD6);
                        zzv = zzE + zzD;
                        i += zzv;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(t3, i10, i9)) {
                        int zzs = zzs(t3, j10);
                        zzD2 = zzto.zzD(i10 << 3);
                        zzx = zzto.zzx(zzs);
                        zzv = zzx + zzD2;
                        i += zzv;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(t3, i10, i9)) {
                        i = androidx.camera.core.impl.utils.a.a(i10 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(t3, i10, i9)) {
                        i = androidx.camera.core.impl.utils.a.a(i10 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(t3, i10, i9)) {
                        i = androidx.camera.core.impl.utils.a.a(i10 << 3, 1, i);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(t3, i10, i9)) {
                        Object zzf2 = zzxy.zzf(t3, j10);
                        if (zzf2 instanceof zztd) {
                            int zzD7 = zzto.zzD(i10 << 3);
                            int zzd6 = ((zztd) zzf2).zzd();
                            i = androidx.camera.core.impl.utils.a.w(zzd6, zzd6, zzD7, i);
                            break;
                        } else {
                            zzD2 = zzto.zzD(i10 << 3);
                            zzx = zzto.zzB((String) zzf2);
                            zzv = zzx + zzD2;
                            i += zzv;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(t3, i10, i9)) {
                        zzo = zzwz.zzo(i10, zzxy.zzf(t3, j10), zzF(i9));
                        i += zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(t3, i10, i9)) {
                        zztd zztdVar2 = (zztd) zzxy.zzf(t3, j10);
                        int zzD8 = zzto.zzD(i10 << 3);
                        int zzd7 = zztdVar2.zzd();
                        i = androidx.camera.core.impl.utils.a.w(zzd7, zzd7, zzD8, i);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(t3, i10, i9)) {
                        i = androidx.camera.core.impl.utils.a.a(zzs(t3, j10), zzto.zzD(i10 << 3), i);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(t3, i10, i9)) {
                        int zzs2 = zzs(t3, j10);
                        zzD2 = zzto.zzD(i10 << 3);
                        zzx = zzto.zzx(zzs2);
                        zzv = zzx + zzD2;
                        i += zzv;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(t3, i10, i9)) {
                        i = androidx.camera.core.impl.utils.a.a(i10 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(t3, i10, i9)) {
                        i = androidx.camera.core.impl.utils.a.a(i10 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(t3, i10, i9)) {
                        int zzs3 = zzs(t3, j10);
                        i = androidx.camera.core.impl.utils.a.a((zzs3 >> 31) ^ (zzs3 + zzs3), zzto.zzD(i10 << 3), i);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(t3, i10, i9)) {
                        long zzD9 = zzD(t3, j10);
                        zzD = zzto.zzD(i10 << 3);
                        zzE = zzto.zzE((zzD9 >> 63) ^ (zzD9 + zzD9));
                        zzv = zzE + zzD;
                        i += zzv;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(t3, i10, i9)) {
                        zzv = zzto.zzv(i10, (zzwk) zzxy.zzf(t3, j10), zzF(i9));
                        i += zzv;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzxo<?, ?> zzxoVar = this.zzo;
        return i + zzxoVar.zza(zzxoVar.zzd(t3));
    }

    private static <T> int zzs(T t3, long j10) {
        return ((Integer) zzxy.zzf(t3, j10)).intValue();
    }

    private final <K, V> int zzt(T t3, byte[] bArr, int i, int i9, int i10, long j10, zzsl zzslVar) {
        Unsafe unsafe = zzb;
        Object zzH = zzH(i10);
        Object object = unsafe.getObject(t3, j10);
        if (zzwf.zzb(object)) {
            zzwe<K, V> zzb2 = zzwe.zza().zzb();
            zzwf.zzc(zzb2, object);
            unsafe.putObject(t3, j10, zzb2);
        }
        throw null;
    }

    private final int zzu(T t3, byte[] bArr, int i, int i9, int i10, int i11, int i12, int i13, int i14, long j10, int i15, zzsl zzslVar) {
        Unsafe unsafe = zzb;
        long j11 = this.zzc[i15 + 2] & 1048575;
        switch (i14) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(t3, j10, Double.valueOf(Double.longBitsToDouble(zzsm.zzo(bArr, i))));
                    unsafe.putInt(t3, j11, i11);
                    return i + 8;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(t3, j10, Float.valueOf(Float.intBitsToFloat(zzsm.zzb(bArr, i))));
                    unsafe.putInt(t3, j11, i11);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int zzm = zzsm.zzm(bArr, i, zzslVar);
                    unsafe.putObject(t3, j10, Long.valueOf(zzslVar.zzb));
                    unsafe.putInt(t3, j11, i11);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int zzj = zzsm.zzj(bArr, i, zzslVar);
                    unsafe.putObject(t3, j10, Integer.valueOf(zzslVar.zza));
                    unsafe.putInt(t3, j11, i11);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(t3, j10, Long.valueOf(zzsm.zzo(bArr, i)));
                    unsafe.putInt(t3, j11, i11);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(t3, j10, Integer.valueOf(zzsm.zzb(bArr, i)));
                    unsafe.putInt(t3, j11, i11);
                    return i + 4;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int zzm2 = zzsm.zzm(bArr, i, zzslVar);
                    unsafe.putObject(t3, j10, Boolean.valueOf(zzslVar.zzb != 0));
                    unsafe.putInt(t3, j11, i11);
                    return zzm2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int zzj2 = zzsm.zzj(bArr, i, zzslVar);
                    int i16 = zzslVar.zza;
                    if (i16 == 0) {
                        unsafe.putObject(t3, j10, "");
                    } else {
                        if ((i13 & PKIFailureInfo.duplicateCertReq) != 0 && !zzyd.zzf(bArr, zzj2, zzj2 + i16)) {
                            throw zzvk.zzd();
                        }
                        unsafe.putObject(t3, j10, new String(bArr, zzj2, i16, zzvi.zza));
                        zzj2 += i16;
                    }
                    unsafe.putInt(t3, j11, i11);
                    return zzj2;
                }
                break;
            case 60:
                if (i12 == 2) {
                    int zzd = zzsm.zzd(zzF(i15), bArr, i, i9, zzslVar);
                    Object object = unsafe.getInt(t3, j11) == i11 ? unsafe.getObject(t3, j10) : null;
                    if (object == null) {
                        unsafe.putObject(t3, j10, zzslVar.zzc);
                    } else {
                        unsafe.putObject(t3, j10, zzvi.zzg(object, zzslVar.zzc));
                    }
                    unsafe.putInt(t3, j11, i11);
                    return zzd;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int zza2 = zzsm.zza(bArr, i, zzslVar);
                    unsafe.putObject(t3, j10, zzslVar.zzc);
                    unsafe.putInt(t3, j11, i11);
                    return zza2;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int zzj3 = zzsm.zzj(bArr, i, zzslVar);
                    int i17 = zzslVar.zza;
                    zzvd zzE = zzE(i15);
                    if (zzE == null || zzE.zza(i17)) {
                        unsafe.putObject(t3, j10, Integer.valueOf(i17));
                        unsafe.putInt(t3, j11, i11);
                    } else {
                        zzd(t3).zzh(i10, Long.valueOf(i17));
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int zzj4 = zzsm.zzj(bArr, i, zzslVar);
                    unsafe.putObject(t3, j10, Integer.valueOf(zztj.zzs(zzslVar.zza)));
                    unsafe.putInt(t3, j11, i11);
                    return zzj4;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int zzm3 = zzsm.zzm(bArr, i, zzslVar);
                    unsafe.putObject(t3, j10, Long.valueOf(zztj.zzt(zzslVar.zzb)));
                    unsafe.putInt(t3, j11, i11);
                    return zzm3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int zzc = zzsm.zzc(zzF(i15), bArr, i, i9, (i10 & (-8)) | 4, zzslVar);
                    Object object2 = unsafe.getInt(t3, j11) == i11 ? unsafe.getObject(t3, j10) : null;
                    if (object2 == null) {
                        unsafe.putObject(t3, j10, zzslVar.zzc);
                    } else {
                        unsafe.putObject(t3, j10, zzvi.zzg(object2, zzslVar.zzc));
                    }
                    unsafe.putInt(t3, j11, i11);
                    return zzc;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x029e, code lost:
    
        if (r0 != r15) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x02a0, code lost:
    
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r8 = r18;
        r1 = r19;
        r6 = r23;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02bb, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x02f1, code lost:
    
        if (r0 != r15) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0310, code lost:
    
        if (r0 != r15) goto L101;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:60:0x0086. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzv(T r30, byte[] r31, int r32, int r33, com.google.android.gms.internal.gtm.zzsl r34) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzwn.zzv(java.lang.Object, byte[], int, int, com.google.android.gms.internal.gtm.zzsl):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int zzw(T t3, byte[] bArr, int i, int i9, int i10, int i11, int i12, int i13, long j10, int i14, long j11, zzsl zzslVar) {
        int i15;
        int i16;
        int i17;
        int i18;
        int zzj;
        int i19 = i;
        Unsafe unsafe = zzb;
        zzvh zzvhVar = (zzvh) unsafe.getObject(t3, j11);
        if (!zzvhVar.zzc()) {
            int size = zzvhVar.size();
            zzvhVar = zzvhVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(t3, j11, zzvhVar);
        }
        switch (i14) {
            case 18:
            case 35:
                if (i12 == 2) {
                    zzug zzugVar = (zzug) zzvhVar;
                    int zzj2 = zzsm.zzj(bArr, i19, zzslVar);
                    int i20 = zzslVar.zza + zzj2;
                    while (zzj2 < i20) {
                        zzugVar.zze(Double.longBitsToDouble(zzsm.zzo(bArr, zzj2)));
                        zzj2 += 8;
                    }
                    if (zzj2 == i20) {
                        return zzj2;
                    }
                    throw zzvk.zzj();
                }
                if (i12 == 1) {
                    zzug zzugVar2 = (zzug) zzvhVar;
                    zzugVar2.zze(Double.longBitsToDouble(zzsm.zzo(bArr, i)));
                    while (true) {
                        i15 = i19 + 8;
                        if (i15 < i9) {
                            i19 = zzsm.zzj(bArr, i15, zzslVar);
                            if (i10 == zzslVar.zza) {
                                zzugVar2.zze(Double.longBitsToDouble(zzsm.zzo(bArr, i19)));
                            }
                        }
                    }
                    return i15;
                }
                return i19;
            case 19:
            case 36:
                if (i12 == 2) {
                    zzuq zzuqVar = (zzuq) zzvhVar;
                    int zzj3 = zzsm.zzj(bArr, i19, zzslVar);
                    int i21 = zzslVar.zza + zzj3;
                    while (zzj3 < i21) {
                        zzuqVar.zze(Float.intBitsToFloat(zzsm.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i21) {
                        return zzj3;
                    }
                    throw zzvk.zzj();
                }
                if (i12 == 5) {
                    zzuq zzuqVar2 = (zzuq) zzvhVar;
                    zzuqVar2.zze(Float.intBitsToFloat(zzsm.zzb(bArr, i)));
                    while (true) {
                        i16 = i19 + 4;
                        if (i16 < i9) {
                            i19 = zzsm.zzj(bArr, i16, zzslVar);
                            if (i10 == zzslVar.zza) {
                                zzuqVar2.zze(Float.intBitsToFloat(zzsm.zzb(bArr, i19)));
                            }
                        }
                    }
                    return i16;
                }
                return i19;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i12 == 2) {
                    zzvz zzvzVar = (zzvz) zzvhVar;
                    int zzj4 = zzsm.zzj(bArr, i19, zzslVar);
                    int i22 = zzslVar.zza + zzj4;
                    while (zzj4 < i22) {
                        zzj4 = zzsm.zzm(bArr, zzj4, zzslVar);
                        zzvzVar.zzf(zzslVar.zzb);
                    }
                    if (zzj4 == i22) {
                        return zzj4;
                    }
                    throw zzvk.zzj();
                }
                if (i12 == 0) {
                    zzvz zzvzVar2 = (zzvz) zzvhVar;
                    int zzm = zzsm.zzm(bArr, i19, zzslVar);
                    zzvzVar2.zzf(zzslVar.zzb);
                    while (zzm < i9) {
                        int zzj5 = zzsm.zzj(bArr, zzm, zzslVar);
                        if (i10 != zzslVar.zza) {
                            return zzm;
                        }
                        zzm = zzsm.zzm(bArr, zzj5, zzslVar);
                        zzvzVar2.zzf(zzslVar.zzb);
                    }
                    return zzm;
                }
                return i19;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i12 == 2) {
                    return zzsm.zzf(bArr, i19, zzvhVar, zzslVar);
                }
                if (i12 == 0) {
                    return zzsm.zzl(i10, bArr, i, i9, zzvhVar, zzslVar);
                }
                return i19;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i12 == 2) {
                    zzvz zzvzVar3 = (zzvz) zzvhVar;
                    int zzj6 = zzsm.zzj(bArr, i19, zzslVar);
                    int i23 = zzslVar.zza + zzj6;
                    while (zzj6 < i23) {
                        zzvzVar3.zzf(zzsm.zzo(bArr, zzj6));
                        zzj6 += 8;
                    }
                    if (zzj6 == i23) {
                        return zzj6;
                    }
                    throw zzvk.zzj();
                }
                if (i12 == 1) {
                    zzvz zzvzVar4 = (zzvz) zzvhVar;
                    zzvzVar4.zzf(zzsm.zzo(bArr, i));
                    while (true) {
                        i17 = i19 + 8;
                        if (i17 < i9) {
                            i19 = zzsm.zzj(bArr, i17, zzslVar);
                            if (i10 == zzslVar.zza) {
                                zzvzVar4.zzf(zzsm.zzo(bArr, i19));
                            }
                        }
                    }
                    return i17;
                }
                return i19;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i12 == 2) {
                    zzva zzvaVar = (zzva) zzvhVar;
                    int zzj7 = zzsm.zzj(bArr, i19, zzslVar);
                    int i24 = zzslVar.zza + zzj7;
                    while (zzj7 < i24) {
                        zzvaVar.zzh(zzsm.zzb(bArr, zzj7));
                        zzj7 += 4;
                    }
                    if (zzj7 == i24) {
                        return zzj7;
                    }
                    throw zzvk.zzj();
                }
                if (i12 == 5) {
                    zzva zzvaVar2 = (zzva) zzvhVar;
                    zzvaVar2.zzh(zzsm.zzb(bArr, i));
                    while (true) {
                        i18 = i19 + 4;
                        if (i18 < i9) {
                            i19 = zzsm.zzj(bArr, i18, zzslVar);
                            if (i10 == zzslVar.zza) {
                                zzvaVar2.zzh(zzsm.zzb(bArr, i19));
                            }
                        }
                    }
                    return i18;
                }
                return i19;
            case 25:
            case 42:
                if (i12 == 2) {
                    zzsr zzsrVar = (zzsr) zzvhVar;
                    zzj = zzsm.zzj(bArr, i19, zzslVar);
                    int i25 = zzslVar.zza + zzj;
                    while (zzj < i25) {
                        zzj = zzsm.zzm(bArr, zzj, zzslVar);
                        zzsrVar.zze(zzslVar.zzb != 0);
                    }
                    if (zzj != i25) {
                        throw zzvk.zzj();
                    }
                    return zzj;
                }
                if (i12 == 0) {
                    zzsr zzsrVar2 = (zzsr) zzvhVar;
                    int zzm2 = zzsm.zzm(bArr, i19, zzslVar);
                    zzsrVar2.zze(zzslVar.zzb != 0);
                    while (zzm2 < i9) {
                        int zzj8 = zzsm.zzj(bArr, zzm2, zzslVar);
                        if (i10 != zzslVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzsm.zzm(bArr, zzj8, zzslVar);
                        zzsrVar2.zze(zzslVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i19;
            case 26:
                if (i12 == 2) {
                    if ((j10 & 536870912) == 0) {
                        int zzj9 = zzsm.zzj(bArr, i19, zzslVar);
                        int i26 = zzslVar.zza;
                        if (i26 < 0) {
                            throw zzvk.zzf();
                        }
                        if (i26 == 0) {
                            zzvhVar.add("");
                        } else {
                            zzvhVar.add(new String(bArr, zzj9, i26, zzvi.zza));
                            zzj9 += i26;
                        }
                        while (zzj9 < i9) {
                            int zzj10 = zzsm.zzj(bArr, zzj9, zzslVar);
                            if (i10 != zzslVar.zza) {
                                return zzj9;
                            }
                            zzj9 = zzsm.zzj(bArr, zzj10, zzslVar);
                            int i27 = zzslVar.zza;
                            if (i27 < 0) {
                                throw zzvk.zzf();
                            }
                            if (i27 == 0) {
                                zzvhVar.add("");
                            } else {
                                zzvhVar.add(new String(bArr, zzj9, i27, zzvi.zza));
                                zzj9 += i27;
                            }
                        }
                        return zzj9;
                    }
                    int zzj11 = zzsm.zzj(bArr, i19, zzslVar);
                    int i28 = zzslVar.zza;
                    if (i28 < 0) {
                        throw zzvk.zzf();
                    }
                    if (i28 == 0) {
                        zzvhVar.add("");
                    } else {
                        int i29 = zzj11 + i28;
                        if (!zzyd.zzf(bArr, zzj11, i29)) {
                            throw zzvk.zzd();
                        }
                        zzvhVar.add(new String(bArr, zzj11, i28, zzvi.zza));
                        zzj11 = i29;
                    }
                    while (zzj11 < i9) {
                        int zzj12 = zzsm.zzj(bArr, zzj11, zzslVar);
                        if (i10 != zzslVar.zza) {
                            return zzj11;
                        }
                        zzj11 = zzsm.zzj(bArr, zzj12, zzslVar);
                        int i30 = zzslVar.zza;
                        if (i30 < 0) {
                            throw zzvk.zzf();
                        }
                        if (i30 == 0) {
                            zzvhVar.add("");
                        } else {
                            int i31 = zzj11 + i30;
                            if (!zzyd.zzf(bArr, zzj11, i31)) {
                                throw zzvk.zzd();
                            }
                            zzvhVar.add(new String(bArr, zzj11, i30, zzvi.zza));
                            zzj11 = i31;
                        }
                    }
                    return zzj11;
                }
                return i19;
            case 27:
                if (i12 == 2) {
                    return zzsm.zze(zzF(i13), i10, bArr, i, i9, zzvhVar, zzslVar);
                }
                return i19;
            case 28:
                if (i12 == 2) {
                    int zzj13 = zzsm.zzj(bArr, i19, zzslVar);
                    int i32 = zzslVar.zza;
                    if (i32 < 0) {
                        throw zzvk.zzf();
                    }
                    if (i32 > bArr.length - zzj13) {
                        throw zzvk.zzj();
                    }
                    if (i32 == 0) {
                        zzvhVar.add(zztd.zzb);
                    } else {
                        zzvhVar.add(zztd.zzn(bArr, zzj13, i32));
                        zzj13 += i32;
                    }
                    while (zzj13 < i9) {
                        int zzj14 = zzsm.zzj(bArr, zzj13, zzslVar);
                        if (i10 != zzslVar.zza) {
                            return zzj13;
                        }
                        zzj13 = zzsm.zzj(bArr, zzj14, zzslVar);
                        int i33 = zzslVar.zza;
                        if (i33 < 0) {
                            throw zzvk.zzf();
                        }
                        if (i33 > bArr.length - zzj13) {
                            throw zzvk.zzj();
                        }
                        if (i33 == 0) {
                            zzvhVar.add(zztd.zzb);
                        } else {
                            zzvhVar.add(zztd.zzn(bArr, zzj13, i33));
                            zzj13 += i33;
                        }
                    }
                    return zzj13;
                }
                return i19;
            case 30:
            case 44:
                if (i12 != 2) {
                    if (i12 == 0) {
                        zzj = zzsm.zzl(i10, bArr, i, i9, zzvhVar, zzslVar);
                    }
                    return i19;
                }
                zzj = zzsm.zzf(bArr, i19, zzvhVar, zzslVar);
                zzuz zzuzVar = (zzuz) t3;
                zzxp zzxpVar = zzuzVar.zzc;
                if (zzxpVar == zzxp.zzc()) {
                    zzxpVar = null;
                }
                Object zzC = zzwz.zzC(i11, zzvhVar, zzE(i13), zzxpVar, this.zzo);
                if (zzC != null) {
                    zzuzVar.zzc = (zzxp) zzC;
                    return zzj;
                }
                return zzj;
            case 33:
            case 47:
                if (i12 == 2) {
                    zzva zzvaVar3 = (zzva) zzvhVar;
                    int zzj15 = zzsm.zzj(bArr, i19, zzslVar);
                    int i34 = zzslVar.zza + zzj15;
                    while (zzj15 < i34) {
                        zzj15 = zzsm.zzj(bArr, zzj15, zzslVar);
                        zzvaVar3.zzh(zztj.zzs(zzslVar.zza));
                    }
                    if (zzj15 == i34) {
                        return zzj15;
                    }
                    throw zzvk.zzj();
                }
                if (i12 == 0) {
                    zzva zzvaVar4 = (zzva) zzvhVar;
                    int zzj16 = zzsm.zzj(bArr, i19, zzslVar);
                    zzvaVar4.zzh(zztj.zzs(zzslVar.zza));
                    while (zzj16 < i9) {
                        int zzj17 = zzsm.zzj(bArr, zzj16, zzslVar);
                        if (i10 != zzslVar.zza) {
                            return zzj16;
                        }
                        zzj16 = zzsm.zzj(bArr, zzj17, zzslVar);
                        zzvaVar4.zzh(zztj.zzs(zzslVar.zza));
                    }
                    return zzj16;
                }
                return i19;
            case 34:
            case 48:
                if (i12 == 2) {
                    zzvz zzvzVar5 = (zzvz) zzvhVar;
                    int zzj18 = zzsm.zzj(bArr, i19, zzslVar);
                    int i35 = zzslVar.zza + zzj18;
                    while (zzj18 < i35) {
                        zzj18 = zzsm.zzm(bArr, zzj18, zzslVar);
                        zzvzVar5.zzf(zztj.zzt(zzslVar.zzb));
                    }
                    if (zzj18 == i35) {
                        return zzj18;
                    }
                    throw zzvk.zzj();
                }
                if (i12 == 0) {
                    zzvz zzvzVar6 = (zzvz) zzvhVar;
                    int zzm3 = zzsm.zzm(bArr, i19, zzslVar);
                    zzvzVar6.zzf(zztj.zzt(zzslVar.zzb));
                    while (zzm3 < i9) {
                        int zzj19 = zzsm.zzj(bArr, zzm3, zzslVar);
                        if (i10 != zzslVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzsm.zzm(bArr, zzj19, zzslVar);
                        zzvzVar6.zzf(zztj.zzt(zzslVar.zzb));
                    }
                    return zzm3;
                }
                return i19;
            default:
                if (i12 == 3) {
                    zzwx zzF = zzF(i13);
                    int i36 = (i10 & (-8)) | 4;
                    int zzc = zzsm.zzc(zzF, bArr, i, i9, i36, zzslVar);
                    zzvhVar.add(zzslVar.zzc);
                    while (zzc < i9) {
                        int zzj20 = zzsm.zzj(bArr, zzc, zzslVar);
                        if (i10 != zzslVar.zza) {
                            return zzc;
                        }
                        zzc = zzsm.zzc(zzF, bArr, zzj20, i9, i36, zzslVar);
                        zzvhVar.add(zzslVar.zzc);
                    }
                    return zzc;
                }
                return i19;
        }
    }

    private final int zzx(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzA(i, 0);
    }

    private final int zzy(int i, int i9) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzA(i, i9);
    }

    private final int zzz(int i) {
        return this.zzc[i + 2];
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final int zza(T t3) {
        return this.zzj ? zzr(t3) : zzq(t3);
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final int zzb(T t3) {
        int i;
        int zzc;
        int i9;
        int zzc2;
        int length = this.zzc.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int zzC = zzC(i11);
            int i12 = this.zzc[i11];
            long j10 = 1048575 & zzC;
            int i13 = 37;
            switch (zzB(zzC)) {
                case 0:
                    i = i10 * 53;
                    zzc = zzvi.zzc(Double.doubleToLongBits(zzxy.zza(t3, j10)));
                    i10 = zzc + i;
                    break;
                case 1:
                    i = i10 * 53;
                    zzc = Float.floatToIntBits(zzxy.zzb(t3, j10));
                    i10 = zzc + i;
                    break;
                case 2:
                    i = i10 * 53;
                    zzc = zzvi.zzc(zzxy.zzd(t3, j10));
                    i10 = zzc + i;
                    break;
                case 3:
                    i = i10 * 53;
                    zzc = zzvi.zzc(zzxy.zzd(t3, j10));
                    i10 = zzc + i;
                    break;
                case 4:
                    i9 = i10 * 53;
                    zzc2 = zzxy.zzc(t3, j10);
                    i10 = i9 + zzc2;
                    break;
                case 5:
                    i = i10 * 53;
                    zzc = zzvi.zzc(zzxy.zzd(t3, j10));
                    i10 = zzc + i;
                    break;
                case 6:
                    i9 = i10 * 53;
                    zzc2 = zzxy.zzc(t3, j10);
                    i10 = i9 + zzc2;
                    break;
                case 7:
                    i = i10 * 53;
                    zzc = zzvi.zza(zzxy.zzw(t3, j10));
                    i10 = zzc + i;
                    break;
                case 8:
                    i = i10 * 53;
                    zzc = ((String) zzxy.zzf(t3, j10)).hashCode();
                    i10 = zzc + i;
                    break;
                case 9:
                    Object zzf = zzxy.zzf(t3, j10);
                    if (zzf != null) {
                        i13 = zzf.hashCode();
                    }
                    i10 = (i10 * 53) + i13;
                    break;
                case 10:
                    i = i10 * 53;
                    zzc = zzxy.zzf(t3, j10).hashCode();
                    i10 = zzc + i;
                    break;
                case 11:
                    i9 = i10 * 53;
                    zzc2 = zzxy.zzc(t3, j10);
                    i10 = i9 + zzc2;
                    break;
                case 12:
                    i9 = i10 * 53;
                    zzc2 = zzxy.zzc(t3, j10);
                    i10 = i9 + zzc2;
                    break;
                case 13:
                    i9 = i10 * 53;
                    zzc2 = zzxy.zzc(t3, j10);
                    i10 = i9 + zzc2;
                    break;
                case 14:
                    i = i10 * 53;
                    zzc = zzvi.zzc(zzxy.zzd(t3, j10));
                    i10 = zzc + i;
                    break;
                case 15:
                    i9 = i10 * 53;
                    zzc2 = zzxy.zzc(t3, j10);
                    i10 = i9 + zzc2;
                    break;
                case 16:
                    i = i10 * 53;
                    zzc = zzvi.zzc(zzxy.zzd(t3, j10));
                    i10 = zzc + i;
                    break;
                case 17:
                    Object zzf2 = zzxy.zzf(t3, j10);
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
                    i = i10 * 53;
                    zzc = zzxy.zzf(t3, j10).hashCode();
                    i10 = zzc + i;
                    break;
                case 50:
                    i = i10 * 53;
                    zzc = zzxy.zzf(t3, j10).hashCode();
                    i10 = zzc + i;
                    break;
                case 51:
                    if (zzT(t3, i12, i11)) {
                        i = i10 * 53;
                        zzc = zzvi.zzc(Double.doubleToLongBits(zzo(t3, j10)));
                        i10 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(t3, i12, i11)) {
                        i = i10 * 53;
                        zzc = Float.floatToIntBits(zzp(t3, j10));
                        i10 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(t3, i12, i11)) {
                        i = i10 * 53;
                        zzc = zzvi.zzc(zzD(t3, j10));
                        i10 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(t3, i12, i11)) {
                        i = i10 * 53;
                        zzc = zzvi.zzc(zzD(t3, j10));
                        i10 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(t3, i12, i11)) {
                        i9 = i10 * 53;
                        zzc2 = zzs(t3, j10);
                        i10 = i9 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(t3, i12, i11)) {
                        i = i10 * 53;
                        zzc = zzvi.zzc(zzD(t3, j10));
                        i10 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(t3, i12, i11)) {
                        i9 = i10 * 53;
                        zzc2 = zzs(t3, j10);
                        i10 = i9 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(t3, i12, i11)) {
                        i = i10 * 53;
                        zzc = zzvi.zza(zzU(t3, j10));
                        i10 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(t3, i12, i11)) {
                        i = i10 * 53;
                        zzc = ((String) zzxy.zzf(t3, j10)).hashCode();
                        i10 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(t3, i12, i11)) {
                        i = i10 * 53;
                        zzc = zzxy.zzf(t3, j10).hashCode();
                        i10 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(t3, i12, i11)) {
                        i = i10 * 53;
                        zzc = zzxy.zzf(t3, j10).hashCode();
                        i10 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(t3, i12, i11)) {
                        i9 = i10 * 53;
                        zzc2 = zzs(t3, j10);
                        i10 = i9 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(t3, i12, i11)) {
                        i9 = i10 * 53;
                        zzc2 = zzs(t3, j10);
                        i10 = i9 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(t3, i12, i11)) {
                        i9 = i10 * 53;
                        zzc2 = zzs(t3, j10);
                        i10 = i9 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(t3, i12, i11)) {
                        i = i10 * 53;
                        zzc = zzvi.zzc(zzD(t3, j10));
                        i10 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(t3, i12, i11)) {
                        i9 = i10 * 53;
                        zzc2 = zzs(t3, j10);
                        i10 = i9 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(t3, i12, i11)) {
                        i = i10 * 53;
                        zzc = zzvi.zzc(zzD(t3, j10));
                        i10 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(t3, i12, i11)) {
                        i = i10 * 53;
                        zzc = zzxy.zzf(t3, j10).hashCode();
                        i10 = zzc + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzo.zzd(t3).hashCode() + (i10 * 53);
        return this.zzh ? (hashCode * 53) + this.zzp.zzb(t3).zza.hashCode() : hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0636, code lost:
    
        if (r2 == r3) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0638, code lost:
    
        r30.putInt(r13, r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x063e, code lost:
    
        r2 = r8.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0642, code lost:
    
        if (r2 >= r8.zzm) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0644, code lost:
    
        r8.zzG(r13, r8.zzk[r2], null, r8.zzo);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0651, code lost:
    
        if (r9 != 0) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0653, code lost:
    
        if (r0 != r6) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x065a, code lost:
    
        throw com.google.android.gms.internal.gtm.zzvk.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x065f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x065b, code lost:
    
        if (r0 > r6) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x065d, code lost:
    
        if (r1 != r9) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0664, code lost:
    
        throw com.google.android.gms.internal.gtm.zzvk.zzg();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x05dc  */
    /* JADX WARN: Type inference failed for: r13v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(T r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.gtm.zzsl r38) {
        /*
            Method dump skipped, instructions count: 1716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzwn.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.gtm.zzsl):int");
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final T zze() {
        return (T) ((zzuz) this.zzg).zzb(4, null, null);
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final void zzf(T t3) {
        int i;
        int i9 = this.zzl;
        while (true) {
            i = this.zzm;
            if (i9 >= i) {
                break;
            }
            long zzC = zzC(this.zzk[i9]) & 1048575;
            Object zzf = zzxy.zzf(t3, zzC);
            if (zzf != null) {
                ((zzwe) zzf).zzc();
                zzxy.zzs(t3, zzC, zzf);
            }
            i9++;
        }
        int length = this.zzk.length;
        while (i < length) {
            this.zzn.zzb(t3, this.zzk[i]);
            i++;
        }
        this.zzo.zzm(t3);
        if (this.zzh) {
            this.zzp.zzf(t3);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final void zzg(T t3, T t10) {
        t10.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzC = zzC(i);
            long j10 = 1048575 & zzC;
            int i9 = this.zzc[i];
            switch (zzB(zzC)) {
                case 0:
                    if (zzQ(t10, i)) {
                        zzxy.zzo(t3, j10, zzxy.zza(t10, j10));
                        zzM(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzQ(t10, i)) {
                        zzxy.zzp(t3, j10, zzxy.zzb(t10, j10));
                        zzM(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzQ(t10, i)) {
                        zzxy.zzr(t3, j10, zzxy.zzd(t10, j10));
                        zzM(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzQ(t10, i)) {
                        zzxy.zzr(t3, j10, zzxy.zzd(t10, j10));
                        zzM(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzQ(t10, i)) {
                        zzxy.zzq(t3, j10, zzxy.zzc(t10, j10));
                        zzM(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzQ(t10, i)) {
                        zzxy.zzr(t3, j10, zzxy.zzd(t10, j10));
                        zzM(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzQ(t10, i)) {
                        zzxy.zzq(t3, j10, zzxy.zzc(t10, j10));
                        zzM(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzQ(t10, i)) {
                        zzxy.zzm(t3, j10, zzxy.zzw(t10, j10));
                        zzM(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzQ(t10, i)) {
                        zzxy.zzs(t3, j10, zzxy.zzf(t10, j10));
                        zzM(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzJ(t3, t10, i);
                    break;
                case 10:
                    if (zzQ(t10, i)) {
                        zzxy.zzs(t3, j10, zzxy.zzf(t10, j10));
                        zzM(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzQ(t10, i)) {
                        zzxy.zzq(t3, j10, zzxy.zzc(t10, j10));
                        zzM(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzQ(t10, i)) {
                        zzxy.zzq(t3, j10, zzxy.zzc(t10, j10));
                        zzM(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzQ(t10, i)) {
                        zzxy.zzq(t3, j10, zzxy.zzc(t10, j10));
                        zzM(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzQ(t10, i)) {
                        zzxy.zzr(t3, j10, zzxy.zzd(t10, j10));
                        zzM(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzQ(t10, i)) {
                        zzxy.zzq(t3, j10, zzxy.zzc(t10, j10));
                        zzM(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzQ(t10, i)) {
                        zzxy.zzr(t3, j10, zzxy.zzd(t10, j10));
                        zzM(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzJ(t3, t10, i);
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
                    this.zzn.zzc(t3, t10, j10);
                    break;
                case 50:
                    zzwz.zzI(this.zzr, t3, t10, j10);
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
                    if (zzT(t10, i9, i)) {
                        zzxy.zzs(t3, j10, zzxy.zzf(t10, j10));
                        zzN(t3, i9, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzK(t3, t10, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzT(t10, i9, i)) {
                        zzxy.zzs(t3, j10, zzxy.zzf(t10, j10));
                        zzN(t3, i9, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzK(t3, t10, i);
                    break;
            }
        }
        zzwz.zzF(this.zzo, t3, t10);
        if (this.zzh) {
            zzwz.zzE(this.zzp, t3, t10);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final void zzh(T t3, zzww zzwwVar, zzuj zzujVar) {
        zzujVar.getClass();
        zzxo zzxoVar = this.zzo;
        zzuk<?> zzukVar = this.zzp;
        zzuo<?> zzuoVar = null;
        Object obj = null;
        while (true) {
            try {
                int zzc = zzwwVar.zzc();
                int zzx = zzx(zzc);
                if (zzx >= 0) {
                    int zzC = zzC(zzx);
                    try {
                        switch (zzB(zzC)) {
                            case 0:
                                zzxy.zzo(t3, zzC & 1048575, zzwwVar.zza());
                                zzM(t3, zzx);
                                break;
                            case 1:
                                zzxy.zzp(t3, zzC & 1048575, zzwwVar.zzb());
                                zzM(t3, zzx);
                                break;
                            case 2:
                                zzxy.zzr(t3, zzC & 1048575, zzwwVar.zzl());
                                zzM(t3, zzx);
                                break;
                            case 3:
                                zzxy.zzr(t3, zzC & 1048575, zzwwVar.zzo());
                                zzM(t3, zzx);
                                break;
                            case 4:
                                zzxy.zzq(t3, zzC & 1048575, zzwwVar.zzg());
                                zzM(t3, zzx);
                                break;
                            case 5:
                                zzxy.zzr(t3, zzC & 1048575, zzwwVar.zzk());
                                zzM(t3, zzx);
                                break;
                            case 6:
                                zzxy.zzq(t3, zzC & 1048575, zzwwVar.zzf());
                                zzM(t3, zzx);
                                break;
                            case 7:
                                zzxy.zzm(t3, zzC & 1048575, zzwwVar.zzS());
                                zzM(t3, zzx);
                                break;
                            case 8:
                                zzL(t3, zzC, zzwwVar);
                                zzM(t3, zzx);
                                break;
                            case 9:
                                if (zzQ(t3, zzx)) {
                                    long j10 = zzC & 1048575;
                                    zzxy.zzs(t3, j10, zzvi.zzg(zzxy.zzf(t3, j10), zzwwVar.zzu(zzF(zzx), zzujVar)));
                                    break;
                                } else {
                                    zzxy.zzs(t3, zzC & 1048575, zzwwVar.zzu(zzF(zzx), zzujVar));
                                    zzM(t3, zzx);
                                    break;
                                }
                            case 10:
                                zzxy.zzs(t3, zzC & 1048575, zzwwVar.zzq());
                                zzM(t3, zzx);
                                break;
                            case 11:
                                zzxy.zzq(t3, zzC & 1048575, zzwwVar.zzj());
                                zzM(t3, zzx);
                                break;
                            case 12:
                                int zze = zzwwVar.zze();
                                zzvd zzE = zzE(zzx);
                                if (zzE != null && !zzE.zza(zze)) {
                                    obj = zzwz.zzD(zzc, zze, obj, zzxoVar);
                                    break;
                                }
                                zzxy.zzq(t3, zzC & 1048575, zze);
                                zzM(t3, zzx);
                                break;
                            case 13:
                                zzxy.zzq(t3, zzC & 1048575, zzwwVar.zzh());
                                zzM(t3, zzx);
                                break;
                            case 14:
                                zzxy.zzr(t3, zzC & 1048575, zzwwVar.zzm());
                                zzM(t3, zzx);
                                break;
                            case 15:
                                zzxy.zzq(t3, zzC & 1048575, zzwwVar.zzi());
                                zzM(t3, zzx);
                                break;
                            case 16:
                                zzxy.zzr(t3, zzC & 1048575, zzwwVar.zzn());
                                zzM(t3, zzx);
                                break;
                            case 17:
                                if (zzQ(t3, zzx)) {
                                    long j11 = zzC & 1048575;
                                    zzxy.zzs(t3, j11, zzvi.zzg(zzxy.zzf(t3, j11), zzwwVar.zzs(zzF(zzx), zzujVar)));
                                    break;
                                } else {
                                    zzxy.zzs(t3, zzC & 1048575, zzwwVar.zzs(zzF(zzx), zzujVar));
                                    zzM(t3, zzx);
                                    break;
                                }
                            case 18:
                                zzwwVar.zzA(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 19:
                                zzwwVar.zzE(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 20:
                                zzwwVar.zzH(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 21:
                                zzwwVar.zzR(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 22:
                                zzwwVar.zzG(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 23:
                                zzwwVar.zzD(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 24:
                                zzwwVar.zzC(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 25:
                                zzwwVar.zzy(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 26:
                                if (zzP(zzC)) {
                                    zzwwVar.zzP(this.zzn.zza(t3, zzC & 1048575));
                                    break;
                                } else {
                                    zzwwVar.zzN(this.zzn.zza(t3, zzC & 1048575));
                                    break;
                                }
                            case 27:
                                zzwwVar.zzI(this.zzn.zza(t3, zzC & 1048575), zzF(zzx), zzujVar);
                                break;
                            case 28:
                                zzwwVar.zzz(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 29:
                                zzwwVar.zzQ(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 30:
                                List<Integer> zza2 = this.zzn.zza(t3, zzC & 1048575);
                                zzwwVar.zzB(zza2);
                                obj = zzwz.zzC(zzc, zza2, zzE(zzx), obj, zzxoVar);
                                break;
                            case 31:
                                zzwwVar.zzJ(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 32:
                                zzwwVar.zzK(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 33:
                                zzwwVar.zzL(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 34:
                                zzwwVar.zzM(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 35:
                                zzwwVar.zzA(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 36:
                                zzwwVar.zzE(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 37:
                                zzwwVar.zzH(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 38:
                                zzwwVar.zzR(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 39:
                                zzwwVar.zzG(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 40:
                                zzwwVar.zzD(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 41:
                                zzwwVar.zzC(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 42:
                                zzwwVar.zzy(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 43:
                                zzwwVar.zzQ(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 44:
                                List<Integer> zza3 = this.zzn.zza(t3, zzC & 1048575);
                                zzwwVar.zzB(zza3);
                                obj = zzwz.zzC(zzc, zza3, zzE(zzx), obj, zzxoVar);
                                break;
                            case 45:
                                zzwwVar.zzJ(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 46:
                                zzwwVar.zzK(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 47:
                                zzwwVar.zzL(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 48:
                                zzwwVar.zzM(this.zzn.zza(t3, zzC & 1048575));
                                break;
                            case 49:
                                zzwwVar.zzF(this.zzn.zza(t3, zzC & 1048575), zzF(zzx), zzujVar);
                                break;
                            case 50:
                                Object zzH = zzH(zzx);
                                long zzC2 = zzC(zzx) & 1048575;
                                Object zzf = zzxy.zzf(t3, zzC2);
                                if (zzf == null) {
                                    zzf = zzwe.zza().zzb();
                                    zzxy.zzs(t3, zzC2, zzf);
                                } else if (zzwf.zzb(zzf)) {
                                    Object zzb2 = zzwe.zza().zzb();
                                    zzwf.zzc(zzb2, zzf);
                                    zzxy.zzs(t3, zzC2, zzb2);
                                    zzf = zzb2;
                                }
                                throw null;
                                break;
                            case 51:
                                zzxy.zzs(t3, zzC & 1048575, Double.valueOf(zzwwVar.zza()));
                                zzN(t3, zzc, zzx);
                                break;
                            case 52:
                                zzxy.zzs(t3, zzC & 1048575, Float.valueOf(zzwwVar.zzb()));
                                zzN(t3, zzc, zzx);
                                break;
                            case 53:
                                zzxy.zzs(t3, zzC & 1048575, Long.valueOf(zzwwVar.zzl()));
                                zzN(t3, zzc, zzx);
                                break;
                            case 54:
                                zzxy.zzs(t3, zzC & 1048575, Long.valueOf(zzwwVar.zzo()));
                                zzN(t3, zzc, zzx);
                                break;
                            case 55:
                                zzxy.zzs(t3, zzC & 1048575, Integer.valueOf(zzwwVar.zzg()));
                                zzN(t3, zzc, zzx);
                                break;
                            case 56:
                                zzxy.zzs(t3, zzC & 1048575, Long.valueOf(zzwwVar.zzk()));
                                zzN(t3, zzc, zzx);
                                break;
                            case 57:
                                zzxy.zzs(t3, zzC & 1048575, Integer.valueOf(zzwwVar.zzf()));
                                zzN(t3, zzc, zzx);
                                break;
                            case 58:
                                zzxy.zzs(t3, zzC & 1048575, Boolean.valueOf(zzwwVar.zzS()));
                                zzN(t3, zzc, zzx);
                                break;
                            case 59:
                                zzL(t3, zzC, zzwwVar);
                                zzN(t3, zzc, zzx);
                                break;
                            case 60:
                                if (zzT(t3, zzc, zzx)) {
                                    long j12 = zzC & 1048575;
                                    zzxy.zzs(t3, j12, zzvi.zzg(zzxy.zzf(t3, j12), zzwwVar.zzu(zzF(zzx), zzujVar)));
                                } else {
                                    zzxy.zzs(t3, zzC & 1048575, zzwwVar.zzu(zzF(zzx), zzujVar));
                                    zzM(t3, zzx);
                                }
                                zzN(t3, zzc, zzx);
                                break;
                            case 61:
                                zzxy.zzs(t3, zzC & 1048575, zzwwVar.zzq());
                                zzN(t3, zzc, zzx);
                                break;
                            case 62:
                                zzxy.zzs(t3, zzC & 1048575, Integer.valueOf(zzwwVar.zzj()));
                                zzN(t3, zzc, zzx);
                                break;
                            case 63:
                                int zze2 = zzwwVar.zze();
                                zzvd zzE2 = zzE(zzx);
                                if (zzE2 != null && !zzE2.zza(zze2)) {
                                    obj = zzwz.zzD(zzc, zze2, obj, zzxoVar);
                                    break;
                                }
                                zzxy.zzs(t3, zzC & 1048575, Integer.valueOf(zze2));
                                zzN(t3, zzc, zzx);
                                break;
                            case 64:
                                zzxy.zzs(t3, zzC & 1048575, Integer.valueOf(zzwwVar.zzh()));
                                zzN(t3, zzc, zzx);
                                break;
                            case 65:
                                zzxy.zzs(t3, zzC & 1048575, Long.valueOf(zzwwVar.zzm()));
                                zzN(t3, zzc, zzx);
                                break;
                            case 66:
                                zzxy.zzs(t3, zzC & 1048575, Integer.valueOf(zzwwVar.zzi()));
                                zzN(t3, zzc, zzx);
                                break;
                            case 67:
                                zzxy.zzs(t3, zzC & 1048575, Long.valueOf(zzwwVar.zzn()));
                                zzN(t3, zzc, zzx);
                                break;
                            case 68:
                                zzxy.zzs(t3, zzC & 1048575, zzwwVar.zzs(zzF(zzx), zzujVar));
                                zzN(t3, zzc, zzx);
                                break;
                            default:
                                if (obj == null) {
                                    obj = zzxoVar.zzf();
                                }
                                if (!zzxoVar.zzp(obj, zzwwVar)) {
                                    for (int i = this.zzl; i < this.zzm; i++) {
                                        zzG(t3, this.zzk[i], obj, zzxoVar);
                                    }
                                    zzxoVar.zzn(t3, obj);
                                    return;
                                }
                                break;
                        }
                    } catch (zzvj unused) {
                        zzxoVar.zzq(zzwwVar);
                        if (obj == null) {
                            obj = zzxoVar.zzc(t3);
                        }
                        if (!zzxoVar.zzp(obj, zzwwVar)) {
                            for (int i9 = this.zzl; i9 < this.zzm; i9++) {
                                zzG(t3, this.zzk[i9], obj, zzxoVar);
                            }
                            if (obj != null) {
                                zzxoVar.zzn(t3, obj);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    if (zzc == Integer.MAX_VALUE) {
                        for (int i10 = this.zzl; i10 < this.zzm; i10++) {
                            zzG(t3, this.zzk[i10], obj, zzxoVar);
                        }
                        if (obj != null) {
                            zzxoVar.zzn(t3, obj);
                            return;
                        }
                        return;
                    }
                    Object zzd = !this.zzh ? null : zzukVar.zzd(zzujVar, this.zzg, zzc);
                    if (zzd != null) {
                        if (zzuoVar == null) {
                            zzuoVar = zzukVar.zzc(t3);
                        }
                        zzuo<?> zzuoVar2 = zzuoVar;
                        obj = zzukVar.zze(zzwwVar, zzd, zzujVar, zzuoVar2, obj, zzxoVar);
                        zzuoVar = zzuoVar2;
                    } else {
                        zzxoVar.zzq(zzwwVar);
                        if (obj == null) {
                            obj = zzxoVar.zzc(t3);
                        }
                        if (!zzxoVar.zzp(obj, zzwwVar)) {
                            for (int i11 = this.zzl; i11 < this.zzm; i11++) {
                                zzG(t3, this.zzk[i11], obj, zzxoVar);
                            }
                            if (obj != null) {
                                zzxoVar.zzn(t3, obj);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i12 = this.zzl; i12 < this.zzm; i12++) {
                    zzG(t3, this.zzk[i12], obj, zzxoVar);
                }
                if (obj != null) {
                    zzxoVar.zzn(t3, obj);
                }
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final void zzi(T t3, byte[] bArr, int i, int i9, zzsl zzslVar) {
        if (this.zzj) {
            zzv(t3, bArr, i, i9, zzslVar);
        } else {
            zzc(t3, bArr, i, i9, 0, zzslVar);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final boolean zzj(T t3, T t10) {
        boolean zzH;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzC = zzC(i);
            long j10 = zzC & 1048575;
            switch (zzB(zzC)) {
                case 0:
                    if (zzO(t3, t10, i) && Double.doubleToLongBits(zzxy.zza(t3, j10)) == Double.doubleToLongBits(zzxy.zza(t10, j10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzO(t3, t10, i) && Float.floatToIntBits(zzxy.zzb(t3, j10)) == Float.floatToIntBits(zzxy.zzb(t10, j10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzO(t3, t10, i) && zzxy.zzd(t3, j10) == zzxy.zzd(t10, j10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzO(t3, t10, i) && zzxy.zzd(t3, j10) == zzxy.zzd(t10, j10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzO(t3, t10, i) && zzxy.zzc(t3, j10) == zzxy.zzc(t10, j10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzO(t3, t10, i) && zzxy.zzd(t3, j10) == zzxy.zzd(t10, j10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzO(t3, t10, i) && zzxy.zzc(t3, j10) == zzxy.zzc(t10, j10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzO(t3, t10, i) && zzxy.zzw(t3, j10) == zzxy.zzw(t10, j10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzO(t3, t10, i) && zzwz.zzH(zzxy.zzf(t3, j10), zzxy.zzf(t10, j10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzO(t3, t10, i) && zzwz.zzH(zzxy.zzf(t3, j10), zzxy.zzf(t10, j10))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzO(t3, t10, i) && zzwz.zzH(zzxy.zzf(t3, j10), zzxy.zzf(t10, j10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzO(t3, t10, i) && zzxy.zzc(t3, j10) == zzxy.zzc(t10, j10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzO(t3, t10, i) && zzxy.zzc(t3, j10) == zzxy.zzc(t10, j10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzO(t3, t10, i) && zzxy.zzc(t3, j10) == zzxy.zzc(t10, j10)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzO(t3, t10, i) && zzxy.zzd(t3, j10) == zzxy.zzd(t10, j10)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzO(t3, t10, i) && zzxy.zzc(t3, j10) == zzxy.zzc(t10, j10)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzO(t3, t10, i) && zzxy.zzd(t3, j10) == zzxy.zzd(t10, j10)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzO(t3, t10, i) && zzwz.zzH(zzxy.zzf(t3, j10), zzxy.zzf(t10, j10))) {
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
                    zzH = zzwz.zzH(zzxy.zzf(t3, j10), zzxy.zzf(t10, j10));
                    break;
                case 50:
                    zzH = zzwz.zzH(zzxy.zzf(t3, j10), zzxy.zzf(t10, j10));
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
                    long zzz = zzz(i) & 1048575;
                    if (zzxy.zzc(t3, zzz) == zzxy.zzc(t10, zzz) && zzwz.zzH(zzxy.zzf(t3, j10), zzxy.zzf(t10, j10))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzH) {
                return false;
            }
        }
        if (!this.zzo.zzd(t3).equals(this.zzo.zzd(t10))) {
            return false;
        }
        if (this.zzh) {
            return this.zzp.zzb(t3).equals(this.zzp.zzb(t10));
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.gtm.zzwx
    public final boolean zzk(T t3) {
        int i;
        int i9;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.zzl) {
            int i13 = this.zzk[i12];
            int i14 = this.zzc[i13];
            int zzC = zzC(i13);
            int i15 = this.zzc[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i10) {
                if (i16 != 1048575) {
                    i11 = zzb.getInt(t3, i16);
                }
                i9 = i11;
                i = i16;
            } else {
                i = i10;
                i9 = i11;
            }
            if ((268435456 & zzC) != 0 && !zzR(t3, i13, i, i9, i17)) {
                return false;
            }
            int zzB = zzB(zzC);
            if (zzB != 9 && zzB != 17) {
                if (zzB != 27) {
                    if (zzB == 60 || zzB == 68) {
                        if (zzT(t3, i14, i13) && !zzS(t3, zzC, zzF(i13))) {
                            return false;
                        }
                    } else if (zzB != 49) {
                        if (zzB == 50 && !((zzwe) zzxy.zzf(t3, zzC & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzxy.zzf(t3, zzC & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzwx zzF = zzF(i13);
                    for (int i18 = 0; i18 < list.size(); i18++) {
                        if (!zzF.zzk(list.get(i18))) {
                            return false;
                        }
                    }
                }
            } else if (zzR(t3, i13, i, i9, i17) && !zzS(t3, zzC, zzF(i13))) {
                return false;
            }
            i12++;
            i10 = i;
            i11 = i9;
        }
        return !this.zzh || this.zzp.zzb(t3).zzk();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0507  */
    @Override // com.google.android.gms.internal.gtm.zzwx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzn(T r13, com.google.android.gms.internal.gtm.zztp r14) {
        /*
            Method dump skipped, instructions count: 1464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzwn.zzn(java.lang.Object, com.google.android.gms.internal.gtm.zztp):void");
    }
}
