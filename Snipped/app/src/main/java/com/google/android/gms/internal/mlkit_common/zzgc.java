package com.google.android.gms.internal.mlkit_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzgc implements ObjectEncoder {
    static final zzgc zza = new zzgc();
    private static final FieldDescriptor zzb = a.c(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = a.c(2, FieldDescriptor.builder("imageSource"));
    private static final FieldDescriptor zzd = a.c(3, FieldDescriptor.builder("imageFormat"));
    private static final FieldDescriptor zze = a.c(4, FieldDescriptor.builder("imageByteSize"));
    private static final FieldDescriptor zzf = a.c(5, FieldDescriptor.builder("imageWidth"));
    private static final FieldDescriptor zzg = a.c(6, FieldDescriptor.builder("imageHeight"));
    private static final FieldDescriptor zzh = a.c(7, FieldDescriptor.builder("rotationDegrees"));

    private zzgc() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
