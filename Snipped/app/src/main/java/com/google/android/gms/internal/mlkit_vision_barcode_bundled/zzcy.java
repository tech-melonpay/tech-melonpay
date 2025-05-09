package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.camera.core.impl.utils.a;
import java.nio.charset.Charset;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
class zzcy extends zzcx {
    protected final byte[] zza;

    public zzcy(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdb) || zzd() != ((zzdb) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzcy)) {
            return obj.equals(this);
        }
        zzcy zzcyVar = (zzcy) obj;
        int zzp = zzp();
        int zzp2 = zzcyVar.zzp();
        if (zzp == 0 || zzp2 == 0 || zzp == zzp2) {
            return zzg(zzcyVar, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public void zze(byte[] bArr, int i, int i9, int i10) {
        System.arraycopy(this.zza, i, bArr, i9, i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcx
    public final boolean zzg(zzdb zzdbVar, int i, int i9) {
        if (i9 > zzdbVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + i9 + zzd());
        }
        int i10 = i + i9;
        if (i10 > zzdbVar.zzd()) {
            int zzd = zzdbVar.zzd();
            StringBuilder q10 = a.q(i, i9, "Ran off end of other: ", ", ", ", ");
            q10.append(zzd);
            throw new IllegalArgumentException(q10.toString());
        }
        if (!(zzdbVar instanceof zzcy)) {
            return zzdbVar.zzk(i, i10).equals(zzk(0, i9));
        }
        zzcy zzcyVar = (zzcy) zzdbVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzcyVar.zza;
        int zzc = zzc() + i9;
        int zzc2 = zzc();
        int zzc3 = zzcyVar.zzc() + i;
        while (zzc2 < zzc) {
            if (bArr[zzc2] != bArr2[zzc3]) {
                return false;
            }
            zzc2++;
            zzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final int zzi(int i, int i9, int i10) {
        return zzem.zzb(i, this.zza, zzc() + i9, i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final int zzj(int i, int i9, int i10) {
        int zzc = zzc() + i9;
        return zzhn.zzf(i, this.zza, zzc, i10 + zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final zzdb zzk(int i, int i9) {
        int zzo = zzdb.zzo(i, i9, zzd());
        return zzo == 0 ? zzdb.zzb : new zzcv(this.zza, zzc() + i, zzo);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final String zzl(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final void zzm(zzcr zzcrVar) {
        ((zzdg) zzcrVar).zzc(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final boolean zzn() {
        int zzc = zzc();
        return zzhn.zzh(this.zza, zzc, zzd() + zzc);
    }
}
