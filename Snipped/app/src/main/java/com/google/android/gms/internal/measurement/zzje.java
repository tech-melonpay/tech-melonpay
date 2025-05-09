package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
public abstract class zzje extends zzin {
    private static final Logger zzb = Logger.getLogger(zzje.class.getName());
    private static final boolean zzc = zzml.zzx();
    zzjf zza;

    private zzje() {
    }

    public static int zzA(int i) {
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

    public static int zzB(long j10) {
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
            i += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i + 1 : i;
    }

    public static zzje zzC(byte[] bArr) {
        return new zzjc(bArr, 0, bArr.length);
    }

    public static int zzt(zzix zzixVar) {
        int zzd = zzixVar.zzd();
        return zzA(zzd) + zzd;
    }

    @Deprecated
    public static int zzu(int i, zzlc zzlcVar, zzln zzlnVar) {
        int zzA = zzA(i << 3);
        int i9 = zzA + zzA;
        zzih zzihVar = (zzih) zzlcVar;
        int zzbo = zzihVar.zzbo();
        if (zzbo == -1) {
            zzbo = zzlnVar.zza(zzihVar);
            zzihVar.zzbr(zzbo);
        }
        return i9 + zzbo;
    }

    public static int zzv(int i) {
        if (i >= 0) {
            return zzA(i);
        }
        return 10;
    }

    public static int zzw(zzkk zzkkVar) {
        int zza = zzkkVar.zza();
        return zzA(zza) + zza;
    }

    public static int zzx(zzlc zzlcVar, zzln zzlnVar) {
        zzih zzihVar = (zzih) zzlcVar;
        int zzbo = zzihVar.zzbo();
        if (zzbo == -1) {
            zzbo = zzlnVar.zza(zzihVar);
            zzihVar.zzbr(zzbo);
        }
        return zzA(zzbo) + zzbo;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = zzmq.zzc(str);
        } catch (zzmp unused) {
            length = str.getBytes(zzkf.zzb).length;
        }
        return zzA(length) + length;
    }

    public static int zzz(int i) {
        return zzA(i << 3);
    }

    public final void zzD() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzE(String str, zzmp zzmpVar) {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzmpVar);
        byte[] bytes = str.getBytes(zzkf.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (zzjd e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new zzjd(e11);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b9);

    public abstract void zzd(int i, boolean z10);

    public abstract void zze(int i, zzix zzixVar);

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

    public /* synthetic */ zzje(zzjb zzjbVar) {
    }
}
