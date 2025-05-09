package ta;

import ca.InterfaceC0646l;
import ia.InterfaceC0835c;
import java.util.List;
import kotlinx.serialization.descriptors.b;
import kotlinx.serialization.modules.SerializersModuleCollector;
import na.InterfaceC1078b;
import pa.g;

/* compiled from: PolymorphismValidator.kt */
/* loaded from: classes2.dex */
public final class q implements SerializersModuleCollector {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f30005a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30006b;

    public q(boolean z10, String str) {
        this.f30005a = z10;
        this.f30006b = str;
    }

    public final <Base, Sub extends Base> void b(InterfaceC0835c<Base> interfaceC0835c, InterfaceC0835c<Sub> interfaceC0835c2, InterfaceC1078b<Sub> interfaceC1078b) {
        pa.f descriptor = interfaceC1078b.getDescriptor();
        pa.g e10 = descriptor.e();
        if ((e10 instanceof pa.d) || kotlin.jvm.internal.f.b(e10, g.a.f25739a)) {
            throw new IllegalArgumentException("Serializer for " + interfaceC0835c2.d() + " can't be registered as a subclass for polymorphic serialization because its kind " + e10 + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        boolean z10 = this.f30005a;
        if (!z10 && (kotlin.jvm.internal.f.b(e10, b.C0424b.f23310a) || kotlin.jvm.internal.f.b(e10, b.c.f23311a) || (e10 instanceof pa.e) || (e10 instanceof g.b))) {
            throw new IllegalArgumentException("Serializer for " + interfaceC0835c2.d() + " of kind " + e10 + " cannot be serialized polymorphically with class discriminator.");
        }
        if (z10) {
            return;
        }
        int f10 = descriptor.f();
        for (int i = 0; i < f10; i++) {
            String g10 = descriptor.g(i);
            if (kotlin.jvm.internal.f.b(g10, this.f30006b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + interfaceC0835c2 + " has property '" + g10 + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final <T> void a(InterfaceC0835c<T> interfaceC0835c, InterfaceC0646l<? super List<? extends InterfaceC1078b<?>>, ? extends InterfaceC1078b<?>> interfaceC0646l) {
    }
}
