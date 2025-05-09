package n3;

import com.google.gson.internal.C$Gson$Types;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import m3.C1026a;
import r3.C1149a;

/* compiled from: CollectionTypeAdapterFactory.java */
/* renamed from: n3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1064b implements com.google.gson.s {

    /* renamed from: a, reason: collision with root package name */
    public final C1026a f24101a;

    /* compiled from: CollectionTypeAdapterFactory.java */
    /* renamed from: n3.b$a */
    public static final class a<E> extends com.google.gson.r<Collection<E>> {

        /* renamed from: a, reason: collision with root package name */
        public final o f24102a;

        /* renamed from: b, reason: collision with root package name */
        public final m3.i<? extends Collection<E>> f24103b;

        public a(com.google.gson.g gVar, Type type, com.google.gson.r<E> rVar, m3.i<? extends Collection<E>> iVar) {
            this.f24102a = new o(gVar, rVar, type);
            this.f24103b = iVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.r
        public final Object a(C1149a c1149a) {
            if (c1149a.k0() == JsonToken.i) {
                c1149a.Y();
                return null;
            }
            Collection<E> a10 = this.f24103b.a();
            c1149a.d();
            while (c1149a.G()) {
                a10.add(this.f24102a.f24171b.a(c1149a));
            }
            c1149a.y();
            return a10;
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, Object obj) {
            Collection collection = (Collection) obj;
            if (collection == null) {
                bVar.E();
                return;
            }
            bVar.i();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f24102a.b(bVar, it.next());
            }
            bVar.y();
        }
    }

    public C1064b(C1026a c1026a) {
        this.f24101a = c1026a;
    }

    @Override // com.google.gson.s
    public final <T> com.google.gson.r<T> a(com.google.gson.g gVar, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        j3.e.c(Collection.class.isAssignableFrom(rawType));
        Type h9 = C$Gson$Types.h(type, rawType, C$Gson$Types.e(type, rawType, Collection.class), new HashMap());
        Class cls = h9 instanceof ParameterizedType ? ((ParameterizedType) h9).getActualTypeArguments()[0] : Object.class;
        return new a(gVar, cls, gVar.d(TypeToken.get(cls)), this.f24101a.b(typeToken));
    }
}
