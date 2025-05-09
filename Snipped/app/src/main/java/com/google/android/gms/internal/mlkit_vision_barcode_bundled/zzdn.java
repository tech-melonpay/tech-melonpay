package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
final class zzdn {
    private final Object zza;
    private final int zzb;

    public zzdn(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdn)) {
            return false;
        }
        zzdn zzdnVar = (zzdn) obj;
        return this.zza == zzdnVar.zza && this.zzb == zzdnVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) + this.zzb;
    }
}
