package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
final class zzjc extends zzje {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzjc(byte[] bArr, int i, int i9) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i9) | i9) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i9)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i9;
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final void zzb(byte b9) {
        try {
            byte[] bArr = this.zzb;
            int i = this.zzd;
            this.zzd = i + 1;
            bArr[i] = b9;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e10);
        }
    }

    public final void zzc(byte[] bArr, int i, int i9) {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i9);
            this.zzd += i9;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i9)), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final void zzd(int i, boolean z10) {
        zzq(i << 3);
        zzb(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final void zze(int i, zzix zzixVar) {
        zzq((i << 3) | 2);
        zzq(zzixVar.zzd());
        zzixVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final void zzf(int i, int i9) {
        zzq((i << 3) | 5);
        zzg(i9);
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final void zzg(int i) {
        try {
            byte[] bArr = this.zzb;
            int i9 = this.zzd;
            bArr[i9] = (byte) (i & 255);
            bArr[i9 + 1] = (byte) ((i >> 8) & 255);
            bArr[i9 + 2] = (byte) ((i >> 16) & 255);
            this.zzd = i9 + 4;
            bArr[i9 + 3] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final void zzh(int i, long j10) {
        zzq((i << 3) | 1);
        zzi(j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final void zzi(long j10) {
        try {
            byte[] bArr = this.zzb;
            int i = this.zzd;
            bArr[i] = (byte) (((int) j10) & 255);
            bArr[i + 1] = (byte) (((int) (j10 >> 8)) & 255);
            bArr[i + 2] = (byte) (((int) (j10 >> 16)) & 255);
            bArr[i + 3] = (byte) (((int) (j10 >> 24)) & 255);
            bArr[i + 4] = (byte) (((int) (j10 >> 32)) & 255);
            bArr[i + 5] = (byte) (((int) (j10 >> 40)) & 255);
            bArr[i + 6] = (byte) (((int) (j10 >> 48)) & 255);
            this.zzd = i + 8;
            bArr[i + 7] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final void zzj(int i, int i9) {
        zzq(i << 3);
        zzk(i9);
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final void zzk(int i) {
        if (i >= 0) {
            zzq(i);
        } else {
            zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final void zzl(byte[] bArr, int i, int i9) {
        zzc(bArr, 0, i9);
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final void zzm(int i, String str) {
        zzq((i << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) {
        int i = this.zzd;
        try {
            int zzA = zzje.zzA(str.length() * 3);
            int zzA2 = zzje.zzA(str.length());
            if (zzA2 != zzA) {
                zzq(zzmq.zzc(str));
                byte[] bArr = this.zzb;
                int i9 = this.zzd;
                this.zzd = zzmq.zzb(str, bArr, i9, this.zzc - i9);
                return;
            }
            int i10 = i + zzA2;
            this.zzd = i10;
            int zzb = zzmq.zzb(str, this.zzb, i10, this.zzc - i10);
            this.zzd = i;
            zzq((zzb - i) - zzA2);
            this.zzd = zzb;
        } catch (zzmp e10) {
            this.zzd = i;
            zzE(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzjd(e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final void zzo(int i, int i9) {
        zzq((i << 3) | i9);
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final void zzp(int i, int i9) {
        zzq(i << 3);
        zzq(i9);
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final void zzq(int i) {
        boolean z10;
        z10 = zzje.zzc;
        if (z10) {
            int i9 = zzij.zza;
        }
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i10 = this.zzd;
                this.zzd = i10 + 1;
                bArr[i10] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e10);
            }
        }
        byte[] bArr2 = this.zzb;
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        bArr2[i11] = (byte) i;
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final void zzr(int i, long j10) {
        zzq(i << 3);
        zzs(j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final void zzs(long j10) {
        boolean z10;
        z10 = zzje.zzc;
        if (z10 && this.zzc - this.zzd >= 10) {
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.zzb;
                int i = this.zzd;
                this.zzd = i + 1;
                zzml.zzn(bArr, i, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.zzb;
            int i9 = this.zzd;
            this.zzd = i9 + 1;
            zzml.zzn(bArr2, i9, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zzb;
                int i10 = this.zzd;
                this.zzd = i10 + 1;
                bArr3[i10] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e10);
            }
        }
        byte[] bArr4 = this.zzb;
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        bArr4[i11] = (byte) j10;
    }
}
