package kotlinx.serialization.internal;

import O9.p;
import ca.InterfaceC0646l;
import da.InterfaceC0701a;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.b;
import na.InterfaceC1078b;
import pa.C1123a;
import ra.J;

/* compiled from: Tuples.kt */
/* loaded from: classes2.dex */
public final class MapEntrySerializer<K, V> extends J<K, V, Map.Entry<? extends K, ? extends V>> {

    /* renamed from: c, reason: collision with root package name */
    public final SerialDescriptorImpl f23324c;

    /* compiled from: Tuples.kt */
    public static final class a<K, V> implements Map.Entry<K, V>, InterfaceC0701a {

        /* renamed from: a, reason: collision with root package name */
        public final K f23325a;

        /* renamed from: b, reason: collision with root package name */
        public final V f23326b;

        public a(K k3, V v10) {
            this.f23325a = k3;
            this.f23326b = v10;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return f.b(this.f23325a, aVar.f23325a) && f.b(this.f23326b, aVar.f23326b);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f23325a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f23326b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k3 = this.f23325a;
            int hashCode = (k3 == null ? 0 : k3.hashCode()) * 31;
            V v10 = this.f23326b;
            return hashCode + (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final String toString() {
            return "MapEntry(key=" + this.f23325a + ", value=" + this.f23326b + ')';
        }
    }

    public MapEntrySerializer(final InterfaceC1078b<K> interfaceC1078b, final InterfaceC1078b<V> interfaceC1078b2) {
        super(interfaceC1078b, interfaceC1078b2);
        this.f23324c = kotlinx.serialization.descriptors.a.c("kotlin.collections.Map.Entry", b.c.f23311a, new pa.f[0], new InterfaceC0646l<C1123a, p>() { // from class: kotlinx.serialization.internal.MapEntrySerializer$descriptor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // ca.InterfaceC0646l
            public final p invoke(C1123a c1123a) {
                C1123a c1123a2 = c1123a;
                C1123a.a(c1123a2, "key", interfaceC1078b.getDescriptor());
                C1123a.a(c1123a2, "value", interfaceC1078b2.getDescriptor());
                return p.f3034a;
            }
        });
    }

    @Override // ra.J
    public final Object a(Object obj) {
        return ((Map.Entry) obj).getKey();
    }

    @Override // ra.J
    public final Object b(Object obj) {
        return ((Map.Entry) obj).getValue();
    }

    @Override // ra.J
    public final Object c(Object obj, Object obj2) {
        return new a(obj, obj2);
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return this.f23324c;
    }
}
