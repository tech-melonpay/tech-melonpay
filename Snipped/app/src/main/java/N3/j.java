package n3;

import com.google.gson.ToNumberPolicy;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonToken;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import r3.C1149a;

/* compiled from: ObjectTypeAdapter.java */
/* loaded from: classes.dex */
public final class j extends com.google.gson.r<Object> {

    /* renamed from: c, reason: collision with root package name */
    public static final h f24133c = new h(ToNumberPolicy.f10317a, 1);

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.g f24134a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.gson.q f24135b;

    public j(com.google.gson.g gVar, com.google.gson.q qVar) {
        this.f24134a = gVar;
        this.f24135b = qVar;
    }

    @Override // com.google.gson.r
    public final Object a(C1149a c1149a) {
        Object arrayList;
        Serializable arrayList2;
        JsonToken k02 = c1149a.k0();
        int ordinal = k02.ordinal();
        if (ordinal == 0) {
            c1149a.d();
            arrayList = new ArrayList();
        } else if (ordinal != 2) {
            arrayList = null;
        } else {
            c1149a.i();
            arrayList = new LinkedTreeMap();
        }
        if (arrayList == null) {
            return c(c1149a, k02);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c1149a.G()) {
                String V = arrayList instanceof Map ? c1149a.V() : null;
                JsonToken k03 = c1149a.k0();
                int ordinal2 = k03.ordinal();
                if (ordinal2 == 0) {
                    c1149a.d();
                    arrayList2 = new ArrayList();
                } else if (ordinal2 != 2) {
                    arrayList2 = null;
                } else {
                    c1149a.i();
                    arrayList2 = new LinkedTreeMap();
                }
                boolean z10 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = c(c1149a, k03);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(V, arrayList2);
                }
                if (z10) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    c1149a.y();
                } else {
                    c1149a.A();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.r
    public final void b(r3.b bVar, Object obj) {
        if (obj == null) {
            bVar.E();
            return;
        }
        Class<?> cls = obj.getClass();
        com.google.gson.g gVar = this.f24134a;
        gVar.getClass();
        com.google.gson.r d10 = gVar.d(TypeToken.get((Class) cls));
        if (!(d10 instanceof j)) {
            d10.b(bVar, obj);
        } else {
            bVar.j();
            bVar.A();
        }
    }

    public final Serializable c(C1149a c1149a, JsonToken jsonToken) {
        int ordinal = jsonToken.ordinal();
        if (ordinal == 5) {
            return c1149a.d0();
        }
        if (ordinal == 6) {
            return this.f24135b.a(c1149a);
        }
        if (ordinal == 7) {
            return Boolean.valueOf(c1149a.N());
        }
        if (ordinal == 8) {
            c1149a.Y();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }
}
