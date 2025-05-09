package kotlinx.serialization.modules;

import ca.InterfaceC0646l;
import ia.InterfaceC0835c;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;
import kotlinx.serialization.modules.SerializersModuleCollector;
import kotlinx.serialization.modules.a;
import na.InterfaceC1077a;
import na.InterfaceC1078b;
import na.InterfaceC1081e;
import ta.q;

/* compiled from: SerializersModule.kt */
/* loaded from: classes2.dex */
public final class b extends Y8.a {

    /* renamed from: b, reason: collision with root package name */
    public final Map<InterfaceC0835c<?>, a> f23419b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<InterfaceC0835c<?>, Map<InterfaceC0835c<?>, InterfaceC1078b<?>>> f23420c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<InterfaceC0835c<?>, InterfaceC0646l<?, InterfaceC1081e<?>>> f23421d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<InterfaceC0835c<?>, Map<String, InterfaceC1078b<?>>> f23422e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<InterfaceC0835c<?>, InterfaceC0646l<String, InterfaceC1077a<?>>> f23423f;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Map<InterfaceC0835c<?>, ? extends a> map, Map<InterfaceC0835c<?>, ? extends Map<InterfaceC0835c<?>, ? extends InterfaceC1078b<?>>> map2, Map<InterfaceC0835c<?>, ? extends InterfaceC0646l<?, ? extends InterfaceC1081e<?>>> map3, Map<InterfaceC0835c<?>, ? extends Map<String, ? extends InterfaceC1078b<?>>> map4, Map<InterfaceC0835c<?>, ? extends InterfaceC0646l<? super String, ? extends InterfaceC1077a<?>>> map5) {
        this.f23419b = map;
        this.f23420c = map2;
        this.f23421d = map3;
        this.f23422e = map4;
        this.f23423f = map5;
    }

    @Override // Y8.a
    public final void b(q qVar) {
        for (Map.Entry<InterfaceC0835c<?>, a> entry : this.f23419b.entrySet()) {
            InterfaceC0835c<?> key = entry.getKey();
            a value = entry.getValue();
            if (value instanceof a.C0426a) {
                SerializersModuleCollector.DefaultImpls.a(qVar, key, ((a.C0426a) value).f23417a);
            } else if (value instanceof a.b) {
                InterfaceC0646l<List<? extends InterfaceC1078b<?>>, InterfaceC1078b<?>> interfaceC0646l = ((a.b) value).f23418a;
            }
        }
        for (Map.Entry<InterfaceC0835c<?>, Map<InterfaceC0835c<?>, InterfaceC1078b<?>>> entry2 : this.f23420c.entrySet()) {
            InterfaceC0835c<?> key2 = entry2.getKey();
            for (Map.Entry<InterfaceC0835c<?>, InterfaceC1078b<?>> entry3 : entry2.getValue().entrySet()) {
                qVar.b(key2, entry3.getKey(), entry3.getValue());
            }
        }
        for (Map.Entry<InterfaceC0835c<?>, InterfaceC0646l<?, InterfaceC1081e<?>>> entry4 : this.f23421d.entrySet()) {
            entry4.getKey();
            j.c(1, entry4.getValue());
        }
        for (Map.Entry<InterfaceC0835c<?>, InterfaceC0646l<String, InterfaceC1077a<?>>> entry5 : this.f23423f.entrySet()) {
            entry5.getKey();
            j.c(1, entry5.getValue());
        }
    }

    @Override // Y8.a
    public final <T> InterfaceC1078b<T> c(InterfaceC0835c<T> interfaceC0835c, List<? extends InterfaceC1078b<?>> list) {
        a aVar = this.f23419b.get(interfaceC0835c);
        InterfaceC1078b<?> a10 = aVar != null ? aVar.a(list) : null;
        if (a10 instanceof InterfaceC1078b) {
            return (InterfaceC1078b<T>) a10;
        }
        return null;
    }

    @Override // Y8.a
    public final <T> InterfaceC1077a<T> d(InterfaceC0835c<? super T> interfaceC0835c, String str) {
        Map<String, InterfaceC1078b<?>> map = this.f23422e.get(interfaceC0835c);
        InterfaceC1078b<?> interfaceC1078b = map != null ? map.get(str) : null;
        if (!(interfaceC1078b instanceof InterfaceC1078b)) {
            interfaceC1078b = null;
        }
        if (interfaceC1078b != null) {
            return interfaceC1078b;
        }
        InterfaceC0646l<String, InterfaceC1077a<?>> interfaceC0646l = this.f23423f.get(interfaceC0835c);
        InterfaceC0646l<String, InterfaceC1077a<?>> interfaceC0646l2 = j.d(1, interfaceC0646l) ? interfaceC0646l : null;
        if (interfaceC0646l2 != null) {
            return (InterfaceC1077a) interfaceC0646l2.invoke(str);
        }
        return null;
    }

    @Override // Y8.a
    public final <T> InterfaceC1081e<T> e(InterfaceC0835c<? super T> interfaceC0835c, T t3) {
        if (!interfaceC0835c.f(t3)) {
            return null;
        }
        Map<InterfaceC0835c<?>, InterfaceC1078b<?>> map = this.f23420c.get(interfaceC0835c);
        InterfaceC1078b<?> interfaceC1078b = map != null ? map.get(h.a(t3.getClass())) : null;
        if (!(interfaceC1078b instanceof InterfaceC1081e)) {
            interfaceC1078b = null;
        }
        if (interfaceC1078b != null) {
            return interfaceC1078b;
        }
        InterfaceC0646l<?, InterfaceC1081e<?>> interfaceC0646l = this.f23421d.get(interfaceC0835c);
        InterfaceC0646l<?, InterfaceC1081e<?>> interfaceC0646l2 = j.d(1, interfaceC0646l) ? interfaceC0646l : null;
        if (interfaceC0646l2 != null) {
            return (InterfaceC1081e) interfaceC0646l2.invoke(t3);
        }
        return null;
    }
}
