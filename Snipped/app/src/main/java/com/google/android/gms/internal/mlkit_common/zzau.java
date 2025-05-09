package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.measurement.internal.a;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public abstract class zzau implements Map, Serializable {
    private transient zzav zza;
    private transient zzav zzb;
    private transient zzan zzc;

    public static zzau zzc(Object obj, Object obj2) {
        zzai.zza("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return zzbc.zzg(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzbd.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzav zzavVar = this.zzb;
        if (zzavVar != null) {
            return zzavVar;
        }
        zzav zze = zze();
        this.zzb = zze;
        return zze;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException(a.g(size, "size cannot be negative but was: "));
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    public abstract zzan zza();

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzan values() {
        zzan zzanVar = this.zzc;
        if (zzanVar != null) {
            return zzanVar;
        }
        zzan zza = zza();
        this.zzc = zza;
        return zza;
    }

    public abstract zzav zzd();

    public abstract zzav zze();

    @Override // java.util.Map
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzav entrySet() {
        zzav zzavVar = this.zza;
        if (zzavVar != null) {
            return zzavVar;
        }
        zzav zzd = zzd();
        this.zza = zzd;
        return zzd;
    }
}
