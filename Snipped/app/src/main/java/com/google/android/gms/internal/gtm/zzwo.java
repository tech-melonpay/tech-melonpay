package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zzwo<T> implements zzwx<T> {
    private final zzwk zza;
    private final zzxo<?, ?> zzb;
    private final boolean zzc;
    private final zzuk<?> zzd;

    private zzwo(zzxo<?, ?> zzxoVar, zzuk<?> zzukVar, zzwk zzwkVar) {
        this.zzb = zzxoVar;
        this.zzc = zzukVar.zzi(zzwkVar);
        this.zzd = zzukVar;
        this.zza = zzwkVar;
    }

    public static <T> zzwo<T> zzc(zzxo<?, ?> zzxoVar, zzuk<?> zzukVar, zzwk zzwkVar) {
        return new zzwo<>(zzxoVar, zzukVar, zzwkVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final int zza(T t3) {
        zzxo<?, ?> zzxoVar = this.zzb;
        int zzb = zzxoVar.zzb(zzxoVar.zzd(t3));
        return this.zzc ? zzb + this.zzd.zzb(t3).zzb() : zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final int zzb(T t3) {
        int hashCode = this.zzb.zzd(t3).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zzb(t3).zza.hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final T zze() {
        return (T) this.zza.zzao().zzD();
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final void zzf(T t3) {
        this.zzb.zzm(t3);
        this.zzd.zzf(t3);
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final void zzg(T t3, T t10) {
        zzwz.zzF(this.zzb, t3, t10);
        if (this.zzc) {
            zzwz.zzE(this.zzd, t3, t10);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final void zzh(T t3, zzww zzwwVar, zzuj zzujVar) {
        boolean zzT;
        zzxo<?, ?> zzxoVar = this.zzb;
        zzuk<?> zzukVar = this.zzd;
        Object zzc = zzxoVar.zzc(t3);
        zzuo<?> zzc2 = zzukVar.zzc(t3);
        while (zzwwVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzwwVar.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zzd2 = zzukVar.zzd(zzujVar, this.zza, zzd >>> 3);
                        if (zzd2 != null) {
                            zzukVar.zzg(zzwwVar, zzd2, zzujVar, zzc2);
                        } else {
                            zzT = zzxoVar.zzp(zzc, zzwwVar);
                        }
                    } else {
                        zzT = zzwwVar.zzT();
                    }
                    if (!zzT) {
                        zzxoVar.zzn(t3, zzc);
                        return;
                    }
                } else {
                    Object obj = null;
                    int i = 0;
                    zztd zztdVar = null;
                    while (zzwwVar.zzc() != Integer.MAX_VALUE) {
                        int zzd3 = zzwwVar.zzd();
                        if (zzd3 == 16) {
                            i = zzwwVar.zzj();
                            obj = zzukVar.zzd(zzujVar, this.zza, i);
                        } else if (zzd3 == 26) {
                            if (obj != null) {
                                zzukVar.zzg(zzwwVar, obj, zzujVar, zzc2);
                            } else {
                                zztdVar = zzwwVar.zzq();
                            }
                        } else if (!zzwwVar.zzT()) {
                            break;
                        }
                    }
                    if (zzwwVar.zzd() != 12) {
                        throw zzvk.zzb();
                    }
                    if (zztdVar != null) {
                        if (obj != null) {
                            zzukVar.zzh(zztdVar, obj, zzujVar, zzc2);
                        } else {
                            zzxoVar.zzk(zzc, i, zztdVar);
                        }
                    }
                }
            } catch (Throwable th) {
                zzxoVar.zzn(t3, zzc);
                throw th;
            }
        }
        zzxoVar.zzn(t3, zzc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf A[EDGE_INSN: B:24:0x00bf->B:25:0x00bf BREAK  A[LOOP:1: B:10:0x0067->B:18:0x0067], SYNTHETIC] */
    @Override // com.google.android.gms.internal.gtm.zzwx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(T r11, byte[] r12, int r13, int r14, com.google.android.gms.internal.gtm.zzsl r15) {
        /*
            r10 = this;
            r0 = r11
            com.google.android.gms.internal.gtm.zzuz r0 = (com.google.android.gms.internal.gtm.zzuz) r0
            com.google.android.gms.internal.gtm.zzxp r1 = r0.zzc
            com.google.android.gms.internal.gtm.zzxp r2 = com.google.android.gms.internal.gtm.zzxp.zzc()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.gtm.zzxp r1 = com.google.android.gms.internal.gtm.zzxp.zze()
            r0.zzc = r1
        L11:
            com.google.android.gms.internal.gtm.zzuv r11 = (com.google.android.gms.internal.gtm.zzuv) r11
            com.google.android.gms.internal.gtm.zzuo r11 = r11.zzU()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Lca
            int r4 = com.google.android.gms.internal.gtm.zzsm.zzj(r12, r13, r15)
            int r13 = r15.zza
            r3 = 11
            r5 = 2
            if (r13 == r3) goto L65
            r3 = r13 & 7
            if (r3 != r5) goto L60
            com.google.android.gms.internal.gtm.zzuk<?> r2 = r10.zzd
            com.google.android.gms.internal.gtm.zzuj r3 = r15.zzd
            com.google.android.gms.internal.gtm.zzwk r5 = r10.zza
            int r6 = r13 >>> 3
            java.lang.Object r8 = r2.zzd(r3, r5, r6)
            if (r8 == 0) goto L56
            com.google.android.gms.internal.gtm.zzwt r13 = com.google.android.gms.internal.gtm.zzwt.zza()
            r2 = r8
            com.google.android.gms.internal.gtm.zzux r2 = (com.google.android.gms.internal.gtm.zzux) r2
            com.google.android.gms.internal.gtm.zzwk r3 = r2.zzc
            java.lang.Class r3 = r3.getClass()
            com.google.android.gms.internal.gtm.zzwx r13 = r13.zzb(r3)
            int r13 = com.google.android.gms.internal.gtm.zzsm.zzd(r13, r12, r4, r14, r15)
            com.google.android.gms.internal.gtm.zzuw r2 = r2.zzd
            java.lang.Object r3 = r15.zzc
            r11.zzi(r2, r3)
        L54:
            r2 = r8
            goto L19
        L56:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.android.gms.internal.gtm.zzsm.zzi(r2, r3, r4, r5, r6, r7)
            goto L54
        L60:
            int r13 = com.google.android.gms.internal.gtm.zzsm.zzn(r13, r12, r4, r14, r15)
            goto L19
        L65:
            r13 = 0
            r3 = r0
        L67:
            if (r4 >= r14) goto Lbf
            int r4 = com.google.android.gms.internal.gtm.zzsm.zzj(r12, r4, r15)
            int r6 = r15.zza
            r7 = r6 & 7
            int r8 = r6 >>> 3
            if (r8 == r5) goto La3
            r9 = 3
            if (r8 == r9) goto L79
            goto Lb6
        L79:
            if (r2 == 0) goto L98
            com.google.android.gms.internal.gtm.zzwt r6 = com.google.android.gms.internal.gtm.zzwt.zza()
            r7 = r2
            com.google.android.gms.internal.gtm.zzux r7 = (com.google.android.gms.internal.gtm.zzux) r7
            com.google.android.gms.internal.gtm.zzwk r8 = r7.zzc
            java.lang.Class r8 = r8.getClass()
            com.google.android.gms.internal.gtm.zzwx r6 = r6.zzb(r8)
            int r4 = com.google.android.gms.internal.gtm.zzsm.zzd(r6, r12, r4, r14, r15)
            com.google.android.gms.internal.gtm.zzuw r6 = r7.zzd
            java.lang.Object r7 = r15.zzc
            r11.zzi(r6, r7)
            goto L67
        L98:
            if (r7 != r5) goto Lb6
            int r4 = com.google.android.gms.internal.gtm.zzsm.zza(r12, r4, r15)
            java.lang.Object r3 = r15.zzc
            com.google.android.gms.internal.gtm.zztd r3 = (com.google.android.gms.internal.gtm.zztd) r3
            goto L67
        La3:
            if (r7 != 0) goto Lb6
            int r4 = com.google.android.gms.internal.gtm.zzsm.zzj(r12, r4, r15)
            int r13 = r15.zza
            com.google.android.gms.internal.gtm.zzuk<?> r2 = r10.zzd
            com.google.android.gms.internal.gtm.zzuj r6 = r15.zzd
            com.google.android.gms.internal.gtm.zzwk r7 = r10.zza
            java.lang.Object r2 = r2.zzd(r6, r7, r13)
            goto L67
        Lb6:
            r7 = 12
            if (r6 == r7) goto Lbf
            int r4 = com.google.android.gms.internal.gtm.zzsm.zzn(r6, r12, r4, r14, r15)
            goto L67
        Lbf:
            if (r3 == 0) goto Lc7
            int r13 = r13 << 3
            r13 = r13 | r5
            r1.zzh(r13, r3)
        Lc7:
            r13 = r4
            goto L19
        Lca:
            if (r13 != r14) goto Lcd
            return
        Lcd:
            com.google.android.gms.internal.gtm.zzvk r11 = com.google.android.gms.internal.gtm.zzvk.zzg()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzwo.zzi(java.lang.Object, byte[], int, int, com.google.android.gms.internal.gtm.zzsl):void");
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final boolean zzj(T t3, T t10) {
        if (!this.zzb.zzd(t3).equals(this.zzb.zzd(t10))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zzb(t3).equals(this.zzd.zzb(t10));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final boolean zzk(T t3) {
        return this.zzd.zzb(t3).zzk();
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final void zzn(T t3, zztp zztpVar) {
        Iterator<Map.Entry<?, Object>> zzf = this.zzd.zzb(t3).zzf();
        while (zzf.hasNext()) {
            Map.Entry<?, Object> next = zzf.next();
            zzun zzunVar = (zzun) next.getKey();
            if (zzunVar.zze() != zzyf.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzunVar.zzg();
            zzunVar.zzf();
            if (next instanceof zzvn) {
                zztpVar.zzw(zzunVar.zza(), ((zzvn) next).zza().zzb());
            } else {
                zztpVar.zzw(zzunVar.zza(), next.getValue());
            }
        }
        zzxo<?, ?> zzxoVar = this.zzb;
        zzxoVar.zzr(zzxoVar.zzd(t3), zztpVar);
    }
}
