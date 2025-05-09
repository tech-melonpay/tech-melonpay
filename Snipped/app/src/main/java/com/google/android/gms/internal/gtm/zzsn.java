package com.google.android.gms.internal.gtm;

import java.nio.ByteBuffer;
import java.util.List;
import net.sf.scuba.smartcards.ISOFileInfo;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zzsn extends zzsp {
    private final byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public zzsn(ByteBuffer byteBuffer, boolean z10) {
        super(null);
        this.zza = byteBuffer.array();
        this.zzb = byteBuffer.position() + byteBuffer.arrayOffset();
        this.zzc = byteBuffer.limit() + byteBuffer.arrayOffset();
    }

    private final byte zzU() {
        int i = this.zzb;
        if (i == this.zzc) {
            throw zzvk.zzj();
        }
        byte[] bArr = this.zza;
        this.zzb = i + 1;
        return bArr[i];
    }

    private final int zzV() {
        zzad(4);
        return zzW();
    }

    private final int zzW() {
        int i = this.zzb;
        byte[] bArr = this.zza;
        this.zzb = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final int zzX() {
        int i;
        int i9 = this.zzb;
        int i10 = this.zzc;
        if (i10 == i9) {
            throw zzvk.zzj();
        }
        byte[] bArr = this.zza;
        int i11 = i9 + 1;
        byte b9 = bArr[i9];
        if (b9 >= 0) {
            this.zzb = i11;
            return b9;
        }
        if (i10 - i11 < 9) {
            return (int) zzaa();
        }
        int i12 = i9 + 2;
        int i13 = (bArr[i11] << 7) ^ b9;
        if (i13 < 0) {
            i = i13 ^ (-128);
        } else {
            int i14 = i9 + 3;
            int i15 = (bArr[i12] << 14) ^ i13;
            if (i15 >= 0) {
                i = i15 ^ 16256;
            } else {
                int i16 = i9 + 4;
                int i17 = i15 ^ (bArr[i14] << 21);
                if (i17 < 0) {
                    i = (-2080896) ^ i17;
                } else {
                    i14 = i9 + 5;
                    byte b10 = bArr[i16];
                    int i18 = (i17 ^ (b10 << 28)) ^ 266354560;
                    if (b10 < 0) {
                        i16 = i9 + 6;
                        if (bArr[i14] < 0) {
                            i14 = i9 + 7;
                            if (bArr[i16] < 0) {
                                i16 = i9 + 8;
                                if (bArr[i14] < 0) {
                                    i14 = i9 + 9;
                                    if (bArr[i16] < 0) {
                                        int i19 = i9 + 10;
                                        if (bArr[i14] < 0) {
                                            throw zzvk.zze();
                                        }
                                        i12 = i19;
                                        i = i18;
                                    }
                                }
                            }
                        }
                        i = i18;
                    }
                    i = i18;
                }
                i12 = i16;
            }
            i12 = i14;
        }
        this.zzb = i12;
        return i;
    }

    private final long zzY() {
        zzad(8);
        return zzZ();
    }

    private final long zzZ() {
        int i = this.zzb;
        byte[] bArr = this.zza;
        this.zzb = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    private final long zzaa() {
        long j10 = 0;
        for (int i = 0; i < 64; i += 7) {
            j10 |= (r3 & Byte.MAX_VALUE) << i;
            if ((zzU() & ISOFileInfo.DATA_BYTES1) == 0) {
                return j10;
            }
        }
        throw zzvk.zze();
    }

    private final <T> T zzab(zzwx<T> zzwxVar, zzuj zzujVar) {
        int i = this.zze;
        this.zze = ((this.zzd >>> 3) << 3) | 4;
        try {
            T zze = zzwxVar.zze();
            zzwxVar.zzh(zze, this, zzujVar);
            zzwxVar.zzf(zze);
            if (this.zzd == this.zze) {
                return zze;
            }
            throw zzvk.zzg();
        } finally {
            this.zze = i;
        }
    }

    private final <T> T zzac(zzwx<T> zzwxVar, zzuj zzujVar) {
        int zzX = zzX();
        zzad(zzX);
        int i = this.zzc;
        int i9 = this.zzb + zzX;
        this.zzc = i9;
        try {
            T zze = zzwxVar.zze();
            zzwxVar.zzh(zze, this, zzujVar);
            zzwxVar.zzf(zze);
            if (this.zzb == i9) {
                return zze;
            }
            throw zzvk.zzg();
        } finally {
            this.zzc = i;
        }
    }

    private final void zzad(int i) {
        if (i < 0 || i > this.zzc - this.zzb) {
            throw zzvk.zzj();
        }
    }

    private final void zzae(int i) {
        if (this.zzb != i) {
            throw zzvk.zzj();
        }
    }

    private final void zzaf(int i) {
        if ((this.zzd & 7) != i) {
            throw zzvk.zza();
        }
    }

    private final void zzag(int i) {
        zzad(i);
        this.zzb += i;
    }

    private final void zzah(int i) {
        zzad(i);
        if ((i & 3) != 0) {
            throw zzvk.zzg();
        }
    }

    private final void zzai(int i) {
        zzad(i);
        if ((i & 7) != 0) {
            throw zzvk.zzg();
        }
    }

    private final boolean zzaj() {
        return this.zzb == this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzA(List<Double> list) {
        int i;
        int i9;
        if (!(list instanceof zzug)) {
            int i10 = this.zzd & 7;
            if (i10 == 1) {
                do {
                    list.add(Double.valueOf(zza()));
                    if (zzaj()) {
                        return;
                    } else {
                        i = this.zzb;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i;
                return;
            }
            if (i10 != 2) {
                throw zzvk.zza();
            }
            int zzX = zzX();
            zzai(zzX);
            int i11 = this.zzb + zzX;
            while (this.zzb < i11) {
                list.add(Double.valueOf(Double.longBitsToDouble(zzZ())));
            }
            return;
        }
        zzug zzugVar = (zzug) list;
        int i12 = this.zzd & 7;
        if (i12 == 1) {
            do {
                zzugVar.zze(zza());
                if (zzaj()) {
                    return;
                } else {
                    i9 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i9;
            return;
        }
        if (i12 != 2) {
            throw zzvk.zza();
        }
        int zzX2 = zzX();
        zzai(zzX2);
        int i13 = this.zzb + zzX2;
        while (this.zzb < i13) {
            zzugVar.zze(Double.longBitsToDouble(zzZ()));
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzB(List<Integer> list) {
        int i;
        int i9;
        if (!(list instanceof zzva)) {
            int i10 = this.zzd & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzvk.zza();
                }
                int zzX = this.zzb + zzX();
                while (this.zzb < zzX) {
                    list.add(Integer.valueOf(zzX()));
                }
                return;
            }
            do {
                list.add(Integer.valueOf(zze()));
                if (zzaj()) {
                    return;
                } else {
                    i = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i;
            return;
        }
        zzva zzvaVar = (zzva) list;
        int i11 = this.zzd & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzvk.zza();
            }
            int zzX2 = this.zzb + zzX();
            while (this.zzb < zzX2) {
                zzvaVar.zzh(zzX());
            }
            return;
        }
        do {
            zzvaVar.zzh(zze());
            if (zzaj()) {
                return;
            } else {
                i9 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i9;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzC(List<Integer> list) {
        int i;
        int i9;
        if (!(list instanceof zzva)) {
            int i10 = this.zzd & 7;
            if (i10 == 2) {
                int zzX = zzX();
                zzah(zzX);
                int i11 = this.zzb + zzX;
                while (this.zzb < i11) {
                    list.add(Integer.valueOf(zzW()));
                }
                return;
            }
            if (i10 != 5) {
                throw zzvk.zza();
            }
            do {
                list.add(Integer.valueOf(zzf()));
                if (zzaj()) {
                    return;
                } else {
                    i = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i;
            return;
        }
        zzva zzvaVar = (zzva) list;
        int i12 = this.zzd & 7;
        if (i12 == 2) {
            int zzX2 = zzX();
            zzah(zzX2);
            int i13 = this.zzb + zzX2;
            while (this.zzb < i13) {
                zzvaVar.zzh(zzW());
            }
            return;
        }
        if (i12 != 5) {
            throw zzvk.zza();
        }
        do {
            zzvaVar.zzh(zzf());
            if (zzaj()) {
                return;
            } else {
                i9 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i9;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzD(List<Long> list) {
        int i;
        int i9;
        if (!(list instanceof zzvz)) {
            int i10 = this.zzd & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(zzk()));
                    if (zzaj()) {
                        return;
                    } else {
                        i = this.zzb;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i;
                return;
            }
            if (i10 != 2) {
                throw zzvk.zza();
            }
            int zzX = zzX();
            zzai(zzX);
            int i11 = this.zzb + zzX;
            while (this.zzb < i11) {
                list.add(Long.valueOf(zzZ()));
            }
            return;
        }
        zzvz zzvzVar = (zzvz) list;
        int i12 = this.zzd & 7;
        if (i12 == 1) {
            do {
                zzvzVar.zzf(zzk());
                if (zzaj()) {
                    return;
                } else {
                    i9 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i9;
            return;
        }
        if (i12 != 2) {
            throw zzvk.zza();
        }
        int zzX2 = zzX();
        zzai(zzX2);
        int i13 = this.zzb + zzX2;
        while (this.zzb < i13) {
            zzvzVar.zzf(zzZ());
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzE(List<Float> list) {
        int i;
        int i9;
        if (!(list instanceof zzuq)) {
            int i10 = this.zzd & 7;
            if (i10 == 2) {
                int zzX = zzX();
                zzah(zzX);
                int i11 = this.zzb + zzX;
                while (this.zzb < i11) {
                    list.add(Float.valueOf(Float.intBitsToFloat(zzW())));
                }
                return;
            }
            if (i10 != 5) {
                throw zzvk.zza();
            }
            do {
                list.add(Float.valueOf(zzb()));
                if (zzaj()) {
                    return;
                } else {
                    i = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i;
            return;
        }
        zzuq zzuqVar = (zzuq) list;
        int i12 = this.zzd & 7;
        if (i12 == 2) {
            int zzX2 = zzX();
            zzah(zzX2);
            int i13 = this.zzb + zzX2;
            while (this.zzb < i13) {
                zzuqVar.zze(Float.intBitsToFloat(zzW()));
            }
            return;
        }
        if (i12 != 5) {
            throw zzvk.zza();
        }
        do {
            zzuqVar.zze(zzb());
            if (zzaj()) {
                return;
            } else {
                i9 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.gtm.zzww
    public final <T> void zzF(List<T> list, zzwx<T> zzwxVar, zzuj zzujVar) {
        int i;
        int i9 = this.zzd;
        if ((i9 & 7) != 3) {
            throw zzvk.zza();
        }
        do {
            list.add(zzab(zzwxVar, zzujVar));
            if (zzaj()) {
                return;
            } else {
                i = this.zzb;
            }
        } while (zzX() == i9);
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzG(List<Integer> list) {
        int i;
        int i9;
        if (!(list instanceof zzva)) {
            int i10 = this.zzd & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(zzg()));
                    if (zzaj()) {
                        return;
                    } else {
                        i = this.zzb;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i;
                return;
            }
            if (i10 != 2) {
                throw zzvk.zza();
            }
            int zzX = this.zzb + zzX();
            while (this.zzb < zzX) {
                list.add(Integer.valueOf(zzX()));
            }
            zzae(zzX);
            return;
        }
        zzva zzvaVar = (zzva) list;
        int i11 = this.zzd & 7;
        if (i11 == 0) {
            do {
                zzvaVar.zzh(zzg());
                if (zzaj()) {
                    return;
                } else {
                    i9 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i9;
            return;
        }
        if (i11 != 2) {
            throw zzvk.zza();
        }
        int zzX2 = this.zzb + zzX();
        while (this.zzb < zzX2) {
            zzvaVar.zzh(zzX());
        }
        zzae(zzX2);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzH(List<Long> list) {
        int i;
        int i9;
        if (!(list instanceof zzvz)) {
            int i10 = this.zzd & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(zzl()));
                    if (zzaj()) {
                        return;
                    } else {
                        i = this.zzb;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i;
                return;
            }
            if (i10 != 2) {
                throw zzvk.zza();
            }
            int zzX = this.zzb + zzX();
            while (this.zzb < zzX) {
                list.add(Long.valueOf(zzp()));
            }
            zzae(zzX);
            return;
        }
        zzvz zzvzVar = (zzvz) list;
        int i11 = this.zzd & 7;
        if (i11 == 0) {
            do {
                zzvzVar.zzf(zzl());
                if (zzaj()) {
                    return;
                } else {
                    i9 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i9;
            return;
        }
        if (i11 != 2) {
            throw zzvk.zza();
        }
        int zzX2 = this.zzb + zzX();
        while (this.zzb < zzX2) {
            zzvzVar.zzf(zzp());
        }
        zzae(zzX2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.gtm.zzww
    public final <T> void zzI(List<T> list, zzwx<T> zzwxVar, zzuj zzujVar) {
        int i;
        int i9 = this.zzd;
        if ((i9 & 7) != 2) {
            throw zzvk.zza();
        }
        do {
            list.add(zzac(zzwxVar, zzujVar));
            if (zzaj()) {
                return;
            } else {
                i = this.zzb;
            }
        } while (zzX() == i9);
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzJ(List<Integer> list) {
        int i;
        int i9;
        if (!(list instanceof zzva)) {
            int i10 = this.zzd & 7;
            if (i10 == 2) {
                int zzX = zzX();
                zzah(zzX);
                int i11 = this.zzb + zzX;
                while (this.zzb < i11) {
                    list.add(Integer.valueOf(zzW()));
                }
                return;
            }
            if (i10 != 5) {
                throw zzvk.zza();
            }
            do {
                list.add(Integer.valueOf(zzh()));
                if (zzaj()) {
                    return;
                } else {
                    i = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i;
            return;
        }
        zzva zzvaVar = (zzva) list;
        int i12 = this.zzd & 7;
        if (i12 == 2) {
            int zzX2 = zzX();
            zzah(zzX2);
            int i13 = this.zzb + zzX2;
            while (this.zzb < i13) {
                zzvaVar.zzh(zzW());
            }
            return;
        }
        if (i12 != 5) {
            throw zzvk.zza();
        }
        do {
            zzvaVar.zzh(zzh());
            if (zzaj()) {
                return;
            } else {
                i9 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i9;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzK(List<Long> list) {
        int i;
        int i9;
        if (!(list instanceof zzvz)) {
            int i10 = this.zzd & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(zzm()));
                    if (zzaj()) {
                        return;
                    } else {
                        i = this.zzb;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i;
                return;
            }
            if (i10 != 2) {
                throw zzvk.zza();
            }
            int zzX = zzX();
            zzai(zzX);
            int i11 = this.zzb + zzX;
            while (this.zzb < i11) {
                list.add(Long.valueOf(zzZ()));
            }
            return;
        }
        zzvz zzvzVar = (zzvz) list;
        int i12 = this.zzd & 7;
        if (i12 == 1) {
            do {
                zzvzVar.zzf(zzm());
                if (zzaj()) {
                    return;
                } else {
                    i9 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i9;
            return;
        }
        if (i12 != 2) {
            throw zzvk.zza();
        }
        int zzX2 = zzX();
        zzai(zzX2);
        int i13 = this.zzb + zzX2;
        while (this.zzb < i13) {
            zzvzVar.zzf(zzZ());
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzL(List<Integer> list) {
        int i;
        int i9;
        if (!(list instanceof zzva)) {
            int i10 = this.zzd & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzvk.zza();
                }
                int zzX = this.zzb + zzX();
                while (this.zzb < zzX) {
                    list.add(Integer.valueOf(zztj.zzs(zzX())));
                }
                return;
            }
            do {
                list.add(Integer.valueOf(zzi()));
                if (zzaj()) {
                    return;
                } else {
                    i = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i;
            return;
        }
        zzva zzvaVar = (zzva) list;
        int i11 = this.zzd & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzvk.zza();
            }
            int zzX2 = this.zzb + zzX();
            while (this.zzb < zzX2) {
                zzvaVar.zzh(zztj.zzs(zzX()));
            }
            return;
        }
        do {
            zzvaVar.zzh(zzi());
            if (zzaj()) {
                return;
            } else {
                i9 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i9;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzM(List<Long> list) {
        int i;
        int i9;
        if (!(list instanceof zzvz)) {
            int i10 = this.zzd & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzvk.zza();
                }
                int zzX = this.zzb + zzX();
                while (this.zzb < zzX) {
                    list.add(Long.valueOf(zztj.zzt(zzp())));
                }
                return;
            }
            do {
                list.add(Long.valueOf(zzn()));
                if (zzaj()) {
                    return;
                } else {
                    i = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i;
            return;
        }
        zzvz zzvzVar = (zzvz) list;
        int i11 = this.zzd & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzvk.zza();
            }
            int zzX2 = this.zzb + zzX();
            while (this.zzb < zzX2) {
                zzvzVar.zzf(zztj.zzt(zzp()));
            }
            return;
        }
        do {
            zzvzVar.zzf(zzn());
            if (zzaj()) {
                return;
            } else {
                i9 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i9;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzN(List<String> list) {
        zzO(list, false);
    }

    public final void zzO(List<String> list, boolean z10) {
        int i;
        int i9;
        if ((this.zzd & 7) != 2) {
            throw zzvk.zza();
        }
        if (!(list instanceof zzvs) || z10) {
            do {
                list.add(zzw(z10));
                if (zzaj()) {
                    return;
                } else {
                    i = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i;
            return;
        }
        zzvs zzvsVar = (zzvs) list;
        do {
            zzvsVar.zzi(zzq());
            if (zzaj()) {
                return;
            } else {
                i9 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i9;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzP(List<String> list) {
        zzO(list, true);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzQ(List<Integer> list) {
        int i;
        int i9;
        if (!(list instanceof zzva)) {
            int i10 = this.zzd & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzvk.zza();
                }
                int zzX = this.zzb + zzX();
                while (this.zzb < zzX) {
                    list.add(Integer.valueOf(zzX()));
                }
                return;
            }
            do {
                list.add(Integer.valueOf(zzj()));
                if (zzaj()) {
                    return;
                } else {
                    i = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i;
            return;
        }
        zzva zzvaVar = (zzva) list;
        int i11 = this.zzd & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzvk.zza();
            }
            int zzX2 = this.zzb + zzX();
            while (this.zzb < zzX2) {
                zzvaVar.zzh(zzX());
            }
            return;
        }
        do {
            zzvaVar.zzh(zzj());
            if (zzaj()) {
                return;
            } else {
                i9 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i9;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzR(List<Long> list) {
        int i;
        int i9;
        if (!(list instanceof zzvz)) {
            int i10 = this.zzd & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(zzo()));
                    if (zzaj()) {
                        return;
                    } else {
                        i = this.zzb;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i;
                return;
            }
            if (i10 != 2) {
                throw zzvk.zza();
            }
            int zzX = this.zzb + zzX();
            while (this.zzb < zzX) {
                list.add(Long.valueOf(zzp()));
            }
            zzae(zzX);
            return;
        }
        zzvz zzvzVar = (zzvz) list;
        int i11 = this.zzd & 7;
        if (i11 == 0) {
            do {
                zzvzVar.zzf(zzo());
                if (zzaj()) {
                    return;
                } else {
                    i9 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i9;
            return;
        }
        if (i11 != 2) {
            throw zzvk.zza();
        }
        int zzX2 = this.zzb + zzX();
        while (this.zzb < zzX2) {
            zzvzVar.zzf(zzp());
        }
        zzae(zzX2);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final boolean zzS() {
        zzaf(0);
        return zzX() != 0;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final boolean zzT() {
        int i;
        int i9;
        if (zzaj() || (i = this.zzd) == (i9 = this.zze)) {
            return false;
        }
        int i10 = i & 7;
        if (i10 == 0) {
            int i11 = this.zzc;
            int i12 = this.zzb;
            if (i11 - i12 >= 10) {
                byte[] bArr = this.zza;
                int i13 = 0;
                while (i13 < 10) {
                    int i14 = i12 + 1;
                    if (bArr[i12] >= 0) {
                        this.zzb = i14;
                        break;
                    }
                    i13++;
                    i12 = i14;
                }
            }
            for (int i15 = 0; i15 < 10; i15++) {
                if (zzU() >= 0) {
                    return true;
                }
            }
            throw zzvk.zze();
        }
        if (i10 == 1) {
            zzag(8);
            return true;
        }
        if (i10 == 2) {
            zzag(zzX());
            return true;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw zzvk.zza();
            }
            zzag(4);
            return true;
        }
        this.zze = ((i >>> 3) << 3) | 4;
        while (zzc() != Integer.MAX_VALUE && zzT()) {
        }
        if (this.zzd != this.zze) {
            throw zzvk.zzg();
        }
        this.zze = i9;
        return true;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final double zza() {
        zzaf(1);
        return Double.longBitsToDouble(zzY());
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final float zzb() {
        zzaf(5);
        return Float.intBitsToFloat(zzV());
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final int zzc() {
        if (zzaj()) {
            return Integer.MAX_VALUE;
        }
        int zzX = zzX();
        this.zzd = zzX;
        if (zzX == this.zze) {
            return Integer.MAX_VALUE;
        }
        return zzX >>> 3;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final int zze() {
        zzaf(0);
        return zzX();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final int zzf() {
        zzaf(5);
        return zzV();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final int zzg() {
        zzaf(0);
        return zzX();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final int zzh() {
        zzaf(5);
        return zzV();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final int zzi() {
        zzaf(0);
        return zztj.zzs(zzX());
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final int zzj() {
        zzaf(0);
        return zzX();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final long zzk() {
        zzaf(1);
        return zzY();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final long zzl() {
        zzaf(0);
        return zzp();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final long zzm() {
        zzaf(1);
        return zzY();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final long zzn() {
        zzaf(0);
        return zztj.zzt(zzp());
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final long zzo() {
        zzaf(0);
        return zzp();
    }

    public final long zzp() {
        long j10;
        long j11;
        int i = this.zzb;
        int i9 = this.zzc;
        if (i9 == i) {
            throw zzvk.zzj();
        }
        byte[] bArr = this.zza;
        int i10 = i + 1;
        byte b9 = bArr[i];
        if (b9 >= 0) {
            this.zzb = i10;
            return b9;
        }
        if (i9 - i10 < 9) {
            return zzaa();
        }
        int i11 = i + 2;
        int i12 = (bArr[i10] << 7) ^ b9;
        if (i12 < 0) {
            j10 = i12 ^ (-128);
        } else {
            int i13 = i + 3;
            int i14 = (bArr[i11] << 14) ^ i12;
            if (i14 >= 0) {
                j10 = i14 ^ 16256;
            } else {
                int i15 = i + 4;
                int i16 = i14 ^ (bArr[i13] << 21);
                if (i16 < 0) {
                    long j12 = (-2080896) ^ i16;
                    i11 = i15;
                    j10 = j12;
                } else {
                    i13 = i + 5;
                    long j13 = i16 ^ (bArr[i15] << 28);
                    if (j13 >= 0) {
                        j10 = j13 ^ 266354560;
                    } else {
                        i11 = i + 6;
                        long j14 = (bArr[i13] << 35) ^ j13;
                        if (j14 < 0) {
                            j11 = -34093383808L;
                        } else {
                            int i17 = i + 7;
                            long j15 = j14 ^ (bArr[i11] << 42);
                            if (j15 >= 0) {
                                j10 = j15 ^ 4363953127296L;
                            } else {
                                i11 = i + 8;
                                j14 = j15 ^ (bArr[i17] << 49);
                                if (j14 < 0) {
                                    j11 = -558586000294016L;
                                } else {
                                    i17 = i + 9;
                                    long j16 = (j14 ^ (bArr[i11] << 56)) ^ 71499008037633920L;
                                    if (j16 < 0) {
                                        i11 = i + 10;
                                        if (bArr[i17] < 0) {
                                            throw zzvk.zze();
                                        }
                                        j10 = j16;
                                    } else {
                                        j10 = j16;
                                    }
                                }
                            }
                            i11 = i17;
                        }
                        j10 = j14 ^ j11;
                    }
                }
            }
            i11 = i13;
        }
        this.zzb = i11;
        return j10;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final zztd zzq() {
        zzaf(2);
        int zzX = zzX();
        if (zzX == 0) {
            return zztd.zzb;
        }
        zzad(zzX);
        zztd zzq = zztd.zzq(this.zza, this.zzb, zzX);
        this.zzb += zzX;
        return zzq;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final <T> T zzr(Class<T> cls, zzuj zzujVar) {
        zzaf(3);
        return (T) zzab(zzwt.zza().zzb(cls), zzujVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final <T> T zzs(zzwx<T> zzwxVar, zzuj zzujVar) {
        zzaf(3);
        return (T) zzab(zzwxVar, zzujVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final <T> T zzt(Class<T> cls, zzuj zzujVar) {
        zzaf(2);
        return (T) zzac(zzwt.zza().zzb(cls), zzujVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final <T> T zzu(zzwx<T> zzwxVar, zzuj zzujVar) {
        zzaf(2);
        return (T) zzac(zzwxVar, zzujVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final String zzv() {
        return zzw(false);
    }

    public final String zzw(boolean z10) {
        zzaf(2);
        int zzX = zzX();
        if (zzX == 0) {
            return "";
        }
        zzad(zzX);
        if (z10) {
            byte[] bArr = this.zza;
            int i = this.zzb;
            if (!zzyd.zzf(bArr, i, i + zzX)) {
                throw zzvk.zzd();
            }
        }
        String str = new String(this.zza, this.zzb, zzX, zzvi.zza);
        this.zzb += zzX;
        return str;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final String zzx() {
        return zzw(true);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzy(List<Boolean> list) {
        int i;
        int i9;
        if (!(list instanceof zzsr)) {
            int i10 = this.zzd & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzvk.zza();
                }
                int zzX = this.zzb + zzX();
                while (this.zzb < zzX) {
                    list.add(Boolean.valueOf(zzX() != 0));
                }
                zzae(zzX);
                return;
            }
            do {
                list.add(Boolean.valueOf(zzS()));
                if (zzaj()) {
                    return;
                } else {
                    i = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i;
            return;
        }
        zzsr zzsrVar = (zzsr) list;
        int i11 = this.zzd & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzvk.zza();
            }
            int zzX2 = this.zzb + zzX();
            while (this.zzb < zzX2) {
                zzsrVar.zze(zzX() != 0);
            }
            zzae(zzX2);
            return;
        }
        do {
            zzsrVar.zze(zzS());
            if (zzaj()) {
                return;
            } else {
                i9 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i9;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzz(List<zztd> list) {
        int i;
        if ((this.zzd & 7) != 2) {
            throw zzvk.zza();
        }
        do {
            list.add(zzq());
            if (zzaj()) {
                return;
            } else {
                i = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i;
    }
}
