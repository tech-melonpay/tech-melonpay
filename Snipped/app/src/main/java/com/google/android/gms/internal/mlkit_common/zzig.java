package com.google.android.gms.internal.mlkit_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzig implements ObjectEncoder {
    static final zzig zza = new zzig();
    private static final FieldDescriptor zzb = a.c(1, FieldDescriptor.builder("detectorMode"));
    private static final FieldDescriptor zzc = a.c(2, FieldDescriptor.builder("personDetectionMode"));
    private static final FieldDescriptor zzd = a.c(3, FieldDescriptor.builder("landmarkDetectionMode"));
    private static final FieldDescriptor zze = a.c(4, FieldDescriptor.builder("preferredHardwareConfigs"));
    private static final FieldDescriptor zzf = a.c(5, FieldDescriptor.builder("runConfig"));

    private zzig() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
