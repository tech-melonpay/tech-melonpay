package com.google.android.gms.internal.mlkit_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.sumsub.sentry.Device;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzfl implements ObjectEncoder {
    static final zzfl zza = new zzfl();
    private static final FieldDescriptor zzb = a.c(1, FieldDescriptor.builder("sdkVersion"));
    private static final FieldDescriptor zzc = a.c(2, FieldDescriptor.builder("osBuild"));
    private static final FieldDescriptor zzd = a.c(3, FieldDescriptor.builder("brand"));
    private static final FieldDescriptor zze = a.c(4, FieldDescriptor.builder(Device.f13499a));
    private static final FieldDescriptor zzf = a.c(5, FieldDescriptor.builder("hardware"));
    private static final FieldDescriptor zzg = a.c(6, FieldDescriptor.builder("manufacturer"));
    private static final FieldDescriptor zzh = a.c(7, FieldDescriptor.builder("model"));
    private static final FieldDescriptor zzi = a.c(8, FieldDescriptor.builder("product"));
    private static final FieldDescriptor zzj = a.c(9, FieldDescriptor.builder("soc"));
    private static final FieldDescriptor zzk = a.c(10, FieldDescriptor.builder("socMetaBuildId"));

    private zzfl() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
