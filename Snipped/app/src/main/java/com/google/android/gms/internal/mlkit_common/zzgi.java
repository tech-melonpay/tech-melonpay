package com.google.android.gms.internal.mlkit_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzgi implements ObjectEncoder {
    static final zzgi zza = new zzgi();
    private static final FieldDescriptor zzb = a.c(1, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzc = a.c(2, FieldDescriptor.builder("roughDownloadDurationMs"));
    private static final FieldDescriptor zzd = a.c(3, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zze = a.c(4, FieldDescriptor.builder("exactDownloadDurationMs"));
    private static final FieldDescriptor zzf = a.c(5, FieldDescriptor.builder("downloadStatus"));
    private static final FieldDescriptor zzg = a.c(6, FieldDescriptor.builder("downloadFailureStatus"));
    private static final FieldDescriptor zzh = a.c(7, FieldDescriptor.builder("mddDownloadErrorCodes"));

    private zzgi() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        zzlk zzlkVar = (zzlk) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzlkVar.zzc());
        objectEncoderContext2.add(zzc, zzlkVar.zzf());
        objectEncoderContext2.add(zzd, zzlkVar.zza());
        objectEncoderContext2.add(zze, zzlkVar.zze());
        objectEncoderContext2.add(zzf, zzlkVar.zzb());
        objectEncoderContext2.add(zzg, zzlkVar.zzd());
        objectEncoderContext2.add(zzh, (Object) null);
    }
}
