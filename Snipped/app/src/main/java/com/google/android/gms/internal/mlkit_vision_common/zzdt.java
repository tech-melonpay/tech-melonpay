package com.google.android.gms.internal.mlkit_vision_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.sumsub.sentry.Device;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes.dex */
final class zzdt implements ObjectEncoder {
    static final zzdt zza = new zzdt();
    private static final FieldDescriptor zzb = a.B(1, FieldDescriptor.builder("sdkVersion"));
    private static final FieldDescriptor zzc = a.B(2, FieldDescriptor.builder("osBuild"));
    private static final FieldDescriptor zzd = a.B(3, FieldDescriptor.builder("brand"));
    private static final FieldDescriptor zze = a.B(4, FieldDescriptor.builder(Device.f13499a));
    private static final FieldDescriptor zzf = a.B(5, FieldDescriptor.builder("hardware"));
    private static final FieldDescriptor zzg = a.B(6, FieldDescriptor.builder("manufacturer"));
    private static final FieldDescriptor zzh = a.B(7, FieldDescriptor.builder("model"));
    private static final FieldDescriptor zzi = a.B(8, FieldDescriptor.builder("product"));
    private static final FieldDescriptor zzj = a.B(9, FieldDescriptor.builder("soc"));
    private static final FieldDescriptor zzk = a.B(10, FieldDescriptor.builder("socMetaBuildId"));

    private zzdt() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
