package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
final class zzdg extends zzdj {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzdg(byte[] bArr, int i, int i9) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i9) | i9) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i9)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i9;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzb(byte b9) {
        try {
            byte[] bArr = this.zzc;
            int i = this.zze;
            this.zze = i + 1;
            bArr[i] = b9;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e10);
        }
    }

    public final void zzc(byte[] bArr, int i, int i9) {
        try {
            System.arraycopy(bArr, i, this.zzc, this.zze, i9);
            this.zze += i9;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i9)), e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzd(int i, boolean z10) {
        zzq(i << 3);
        zzb(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zze(int i, zzdb zzdbVar) {
        zzq((i << 3) | 2);
        zzq(zzdbVar.zzd());
        zzdbVar.zzm(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzf(int i, int i9) {
        zzq((i << 3) | 5);
        zzg(i9);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzg(int i) {
        try {
            byte[] bArr = this.zzc;
            int i9 = this.zze;
            bArr[i9] = (byte) (i & 255);
            bArr[i9 + 1] = (byte) ((i >> 8) & 255);
            bArr[i9 + 2] = (byte) ((i >> 16) & 255);
            this.zze = i9 + 4;
            bArr[i9 + 3] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzh(int i, long j10) {
        zzq((i << 3) | 1);
        zzi(j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzi(long j10) {
        try {
            byte[] bArr = this.zzc;
            int i = this.zze;
            bArr[i] = (byte) (((int) j10) & 255);
            bArr[i + 1] = (byte) (((int) (j10 >> 8)) & 255);
            bArr[i + 2] = (byte) (((int) (j10 >> 16)) & 255);
            bArr[i + 3] = (byte) (((int) (j10 >> 24)) & 255);
            bArr[i + 4] = (byte) (((int) (j10 >> 32)) & 255);
            bArr[i + 5] = (byte) (((int) (j10 >> 40)) & 255);
            bArr[i + 6] = (byte) (((int) (j10 >> 48)) & 255);
            this.zze = i + 8;
            bArr[i + 7] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzj(int i, int i9) {
        zzq(i << 3);
        zzk(i9);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzk(int i) {
        if (i >= 0) {
            zzq(i);
        } else {
            zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzl(byte[] bArr, int i, int i9) {
        zzc(bArr, 0, i9);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzm(int i, String str) {
        zzq((i << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) {
        int i = this.zze;
        try {
            int zzy = zzdj.zzy(str.length() * 3);
            int zzy2 = zzdj.zzy(str.length());
            if (zzy2 != zzy) {
                zzq(zzhn.zze(str));
                byte[] bArr = this.zzc;
                int i9 = this.zze;
                this.zze = zzhn.zzd(str, bArr, i9, this.zzd - i9);
                return;
            }
            int i10 = i + zzy2;
            this.zze = i10;
            int zzd = zzhn.zzd(str, this.zzc, i10, this.zzd - i10);
            this.zze = i;
            zzq((zzd - i) - zzy2);
            this.zze = zzd;
        } catch (zzhm e10) {
            this.zze = i;
            zzC(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzdh(e11);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzo(int i, int i9) {
        zzq((i << 3) | i9);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzp(int i, int i9) {
        zzq(i << 3);
        zzq(i9);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzq(int i) {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.zzc;
                int i9 = this.zze;
                this.zze = i9 + 1;
                bArr[i9] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e10);
            }
        }
        byte[] bArr2 = this.zzc;
        int i10 = this.zze;
        this.zze = i10 + 1;
        bArr2[i10] = (byte) i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzr(int i, long j10) {
        zzq(i << 3);
        zzs(j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzs(long j10) {
        boolean z10;
        z10 = zzdj.zzd;
        if (z10 && this.zzd - this.zze >= 10) {
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.zzc;
                int i = this.zze;
                this.zze = i + 1;
                zzhi.zzn(bArr, i, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.zzc;
            int i9 = this.zze;
            this.zze = i9 + 1;
            zzhi.zzn(bArr2, i9, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zzc;
                int i10 = this.zze;
                this.zze = i10 + 1;
                bArr3[i10] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e10);
            }
        }
        byte[] bArr4 = this.zzc;
        int i11 = this.zze;
        this.zze = i11 + 1;
        bArr4[i11] = (byte) j10;
    }
}
