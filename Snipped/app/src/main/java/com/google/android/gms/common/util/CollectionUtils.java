package com.google.android.gms.common.util;

import C.v;
import androidx.collection.a;
import androidx.collection.b;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    public static boolean isEmpty(Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.emptyList();
    }

    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(K k3, V v10, K k10, V v11, K k11, V v12) {
        Map zza = zza(3, false);
        zza.put(k3, v10);
        zza.put(k10, v11);
        zza.put(k11, v12);
        return Collections.unmodifiableMap(zza);
    }

    @KeepForSdk
    public static <K, V> Map<K, V> mapOfKeyValueArrays(K[] kArr, V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new IllegalArgumentException(v.k(length, length2, "Key and values array lengths not equal: ", " != "));
        }
        if (length == 0) {
            return Collections.emptyMap();
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map zza = zza(length, false);
        for (int i = 0; i < kArr.length; i++) {
            zza.put(kArr[i], vArr[i]);
        }
        return Collections.unmodifiableMap(zza);
    }

    @KeepForSdk
    public static <T> Set<T> mutableSetOfWithSize(int i) {
        return i == 0 ? new b() : zzb(i, true);
    }

    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(T t3, T t10, T t11) {
        Set zzb = zzb(3, false);
        zzb.add(t3);
        zzb.add(t10);
        zzb.add(t11);
        return Collections.unmodifiableSet(zzb);
    }

    private static Map zza(int i, boolean z10) {
        return i <= 256 ? new a(i) : new HashMap(i, 1.0f);
    }

    private static Set zzb(int i, boolean z10) {
        if (i <= (true != z10 ? 256 : 128)) {
            return new b(i);
        }
        return new HashSet(i, true != z10 ? 1.0f : 0.75f);
    }

    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(T t3) {
        return Collections.singletonList(t3);
    }

    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return Collections.singletonList(tArr[0]);
    }

    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(K k3, V v10, K k10, V v11, K k11, V v12, K k12, V v13, K k13, V v14, K k14, V v15) {
        Map zza = zza(6, false);
        zza.put(k3, v10);
        zza.put(k10, v11);
        zza.put(k11, v12);
        zza.put(k12, v13);
        zza.put(k13, v14);
        zza.put(k14, v15);
        return Collections.unmodifiableMap(zza);
    }

    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t3 = tArr[0];
            T t10 = tArr[1];
            Set zzb = zzb(2, false);
            zzb.add(t3);
            zzb.add(t10);
            return Collections.unmodifiableSet(zzb);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set zzb2 = zzb(length, false);
            Collections.addAll(zzb2, tArr);
            return Collections.unmodifiableSet(zzb2);
        }
        T t11 = tArr[0];
        T t12 = tArr[1];
        T t13 = tArr[2];
        T t14 = tArr[3];
        Set zzb3 = zzb(4, false);
        zzb3.add(t11);
        zzb3.add(t12);
        zzb3.add(t13);
        zzb3.add(t14);
        return Collections.unmodifiableSet(zzb3);
    }
}
