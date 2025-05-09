package n3;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import m3.C1026a;
import n3.p;
import r3.C1149a;

/* compiled from: MapTypeAdapterFactory.java */
/* loaded from: classes.dex */
public final class g implements com.google.gson.s {

    /* renamed from: a, reason: collision with root package name */
    public final C1026a f24123a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24124b;

    /* compiled from: MapTypeAdapterFactory.java */
    public final class a<K, V> extends com.google.gson.r<Map<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public final o f24125a;

        /* renamed from: b, reason: collision with root package name */
        public final o f24126b;

        /* renamed from: c, reason: collision with root package name */
        public final m3.i<? extends Map<K, V>> f24127c;

        public a(com.google.gson.g gVar, Type type, com.google.gson.r<K> rVar, Type type2, com.google.gson.r<V> rVar2, m3.i<? extends Map<K, V>> iVar) {
            this.f24125a = new o(gVar, rVar, type);
            this.f24126b = new o(gVar, rVar2, type2);
            this.f24127c = iVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.r
        public final Object a(C1149a c1149a) {
            JsonToken k02 = c1149a.k0();
            if (k02 == JsonToken.i) {
                c1149a.Y();
                return null;
            }
            Map<K, V> a10 = this.f24127c.a();
            if (k02 == JsonToken.f10410a) {
                c1149a.d();
                while (c1149a.G()) {
                    c1149a.d();
                    Object a11 = this.f24125a.f24171b.a(c1149a);
                    if (a10.put(a11, this.f24126b.f24171b.a(c1149a)) != null) {
                        throw new JsonSyntaxException(androidx.camera.core.impl.utils.a.j(a11, "duplicate key: "));
                    }
                    c1149a.y();
                }
                c1149a.y();
            } else {
                c1149a.i();
                while (c1149a.G()) {
                    Y8.a.f4121a.getClass();
                    if (c1149a instanceof e) {
                        e eVar = (e) c1149a;
                        eVar.w0(JsonToken.f10414e);
                        Map.Entry entry = (Map.Entry) ((Iterator) eVar.A0()).next();
                        eVar.C0(entry.getValue());
                        eVar.C0(new com.google.gson.o((String) entry.getKey()));
                    } else {
                        int i = c1149a.f26156h;
                        if (i == 0) {
                            i = c1149a.p();
                        }
                        if (i == 13) {
                            c1149a.f26156h = 9;
                        } else if (i == 12) {
                            c1149a.f26156h = 8;
                        } else {
                            if (i != 14) {
                                throw c1149a.v0("a name");
                            }
                            c1149a.f26156h = 10;
                        }
                    }
                    Object a12 = this.f24125a.f24171b.a(c1149a);
                    if (a10.put(a12, this.f24126b.f24171b.a(c1149a)) != null) {
                        throw new JsonSyntaxException(androidx.camera.core.impl.utils.a.j(a12, "duplicate key: "));
                    }
                }
                c1149a.A();
            }
            return a10;
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, Object obj) {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                bVar.E();
                return;
            }
            boolean z10 = g.this.f24124b;
            o oVar = this.f24126b;
            if (!z10) {
                bVar.j();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    bVar.C(String.valueOf(entry.getKey()));
                    oVar.b(bVar, entry.getValue());
                }
                bVar.A();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i = 0;
            boolean z11 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                K key = entry2.getKey();
                o oVar2 = this.f24125a;
                oVar2.getClass();
                try {
                    f fVar = new f();
                    oVar2.b(fVar, key);
                    ArrayList arrayList3 = fVar.f24120o;
                    if (!arrayList3.isEmpty()) {
                        throw new IllegalStateException("Expected one JSON element but was " + arrayList3);
                    }
                    com.google.gson.l lVar = fVar.f24122q;
                    arrayList.add(lVar);
                    arrayList2.add(entry2.getValue());
                    lVar.getClass();
                    z11 |= (lVar instanceof com.google.gson.j) || (lVar instanceof com.google.gson.n);
                } catch (IOException e10) {
                    throw new JsonIOException(e10);
                }
            }
            if (z11) {
                bVar.i();
                int size = arrayList.size();
                while (i < size) {
                    bVar.i();
                    com.google.gson.l lVar2 = (com.google.gson.l) arrayList.get(i);
                    p.f24174B.getClass();
                    p.t.d(lVar2, bVar);
                    oVar.b(bVar, arrayList2.get(i));
                    bVar.y();
                    i++;
                }
                bVar.y();
                return;
            }
            bVar.j();
            int size2 = arrayList.size();
            while (i < size2) {
                com.google.gson.l lVar3 = (com.google.gson.l) arrayList.get(i);
                lVar3.getClass();
                boolean z12 = lVar3 instanceof com.google.gson.o;
                if (z12) {
                    if (!z12) {
                        throw new IllegalStateException("Not a JSON Primitive: " + lVar3);
                    }
                    com.google.gson.o oVar3 = (com.google.gson.o) lVar3;
                    Serializable serializable = oVar3.f10409a;
                    if (serializable instanceof Number) {
                        str = String.valueOf(oVar3.f());
                    } else if (serializable instanceof Boolean) {
                        str = Boolean.toString(oVar3.c());
                    } else {
                        if (!(serializable instanceof String)) {
                            throw new AssertionError();
                        }
                        str = oVar3.a();
                    }
                } else {
                    if (!(lVar3 instanceof com.google.gson.m)) {
                        throw new AssertionError();
                    }
                    str = "null";
                }
                bVar.C(str);
                oVar.b(bVar, arrayList2.get(i));
                i++;
            }
            bVar.A();
        }
    }

    public g(C1026a c1026a, boolean z10) {
        this.f24123a = c1026a;
        this.f24124b = z10;
    }

    @Override // com.google.gson.s
    public final <T> com.google.gson.r<T> a(com.google.gson.g gVar, TypeToken<T> typeToken) {
        Type[] actualTypeArguments;
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            j3.e.c(Map.class.isAssignableFrom(rawType));
            Type h9 = C$Gson$Types.h(type, rawType, C$Gson$Types.e(type, rawType, Map.class), new HashMap());
            actualTypeArguments = h9 instanceof ParameterizedType ? ((ParameterizedType) h9).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        return new a(gVar, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? p.f24179c : gVar.d(TypeToken.get(type2)), actualTypeArguments[1], gVar.d(TypeToken.get(actualTypeArguments[1])), this.f24123a.b(typeToken));
    }
}
