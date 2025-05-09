package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzia implements ObjectEncoder {
    static final zzia zza = new zzia();
    private static final FieldDescriptor zzb = a.x(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = a.x(2, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zzd = a.x(3, FieldDescriptor.builder("isColdCall"));
    private static final FieldDescriptor zze = a.x(4, FieldDescriptor.builder("autoManageModelOnBackground"));
    private static final FieldDescriptor zzf = a.x(5, FieldDescriptor.builder("autoManageModelOnLowMemory"));
    private static final FieldDescriptor zzg = a.x(6, FieldDescriptor.builder("isNnApiEnabled"));
    private static final FieldDescriptor zzh = a.x(7, FieldDescriptor.builder("eventsCount"));
    private static final FieldDescriptor zzi = a.x(8, FieldDescriptor.builder("otherErrors"));
    private static final FieldDescriptor zzj = a.x(9, FieldDescriptor.builder("remoteConfigValueForAcceleration"));
    private static final FieldDescriptor zzk = a.x(10, FieldDescriptor.builder("isAccelerated"));

    private zzia() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        zzmw zzmwVar = (zzmw) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzmwVar.zze());
        objectEncoderContext2.add(zzc, zzmwVar.zza());
        objectEncoderContext2.add(zzd, zzmwVar.zzd());
        objectEncoderContext2.add(zze, zzmwVar.zzb());
        objectEncoderContext2.add(zzf, zzmwVar.zzc());
        objectEncoderContext2.add(zzg, (Object) null);
        objectEncoderContext2.add(zzh, (Object) null);
        objectEncoderContext2.add(zzi, (Object) null);
        objectEncoderContext2.add(zzj, (Object) null);
        objectEncoderContext2.add(zzk, (Object) null);
    }
}
