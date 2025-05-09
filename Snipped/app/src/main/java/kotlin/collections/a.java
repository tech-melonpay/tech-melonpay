package kotlin.collections;

import P9.y;
import P9.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* compiled from: Maps.kt */
/* loaded from: classes2.dex */
public class a extends z {
    public static <K, V> Map<K, V> p() {
        return EmptyMap.f23105a;
    }

    public static <K, V> V q(Map<K, ? extends V> map, K k3) {
        if (map instanceof y) {
            return (V) ((y) map).b(k3);
        }
        V v10 = map.get(k3);
        if (v10 != null || map.containsKey(k3)) {
            return v10;
        }
        throw new NoSuchElementException("Key " + k3 + " is missing in the map.");
    }

    public static <K, V> HashMap<K, V> r(Pair<? extends K, ? extends V>... pairArr) {
        HashMap<K, V> hashMap = new HashMap<>(z.n(pairArr.length));
        u(hashMap, pairArr);
        return hashMap;
    }

    public static <K, V> Map<K, V> s(Pair<? extends K, ? extends V>... pairArr) {
        if (pairArr.length <= 0) {
            return EmptyMap.f23105a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(z.n(pairArr.length));
        u(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static LinkedHashMap t(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final void u(HashMap hashMap, Pair[] pairArr) {
        for (Pair pair : pairArr) {
            hashMap.put(pair.f23089a, pair.f23090b);
        }
    }

    public static Map v(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return EmptyMap.f23105a;
        }
        if (size == 1) {
            return z.o((Pair) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(z.n(arrayList.size()));
        y(arrayList, linkedHashMap);
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> w(Map<? extends K, ? extends V> map) {
        int size = map.size();
        if (size == 0) {
            return EmptyMap.f23105a;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        return Collections.singletonMap(next.getKey(), next.getValue());
    }

    public static <K, V> Map<K, V> x(Pair<? extends K, ? extends V>[] pairArr) {
        int length = pairArr.length;
        if (length == 0) {
            return EmptyMap.f23105a;
        }
        if (length == 1) {
            return z.o(pairArr[0]);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(z.n(pairArr.length));
        u(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static void y(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put(pair.f23089a, pair.f23090b);
        }
    }
}
