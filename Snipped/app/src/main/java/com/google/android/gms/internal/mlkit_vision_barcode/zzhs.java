package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzhs implements ObjectEncoder {
    static final zzhs zza = new zzhs();
    private static final FieldDescriptor zzb = a.x(1, FieldDescriptor.builder("landmarkMode"));
    private static final FieldDescriptor zzc = a.x(2, FieldDescriptor.builder("classificationMode"));
    private static final FieldDescriptor zzd = a.x(3, FieldDescriptor.builder("performanceMode"));
    private static final FieldDescriptor zze = a.x(4, FieldDescriptor.builder("contourMode"));
    private static final FieldDescriptor zzf = a.x(5, FieldDescriptor.builder("isTrackingEnabled"));
    private static final FieldDescriptor zzg = a.x(6, FieldDescriptor.builder("minFaceSize"));

    private zzhs() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
