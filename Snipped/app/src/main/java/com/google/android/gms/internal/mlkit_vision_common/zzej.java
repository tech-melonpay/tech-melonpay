package com.google.android.gms.internal.mlkit_vision_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes.dex */
final class zzej implements ObjectEncoder {
    static final zzej zza = new zzej();
    private static final FieldDescriptor zzb = a.B(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = a.B(2, FieldDescriptor.builder("imageSource"));
    private static final FieldDescriptor zzd = a.B(3, FieldDescriptor.builder("imageFormat"));
    private static final FieldDescriptor zze = a.B(4, FieldDescriptor.builder("imageByteSize"));
    private static final FieldDescriptor zzf = a.B(5, FieldDescriptor.builder("imageWidth"));
    private static final FieldDescriptor zzg = a.B(6, FieldDescriptor.builder("imageHeight"));
    private static final FieldDescriptor zzh = a.B(7, FieldDescriptor.builder("rotationDegrees"));

    private zzej() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        zziq zziqVar = (zziq) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zziqVar.zzg());
        objectEncoderContext2.add(zzc, zziqVar.zzb());
        objectEncoderContext2.add(zzd, zziqVar.zza());
        objectEncoderContext2.add(zze, zziqVar.zzc());
        objectEncoderContext2.add(zzf, zziqVar.zze());
        objectEncoderContext2.add(zzg, zziqVar.zzd());
        objectEncoderContext2.add(zzh, zziqVar.zzf());
    }
}
