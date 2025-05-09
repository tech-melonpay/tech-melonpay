package kotlinx.serialization.modules;

import ca.InterfaceC0646l;
import java.util.List;
import kotlin.jvm.internal.f;
import na.InterfaceC1078b;

/* compiled from: SerializersModule.kt */
/* loaded from: classes2.dex */
public abstract class a {

    /* compiled from: SerializersModule.kt */
    /* renamed from: kotlinx.serialization.modules.a$a, reason: collision with other inner class name */
    public static final class C0426a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC1078b<?> f23417a;

        public C0426a(InterfaceC1078b<?> interfaceC1078b) {
            this.f23417a = interfaceC1078b;
        }

        @Override // kotlinx.serialization.modules.a
        public final InterfaceC1078b<?> a(List<? extends InterfaceC1078b<?>> list) {
            return this.f23417a;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof C0426a) && f.b(((C0426a) obj).f23417a, this.f23417a);
        }

        public final int hashCode() {
            return this.f23417a.hashCode();
        }
    }

    /* compiled from: SerializersModule.kt */
    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC0646l<List<? extends InterfaceC1078b<?>>, InterfaceC1078b<?>> f23418a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC0646l<? super List<? extends InterfaceC1078b<?>>, ? extends InterfaceC1078b<?>> interfaceC0646l) {
            this.f23418a = interfaceC0646l;
        }

        @Override // kotlinx.serialization.modules.a
        public final InterfaceC1078b<?> a(List<? extends InterfaceC1078b<?>> list) {
            return this.f23418a.invoke(list);
        }
    }

    public abstract InterfaceC1078b<?> a(List<? extends InterfaceC1078b<?>> list);
}
