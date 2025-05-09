package com.google.android.gms.internal.mlkit_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzgm implements ObjectEncoder {
    static final zzgm zza = new zzgm();
    private static final FieldDescriptor zzb = a.c(1, FieldDescriptor.builder("eventType"));
    private static final FieldDescriptor zzc = a.c(2, FieldDescriptor.builder("errorCode"));

    private zzgm() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
