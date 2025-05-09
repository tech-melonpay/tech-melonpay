package com.google.android.gms.internal.mlkit_vision_barcode;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
public final class zzrx {
    private static zzrx zza;

    private zzrx() {
    }

    public static synchronized zzrx zza() {
        zzrx zzrxVar;
        synchronized (zzrx.class) {
            try {
                if (zza == null) {
                    zza = new zzrx();
                }
                zzrxVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzrxVar;
    }
}
