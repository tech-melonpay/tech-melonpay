package com.google.android.gms.internal.mlkit_common;

import androidx.camera.core.impl.utils.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzgj implements ObjectEncoder {
    static final zzgj zza = new zzgj();
    private static final FieldDescriptor zzb = a.c(1, FieldDescriptor.builder(AppMeasurementSdk.ConditionalUserProperty.NAME));
    private static final FieldDescriptor zzc = a.c(2, FieldDescriptor.builder("version"));
    private static final FieldDescriptor zzd = a.c(3, FieldDescriptor.builder("source"));
    private static final FieldDescriptor zze = a.c(4, FieldDescriptor.builder("uri"));
    private static final FieldDescriptor zzf = a.c(5, FieldDescriptor.builder("hash"));
    private static final FieldDescriptor zzg = a.c(6, FieldDescriptor.builder("modelType"));
    private static final FieldDescriptor zzh = a.c(7, FieldDescriptor.builder("size"));
    private static final FieldDescriptor zzi = a.c(8, FieldDescriptor.builder("hasLabelMap"));
    private static final FieldDescriptor zzj = a.c(9, FieldDescriptor.builder("isManifestModel"));

    private zzgj() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        zzlp zzlpVar = (zzlp) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzlpVar.zzd());
        objectEncoderContext2.add(zzc, (Object) null);
        objectEncoderContext2.add(zzd, zzlpVar.zzb());
        objectEncoderContext2.add(zze, (Object) null);
        objectEncoderContext2.add(zzf, zzlpVar.zzc());
        objectEncoderContext2.add(zzg, zzlpVar.zza());
        objectEncoderContext2.add(zzh, (Object) null);
        objectEncoderContext2.add(zzi, (Object) null);
        objectEncoderContext2.add(zzj, (Object) null);
    }
}
