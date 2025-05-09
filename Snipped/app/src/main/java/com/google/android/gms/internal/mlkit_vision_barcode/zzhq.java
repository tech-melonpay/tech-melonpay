package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzhq implements ObjectEncoder {
    static final zzhq zza = new zzhq();
    private static final FieldDescriptor zzb = a.x(1, FieldDescriptor.builder("maxMs"));
    private static final FieldDescriptor zzc = a.x(2, FieldDescriptor.builder("minMs"));
    private static final FieldDescriptor zzd = a.x(3, FieldDescriptor.builder("avgMs"));
    private static final FieldDescriptor zze = a.x(4, FieldDescriptor.builder("firstQuartileMs"));
    private static final FieldDescriptor zzf = a.x(5, FieldDescriptor.builder("medianMs"));
    private static final FieldDescriptor zzg = a.x(6, FieldDescriptor.builder("thirdQuartileMs"));

    private zzhq() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        zzmj zzmjVar = (zzmj) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzmjVar.zzc());
        objectEncoderContext2.add(zzc, zzmjVar.zze());
        objectEncoderContext2.add(zzd, zzmjVar.zza());
        objectEncoderContext2.add(zze, zzmjVar.zzb());
        objectEncoderContext2.add(zzf, zzmjVar.zzd());
        objectEncoderContext2.add(zzg, zzmjVar.zzf());
    }
}
