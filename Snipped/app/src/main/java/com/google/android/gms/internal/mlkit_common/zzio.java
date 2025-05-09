package com.google.android.gms.internal.mlkit_common;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzio implements ObjectEncoder {
    static final zzio zza = new zzio();
    private static final FieldDescriptor zzb = a.c(1, FieldDescriptor.builder("inferenceCommonLogEvent"));
    private static final FieldDescriptor zzc = a.c(2, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzd = a.c(3, FieldDescriptor.builder("inputLength"));
    private static final FieldDescriptor zze = a.c(4, FieldDescriptor.builder("outputLength"));
    private static final FieldDescriptor zzf = a.c(5, FieldDescriptor.builder("loadDictionaryErrorCode"));
    private static final FieldDescriptor zzg = a.c(6, FieldDescriptor.builder("translateResultStatusCode"));
    private static final FieldDescriptor zzh = a.c(7, FieldDescriptor.builder("status"));
    private static final FieldDescriptor zzi = a.c(8, FieldDescriptor.builder("downloadHttpResponseCode"));

    private zzio() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
