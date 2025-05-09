package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
public final class zztz extends zzuv<zztz, zztx> implements zzwl {
    private static final zztz zze;
    private boolean zzA;
    private boolean zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzM;
    private int zzf;
    private int zzg;
    private boolean zzo;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzz;
    private byte zzP = 2;
    private int zzh = 2;
    private boolean zzi = true;
    private String zzj = "";
    private int zzk = 2;
    private boolean zzl = true;
    private boolean zzm = true;
    private String zzn = "";
    private String zzp = "";
    private String zzt = "";
    private int zzu = 1;
    private String zzv = "";
    private String zzw = "";
    private String zzx = "";
    private int zzy = 2;
    private boolean zzE = true;
    private String zzF = "";
    private String zzG = "";
    private String zzH = "";
    private String zzI = "";
    private String zzJ = "";
    private String zzK = "";
    private String zzL = "";
    private boolean zzN = true;
    private zzvh<zzuf> zzO = zzwu.zze();

    static {
        zztz zztzVar = new zztz();
        zze = zztzVar;
        zzuz.zzak(zztz.class, zztzVar);
    }

    private zztz() {
    }

    public static zztz zze() {
        return zze;
    }

    @Override // com.google.android.gms.internal.gtm.zzuz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzP);
        }
        if (i9 == 2) {
            return new zzwv(zze, "\u0001\"\u0000\u0002\u0001ϧ\"\u0000\u0001\u0001\u0001ဈ\u0002\u0002င\u0000\u0005င\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဈ\b\tဌ\r\nဇ\t\u000bဈ\u000e\fဈ\u0010\u000eင\u0011\u0010ဇ\u0012\u0011ဇ\u0013\u0012ဇ\u0014\u0013ဈ\u0006\u0017ဇ\u0016\u0018ဇ\u0001\u001aဇ\u0007\u001bဇ\n\u001cဇ\u000b\u001dဈ\f\u001fဇ\u0017$ဈ\u0018%ဈ\u0019'ဈ\u001a(ဈ\u001b)ဈ\u001c*ဇ\u0015,ဈ\u001d-ဈ\u001e.ဈ\u000f/ဇ\u001f0ဇ ϧЛ", new Object[]{"zzf", "zzg", "zzj", "zzh", "zzk", "zzl", "zzm", "zzp", "zzu", zzty.zza, "zzq", "zzv", "zzx", "zzy", "zzz", "zzA", "zzB", "zzn", "zzD", "zzi", "zzo", "zzr", "zzs", "zzt", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzC", "zzK", "zzL", "zzw", "zzM", "zzN", "zzO", zzuf.class});
        }
        if (i9 == 3) {
            return new zztz();
        }
        zztq zztqVar = null;
        if (i9 == 4) {
            return new zztx(zztqVar);
        }
        if (i9 == 5) {
            return zze;
        }
        this.zzP = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
