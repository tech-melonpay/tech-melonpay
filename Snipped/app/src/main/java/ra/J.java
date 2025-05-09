package ra;

import kotlinx.serialization.SerializationException;
import na.InterfaceC1078b;
import qa.InterfaceC1142b;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

/* compiled from: Tuples.kt */
/* loaded from: classes2.dex */
public abstract class J<K, V, R> implements InterfaceC1078b<R> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1078b<K> f26356a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1078b<V> f26357b;

    public J(InterfaceC1078b interfaceC1078b, InterfaceC1078b interfaceC1078b2) {
        this.f26356a = interfaceC1078b;
        this.f26357b = interfaceC1078b2;
    }

    public abstract K a(R r8);

    public abstract V b(R r8);

    public abstract R c(K k3, V v10);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // na.InterfaceC1077a
    public final R deserialize(InterfaceC1144d interfaceC1144d) {
        pa.f descriptor = getDescriptor();
        InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
        Object obj = a0.f26383c;
        Object obj2 = obj;
        Object obj3 = obj2;
        while (true) {
            int q10 = c2.q(getDescriptor());
            if (q10 == -1) {
                if (obj2 == obj) {
                    throw new SerializationException("Element 'key' is missing");
                }
                if (obj3 == obj) {
                    throw new SerializationException("Element 'value' is missing");
                }
                R r8 = (R) c(obj2, obj3);
                c2.b(descriptor);
                return r8;
            }
            if (q10 == 0) {
                obj2 = c2.C(getDescriptor(), 0, this.f26356a, null);
            } else {
                if (q10 != 1) {
                    throw new SerializationException(com.google.android.gms.measurement.internal.a.g(q10, "Invalid index: "));
                }
                obj3 = c2.C(getDescriptor(), 1, this.f26357b, null);
            }
        }
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, R r8) {
        InterfaceC1143c c2 = interfaceC1145e.c(getDescriptor());
        c2.C(getDescriptor(), 0, this.f26356a, a(r8));
        c2.C(getDescriptor(), 1, this.f26357b, b(r8));
        c2.b(getDescriptor());
    }
}
