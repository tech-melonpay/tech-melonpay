package kotlinx.serialization;

import O9.f;
import O9.p;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ia.InterfaceC0835c;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import pa.C1123a;
import pa.d;
import pa.g;
import ra.AbstractC1167b;
import ra.m0;

/* compiled from: PolymorphicSerializer.kt */
/* loaded from: classes2.dex */
public final class b<T> extends AbstractC1167b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0835c<T> f23287a;

    /* renamed from: b, reason: collision with root package name */
    public List<? extends Annotation> f23288b;

    /* renamed from: c, reason: collision with root package name */
    public final f f23289c;

    public b() {
        throw null;
    }

    public b(kotlin.jvm.internal.b bVar) {
        this.f23287a = bVar;
        this.f23288b = EmptyList.f23104a;
        this.f23289c = kotlin.a.b(LazyThreadSafetyMode.f23086b, new InterfaceC0635a<pa.f>(this) { // from class: kotlinx.serialization.PolymorphicSerializer$descriptor$2

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ b<Object> f23267l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f23267l = this;
            }

            @Override // ca.InterfaceC0635a
            public final pa.f invoke() {
                final b<Object> bVar2 = this.f23267l;
                return new pa.c(kotlinx.serialization.descriptors.a.c("kotlinx.serialization.Polymorphic", d.a.f25728a, new pa.f[0], new InterfaceC0646l<C1123a, p>() { // from class: kotlinx.serialization.PolymorphicSerializer$descriptor$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // ca.InterfaceC0646l
                    public final p invoke(C1123a c1123a) {
                        SerialDescriptorImpl c2;
                        C1123a c1123a2 = c1123a;
                        C1123a.a(c1123a2, "type", m0.f26415b);
                        StringBuilder sb2 = new StringBuilder("kotlinx.serialization.Polymorphic<");
                        b<Object> bVar3 = bVar2;
                        sb2.append(bVar3.f23287a.d());
                        sb2.append('>');
                        c2 = kotlinx.serialization.descriptors.a.c(sb2.toString(), g.a.f25739a, new pa.f[0], new InterfaceC0646l<C1123a, p>() { // from class: kotlinx.serialization.descriptors.SerialDescriptorsKt$buildSerialDescriptor$1
                            @Override // ca.InterfaceC0646l
                            public final /* bridge */ /* synthetic */ p invoke(C1123a c1123a3) {
                                return p.f3034a;
                            }
                        });
                        C1123a.a(c1123a2, "value", c2);
                        c1123a2.f25719b = bVar3.f23288b;
                        return p.f3034a;
                    }
                }), bVar2.f23287a);
            }
        });
    }

    @Override // ra.AbstractC1167b
    public final InterfaceC0835c<T> c() {
        return this.f23287a;
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return (pa.f) this.f23289c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f23287a + ')';
    }
}
