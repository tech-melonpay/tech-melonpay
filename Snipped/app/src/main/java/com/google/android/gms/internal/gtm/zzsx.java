package com.google.android.gms.internal.gtm;

import androidx.camera.core.impl.utils.a;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zzsx extends zzta {
    private final int zzc;
    private final int zzd;

    public zzsx(byte[] bArr, int i, int i9) {
        super(bArr);
        zztd.zzk(i, i + i9, bArr.length);
        this.zzc = i;
        this.zzd = i9;
    }

    @Override // com.google.android.gms.internal.gtm.zzta, com.google.android.gms.internal.gtm.zztd
    public final byte zza(int i) {
        int i9 = this.zzd;
        if (((i9 - (i + 1)) | i) >= 0) {
            return this.zza[this.zzc + i];
        }
        if (i >= 0) {
            throw new ArrayIndexOutOfBoundsException(a.f(40, "Index > length: ", i, ", ", i9));
        }
        StringBuilder sb2 = new StringBuilder(22);
        sb2.append("Index < 0: ");
        sb2.append(i);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.gtm.zzta, com.google.android.gms.internal.gtm.zztd
    public final byte zzb(int i) {
        return this.zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.gtm.zzta
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzta, com.google.android.gms.internal.gtm.zztd
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzta, com.google.android.gms.internal.gtm.zztd
    public final void zze(byte[] bArr, int i, int i9, int i10) {
        System.arraycopy(this.zza, this.zzc, bArr, 0, i10);
    }
}
