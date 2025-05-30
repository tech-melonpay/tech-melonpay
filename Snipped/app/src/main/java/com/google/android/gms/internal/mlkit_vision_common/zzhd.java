package com.google.android.gms.internal.mlkit_vision_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes.dex */
final class zzhd implements ObjectEncoder {
    static final zzhd zza = new zzhd();
    private static final FieldDescriptor zzb = a.B(1, FieldDescriptor.builder("numSamples"));
    private static final FieldDescriptor zzc = a.B(2, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zzd = a.B(3, FieldDescriptor.builder("metricResults"));

    private zzhd() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
