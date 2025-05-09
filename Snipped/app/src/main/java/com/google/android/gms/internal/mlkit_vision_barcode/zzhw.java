package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzhw implements ObjectEncoder {
    static final zzhw zza = new zzhw();
    private static final FieldDescriptor zzb = a.x(1, FieldDescriptor.builder("imageFormat"));
    private static final FieldDescriptor zzc = a.x(2, FieldDescriptor.builder("originalImageSize"));
    private static final FieldDescriptor zzd = a.x(3, FieldDescriptor.builder("compressedImageSize"));
    private static final FieldDescriptor zze = a.x(4, FieldDescriptor.builder("isOdmlImage"));

    private zzhw() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        zzmq zzmqVar = (zzmq) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzmqVar.zza());
        objectEncoderContext2.add(zzc, zzmqVar.zzb());
        objectEncoderContext2.add(zzd, (Object) null);
        objectEncoderContext2.add(zze, (Object) null);
    }
}
