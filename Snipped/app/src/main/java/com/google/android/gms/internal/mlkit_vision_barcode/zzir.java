package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzir implements ObjectEncoder {
    static final zzir zza = new zzir();
    private static final FieldDescriptor zzb = a.x(1, FieldDescriptor.builder("inferenceCommonLogEvent"));
    private static final FieldDescriptor zzc = a.x(2, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzd = a.x(3, FieldDescriptor.builder("detectedBarcodeFormats"));
    private static final FieldDescriptor zze = a.x(4, FieldDescriptor.builder("detectedBarcodeValueTypes"));
    private static final FieldDescriptor zzf = a.x(5, FieldDescriptor.builder("imageInfo"));

    private zzir() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        zznt zzntVar = (zznt) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzntVar.zzd());
        objectEncoderContext2.add(zzc, zzntVar.zze());
        objectEncoderContext2.add(zzd, zzntVar.zza());
        objectEncoderContext2.add(zze, zzntVar.zzb());
        objectEncoderContext2.add(zzf, zzntVar.zzc());
    }
}
