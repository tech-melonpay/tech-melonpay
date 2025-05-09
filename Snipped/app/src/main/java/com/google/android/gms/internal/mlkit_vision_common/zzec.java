package com.google.android.gms.internal.mlkit_vision_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes.dex */
final class zzec implements ObjectEncoder {
    static final zzec zza = new zzec();
    private static final FieldDescriptor zzb = a.B(1, FieldDescriptor.builder("renderer"));
    private static final FieldDescriptor zzc = a.B(2, FieldDescriptor.builder("vendor"));
    private static final FieldDescriptor zzd = a.B(3, FieldDescriptor.builder("version"));
    private static final FieldDescriptor zze = a.B(4, FieldDescriptor.builder("maxImages"));
    private static final FieldDescriptor zzf = a.B(5, FieldDescriptor.builder("maxSsbo"));
    private static final FieldDescriptor zzg = a.B(6, FieldDescriptor.builder("workGroupSizes"));
    private static final FieldDescriptor zzh = a.B(7, FieldDescriptor.builder("errorCode"));

    private zzec() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
