package com.google.android.gms.internal.mlkit_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzis implements ObjectEncoder {
    static final zzis zza = new zzis();
    private static final FieldDescriptor zzb = a.c(1, FieldDescriptor.builder("deviceInfo"));
    private static final FieldDescriptor zzc = a.c(2, FieldDescriptor.builder("nnapiInfo"));
    private static final FieldDescriptor zzd = a.c(3, FieldDescriptor.builder("gpuInfo"));
    private static final FieldDescriptor zze = a.c(4, FieldDescriptor.builder("pipelineIdentifier"));
    private static final FieldDescriptor zzf = a.c(5, FieldDescriptor.builder("acceptedConfigurations"));
    private static final FieldDescriptor zzg = a.c(6, FieldDescriptor.builder("action"));
    private static final FieldDescriptor zzh = a.c(7, FieldDescriptor.builder("status"));
    private static final FieldDescriptor zzi = a.c(8, FieldDescriptor.builder("customErrors"));
    private static final FieldDescriptor zzj = a.c(9, FieldDescriptor.builder("benchmarkStatus"));
    private static final FieldDescriptor zzk = a.c(10, FieldDescriptor.builder("validationTestResult"));
    private static final FieldDescriptor zzl = a.c(11, FieldDescriptor.builder("timestampUs"));
    private static final FieldDescriptor zzm = a.c(12, FieldDescriptor.builder("elapsedUs"));

    private zzis() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
