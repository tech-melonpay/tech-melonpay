package n3;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import r3.C1149a;

/* compiled from: TypeAdapters.java */
/* loaded from: classes.dex */
public final class s implements com.google.gson.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f24213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.r f24214b;

    /* compiled from: TypeAdapters.java */
    public class a extends com.google.gson.r<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f24215a;

        public a(Class cls) {
            this.f24215a = cls;
        }

        @Override // com.google.gson.r
        public final Object a(C1149a c1149a) {
            Object a10 = s.this.f24214b.a(c1149a);
            if (a10 != null) {
                Class cls = this.f24215a;
                if (!cls.isInstance(a10)) {
                    throw new JsonSyntaxException("Expected a " + cls.getName() + " but was " + a10.getClass().getName() + "; at path " + c1149a.E());
                }
            }
            return a10;
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, Object obj) {
            s.this.f24214b.b(bVar, obj);
        }
    }

    public s(Class cls, com.google.gson.r rVar) {
        this.f24213a = cls;
        this.f24214b = rVar;
    }

    @Override // com.google.gson.s
    public final <T2> com.google.gson.r<T2> a(com.google.gson.g gVar, TypeToken<T2> typeToken) {
        Class<? super T2> rawType = typeToken.getRawType();
        if (this.f24213a.isAssignableFrom(rawType)) {
            return new a(rawType);
        }
        return null;
    }

    public final String toString() {
        return "Factory[typeHierarchy=" + this.f24213a.getName() + ",adapter=" + this.f24214b + "]";
    }
}
