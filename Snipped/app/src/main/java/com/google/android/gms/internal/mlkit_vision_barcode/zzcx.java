package com.google.android.gms.internal.mlkit_vision_barcode;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzcx extends zzcf {
    static final zzcf zza = new zzcx(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    private zzcx(Object obj, Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    public static zzcx zzg(int i, Object[] objArr, zzce zzceVar) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        zzbj.zzb(obj, obj2);
        return new zzcx(null, objArr, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020 A[RETURN] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcf, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.zzb
            int r1 = r4.zzc
            r2 = 0
            if (r5 != 0) goto L9
        L7:
            r5 = r2
            goto L1d
        L9:
            r3 = 1
            if (r1 != r3) goto L7
            r1 = 0
            r1 = r0[r1]
            r1.getClass()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L7
            r5 = r0[r3]
            r5.getClass()
        L1d:
            if (r5 != 0) goto L20
            return r2
        L20:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode.zzcx.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcf
    public final zzby zza() {
        return new zzcw(this.zzb, 1, this.zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcf
    public final zzcg zzd() {
        return new zzcu(this, this.zzb, 0, this.zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcf
    public final zzcg zze() {
        return new zzcv(this, new zzcw(this.zzb, 0, this.zzc));
    }
}
