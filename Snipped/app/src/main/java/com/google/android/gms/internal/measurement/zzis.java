package com.google.android.gms.internal.measurement;

import androidx.camera.core.impl.utils.a;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
final class zzis extends zziv {
    private final int zzc;

    public zzis(byte[] bArr, int i, int i9) {
        super(bArr);
        zzix.zzj(0, i9, bArr.length);
        this.zzc = i9;
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzix
    public final byte zza(int i) {
        int i9 = this.zzc;
        if (((i9 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        if (i >= 0) {
            throw new ArrayIndexOutOfBoundsException(a.f(40, "Index > length: ", i, ", ", i9));
        }
        StringBuilder sb2 = new StringBuilder(22);
        sb2.append("Index < 0: ");
        sb2.append(i);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzix
    public final byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zziv
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzix
    public final int zzd() {
        return this.zzc;
    }
}
