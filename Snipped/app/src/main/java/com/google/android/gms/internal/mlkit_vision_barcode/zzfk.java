package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzfk implements ObjectEncoder {
    static final zzfk zza = new zzfk();
    private static final FieldDescriptor zzb = a.x(1, FieldDescriptor.builder("logEventKey"));
    private static final FieldDescriptor zzc = a.x(2, FieldDescriptor.builder("eventCount"));
    private static final FieldDescriptor zzd = a.x(3, FieldDescriptor.builder("inferenceDurationStats"));

    private zzfk() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        zzeb zzebVar = (zzeb) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzebVar.zza());
        objectEncoderContext2.add(zzc, zzebVar.zzc());
        objectEncoderContext2.add(zzd, zzebVar.zzb());
    }
}
