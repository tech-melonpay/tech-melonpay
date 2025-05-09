package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzgr implements ObjectEncoder {
    static final zzgr zza = new zzgr();
    private static final FieldDescriptor zzb = a.x(1, FieldDescriptor.builder("cameraSource"));
    private static final FieldDescriptor zzc = a.x(2, FieldDescriptor.builder("eventType"));
    private static final FieldDescriptor zzd = a.x(3, FieldDescriptor.builder("requestedPreviewHeight"));
    private static final FieldDescriptor zze = a.x(4, FieldDescriptor.builder("requestedPreviewWidth"));
    private static final FieldDescriptor zzf = a.x(5, FieldDescriptor.builder("actualPreviewHeight"));
    private static final FieldDescriptor zzg = a.x(6, FieldDescriptor.builder("actualPreviewWidth"));

    private zzgr() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
