package I3;

import na.InterfaceC1077a;
import na.InterfaceC1081e;
import na.InterfaceC1083g;
import okhttp3.o;
import sa.AbstractC1244a;
import va.i;

/* compiled from: Serializer.kt */
/* loaded from: classes.dex */
public abstract class b {

    /* compiled from: Serializer.kt */
    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC1083g f1732a;

        public a(AbstractC1244a abstractC1244a) {
            this.f1732a = abstractC1244a;
        }

        @Override // I3.b
        public final <T> T a(InterfaceC1077a<? extends T> interfaceC1077a, i iVar) {
            return (T) this.f1732a.c(interfaceC1077a, iVar.y());
        }

        @Override // I3.b
        public final InterfaceC1083g b() {
            return this.f1732a;
        }

        @Override // I3.b
        public final <T> o c(okhttp3.i iVar, InterfaceC1081e<? super T> interfaceC1081e, T t3) {
            return o.create(iVar, this.f1732a.b(interfaceC1081e, t3));
        }
    }

    public abstract <T> T a(InterfaceC1077a<? extends T> interfaceC1077a, i iVar);

    public abstract InterfaceC1083g b();

    public abstract <T> o c(okhttp3.i iVar, InterfaceC1081e<? super T> interfaceC1081e, T t3);
}
