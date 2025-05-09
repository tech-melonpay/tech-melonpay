package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.camera.core.impl.utils.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzii implements ObjectEncoder {
    static final zzii zza = new zzii();
    private static final FieldDescriptor zzb = a.x(1, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzc = a.x(2, FieldDescriptor.builder("roughDownloadDurationMs"));
    private static final FieldDescriptor zzd = a.x(3, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zze = a.x(4, FieldDescriptor.builder("exactDownloadDurationMs"));
    private static final FieldDescriptor zzf = a.x(5, FieldDescriptor.builder("downloadStatus"));
    private static final FieldDescriptor zzg = a.x(6, FieldDescriptor.builder("downloadFailureStatus"));
    private static final FieldDescriptor zzh = a.x(7, FieldDescriptor.builder("mddDownloadErrorCodes"));

    private zzii() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
