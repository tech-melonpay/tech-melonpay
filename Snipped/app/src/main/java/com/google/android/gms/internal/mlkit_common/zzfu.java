package com.google.android.gms.internal.mlkit_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzfu implements ObjectEncoder {
    static final zzfu zza = new zzfu();
    private static final FieldDescriptor zzb = a.c(1, FieldDescriptor.builder("renderer"));
    private static final FieldDescriptor zzc = a.c(2, FieldDescriptor.builder("vendor"));
    private static final FieldDescriptor zzd = a.c(3, FieldDescriptor.builder("version"));
    private static final FieldDescriptor zze = a.c(4, FieldDescriptor.builder("maxImages"));
    private static final FieldDescriptor zzf = a.c(5, FieldDescriptor.builder("maxSsbo"));
    private static final FieldDescriptor zzg = a.c(6, FieldDescriptor.builder("workGroupSizes"));
    private static final FieldDescriptor zzh = a.c(7, FieldDescriptor.builder("errorCode"));

    private zzfu() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
