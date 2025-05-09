package com.google.android.gms.internal.gtm;

import androidx.camera.core.impl.utils.a;
import com.google.android.gms.internal.gtm.zzun;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zzuo<T extends zzun<T>> {
    private static final zzuo zzb = new zzuo(true);
    final zzxk<T, Object> zza = new zzxa(16);
    private boolean zzc;
    private boolean zzd;

    private zzuo() {
    }

    public static int zza(zzun<?> zzunVar, Object obj) {
        zzye zzd = zzunVar.zzd();
        int zza = zzunVar.zza();
        zzunVar.zzg();
        int zzC = zzto.zzC(zza);
        if (zzd == zzye.zzj) {
            zzvi.zzi((zzwk) obj);
            zzC += zzC;
        }
        zzyf zzyfVar = zzyf.INT;
        int i = 4;
        switch (zzd.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                i = 8;
                return zzC + i;
            case 1:
                ((Float) obj).getClass();
                return zzC + i;
            case 2:
                i = zzto.zzE(((Long) obj).longValue());
                return zzC + i;
            case 3:
                i = zzto.zzE(((Long) obj).longValue());
                return zzC + i;
            case 4:
                i = zzto.zzx(((Integer) obj).intValue());
                return zzC + i;
            case 5:
                ((Long) obj).getClass();
                i = 8;
                return zzC + i;
            case 6:
                ((Integer) obj).getClass();
                return zzC + i;
            case 7:
                ((Boolean) obj).getClass();
                i = 1;
                return zzC + i;
            case 8:
                i = obj instanceof zztd ? zzto.zzu((zztd) obj) : zzto.zzB((String) obj);
                return zzC + i;
            case 9:
                i = zzto.zzw((zzwk) obj);
                return zzC + i;
            case 10:
                i = obj instanceof zzvp ? zzto.zzy((zzvp) obj) : zzto.zzz((zzwk) obj);
                return zzC + i;
            case 11:
                i = obj instanceof zztd ? zzto.zzu((zztd) obj) : zzto.zzt((byte[]) obj);
                return zzC + i;
            case 12:
                i = zzto.zzD(((Integer) obj).intValue());
                return zzC + i;
            case 13:
                i = obj instanceof zzvb ? zzto.zzx(((zzvb) obj).zza()) : zzto.zzx(((Integer) obj).intValue());
                return zzC + i;
            case 14:
                ((Integer) obj).getClass();
                return zzC + i;
            case 15:
                ((Long) obj).getClass();
                i = 8;
                return zzC + i;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i = zzto.zzD((intValue >> 31) ^ (intValue + intValue));
                return zzC + i;
            case 17:
                long longValue = ((Long) obj).longValue();
                i = zzto.zzE((longValue >> 63) ^ (longValue + longValue));
                return zzC + i;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static <T extends zzun<T>> zzuo<T> zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzwp) {
            return ((zzwp) obj).zzc();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzm(Map.Entry<T, Object> entry) {
        zzwk zzC;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzvp) {
            throw null;
        }
        key.zzg();
        if (key.zze() != zzyf.MESSAGE) {
            this.zza.put(key, zzl(value));
            return;
        }
        Object zze = zze(key);
        if (zze == null) {
            this.zza.put(key, zzl(value));
            return;
        }
        if (zze instanceof zzwp) {
            zzC = key.zzc((zzwp) zze, (zzwp) value);
        } else {
            zzwj zzap = ((zzwk) zze).zzap();
            key.zzb(zzap, (zzwk) value);
            zzC = zzap.zzC();
        }
        this.zza.put(key, zzC);
    }

    private static <T extends zzun<T>> boolean zzn(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zze() == zzyf.MESSAGE) {
            key.zzg();
            Object value = entry.getValue();
            if (!(value instanceof zzwk)) {
                if (value instanceof zzvp) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            if (!((zzwk) value).zzas()) {
                return false;
            }
        }
        return true;
    }

    private static final int zzo(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zze() != zzyf.MESSAGE) {
            return zza(key, value);
        }
        key.zzg();
        key.zzf();
        if (value instanceof zzvp) {
            int zza = entry.getKey().zza();
            int zzD = zzto.zzD(8);
            int zza2 = ((zzvp) value).zza();
            return a.w(zza2, zza2, zzto.zzD(24), a.a(zza, zzto.zzD(16), zzD + zzD));
        }
        int zza3 = entry.getKey().zza();
        int zzD2 = zzto.zzD(8);
        return zzto.zzz((zzwk) value) + zzto.zzD(24) + a.a(zza3, zzto.zzD(16), zzD2 + zzD2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzuo) {
            return this.zza.equals(((zzuo) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int i = 0;
        for (int i9 = 0; i9 < this.zza.zzb(); i9++) {
            i += zzo(this.zza.zzg(i9));
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            i += zzo(it.next());
        }
        return i;
    }

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzuo<T> clone() {
        zzuo<T> zzuoVar = new zzuo<>();
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry<T, Object> zzg = this.zza.zzg(i);
            zzuoVar.zzi(zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry<T, Object> entry : this.zza.zzc()) {
            zzuoVar.zzi(entry.getKey(), entry.getValue());
        }
        zzuoVar.zzd = this.zzd;
        return zzuoVar;
    }

    public final Object zze(T t3) {
        Object obj = this.zza.get(t3);
        if (obj instanceof zzvp) {
            throw null;
        }
        return obj;
    }

    public final Iterator<Map.Entry<T, Object>> zzf() {
        return this.zzd ? new zzvo(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzuo<T> zzuoVar) {
        for (int i = 0; i < zzuoVar.zza.zzb(); i++) {
            zzm(zzuoVar.zza.zzg(i));
        }
        Iterator<Map.Entry<T, Object>> it = zzuoVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzm(it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.gtm.zzvb) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.gtm.zzvp) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(T r3, java.lang.Object r4) {
        /*
            r2 = this;
            r3.zzg()
            com.google.android.gms.internal.gtm.zzye r0 = r3.zzd()
            com.google.android.gms.internal.gtm.zzvi.zze(r4)
            com.google.android.gms.internal.gtm.zzye r1 = com.google.android.gms.internal.gtm.zzye.zza
            com.google.android.gms.internal.gtm.zzyf r1 = com.google.android.gms.internal.gtm.zzyf.INT
            com.google.android.gms.internal.gtm.zzyf r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L44;
                case 1: goto L41;
                case 2: goto L3e;
                case 3: goto L3b;
                case 4: goto L38;
                case 5: goto L35;
                case 6: goto L2c;
                case 7: goto L23;
                case 8: goto L1a;
                default: goto L19;
            }
        L19:
            goto L55
        L1a:
            boolean r0 = r4 instanceof com.google.android.gms.internal.gtm.zzwk
            if (r0 != 0) goto L48
            boolean r0 = r4 instanceof com.google.android.gms.internal.gtm.zzvp
            if (r0 == 0) goto L55
            goto L48
        L23:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L48
            boolean r0 = r4 instanceof com.google.android.gms.internal.gtm.zzvb
            if (r0 == 0) goto L55
            goto L48
        L2c:
            boolean r0 = r4 instanceof com.google.android.gms.internal.gtm.zztd
            if (r0 != 0) goto L48
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L55
            goto L48
        L35:
            boolean r0 = r4 instanceof java.lang.String
            goto L46
        L38:
            boolean r0 = r4 instanceof java.lang.Boolean
            goto L46
        L3b:
            boolean r0 = r4 instanceof java.lang.Double
            goto L46
        L3e:
            boolean r0 = r4 instanceof java.lang.Float
            goto L46
        L41:
            boolean r0 = r4 instanceof java.lang.Long
            goto L46
        L44:
            boolean r0 = r4 instanceof java.lang.Integer
        L46:
            if (r0 == 0) goto L55
        L48:
            boolean r0 = r4 instanceof com.google.android.gms.internal.gtm.zzvp
            if (r0 == 0) goto L4f
            r0 = 1
            r2.zzd = r0
        L4f:
            com.google.android.gms.internal.gtm.zzxk<T extends com.google.android.gms.internal.gtm.zzun<T>, java.lang.Object> r0 = r2.zza
            r0.put(r3, r4)
            return
        L55:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r3.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.gtm.zzye r3 = r3.zzd()
            com.google.android.gms.internal.gtm.zzyf r3 = r3.zza()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzuo.zzi(com.google.android.gms.internal.gtm.zzun, java.lang.Object):void");
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        for (int i = 0; i < this.zza.zzb(); i++) {
            if (!zzn(this.zza.zzg(i))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzn(it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzuo(boolean z10) {
        zzg();
        zzg();
    }
}
