package com.google.android.gms.internal.mlkit_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzjd implements ObjectEncoder {
    static final zzjd zza = new zzjd();
    private static final FieldDescriptor zzb = a.c(1, FieldDescriptor.builder("sourceLanguage"));
    private static final FieldDescriptor zzc = a.c(2, FieldDescriptor.builder("targetLanguage"));

    private zzjd() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
