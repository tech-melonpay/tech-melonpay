package kotlinx.serialization;

import O9.p;
import androidx.camera.core.n;
import ca.InterfaceC0646l;
import ia.InterfaceC0835c;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.EmptyList;
import na.InterfaceC1078b;
import pa.C1123a;
import pa.f;
import pa.g;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

/* compiled from: ContextualSerializer.kt */
/* loaded from: classes2.dex */
public final class a<T> implements InterfaceC1078b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0835c<T> f23284a;

    /* renamed from: b, reason: collision with root package name */
    public final List<InterfaceC1078b<?>> f23285b;

    /* renamed from: c, reason: collision with root package name */
    public final pa.c f23286c;

    public a(kotlin.jvm.internal.b bVar, InterfaceC1078b[] interfaceC1078bArr) {
        this.f23284a = bVar;
        this.f23285b = Arrays.asList(interfaceC1078bArr);
        this.f23286c = new pa.c(kotlinx.serialization.descriptors.a.c("kotlinx.serialization.ContextualSerializer", g.a.f25739a, new f[0], new InterfaceC0646l<C1123a, p>(this) { // from class: kotlinx.serialization.ContextualSerializer$descriptor$1

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ a<Object> f23265l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f23265l = this;
            }

            @Override // ca.InterfaceC0646l
            public final p invoke(C1123a c1123a) {
                this.f23265l.getClass();
                c1123a.f25719b = EmptyList.f23104a;
                return p.f3034a;
            }
        }), bVar);
    }

    @Override // na.InterfaceC1077a
    public final T deserialize(InterfaceC1144d interfaceC1144d) {
        Y8.a a10 = interfaceC1144d.a();
        List<InterfaceC1078b<?>> list = this.f23285b;
        InterfaceC0835c<T> interfaceC0835c = this.f23284a;
        InterfaceC1078b c2 = a10.c(interfaceC0835c, list);
        if (c2 != null) {
            return (T) interfaceC1144d.x(c2);
        }
        String d10 = interfaceC0835c.d();
        if (d10 == null) {
            d10 = "<local class name not available>";
        }
        throw new SerializationException(n.a("Serializer for class '", d10, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final f getDescriptor() {
        return this.f23286c;
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, T t3) {
        Y8.a a10 = interfaceC1145e.a();
        List<InterfaceC1078b<?>> list = this.f23285b;
        InterfaceC0835c<T> interfaceC0835c = this.f23284a;
        InterfaceC1078b c2 = a10.c(interfaceC0835c, list);
        if (c2 != null) {
            interfaceC1145e.s(c2, t3);
            return;
        }
        String d10 = interfaceC0835c.d();
        if (d10 == null) {
            d10 = "<local class name not available>";
        }
        throw new SerializationException(n.a("Serializer for class '", d10, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }
}
