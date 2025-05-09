package com.google.android.gms.internal.mlkit_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzfq implements ObjectEncoder {
    static final zzfq zza = new zzfq();
    private static final FieldDescriptor zzb = a.c(1, FieldDescriptor.builder("maxMs"));
    private static final FieldDescriptor zzc = a.c(2, FieldDescriptor.builder("minMs"));
    private static final FieldDescriptor zzd = a.c(3, FieldDescriptor.builder("avgMs"));
    private static final FieldDescriptor zze = a.c(4, FieldDescriptor.builder("firstQuartileMs"));
    private static final FieldDescriptor zzf = a.c(5, FieldDescriptor.builder("medianMs"));
    private static final FieldDescriptor zzg = a.c(6, FieldDescriptor.builder("thirdQuartileMs"));

    private zzfq() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
