package com.google.android.gms.internal.mlkit_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzgd implements ObjectEncoder {
    static final zzgd zza = new zzgd();
    private static final FieldDescriptor zzb = a.c(1, FieldDescriptor.builder("modelType"));
    private static final FieldDescriptor zzc = a.c(2, FieldDescriptor.builder("isDownloaded"));
    private static final FieldDescriptor zzd = a.c(3, FieldDescriptor.builder("modelName"));

    private zzgd() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        zzkv zzkvVar = (zzkv) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzkvVar.zza());
        objectEncoderContext2.add(zzc, zzkvVar.zzb());
        objectEncoderContext2.add(zzd, (Object) null);
    }
}
