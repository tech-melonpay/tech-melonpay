package n3;

import com.google.gson.reflect.TypeToken;
import java.util.concurrent.ConcurrentHashMap;
import l3.InterfaceC0983a;
import m3.C1026a;

/* compiled from: JsonAdapterAnnotationTypeAdapterFactory.java */
/* loaded from: classes.dex */
public final class d implements com.google.gson.s {

    /* renamed from: c, reason: collision with root package name */
    public static final a f24109c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f24110d;

    /* renamed from: a, reason: collision with root package name */
    public final C1026a f24111a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f24112b = new ConcurrentHashMap();

    /* compiled from: JsonAdapterAnnotationTypeAdapterFactory.java */
    public static class a implements com.google.gson.s {
        private a() {
        }

        @Override // com.google.gson.s
        public final <T> com.google.gson.r<T> a(com.google.gson.g gVar, TypeToken<T> typeToken) {
            throw new AssertionError("Factory should not be used");
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    static {
        int i = 0;
        f24109c = new a(i);
        f24110d = new a(i);
    }

    public d(C1026a c1026a) {
        this.f24111a = c1026a;
    }

    @Override // com.google.gson.s
    public final <T> com.google.gson.r<T> a(com.google.gson.g gVar, TypeToken<T> typeToken) {
        InterfaceC0983a interfaceC0983a = (InterfaceC0983a) typeToken.getRawType().getAnnotation(InterfaceC0983a.class);
        if (interfaceC0983a == null) {
            return null;
        }
        return (com.google.gson.r<T>) b(this.f24111a, gVar, typeToken, interfaceC0983a, true);
    }

    public final com.google.gson.r<?> b(C1026a c1026a, com.google.gson.g gVar, TypeToken<?> typeToken, InterfaceC0983a interfaceC0983a, boolean z10) {
        com.google.gson.r<?> nVar;
        Object a10 = c1026a.b(TypeToken.get((Class) interfaceC0983a.value())).a();
        boolean nullSafe = interfaceC0983a.nullSafe();
        if (a10 instanceof com.google.gson.r) {
            nVar = (com.google.gson.r) a10;
        } else if (a10 instanceof com.google.gson.s) {
            com.google.gson.s sVar = (com.google.gson.s) a10;
            if (z10) {
                com.google.gson.s sVar2 = (com.google.gson.s) this.f24112b.putIfAbsent(typeToken.getRawType(), sVar);
                if (sVar2 != null) {
                    sVar = sVar2;
                }
            }
            nVar = sVar.a(gVar, typeToken);
        } else {
            boolean z11 = a10 instanceof com.google.gson.p;
            if (!z11 && !(a10 instanceof com.google.gson.k)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a10.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            nVar = new n<>(z11 ? (com.google.gson.p) a10 : null, a10 instanceof com.google.gson.k ? (com.google.gson.k) a10 : null, gVar, typeToken, z10 ? f24109c : f24110d, nullSafe);
            nullSafe = false;
        }
        return (nVar == null || !nullSafe) ? nVar : new com.google.gson.f(nVar, 2);
    }
}
