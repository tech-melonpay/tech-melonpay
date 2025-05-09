package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import C.v;
import com.google.android.gms.measurement.internal.a;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import s3.b;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public abstract class zzdb implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzdb zzb = new zzcy(zzem.zzd);
    private static final zzda zzd;
    private int zzc = 0;

    static {
        int i = zzcn.zza;
        zzd = new zzda(null);
        zza = new zzct();
    }

    private static zzdb zzc(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(b.i("length (", i, ") must be >= 1"));
        }
        if (i == 1) {
            return (zzdb) it.next();
        }
        int i9 = i >>> 1;
        zzdb zzc = zzc(it, i9);
        zzdb zzc2 = zzc(it, i - i9);
        if (Integer.MAX_VALUE - zzc.zzd() >= zzc2.zzd()) {
            return zzgg.zzz(zzc, zzc2);
        }
        throw new IllegalArgumentException(v.k(zzc.zzd(), zzc2.zzd(), "ByteString would be too long: ", "+"));
    }

    public static int zzo(int i, int i9, int i10) {
        int i11 = i9 - i;
        if ((i | i9 | i11 | (i10 - i9)) >= 0) {
            return i11;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(b.i("Beginning index: ", i, " < 0"));
        }
        if (i9 < i) {
            throw new IndexOutOfBoundsException(v.k(i, i9, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(v.k(i9, i10, "End index: ", " >= "));
    }

    public static zzdb zzr(byte[] bArr, int i, int i9) {
        zzo(i, i + i9, bArr.length);
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, i, bArr2, 0, i9);
        return new zzcy(bArr2);
    }

    public static zzdb zzs(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i9 = 0;
            while (i9 < i) {
                int read = inputStream.read(bArr, i9, i - i9);
                if (read == -1) {
                    break;
                }
                i9 += read;
            }
            zzdb zzr = i9 == 0 ? null : zzr(bArr, 0, i9);
            if (zzr == null) {
                break;
            }
            arrayList.add(zzr);
            i = Math.min(i + i, 8192);
        }
        int size = arrayList.size();
        return size == 0 ? zzb : zzc(arrayList.iterator(), size);
    }

    public static void zzv(int i, int i9) {
        if (((i9 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(v.k(i, i9, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(a.g(i, "Index < 0: "));
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzd2 = zzd();
            i = zzi(zzd2, 0, zzd2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzd2 = zzd();
        String zza2 = zzd() <= 50 ? zzgw.zza(this) : zzgw.zza(zzk(0, 47)).concat("...");
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(zzd2);
        sb2.append(" contents=\"");
        return androidx.camera.core.impl.utils.a.n(sb2, zza2, "\">");
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i, int i9, int i10);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i, int i9, int i10);

    public abstract int zzj(int i, int i9, int i10);

    public abstract zzdb zzk(int i, int i9);

    public abstract String zzl(Charset charset);

    public abstract void zzm(zzcr zzcrVar);

    public abstract boolean zzn();

    public final int zzp() {
        return this.zzc;
    }

    @Override // java.lang.Iterable
    /* renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public zzcw iterator() {
        return new zzcs(this);
    }

    public final String zzt(Charset charset) {
        return zzd() == 0 ? "" : zzl(charset);
    }

    public final String zzu() {
        return zzt(zzem.zzb);
    }

    @Deprecated
    public final void zzw(byte[] bArr, int i, int i9, int i10) {
        zzo(0, i10, zzd());
        zzo(i9, i9 + i10, bArr.length);
        if (i10 > 0) {
            zze(bArr, 0, i9, i10);
        }
    }

    public final byte[] zzx() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzem.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }
}
