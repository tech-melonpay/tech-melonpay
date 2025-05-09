package com.google.android.gms.internal.measurement;

import androidx.camera.core.impl.utils.a;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
public abstract class zzix implements Iterable<Byte>, Serializable {
    private static final Comparator<zzix> zza;
    public static final zzix zzb = new zziv(zzkf.zzd);
    private static final zziw zzd;
    private int zzc = 0;

    static {
        int i = zzij.zza;
        zzd = new zziw(null);
        zza = new zziq();
    }

    public static int zzj(int i, int i9, int i10) {
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

    public static zzix zzl(byte[] bArr, int i, int i9) {
        zzj(i, i + i9, bArr.length);
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, i, bArr2, 0, i9);
        return new zziv(bArr2);
    }

    public static zzix zzm(String str) {
        return new zziv(str.getBytes(zzkf.zzb));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzd2 = zzd();
            i = zze(zzd2, 0, zzd2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzio(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzd2 = zzd();
        String zza2 = zzd() <= 50 ? zzlz.zza(this) : zzlz.zza(zzf(0, 47)).concat("...");
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

    public abstract int zze(int i, int i9, int i10);

    public abstract zzix zzf(int i, int i9);

    public abstract String zzg(Charset charset);

    public abstract void zzh(zzin zzinVar);

    public abstract boolean zzi();

    public final int zzk() {
        return this.zzc;
    }

    public final String zzn(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
