package sa;

import ca.InterfaceC0635a;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: JsonElementSerializers.kt */
/* loaded from: classes2.dex */
public final class i implements pa.f {

    /* renamed from: a, reason: collision with root package name */
    public final O9.f f27104a;

    public i(InterfaceC0635a<? extends pa.f> interfaceC0635a) {
        this.f27104a = kotlin.a.a(interfaceC0635a);
    }

    @Override // pa.f
    public final String a() {
        return b().a();
    }

    public final pa.f b() {
        return (pa.f) this.f27104a.getValue();
    }

    @Override // pa.f
    public final boolean c() {
        return false;
    }

    @Override // pa.f
    public final int d(String str) {
        return b().d(str);
    }

    @Override // pa.f
    public final pa.g e() {
        return b().e();
    }

    @Override // pa.f
    public final int f() {
        return b().f();
    }

    @Override // pa.f
    public final String g(int i) {
        return b().g(i);
    }

    @Override // pa.f
    public final List<Annotation> getAnnotations() {
        return EmptyList.f23104a;
    }

    @Override // pa.f
    public final List<Annotation> h(int i) {
        return b().h(i);
    }

    @Override // pa.f
    public final pa.f i(int i) {
        return b().i(i);
    }

    @Override // pa.f
    public final boolean isInline() {
        return false;
    }

    @Override // pa.f
    public final boolean j(int i) {
        return b().j(i);
    }
}
