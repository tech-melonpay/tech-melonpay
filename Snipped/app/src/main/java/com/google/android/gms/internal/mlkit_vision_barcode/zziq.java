package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zziq implements ObjectEncoder {
    static final zziq zza = new zziq();
    private static final FieldDescriptor zzb = a.x(1, FieldDescriptor.builder("category"));
    private static final FieldDescriptor zzc = a.x(2, FieldDescriptor.builder("classificationConfidence"));
    private static final FieldDescriptor zzd = a.x(3, FieldDescriptor.builder("trackingId"));
    private static final FieldDescriptor zze = a.x(4, FieldDescriptor.builder("labelCount"));

    private zziq() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
