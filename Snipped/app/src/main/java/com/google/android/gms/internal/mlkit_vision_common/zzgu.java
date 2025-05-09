package com.google.android.gms.internal.mlkit_vision_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes.dex */
final class zzgu implements ObjectEncoder {
    static final zzgu zza = new zzgu();
    private static final FieldDescriptor zzb = a.B(1, FieldDescriptor.builder("appId"));
    private static final FieldDescriptor zzc = a.B(2, FieldDescriptor.builder("appVersion"));
    private static final FieldDescriptor zzd = a.B(3, FieldDescriptor.builder("firebaseProjectId"));
    private static final FieldDescriptor zze = a.B(4, FieldDescriptor.builder("mlSdkVersion"));
    private static final FieldDescriptor zzf = a.B(5, FieldDescriptor.builder("tfliteSchemaVersion"));
    private static final FieldDescriptor zzg = a.B(6, FieldDescriptor.builder("gcmSenderId"));
    private static final FieldDescriptor zzh = a.B(7, FieldDescriptor.builder("apiKey"));
    private static final FieldDescriptor zzi = a.B(8, FieldDescriptor.builder("languages"));
    private static final FieldDescriptor zzj = a.B(9, FieldDescriptor.builder("mlSdkInstanceId"));
    private static final FieldDescriptor zzk = a.B(10, FieldDescriptor.builder("isClearcutClient"));
    private static final FieldDescriptor zzl = a.B(11, FieldDescriptor.builder("isStandaloneMlkit"));
    private static final FieldDescriptor zzm = a.B(12, FieldDescriptor.builder("isJsonLogging"));
    private static final FieldDescriptor zzn = a.B(13, FieldDescriptor.builder("buildLevel"));
    private static final FieldDescriptor zzo = a.B(14, FieldDescriptor.builder("optionalModuleVersion"));

    private zzgu() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        zzla zzlaVar = (zzla) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzlaVar.zzg());
        objectEncoderContext2.add(zzc, zzlaVar.zzh());
        objectEncoderContext2.add(zzd, (Object) null);
        objectEncoderContext2.add(zze, zzlaVar.zzj());
        objectEncoderContext2.add(zzf, zzlaVar.zzk());
        objectEncoderContext2.add(zzg, (Object) null);
        objectEncoderContext2.add(zzh, (Object) null);
        objectEncoderContext2.add(zzi, zzlaVar.zza());
        objectEncoderContext2.add(zzj, zzlaVar.zzi());
        objectEncoderContext2.add(zzk, zzlaVar.zzb());
        objectEncoderContext2.add(zzl, zzlaVar.zzd());
        objectEncoderContext2.add(zzm, zzlaVar.zzc());
        objectEncoderContext2.add(zzn, zzlaVar.zze());
        objectEncoderContext2.add(zzo, zzlaVar.zzf());
    }
}
