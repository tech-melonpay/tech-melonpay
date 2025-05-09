package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzff implements ObjectEncoder {
    static final zzff zza = new zzff();
    private static final FieldDescriptor zzb = a.x(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = a.x(2, FieldDescriptor.builder("handledErrors"));
    private static final FieldDescriptor zzd = a.x(3, FieldDescriptor.builder("partiallyHandledErrors"));
    private static final FieldDescriptor zze = a.x(4, FieldDescriptor.builder("unhandledErrors"));
    private static final FieldDescriptor zzf = a.x(5, FieldDescriptor.builder("modelNamespace"));
    private static final FieldDescriptor zzg = a.x(6, FieldDescriptor.builder("delegateFilter"));
    private static final FieldDescriptor zzh = a.x(7, FieldDescriptor.builder("httpResponseCode"));

    private zzff() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
