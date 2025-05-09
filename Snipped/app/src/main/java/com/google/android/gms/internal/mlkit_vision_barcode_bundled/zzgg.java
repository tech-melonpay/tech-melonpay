package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.Iterator;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
final class zzgg extends zzdb {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzdb zzd;
    private final zzdb zze;
    private final int zzf;
    private final int zzg;

    private static zzdb zzA(zzdb zzdbVar, zzdb zzdbVar2) {
        int zzd = zzdbVar.zzd();
        int zzd2 = zzdbVar2.zzd();
        byte[] bArr = new byte[zzd + zzd2];
        zzdbVar.zzw(bArr, 0, 0, zzd);
        zzdbVar2.zzw(bArr, 0, zzd, zzd2);
        return new zzcy(bArr);
    }

    public static int zzc(int i) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    public static zzdb zzz(zzdb zzdbVar, zzdb zzdbVar2) {
        if (zzdbVar2.zzd() == 0) {
            return zzdbVar;
        }
        if (zzdbVar.zzd() == 0) {
            return zzdbVar2;
        }
        int zzd = zzdbVar2.zzd() + zzdbVar.zzd();
        if (zzd < 128) {
            return zzA(zzdbVar, zzdbVar2);
        }
        if (zzdbVar instanceof zzgg) {
            zzgg zzggVar = (zzgg) zzdbVar;
            if (zzdbVar2.zzd() + zzggVar.zze.zzd() < 128) {
                return new zzgg(zzggVar.zzd, zzA(zzggVar.zze, zzdbVar2));
            }
            if (zzggVar.zzd.zzf() > zzggVar.zze.zzf() && zzggVar.zzg > zzdbVar2.zzf()) {
                return new zzgg(zzggVar.zzd, new zzgg(zzggVar.zze, zzdbVar2));
            }
        }
        return zzd >= zzc(Math.max(zzdbVar.zzf(), zzdbVar2.zzf()) + 1) ? new zzgg(zzdbVar, zzdbVar2) : zzgc.zza(new zzgc(null), zzdbVar, zzdbVar2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdb)) {
            return false;
        }
        zzdb zzdbVar = (zzdb) obj;
        if (this.zzc != zzdbVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzp = zzp();
        int zzp2 = zzdbVar.zzp();
        if (zzp != 0 && zzp2 != 0 && zzp != zzp2) {
            return false;
        }
        zzgd zzgdVar = null;
        zzge zzgeVar = new zzge(this, zzgdVar);
        zzcx next = zzgeVar.next();
        zzge zzgeVar2 = new zzge(zzdbVar, zzgdVar);
        zzcx next2 = zzgeVar2.next();
        int i = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int zzd = next.zzd() - i;
            int zzd2 = next2.zzd() - i9;
            int min = Math.min(zzd, zzd2);
            if (!(i == 0 ? next.zzg(next2, i9, min) : next2.zzg(next, i, min))) {
                return false;
            }
            i10 += min;
            int i11 = this.zzc;
            if (i10 >= i11) {
                if (i10 == i11) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == zzd) {
                next = zzgeVar.next();
                i = 0;
            } else {
                i += min;
                next = next;
            }
            if (min == zzd2) {
                next2 = zzgeVar2.next();
                i9 = 0;
            } else {
                i9 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzga(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final byte zza(int i) {
        zzdb.zzv(i, this.zzc);
        return zzb(i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final byte zzb(int i) {
        int i9 = this.zzf;
        return i < i9 ? this.zzd.zzb(i) : this.zze.zzb(i - i9);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final void zze(byte[] bArr, int i, int i9, int i10) {
        int i11 = i + i10;
        int i12 = this.zzf;
        if (i11 <= i12) {
            this.zzd.zze(bArr, i, i9, i10);
        } else {
            if (i >= i12) {
                this.zze.zze(bArr, i - i12, i9, i10);
                return;
            }
            int i13 = i12 - i;
            this.zzd.zze(bArr, i, i9, i13);
            this.zze.zze(bArr, 0, i9 + i13, i10 - i13);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final int zzi(int i, int i9, int i10) {
        int i11 = i9 + i10;
        int i12 = this.zzf;
        if (i11 <= i12) {
            return this.zzd.zzi(i, i9, i10);
        }
        if (i9 >= i12) {
            return this.zze.zzi(i, i9 - i12, i10);
        }
        int i13 = i12 - i9;
        return this.zze.zzi(this.zzd.zzi(i, i9, i13), 0, i10 - i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final int zzj(int i, int i9, int i10) {
        int i11 = i9 + i10;
        int i12 = this.zzf;
        if (i11 <= i12) {
            return this.zzd.zzj(i, i9, i10);
        }
        if (i9 >= i12) {
            return this.zze.zzj(i, i9 - i12, i10);
        }
        int i13 = i12 - i9;
        return this.zze.zzj(this.zzd.zzj(i, i9, i13), 0, i10 - i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final zzdb zzk(int i, int i9) {
        int zzo = zzdb.zzo(i, i9, this.zzc);
        if (zzo == 0) {
            return zzdb.zzb;
        }
        if (zzo == this.zzc) {
            return this;
        }
        int i10 = this.zzf;
        if (i9 <= i10) {
            return this.zzd.zzk(i, i9);
        }
        if (i >= i10) {
            return this.zze.zzk(i - i10, i9 - i10);
        }
        zzdb zzdbVar = this.zzd;
        return new zzgg(zzdbVar.zzk(i, zzdbVar.zzd()), this.zze.zzk(0, i9 - this.zzf));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final String zzl(Charset charset) {
        return new String(zzx(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final void zzm(zzcr zzcrVar) {
        this.zzd.zzm(zzcrVar);
        this.zze.zzm(zzcrVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final boolean zzn() {
        int zzj = this.zzd.zzj(0, 0, this.zzf);
        zzdb zzdbVar = this.zze;
        return zzdbVar.zzj(zzj, 0, zzdbVar.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    /* renamed from: zzq */
    public final zzcw iterator() {
        return new zzga(this);
    }

    private zzgg(zzdb zzdbVar, zzdb zzdbVar2) {
        this.zzd = zzdbVar;
        this.zze = zzdbVar2;
        int zzd = zzdbVar.zzd();
        this.zzf = zzd;
        this.zzc = zzdbVar2.zzd() + zzd;
        this.zzg = Math.max(zzdbVar.zzf(), zzdbVar2.zzf()) + 1;
    }
}
