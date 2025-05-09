package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzkx implements ObjectEncoder {
    static final zzkx zza = new zzkx();
    private static final FieldDescriptor zzb = a.x(1, FieldDescriptor.builder("appId"));
    private static final FieldDescriptor zzc = a.x(2, FieldDescriptor.builder("appVersion"));
    private static final FieldDescriptor zzd = a.x(3, FieldDescriptor.builder("firebaseProjectId"));
    private static final FieldDescriptor zze = a.x(4, FieldDescriptor.builder("mlSdkVersion"));
    private static final FieldDescriptor zzf = a.x(5, FieldDescriptor.builder("tfliteSchemaVersion"));
    private static final FieldDescriptor zzg = a.x(6, FieldDescriptor.builder("gcmSenderId"));
    private static final FieldDescriptor zzh = a.x(7, FieldDescriptor.builder("apiKey"));
    private static final FieldDescriptor zzi = a.x(8, FieldDescriptor.builder("languages"));
    private static final FieldDescriptor zzj = a.x(9, FieldDescriptor.builder("mlSdkInstanceId"));
    private static final FieldDescriptor zzk = a.x(10, FieldDescriptor.builder("isClearcutClient"));
    private static final FieldDescriptor zzl = a.x(11, FieldDescriptor.builder("isStandaloneMlkit"));
    private static final FieldDescriptor zzm = a.x(12, FieldDescriptor.builder("isJsonLogging"));
    private static final FieldDescriptor zzn = a.x(13, FieldDescriptor.builder("buildLevel"));
    private static final FieldDescriptor zzo = a.x(14, FieldDescriptor.builder("optionalModuleVersion"));

    private zzkx() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        zzpz zzpzVar = (zzpz) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzpzVar.zzg());
        objectEncoderContext2.add(zzc, zzpzVar.zzh());
        objectEncoderContext2.add(zzd, (Object) null);
        objectEncoderContext2.add(zze, zzpzVar.zzj());
        objectEncoderContext2.add(zzf, zzpzVar.zzk());
        objectEncoderContext2.add(zzg, (Object) null);
        objectEncoderContext2.add(zzh, (Object) null);
        objectEncoderContext2.add(zzi, zzpzVar.zza());
        objectEncoderContext2.add(zzj, zzpzVar.zzi());
        objectEncoderContext2.add(zzk, zzpzVar.zzb());
        objectEncoderContext2.add(zzl, zzpzVar.zzd());
        objectEncoderContext2.add(zzm, zzpzVar.zzc());
        objectEncoderContext2.add(zzn, zzpzVar.zze());
        objectEncoderContext2.add(zzo, zzpzVar.zzf());
    }
}
