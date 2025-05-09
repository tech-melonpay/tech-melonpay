package com.google.android.gms.internal.mlkit_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzjc implements ObjectEncoder {
    static final zzjc zza = new zzjc();
    private static final FieldDescriptor zzb = a.c(1, FieldDescriptor.builder("language"));
    private static final FieldDescriptor zzc = a.c(2, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzd = a.c(3, FieldDescriptor.builder("errorCode"));

    private zzjc() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
