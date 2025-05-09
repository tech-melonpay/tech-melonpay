package com.google.android.gms.internal.mlkit_vision_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes.dex */
final class zzdy implements ObjectEncoder {
    static final zzdy zza = new zzdy();
    private static final FieldDescriptor zzb = a.B(1, FieldDescriptor.builder("maxMs"));
    private static final FieldDescriptor zzc = a.B(2, FieldDescriptor.builder("minMs"));
    private static final FieldDescriptor zzd = a.B(3, FieldDescriptor.builder("avgMs"));
    private static final FieldDescriptor zze = a.B(4, FieldDescriptor.builder("firstQuartileMs"));
    private static final FieldDescriptor zzf = a.B(5, FieldDescriptor.builder("medianMs"));
    private static final FieldDescriptor zzg = a.B(6, FieldDescriptor.builder("thirdQuartileMs"));

    private zzdy() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
