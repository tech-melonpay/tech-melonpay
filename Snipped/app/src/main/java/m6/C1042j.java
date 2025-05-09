package m6;

/* compiled from: GetProxyTokenUseCase.kt */
/* renamed from: m6.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1042j extends com.luminary.business.domain.functional.a<I5.j, String> {

    /* renamed from: a, reason: collision with root package name */
    public final V5.a f23938a;

    /* renamed from: b, reason: collision with root package name */
    public final K5.a f23939b;

    public C1042j(V5.a aVar, K5.a aVar2) {
        this.f23938a = aVar;
        this.f23939b = aVar2;
    }

    @Override // com.luminary.business.domain.functional.a
    public final Object b(String str, T9.a<? super J5.a<? extends J5.b, ? extends I5.j>> aVar) {
        String concat = "Basic ".concat(this.f23939b.n());
        return this.f23938a.n(str, concat, aVar);
    }
}
