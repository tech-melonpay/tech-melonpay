package com.google.android.gms.internal.mlkit_vision_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes.dex */
final class zzee implements ObjectEncoder {
    static final zzee zza = new zzee();
    private static final FieldDescriptor zzb = a.B(1, FieldDescriptor.builder("imageFormat"));
    private static final FieldDescriptor zzc = a.B(2, FieldDescriptor.builder("originalImageSize"));
    private static final FieldDescriptor zzd = a.B(3, FieldDescriptor.builder("compressedImageSize"));
    private static final FieldDescriptor zze = a.B(4, FieldDescriptor.builder("isOdmlImage"));

    private zzee() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
