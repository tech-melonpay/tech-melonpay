package kotlinx.serialization.modules;

import ca.InterfaceC0646l;
import ia.InterfaceC0835c;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlinx.serialization.modules.a;
import na.InterfaceC1078b;

/* compiled from: SerializersModuleBuilders.kt */
/* loaded from: classes2.dex */
public final class c implements SerializersModuleCollector {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f23424a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f23425b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f23426c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f23427d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f23428e = new HashMap();

    public static void c(c cVar, InterfaceC0835c interfaceC0835c, a aVar) {
        HashMap hashMap = cVar.f23424a;
        a aVar2 = (a) hashMap.get(interfaceC0835c);
        if (aVar2 == null || f.b(aVar2, aVar)) {
            hashMap.put(interfaceC0835c, aVar);
            return;
        }
        throw new SerializerAlreadyRegisteredException("Contextual serializer or serializer provider for " + interfaceC0835c + " already registered in this module");
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final <T> void a(InterfaceC0835c<T> interfaceC0835c, InterfaceC0646l<? super List<? extends InterfaceC1078b<?>>, ? extends InterfaceC1078b<?>> interfaceC0646l) {
        c(this, interfaceC0835c, new a.b(interfaceC0646l));
    }

    public final <T> void b(InterfaceC0835c<T> interfaceC0835c, InterfaceC1078b<T> interfaceC1078b) {
        c(this, interfaceC0835c, new a.C0426a(interfaceC1078b));
    }
}
