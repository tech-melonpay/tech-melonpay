package com.google.android.gms.internal.gtm;

import androidx.camera.core.impl.utils.a;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
class zzta extends zzsz {
    protected final byte[] zza;

    public zzta(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.gtm.zztd
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zztd) || zzd() != ((zztd) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzta)) {
            return obj.equals(this);
        }
        zzta zztaVar = (zzta) obj;
        int zzl = zzl();
        int zzl2 = zztaVar.zzl();
        if (zzl != 0 && zzl2 != 0 && zzl != zzl2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zztaVar.zzd()) {
            int zzd2 = zzd();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(zzd);
            sb2.append(zzd2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (zzd > zztaVar.zzd()) {
            throw new IllegalArgumentException(a.f(59, "Ran off end of other: 0, ", zzd, ", ", zztaVar.zzd()));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zztaVar.zza;
        int zzc = zzc() + zzd;
        int zzc2 = zzc();
        int zzc3 = zztaVar.zzc();
        while (zzc2 < zzc) {
            if (bArr[zzc2] != bArr2[zzc3]) {
                return false;
            }
            zzc2++;
            zzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.gtm.zztd
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.gtm.zztd
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.gtm.zztd
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.gtm.zztd
    public void zze(byte[] bArr, int i, int i9, int i10) {
        System.arraycopy(this.zza, 0, bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.gtm.zztd
    public final int zzf(int i, int i9, int i10) {
        return zzvi.zzd(i, this.zza, zzc(), i10);
    }

    @Override // com.google.android.gms.internal.gtm.zztd
    public final zztd zzg(int i, int i9) {
        int zzk = zztd.zzk(0, i9, zzd());
        return zzk == 0 ? zztd.zzb : new zzsx(this.zza, zzc(), zzk);
    }

    @Override // com.google.android.gms.internal.gtm.zztd
    public final String zzh(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.gtm.zztd
    public final void zzi(zzss zzssVar) {
        ((zztl) zzssVar).zzc(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.gtm.zztd
    public final boolean zzj() {
        int zzc = zzc();
        return zzyd.zzf(this.zza, zzc, zzd() + zzc);
    }
}
