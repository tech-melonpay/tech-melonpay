package com.sumsub.sentry;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import pa.e;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import sa.AbstractC1244a;

@InterfaceC1080d(with = b.class)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 12\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0002\b\u0016B\t\b\u0016¢\u0006\u0004\b-\u0010.B\u0011\b\u0016\u0012\u0006\u0010/\u001a\u00020\u0000¢\u0006\u0004\b-\u00100J-\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002¢\u0006\u0004\b\b\u0010\tR(\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\b\u0010\u000eR(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0012\"\u0004\b\b\u0010\u0013R(\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\b\u0010\u0018R(\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\b\u0010\u001dR(\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\b\u0010\"R(\u0010$\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b\b\u0010'R(\u0010)\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b\b\u0010,¨\u00062"}, d2 = {"Lcom/sumsub/sentry/d;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "T", "key", "Ljava/lang/Class;", "clazz", "a", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "Lcom/sumsub/sentry/n0;", "traceContext", "j", "()Lcom/sumsub/sentry/n0;", "(Lcom/sumsub/sentry/n0;)V", n0.i, "Lcom/sumsub/sentry/a;", a.f13540h, "()Lcom/sumsub/sentry/a;", "(Lcom/sumsub/sentry/a;)V", "Lcom/sumsub/sentry/c;", c.f13591c, "b", "()Lcom/sumsub/sentry/c;", "(Lcom/sumsub/sentry/c;)V", "Lcom/sumsub/sentry/Device;", Device.f13499a, "c", "()Lcom/sumsub/sentry/Device;", "(Lcom/sumsub/sentry/Device;)V", "Lcom/sumsub/sentry/q;", "operatingSystem", "g", "()Lcom/sumsub/sentry/q;", "(Lcom/sumsub/sentry/q;)V", "Lcom/sumsub/sentry/f0;", f0.f13630d, "h", "()Lcom/sumsub/sentry/f0;", "(Lcom/sumsub/sentry/f0;)V", "Lcom/sumsub/sentry/j;", j.f13677j, "e", "()Lcom/sumsub/sentry/j;", "(Lcom/sumsub/sentry/j;)V", "<init>", "()V", "contexts", "(Lcom/sumsub/sentry/d;)V", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class d extends ConcurrentHashMap<String, Object> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: com.sumsub.sentry.d$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<d> serializer() {
            return b.f13605a;
        }

        public Companion() {
        }
    }

    public d() {
    }

    public /* bridge */ boolean a(String str) {
        return super.containsKey(str);
    }

    public /* bridge */ Object b(String str) {
        return super.get(str);
    }

    public /* bridge */ Object c(String str) {
        return super.remove(str);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return a((String) obj);
        }
        return false;
    }

    public /* bridge */ Set<Map.Entry<String, Object>> d() {
        return super.entrySet();
    }

    public final j e() {
        return (j) a(j.f13677j, j.class);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<String, Object>> entrySet() {
        return d();
    }

    public /* bridge */ Set<String> f() {
        return super.keySet();
    }

    public final q g() {
        return (q) a(q.f13755g, q.class);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof String) {
            return b((String) obj);
        }
        return null;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof String) ? obj2 : a((String) obj, obj2);
    }

    public final f0 h() {
        return (f0) a(f0.f13630d, f0.class);
    }

    public /* bridge */ int i() {
        return super.size();
    }

    public final n0 j() {
        return (n0) a(n0.i, n0.class);
    }

    public /* bridge */ Collection<Object> k() {
        return super.values();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return f();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof String) {
            return c((String) obj);
        }
        return null;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return i();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return k();
    }

    public d(d dVar) {
        for (Map.Entry<String, Object> entry : dVar.entrySet()) {
            Object value = entry.getValue();
            if (a.f13540h.equals(entry.getKey()) && (value instanceof a)) {
                a(new a((a) value));
            } else if (c.f13591c.equals(entry.getKey()) && (value instanceof c)) {
                a(new c((c) value));
            } else if (Device.f13499a.equals(entry.getKey()) && (value instanceof Device)) {
                a(new Device((Device) value));
            } else if (q.f13755g.equals(entry.getKey()) && (value instanceof q)) {
                a(new q((q) value));
            } else if (f0.f13630d.equals(entry.getKey()) && (value instanceof f0)) {
                a(new f0((f0) value));
            } else if (j.f13677j.equals(entry.getKey()) && (value instanceof j)) {
                a(new j((j) value));
            } else if (n0.i.equals(entry.getKey()) && (value instanceof n0)) {
                a(new n0((n0) value));
            } else {
                put(entry.getKey(), value);
            }
        }
    }

    public /* bridge */ Object a(String str, Object obj) {
        return super.getOrDefault(str, obj);
    }

    public /* bridge */ boolean b(String str, Object obj) {
        return super.remove(str, obj);
    }

    public final Device c() {
        return (Device) a(Device.f13499a, Device.class);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (obj instanceof String) {
            return b((String) obj, obj2);
        }
        return false;
    }

    public final <T> T a(String key, Class<T> clazz) {
        Object obj = get(key);
        if (clazz.isInstance(obj)) {
            return clazz.cast(obj);
        }
        return null;
    }

    public final c b() {
        return (c) a(c.f13591c, c.class);
    }

    public final void a(n0 n0Var) {
        Objects.requireNonNull(n0Var, "traceContext is required");
        put(n0.i, n0Var);
    }

    public final a a() {
        return (a) a(a.f13540h, a.class);
    }

    public final void a(a aVar) {
        put(a.f13540h, aVar);
    }

    public final void a(c cVar) {
        put(c.f13591c, cVar);
    }

    public final void a(Device device) {
        put(Device.f13499a, device);
    }

    public final void a(q qVar) {
        put(q.f13755g, qVar);
    }

    public final void a(f0 f0Var) {
        put(f0.f13630d, f0Var);
    }

    public final void a(j jVar) {
        put(j.f13677j, jVar);
    }

    public static final class b implements InterfaceC1078b<d> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f13605a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final pa.f f13606b = kotlinx.serialization.descriptors.a.a("ContextsSerializer", e.i.f25738a);

        /* renamed from: c, reason: collision with root package name */
        public static final AbstractC1244a f13607c = com.sumsub.sns.internal.core.common.x.a(false, 1, null);

        public static final class a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t3, T t10) {
                return R9.a.a((String) ((Map.Entry) t3).getKey(), (String) ((Map.Entry) t10).getKey());
            }
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d deserialize(InterfaceC1144d interfaceC1144d) {
            if (!(interfaceC1144d instanceof sa.g)) {
                return new d();
            }
            d dVar = new d();
            JsonElement l10 = ((sa.g) interfaceC1144d).l();
            if (l10 instanceof JsonObject) {
                JsonObject jsonObject = (JsonObject) l10;
                for (String str : jsonObject.keySet()) {
                    JsonElement jsonElement = (JsonElement) jsonObject.get((Object) str);
                    if (jsonElement != null) {
                        switch (str.hashCode()) {
                            case -1335157162:
                                if (str.equals(Device.f13499a)) {
                                    AbstractC1244a abstractC1244a = f13607c;
                                    dVar.a((Device) abstractC1244a.d(j3.e.B(abstractC1244a.f27066b, kotlin.jvm.internal.h.d(Device.class)), jsonElement));
                                    break;
                                } else {
                                    dVar.put(str, com.sumsub.sns.internal.core.common.x.a(jsonElement));
                                    break;
                                }
                            case 3556:
                                if (str.equals(q.f13755g)) {
                                    AbstractC1244a abstractC1244a2 = f13607c;
                                    dVar.a((q) abstractC1244a2.d(j3.e.B(abstractC1244a2.f27066b, kotlin.jvm.internal.h.d(q.class)), jsonElement));
                                    break;
                                } else {
                                    dVar.put(str, com.sumsub.sns.internal.core.common.x.a(jsonElement));
                                    break;
                                }
                            case 96801:
                                if (str.equals(com.sumsub.sentry.a.f13540h)) {
                                    AbstractC1244a abstractC1244a3 = f13607c;
                                    dVar.a((com.sumsub.sentry.a) abstractC1244a3.d(j3.e.B(abstractC1244a3.f27066b, kotlin.jvm.internal.h.d(com.sumsub.sentry.a.class)), jsonElement));
                                    break;
                                } else {
                                    dVar.put(str, com.sumsub.sns.internal.core.common.x.a(jsonElement));
                                    break;
                                }
                            case 102572:
                                if (str.equals(j.f13677j)) {
                                    AbstractC1244a abstractC1244a4 = f13607c;
                                    dVar.a((j) abstractC1244a4.d(j3.e.B(abstractC1244a4.f27066b, kotlin.jvm.internal.h.d(j.class)), jsonElement));
                                    break;
                                } else {
                                    dVar.put(str, com.sumsub.sns.internal.core.common.x.a(jsonElement));
                                    break;
                                }
                            case 110620997:
                                if (str.equals(n0.i)) {
                                    AbstractC1244a abstractC1244a5 = f13607c;
                                    dVar.a((n0) abstractC1244a5.d(j3.e.B(abstractC1244a5.f27066b, kotlin.jvm.internal.h.d(n0.class)), jsonElement));
                                    break;
                                } else {
                                    dVar.put(str, com.sumsub.sns.internal.core.common.x.a(jsonElement));
                                    break;
                                }
                            case 150940456:
                                if (str.equals(c.f13591c)) {
                                    AbstractC1244a abstractC1244a6 = f13607c;
                                    dVar.a((c) abstractC1244a6.d(j3.e.B(abstractC1244a6.f27066b, kotlin.jvm.internal.h.d(c.class)), jsonElement));
                                    break;
                                } else {
                                    dVar.put(str, com.sumsub.sns.internal.core.common.x.a(jsonElement));
                                    break;
                                }
                            case 1550962648:
                                if (str.equals(f0.f13630d)) {
                                    AbstractC1244a abstractC1244a7 = f13607c;
                                    dVar.a((f0) abstractC1244a7.d(j3.e.B(abstractC1244a7.f27066b, kotlin.jvm.internal.h.d(f0.class)), jsonElement));
                                    break;
                                } else {
                                    dVar.put(str, com.sumsub.sns.internal.core.common.x.a(jsonElement));
                                    break;
                                }
                            default:
                                dVar.put(str, com.sumsub.sns.internal.core.common.x.a(jsonElement));
                                break;
                        }
                    }
                }
            }
            return dVar;
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f13606b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, d dVar) {
            if (interfaceC1145e instanceof sa.j) {
                List<Map.Entry> X = P9.s.X(dVar.entrySet(), new a());
                int n10 = P9.z.n(P9.n.u(X, 10));
                if (n10 < 16) {
                    n10 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(n10);
                for (Map.Entry entry : X) {
                    String valueOf = String.valueOf(entry.getKey());
                    AbstractC1244a abstractC1244a = f13607c;
                    InterfaceC1078b C10 = j3.e.C(ua.a.f30484a, entry.getValue().getClass());
                    Object value = entry.getValue();
                    abstractC1244a.getClass();
                    linkedHashMap.put(valueOf, kotlinx.serialization.json.internal.e.a(abstractC1244a, value, C10));
                }
                ((sa.j) interfaceC1145e).w(new JsonObject(new LinkedHashMap(linkedHashMap)));
            }
        }
    }
}
