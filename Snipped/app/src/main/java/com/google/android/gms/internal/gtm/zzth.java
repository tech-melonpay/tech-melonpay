package com.google.android.gms.internal.gtm;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import net.sf.scuba.smartcards.ISOFileInfo;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zzth extends zztj {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zzth(InputStream inputStream, int i, zztg zztgVar) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        zzvi.zzf(inputStream, "input");
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List<byte[]> zzu(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i9 = 0;
            while (i9 < min) {
                int read = this.zze.read(bArr, i9, min - i9);
                if (read == -1) {
                    throw zzvk.zzj();
                }
                this.zzk += read;
                i9 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzv() {
        int i = this.zzg + this.zzh;
        this.zzg = i;
        int i9 = this.zzk + i;
        int i10 = this.zzl;
        if (i9 <= i10) {
            this.zzh = 0;
            return;
        }
        int i11 = i9 - i10;
        this.zzh = i11;
        this.zzg = i - i11;
    }

    private final void zzw(int i) {
        if (zzx(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.zzk) - this.zzi) {
            throw zzvk.zzj();
        }
        throw zzvk.zzi();
    }

    private final boolean zzx(int i) {
        int i9 = this.zzi;
        int i10 = this.zzg;
        if (i9 + i <= i10) {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        int i11 = this.zzk;
        if (i > (Integer.MAX_VALUE - i11) - i9 || i11 + i9 + i > this.zzl) {
            return false;
        }
        if (i9 > 0) {
            if (i10 > i9) {
                byte[] bArr = this.zzf;
                System.arraycopy(bArr, i9, bArr, 0, i10 - i9);
            }
            i11 = this.zzk + i9;
            this.zzk = i11;
            i10 = this.zzg - i9;
            this.zzg = i10;
            this.zzi = 0;
        }
        try {
            int read = this.zze.read(this.zzf, i10, Math.min(4096 - i10, (Integer.MAX_VALUE - i11) - i10));
            if (read == 0 || read < -1 || read > 4096) {
                String valueOf = String.valueOf(this.zze.getClass());
                StringBuilder sb3 = new StringBuilder(valueOf.length() + 91);
                sb3.append(valueOf);
                sb3.append("#read(byte[]) returned invalid result: ");
                sb3.append(read);
                sb3.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb3.toString());
            }
            if (read <= 0) {
                return false;
            }
            this.zzg += read;
            zzv();
            if (this.zzg >= i) {
                return true;
            }
            return zzx(i);
        } catch (zzvk e10) {
            e10.zzk();
            throw e10;
        }
    }

    private final byte[] zzy(int i, boolean z10) {
        byte[] zzz = zzz(i);
        if (zzz != null) {
            return zzz;
        }
        int i9 = this.zzi;
        int i10 = this.zzg;
        int i11 = i10 - i9;
        this.zzk += i10;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzu = zzu(i - i11);
        byte[] bArr = new byte[i];
        System.arraycopy(this.zzf, i9, bArr, 0, i11);
        for (byte[] bArr2 : zzu) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i11, length);
            i11 += length;
        }
        return bArr;
    }

    private final byte[] zzz(int i) {
        if (i == 0) {
            return zzvi.zzc;
        }
        if (i < 0) {
            throw zzvk.zzf();
        }
        int i9 = this.zzk;
        int i10 = this.zzi;
        int i11 = i9 + i10 + i;
        if ((-2147483647) + i11 > 0) {
            throw zzvk.zzi();
        }
        int i12 = this.zzl;
        if (i11 > i12) {
            zzr((i12 - i9) - i10);
            throw zzvk.zzj();
        }
        int i13 = this.zzg - i10;
        int i14 = i - i13;
        if (i14 >= 4096) {
            try {
                if (i14 > this.zze.available()) {
                    return null;
                }
            } catch (zzvk e10) {
                e10.zzk();
                throw e10;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i13);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i13 < i) {
            try {
                int read = this.zze.read(bArr, i13, i - i13);
                if (read == -1) {
                    throw zzvk.zzj();
                }
                this.zzk += read;
                i13 += read;
            } catch (zzvk e11) {
                e11.zzk();
                throw e11;
            }
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final int zza() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final int zzb(int i) {
        if (i < 0) {
            throw zzvk.zzf();
        }
        int i9 = this.zzk + this.zzi + i;
        int i10 = this.zzl;
        if (i9 > i10) {
            throw zzvk.zzj();
        }
        this.zzl = i9;
        zzv();
        return i10;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final int zzc() {
        if (zzi()) {
            this.zzj = 0;
            return 0;
        }
        int zzn = zzn();
        this.zzj = zzn;
        if ((zzn >>> 3) != 0) {
            return zzn;
        }
        throw zzvk.zzc();
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final zztd zzd() {
        int zzn = zzn();
        int i = this.zzg;
        int i9 = this.zzi;
        if (zzn <= i - i9 && zzn > 0) {
            zztd zzn2 = zztd.zzn(this.zzf, i9, zzn);
            this.zzi += zzn;
            return zzn2;
        }
        if (zzn == 0) {
            return zztd.zzb;
        }
        byte[] zzz = zzz(zzn);
        if (zzz != null) {
            return zztd.zzm(zzz);
        }
        int i10 = this.zzi;
        int i11 = this.zzg;
        int i12 = i11 - i10;
        this.zzk += i11;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzu = zzu(zzn - i12);
        byte[] bArr = new byte[zzn];
        System.arraycopy(this.zzf, i10, bArr, 0, i12);
        for (byte[] bArr2 : zzu) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i12, length);
            i12 += length;
        }
        return zztd.zzp(bArr);
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final String zze() {
        int zzn = zzn();
        if (zzn > 0) {
            int i = this.zzg;
            int i9 = this.zzi;
            if (zzn <= i - i9) {
                String str = new String(this.zzf, i9, zzn, zzvi.zza);
                this.zzi += zzn;
                return str;
            }
        }
        if (zzn == 0) {
            return "";
        }
        if (zzn > this.zzg) {
            return new String(zzy(zzn, false), zzvi.zza);
        }
        zzw(zzn);
        String str2 = new String(this.zzf, this.zzi, zzn, zzvi.zza);
        this.zzi += zzn;
        return str2;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final String zzf() {
        byte[] zzy;
        int zzn = zzn();
        int i = this.zzi;
        int i9 = this.zzg;
        if (zzn <= i9 - i && zzn > 0) {
            zzy = this.zzf;
            this.zzi = i + zzn;
        } else {
            if (zzn == 0) {
                return "";
            }
            i = 0;
            if (zzn <= i9) {
                zzw(zzn);
                zzy = this.zzf;
                this.zzi = zzn;
            } else {
                zzy = zzy(zzn, false);
            }
        }
        return zzyd.zzd(zzy, i, zzn);
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final void zzg(int i) {
        if (this.zzj != i) {
            throw zzvk.zzb();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final void zzh(int i) {
        this.zzl = i;
        zzv();
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final boolean zzi() {
        return this.zzi == this.zzg && !zzx(1);
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final boolean zzj() {
        return zzp() != 0;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final boolean zzk(int i) {
        int zzc;
        int i9 = i & 7;
        int i10 = 0;
        if (i9 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i10 < 10) {
                    if (zzl() < 0) {
                        i10++;
                    }
                }
                throw zzvk.zze();
            }
            while (i10 < 10) {
                byte[] bArr = this.zzf;
                int i11 = this.zzi;
                this.zzi = i11 + 1;
                if (bArr[i11] < 0) {
                    i10++;
                }
            }
            throw zzvk.zze();
            return true;
        }
        if (i9 == 1) {
            zzr(8);
            return true;
        }
        if (i9 == 2) {
            zzr(zzn());
            return true;
        }
        if (i9 != 3) {
            if (i9 == 4) {
                return false;
            }
            if (i9 != 5) {
                throw zzvk.zza();
            }
            zzr(4);
            return true;
        }
        do {
            zzc = zzc();
            if (zzc == 0) {
                break;
            }
        } while (zzk(zzc));
        zzg(((i >>> 3) << 3) | 4);
        return true;
    }

    public final byte zzl() {
        if (this.zzi == this.zzg) {
            zzw(1);
        }
        byte[] bArr = this.zzf;
        int i = this.zzi;
        this.zzi = i + 1;
        return bArr[i];
    }

    public final int zzm() {
        int i = this.zzi;
        if (this.zzg - i < 4) {
            zzw(4);
            i = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final int zzn() {
        int i;
        int i9 = this.zzi;
        int i10 = this.zzg;
        if (i10 != i9) {
            byte[] bArr = this.zzf;
            int i11 = i9 + 1;
            byte b9 = bArr[i9];
            if (b9 >= 0) {
                this.zzi = i11;
                return b9;
            }
            if (i10 - i11 >= 9) {
                int i12 = i9 + 2;
                int i13 = (bArr[i11] << 7) ^ b9;
                if (i13 < 0) {
                    i = i13 ^ (-128);
                } else {
                    int i14 = i9 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        i = i15 ^ 16256;
                    } else {
                        int i16 = i9 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            i = (-2080896) ^ i17;
                        } else {
                            i14 = i9 + 5;
                            byte b10 = bArr[i16];
                            int i18 = (i17 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i16 = i9 + 6;
                                if (bArr[i14] < 0) {
                                    i14 = i9 + 7;
                                    if (bArr[i16] < 0) {
                                        i16 = i9 + 8;
                                        if (bArr[i14] < 0) {
                                            i14 = i9 + 9;
                                            if (bArr[i16] < 0) {
                                                int i19 = i9 + 10;
                                                if (bArr[i14] >= 0) {
                                                    i12 = i19;
                                                    i = i18;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i18;
                            }
                            i = i18;
                        }
                        i12 = i16;
                    }
                    i12 = i14;
                }
                this.zzi = i12;
                return i;
            }
        }
        return (int) zzq();
    }

    public final long zzo() {
        int i = this.zzi;
        if (this.zzg - i < 8) {
            zzw(8);
            i = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public final long zzp() {
        long j10;
        long j11;
        int i = this.zzi;
        int i9 = this.zzg;
        if (i9 != i) {
            byte[] bArr = this.zzf;
            int i10 = i + 1;
            byte b9 = bArr[i];
            if (b9 >= 0) {
                this.zzi = i10;
                return b9;
            }
            if (i9 - i10 >= 9) {
                int i11 = i + 2;
                int i12 = (bArr[i10] << 7) ^ b9;
                if (i12 < 0) {
                    j10 = i12 ^ (-128);
                } else {
                    int i13 = i + 3;
                    int i14 = (bArr[i11] << 14) ^ i12;
                    if (i14 >= 0) {
                        j10 = i14 ^ 16256;
                    } else {
                        int i15 = i + 4;
                        int i16 = i14 ^ (bArr[i13] << 21);
                        if (i16 < 0) {
                            long j12 = (-2080896) ^ i16;
                            i11 = i15;
                            j10 = j12;
                        } else {
                            i13 = i + 5;
                            long j13 = i16 ^ (bArr[i15] << 28);
                            if (j13 >= 0) {
                                j10 = j13 ^ 266354560;
                            } else {
                                i11 = i + 6;
                                long j14 = (bArr[i13] << 35) ^ j13;
                                if (j14 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    int i17 = i + 7;
                                    long j15 = j14 ^ (bArr[i11] << 42);
                                    if (j15 >= 0) {
                                        j10 = j15 ^ 4363953127296L;
                                    } else {
                                        i11 = i + 8;
                                        j14 = j15 ^ (bArr[i17] << 49);
                                        if (j14 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i17 = i + 9;
                                            long j16 = (j14 ^ (bArr[i11] << 56)) ^ 71499008037633920L;
                                            if (j16 < 0) {
                                                i11 = i + 10;
                                                if (bArr[i17] >= 0) {
                                                    j10 = j16;
                                                }
                                            } else {
                                                j10 = j16;
                                            }
                                        }
                                    }
                                    i11 = i17;
                                }
                                j10 = j14 ^ j11;
                            }
                        }
                    }
                    i11 = i13;
                }
                this.zzi = i11;
                return j10;
            }
        }
        return zzq();
    }

    public final long zzq() {
        long j10 = 0;
        for (int i = 0; i < 64; i += 7) {
            j10 |= (r3 & Byte.MAX_VALUE) << i;
            if ((zzl() & ISOFileInfo.DATA_BYTES1) == 0) {
                return j10;
            }
        }
        throw zzvk.zze();
    }

    public final void zzr(int i) {
        int i9 = this.zzg;
        int i10 = this.zzi;
        int i11 = i9 - i10;
        if (i <= i11 && i >= 0) {
            this.zzi = i10 + i;
            return;
        }
        if (i < 0) {
            throw zzvk.zzf();
        }
        int i12 = this.zzk;
        int i13 = i12 + i10;
        int i14 = this.zzl;
        if (i13 + i > i14) {
            zzr((i14 - i12) - i10);
            throw zzvk.zzj();
        }
        this.zzk = i13;
        this.zzg = 0;
        this.zzi = 0;
        while (i11 < i) {
            try {
                long j10 = i - i11;
                try {
                    long skip = this.zze.skip(j10);
                    if (skip < 0 || skip > j10) {
                        String valueOf = String.valueOf(this.zze.getClass());
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 92);
                        sb2.append(valueOf);
                        sb2.append("#skip returned invalid result: ");
                        sb2.append(skip);
                        sb2.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i11 += (int) skip;
                    }
                } catch (zzvk e10) {
                    e10.zzk();
                    throw e10;
                }
            } catch (Throwable th) {
                this.zzk += i11;
                zzv();
                throw th;
            }
        }
        this.zzk += i11;
        zzv();
        if (i11 >= i) {
            return;
        }
        int i15 = this.zzg;
        int i16 = i15 - this.zzi;
        this.zzi = i15;
        zzw(1);
        while (true) {
            int i17 = i - i16;
            int i18 = this.zzg;
            if (i17 <= i18) {
                this.zzi = i17;
                return;
            } else {
                i16 += i18;
                this.zzi = i18;
                zzw(1);
            }
        }
    }
}
