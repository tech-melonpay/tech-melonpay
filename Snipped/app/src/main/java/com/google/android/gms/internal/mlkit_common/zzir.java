package com.google.android.gms.internal.mlkit_common;

import androidx.camera.core.impl.utils.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzir implements ObjectEncoder {
    static final zzir zza = new zzir();
    private static final FieldDescriptor zzb = a.c(1, FieldDescriptor.builder("pipelineNamespace"));
    private static final FieldDescriptor zzc = a.c(2, FieldDescriptor.builder(AppMeasurementSdk.ConditionalUserProperty.NAME));
    private static final FieldDescriptor zzd = a.c(3, FieldDescriptor.builder("clientLibraryName"));
    private static final FieldDescriptor zze = a.c(4, FieldDescriptor.builder("clientLibraryVersion"));
    private static final FieldDescriptor zzf = a.c(5, FieldDescriptor.builder("minClientLibraryVersion"));
    private static final FieldDescriptor zzg = a.c(6, FieldDescriptor.builder("maxClientLibraryVersion"));
    private static final FieldDescriptor zzh = a.c(7, FieldDescriptor.builder("sourceProduct"));

    private zzir() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
