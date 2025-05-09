package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzbu implements ValueEncoderContext {
    private boolean zza = false;
    private boolean zzb = false;
    private FieldDescriptor zzc;
    private final zzbq zzd;

    public zzbu(zzbq zzbqVar) {
        this.zzd = zzbqVar;
    }

    private final void zzb() {
        if (this.zza) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.zza = true;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(double d10) {
        zzb();
        this.zzd.zza(this.zzc, d10, this.zzb);
        return this;
    }

    public final void zza(FieldDescriptor fieldDescriptor, boolean z10) {
        this.zza = false;
        this.zzc = fieldDescriptor;
        this.zzb = z10;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(float f10) {
        zzb();
        this.zzd.zzb(this.zzc, f10, this.zzb);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(int i) {
        zzb();
        this.zzd.zzd(this.zzc, i, this.zzb);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(long j10) {
        zzb();
        this.zzd.zze(this.zzc, j10, this.zzb);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(String str) {
        zzb();
        this.zzd.zzc(this.zzc, str, this.zzb);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(boolean z10) {
        zzb();
        this.zzd.zzd(this.zzc, z10 ? 1 : 0, this.zzb);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(byte[] bArr) {
        zzb();
        this.zzd.zzc(this.zzc, bArr, this.zzb);
        return this;
    }
}
