package com.google.android.gms.internal.mlkit_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzix implements ObjectEncoder {
    static final zzix zza = new zzix();
    private static final FieldDescriptor zzb = a.c(1, FieldDescriptor.builder("appId"));
    private static final FieldDescriptor zzc = a.c(2, FieldDescriptor.builder("appVersion"));
    private static final FieldDescriptor zzd = a.c(3, FieldDescriptor.builder("firebaseProjectId"));
    private static final FieldDescriptor zze = a.c(4, FieldDescriptor.builder("mlSdkVersion"));
    private static final FieldDescriptor zzf = a.c(5, FieldDescriptor.builder("tfliteSchemaVersion"));
    private static final FieldDescriptor zzg = a.c(6, FieldDescriptor.builder("gcmSenderId"));
    private static final FieldDescriptor zzh = a.c(7, FieldDescriptor.builder("apiKey"));
    private static final FieldDescriptor zzi = a.c(8, FieldDescriptor.builder("languages"));
    private static final FieldDescriptor zzj = a.c(9, FieldDescriptor.builder("mlSdkInstanceId"));
    private static final FieldDescriptor zzk = a.c(10, FieldDescriptor.builder("isClearcutClient"));
    private static final FieldDescriptor zzl = a.c(11, FieldDescriptor.builder("isStandaloneMlkit"));
    private static final FieldDescriptor zzm = a.c(12, FieldDescriptor.builder("isJsonLogging"));
    private static final FieldDescriptor zzn = a.c(13, FieldDescriptor.builder("buildLevel"));
    private static final FieldDescriptor zzo = a.c(14, FieldDescriptor.builder("optionalModuleVersion"));

    private zzix() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        zzob zzobVar = (zzob) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzobVar.zzg());
        objectEncoderContext2.add(zzc, zzobVar.zzh());
        objectEncoderContext2.add(zzd, (Object) null);
        objectEncoderContext2.add(zze, zzobVar.zzj());
        objectEncoderContext2.add(zzf, zzobVar.zzk());
        objectEncoderContext2.add(zzg, (Object) null);
        objectEncoderContext2.add(zzh, (Object) null);
        objectEncoderContext2.add(zzi, zzobVar.zza());
        objectEncoderContext2.add(zzj, zzobVar.zzi());
        objectEncoderContext2.add(zzk, zzobVar.zzb());
        objectEncoderContext2.add(zzl, zzobVar.zzd());
        objectEncoderContext2.add(zzm, zzobVar.zzc());
        objectEncoderContext2.add(zzn, zzobVar.zze());
        objectEncoderContext2.add(zzo, zzobVar.zzf());
    }
}
