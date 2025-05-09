package com.google.android.gms.internal.mlkit_vision_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes.dex */
final class zzeh implements ObjectEncoder {
    static final zzeh zza = new zzeh();
    private static final FieldDescriptor zzb = a.B(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = a.B(2, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zzd = a.B(3, FieldDescriptor.builder("isColdCall"));
    private static final FieldDescriptor zze = a.B(4, FieldDescriptor.builder("autoManageModelOnBackground"));
    private static final FieldDescriptor zzf = a.B(5, FieldDescriptor.builder("autoManageModelOnLowMemory"));
    private static final FieldDescriptor zzg = a.B(6, FieldDescriptor.builder("isNnApiEnabled"));
    private static final FieldDescriptor zzh = a.B(7, FieldDescriptor.builder("eventsCount"));
    private static final FieldDescriptor zzi = a.B(8, FieldDescriptor.builder("otherErrors"));
    private static final FieldDescriptor zzj = a.B(9, FieldDescriptor.builder("remoteConfigValueForAcceleration"));
    private static final FieldDescriptor zzk = a.B(10, FieldDescriptor.builder("isAccelerated"));

    private zzeh() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
