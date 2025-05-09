package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzjn implements ObjectEncoder {
    static final zzjn zza = new zzjn();
    private static final FieldDescriptor zzb = a.x(1, FieldDescriptor.builder("inferenceCommonLogEvent"));
    private static final FieldDescriptor zzc = a.x(2, FieldDescriptor.builder("imageInfo"));
    private static final FieldDescriptor zzd = a.x(4, FieldDescriptor.builder("captionCount"));
    private static final FieldDescriptor zze = a.x(5, FieldDescriptor.builder("highestScore"));
    private static final FieldDescriptor zzf = a.x(6, FieldDescriptor.builder("imageType"));

    private zzjn() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
