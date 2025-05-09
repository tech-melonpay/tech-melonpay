package com.google.android.gms.internal.mlkit_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzic implements ObjectEncoder {
    static final zzic zza = new zzic();
    private static final FieldDescriptor zzb = a.c(1, FieldDescriptor.builder("detectorMode"));
    private static final FieldDescriptor zzc = a.c(2, FieldDescriptor.builder("multipleObjectsEnabled"));
    private static final FieldDescriptor zzd = a.c(3, FieldDescriptor.builder("classificationEnabled"));
    private static final FieldDescriptor zze = a.c(4, FieldDescriptor.builder("maxPerObjectLabelCount"));
    private static final FieldDescriptor zzf = a.c(5, FieldDescriptor.builder("classificationConfidenceThreshold"));
    private static final FieldDescriptor zzg = a.c(6, FieldDescriptor.builder("customLocalModelOptions"));

    private zzic() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
