package com.google.android.gms.internal.mlkit_vision_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes.dex */
final class zzeb implements ObjectEncoder {
    static final zzeb zza = new zzeb();
    private static final FieldDescriptor zzb = a.B(1, FieldDescriptor.builder("mode"));
    private static final FieldDescriptor zzc = a.B(2, FieldDescriptor.builder("landmark"));
    private static final FieldDescriptor zzd = a.B(3, FieldDescriptor.builder("classification"));
    private static final FieldDescriptor zze = a.B(4, FieldDescriptor.builder("prominentFaceOnly"));
    private static final FieldDescriptor zzf = a.B(5, FieldDescriptor.builder("tracking"));
    private static final FieldDescriptor zzg = a.B(6, FieldDescriptor.builder("minFaceSize"));

    private zzeb() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
