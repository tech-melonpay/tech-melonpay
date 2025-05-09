package com.google.android.gms.internal.firebase_messaging;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ValueEncoder;
import java.io.OutputStream;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* loaded from: classes.dex */
public final class zzx {
    private final Map<Class<?>, ObjectEncoder<?>> zza;
    private final Map<Class<?>, ValueEncoder<?>> zzb;
    private final ObjectEncoder<Object> zzc;

    public zzx(Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = objectEncoder;
    }

    public final void zza(Object obj, OutputStream outputStream) {
        new zzu(outputStream, this.zza, this.zzb, this.zzc).zzf(obj);
    }
}
