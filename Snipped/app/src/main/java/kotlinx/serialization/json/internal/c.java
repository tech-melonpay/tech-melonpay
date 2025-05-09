package kotlinx.serialization.json.internal;

import P9.q;
import P9.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.h;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.a;
import pa.C1124b;
import pa.f;
import pa.g;
import qa.InterfaceC1142b;
import ra.C1165D;
import ra.a0;
import sa.AbstractC1244a;
import ta.AbstractC1493a;

/* compiled from: TreeJsonDecoder.kt */
/* loaded from: classes2.dex */
public class c extends AbstractC1493a {

    /* renamed from: e, reason: collision with root package name */
    public final JsonObject f23408e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23409f;

    /* renamed from: g, reason: collision with root package name */
    public final f f23410g;

    /* renamed from: h, reason: collision with root package name */
    public int f23411h;
    public boolean i;

    public c(AbstractC1244a abstractC1244a, JsonObject jsonObject, String str, f fVar) {
        super(abstractC1244a, jsonObject);
        this.f23408e = jsonObject;
        this.f23409f = str;
        this.f23410g = fVar;
    }

    @Override // ra.U
    public String S(f fVar, int i) {
        AbstractC1244a abstractC1244a = this.f29974c;
        b.d(fVar, abstractC1244a);
        String g10 = fVar.g(i);
        if (!this.f29975d.f27099l) {
            return g10;
        }
        if (W().keySet().contains(g10)) {
            return g10;
        }
        a.C0425a<Map<String, Integer>> c0425a = b.f23407a;
        JsonNamesMapKt$deserializationNamesMap$1 jsonNamesMapKt$deserializationNamesMap$1 = new JsonNamesMapKt$deserializationNamesMap$1(fVar, abstractC1244a);
        ConcurrentHashMap concurrentHashMap = abstractC1244a.f27067c.f23406a;
        Map map = (Map) concurrentHashMap.get(fVar);
        Object obj = null;
        Object obj2 = map != null ? map.get(c0425a) : null;
        if (obj2 == null) {
            obj2 = null;
        }
        if (obj2 == null) {
            obj2 = jsonNamesMapKt$deserializationNamesMap$1.invoke();
            Object obj3 = concurrentHashMap.get(fVar);
            if (obj3 == null) {
                obj3 = new ConcurrentHashMap(2);
                concurrentHashMap.put(fVar, obj3);
            }
            ((Map) obj3).put(c0425a, obj2);
        }
        Map map2 = (Map) obj2;
        Iterator<T> it = W().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Integer num = (Integer) map2.get((String) next);
            if (num != null && num.intValue() == i) {
                obj = next;
                break;
            }
        }
        String str = (String) obj;
        return str != null ? str : g10;
    }

    @Override // ta.AbstractC1493a
    public JsonElement T(String str) {
        return (JsonElement) kotlin.collections.a.q(W(), str);
    }

    @Override // ta.AbstractC1493a
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public JsonObject W() {
        return this.f23408e;
    }

    @Override // ta.AbstractC1493a, qa.InterfaceC1142b
    public void b(f fVar) {
        Set set;
        sa.f fVar2 = this.f29975d;
        if (fVar2.f27090b || (fVar.e() instanceof pa.d)) {
            return;
        }
        AbstractC1244a abstractC1244a = this.f29974c;
        b.d(fVar, abstractC1244a);
        if (fVar2.f27099l) {
            Set b9 = a0.b(fVar);
            a aVar = abstractC1244a.f27067c;
            a.C0425a<Map<String, Integer>> c0425a = b.f23407a;
            Map map = (Map) aVar.f23406a.get(fVar);
            Object obj = map != null ? map.get(c0425a) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set keySet = map2 != null ? map2.keySet() : null;
            if (keySet == null) {
                keySet = EmptySet.f23106a;
            }
            Set set2 = keySet;
            Integer valueOf = set2 instanceof Collection ? Integer.valueOf(set2.size()) : null;
            LinkedHashSet linkedHashSet = new LinkedHashSet(z.n(valueOf != null ? b9.size() + valueOf.intValue() : b9.size() * 2));
            linkedHashSet.addAll(b9);
            q.x(linkedHashSet, set2);
            set = linkedHashSet;
        } else {
            set = a0.b(fVar);
        }
        for (String str : W().keySet()) {
            if (!set.contains(str) && !kotlin.jvm.internal.f.b(str, this.f23409f)) {
                String jsonObject = W().toString();
                StringBuilder m2 = com.google.android.gms.measurement.internal.a.m("Encountered an unknown key '", str, "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                m2.append((Object) C1124b.E(-1, jsonObject));
                throw C1124b.f(-1, m2.toString());
            }
        }
    }

    @Override // ta.AbstractC1493a, qa.InterfaceC1144d
    public final InterfaceC1142b c(f fVar) {
        f fVar2 = this.f23410g;
        if (fVar != fVar2) {
            return super.c(fVar);
        }
        JsonElement U = U();
        if (U instanceof JsonObject) {
            return new c(this.f29974c, (JsonObject) U, this.f23409f, fVar2);
        }
        throw C1124b.f(-1, "Expected " + h.a(JsonObject.class) + " as the serialized body of " + fVar2.a() + ", but had " + h.a(U.getClass()));
    }

    @Override // qa.InterfaceC1142b
    public int q(f fVar) {
        while (this.f23411h < fVar.f()) {
            int i = this.f23411h;
            this.f23411h = i + 1;
            String S = S(fVar, i);
            int i9 = this.f23411h - 1;
            boolean z10 = false;
            this.i = false;
            boolean containsKey = W().containsKey((Object) S);
            AbstractC1244a abstractC1244a = this.f29974c;
            if (!containsKey) {
                if (!abstractC1244a.f27065a.f27094f && !fVar.j(i9) && fVar.i(i9).c()) {
                    z10 = true;
                }
                this.i = z10;
                if (!z10) {
                    continue;
                }
            }
            if (this.f29975d.f27096h && fVar.j(i9)) {
                f i10 = fVar.i(i9);
                if (i10.c() || !(T(S) instanceof JsonNull)) {
                    if (kotlin.jvm.internal.f.b(i10.e(), g.b.f25740a) && (!i10.c() || !(T(S) instanceof JsonNull))) {
                        JsonElement T = T(S);
                        String str = null;
                        JsonPrimitive jsonPrimitive = T instanceof JsonPrimitive ? (JsonPrimitive) T : null;
                        if (jsonPrimitive != null) {
                            C1165D c1165d = sa.h.f27103a;
                            if (!(jsonPrimitive instanceof JsonNull)) {
                                str = jsonPrimitive.getContent();
                            }
                        }
                        if (str != null && b.b(i10, abstractC1244a, str) == -3) {
                        }
                    }
                }
            }
            return i9;
        }
        return -1;
    }

    @Override // ta.AbstractC1493a, qa.InterfaceC1144d
    public final boolean t() {
        return !this.i && super.t();
    }
}
