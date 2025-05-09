package com.google.android.gms.internal.mlkit_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzfj implements ObjectEncoder {
    static final zzfj zza = new zzfj();
    private static final FieldDescriptor zzb = a.c(1, FieldDescriptor.builder("remoteModelOptions"));
    private static final FieldDescriptor zzc = a.c(2, FieldDescriptor.builder("localModelOptions"));
    private static final FieldDescriptor zzd = a.c(3, FieldDescriptor.builder("errorCodes"));
    private static final FieldDescriptor zze = a.c(4, FieldDescriptor.builder("modelInitializationMs"));
    private static final FieldDescriptor zzf = a.c(5, FieldDescriptor.builder("isNnApiEnabled"));

    private zzfj() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
