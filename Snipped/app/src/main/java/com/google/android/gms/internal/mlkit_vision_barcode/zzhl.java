package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.sumsub.sentry.Device;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzhl implements ObjectEncoder {
    static final zzhl zza = new zzhl();
    private static final FieldDescriptor zzb = a.x(1, FieldDescriptor.builder("sdkVersion"));
    private static final FieldDescriptor zzc = a.x(2, FieldDescriptor.builder("osBuild"));
    private static final FieldDescriptor zzd = a.x(3, FieldDescriptor.builder("brand"));
    private static final FieldDescriptor zze = a.x(4, FieldDescriptor.builder(Device.f13499a));
    private static final FieldDescriptor zzf = a.x(5, FieldDescriptor.builder("hardware"));
    private static final FieldDescriptor zzg = a.x(6, FieldDescriptor.builder("manufacturer"));
    private static final FieldDescriptor zzh = a.x(7, FieldDescriptor.builder("model"));
    private static final FieldDescriptor zzi = a.x(8, FieldDescriptor.builder("product"));
    private static final FieldDescriptor zzj = a.x(9, FieldDescriptor.builder("soc"));
    private static final FieldDescriptor zzk = a.x(10, FieldDescriptor.builder("socMetaBuildId"));

    private zzhl() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
