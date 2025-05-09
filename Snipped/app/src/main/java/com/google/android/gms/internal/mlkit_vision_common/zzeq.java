package com.google.android.gms.internal.mlkit_vision_common;

import androidx.camera.core.impl.utils.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes.dex */
final class zzeq implements ObjectEncoder {
    static final zzeq zza = new zzeq();
    private static final FieldDescriptor zzb = a.B(1, FieldDescriptor.builder(AppMeasurementSdk.ConditionalUserProperty.NAME));
    private static final FieldDescriptor zzc = a.B(2, FieldDescriptor.builder("version"));
    private static final FieldDescriptor zzd = a.B(3, FieldDescriptor.builder("source"));
    private static final FieldDescriptor zze = a.B(4, FieldDescriptor.builder("uri"));
    private static final FieldDescriptor zzf = a.B(5, FieldDescriptor.builder("hash"));
    private static final FieldDescriptor zzg = a.B(6, FieldDescriptor.builder("modelType"));
    private static final FieldDescriptor zzh = a.B(7, FieldDescriptor.builder("size"));
    private static final FieldDescriptor zzi = a.B(8, FieldDescriptor.builder("hasLabelMap"));
    private static final FieldDescriptor zzj = a.B(9, FieldDescriptor.builder("isManifestModel"));

    private zzeq() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
