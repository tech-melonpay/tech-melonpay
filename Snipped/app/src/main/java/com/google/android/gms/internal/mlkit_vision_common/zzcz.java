package com.google.android.gms.internal.mlkit_vision_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes.dex */
final class zzcz implements ObjectEncoder {
    static final zzcz zza = new zzcz();
    private static final FieldDescriptor zzb = a.B(1, FieldDescriptor.builder("cameraSource"));
    private static final FieldDescriptor zzc = a.B(2, FieldDescriptor.builder("eventType"));
    private static final FieldDescriptor zzd = a.B(3, FieldDescriptor.builder("requestedPreviewHeight"));
    private static final FieldDescriptor zze = a.B(4, FieldDescriptor.builder("requestedPreviewWidth"));
    private static final FieldDescriptor zzf = a.B(5, FieldDescriptor.builder("actualPreviewHeight"));
    private static final FieldDescriptor zzg = a.B(6, FieldDescriptor.builder("actualPreviewWidth"));

    private zzcz() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
