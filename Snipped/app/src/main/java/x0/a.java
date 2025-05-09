package X0;

import U0.k;
import androidx.camera.core.n;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.descriptors.b;
import kotlinx.serialization.modules.b;
import na.InterfaceC1078b;
import na.InterfaceC1081e;
import pa.f;
import qa.AbstractC1141a;
import qa.InterfaceC1145e;

/* compiled from: RouteEncoder.kt */
/* loaded from: classes.dex */
public final class a<T> extends AbstractC1141a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1078b<T> f3886a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, k<Object>> f3887b;

    /* renamed from: c, reason: collision with root package name */
    public final b f3888c = ua.a.f30484a;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f3889d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public int f3890e = -1;

    public a(InterfaceC1078b interfaceC1078b, LinkedHashMap linkedHashMap) {
        this.f3886a = interfaceC1078b;
        this.f3887b = linkedHashMap;
    }

    @Override // qa.AbstractC1141a
    public final void G(f fVar, int i) {
        this.f3890e = i;
    }

    @Override // qa.AbstractC1141a
    public final void H(Object obj) {
        I(obj);
    }

    public final void I(Object obj) {
        String g10 = this.f3886a.getDescriptor().g(this.f3890e);
        k<Object> kVar = this.f3887b.get(g10);
        if (kVar == null) {
            throw new IllegalStateException(n.a("Cannot find NavType for argument ", g10, ". Please provide NavType through typeMap.").toString());
        }
        this.f3889d.put(g10, kVar instanceof U0.b ? ((U0.b) kVar).i(obj) : Collections.singletonList(kVar.f(obj)));
    }

    @Override // qa.InterfaceC1145e
    public final Y8.a a() {
        return this.f3888c;
    }

    @Override // qa.AbstractC1141a, qa.InterfaceC1145e
    public final void f() {
        I(null);
    }

    @Override // qa.AbstractC1141a, qa.InterfaceC1145e
    public final <T> void s(InterfaceC1081e<? super T> interfaceC1081e, T t3) {
        I(t3);
    }

    @Override // qa.AbstractC1141a, qa.InterfaceC1145e
    public final InterfaceC1145e z(f fVar) {
        if (kotlin.jvm.internal.f.b(fVar.e(), b.a.f23309a) && fVar.isInline() && fVar.f() == 1) {
            this.f3890e = 0;
        }
        return this;
    }
}
