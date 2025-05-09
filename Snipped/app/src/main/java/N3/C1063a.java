package n3;

import com.google.gson.internal.C$Gson$Types;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonToken;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import r3.C1149a;

/* compiled from: ArrayTypeAdapter.java */
/* renamed from: n3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1063a<E> extends com.google.gson.r<Object> {

    /* renamed from: c, reason: collision with root package name */
    public static final C0434a f24098c = new C0434a();

    /* renamed from: a, reason: collision with root package name */
    public final Class<E> f24099a;

    /* renamed from: b, reason: collision with root package name */
    public final o f24100b;

    /* compiled from: ArrayTypeAdapter.java */
    /* renamed from: n3.a$a, reason: collision with other inner class name */
    public class C0434a implements com.google.gson.s {
        @Override // com.google.gson.s
        public final <T> com.google.gson.r<T> a(com.google.gson.g gVar, TypeToken<T> typeToken) {
            Type type = typeToken.getType();
            boolean z10 = type instanceof GenericArrayType;
            if (!z10 && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z10 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new C1063a(gVar, gVar.d(TypeToken.get(genericComponentType)), C$Gson$Types.f(genericComponentType));
        }
    }

    public C1063a(com.google.gson.g gVar, com.google.gson.r<E> rVar, Class<E> cls) {
        this.f24100b = new o(gVar, rVar, cls);
        this.f24099a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.r
    public final Object a(C1149a c1149a) {
        if (c1149a.k0() == JsonToken.i) {
            c1149a.Y();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c1149a.d();
        while (c1149a.G()) {
            arrayList.add(this.f24100b.f24171b.a(c1149a));
        }
        c1149a.y();
        int size = arrayList.size();
        Class<E> cls = this.f24099a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object newInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    @Override // com.google.gson.r
    public final void b(r3.b bVar, Object obj) {
        if (obj == null) {
            bVar.E();
            return;
        }
        bVar.i();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f24100b.b(bVar, Array.get(obj, i));
        }
        bVar.y();
    }
}
