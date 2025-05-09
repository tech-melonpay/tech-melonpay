package Ya;

import androidx.lifecycle.Q;
import androidx.lifecycle.T;
import ia.InterfaceC0835c;

/* compiled from: DefaultViewModelFactory.kt */
/* loaded from: classes3.dex */
public final class a<T extends Q> implements T {

    /* renamed from: a, reason: collision with root package name */
    public final org.koin.core.scope.a f4156a;

    /* renamed from: b, reason: collision with root package name */
    public final Wa.a<T> f4157b;

    public a(org.koin.core.scope.a aVar, Wa.a<T> aVar2) {
        this.f4156a = aVar;
        this.f4157b = aVar2;
    }

    @Override // androidx.lifecycle.T
    public final <T extends Q> T create(Class<T> cls) {
        Wa.a<T> aVar = this.f4157b;
        InterfaceC0835c<T> interfaceC0835c = aVar.f3880a;
        hb.a aVar2 = aVar.f3881b;
        return (T) this.f4156a.a(aVar.f3883d, aVar2, interfaceC0835c);
    }
}
