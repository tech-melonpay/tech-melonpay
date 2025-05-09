package com.google.android.gms.internal.gtm;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zztk implements zzww {
    private final zztj zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zztk(zztj zztjVar) {
        zzvi.zzf(zztjVar, "input");
        this.zza = zztjVar;
        zztjVar.zzc = this;
    }

    private final <T> T zzO(zzwx<T> zzwxVar, zzuj zzujVar) {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            T zze = zzwxVar.zze();
            zzwxVar.zzh(zze, this, zzujVar);
            zzwxVar.zzf(zze);
            if (this.zzb == this.zzc) {
                return zze;
            }
            throw zzvk.zzg();
        } finally {
            this.zzc = i;
        }
    }

    private final <T> T zzU(zzwx<T> zzwxVar, zzuj zzujVar) {
        int zzn = ((zzth) this.zza).zzn();
        zztj zztjVar = this.zza;
        if (zztjVar.zza >= zztjVar.zzb) {
            throw new zzvk("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int zzb = zztjVar.zzb(zzn);
        T zze = zzwxVar.zze();
        this.zza.zza++;
        zzwxVar.zzh(zze, this, zzujVar);
        zzwxVar.zzf(zze);
        this.zza.zzg(0);
        r5.zza--;
        this.zza.zzh(zzb);
        return zze;
    }

    private final void zzV(int i) {
        if (this.zza.zza() != i) {
            throw zzvk.zzj();
        }
    }

    private final void zzW(int i) {
        if ((this.zzb & 7) != i) {
            throw zzvk.zza();
        }
    }

    private static final void zzX(int i) {
        if ((i & 3) != 0) {
            throw zzvk.zzg();
        }
    }

    private static final void zzY(int i) {
        if ((i & 7) != 0) {
            throw zzvk.zzg();
        }
    }

    public static zztk zzp(zztj zztjVar) {
        zztk zztkVar = zztjVar.zzc;
        return zztkVar != null ? zztkVar : new zztk(zztjVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzA(List<Double> list) {
        int zzc;
        int zzc2;
        if (!(list instanceof zzug)) {
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((zzth) this.zza).zzo())));
                    if (this.zza.zzi()) {
                        return;
                    } else {
                        zzc = this.zza.zzc();
                    }
                } while (zzc == this.zzb);
                this.zzd = zzc;
                return;
            }
            if (i != 2) {
                throw zzvk.zza();
            }
            int zzn = ((zzth) this.zza).zzn();
            zzY(zzn);
            int zza = this.zza.zza() + zzn;
            do {
                list.add(Double.valueOf(Double.longBitsToDouble(((zzth) this.zza).zzo())));
            } while (this.zza.zza() < zza);
            return;
        }
        zzug zzugVar = (zzug) list;
        int i9 = this.zzb & 7;
        if (i9 == 1) {
            do {
                zzugVar.zze(Double.longBitsToDouble(((zzth) this.zza).zzo()));
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc2 = this.zza.zzc();
                }
            } while (zzc2 == this.zzb);
            this.zzd = zzc2;
            return;
        }
        if (i9 != 2) {
            throw zzvk.zza();
        }
        int zzn2 = ((zzth) this.zza).zzn();
        zzY(zzn2);
        int zza2 = this.zza.zza() + zzn2;
        do {
            zzugVar.zze(Double.longBitsToDouble(((zzth) this.zza).zzo()));
        } while (this.zza.zza() < zza2);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzB(List<Integer> list) {
        int zzc;
        int zzc2;
        if (!(list instanceof zzva)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(((zzth) this.zza).zzn()));
                    if (this.zza.zzi()) {
                        return;
                    } else {
                        zzc = this.zza.zzc();
                    }
                } while (zzc == this.zzb);
                this.zzd = zzc;
                return;
            }
            if (i != 2) {
                throw zzvk.zza();
            }
            int zza = this.zza.zza() + ((zzth) this.zza).zzn();
            do {
                list.add(Integer.valueOf(((zzth) this.zza).zzn()));
            } while (this.zza.zza() < zza);
            zzV(zza);
            return;
        }
        zzva zzvaVar = (zzva) list;
        int i9 = this.zzb & 7;
        if (i9 == 0) {
            do {
                zzvaVar.zzh(((zzth) this.zza).zzn());
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc2 = this.zza.zzc();
                }
            } while (zzc2 == this.zzb);
            this.zzd = zzc2;
            return;
        }
        if (i9 != 2) {
            throw zzvk.zza();
        }
        int zza2 = this.zza.zza() + ((zzth) this.zza).zzn();
        do {
            zzvaVar.zzh(((zzth) this.zza).zzn());
        } while (this.zza.zza() < zza2);
        zzV(zza2);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzC(List<Integer> list) {
        int zzc;
        int zzc2;
        if (!(list instanceof zzva)) {
            int i = this.zzb & 7;
            if (i == 2) {
                int zzn = ((zzth) this.zza).zzn();
                zzX(zzn);
                int zza = this.zza.zza() + zzn;
                do {
                    list.add(Integer.valueOf(((zzth) this.zza).zzm()));
                } while (this.zza.zza() < zza);
                return;
            }
            if (i != 5) {
                throw zzvk.zza();
            }
            do {
                list.add(Integer.valueOf(((zzth) this.zza).zzm()));
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc = this.zza.zzc();
                }
            } while (zzc == this.zzb);
            this.zzd = zzc;
            return;
        }
        zzva zzvaVar = (zzva) list;
        int i9 = this.zzb & 7;
        if (i9 == 2) {
            int zzn2 = ((zzth) this.zza).zzn();
            zzX(zzn2);
            int zza2 = this.zza.zza() + zzn2;
            do {
                zzvaVar.zzh(((zzth) this.zza).zzm());
            } while (this.zza.zza() < zza2);
            return;
        }
        if (i9 != 5) {
            throw zzvk.zza();
        }
        do {
            zzvaVar.zzh(((zzth) this.zza).zzm());
            if (this.zza.zzi()) {
                return;
            } else {
                zzc2 = this.zza.zzc();
            }
        } while (zzc2 == this.zzb);
        this.zzd = zzc2;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzD(List<Long> list) {
        int zzc;
        int zzc2;
        if (!(list instanceof zzvz)) {
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(((zzth) this.zza).zzo()));
                    if (this.zza.zzi()) {
                        return;
                    } else {
                        zzc = this.zza.zzc();
                    }
                } while (zzc == this.zzb);
                this.zzd = zzc;
                return;
            }
            if (i != 2) {
                throw zzvk.zza();
            }
            int zzn = ((zzth) this.zza).zzn();
            zzY(zzn);
            int zza = this.zza.zza() + zzn;
            do {
                list.add(Long.valueOf(((zzth) this.zza).zzo()));
            } while (this.zza.zza() < zza);
            return;
        }
        zzvz zzvzVar = (zzvz) list;
        int i9 = this.zzb & 7;
        if (i9 == 1) {
            do {
                zzvzVar.zzf(((zzth) this.zza).zzo());
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc2 = this.zza.zzc();
                }
            } while (zzc2 == this.zzb);
            this.zzd = zzc2;
            return;
        }
        if (i9 != 2) {
            throw zzvk.zza();
        }
        int zzn2 = ((zzth) this.zza).zzn();
        zzY(zzn2);
        int zza2 = this.zza.zza() + zzn2;
        do {
            zzvzVar.zzf(((zzth) this.zza).zzo());
        } while (this.zza.zza() < zza2);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzE(List<Float> list) {
        int zzc;
        int zzc2;
        if (!(list instanceof zzuq)) {
            int i = this.zzb & 7;
            if (i == 2) {
                int zzn = ((zzth) this.zza).zzn();
                zzX(zzn);
                int zza = this.zza.zza() + zzn;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((zzth) this.zza).zzm())));
                } while (this.zza.zza() < zza);
                return;
            }
            if (i != 5) {
                throw zzvk.zza();
            }
            do {
                list.add(Float.valueOf(Float.intBitsToFloat(((zzth) this.zza).zzm())));
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc = this.zza.zzc();
                }
            } while (zzc == this.zzb);
            this.zzd = zzc;
            return;
        }
        zzuq zzuqVar = (zzuq) list;
        int i9 = this.zzb & 7;
        if (i9 == 2) {
            int zzn2 = ((zzth) this.zza).zzn();
            zzX(zzn2);
            int zza2 = this.zza.zza() + zzn2;
            do {
                zzuqVar.zze(Float.intBitsToFloat(((zzth) this.zza).zzm()));
            } while (this.zza.zza() < zza2);
            return;
        }
        if (i9 != 5) {
            throw zzvk.zza();
        }
        do {
            zzuqVar.zze(Float.intBitsToFloat(((zzth) this.zza).zzm()));
            if (this.zza.zzi()) {
                return;
            } else {
                zzc2 = this.zza.zzc();
            }
        } while (zzc2 == this.zzb);
        this.zzd = zzc2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.gtm.zzww
    public final <T> void zzF(List<T> list, zzwx<T> zzwxVar, zzuj zzujVar) {
        int zzc;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw zzvk.zza();
        }
        do {
            list.add(zzO(zzwxVar, zzujVar));
            if (this.zza.zzi() || this.zzd != 0) {
                return;
            } else {
                zzc = this.zza.zzc();
            }
        } while (zzc == i);
        this.zzd = zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzG(List<Integer> list) {
        int zzc;
        int zzc2;
        if (!(list instanceof zzva)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(((zzth) this.zza).zzn()));
                    if (this.zza.zzi()) {
                        return;
                    } else {
                        zzc = this.zza.zzc();
                    }
                } while (zzc == this.zzb);
                this.zzd = zzc;
                return;
            }
            if (i != 2) {
                throw zzvk.zza();
            }
            int zza = this.zza.zza() + ((zzth) this.zza).zzn();
            do {
                list.add(Integer.valueOf(((zzth) this.zza).zzn()));
            } while (this.zza.zza() < zza);
            zzV(zza);
            return;
        }
        zzva zzvaVar = (zzva) list;
        int i9 = this.zzb & 7;
        if (i9 == 0) {
            do {
                zzvaVar.zzh(((zzth) this.zza).zzn());
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc2 = this.zza.zzc();
                }
            } while (zzc2 == this.zzb);
            this.zzd = zzc2;
            return;
        }
        if (i9 != 2) {
            throw zzvk.zza();
        }
        int zza2 = this.zza.zza() + ((zzth) this.zza).zzn();
        do {
            zzvaVar.zzh(((zzth) this.zza).zzn());
        } while (this.zza.zza() < zza2);
        zzV(zza2);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzH(List<Long> list) {
        int zzc;
        int zzc2;
        if (!(list instanceof zzvz)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(((zzth) this.zza).zzp()));
                    if (this.zza.zzi()) {
                        return;
                    } else {
                        zzc = this.zza.zzc();
                    }
                } while (zzc == this.zzb);
                this.zzd = zzc;
                return;
            }
            if (i != 2) {
                throw zzvk.zza();
            }
            int zza = this.zza.zza() + ((zzth) this.zza).zzn();
            do {
                list.add(Long.valueOf(((zzth) this.zza).zzp()));
            } while (this.zza.zza() < zza);
            zzV(zza);
            return;
        }
        zzvz zzvzVar = (zzvz) list;
        int i9 = this.zzb & 7;
        if (i9 == 0) {
            do {
                zzvzVar.zzf(((zzth) this.zza).zzp());
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc2 = this.zza.zzc();
                }
            } while (zzc2 == this.zzb);
            this.zzd = zzc2;
            return;
        }
        if (i9 != 2) {
            throw zzvk.zza();
        }
        int zza2 = this.zza.zza() + ((zzth) this.zza).zzn();
        do {
            zzvzVar.zzf(((zzth) this.zza).zzp());
        } while (this.zza.zza() < zza2);
        zzV(zza2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.gtm.zzww
    public final <T> void zzI(List<T> list, zzwx<T> zzwxVar, zzuj zzujVar) {
        int zzc;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw zzvk.zza();
        }
        do {
            list.add(zzU(zzwxVar, zzujVar));
            if (this.zza.zzi() || this.zzd != 0) {
                return;
            } else {
                zzc = this.zza.zzc();
            }
        } while (zzc == i);
        this.zzd = zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzJ(List<Integer> list) {
        int zzc;
        int zzc2;
        if (!(list instanceof zzva)) {
            int i = this.zzb & 7;
            if (i == 2) {
                int zzn = ((zzth) this.zza).zzn();
                zzX(zzn);
                int zza = this.zza.zza() + zzn;
                do {
                    list.add(Integer.valueOf(((zzth) this.zza).zzm()));
                } while (this.zza.zza() < zza);
                return;
            }
            if (i != 5) {
                throw zzvk.zza();
            }
            do {
                list.add(Integer.valueOf(((zzth) this.zza).zzm()));
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc = this.zza.zzc();
                }
            } while (zzc == this.zzb);
            this.zzd = zzc;
            return;
        }
        zzva zzvaVar = (zzva) list;
        int i9 = this.zzb & 7;
        if (i9 == 2) {
            int zzn2 = ((zzth) this.zza).zzn();
            zzX(zzn2);
            int zza2 = this.zza.zza() + zzn2;
            do {
                zzvaVar.zzh(((zzth) this.zza).zzm());
            } while (this.zza.zza() < zza2);
            return;
        }
        if (i9 != 5) {
            throw zzvk.zza();
        }
        do {
            zzvaVar.zzh(((zzth) this.zza).zzm());
            if (this.zza.zzi()) {
                return;
            } else {
                zzc2 = this.zza.zzc();
            }
        } while (zzc2 == this.zzb);
        this.zzd = zzc2;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzK(List<Long> list) {
        int zzc;
        int zzc2;
        if (!(list instanceof zzvz)) {
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(((zzth) this.zza).zzo()));
                    if (this.zza.zzi()) {
                        return;
                    } else {
                        zzc = this.zza.zzc();
                    }
                } while (zzc == this.zzb);
                this.zzd = zzc;
                return;
            }
            if (i != 2) {
                throw zzvk.zza();
            }
            int zzn = ((zzth) this.zza).zzn();
            zzY(zzn);
            int zza = this.zza.zza() + zzn;
            do {
                list.add(Long.valueOf(((zzth) this.zza).zzo()));
            } while (this.zza.zza() < zza);
            return;
        }
        zzvz zzvzVar = (zzvz) list;
        int i9 = this.zzb & 7;
        if (i9 == 1) {
            do {
                zzvzVar.zzf(((zzth) this.zza).zzo());
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc2 = this.zza.zzc();
                }
            } while (zzc2 == this.zzb);
            this.zzd = zzc2;
            return;
        }
        if (i9 != 2) {
            throw zzvk.zza();
        }
        int zzn2 = ((zzth) this.zza).zzn();
        zzY(zzn2);
        int zza2 = this.zza.zza() + zzn2;
        do {
            zzvzVar.zzf(((zzth) this.zza).zzo());
        } while (this.zza.zza() < zza2);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzL(List<Integer> list) {
        int zzc;
        int zzc2;
        if (!(list instanceof zzva)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(zztj.zzs(((zzth) this.zza).zzn())));
                    if (this.zza.zzi()) {
                        return;
                    } else {
                        zzc = this.zza.zzc();
                    }
                } while (zzc == this.zzb);
                this.zzd = zzc;
                return;
            }
            if (i != 2) {
                throw zzvk.zza();
            }
            int zza = this.zza.zza() + ((zzth) this.zza).zzn();
            do {
                list.add(Integer.valueOf(zztj.zzs(((zzth) this.zza).zzn())));
            } while (this.zza.zza() < zza);
            zzV(zza);
            return;
        }
        zzva zzvaVar = (zzva) list;
        int i9 = this.zzb & 7;
        if (i9 == 0) {
            do {
                zzvaVar.zzh(zztj.zzs(((zzth) this.zza).zzn()));
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc2 = this.zza.zzc();
                }
            } while (zzc2 == this.zzb);
            this.zzd = zzc2;
            return;
        }
        if (i9 != 2) {
            throw zzvk.zza();
        }
        int zza2 = this.zza.zza() + ((zzth) this.zza).zzn();
        do {
            zzvaVar.zzh(zztj.zzs(((zzth) this.zza).zzn()));
        } while (this.zza.zza() < zza2);
        zzV(zza2);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzM(List<Long> list) {
        int zzc;
        int zzc2;
        if (!(list instanceof zzvz)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(zztj.zzt(((zzth) this.zza).zzp())));
                    if (this.zza.zzi()) {
                        return;
                    } else {
                        zzc = this.zza.zzc();
                    }
                } while (zzc == this.zzb);
                this.zzd = zzc;
                return;
            }
            if (i != 2) {
                throw zzvk.zza();
            }
            int zza = this.zza.zza() + ((zzth) this.zza).zzn();
            do {
                list.add(Long.valueOf(zztj.zzt(((zzth) this.zza).zzp())));
            } while (this.zza.zza() < zza);
            zzV(zza);
            return;
        }
        zzvz zzvzVar = (zzvz) list;
        int i9 = this.zzb & 7;
        if (i9 == 0) {
            do {
                zzvzVar.zzf(zztj.zzt(((zzth) this.zza).zzp()));
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc2 = this.zza.zzc();
                }
            } while (zzc2 == this.zzb);
            this.zzd = zzc2;
            return;
        }
        if (i9 != 2) {
            throw zzvk.zza();
        }
        int zza2 = this.zza.zza() + ((zzth) this.zza).zzn();
        do {
            zzvzVar.zzf(zztj.zzt(((zzth) this.zza).zzp()));
        } while (this.zza.zza() < zza2);
        zzV(zza2);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzN(List<String> list) {
        zzw(list, false);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzP(List<String> list) {
        zzw(list, true);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzQ(List<Integer> list) {
        int zzc;
        int zzc2;
        if (!(list instanceof zzva)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(((zzth) this.zza).zzn()));
                    if (this.zza.zzi()) {
                        return;
                    } else {
                        zzc = this.zza.zzc();
                    }
                } while (zzc == this.zzb);
                this.zzd = zzc;
                return;
            }
            if (i != 2) {
                throw zzvk.zza();
            }
            int zza = this.zza.zza() + ((zzth) this.zza).zzn();
            do {
                list.add(Integer.valueOf(((zzth) this.zza).zzn()));
            } while (this.zza.zza() < zza);
            zzV(zza);
            return;
        }
        zzva zzvaVar = (zzva) list;
        int i9 = this.zzb & 7;
        if (i9 == 0) {
            do {
                zzvaVar.zzh(((zzth) this.zza).zzn());
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc2 = this.zza.zzc();
                }
            } while (zzc2 == this.zzb);
            this.zzd = zzc2;
            return;
        }
        if (i9 != 2) {
            throw zzvk.zza();
        }
        int zza2 = this.zza.zza() + ((zzth) this.zza).zzn();
        do {
            zzvaVar.zzh(((zzth) this.zza).zzn());
        } while (this.zza.zza() < zza2);
        zzV(zza2);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzR(List<Long> list) {
        int zzc;
        int zzc2;
        if (!(list instanceof zzvz)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(((zzth) this.zza).zzp()));
                    if (this.zza.zzi()) {
                        return;
                    } else {
                        zzc = this.zza.zzc();
                    }
                } while (zzc == this.zzb);
                this.zzd = zzc;
                return;
            }
            if (i != 2) {
                throw zzvk.zza();
            }
            int zza = this.zza.zza() + ((zzth) this.zza).zzn();
            do {
                list.add(Long.valueOf(((zzth) this.zza).zzp()));
            } while (this.zza.zza() < zza);
            zzV(zza);
            return;
        }
        zzvz zzvzVar = (zzvz) list;
        int i9 = this.zzb & 7;
        if (i9 == 0) {
            do {
                zzvzVar.zzf(((zzth) this.zza).zzp());
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc2 = this.zza.zzc();
                }
            } while (zzc2 == this.zzb);
            this.zzd = zzc2;
            return;
        }
        if (i9 != 2) {
            throw zzvk.zza();
        }
        int zza2 = this.zza.zza() + ((zzth) this.zza).zzn();
        do {
            zzvzVar.zzf(((zzth) this.zza).zzp());
        } while (this.zza.zza() < zza2);
        zzV(zza2);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final boolean zzS() {
        zzW(0);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final boolean zzT() {
        int i;
        if (this.zza.zzi() || (i = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzk(i);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final double zza() {
        zzW(1);
        return Double.longBitsToDouble(((zzth) this.zza).zzo());
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final float zzb() {
        zzW(5);
        return Float.intBitsToFloat(((zzth) this.zza).zzm());
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final int zzc() {
        int i = this.zzd;
        if (i != 0) {
            this.zzb = i;
            this.zzd = 0;
        } else {
            i = this.zza.zzc();
            this.zzb = i;
        }
        if (i == 0 || i == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final int zze() {
        zzW(0);
        return ((zzth) this.zza).zzn();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final int zzf() {
        zzW(5);
        return ((zzth) this.zza).zzm();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final int zzg() {
        zzW(0);
        return ((zzth) this.zza).zzn();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final int zzh() {
        zzW(5);
        return ((zzth) this.zza).zzm();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final int zzi() {
        zzW(0);
        return zztj.zzs(((zzth) this.zza).zzn());
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final int zzj() {
        zzW(0);
        return ((zzth) this.zza).zzn();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final long zzk() {
        zzW(1);
        return ((zzth) this.zza).zzo();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final long zzl() {
        zzW(0);
        return ((zzth) this.zza).zzp();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final long zzm() {
        zzW(1);
        return ((zzth) this.zza).zzo();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final long zzn() {
        zzW(0);
        return zztj.zzt(((zzth) this.zza).zzp());
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final long zzo() {
        zzW(0);
        return ((zzth) this.zza).zzp();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final zztd zzq() {
        zzW(2);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final <T> T zzr(Class<T> cls, zzuj zzujVar) {
        zzW(3);
        return (T) zzO(zzwt.zza().zzb(cls), zzujVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final <T> T zzs(zzwx<T> zzwxVar, zzuj zzujVar) {
        zzW(3);
        return (T) zzO(zzwxVar, zzujVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final <T> T zzt(Class<T> cls, zzuj zzujVar) {
        zzW(2);
        return (T) zzU(zzwt.zza().zzb(cls), zzujVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final <T> T zzu(zzwx<T> zzwxVar, zzuj zzujVar) {
        zzW(2);
        return (T) zzU(zzwxVar, zzujVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final String zzv() {
        zzW(2);
        return this.zza.zze();
    }

    public final void zzw(List<String> list, boolean z10) {
        int zzc;
        int zzc2;
        if ((this.zzb & 7) != 2) {
            throw zzvk.zza();
        }
        if (!(list instanceof zzvs) || z10) {
            do {
                list.add(z10 ? zzx() : zzv());
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc = this.zza.zzc();
                }
            } while (zzc == this.zzb);
            this.zzd = zzc;
            return;
        }
        zzvs zzvsVar = (zzvs) list;
        do {
            zzvsVar.zzi(zzq());
            if (this.zza.zzi()) {
                return;
            } else {
                zzc2 = this.zza.zzc();
            }
        } while (zzc2 == this.zzb);
        this.zzd = zzc2;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final String zzx() {
        zzW(2);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzy(List<Boolean> list) {
        int zzc;
        int zzc2;
        if (!(list instanceof zzsr)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(this.zza.zzj()));
                    if (this.zza.zzi()) {
                        return;
                    } else {
                        zzc = this.zza.zzc();
                    }
                } while (zzc == this.zzb);
                this.zzd = zzc;
                return;
            }
            if (i != 2) {
                throw zzvk.zza();
            }
            int zza = this.zza.zza() + ((zzth) this.zza).zzn();
            do {
                list.add(Boolean.valueOf(this.zza.zzj()));
            } while (this.zza.zza() < zza);
            zzV(zza);
            return;
        }
        zzsr zzsrVar = (zzsr) list;
        int i9 = this.zzb & 7;
        if (i9 == 0) {
            do {
                zzsrVar.zze(this.zza.zzj());
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc2 = this.zza.zzc();
                }
            } while (zzc2 == this.zzb);
            this.zzd = zzc2;
            return;
        }
        if (i9 != 2) {
            throw zzvk.zza();
        }
        int zza2 = this.zza.zza() + ((zzth) this.zza).zzn();
        do {
            zzsrVar.zze(this.zza.zzj());
        } while (this.zza.zza() < zza2);
        zzV(zza2);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzz(List<zztd> list) {
        int zzc;
        if ((this.zzb & 7) != 2) {
            throw zzvk.zza();
        }
        do {
            list.add(zzq());
            if (this.zza.zzi()) {
                return;
            } else {
                zzc = this.zza.zzc();
            }
        } while (zzc == this.zzb);
        this.zzd = zzc;
    }
}
