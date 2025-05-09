package kotlinx.serialization.internal;

import O9.p;
import ca.InterfaceC0646l;
import kotlin.Pair;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import na.InterfaceC1078b;
import pa.C1123a;
import pa.f;
import ra.J;

/* compiled from: Tuples.kt */
/* loaded from: classes2.dex */
public final class PairSerializer<K, V> extends J<K, V, Pair<? extends K, ? extends V>> {

    /* renamed from: c, reason: collision with root package name */
    public final SerialDescriptorImpl f23332c;

    public PairSerializer(final InterfaceC1078b<K> interfaceC1078b, final InterfaceC1078b<V> interfaceC1078b2) {
        super(interfaceC1078b, interfaceC1078b2);
        this.f23332c = kotlinx.serialization.descriptors.a.b("kotlin.Pair", new f[0], new InterfaceC0646l<C1123a, p>() { // from class: kotlinx.serialization.internal.PairSerializer$descriptor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // ca.InterfaceC0646l
            public final p invoke(C1123a c1123a) {
                C1123a c1123a2 = c1123a;
                C1123a.a(c1123a2, "first", interfaceC1078b.getDescriptor());
                C1123a.a(c1123a2, "second", interfaceC1078b2.getDescriptor());
                return p.f3034a;
            }
        });
    }

    @Override // ra.J
    public final Object a(Object obj) {
        return ((Pair) obj).f23089a;
    }

    @Override // ra.J
    public final Object b(Object obj) {
        return ((Pair) obj).f23090b;
    }

    @Override // ra.J
    public final Object c(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final f getDescriptor() {
        return this.f23332c;
    }
}
