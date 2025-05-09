package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public abstract class zzdj extends zzcr {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzdj.class.getName());
    private static final boolean zzd = zzhi.zzx();
    zzdk zza;

    private zzdj() {
    }

    public static zzdj zzA(byte[] bArr, int i, int i9) {
        return new zzdg(bArr, 0, i9);
    }

    @Deprecated
    public static int zzt(int i, zzfo zzfoVar, zzgh zzghVar) {
        int zzB = ((zzck) zzfoVar).zzB(zzghVar);
        int zzy = zzy(i << 3);
        return zzy + zzy + zzB;
    }

    public static int zzu(int i) {
        if (i >= 0) {
            return zzy(i);
        }
        return 10;
    }

    public static int zzv(zzfo zzfoVar) {
        int zzE = zzfoVar.zzE();
        return zzy(zzE) + zzE;
    }

    public static int zzw(zzfo zzfoVar, zzgh zzghVar) {
        int zzB = ((zzck) zzfoVar).zzB(zzghVar);
        return zzy(zzB) + zzB;
    }

    public static int zzx(String str) {
        int length;
        try {
            length = zzhn.zze(str);
        } catch (zzhm unused) {
            length = str.getBytes(zzem.zzb).length;
        }
        return zzy(length) + length;
    }

    public static int zzy(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzz(long j10) {
        int i;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j10) != 0) {
            j10 >>>= 14;
            i += 2;
        }
        return (j10 & (-16384)) != 0 ? i + 1 : i;
    }

    public final void zzB() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzC(String str, zzhm zzhmVar) {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhmVar);
        byte[] bytes = str.getBytes(zzem.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzdh(e10);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b9);

    public abstract void zzd(int i, boolean z10);

    public abstract void zze(int i, zzdb zzdbVar);

    public abstract void zzf(int i, int i9);

    public abstract void zzg(int i);

    public abstract void zzh(int i, long j10);

    public abstract void zzi(long j10);

    public abstract void zzj(int i, int i9);

    public abstract void zzk(int i);

    public abstract void zzl(byte[] bArr, int i, int i9);

    public abstract void zzm(int i, String str);

    public abstract void zzo(int i, int i9);

    public abstract void zzp(int i, int i9);

    public abstract void zzq(int i);

    public abstract void zzr(int i, long j10);

    public abstract void zzs(long j10);

    public /* synthetic */ zzdj(zzdi zzdiVar) {
    }
}
