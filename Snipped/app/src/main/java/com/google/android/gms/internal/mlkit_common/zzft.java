package com.google.android.gms.internal.mlkit_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzft implements ObjectEncoder {
    static final zzft zza = new zzft();
    private static final FieldDescriptor zzb = a.c(1, FieldDescriptor.builder("mode"));
    private static final FieldDescriptor zzc = a.c(2, FieldDescriptor.builder("landmark"));
    private static final FieldDescriptor zzd = a.c(3, FieldDescriptor.builder("classification"));
    private static final FieldDescriptor zze = a.c(4, FieldDescriptor.builder("prominentFaceOnly"));
    private static final FieldDescriptor zzf = a.c(5, FieldDescriptor.builder("tracking"));
    private static final FieldDescriptor zzg = a.c(6, FieldDescriptor.builder("minFaceSize"));

    private zzft() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
