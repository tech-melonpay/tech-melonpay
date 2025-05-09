package W4;

import java.util.List;
import n5.InterfaceC1070a;

/* compiled from: StatementsRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class l implements X5.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1070a f3823a;

    /* renamed from: b, reason: collision with root package name */
    public final K5.a f3824b;

    public l(InterfaceC1070a interfaceC1070a, K5.a aVar) {
        this.f3823a = interfaceC1070a;
        this.f3824b = aVar;
    }

    @Override // X5.a
    public final Object a(H5.a aVar, T9.a<? super J5.a<? extends J5.b, ? extends List<F5.b>>> aVar2) {
        return this.f3823a.d(aVar);
    }

    @Override // X5.a
    public final Object b(String str, String str2, boolean z10, T9.a<? super J5.a<? extends J5.b, String>> aVar) {
        return this.f3823a.e("Bearer ".concat(this.f3824b.K()), str, str2, z10);
    }

    @Override // X5.a
    public final Object c(String str, String str2, String str3, T9.a<? super J5.a<? extends J5.b, String>> aVar) {
        return this.f3823a.i(str, str2, str3);
    }

    @Override // X5.a
    public final Object d(String str, String str2, T9.a<? super J5.a<? extends J5.b, F5.b>> aVar) {
        return this.f3823a.b(str, str2);
    }

    @Override // X5.a
    public final Object e(F5.a aVar, T9.a<? super J5.a<? extends J5.b, String>> aVar2) {
        return this.f3823a.f(aVar);
    }

    @Override // X5.a
    public final Object f(String str, String str2, String str3, String str4, T9.a<? super J5.a<? extends J5.b, F5.b>> aVar) {
        return this.f3823a.j(str, str2, str3, str4);
    }

    @Override // X5.a
    public final Object g(F5.a aVar, T9.a<? super J5.a<? extends J5.b, String>> aVar2) {
        return this.f3823a.g(aVar);
    }

    @Override // X5.a
    public final Object h(String str, String str2, String str3, T9.a<? super J5.a<? extends J5.b, String>> aVar) {
        return this.f3823a.h(str, str2, str3);
    }

    @Override // X5.a
    public final Object i(String str, T9.a<? super J5.a<? extends J5.b, F5.b>> aVar) {
        return this.f3823a.a(str);
    }

    @Override // X5.a
    public final Object j(F5.a aVar, T9.a<? super J5.a<? extends J5.b, String>> aVar2) {
        return this.f3823a.k(aVar);
    }

    @Override // X5.a
    public final Object k(F5.a aVar, T9.a<? super J5.a<? extends J5.b, String>> aVar2) {
        return this.f3823a.c(aVar);
    }
}
