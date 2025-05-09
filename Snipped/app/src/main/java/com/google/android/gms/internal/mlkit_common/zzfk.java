package com.google.android.gms.internal.mlkit_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzfk implements ObjectEncoder {
    static final zzfk zza = new zzfk();
    private static final FieldDescriptor zzb = a.c(1, FieldDescriptor.builder("modelType"));
    private static final FieldDescriptor zzc = a.c(2, FieldDescriptor.builder("isSuccessful"));
    private static final FieldDescriptor zzd = a.c(3, FieldDescriptor.builder("modelName"));

    private zzfk() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        zzke zzkeVar = (zzke) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzkeVar.zza());
        objectEncoderContext2.add(zzc, zzkeVar.zzb());
        objectEncoderContext2.add(zzd, (Object) null);
    }
}
