package com.google.android.gms.internal.mlkit_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzga implements ObjectEncoder {
    static final zzga zza = new zzga();
    private static final FieldDescriptor zzb = a.c(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = a.c(2, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zzd = a.c(3, FieldDescriptor.builder("isColdCall"));
    private static final FieldDescriptor zze = a.c(4, FieldDescriptor.builder("autoManageModelOnBackground"));
    private static final FieldDescriptor zzf = a.c(5, FieldDescriptor.builder("autoManageModelOnLowMemory"));
    private static final FieldDescriptor zzg = a.c(6, FieldDescriptor.builder("isNnApiEnabled"));
    private static final FieldDescriptor zzh = a.c(7, FieldDescriptor.builder("eventsCount"));
    private static final FieldDescriptor zzi = a.c(8, FieldDescriptor.builder("otherErrors"));
    private static final FieldDescriptor zzj = a.c(9, FieldDescriptor.builder("remoteConfigValueForAcceleration"));
    private static final FieldDescriptor zzk = a.c(10, FieldDescriptor.builder("isAccelerated"));

    private zzga() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
