package com.google.android.gms.internal.measurement;

import com.google.android.gms.measurement.internal.a;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
final class zzlf<T> implements zzln<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzml.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzkq zzm;
    private final zzmb<?, ?> zzn;
    private final zzjk<?> zzo;
    private final zzlh zzp;
    private final zzkx zzq;

    /* JADX WARN: Multi-variable type inference failed */
    private zzlf(int[] iArr, int[] iArr2, Object[] objArr, int i, int i9, zzlc zzlcVar, boolean z10, boolean z11, int[] iArr3, int i10, int i11, zzlh zzlhVar, zzkq zzkqVar, zzmb<?, ?> zzmbVar, zzjk<?> zzjkVar, zzkx zzkxVar) {
        this.zzc = iArr;
        this.zzd = iArr2;
        this.zze = objArr;
        this.zzf = i;
        this.zzi = zzlcVar;
        boolean z12 = false;
        if (zzmbVar != 0 && zzmbVar.zzc((zzlc) i9)) {
            z12 = true;
        }
        this.zzh = z12;
        this.zzj = z11;
        this.zzk = iArr3;
        this.zzl = i10;
        this.zzp = i11;
        this.zzm = zzlhVar;
        this.zzn = zzkqVar;
        this.zzo = zzmbVar;
        this.zzg = i9;
        this.zzq = zzjkVar;
    }

    private static int zzA(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzB(int i) {
        return this.zzc[i + 1];
    }

    private static <T> long zzC(T t3, long j10) {
        return ((Long) zzml.zzf(t3, j10)).longValue();
    }

    private final zzkb zzD(int i) {
        int i9 = i / 3;
        return (zzkb) this.zzd[i9 + i9 + 1];
    }

    private final zzln zzE(int i) {
        int i9 = i / 3;
        int i10 = i9 + i9;
        zzln zzlnVar = (zzln) this.zzd[i10];
        if (zzlnVar != null) {
            return zzlnVar;
        }
        zzln<T> zzb2 = zzlk.zza().zzb((Class) this.zzd[i10 + 1]);
        this.zzd[i10] = zzb2;
        return zzb2;
    }

    private final Object zzF(int i) {
        int i9 = i / 3;
        return this.zzd[i9 + i9];
    }

    private static Field zzG(Class<?> cls, String str) {
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

    private final void zzH(T t3, T t10, int i) {
        long zzB = zzB(i) & 1048575;
        if (zzM(t10, i)) {
            Object zzf = zzml.zzf(t3, zzB);
            Object zzf2 = zzml.zzf(t10, zzB);
            if (zzf != null && zzf2 != null) {
                zzml.zzs(t3, zzB, zzkf.zzg(zzf, zzf2));
                zzJ(t3, i);
            } else if (zzf2 != null) {
                zzml.zzs(t3, zzB, zzf2);
                zzJ(t3, i);
            }
        }
    }

    private final void zzI(T t3, T t10, int i) {
        int zzB = zzB(i);
        int i9 = this.zzc[i];
        long j10 = zzB & 1048575;
        if (zzP(t10, i9, i)) {
            Object zzf = zzP(t3, i9, i) ? zzml.zzf(t3, j10) : null;
            Object zzf2 = zzml.zzf(t10, j10);
            if (zzf != null && zzf2 != null) {
                zzml.zzs(t3, j10, zzkf.zzg(zzf, zzf2));
                zzK(t3, i9, i);
            } else if (zzf2 != null) {
                zzml.zzs(t3, j10, zzf2);
                zzK(t3, i9, i);
            }
        }
    }

    private final void zzJ(T t3, int i) {
        int zzy = zzy(i);
        long j10 = 1048575 & zzy;
        if (j10 == 1048575) {
            return;
        }
        zzml.zzq(t3, j10, (1 << (zzy >>> 20)) | zzml.zzc(t3, j10));
    }

    private final void zzK(T t3, int i, int i9) {
        zzml.zzq(t3, zzy(i9) & 1048575, i);
    }

    private final boolean zzL(T t3, T t10, int i) {
        return zzM(t3, i) == zzM(t10, i);
    }

    private final boolean zzM(T t3, int i) {
        int zzy = zzy(i);
        long j10 = zzy & 1048575;
        if (j10 != 1048575) {
            return (zzml.zzc(t3, j10) & (1 << (zzy >>> 20))) != 0;
        }
        int zzB = zzB(i);
        long j11 = zzB & 1048575;
        switch (zzA(zzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzml.zza(t3, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzml.zzb(t3, j11)) != 0;
            case 2:
                return zzml.zzd(t3, j11) != 0;
            case 3:
                return zzml.zzd(t3, j11) != 0;
            case 4:
                return zzml.zzc(t3, j11) != 0;
            case 5:
                return zzml.zzd(t3, j11) != 0;
            case 6:
                return zzml.zzc(t3, j11) != 0;
            case 7:
                return zzml.zzw(t3, j11);
            case 8:
                Object zzf = zzml.zzf(t3, j11);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzix) {
                    return !zzix.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzml.zzf(t3, j11) != null;
            case 10:
                return !zzix.zzb.equals(zzml.zzf(t3, j11));
            case 11:
                return zzml.zzc(t3, j11) != 0;
            case 12:
                return zzml.zzc(t3, j11) != 0;
            case 13:
                return zzml.zzc(t3, j11) != 0;
            case 14:
                return zzml.zzd(t3, j11) != 0;
            case 15:
                return zzml.zzc(t3, j11) != 0;
            case 16:
                return zzml.zzd(t3, j11) != 0;
            case 17:
                return zzml.zzf(t3, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzN(T t3, int i, int i9, int i10, int i11) {
        return i9 == 1048575 ? zzM(t3, i) : (i10 & i11) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zzO(Object obj, int i, zzln zzlnVar) {
        return zzlnVar.zzj(zzml.zzf(obj, i & 1048575));
    }

    private final boolean zzP(T t3, int i, int i9) {
        return zzml.zzc(t3, (long) (zzy(i9) & 1048575)) == i;
    }

    private static <T> boolean zzQ(T t3, long j10) {
        return ((Boolean) zzml.zzf(t3, j10)).booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzR(T t3, zzjf zzjfVar) {
        int i;
        boolean z10;
        if (this.zzh) {
            this.zzo.zza(t3);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i9 = 1048575;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int zzB = zzB(i11);
            int i13 = this.zzc[i11];
            int zzA = zzA(zzB);
            if (zzA <= 17) {
                int i14 = this.zzc[i11 + 2];
                int i15 = i14 & i9;
                if (i15 != i10) {
                    i12 = unsafe.getInt(t3, i15);
                    i10 = i15;
                }
                i = 1 << (i14 >>> 20);
            } else {
                i = 0;
            }
            long j10 = zzB & i9;
            switch (zzA) {
                case 0:
                    if ((i12 & i) == 0) {
                        break;
                    } else {
                        zzjfVar.zzf(i13, zzml.zza(t3, j10));
                        break;
                    }
                case 1:
                    if ((i12 & i) == 0) {
                        break;
                    } else {
                        zzjfVar.zzo(i13, zzml.zzb(t3, j10));
                        break;
                    }
                case 2:
                    if ((i12 & i) == 0) {
                        break;
                    } else {
                        zzjfVar.zzt(i13, unsafe.getLong(t3, j10));
                        break;
                    }
                case 3:
                    if ((i12 & i) == 0) {
                        break;
                    } else {
                        zzjfVar.zzJ(i13, unsafe.getLong(t3, j10));
                        break;
                    }
                case 4:
                    if ((i12 & i) == 0) {
                        break;
                    } else {
                        zzjfVar.zzr(i13, unsafe.getInt(t3, j10));
                        break;
                    }
                case 5:
                    if ((i12 & i) == 0) {
                        break;
                    } else {
                        zzjfVar.zzm(i13, unsafe.getLong(t3, j10));
                        break;
                    }
                case 6:
                    if ((i12 & i) == 0) {
                        break;
                    } else {
                        zzjfVar.zzk(i13, unsafe.getInt(t3, j10));
                        break;
                    }
                case 7:
                    if ((i12 & i) == 0) {
                        break;
                    } else {
                        zzjfVar.zzb(i13, zzml.zzw(t3, j10));
                        break;
                    }
                case 8:
                    if ((i12 & i) == 0) {
                        break;
                    } else {
                        zzT(i13, unsafe.getObject(t3, j10), zzjfVar);
                        break;
                    }
                case 9:
                    if ((i12 & i) == 0) {
                        break;
                    } else {
                        zzjfVar.zzv(i13, unsafe.getObject(t3, j10), zzE(i11));
                        break;
                    }
                case 10:
                    if ((i12 & i) == 0) {
                        break;
                    } else {
                        zzjfVar.zzd(i13, (zzix) unsafe.getObject(t3, j10));
                        break;
                    }
                case 11:
                    if ((i12 & i) == 0) {
                        break;
                    } else {
                        zzjfVar.zzH(i13, unsafe.getInt(t3, j10));
                        break;
                    }
                case 12:
                    if ((i12 & i) == 0) {
                        break;
                    } else {
                        zzjfVar.zzi(i13, unsafe.getInt(t3, j10));
                        break;
                    }
                case 13:
                    if ((i12 & i) == 0) {
                        break;
                    } else {
                        zzjfVar.zzw(i13, unsafe.getInt(t3, j10));
                        break;
                    }
                case 14:
                    if ((i12 & i) == 0) {
                        break;
                    } else {
                        zzjfVar.zzy(i13, unsafe.getLong(t3, j10));
                        break;
                    }
                case 15:
                    if ((i12 & i) == 0) {
                        break;
                    } else {
                        zzjfVar.zzA(i13, unsafe.getInt(t3, j10));
                        break;
                    }
                case 16:
                    if ((i12 & i) == 0) {
                        break;
                    } else {
                        zzjfVar.zzC(i13, unsafe.getLong(t3, j10));
                        break;
                    }
                case 17:
                    if ((i12 & i) == 0) {
                        break;
                    } else {
                        zzjfVar.zzq(i13, unsafe.getObject(t3, j10), zzE(i11));
                        break;
                    }
                case 18:
                    zzlp.zzL(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, false);
                    break;
                case 19:
                    zzlp.zzP(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, false);
                    break;
                case 20:
                    zzlp.zzS(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, false);
                    break;
                case 21:
                    zzlp.zzaa(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, false);
                    break;
                case 22:
                    zzlp.zzR(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, false);
                    break;
                case 23:
                    zzlp.zzO(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, false);
                    break;
                case 24:
                    zzlp.zzN(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, false);
                    break;
                case 25:
                    zzlp.zzJ(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, false);
                    break;
                case 26:
                    zzlp.zzY(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar);
                    break;
                case 27:
                    zzlp.zzT(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, zzE(i11));
                    break;
                case 28:
                    zzlp.zzK(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar);
                    break;
                case 29:
                    z10 = false;
                    zzlp.zzZ(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, false);
                    break;
                case 30:
                    z10 = false;
                    zzlp.zzM(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, false);
                    break;
                case 31:
                    z10 = false;
                    zzlp.zzU(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, false);
                    break;
                case 32:
                    z10 = false;
                    zzlp.zzV(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, false);
                    break;
                case 33:
                    z10 = false;
                    zzlp.zzW(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, false);
                    break;
                case 34:
                    z10 = false;
                    zzlp.zzX(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, false);
                    break;
                case 35:
                    zzlp.zzL(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, true);
                    break;
                case 36:
                    zzlp.zzP(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, true);
                    break;
                case 37:
                    zzlp.zzS(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, true);
                    break;
                case 38:
                    zzlp.zzaa(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, true);
                    break;
                case 39:
                    zzlp.zzR(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, true);
                    break;
                case 40:
                    zzlp.zzO(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, true);
                    break;
                case 41:
                    zzlp.zzN(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, true);
                    break;
                case 42:
                    zzlp.zzJ(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, true);
                    break;
                case 43:
                    zzlp.zzZ(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, true);
                    break;
                case 44:
                    zzlp.zzM(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, true);
                    break;
                case 45:
                    zzlp.zzU(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, true);
                    break;
                case 46:
                    zzlp.zzV(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, true);
                    break;
                case 47:
                    zzlp.zzW(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, true);
                    break;
                case 48:
                    zzlp.zzX(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, true);
                    break;
                case 49:
                    zzlp.zzQ(this.zzc[i11], (List) unsafe.getObject(t3, j10), zzjfVar, zzE(i11));
                    break;
                case 50:
                    zzS(zzjfVar, i13, unsafe.getObject(t3, j10), i11);
                    break;
                case 51:
                    if (zzP(t3, i13, i11)) {
                        zzjfVar.zzf(i13, zzn(t3, j10));
                    }
                    break;
                case 52:
                    if (zzP(t3, i13, i11)) {
                        zzjfVar.zzo(i13, zzo(t3, j10));
                    }
                    break;
                case 53:
                    if (zzP(t3, i13, i11)) {
                        zzjfVar.zzt(i13, zzC(t3, j10));
                    }
                    break;
                case 54:
                    if (zzP(t3, i13, i11)) {
                        zzjfVar.zzJ(i13, zzC(t3, j10));
                    }
                    break;
                case 55:
                    if (zzP(t3, i13, i11)) {
                        zzjfVar.zzr(i13, zzr(t3, j10));
                    }
                    break;
                case 56:
                    if (zzP(t3, i13, i11)) {
                        zzjfVar.zzm(i13, zzC(t3, j10));
                    }
                    break;
                case 57:
                    if (zzP(t3, i13, i11)) {
                        zzjfVar.zzk(i13, zzr(t3, j10));
                    }
                    break;
                case 58:
                    if (zzP(t3, i13, i11)) {
                        zzjfVar.zzb(i13, zzQ(t3, j10));
                    }
                    break;
                case 59:
                    if (zzP(t3, i13, i11)) {
                        zzT(i13, unsafe.getObject(t3, j10), zzjfVar);
                    }
                    break;
                case 60:
                    if (zzP(t3, i13, i11)) {
                        zzjfVar.zzv(i13, unsafe.getObject(t3, j10), zzE(i11));
                    }
                    break;
                case 61:
                    if (zzP(t3, i13, i11)) {
                        zzjfVar.zzd(i13, (zzix) unsafe.getObject(t3, j10));
                    }
                    break;
                case 62:
                    if (zzP(t3, i13, i11)) {
                        zzjfVar.zzH(i13, zzr(t3, j10));
                    }
                    break;
                case 63:
                    if (zzP(t3, i13, i11)) {
                        zzjfVar.zzi(i13, zzr(t3, j10));
                    }
                    break;
                case 64:
                    if (zzP(t3, i13, i11)) {
                        zzjfVar.zzw(i13, zzr(t3, j10));
                    }
                    break;
                case 65:
                    if (zzP(t3, i13, i11)) {
                        zzjfVar.zzy(i13, zzC(t3, j10));
                    }
                    break;
                case 66:
                    if (zzP(t3, i13, i11)) {
                        zzjfVar.zzA(i13, zzr(t3, j10));
                    }
                    break;
                case 67:
                    if (zzP(t3, i13, i11)) {
                        zzjfVar.zzC(i13, zzC(t3, j10));
                    }
                    break;
                case 68:
                    if (zzP(t3, i13, i11)) {
                        zzjfVar.zzq(i13, unsafe.getObject(t3, j10), zzE(i11));
                    }
                    break;
            }
            i11 += 3;
            i9 = 1048575;
        }
        zzmb<?, ?> zzmbVar = this.zzn;
        zzmbVar.zzi(zzmbVar.zzc(t3), zzjfVar);
    }

    private final <K, V> void zzS(zzjf zzjfVar, int i, Object obj, int i9) {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private static final void zzT(int i, Object obj, zzjf zzjfVar) {
        if (obj instanceof String) {
            zzjfVar.zzF(i, (String) obj);
        } else {
            zzjfVar.zzd(i, (zzix) obj);
        }
    }

    public static zzmc zzd(Object obj) {
        zzjx zzjxVar = (zzjx) obj;
        zzmc zzmcVar = zzjxVar.zzc;
        if (zzmcVar != zzmc.zzc()) {
            return zzmcVar;
        }
        zzmc zze = zzmc.zze();
        zzjxVar.zzc = zze;
        return zze;
    }

    public static <T> zzlf<T> zzk(Class<T> cls, zzkz zzkzVar, zzlh zzlhVar, zzkq zzkqVar, zzmb<?, ?> zzmbVar, zzjk<?> zzjkVar, zzkx zzkxVar) {
        if (zzkzVar instanceof zzlm) {
            return zzl((zzlm) zzkzVar, zzlhVar, zzkqVar, zzmbVar, zzjkVar, zzkxVar);
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
    public static <T> com.google.android.gms.internal.measurement.zzlf<T> zzl(com.google.android.gms.internal.measurement.zzlm r34, com.google.android.gms.internal.measurement.zzlh r35, com.google.android.gms.internal.measurement.zzkq r36, com.google.android.gms.internal.measurement.zzmb<?, ?> r37, com.google.android.gms.internal.measurement.zzjk<?> r38, com.google.android.gms.internal.measurement.zzkx r39) {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlf.zzl(com.google.android.gms.internal.measurement.zzlm, com.google.android.gms.internal.measurement.zzlh, com.google.android.gms.internal.measurement.zzkq, com.google.android.gms.internal.measurement.zzmb, com.google.android.gms.internal.measurement.zzjk, com.google.android.gms.internal.measurement.zzkx):com.google.android.gms.internal.measurement.zzlf");
    }

    private static <T> double zzn(T t3, long j10) {
        return ((Double) zzml.zzf(t3, j10)).doubleValue();
    }

    private static <T> float zzo(T t3, long j10) {
        return ((Float) zzml.zzf(t3, j10)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzp(T t3) {
        int i;
        int zzA;
        int zzB;
        int i9;
        int zzA2;
        int zzv;
        int zzo;
        int zzu;
        boolean z10;
        int zzd;
        int zzA3;
        int zzB2;
        int i10;
        int zzA4;
        int zzv2;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < this.zzc.length) {
            int zzB3 = zzB(i13);
            int i16 = this.zzc[i13];
            int zzA5 = zzA(zzB3);
            if (zzA5 <= 17) {
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
            long j10 = zzB3 & i11;
            switch (zzA5) {
                case 0:
                    if ((i15 & i) == 0) {
                        break;
                    } else {
                        i14 = androidx.camera.core.impl.utils.a.v(i16 << 3, 8, i14);
                        break;
                    }
                case 1:
                    if ((i15 & i) == 0) {
                        break;
                    } else {
                        i14 = androidx.camera.core.impl.utils.a.v(i16 << 3, 4, i14);
                        break;
                    }
                case 2:
                    if ((i15 & i) == 0) {
                        break;
                    } else {
                        long j11 = unsafe.getLong(t3, j10);
                        zzA = zzje.zzA(i16 << 3);
                        zzB = zzje.zzB(j11);
                        i9 = zzB + zzA;
                        i14 += i9;
                        break;
                    }
                case 3:
                    if ((i15 & i) == 0) {
                        break;
                    } else {
                        long j12 = unsafe.getLong(t3, j10);
                        zzA = zzje.zzA(i16 << 3);
                        zzB = zzje.zzB(j12);
                        i9 = zzB + zzA;
                        i14 += i9;
                        break;
                    }
                case 4:
                    if ((i15 & i) == 0) {
                        break;
                    } else {
                        int i19 = unsafe.getInt(t3, j10);
                        zzA2 = zzje.zzA(i16 << 3);
                        zzv = zzje.zzv(i19);
                        i9 = zzv + zzA2;
                        i14 += i9;
                        break;
                    }
                case 5:
                    if ((i15 & i) == 0) {
                        break;
                    } else {
                        i14 = androidx.camera.core.impl.utils.a.v(i16 << 3, 8, i14);
                        break;
                    }
                case 6:
                    if ((i15 & i) == 0) {
                        break;
                    } else {
                        i14 = androidx.camera.core.impl.utils.a.v(i16 << 3, 4, i14);
                        break;
                    }
                case 7:
                    if ((i15 & i) == 0) {
                        break;
                    } else {
                        i14 = androidx.camera.core.impl.utils.a.v(i16 << 3, 1, i14);
                        break;
                    }
                case 8:
                    if ((i15 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(t3, j10);
                        if (!(object instanceof zzix)) {
                            zzA2 = zzje.zzA(i16 << 3);
                            zzv = zzje.zzy((String) object);
                            i9 = zzv + zzA2;
                            i14 += i9;
                            break;
                        } else {
                            int zzA6 = zzje.zzA(i16 << 3);
                            int zzd2 = ((zzix) object).zzd();
                            i14 = androidx.camera.core.impl.utils.a.A(zzd2, zzd2, zzA6, i14);
                            break;
                        }
                    }
                case 9:
                    if ((i15 & i) == 0) {
                        break;
                    } else {
                        zzo = zzlp.zzo(i16, unsafe.getObject(t3, j10), zzE(i13));
                        i14 += zzo;
                        break;
                    }
                case 10:
                    if ((i15 & i) == 0) {
                        break;
                    } else {
                        zzix zzixVar = (zzix) unsafe.getObject(t3, j10);
                        int zzA7 = zzje.zzA(i16 << 3);
                        int zzd3 = zzixVar.zzd();
                        i14 = androidx.camera.core.impl.utils.a.A(zzd3, zzd3, zzA7, i14);
                        break;
                    }
                case 11:
                    if ((i15 & i) == 0) {
                        break;
                    } else {
                        i14 = androidx.camera.core.impl.utils.a.v(unsafe.getInt(t3, j10), zzje.zzA(i16 << 3), i14);
                        break;
                    }
                case 12:
                    if ((i15 & i) == 0) {
                        break;
                    } else {
                        int i20 = unsafe.getInt(t3, j10);
                        zzA2 = zzje.zzA(i16 << 3);
                        zzv = zzje.zzv(i20);
                        i9 = zzv + zzA2;
                        i14 += i9;
                        break;
                    }
                case 13:
                    if ((i15 & i) == 0) {
                        break;
                    } else {
                        i14 = androidx.camera.core.impl.utils.a.v(i16 << 3, 4, i14);
                        break;
                    }
                case 14:
                    if ((i15 & i) == 0) {
                        break;
                    } else {
                        i14 = androidx.camera.core.impl.utils.a.v(i16 << 3, 8, i14);
                        break;
                    }
                case 15:
                    if ((i15 & i) == 0) {
                        break;
                    } else {
                        int i21 = unsafe.getInt(t3, j10);
                        i14 = androidx.camera.core.impl.utils.a.v((i21 >> 31) ^ (i21 + i21), zzje.zzA(i16 << 3), i14);
                        break;
                    }
                case 16:
                    if ((i15 & i) == 0) {
                        break;
                    } else {
                        long j13 = unsafe.getLong(t3, j10);
                        i9 = zzje.zzB((j13 >> 63) ^ (j13 + j13)) + zzje.zzA(i16 << 3);
                        i14 += i9;
                        break;
                    }
                case 17:
                    if ((i15 & i) == 0) {
                        break;
                    } else {
                        i9 = zzje.zzu(i16, (zzlc) unsafe.getObject(t3, j10), zzE(i13));
                        i14 += i9;
                        break;
                    }
                case 18:
                    zzo = zzlp.zzh(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzo;
                    break;
                case 19:
                    zzo = zzlp.zzf(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzo;
                    break;
                case 20:
                    zzo = zzlp.zzm(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzo;
                    break;
                case 21:
                    zzo = zzlp.zzx(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzo;
                    break;
                case 22:
                    zzo = zzlp.zzk(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzo;
                    break;
                case 23:
                    zzo = zzlp.zzh(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzo;
                    break;
                case 24:
                    zzo = zzlp.zzf(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzo;
                    break;
                case 25:
                    zzo = zzlp.zza(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzo;
                    break;
                case 26:
                    zzu = zzlp.zzu(i16, (List) unsafe.getObject(t3, j10));
                    i14 += zzu;
                    break;
                case 27:
                    zzu = zzlp.zzp(i16, (List) unsafe.getObject(t3, j10), zzE(i13));
                    i14 += zzu;
                    break;
                case 28:
                    zzu = zzlp.zzc(i16, (List) unsafe.getObject(t3, j10));
                    i14 += zzu;
                    break;
                case 29:
                    zzu = zzlp.zzv(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzu;
                    break;
                case 30:
                    z10 = false;
                    zzd = zzlp.zzd(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzd;
                    break;
                case 31:
                    z10 = false;
                    zzd = zzlp.zzf(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzd;
                    break;
                case 32:
                    z10 = false;
                    zzd = zzlp.zzh(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzd;
                    break;
                case 33:
                    z10 = false;
                    zzd = zzlp.zzq(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzd;
                    break;
                case 34:
                    z10 = false;
                    zzd = zzlp.zzs(i16, (List) unsafe.getObject(t3, j10), false);
                    i14 += zzd;
                    break;
                case 35:
                    int zzi = zzlp.zzi((List) unsafe.getObject(t3, j10));
                    if (zzi > 0) {
                        i14 = androidx.camera.core.impl.utils.a.A(zzi, zzje.zzz(i16), zzi, i14);
                    }
                    break;
                case 36:
                    int zzg = zzlp.zzg((List) unsafe.getObject(t3, j10));
                    if (zzg > 0) {
                        i14 = androidx.camera.core.impl.utils.a.A(zzg, zzje.zzz(i16), zzg, i14);
                    }
                    break;
                case 37:
                    int zzn = zzlp.zzn((List) unsafe.getObject(t3, j10));
                    if (zzn > 0) {
                        i14 = androidx.camera.core.impl.utils.a.A(zzn, zzje.zzz(i16), zzn, i14);
                    }
                    break;
                case 38:
                    int zzy = zzlp.zzy((List) unsafe.getObject(t3, j10));
                    if (zzy > 0) {
                        i14 = androidx.camera.core.impl.utils.a.A(zzy, zzje.zzz(i16), zzy, i14);
                    }
                    break;
                case 39:
                    int zzl = zzlp.zzl((List) unsafe.getObject(t3, j10));
                    if (zzl > 0) {
                        i14 = androidx.camera.core.impl.utils.a.A(zzl, zzje.zzz(i16), zzl, i14);
                    }
                    break;
                case 40:
                    int zzi2 = zzlp.zzi((List) unsafe.getObject(t3, j10));
                    if (zzi2 > 0) {
                        i14 = androidx.camera.core.impl.utils.a.A(zzi2, zzje.zzz(i16), zzi2, i14);
                    }
                    break;
                case 41:
                    int zzg2 = zzlp.zzg((List) unsafe.getObject(t3, j10));
                    if (zzg2 > 0) {
                        i14 = androidx.camera.core.impl.utils.a.A(zzg2, zzje.zzz(i16), zzg2, i14);
                    }
                    break;
                case 42:
                    int zzb2 = zzlp.zzb((List) unsafe.getObject(t3, j10));
                    if (zzb2 > 0) {
                        i14 = androidx.camera.core.impl.utils.a.A(zzb2, zzje.zzz(i16), zzb2, i14);
                    }
                    break;
                case 43:
                    int zzw = zzlp.zzw((List) unsafe.getObject(t3, j10));
                    if (zzw > 0) {
                        i14 = androidx.camera.core.impl.utils.a.A(zzw, zzje.zzz(i16), zzw, i14);
                    }
                    break;
                case 44:
                    int zze = zzlp.zze((List) unsafe.getObject(t3, j10));
                    if (zze > 0) {
                        i14 = androidx.camera.core.impl.utils.a.A(zze, zzje.zzz(i16), zze, i14);
                    }
                    break;
                case 45:
                    int zzg3 = zzlp.zzg((List) unsafe.getObject(t3, j10));
                    if (zzg3 > 0) {
                        i14 = androidx.camera.core.impl.utils.a.A(zzg3, zzje.zzz(i16), zzg3, i14);
                    }
                    break;
                case 46:
                    int zzi3 = zzlp.zzi((List) unsafe.getObject(t3, j10));
                    if (zzi3 > 0) {
                        i14 = androidx.camera.core.impl.utils.a.A(zzi3, zzje.zzz(i16), zzi3, i14);
                    }
                    break;
                case 47:
                    int zzr = zzlp.zzr((List) unsafe.getObject(t3, j10));
                    if (zzr > 0) {
                        i14 = androidx.camera.core.impl.utils.a.A(zzr, zzje.zzz(i16), zzr, i14);
                    }
                    break;
                case 48:
                    int zzt = zzlp.zzt((List) unsafe.getObject(t3, j10));
                    if (zzt > 0) {
                        i14 = androidx.camera.core.impl.utils.a.A(zzt, zzje.zzz(i16), zzt, i14);
                    }
                    break;
                case 49:
                    zzu = zzlp.zzj(i16, (List) unsafe.getObject(t3, j10), zzE(i13));
                    i14 += zzu;
                    break;
                case 50:
                    zzkx.zza(i16, unsafe.getObject(t3, j10), zzF(i13));
                    break;
                case 51:
                    if (zzP(t3, i16, i13)) {
                        i14 = androidx.camera.core.impl.utils.a.v(i16 << 3, 8, i14);
                    }
                    break;
                case 52:
                    if (zzP(t3, i16, i13)) {
                        i14 = androidx.camera.core.impl.utils.a.v(i16 << 3, 4, i14);
                    }
                    break;
                case 53:
                    if (zzP(t3, i16, i13)) {
                        long zzC = zzC(t3, j10);
                        zzA3 = zzje.zzA(i16 << 3);
                        zzB2 = zzje.zzB(zzC);
                        i10 = zzB2 + zzA3;
                        i14 += i10;
                    }
                    break;
                case 54:
                    if (zzP(t3, i16, i13)) {
                        long zzC2 = zzC(t3, j10);
                        zzA3 = zzje.zzA(i16 << 3);
                        zzB2 = zzje.zzB(zzC2);
                        i10 = zzB2 + zzA3;
                        i14 += i10;
                    }
                    break;
                case 55:
                    if (zzP(t3, i16, i13)) {
                        int zzr2 = zzr(t3, j10);
                        zzA4 = zzje.zzA(i16 << 3);
                        zzv2 = zzje.zzv(zzr2);
                        i10 = zzv2 + zzA4;
                        i14 += i10;
                    }
                    break;
                case 56:
                    if (zzP(t3, i16, i13)) {
                        i14 = androidx.camera.core.impl.utils.a.v(i16 << 3, 8, i14);
                    }
                    break;
                case 57:
                    if (zzP(t3, i16, i13)) {
                        i14 = androidx.camera.core.impl.utils.a.v(i16 << 3, 4, i14);
                    }
                    break;
                case 58:
                    if (zzP(t3, i16, i13)) {
                        i14 = androidx.camera.core.impl.utils.a.v(i16 << 3, 1, i14);
                    }
                    break;
                case 59:
                    if (zzP(t3, i16, i13)) {
                        Object object2 = unsafe.getObject(t3, j10);
                        if (object2 instanceof zzix) {
                            int zzA8 = zzje.zzA(i16 << 3);
                            int zzd4 = ((zzix) object2).zzd();
                            i14 = androidx.camera.core.impl.utils.a.A(zzd4, zzd4, zzA8, i14);
                        } else {
                            zzA4 = zzje.zzA(i16 << 3);
                            zzv2 = zzje.zzy((String) object2);
                            i10 = zzv2 + zzA4;
                            i14 += i10;
                        }
                    }
                    break;
                case 60:
                    if (zzP(t3, i16, i13)) {
                        zzu = zzlp.zzo(i16, unsafe.getObject(t3, j10), zzE(i13));
                        i14 += zzu;
                    }
                    break;
                case 61:
                    if (zzP(t3, i16, i13)) {
                        zzix zzixVar2 = (zzix) unsafe.getObject(t3, j10);
                        int zzA9 = zzje.zzA(i16 << 3);
                        int zzd5 = zzixVar2.zzd();
                        i14 = androidx.camera.core.impl.utils.a.A(zzd5, zzd5, zzA9, i14);
                    }
                    break;
                case 62:
                    if (zzP(t3, i16, i13)) {
                        i14 = androidx.camera.core.impl.utils.a.v(zzr(t3, j10), zzje.zzA(i16 << 3), i14);
                    }
                    break;
                case 63:
                    if (zzP(t3, i16, i13)) {
                        int zzr3 = zzr(t3, j10);
                        zzA4 = zzje.zzA(i16 << 3);
                        zzv2 = zzje.zzv(zzr3);
                        i10 = zzv2 + zzA4;
                        i14 += i10;
                    }
                    break;
                case 64:
                    if (zzP(t3, i16, i13)) {
                        i14 = androidx.camera.core.impl.utils.a.v(i16 << 3, 4, i14);
                    }
                    break;
                case 65:
                    if (zzP(t3, i16, i13)) {
                        i14 = androidx.camera.core.impl.utils.a.v(i16 << 3, 8, i14);
                    }
                    break;
                case 66:
                    if (zzP(t3, i16, i13)) {
                        int zzr4 = zzr(t3, j10);
                        i14 = androidx.camera.core.impl.utils.a.v((zzr4 >> 31) ^ (zzr4 + zzr4), zzje.zzA(i16 << 3), i14);
                    }
                    break;
                case 67:
                    if (zzP(t3, i16, i13)) {
                        long zzC3 = zzC(t3, j10);
                        i10 = zzje.zzB((zzC3 >> 63) ^ (zzC3 + zzC3)) + zzje.zzA(i16 << 3);
                        i14 += i10;
                    }
                    break;
                case 68:
                    if (zzP(t3, i16, i13)) {
                        i10 = zzje.zzu(i16, (zzlc) unsafe.getObject(t3, j10), zzE(i13));
                        i14 += i10;
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        zzmb<?, ?> zzmbVar = this.zzn;
        int zza2 = i14 + zzmbVar.zza(zzmbVar.zzc(t3));
        if (!this.zzh) {
            return zza2;
        }
        this.zzo.zza(t3);
        throw null;
    }

    private final int zzq(T t3) {
        int zzA;
        int zzB;
        int zzA2;
        int zzv;
        int zzo;
        int zzu;
        Unsafe unsafe = zzb;
        int i = 0;
        for (int i9 = 0; i9 < this.zzc.length; i9 += 3) {
            int zzB2 = zzB(i9);
            int zzA3 = zzA(zzB2);
            int i10 = this.zzc[i9];
            long j10 = zzB2 & 1048575;
            if (zzA3 >= zzjp.zzJ.zza() && zzA3 <= zzjp.zzW.zza()) {
                int i11 = this.zzc[i9 + 2];
            }
            switch (zzA3) {
                case 0:
                    if (zzM(t3, i9)) {
                        i = androidx.camera.core.impl.utils.a.v(i10 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzM(t3, i9)) {
                        i = androidx.camera.core.impl.utils.a.v(i10 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzM(t3, i9)) {
                        long zzd = zzml.zzd(t3, j10);
                        zzA = zzje.zzA(i10 << 3);
                        zzB = zzje.zzB(zzd);
                        zzu = zzB + zzA;
                        i += zzu;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzM(t3, i9)) {
                        long zzd2 = zzml.zzd(t3, j10);
                        zzA = zzje.zzA(i10 << 3);
                        zzB = zzje.zzB(zzd2);
                        zzu = zzB + zzA;
                        i += zzu;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzM(t3, i9)) {
                        int zzc = zzml.zzc(t3, j10);
                        zzA2 = zzje.zzA(i10 << 3);
                        zzv = zzje.zzv(zzc);
                        zzu = zzv + zzA2;
                        i += zzu;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzM(t3, i9)) {
                        i = androidx.camera.core.impl.utils.a.v(i10 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzM(t3, i9)) {
                        i = androidx.camera.core.impl.utils.a.v(i10 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzM(t3, i9)) {
                        i = androidx.camera.core.impl.utils.a.v(i10 << 3, 1, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzM(t3, i9)) {
                        Object zzf = zzml.zzf(t3, j10);
                        if (zzf instanceof zzix) {
                            int zzA4 = zzje.zzA(i10 << 3);
                            int zzd3 = ((zzix) zzf).zzd();
                            i = androidx.camera.core.impl.utils.a.A(zzd3, zzd3, zzA4, i);
                            break;
                        } else {
                            zzA2 = zzje.zzA(i10 << 3);
                            zzv = zzje.zzy((String) zzf);
                            zzu = zzv + zzA2;
                            i += zzu;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzM(t3, i9)) {
                        zzo = zzlp.zzo(i10, zzml.zzf(t3, j10), zzE(i9));
                        i += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzM(t3, i9)) {
                        zzix zzixVar = (zzix) zzml.zzf(t3, j10);
                        int zzA5 = zzje.zzA(i10 << 3);
                        int zzd4 = zzixVar.zzd();
                        i = androidx.camera.core.impl.utils.a.A(zzd4, zzd4, zzA5, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzM(t3, i9)) {
                        i = androidx.camera.core.impl.utils.a.v(zzml.zzc(t3, j10), zzje.zzA(i10 << 3), i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzM(t3, i9)) {
                        int zzc2 = zzml.zzc(t3, j10);
                        zzA2 = zzje.zzA(i10 << 3);
                        zzv = zzje.zzv(zzc2);
                        zzu = zzv + zzA2;
                        i += zzu;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzM(t3, i9)) {
                        i = androidx.camera.core.impl.utils.a.v(i10 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzM(t3, i9)) {
                        i = androidx.camera.core.impl.utils.a.v(i10 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzM(t3, i9)) {
                        int zzc3 = zzml.zzc(t3, j10);
                        i = androidx.camera.core.impl.utils.a.v((zzc3 >> 31) ^ (zzc3 + zzc3), zzje.zzA(i10 << 3), i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzM(t3, i9)) {
                        long zzd5 = zzml.zzd(t3, j10);
                        zzA = zzje.zzA(i10 << 3);
                        zzB = zzje.zzB((zzd5 >> 63) ^ (zzd5 + zzd5));
                        zzu = zzB + zzA;
                        i += zzu;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzM(t3, i9)) {
                        zzu = zzje.zzu(i10, (zzlc) zzml.zzf(t3, j10), zzE(i9));
                        i += zzu;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzlp.zzh(i10, (List) zzml.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 19:
                    zzo = zzlp.zzf(i10, (List) zzml.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 20:
                    zzo = zzlp.zzm(i10, (List) zzml.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 21:
                    zzo = zzlp.zzx(i10, (List) zzml.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 22:
                    zzo = zzlp.zzk(i10, (List) zzml.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 23:
                    zzo = zzlp.zzh(i10, (List) zzml.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 24:
                    zzo = zzlp.zzf(i10, (List) zzml.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 25:
                    zzo = zzlp.zza(i10, (List) zzml.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 26:
                    zzo = zzlp.zzu(i10, (List) zzml.zzf(t3, j10));
                    i += zzo;
                    break;
                case 27:
                    zzo = zzlp.zzp(i10, (List) zzml.zzf(t3, j10), zzE(i9));
                    i += zzo;
                    break;
                case 28:
                    zzo = zzlp.zzc(i10, (List) zzml.zzf(t3, j10));
                    i += zzo;
                    break;
                case 29:
                    zzo = zzlp.zzv(i10, (List) zzml.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 30:
                    zzo = zzlp.zzd(i10, (List) zzml.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 31:
                    zzo = zzlp.zzf(i10, (List) zzml.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 32:
                    zzo = zzlp.zzh(i10, (List) zzml.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 33:
                    zzo = zzlp.zzq(i10, (List) zzml.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 34:
                    zzo = zzlp.zzs(i10, (List) zzml.zzf(t3, j10), false);
                    i += zzo;
                    break;
                case 35:
                    int zzi = zzlp.zzi((List) unsafe.getObject(t3, j10));
                    if (zzi > 0) {
                        i = androidx.camera.core.impl.utils.a.A(zzi, zzje.zzz(i10), zzi, i);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int zzg = zzlp.zzg((List) unsafe.getObject(t3, j10));
                    if (zzg > 0) {
                        i = androidx.camera.core.impl.utils.a.A(zzg, zzje.zzz(i10), zzg, i);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int zzn = zzlp.zzn((List) unsafe.getObject(t3, j10));
                    if (zzn > 0) {
                        i = androidx.camera.core.impl.utils.a.A(zzn, zzje.zzz(i10), zzn, i);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int zzy = zzlp.zzy((List) unsafe.getObject(t3, j10));
                    if (zzy > 0) {
                        i = androidx.camera.core.impl.utils.a.A(zzy, zzje.zzz(i10), zzy, i);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int zzl = zzlp.zzl((List) unsafe.getObject(t3, j10));
                    if (zzl > 0) {
                        i = androidx.camera.core.impl.utils.a.A(zzl, zzje.zzz(i10), zzl, i);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int zzi2 = zzlp.zzi((List) unsafe.getObject(t3, j10));
                    if (zzi2 > 0) {
                        i = androidx.camera.core.impl.utils.a.A(zzi2, zzje.zzz(i10), zzi2, i);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int zzg2 = zzlp.zzg((List) unsafe.getObject(t3, j10));
                    if (zzg2 > 0) {
                        i = androidx.camera.core.impl.utils.a.A(zzg2, zzje.zzz(i10), zzg2, i);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int zzb2 = zzlp.zzb((List) unsafe.getObject(t3, j10));
                    if (zzb2 > 0) {
                        i = androidx.camera.core.impl.utils.a.A(zzb2, zzje.zzz(i10), zzb2, i);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int zzw = zzlp.zzw((List) unsafe.getObject(t3, j10));
                    if (zzw > 0) {
                        i = androidx.camera.core.impl.utils.a.A(zzw, zzje.zzz(i10), zzw, i);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int zze = zzlp.zze((List) unsafe.getObject(t3, j10));
                    if (zze > 0) {
                        i = androidx.camera.core.impl.utils.a.A(zze, zzje.zzz(i10), zze, i);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int zzg3 = zzlp.zzg((List) unsafe.getObject(t3, j10));
                    if (zzg3 > 0) {
                        i = androidx.camera.core.impl.utils.a.A(zzg3, zzje.zzz(i10), zzg3, i);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int zzi3 = zzlp.zzi((List) unsafe.getObject(t3, j10));
                    if (zzi3 > 0) {
                        i = androidx.camera.core.impl.utils.a.A(zzi3, zzje.zzz(i10), zzi3, i);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int zzr = zzlp.zzr((List) unsafe.getObject(t3, j10));
                    if (zzr > 0) {
                        i = androidx.camera.core.impl.utils.a.A(zzr, zzje.zzz(i10), zzr, i);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int zzt = zzlp.zzt((List) unsafe.getObject(t3, j10));
                    if (zzt > 0) {
                        i = androidx.camera.core.impl.utils.a.A(zzt, zzje.zzz(i10), zzt, i);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo = zzlp.zzj(i10, (List) zzml.zzf(t3, j10), zzE(i9));
                    i += zzo;
                    break;
                case 50:
                    zzkx.zza(i10, zzml.zzf(t3, j10), zzF(i9));
                    break;
                case 51:
                    if (zzP(t3, i10, i9)) {
                        i = androidx.camera.core.impl.utils.a.v(i10 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzP(t3, i10, i9)) {
                        i = androidx.camera.core.impl.utils.a.v(i10 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzP(t3, i10, i9)) {
                        long zzC = zzC(t3, j10);
                        zzA = zzje.zzA(i10 << 3);
                        zzB = zzje.zzB(zzC);
                        zzu = zzB + zzA;
                        i += zzu;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzP(t3, i10, i9)) {
                        long zzC2 = zzC(t3, j10);
                        zzA = zzje.zzA(i10 << 3);
                        zzB = zzje.zzB(zzC2);
                        zzu = zzB + zzA;
                        i += zzu;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzP(t3, i10, i9)) {
                        int zzr2 = zzr(t3, j10);
                        zzA2 = zzje.zzA(i10 << 3);
                        zzv = zzje.zzv(zzr2);
                        zzu = zzv + zzA2;
                        i += zzu;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzP(t3, i10, i9)) {
                        i = androidx.camera.core.impl.utils.a.v(i10 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzP(t3, i10, i9)) {
                        i = androidx.camera.core.impl.utils.a.v(i10 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzP(t3, i10, i9)) {
                        i = androidx.camera.core.impl.utils.a.v(i10 << 3, 1, i);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzP(t3, i10, i9)) {
                        Object zzf2 = zzml.zzf(t3, j10);
                        if (zzf2 instanceof zzix) {
                            int zzA6 = zzje.zzA(i10 << 3);
                            int zzd6 = ((zzix) zzf2).zzd();
                            i = androidx.camera.core.impl.utils.a.A(zzd6, zzd6, zzA6, i);
                            break;
                        } else {
                            zzA2 = zzje.zzA(i10 << 3);
                            zzv = zzje.zzy((String) zzf2);
                            zzu = zzv + zzA2;
                            i += zzu;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzP(t3, i10, i9)) {
                        zzo = zzlp.zzo(i10, zzml.zzf(t3, j10), zzE(i9));
                        i += zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzP(t3, i10, i9)) {
                        zzix zzixVar2 = (zzix) zzml.zzf(t3, j10);
                        int zzA7 = zzje.zzA(i10 << 3);
                        int zzd7 = zzixVar2.zzd();
                        i = androidx.camera.core.impl.utils.a.A(zzd7, zzd7, zzA7, i);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzP(t3, i10, i9)) {
                        i = androidx.camera.core.impl.utils.a.v(zzr(t3, j10), zzje.zzA(i10 << 3), i);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzP(t3, i10, i9)) {
                        int zzr3 = zzr(t3, j10);
                        zzA2 = zzje.zzA(i10 << 3);
                        zzv = zzje.zzv(zzr3);
                        zzu = zzv + zzA2;
                        i += zzu;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzP(t3, i10, i9)) {
                        i = androidx.camera.core.impl.utils.a.v(i10 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzP(t3, i10, i9)) {
                        i = androidx.camera.core.impl.utils.a.v(i10 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzP(t3, i10, i9)) {
                        int zzr4 = zzr(t3, j10);
                        i = androidx.camera.core.impl.utils.a.v((zzr4 >> 31) ^ (zzr4 + zzr4), zzje.zzA(i10 << 3), i);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzP(t3, i10, i9)) {
                        long zzC3 = zzC(t3, j10);
                        zzA = zzje.zzA(i10 << 3);
                        zzB = zzje.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                        zzu = zzB + zzA;
                        i += zzu;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzP(t3, i10, i9)) {
                        zzu = zzje.zzu(i10, (zzlc) zzml.zzf(t3, j10), zzE(i9));
                        i += zzu;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzmb<?, ?> zzmbVar = this.zzn;
        return i + zzmbVar.zza(zzmbVar.zzc(t3));
    }

    private static <T> int zzr(T t3, long j10) {
        return ((Integer) zzml.zzf(t3, j10)).intValue();
    }

    private final <K, V> int zzs(T t3, byte[] bArr, int i, int i9, int i10, long j10, zzik zzikVar) {
        Unsafe unsafe = zzb;
        Object zzF = zzF(i10);
        Object object = unsafe.getObject(t3, j10);
        if (!((zzkw) object).zze()) {
            zzkw<K, V> zzb2 = zzkw.zza().zzb();
            zzkx.zzb(zzb2, object);
            unsafe.putObject(t3, j10, zzb2);
        }
        throw null;
    }

    private final int zzt(T t3, byte[] bArr, int i, int i9, int i10, int i11, int i12, int i13, int i14, long j10, int i15, zzik zzikVar) {
        Unsafe unsafe = zzb;
        long j11 = this.zzc[i15 + 2] & 1048575;
        switch (i14) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(t3, j10, Double.valueOf(Double.longBitsToDouble(zzil.zzn(bArr, i))));
                    unsafe.putInt(t3, j11, i11);
                    return i + 8;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(t3, j10, Float.valueOf(Float.intBitsToFloat(zzil.zzb(bArr, i))));
                    unsafe.putInt(t3, j11, i11);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int zzm = zzil.zzm(bArr, i, zzikVar);
                    unsafe.putObject(t3, j10, Long.valueOf(zzikVar.zzb));
                    unsafe.putInt(t3, j11, i11);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int zzj = zzil.zzj(bArr, i, zzikVar);
                    unsafe.putObject(t3, j10, Integer.valueOf(zzikVar.zza));
                    unsafe.putInt(t3, j11, i11);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(t3, j10, Long.valueOf(zzil.zzn(bArr, i)));
                    unsafe.putInt(t3, j11, i11);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(t3, j10, Integer.valueOf(zzil.zzb(bArr, i)));
                    unsafe.putInt(t3, j11, i11);
                    return i + 4;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int zzm2 = zzil.zzm(bArr, i, zzikVar);
                    unsafe.putObject(t3, j10, Boolean.valueOf(zzikVar.zzb != 0));
                    unsafe.putInt(t3, j11, i11);
                    return zzm2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int zzj2 = zzil.zzj(bArr, i, zzikVar);
                    int i16 = zzikVar.zza;
                    if (i16 == 0) {
                        unsafe.putObject(t3, j10, "");
                    } else {
                        if ((i13 & PKIFailureInfo.duplicateCertReq) != 0 && !zzmq.zzf(bArr, zzj2, zzj2 + i16)) {
                            throw zzkh.zzc();
                        }
                        unsafe.putObject(t3, j10, new String(bArr, zzj2, i16, zzkf.zzb));
                        zzj2 += i16;
                    }
                    unsafe.putInt(t3, j11, i11);
                    return zzj2;
                }
                break;
            case 60:
                if (i12 == 2) {
                    int zzd = zzil.zzd(zzE(i15), bArr, i, i9, zzikVar);
                    Object object = unsafe.getInt(t3, j11) == i11 ? unsafe.getObject(t3, j10) : null;
                    if (object == null) {
                        unsafe.putObject(t3, j10, zzikVar.zzc);
                    } else {
                        unsafe.putObject(t3, j10, zzkf.zzg(object, zzikVar.zzc));
                    }
                    unsafe.putInt(t3, j11, i11);
                    return zzd;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int zza2 = zzil.zza(bArr, i, zzikVar);
                    unsafe.putObject(t3, j10, zzikVar.zzc);
                    unsafe.putInt(t3, j11, i11);
                    return zza2;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int zzj3 = zzil.zzj(bArr, i, zzikVar);
                    int i17 = zzikVar.zza;
                    zzkb zzD = zzD(i15);
                    if (zzD == null || zzD.zza(i17)) {
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
                    int zzj4 = zzil.zzj(bArr, i, zzikVar);
                    unsafe.putObject(t3, j10, Integer.valueOf(zzja.zzb(zzikVar.zza)));
                    unsafe.putInt(t3, j11, i11);
                    return zzj4;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int zzm3 = zzil.zzm(bArr, i, zzikVar);
                    unsafe.putObject(t3, j10, Long.valueOf(zzja.zzc(zzikVar.zzb)));
                    unsafe.putInt(t3, j11, i11);
                    return zzm3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int zzc = zzil.zzc(zzE(i15), bArr, i, i9, (i10 & (-8)) | 4, zzikVar);
                    Object object2 = unsafe.getInt(t3, j11) == i11 ? unsafe.getObject(t3, j10) : null;
                    if (object2 == null) {
                        unsafe.putObject(t3, j10, zzikVar.zzc);
                    } else {
                        unsafe.putObject(t3, j10, zzkf.zzg(object2, zzikVar.zzc));
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
    private final int zzu(T r30, byte[] r31, int r32, int r33, com.google.android.gms.internal.measurement.zzik r34) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlf.zzu(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzik):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int zzv(T t3, byte[] bArr, int i, int i9, int i10, int i11, int i12, int i13, long j10, int i14, long j11, zzik zzikVar) {
        int i15;
        int i16;
        int i17;
        int i18;
        int zzj;
        int i19 = i;
        Unsafe unsafe = zzb;
        zzke zzkeVar = (zzke) unsafe.getObject(t3, j11);
        if (!zzkeVar.zzc()) {
            int size = zzkeVar.size();
            zzkeVar = zzkeVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(t3, j11, zzkeVar);
        }
        switch (i14) {
            case 18:
            case 35:
                if (i12 == 2) {
                    zzjg zzjgVar = (zzjg) zzkeVar;
                    int zzj2 = zzil.zzj(bArr, i19, zzikVar);
                    int i20 = zzikVar.zza + zzj2;
                    while (zzj2 < i20) {
                        zzjgVar.zze(Double.longBitsToDouble(zzil.zzn(bArr, zzj2)));
                        zzj2 += 8;
                    }
                    if (zzj2 == i20) {
                        return zzj2;
                    }
                    throw zzkh.zzf();
                }
                if (i12 == 1) {
                    zzjg zzjgVar2 = (zzjg) zzkeVar;
                    zzjgVar2.zze(Double.longBitsToDouble(zzil.zzn(bArr, i)));
                    while (true) {
                        i15 = i19 + 8;
                        if (i15 < i9) {
                            i19 = zzil.zzj(bArr, i15, zzikVar);
                            if (i10 == zzikVar.zza) {
                                zzjgVar2.zze(Double.longBitsToDouble(zzil.zzn(bArr, i19)));
                            }
                        }
                    }
                    return i15;
                }
                return i19;
            case 19:
            case 36:
                if (i12 == 2) {
                    zzjq zzjqVar = (zzjq) zzkeVar;
                    int zzj3 = zzil.zzj(bArr, i19, zzikVar);
                    int i21 = zzikVar.zza + zzj3;
                    while (zzj3 < i21) {
                        zzjqVar.zze(Float.intBitsToFloat(zzil.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i21) {
                        return zzj3;
                    }
                    throw zzkh.zzf();
                }
                if (i12 == 5) {
                    zzjq zzjqVar2 = (zzjq) zzkeVar;
                    zzjqVar2.zze(Float.intBitsToFloat(zzil.zzb(bArr, i)));
                    while (true) {
                        i16 = i19 + 4;
                        if (i16 < i9) {
                            i19 = zzil.zzj(bArr, i16, zzikVar);
                            if (i10 == zzikVar.zza) {
                                zzjqVar2.zze(Float.intBitsToFloat(zzil.zzb(bArr, i19)));
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
                    zzkr zzkrVar = (zzkr) zzkeVar;
                    int zzj4 = zzil.zzj(bArr, i19, zzikVar);
                    int i22 = zzikVar.zza + zzj4;
                    while (zzj4 < i22) {
                        zzj4 = zzil.zzm(bArr, zzj4, zzikVar);
                        zzkrVar.zzg(zzikVar.zzb);
                    }
                    if (zzj4 == i22) {
                        return zzj4;
                    }
                    throw zzkh.zzf();
                }
                if (i12 == 0) {
                    zzkr zzkrVar2 = (zzkr) zzkeVar;
                    int zzm = zzil.zzm(bArr, i19, zzikVar);
                    zzkrVar2.zzg(zzikVar.zzb);
                    while (zzm < i9) {
                        int zzj5 = zzil.zzj(bArr, zzm, zzikVar);
                        if (i10 != zzikVar.zza) {
                            return zzm;
                        }
                        zzm = zzil.zzm(bArr, zzj5, zzikVar);
                        zzkrVar2.zzg(zzikVar.zzb);
                    }
                    return zzm;
                }
                return i19;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i12 == 2) {
                    return zzil.zzf(bArr, i19, zzkeVar, zzikVar);
                }
                if (i12 == 0) {
                    return zzil.zzl(i10, bArr, i, i9, zzkeVar, zzikVar);
                }
                return i19;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i12 == 2) {
                    zzkr zzkrVar3 = (zzkr) zzkeVar;
                    int zzj6 = zzil.zzj(bArr, i19, zzikVar);
                    int i23 = zzikVar.zza + zzj6;
                    while (zzj6 < i23) {
                        zzkrVar3.zzg(zzil.zzn(bArr, zzj6));
                        zzj6 += 8;
                    }
                    if (zzj6 == i23) {
                        return zzj6;
                    }
                    throw zzkh.zzf();
                }
                if (i12 == 1) {
                    zzkr zzkrVar4 = (zzkr) zzkeVar;
                    zzkrVar4.zzg(zzil.zzn(bArr, i));
                    while (true) {
                        i17 = i19 + 8;
                        if (i17 < i9) {
                            i19 = zzil.zzj(bArr, i17, zzikVar);
                            if (i10 == zzikVar.zza) {
                                zzkrVar4.zzg(zzil.zzn(bArr, i19));
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
                    zzjy zzjyVar = (zzjy) zzkeVar;
                    int zzj7 = zzil.zzj(bArr, i19, zzikVar);
                    int i24 = zzikVar.zza + zzj7;
                    while (zzj7 < i24) {
                        zzjyVar.zzh(zzil.zzb(bArr, zzj7));
                        zzj7 += 4;
                    }
                    if (zzj7 == i24) {
                        return zzj7;
                    }
                    throw zzkh.zzf();
                }
                if (i12 == 5) {
                    zzjy zzjyVar2 = (zzjy) zzkeVar;
                    zzjyVar2.zzh(zzil.zzb(bArr, i));
                    while (true) {
                        i18 = i19 + 4;
                        if (i18 < i9) {
                            i19 = zzil.zzj(bArr, i18, zzikVar);
                            if (i10 == zzikVar.zza) {
                                zzjyVar2.zzh(zzil.zzb(bArr, i19));
                            }
                        }
                    }
                    return i18;
                }
                return i19;
            case 25:
            case 42:
                if (i12 == 2) {
                    zzim zzimVar = (zzim) zzkeVar;
                    zzj = zzil.zzj(bArr, i19, zzikVar);
                    int i25 = zzikVar.zza + zzj;
                    while (zzj < i25) {
                        zzj = zzil.zzm(bArr, zzj, zzikVar);
                        zzimVar.zze(zzikVar.zzb != 0);
                    }
                    if (zzj != i25) {
                        throw zzkh.zzf();
                    }
                    return zzj;
                }
                if (i12 == 0) {
                    zzim zzimVar2 = (zzim) zzkeVar;
                    int zzm2 = zzil.zzm(bArr, i19, zzikVar);
                    zzimVar2.zze(zzikVar.zzb != 0);
                    while (zzm2 < i9) {
                        int zzj8 = zzil.zzj(bArr, zzm2, zzikVar);
                        if (i10 != zzikVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzil.zzm(bArr, zzj8, zzikVar);
                        zzimVar2.zze(zzikVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i19;
            case 26:
                if (i12 == 2) {
                    if ((j10 & 536870912) == 0) {
                        int zzj9 = zzil.zzj(bArr, i19, zzikVar);
                        int i26 = zzikVar.zza;
                        if (i26 < 0) {
                            throw zzkh.zzd();
                        }
                        if (i26 == 0) {
                            zzkeVar.add("");
                        } else {
                            zzkeVar.add(new String(bArr, zzj9, i26, zzkf.zzb));
                            zzj9 += i26;
                        }
                        while (zzj9 < i9) {
                            int zzj10 = zzil.zzj(bArr, zzj9, zzikVar);
                            if (i10 != zzikVar.zza) {
                                return zzj9;
                            }
                            zzj9 = zzil.zzj(bArr, zzj10, zzikVar);
                            int i27 = zzikVar.zza;
                            if (i27 < 0) {
                                throw zzkh.zzd();
                            }
                            if (i27 == 0) {
                                zzkeVar.add("");
                            } else {
                                zzkeVar.add(new String(bArr, zzj9, i27, zzkf.zzb));
                                zzj9 += i27;
                            }
                        }
                        return zzj9;
                    }
                    int zzj11 = zzil.zzj(bArr, i19, zzikVar);
                    int i28 = zzikVar.zza;
                    if (i28 < 0) {
                        throw zzkh.zzd();
                    }
                    if (i28 == 0) {
                        zzkeVar.add("");
                    } else {
                        int i29 = zzj11 + i28;
                        if (!zzmq.zzf(bArr, zzj11, i29)) {
                            throw zzkh.zzc();
                        }
                        zzkeVar.add(new String(bArr, zzj11, i28, zzkf.zzb));
                        zzj11 = i29;
                    }
                    while (zzj11 < i9) {
                        int zzj12 = zzil.zzj(bArr, zzj11, zzikVar);
                        if (i10 != zzikVar.zza) {
                            return zzj11;
                        }
                        zzj11 = zzil.zzj(bArr, zzj12, zzikVar);
                        int i30 = zzikVar.zza;
                        if (i30 < 0) {
                            throw zzkh.zzd();
                        }
                        if (i30 == 0) {
                            zzkeVar.add("");
                        } else {
                            int i31 = zzj11 + i30;
                            if (!zzmq.zzf(bArr, zzj11, i31)) {
                                throw zzkh.zzc();
                            }
                            zzkeVar.add(new String(bArr, zzj11, i30, zzkf.zzb));
                            zzj11 = i31;
                        }
                    }
                    return zzj11;
                }
                return i19;
            case 27:
                if (i12 == 2) {
                    return zzil.zze(zzE(i13), i10, bArr, i, i9, zzkeVar, zzikVar);
                }
                return i19;
            case 28:
                if (i12 == 2) {
                    int zzj13 = zzil.zzj(bArr, i19, zzikVar);
                    int i32 = zzikVar.zza;
                    if (i32 < 0) {
                        throw zzkh.zzd();
                    }
                    if (i32 > bArr.length - zzj13) {
                        throw zzkh.zzf();
                    }
                    if (i32 == 0) {
                        zzkeVar.add(zzix.zzb);
                    } else {
                        zzkeVar.add(zzix.zzl(bArr, zzj13, i32));
                        zzj13 += i32;
                    }
                    while (zzj13 < i9) {
                        int zzj14 = zzil.zzj(bArr, zzj13, zzikVar);
                        if (i10 != zzikVar.zza) {
                            return zzj13;
                        }
                        zzj13 = zzil.zzj(bArr, zzj14, zzikVar);
                        int i33 = zzikVar.zza;
                        if (i33 < 0) {
                            throw zzkh.zzd();
                        }
                        if (i33 > bArr.length - zzj13) {
                            throw zzkh.zzf();
                        }
                        if (i33 == 0) {
                            zzkeVar.add(zzix.zzb);
                        } else {
                            zzkeVar.add(zzix.zzl(bArr, zzj13, i33));
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
                        zzj = zzil.zzl(i10, bArr, i, i9, zzkeVar, zzikVar);
                    }
                    return i19;
                }
                zzj = zzil.zzf(bArr, i19, zzkeVar, zzikVar);
                zzjx zzjxVar = (zzjx) t3;
                zzmc zzmcVar = zzjxVar.zzc;
                if (zzmcVar == zzmc.zzc()) {
                    zzmcVar = null;
                }
                Object zzC = zzlp.zzC(i11, zzkeVar, zzD(i13), zzmcVar, this.zzn);
                if (zzC != null) {
                    zzjxVar.zzc = (zzmc) zzC;
                    return zzj;
                }
                return zzj;
            case 33:
            case 47:
                if (i12 == 2) {
                    zzjy zzjyVar3 = (zzjy) zzkeVar;
                    int zzj15 = zzil.zzj(bArr, i19, zzikVar);
                    int i34 = zzikVar.zza + zzj15;
                    while (zzj15 < i34) {
                        zzj15 = zzil.zzj(bArr, zzj15, zzikVar);
                        zzjyVar3.zzh(zzja.zzb(zzikVar.zza));
                    }
                    if (zzj15 == i34) {
                        return zzj15;
                    }
                    throw zzkh.zzf();
                }
                if (i12 == 0) {
                    zzjy zzjyVar4 = (zzjy) zzkeVar;
                    int zzj16 = zzil.zzj(bArr, i19, zzikVar);
                    zzjyVar4.zzh(zzja.zzb(zzikVar.zza));
                    while (zzj16 < i9) {
                        int zzj17 = zzil.zzj(bArr, zzj16, zzikVar);
                        if (i10 != zzikVar.zza) {
                            return zzj16;
                        }
                        zzj16 = zzil.zzj(bArr, zzj17, zzikVar);
                        zzjyVar4.zzh(zzja.zzb(zzikVar.zza));
                    }
                    return zzj16;
                }
                return i19;
            case 34:
            case 48:
                if (i12 == 2) {
                    zzkr zzkrVar5 = (zzkr) zzkeVar;
                    int zzj18 = zzil.zzj(bArr, i19, zzikVar);
                    int i35 = zzikVar.zza + zzj18;
                    while (zzj18 < i35) {
                        zzj18 = zzil.zzm(bArr, zzj18, zzikVar);
                        zzkrVar5.zzg(zzja.zzc(zzikVar.zzb));
                    }
                    if (zzj18 == i35) {
                        return zzj18;
                    }
                    throw zzkh.zzf();
                }
                if (i12 == 0) {
                    zzkr zzkrVar6 = (zzkr) zzkeVar;
                    int zzm3 = zzil.zzm(bArr, i19, zzikVar);
                    zzkrVar6.zzg(zzja.zzc(zzikVar.zzb));
                    while (zzm3 < i9) {
                        int zzj19 = zzil.zzj(bArr, zzm3, zzikVar);
                        if (i10 != zzikVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzil.zzm(bArr, zzj19, zzikVar);
                        zzkrVar6.zzg(zzja.zzc(zzikVar.zzb));
                    }
                    return zzm3;
                }
                return i19;
            default:
                if (i12 == 3) {
                    zzln zzE = zzE(i13);
                    int i36 = (i10 & (-8)) | 4;
                    int zzc = zzil.zzc(zzE, bArr, i, i9, i36, zzikVar);
                    zzkeVar.add(zzikVar.zzc);
                    while (zzc < i9) {
                        int zzj20 = zzil.zzj(bArr, zzc, zzikVar);
                        if (i10 != zzikVar.zza) {
                            return zzc;
                        }
                        zzc = zzil.zzc(zzE, bArr, zzj20, i9, i36, zzikVar);
                        zzkeVar.add(zzikVar.zzc);
                    }
                    return zzc;
                }
                return i19;
        }
    }

    private final int zzw(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, 0);
    }

    private final int zzx(int i, int i9) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, i9);
    }

    private final int zzy(int i) {
        return this.zzc[i + 2];
    }

    private final int zzz(int i, int i9) {
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

    @Override // com.google.android.gms.internal.measurement.zzln
    public final int zza(T t3) {
        return this.zzi ? zzq(t3) : zzp(t3);
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final int zzb(T t3) {
        int i;
        int zzc;
        int i9;
        int zzc2;
        int length = this.zzc.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int zzB = zzB(i11);
            int i12 = this.zzc[i11];
            long j10 = 1048575 & zzB;
            int i13 = 37;
            switch (zzA(zzB)) {
                case 0:
                    i = i10 * 53;
                    zzc = zzkf.zzc(Double.doubleToLongBits(zzml.zza(t3, j10)));
                    i10 = zzc + i;
                    break;
                case 1:
                    i = i10 * 53;
                    zzc = Float.floatToIntBits(zzml.zzb(t3, j10));
                    i10 = zzc + i;
                    break;
                case 2:
                    i = i10 * 53;
                    zzc = zzkf.zzc(zzml.zzd(t3, j10));
                    i10 = zzc + i;
                    break;
                case 3:
                    i = i10 * 53;
                    zzc = zzkf.zzc(zzml.zzd(t3, j10));
                    i10 = zzc + i;
                    break;
                case 4:
                    i9 = i10 * 53;
                    zzc2 = zzml.zzc(t3, j10);
                    i10 = i9 + zzc2;
                    break;
                case 5:
                    i = i10 * 53;
                    zzc = zzkf.zzc(zzml.zzd(t3, j10));
                    i10 = zzc + i;
                    break;
                case 6:
                    i9 = i10 * 53;
                    zzc2 = zzml.zzc(t3, j10);
                    i10 = i9 + zzc2;
                    break;
                case 7:
                    i = i10 * 53;
                    zzc = zzkf.zza(zzml.zzw(t3, j10));
                    i10 = zzc + i;
                    break;
                case 8:
                    i = i10 * 53;
                    zzc = ((String) zzml.zzf(t3, j10)).hashCode();
                    i10 = zzc + i;
                    break;
                case 9:
                    Object zzf = zzml.zzf(t3, j10);
                    if (zzf != null) {
                        i13 = zzf.hashCode();
                    }
                    i10 = (i10 * 53) + i13;
                    break;
                case 10:
                    i = i10 * 53;
                    zzc = zzml.zzf(t3, j10).hashCode();
                    i10 = zzc + i;
                    break;
                case 11:
                    i9 = i10 * 53;
                    zzc2 = zzml.zzc(t3, j10);
                    i10 = i9 + zzc2;
                    break;
                case 12:
                    i9 = i10 * 53;
                    zzc2 = zzml.zzc(t3, j10);
                    i10 = i9 + zzc2;
                    break;
                case 13:
                    i9 = i10 * 53;
                    zzc2 = zzml.zzc(t3, j10);
                    i10 = i9 + zzc2;
                    break;
                case 14:
                    i = i10 * 53;
                    zzc = zzkf.zzc(zzml.zzd(t3, j10));
                    i10 = zzc + i;
                    break;
                case 15:
                    i9 = i10 * 53;
                    zzc2 = zzml.zzc(t3, j10);
                    i10 = i9 + zzc2;
                    break;
                case 16:
                    i = i10 * 53;
                    zzc = zzkf.zzc(zzml.zzd(t3, j10));
                    i10 = zzc + i;
                    break;
                case 17:
                    Object zzf2 = zzml.zzf(t3, j10);
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
                    zzc = zzml.zzf(t3, j10).hashCode();
                    i10 = zzc + i;
                    break;
                case 50:
                    i = i10 * 53;
                    zzc = zzml.zzf(t3, j10).hashCode();
                    i10 = zzc + i;
                    break;
                case 51:
                    if (zzP(t3, i12, i11)) {
                        i = i10 * 53;
                        zzc = zzkf.zzc(Double.doubleToLongBits(zzn(t3, j10)));
                        i10 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzP(t3, i12, i11)) {
                        i = i10 * 53;
                        zzc = Float.floatToIntBits(zzo(t3, j10));
                        i10 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzP(t3, i12, i11)) {
                        i = i10 * 53;
                        zzc = zzkf.zzc(zzC(t3, j10));
                        i10 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzP(t3, i12, i11)) {
                        i = i10 * 53;
                        zzc = zzkf.zzc(zzC(t3, j10));
                        i10 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzP(t3, i12, i11)) {
                        i9 = i10 * 53;
                        zzc2 = zzr(t3, j10);
                        i10 = i9 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzP(t3, i12, i11)) {
                        i = i10 * 53;
                        zzc = zzkf.zzc(zzC(t3, j10));
                        i10 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzP(t3, i12, i11)) {
                        i9 = i10 * 53;
                        zzc2 = zzr(t3, j10);
                        i10 = i9 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzP(t3, i12, i11)) {
                        i = i10 * 53;
                        zzc = zzkf.zza(zzQ(t3, j10));
                        i10 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzP(t3, i12, i11)) {
                        i = i10 * 53;
                        zzc = ((String) zzml.zzf(t3, j10)).hashCode();
                        i10 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzP(t3, i12, i11)) {
                        i = i10 * 53;
                        zzc = zzml.zzf(t3, j10).hashCode();
                        i10 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzP(t3, i12, i11)) {
                        i = i10 * 53;
                        zzc = zzml.zzf(t3, j10).hashCode();
                        i10 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzP(t3, i12, i11)) {
                        i9 = i10 * 53;
                        zzc2 = zzr(t3, j10);
                        i10 = i9 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzP(t3, i12, i11)) {
                        i9 = i10 * 53;
                        zzc2 = zzr(t3, j10);
                        i10 = i9 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzP(t3, i12, i11)) {
                        i9 = i10 * 53;
                        zzc2 = zzr(t3, j10);
                        i10 = i9 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzP(t3, i12, i11)) {
                        i = i10 * 53;
                        zzc = zzkf.zzc(zzC(t3, j10));
                        i10 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzP(t3, i12, i11)) {
                        i9 = i10 * 53;
                        zzc2 = zzr(t3, j10);
                        i10 = i9 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzP(t3, i12, i11)) {
                        i = i10 * 53;
                        zzc = zzkf.zzc(zzC(t3, j10));
                        i10 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzP(t3, i12, i11)) {
                        i = i10 * 53;
                        zzc = zzml.zzf(t3, j10).hashCode();
                        i10 = zzc + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzn.zzc(t3).hashCode() + (i10 * 53);
        if (!this.zzh) {
            return hashCode;
        }
        this.zzo.zza(t3);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x04bc, code lost:
    
        if (r6 == 1048575) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x04be, code lost:
    
        r26.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x04c4, code lost:
    
        r3 = r9.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x04c8, code lost:
    
        if (r3 >= r9.zzl) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x04ca, code lost:
    
        r4 = r9.zzj[r3];
        r5 = r9.zzc[r4];
        r5 = com.google.android.gms.internal.measurement.zzml.zzf(r12, r9.zzB(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x04dc, code lost:
    
        if (r5 != null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x04e3, code lost:
    
        if (r9.zzD(r4) != null) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x04e8, code lost:
    
        r5 = (com.google.android.gms.internal.measurement.zzkw) r5;
        r0 = (com.google.android.gms.internal.measurement.zzkv) r9.zzF(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x04f0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x04e5, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x04f1, code lost:
    
        if (r7 != 0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x04f5, code lost:
    
        if (r0 != r34) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x04fc, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkh.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0503, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x04ff, code lost:
    
        if (r0 > r34) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0501, code lost:
    
        if (r1 != r7) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0508, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkh.zze();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(T r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.measurement.zzik r36) {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlf.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzik):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final T zze() {
        return (T) ((zzjx) this.zzg).zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final void zzf(T t3) {
        int i;
        int i9 = this.zzk;
        while (true) {
            i = this.zzl;
            if (i9 >= i) {
                break;
            }
            long zzB = zzB(this.zzj[i9]) & 1048575;
            Object zzf = zzml.zzf(t3, zzB);
            if (zzf != null) {
                ((zzkw) zzf).zzc();
                zzml.zzs(t3, zzB, zzf);
            }
            i9++;
        }
        int length = this.zzj.length;
        while (i < length) {
            this.zzm.zza(t3, this.zzj[i]);
            i++;
        }
        this.zzn.zzg(t3);
        if (this.zzh) {
            this.zzo.zzb(t3);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final void zzg(T t3, T t10) {
        t10.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzB = zzB(i);
            long j10 = 1048575 & zzB;
            int i9 = this.zzc[i];
            switch (zzA(zzB)) {
                case 0:
                    if (zzM(t10, i)) {
                        zzml.zzo(t3, j10, zzml.zza(t10, j10));
                        zzJ(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzM(t10, i)) {
                        zzml.zzp(t3, j10, zzml.zzb(t10, j10));
                        zzJ(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzM(t10, i)) {
                        zzml.zzr(t3, j10, zzml.zzd(t10, j10));
                        zzJ(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzM(t10, i)) {
                        zzml.zzr(t3, j10, zzml.zzd(t10, j10));
                        zzJ(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzM(t10, i)) {
                        zzml.zzq(t3, j10, zzml.zzc(t10, j10));
                        zzJ(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzM(t10, i)) {
                        zzml.zzr(t3, j10, zzml.zzd(t10, j10));
                        zzJ(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzM(t10, i)) {
                        zzml.zzq(t3, j10, zzml.zzc(t10, j10));
                        zzJ(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzM(t10, i)) {
                        zzml.zzm(t3, j10, zzml.zzw(t10, j10));
                        zzJ(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzM(t10, i)) {
                        zzml.zzs(t3, j10, zzml.zzf(t10, j10));
                        zzJ(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzH(t3, t10, i);
                    break;
                case 10:
                    if (zzM(t10, i)) {
                        zzml.zzs(t3, j10, zzml.zzf(t10, j10));
                        zzJ(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzM(t10, i)) {
                        zzml.zzq(t3, j10, zzml.zzc(t10, j10));
                        zzJ(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzM(t10, i)) {
                        zzml.zzq(t3, j10, zzml.zzc(t10, j10));
                        zzJ(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzM(t10, i)) {
                        zzml.zzq(t3, j10, zzml.zzc(t10, j10));
                        zzJ(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzM(t10, i)) {
                        zzml.zzr(t3, j10, zzml.zzd(t10, j10));
                        zzJ(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzM(t10, i)) {
                        zzml.zzq(t3, j10, zzml.zzc(t10, j10));
                        zzJ(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzM(t10, i)) {
                        zzml.zzr(t3, j10, zzml.zzd(t10, j10));
                        zzJ(t3, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzH(t3, t10, i);
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
                    this.zzm.zzb(t3, t10, j10);
                    break;
                case 50:
                    zzlp.zzI(this.zzq, t3, t10, j10);
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
                    if (zzP(t10, i9, i)) {
                        zzml.zzs(t3, j10, zzml.zzf(t10, j10));
                        zzK(t3, i9, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzI(t3, t10, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzP(t10, i9, i)) {
                        zzml.zzs(t3, j10, zzml.zzf(t10, j10));
                        zzK(t3, i9, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzI(t3, t10, i);
                    break;
            }
        }
        zzlp.zzF(this.zzn, t3, t10);
        if (this.zzh) {
            zzlp.zzE(this.zzo, t3, t10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final void zzh(T t3, byte[] bArr, int i, int i9, zzik zzikVar) {
        if (this.zzi) {
            zzu(t3, bArr, i, i9, zzikVar);
        } else {
            zzc(t3, bArr, i, i9, 0, zzikVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final boolean zzi(T t3, T t10) {
        boolean zzH;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzB = zzB(i);
            long j10 = zzB & 1048575;
            switch (zzA(zzB)) {
                case 0:
                    if (zzL(t3, t10, i) && Double.doubleToLongBits(zzml.zza(t3, j10)) == Double.doubleToLongBits(zzml.zza(t10, j10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(t3, t10, i) && Float.floatToIntBits(zzml.zzb(t3, j10)) == Float.floatToIntBits(zzml.zzb(t10, j10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(t3, t10, i) && zzml.zzd(t3, j10) == zzml.zzd(t10, j10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(t3, t10, i) && zzml.zzd(t3, j10) == zzml.zzd(t10, j10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(t3, t10, i) && zzml.zzc(t3, j10) == zzml.zzc(t10, j10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(t3, t10, i) && zzml.zzd(t3, j10) == zzml.zzd(t10, j10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(t3, t10, i) && zzml.zzc(t3, j10) == zzml.zzc(t10, j10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(t3, t10, i) && zzml.zzw(t3, j10) == zzml.zzw(t10, j10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(t3, t10, i) && zzlp.zzH(zzml.zzf(t3, j10), zzml.zzf(t10, j10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(t3, t10, i) && zzlp.zzH(zzml.zzf(t3, j10), zzml.zzf(t10, j10))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(t3, t10, i) && zzlp.zzH(zzml.zzf(t3, j10), zzml.zzf(t10, j10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(t3, t10, i) && zzml.zzc(t3, j10) == zzml.zzc(t10, j10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(t3, t10, i) && zzml.zzc(t3, j10) == zzml.zzc(t10, j10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(t3, t10, i) && zzml.zzc(t3, j10) == zzml.zzc(t10, j10)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(t3, t10, i) && zzml.zzd(t3, j10) == zzml.zzd(t10, j10)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(t3, t10, i) && zzml.zzc(t3, j10) == zzml.zzc(t10, j10)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(t3, t10, i) && zzml.zzd(t3, j10) == zzml.zzd(t10, j10)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(t3, t10, i) && zzlp.zzH(zzml.zzf(t3, j10), zzml.zzf(t10, j10))) {
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
                    zzH = zzlp.zzH(zzml.zzf(t3, j10), zzml.zzf(t10, j10));
                    break;
                case 50:
                    zzH = zzlp.zzH(zzml.zzf(t3, j10), zzml.zzf(t10, j10));
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
                    long zzy = zzy(i) & 1048575;
                    if (zzml.zzc(t3, zzy) == zzml.zzc(t10, zzy) && zzlp.zzH(zzml.zzf(t3, j10), zzml.zzf(t10, j10))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzH) {
                return false;
            }
        }
        if (!this.zzn.zzc(t3).equals(this.zzn.zzc(t10))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(t3);
        this.zzo.zza(t10);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzln
    public final boolean zzj(T t3) {
        int i;
        int i9;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.zzk) {
            int i13 = this.zzj[i12];
            int i14 = this.zzc[i13];
            int zzB = zzB(i13);
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
            if ((268435456 & zzB) != 0 && !zzN(t3, i13, i, i9, i17)) {
                return false;
            }
            int zzA = zzA(zzB);
            if (zzA != 9 && zzA != 17) {
                if (zzA != 27) {
                    if (zzA == 60 || zzA == 68) {
                        if (zzP(t3, i14, i13) && !zzO(t3, zzB, zzE(i13))) {
                            return false;
                        }
                    } else if (zzA != 49) {
                        if (zzA == 50 && !((zzkw) zzml.zzf(t3, zzB & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzml.zzf(t3, zzB & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzln zzE = zzE(i13);
                    for (int i18 = 0; i18 < list.size(); i18++) {
                        if (!zzE.zzj(list.get(i18))) {
                            return false;
                        }
                    }
                }
            } else if (zzN(t3, i13, i, i9, i17) && !zzO(t3, zzB, zzE(i13))) {
                return false;
            }
            i12++;
            i10 = i;
            i11 = i9;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(t3);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final void zzm(T t3, zzjf zzjfVar) {
        if (!this.zzi) {
            zzR(t3, zzjfVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zza(t3);
            throw null;
        }
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzB = zzB(i);
            int i9 = this.zzc[i];
            switch (zzA(zzB)) {
                case 0:
                    if (zzM(t3, i)) {
                        zzjfVar.zzf(i9, zzml.zza(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzM(t3, i)) {
                        zzjfVar.zzo(i9, zzml.zzb(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzM(t3, i)) {
                        zzjfVar.zzt(i9, zzml.zzd(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzM(t3, i)) {
                        zzjfVar.zzJ(i9, zzml.zzd(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzM(t3, i)) {
                        zzjfVar.zzr(i9, zzml.zzc(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzM(t3, i)) {
                        zzjfVar.zzm(i9, zzml.zzd(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzM(t3, i)) {
                        zzjfVar.zzk(i9, zzml.zzc(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzM(t3, i)) {
                        zzjfVar.zzb(i9, zzml.zzw(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzM(t3, i)) {
                        zzT(i9, zzml.zzf(t3, zzB & 1048575), zzjfVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzM(t3, i)) {
                        zzjfVar.zzv(i9, zzml.zzf(t3, zzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzM(t3, i)) {
                        zzjfVar.zzd(i9, (zzix) zzml.zzf(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzM(t3, i)) {
                        zzjfVar.zzH(i9, zzml.zzc(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzM(t3, i)) {
                        zzjfVar.zzi(i9, zzml.zzc(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzM(t3, i)) {
                        zzjfVar.zzw(i9, zzml.zzc(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzM(t3, i)) {
                        zzjfVar.zzy(i9, zzml.zzd(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzM(t3, i)) {
                        zzjfVar.zzA(i9, zzml.zzc(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzM(t3, i)) {
                        zzjfVar.zzC(i9, zzml.zzd(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzM(t3, i)) {
                        zzjfVar.zzq(i9, zzml.zzf(t3, zzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzlp.zzL(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, false);
                    break;
                case 19:
                    zzlp.zzP(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, false);
                    break;
                case 20:
                    zzlp.zzS(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, false);
                    break;
                case 21:
                    zzlp.zzaa(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, false);
                    break;
                case 22:
                    zzlp.zzR(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, false);
                    break;
                case 23:
                    zzlp.zzO(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, false);
                    break;
                case 24:
                    zzlp.zzN(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, false);
                    break;
                case 25:
                    zzlp.zzJ(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, false);
                    break;
                case 26:
                    zzlp.zzY(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar);
                    break;
                case 27:
                    zzlp.zzT(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, zzE(i));
                    break;
                case 28:
                    zzlp.zzK(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar);
                    break;
                case 29:
                    zzlp.zzZ(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, false);
                    break;
                case 30:
                    zzlp.zzM(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, false);
                    break;
                case 31:
                    zzlp.zzU(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, false);
                    break;
                case 32:
                    zzlp.zzV(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, false);
                    break;
                case 33:
                    zzlp.zzW(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, false);
                    break;
                case 34:
                    zzlp.zzX(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, false);
                    break;
                case 35:
                    zzlp.zzL(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, true);
                    break;
                case 36:
                    zzlp.zzP(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, true);
                    break;
                case 37:
                    zzlp.zzS(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, true);
                    break;
                case 38:
                    zzlp.zzaa(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, true);
                    break;
                case 39:
                    zzlp.zzR(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, true);
                    break;
                case 40:
                    zzlp.zzO(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, true);
                    break;
                case 41:
                    zzlp.zzN(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, true);
                    break;
                case 42:
                    zzlp.zzJ(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, true);
                    break;
                case 43:
                    zzlp.zzZ(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, true);
                    break;
                case 44:
                    zzlp.zzM(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, true);
                    break;
                case 45:
                    zzlp.zzU(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, true);
                    break;
                case 46:
                    zzlp.zzV(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, true);
                    break;
                case 47:
                    zzlp.zzW(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, true);
                    break;
                case 48:
                    zzlp.zzX(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, true);
                    break;
                case 49:
                    zzlp.zzQ(this.zzc[i], (List) zzml.zzf(t3, zzB & 1048575), zzjfVar, zzE(i));
                    break;
                case 50:
                    zzS(zzjfVar, i9, zzml.zzf(t3, zzB & 1048575), i);
                    break;
                case 51:
                    if (zzP(t3, i9, i)) {
                        zzjfVar.zzf(i9, zzn(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzP(t3, i9, i)) {
                        zzjfVar.zzo(i9, zzo(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzP(t3, i9, i)) {
                        zzjfVar.zzt(i9, zzC(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzP(t3, i9, i)) {
                        zzjfVar.zzJ(i9, zzC(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzP(t3, i9, i)) {
                        zzjfVar.zzr(i9, zzr(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzP(t3, i9, i)) {
                        zzjfVar.zzm(i9, zzC(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzP(t3, i9, i)) {
                        zzjfVar.zzk(i9, zzr(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzP(t3, i9, i)) {
                        zzjfVar.zzb(i9, zzQ(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzP(t3, i9, i)) {
                        zzT(i9, zzml.zzf(t3, zzB & 1048575), zzjfVar);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzP(t3, i9, i)) {
                        zzjfVar.zzv(i9, zzml.zzf(t3, zzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzP(t3, i9, i)) {
                        zzjfVar.zzd(i9, (zzix) zzml.zzf(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzP(t3, i9, i)) {
                        zzjfVar.zzH(i9, zzr(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzP(t3, i9, i)) {
                        zzjfVar.zzi(i9, zzr(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzP(t3, i9, i)) {
                        zzjfVar.zzw(i9, zzr(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzP(t3, i9, i)) {
                        zzjfVar.zzy(i9, zzC(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzP(t3, i9, i)) {
                        zzjfVar.zzA(i9, zzr(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzP(t3, i9, i)) {
                        zzjfVar.zzC(i9, zzC(t3, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzP(t3, i9, i)) {
                        zzjfVar.zzq(i9, zzml.zzf(t3, zzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzmb<?, ?> zzmbVar = this.zzn;
        zzmbVar.zzi(zzmbVar.zzc(t3), zzjfVar);
    }
}
