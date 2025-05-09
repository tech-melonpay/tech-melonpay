package com.google.android.gms.internal.measurement;

import androidx.camera.core.impl.utils.a;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
class zziv extends zziu {
    protected final byte[] zza;

    public zziv(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzix) || zzd() != ((zzix) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zziv)) {
            return obj.equals(this);
        }
        zziv zzivVar = (zziv) obj;
        int zzk = zzk();
        int zzk2 = zzivVar.zzk();
        if (zzk != 0 && zzk2 != 0 && zzk != zzk2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzivVar.zzd()) {
            int zzd2 = zzd();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(zzd);
            sb2.append(zzd2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (zzd > zzivVar.zzd()) {
            throw new IllegalArgumentException(a.f(59, "Ran off end of other: 0, ", zzd, ", ", zzivVar.zzd()));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzivVar.zza;
        zzivVar.zzc();
        int i = 0;
        int i9 = 0;
        while (i < zzd) {
            if (bArr[i] != bArr2[i9]) {
                return false;
            }
            i++;
            i9++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final int zze(int i, int i9, int i10) {
        return zzkf.zzd(i, this.zza, 0, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final zzix zzf(int i, int i9) {
        int zzj = zzix.zzj(0, i9, zzd());
        return zzj == 0 ? zzix.zzb : new zzis(this.zza, 0, zzj);
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final void zzh(zzin zzinVar) {
        ((zzjc) zzinVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final boolean zzi() {
        return zzmq.zzf(this.zza, 0, zzd());
    }
}
