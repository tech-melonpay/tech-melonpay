package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.camera.core.impl.utils.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzio implements ObjectEncoder {
    static final zzio zza = new zzio();
    private static final FieldDescriptor zzb = a.x(1, FieldDescriptor.builder(AppMeasurementSdk.ConditionalUserProperty.NAME));
    private static final FieldDescriptor zzc = a.x(2, FieldDescriptor.builder("type"));
    private static final FieldDescriptor zzd = a.x(3, FieldDescriptor.builder("version"));
    private static final FieldDescriptor zze = a.x(4, FieldDescriptor.builder("featureLevel"));

    private zzio() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
