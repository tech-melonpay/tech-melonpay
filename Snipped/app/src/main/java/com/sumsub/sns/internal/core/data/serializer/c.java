package com.sumsub.sns.internal.core.data.serializer;

import O9.p;
import P9.s;
import P9.z;
import ca.InterfaceC0646l;
import com.sumsub.sns.internal.core.common.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import na.InterfaceC1078b;
import pa.e;
import pa.f;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.C1165D;
import sa.C1245b;
import sa.g;
import sa.h;
import sa.j;
import sa.l;

/* loaded from: classes2.dex */
public final class c implements InterfaceC1078b<Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final c f15826a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final f f15827b = kotlinx.serialization.descriptors.a.a("JsonAsAnySerializer", e.i.f25738a);

    public static final class a extends Lambda implements InterfaceC0646l<C1245b, p> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f15828a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj) {
            super(1);
            this.f15828a = obj;
        }

        public final void a(C1245b c1245b) {
            c.f15826a.a(c1245b, (Collection<?>) this.f15828a);
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ p invoke(C1245b c1245b) {
            a(c1245b);
            return p.f3034a;
        }
    }

    public static final class b extends Lambda implements InterfaceC0646l<sa.p, p> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f15829a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj) {
            super(1);
            this.f15829a = obj;
        }

        public final void a(sa.p pVar) {
            c.f15826a.a(pVar, (Map<?, ?>) this.f15829a);
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ p invoke(sa.p pVar) {
            a(pVar);
            return p.f3034a;
        }
    }

    @Override // na.InterfaceC1077a
    public Object deserialize(InterfaceC1144d interfaceC1144d) {
        if (!(interfaceC1144d instanceof g)) {
            throw new IllegalStateException("JsonAsAnySerializer decoder is not JsonDecoder".toString());
        }
        JsonElement l10 = ((g) interfaceC1144d).l();
        Object a10 = a(l10);
        return a10 == null ? l10.toString() : a10;
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public f getDescriptor() {
        return f15827b;
    }

    @Override // na.InterfaceC1081e
    public void serialize(InterfaceC1145e interfaceC1145e, Object obj) {
        j jVar = interfaceC1145e instanceof j ? (j) interfaceC1145e : null;
        if (jVar == null) {
            return;
        }
        a(obj, jVar);
    }

    public final void a(Object obj, j jVar) {
        if (obj instanceof String) {
            jVar.F((String) obj);
            return;
        }
        if (obj instanceof Integer) {
            jVar.y(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            jVar.B(((Number) obj).longValue());
            return;
        }
        if (obj instanceof Float) {
            jVar.p(((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            jVar.g(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Short) {
            jVar.h(((Number) obj).shortValue());
            return;
        }
        if (obj instanceof Boolean) {
            jVar.k(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Collection) {
            C1245b c1245b = new C1245b();
            f15826a.a(c1245b, (Collection<?>) obj);
            jVar.w(new JsonArray(c1245b.f27068a));
        } else if (obj instanceof Map) {
            sa.p pVar = new sa.p();
            f15826a.a(pVar, (Map<?, ?>) obj);
            jVar.w(new JsonObject(pVar.f27112a));
        }
    }

    public final void a(C1245b c1245b, Collection<?> collection) {
        JsonElement lVar;
        Iterator it = s.H(collection).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof String) {
                c1245b.f27068a.add(h.b((String) next));
            } else if (next instanceof Number) {
                c1245b.f27068a.add(h.a((Number) next));
            } else if (next instanceof Boolean) {
                Boolean bool = (Boolean) next;
                C1165D c1165d = h.f27103a;
                if (bool == null) {
                    lVar = JsonNull.INSTANCE;
                } else {
                    lVar = new l(bool, false, null);
                }
                c1245b.f27068a.add(lVar);
            } else if (next instanceof Collection) {
                C1245b c1245b2 = new C1245b();
                f15826a.a(c1245b2, (Collection<?>) next);
                c1245b.f27068a.add(new JsonArray(c1245b2.f27068a));
            } else if (next instanceof Map) {
                sa.p pVar = new sa.p();
                f15826a.a(pVar, (Map<?, ?>) next);
                c1245b.f27068a.add(new JsonObject(pVar.f27112a));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlinx.serialization.json.JsonElement r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.serialization.json.JsonNull
            r1 = 0
            if (r0 == 0) goto L7
            goto Lb2
        L7:
            boolean r0 = r7 instanceof kotlinx.serialization.json.JsonPrimitive
            if (r0 == 0) goto L9d
            kotlinx.serialization.json.JsonPrimitive r7 = (kotlinx.serialization.json.JsonPrimitive) r7
            boolean r0 = r7.isString()
            if (r0 == 0) goto L19
            java.lang.String r7 = r7.getContent()
        L17:
            r1 = r7
            goto L75
        L19:
            ra.D r0 = sa.h.f27103a
            ta.u r0 = new ta.u     // Catch: kotlinx.serialization.json.internal.JsonDecodingException -> L2d
            java.lang.String r2 = r7.getContent()     // Catch: kotlinx.serialization.json.internal.JsonDecodingException -> L2d
            r0.<init>(r2)     // Catch: kotlinx.serialization.json.internal.JsonDecodingException -> L2d
            long r2 = r0.h()     // Catch: kotlinx.serialization.json.internal.JsonDecodingException -> L2d
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: kotlinx.serialization.json.internal.JsonDecodingException -> L2d
            goto L2e
        L2d:
            r0 = r1
        L2e:
            if (r0 == 0) goto L48
            long r2 = r0.longValue()
            r4 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L48
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L48
            int r0 = (int) r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L49
        L48:
            r0 = r1
        L49:
            if (r0 != 0) goto L74
            ta.u r0 = new ta.u     // Catch: kotlinx.serialization.json.internal.JsonDecodingException -> L5c
            java.lang.String r2 = r7.getContent()     // Catch: kotlinx.serialization.json.internal.JsonDecodingException -> L5c
            r0.<init>(r2)     // Catch: kotlinx.serialization.json.internal.JsonDecodingException -> L5c
            long r2 = r0.h()     // Catch: kotlinx.serialization.json.internal.JsonDecodingException -> L5c
            java.lang.Long r1 = java.lang.Long.valueOf(r2)     // Catch: kotlinx.serialization.json.internal.JsonDecodingException -> L5c
        L5c:
            if (r1 != 0) goto L73
            java.lang.String r0 = r7.getContent()
            java.lang.Double r0 = ka.C0966k.R(r0)
            if (r0 != 0) goto L74
            java.lang.Boolean r0 = sa.h.c(r7)
            if (r0 != 0) goto L74
            java.lang.String r7 = r7.getContent()
            goto L17
        L73:
            r0 = r1
        L74:
            r1 = r0
        L75:
            boolean r7 = r1 instanceof java.lang.Double
            if (r7 == 0) goto Lb2
            r7 = r1
            java.lang.Number r7 = (java.lang.Number) r7
            double r2 = r7.doubleValue()
            r4 = 5183643170566569984(0x47efffffe0000000, double:3.4028234663852886E38)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto Lb2
            double r2 = r7.doubleValue()
            r4 = 3936146074321813504(0x36a0000000000000, double:1.401298464324817E-45)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto Lb2
            double r0 = r7.doubleValue()
            float r7 = (float) r0
            java.lang.Float r1 = java.lang.Float.valueOf(r7)
            goto Lb2
        L9d:
            boolean r0 = r7 instanceof kotlinx.serialization.json.JsonObject
            if (r0 == 0) goto La8
            kotlinx.serialization.json.JsonObject r7 = (kotlinx.serialization.json.JsonObject) r7
            java.util.Map r1 = r6.a(r7)
            goto Lb2
        La8:
            boolean r0 = r7 instanceof kotlinx.serialization.json.JsonArray
            if (r0 == 0) goto Lb2
            kotlinx.serialization.json.JsonArray r7 = (kotlinx.serialization.json.JsonArray) r7
            java.util.List r1 = r6.a(r7)
        Lb2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.serializer.c.a(kotlinx.serialization.json.JsonElement):java.lang.Object");
    }

    public final void a(sa.p pVar, Map<?, ?> map) {
        JsonElement lVar;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key instanceof String) {
                if (value instanceof String) {
                    JsonPrimitive b9 = h.b((String) value);
                } else if (value instanceof Number) {
                    JsonPrimitive a10 = h.a((Number) value);
                } else if (value instanceof Boolean) {
                    String str = (String) key;
                    Boolean bool = (Boolean) value;
                    C1165D c1165d = h.f27103a;
                    if (bool == null) {
                        lVar = JsonNull.INSTANCE;
                    } else {
                        lVar = new l(bool, false, null);
                    }
                } else if (value instanceof Collection) {
                    a aVar = new a(value);
                    C1245b c1245b = new C1245b();
                    aVar.invoke(c1245b);
                    JsonArray jsonArray = new JsonArray(c1245b.f27068a);
                } else if (value instanceof Map) {
                    b bVar = new b(value);
                    sa.p pVar2 = new sa.p();
                    bVar.invoke(pVar2);
                    JsonObject jsonObject = new JsonObject(pVar2.f27112a);
                }
            }
        }
    }

    public final List<Object> a(JsonArray jsonArray) {
        ArrayList arrayList = new ArrayList();
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            Object a10 = f15826a.a(it.next());
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }

    public final Map<String, Object> a(JsonObject jsonObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(z.n(jsonObject.size()));
        Iterator<T> it = jsonObject.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), f15826a.a((JsonElement) entry.getValue()));
        }
        return i.a((Map) linkedHashMap);
    }
}
