package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.sumsub.sentry.Device;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzkt implements ObjectEncoder {
    static final zzkt zza = new zzkt();
    private static final FieldDescriptor zzb = a.x(1, FieldDescriptor.builder("stageId"));
    private static final FieldDescriptor zzc = a.x(2, FieldDescriptor.builder(Device.f13499a));

    private zzkt() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
