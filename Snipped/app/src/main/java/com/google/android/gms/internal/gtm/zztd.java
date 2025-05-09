package com.google.android.gms.internal.gtm;

import androidx.camera.core.impl.utils.a;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
public abstract class zztd implements Iterable<Byte>, Serializable {
    private static final Comparator<zztd> zza;
    public static final zztd zzb = new zzta(zzvi.zzc);
    private static final zztc zzd;
    private int zzc = 0;

    static {
        int i = zzsk.zza;
        zzd = new zztc(null);
        zza = new zzsv();
    }

    public static int zzk(int i, int i9, int i10) {
        int i11 = i9 - i;
        if ((i | i9 | i11 | (i10 - i9)) >= 0) {
            return i11;
        }
        if (i >= 0) {
            if (i9 < i) {
                throw new IndexOutOfBoundsException(a.f(66, "Beginning index larger than ending index: ", i, ", ", i9));
            }
            throw new IndexOutOfBoundsException(a.f(37, "End index: ", i9, " >= ", i10));
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Beginning index: ");
        sb2.append(i);
        sb2.append(" < 0");
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public static zztd zzm(byte[] bArr) {
        return zzn(bArr, 0, bArr.length);
    }

    public static zztd zzn(byte[] bArr, int i, int i9) {
        zzk(i, i + i9, bArr.length);
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, i, bArr2, 0, i9);
        return new zzta(bArr2);
    }

    public static zztd zzo(String str) {
        return new zzta(str.getBytes(zzvi.zza));
    }

    public static zztd zzp(byte[] bArr) {
        return new zzta(bArr);
    }

    public static zztd zzq(byte[] bArr, int i, int i9) {
        return new zzsx(bArr, i, i9);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzd2 = zzd();
            i = zzf(zzd2, 0, zzd2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return new zzst(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzd2 = zzd();
        String zza2 = zzd() <= 50 ? zzxm.zza(this) : String.valueOf(zzxm.zza(zzg(0, 47))).concat("...");
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(zzd2);
        sb2.append(" contents=\"");
        return a.n(sb2, zza2, "\">");
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i, int i9, int i10);

    public abstract int zzf(int i, int i9, int i10);

    public abstract zztd zzg(int i, int i9);

    public abstract String zzh(Charset charset);

    public abstract void zzi(zzss zzssVar);

    public abstract boolean zzj();

    public final int zzl() {
        return this.zzc;
    }

    public final String zzr(Charset charset) {
        return zzd() == 0 ? "" : zzh(charset);
    }
}
