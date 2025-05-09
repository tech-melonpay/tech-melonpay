package kotlinx.serialization.json.internal;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.b;
import kotlinx.serialization.json.internal.a;
import pa.f;
import pa.g;
import sa.AbstractC1244a;

/* compiled from: JsonNamesMap.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a.C0425a<Map<String, Integer>> f23407a = new a.C0425a<>();

    public static final void a(LinkedHashMap linkedHashMap, f fVar, String str, int i) {
        String str2 = kotlin.jvm.internal.f.b(fVar.e(), g.b.f25740a) ? "enum value" : "property";
        if (!linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, Integer.valueOf(i));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for " + str2 + ' ' + fVar.g(i) + " is already one of the names for " + str2 + ' ' + fVar.g(((Number) kotlin.collections.a.q(linkedHashMap, str)).intValue()) + " in " + fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int b(f fVar, AbstractC1244a abstractC1244a, String str) {
        Map<String, ? extends Integer> map;
        boolean z10 = abstractC1244a.f27065a.f27100m;
        a.C0425a<Map<String, Integer>> c0425a = f23407a;
        a aVar = abstractC1244a.f27067c;
        if (z10 && kotlin.jvm.internal.f.b(fVar.e(), g.b.f25740a)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            JsonNamesMapKt$deserializationNamesMap$1 jsonNamesMapKt$deserializationNamesMap$1 = new JsonNamesMapKt$deserializationNamesMap$1(fVar, abstractC1244a);
            ConcurrentHashMap concurrentHashMap = aVar.f23406a;
            Map map2 = (Map) concurrentHashMap.get(fVar);
            Map<String, ? extends Integer> map3 = map2 != null ? map2.get(c0425a) : null;
            map = map3 != null ? map3 : null;
            if (map == null) {
                map = jsonNamesMapKt$deserializationNamesMap$1.invoke();
                Object obj = concurrentHashMap.get(fVar);
                if (obj == null) {
                    obj = new ConcurrentHashMap(2);
                    concurrentHashMap.put(fVar, obj);
                }
                ((Map) obj).put(c0425a, map);
            }
            Integer num = map.get(lowerCase);
            if (num != null) {
                return num.intValue();
            }
            return -3;
        }
        d(fVar, abstractC1244a);
        int d10 = fVar.d(str);
        if (d10 != -3) {
            return d10;
        }
        if (!abstractC1244a.f27065a.f27099l) {
            return d10;
        }
        JsonNamesMapKt$deserializationNamesMap$1 jsonNamesMapKt$deserializationNamesMap$12 = new JsonNamesMapKt$deserializationNamesMap$1(fVar, abstractC1244a);
        ConcurrentHashMap concurrentHashMap2 = aVar.f23406a;
        Map map4 = (Map) concurrentHashMap2.get(fVar);
        Map<String, ? extends Integer> map5 = map4 != null ? map4.get(c0425a) : null;
        map = map5 != null ? map5 : null;
        if (map == null) {
            map = jsonNamesMapKt$deserializationNamesMap$12.invoke();
            Object obj2 = concurrentHashMap2.get(fVar);
            if (obj2 == null) {
                obj2 = new ConcurrentHashMap(2);
                concurrentHashMap2.put(fVar, obj2);
            }
            ((Map) obj2).put(c0425a, map);
        }
        Integer num2 = map.get(str);
        if (num2 != null) {
            return num2.intValue();
        }
        return -3;
    }

    public static final int c(f fVar, AbstractC1244a abstractC1244a, String str, String str2) {
        int b9 = b(fVar, abstractC1244a, str);
        if (b9 != -3) {
            return b9;
        }
        throw new SerializationException(fVar.a() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final void d(f fVar, AbstractC1244a abstractC1244a) {
        if (kotlin.jvm.internal.f.b(fVar.e(), b.a.f23309a)) {
            abstractC1244a.f27065a.getClass();
        }
    }
}
