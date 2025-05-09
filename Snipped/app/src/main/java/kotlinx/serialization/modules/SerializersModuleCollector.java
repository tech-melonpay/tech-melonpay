package kotlinx.serialization.modules;

import ca.InterfaceC0646l;
import ia.InterfaceC0835c;
import java.util.List;
import na.InterfaceC1078b;

/* compiled from: SerializersModuleCollector.kt */
/* loaded from: classes2.dex */
public interface SerializersModuleCollector {

    /* compiled from: SerializersModuleCollector.kt */
    public static final class DefaultImpls {
        public static <T> void a(SerializersModuleCollector serializersModuleCollector, InterfaceC0835c<T> interfaceC0835c, final InterfaceC1078b<T> interfaceC1078b) {
            serializersModuleCollector.a(interfaceC0835c, new InterfaceC0646l<List<? extends InterfaceC1078b<?>>, InterfaceC1078b<?>>() { // from class: kotlinx.serialization.modules.SerializersModuleCollector$contextual$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // ca.InterfaceC0646l
                public final InterfaceC1078b<?> invoke(List<? extends InterfaceC1078b<?>> list) {
                    return interfaceC1078b;
                }
            });
        }
    }

    <T> void a(InterfaceC0835c<T> interfaceC0835c, InterfaceC0646l<? super List<? extends InterfaceC1078b<?>>, ? extends InterfaceC1078b<?>> interfaceC0646l);
}
