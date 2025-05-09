package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzic implements ObjectEncoder {
    static final zzic zza = new zzic();
    private static final FieldDescriptor zzb = a.x(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = a.x(2, FieldDescriptor.builder("imageSource"));
    private static final FieldDescriptor zzd = a.x(3, FieldDescriptor.builder("imageFormat"));
    private static final FieldDescriptor zze = a.x(4, FieldDescriptor.builder("imageByteSize"));
    private static final FieldDescriptor zzf = a.x(5, FieldDescriptor.builder("imageWidth"));
    private static final FieldDescriptor zzg = a.x(6, FieldDescriptor.builder("imageHeight"));
    private static final FieldDescriptor zzh = a.x(7, FieldDescriptor.builder("rotationDegrees"));

    private zzic() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
