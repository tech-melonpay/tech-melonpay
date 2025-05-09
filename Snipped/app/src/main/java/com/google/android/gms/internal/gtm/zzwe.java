package com.google.android.gms.internal.gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
public final class zzwe<K, V> extends LinkedHashMap<K, V> {
    private static final zzwe zza;
    private boolean zzb;

    static {
        zzwe zzweVar = new zzwe();
        zza = zzweVar;
        zzweVar.zzb = false;
    }

    private zzwe() {
        this.zzb = true;
    }

    public static <K, V> zzwe<K, V> zza() {
        return zza;
    }

    private static int zzf(Object obj) {
        if (obj instanceof byte[]) {
            return zzvi.zzb((byte[]) obj);
        }
        if (obj instanceof zzvb) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private final void zzg() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzg();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            V value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i += zzf(entry.getValue()) ^ zzf(entry.getKey());
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k3, V v10) {
        zzg();
        zzvi.zze(k3);
        zzvi.zze(v10);
        return (V) super.put(k3, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        zzg();
        for (K k3 : map.keySet()) {
            zzvi.zze(k3);
            zzvi.zze(map.get(k3));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        zzg();
        return (V) super.remove(obj);
    }

    public final zzwe<K, V> zzb() {
        return isEmpty() ? new zzwe<>() : new zzwe<>(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(zzwe<K, V> zzweVar) {
        zzg();
        if (zzweVar.isEmpty()) {
            return;
        }
        putAll(zzweVar);
    }

    public final boolean zze() {
        return this.zzb;
    }

    private zzwe(Map<K, V> map) {
        super(map);
        this.zzb = true;
    }
}
