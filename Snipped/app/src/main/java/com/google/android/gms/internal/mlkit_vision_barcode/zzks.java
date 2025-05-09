package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzks implements ObjectEncoder {
    static final zzks zza = new zzks();
    private static final FieldDescriptor zzb = a.x(1, FieldDescriptor.builder("deviceInfo"));
    private static final FieldDescriptor zzc = a.x(2, FieldDescriptor.builder("nnapiInfo"));
    private static final FieldDescriptor zzd = a.x(3, FieldDescriptor.builder("gpuInfo"));
    private static final FieldDescriptor zze = a.x(4, FieldDescriptor.builder("pipelineIdentifier"));
    private static final FieldDescriptor zzf = a.x(5, FieldDescriptor.builder("acceptedConfigurations"));
    private static final FieldDescriptor zzg = a.x(6, FieldDescriptor.builder("action"));
    private static final FieldDescriptor zzh = a.x(7, FieldDescriptor.builder("status"));
    private static final FieldDescriptor zzi = a.x(8, FieldDescriptor.builder("customErrors"));
    private static final FieldDescriptor zzj = a.x(9, FieldDescriptor.builder("benchmarkStatus"));
    private static final FieldDescriptor zzk = a.x(10, FieldDescriptor.builder("validationTestResult"));
    private static final FieldDescriptor zzl = a.x(11, FieldDescriptor.builder("timestampUs"));
    private static final FieldDescriptor zzm = a.x(12, FieldDescriptor.builder("elapsedUs"));

    private zzks() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
