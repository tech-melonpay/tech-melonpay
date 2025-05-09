package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzjt implements ObjectEncoder {
    static final zzjt zza = new zzjt();
    private static final FieldDescriptor zzb = a.x(1, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzc = a.x(2, FieldDescriptor.builder("errorCode"));

    private zzjt() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
