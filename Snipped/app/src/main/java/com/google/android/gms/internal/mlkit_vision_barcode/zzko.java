package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzko implements ObjectEncoder {
    static final zzko zza = new zzko();
    private static final FieldDescriptor zzb = a.x(1, FieldDescriptor.builder("inferenceCommonLogEvent"));
    private static final FieldDescriptor zzc = a.x(2, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzd = a.x(3, FieldDescriptor.builder("inputLength"));
    private static final FieldDescriptor zze = a.x(4, FieldDescriptor.builder("outputLength"));
    private static final FieldDescriptor zzf = a.x(5, FieldDescriptor.builder("loadDictionaryErrorCode"));
    private static final FieldDescriptor zzg = a.x(6, FieldDescriptor.builder("translateResultStatusCode"));
    private static final FieldDescriptor zzh = a.x(7, FieldDescriptor.builder("status"));
    private static final FieldDescriptor zzi = a.x(8, FieldDescriptor.builder("downloadHttpResponseCode"));

    private zzko() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
