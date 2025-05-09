package kotlinx.serialization.internal;

import O9.f;
import O9.p;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.b;
import na.InterfaceC1078b;
import pa.C1123a;
import qa.InterfaceC1142b;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

/* compiled from: ObjectSerializer.kt */
/* loaded from: classes2.dex */
public final class a<T> implements InterfaceC1078b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f23362a;

    /* renamed from: b, reason: collision with root package name */
    public final EmptyList f23363b = EmptyList.f23104a;

    /* renamed from: c, reason: collision with root package name */
    public final f f23364c = kotlin.a.b(LazyThreadSafetyMode.f23086b, new InterfaceC0635a<pa.f>() { // from class: kotlinx.serialization.internal.ObjectSerializer$descriptor$2

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f23329l = "kotlin.Unit";

        {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        public final pa.f invoke() {
            final a<Object> aVar = a.this;
            InterfaceC0646l<C1123a, p> interfaceC0646l = new InterfaceC0646l<C1123a, p>() { // from class: kotlinx.serialization.internal.ObjectSerializer$descriptor$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // ca.InterfaceC0646l
                public final p invoke(C1123a c1123a) {
                    c1123a.f25719b = aVar.f23363b;
                    return p.f3034a;
                }
            };
            return kotlinx.serialization.descriptors.a.c(this.f23329l, b.d.f23312a, new pa.f[0], interfaceC0646l);
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    public a(p pVar) {
        this.f23362a = pVar;
    }

    @Override // na.InterfaceC1077a
    public final T deserialize(InterfaceC1144d interfaceC1144d) {
        pa.f descriptor = getDescriptor();
        InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
        int q10 = c2.q(getDescriptor());
        if (q10 != -1) {
            throw new SerializationException(com.google.android.gms.measurement.internal.a.g(q10, "Unexpected index "));
        }
        p pVar = p.f3034a;
        c2.b(descriptor);
        return this.f23362a;
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return (pa.f) this.f23364c.getValue();
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, T t3) {
        interfaceC1145e.c(getDescriptor()).b(getDescriptor());
    }
}
