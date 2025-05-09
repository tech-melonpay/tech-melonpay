package com.google.mlkit.vision.common;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes.dex */
public class InputImage {
    public static InputImage a(Bitmap bitmap) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage();
        bitmap.getWidth();
        bitmap.getHeight();
        Preconditions.checkArgument(true, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        zzmu.zza(zzms.zzb("vision-common"), -1, 1, elapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), 0);
        return inputImage;
    }
}
