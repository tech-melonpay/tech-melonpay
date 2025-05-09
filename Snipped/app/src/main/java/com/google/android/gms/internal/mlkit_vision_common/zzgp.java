package com.google.android.gms.internal.mlkit_vision_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes.dex */
final class zzgp implements ObjectEncoder {
    static final zzgp zza = new zzgp();
    private static final FieldDescriptor zzb = a.B(1, FieldDescriptor.builder("deviceInfo"));
    private static final FieldDescriptor zzc = a.B(2, FieldDescriptor.builder("nnapiInfo"));
    private static final FieldDescriptor zzd = a.B(3, FieldDescriptor.builder("gpuInfo"));
    private static final FieldDescriptor zze = a.B(4, FieldDescriptor.builder("pipelineIdentifier"));
    private static final FieldDescriptor zzf = a.B(5, FieldDescriptor.builder("acceptedConfigurations"));
    private static final FieldDescriptor zzg = a.B(6, FieldDescriptor.builder("action"));
    private static final FieldDescriptor zzh = a.B(7, FieldDescriptor.builder("status"));
    private static final FieldDescriptor zzi = a.B(8, FieldDescriptor.builder("customErrors"));
    private static final FieldDescriptor zzj = a.B(9, FieldDescriptor.builder("benchmarkStatus"));
    private static final FieldDescriptor zzk = a.B(10, FieldDescriptor.builder("validationTestResult"));
    private static final FieldDescriptor zzl = a.B(11, FieldDescriptor.builder("timestampUs"));
    private static final FieldDescriptor zzm = a.B(12, FieldDescriptor.builder("elapsedUs"));

    private zzgp() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
