package kotlinx.serialization.internal;

import O9.p;
import ca.InterfaceC0646l;
import kotlin.Triple;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import na.InterfaceC1078b;
import pa.C1123a;
import pa.f;
import qa.InterfaceC1142b;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.a0;

/* compiled from: Tuples.kt */
/* loaded from: classes2.dex */
public final class TripleSerializer<A, B, C> implements InterfaceC1078b<Triple<? extends A, ? extends B, ? extends C>> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1078b<A> f23357a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1078b<B> f23358b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1078b<C> f23359c;

    /* renamed from: d, reason: collision with root package name */
    public final SerialDescriptorImpl f23360d = kotlinx.serialization.descriptors.a.b("kotlin.Triple", new f[0], new InterfaceC0646l<C1123a, p>(this) { // from class: kotlinx.serialization.internal.TripleSerializer$descriptor$1

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ TripleSerializer<A, B, C> f23361l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(1);
            this.f23361l = this;
        }

        @Override // ca.InterfaceC0646l
        public final p invoke(C1123a c1123a) {
            C1123a c1123a2 = c1123a;
            TripleSerializer<A, B, C> tripleSerializer = this.f23361l;
            C1123a.a(c1123a2, "first", tripleSerializer.f23357a.getDescriptor());
            C1123a.a(c1123a2, "second", tripleSerializer.f23358b.getDescriptor());
            C1123a.a(c1123a2, "third", tripleSerializer.f23359c.getDescriptor());
            return p.f3034a;
        }
    });

    public TripleSerializer(InterfaceC1078b<A> interfaceC1078b, InterfaceC1078b<B> interfaceC1078b2, InterfaceC1078b<C> interfaceC1078b3) {
        this.f23357a = interfaceC1078b;
        this.f23358b = interfaceC1078b2;
        this.f23359c = interfaceC1078b3;
    }

    @Override // na.InterfaceC1077a
    public final Object deserialize(InterfaceC1144d interfaceC1144d) {
        SerialDescriptorImpl serialDescriptorImpl = this.f23360d;
        InterfaceC1142b c2 = interfaceC1144d.c(serialDescriptorImpl);
        Object obj = a0.f26383c;
        Object obj2 = obj;
        Object obj3 = obj2;
        Object obj4 = obj3;
        while (true) {
            int q10 = c2.q(serialDescriptorImpl);
            if (q10 == -1) {
                c2.b(serialDescriptorImpl);
                if (obj2 == obj) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (obj3 == obj) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (obj4 != obj) {
                    return new Triple(obj2, obj3, obj4);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (q10 == 0) {
                obj2 = c2.C(serialDescriptorImpl, 0, this.f23357a, null);
            } else if (q10 == 1) {
                obj3 = c2.C(serialDescriptorImpl, 1, this.f23358b, null);
            } else {
                if (q10 != 2) {
                    throw new SerializationException(com.google.android.gms.measurement.internal.a.g(q10, "Unexpected index "));
                }
                obj4 = c2.C(serialDescriptorImpl, 2, this.f23359c, null);
            }
        }
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final f getDescriptor() {
        return this.f23360d;
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, Object obj) {
        Triple triple = (Triple) obj;
        SerialDescriptorImpl serialDescriptorImpl = this.f23360d;
        InterfaceC1143c c2 = interfaceC1145e.c(serialDescriptorImpl);
        c2.C(serialDescriptorImpl, 0, this.f23357a, triple.f23099a);
        c2.C(serialDescriptorImpl, 1, this.f23358b, triple.f23100b);
        c2.C(serialDescriptorImpl, 2, this.f23359c, triple.f23101c);
        c2.b(serialDescriptorImpl);
    }
}
