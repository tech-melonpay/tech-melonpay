package com.google.android.gms.internal.mlkit_vision_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes.dex */
final class zzel implements ObjectEncoder {
    static final zzel zza = new zzel();
    private static final FieldDescriptor zzb = a.B(1, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzc = a.B(2, FieldDescriptor.builder("eventType"));
    private static final FieldDescriptor zzd = a.B(3, FieldDescriptor.builder("errorCode"));

    private zzel() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
