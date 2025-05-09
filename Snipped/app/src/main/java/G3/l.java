package G3;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzci;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzej;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class l extends zzed implements zzfp {
    private static final l zza;
    private int zzd;
    private int zze;
    private zzdb zzf;
    private String zzg;
    private int zzh;
    private q zzi;
    private s zzj;
    private zzci zzk;
    private g zzl;
    private j zzm;
    private i zzn;
    private d zzo;
    private p zzp;
    private r zzq;
    private n zzr;
    private zzel zzs;
    private zzej zzt;
    private String zzu;
    private zzel zzv;
    private boolean zzw;
    private double zzx;
    private zzdb zzy;
    private byte zzz = 2;

    static {
        l lVar = new l();
        zza = lVar;
        zzed.zzU(l.class, lVar);
    }

    public l() {
        zzdb zzdbVar = zzdb.zzb;
        this.zzf = zzdbVar;
        this.zzg = "";
        this.zzs = zzed.zzO();
        this.zzt = zzed.zzN();
        this.zzu = "";
        this.zzv = zzed.zzO();
        this.zzw = true;
        this.zzy = zzdbVar;
    }

    public static /* synthetic */ void o(l lVar, int i, f fVar) {
        fVar.getClass();
        zzel zzelVar = lVar.zzs;
        if (!zzelVar.zzc()) {
            lVar.zzs = zzed.zzP(zzelVar);
        }
        lVar.zzs.set(i, fVar);
    }

    public final int a() {
        int b9 = m.b(this.zzh);
        if (b9 == 0) {
            return 1;
        }
        return b9;
    }

    public final int b() {
        return this.zzs.size();
    }

    public final p d() {
        p pVar = this.zzp;
        return pVar == null ? p.d() : pVar;
    }

    public final q e() {
        q qVar = this.zzi;
        return qVar == null ? q.b() : qVar;
    }

    public final r f() {
        r rVar = this.zzq;
        return rVar == null ? r.b() : rVar;
    }

    public final s g() {
        s sVar = this.zzj;
        return sVar == null ? s.a() : sVar;
    }

    public final d h() {
        d dVar = this.zzo;
        return dVar == null ? d.d() : dVar;
    }

    public final g i() {
        g gVar = this.zzl;
        return gVar == null ? g.b() : gVar;
    }

    public final i j() {
        i iVar = this.zzn;
        return iVar == null ? i.b() : iVar;
    }

    public final j k() {
        j jVar = this.zzm;
        return jVar == null ? j.a() : jVar;
    }

    public final zzdb l() {
        return this.zzf;
    }

    public final String m() {
        return this.zzg;
    }

    public final zzel n() {
        return this.zzs;
    }

    public final boolean p() {
        return (this.zzd & 2048) != 0;
    }

    public final boolean q() {
        return (this.zzd & 16) != 0;
    }

    public final boolean r() {
        return (this.zzd & 4096) != 0;
    }

    public final boolean s() {
        return (this.zzd & 32) != 0;
    }

    public final boolean t() {
        return (this.zzd & 1024) != 0;
    }

    public final boolean u() {
        return (this.zzd & 64) != 0;
    }

    public final boolean v() {
        return (this.zzd & 128) != 0;
    }

    public final boolean w() {
        return (this.zzd & 512) != 0;
    }

    public final boolean x() {
        return (this.zzd & 256) != 0;
    }

    public final int y() {
        int a10 = m.a(this.zze);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }

    public final zzci zzb() {
        zzci zzciVar = this.zzk;
        return zzciVar == null ? zzci.zzb() : zzciVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzz);
        }
        if (i9 == 2) {
            return zzed.zzR(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0003\u000b\u0001ᔌ\u0000\u0002ᔊ\u0001\u0003ᔈ\u0002\u0004ᔌ\u0003\u0005ᐉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bЛ\fဈ\u000e\rЛ\u000eည\u0011\u000fᐉ\n\u0010ဉ\u000b\u0011ဉ\f\u0012\u0016\u0013ဉ\r\u0014ဇ\u000f\u0015က\u0010", new Object[]{"zzd", "zze", h.f1316d, "zzf", "zzg", "zzh", h.f1317e, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzs", f.class, "zzu", "zzv", f.class, "zzy", "zzo", "zzp", "zzq", "zzt", "zzr", "zzw", "zzx"});
        }
        if (i9 == 3) {
            return new l();
        }
        if (i9 == 4) {
            return new k(zza);
        }
        if (i9 == 5) {
            return zza;
        }
        this.zzz = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
