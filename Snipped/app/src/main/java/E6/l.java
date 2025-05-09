package e6;

import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;

/* compiled from: UpdateCryptoExchangeUseCase.kt */
/* loaded from: classes.dex */
public final class l extends com.luminary.business.domain.functional.a<CryptoExchangeDomain, v5.g> {

    /* renamed from: a, reason: collision with root package name */
    public final P5.a f20534a;

    public l(P5.a aVar) {
        this.f20534a = aVar;
    }

    @Override // com.luminary.business.domain.functional.a
    public final Object b(v5.g gVar, T9.a<? super J5.a<? extends J5.b, ? extends CryptoExchangeDomain>> aVar) {
        v5.g gVar2 = gVar;
        return this.f20534a.m(gVar2.f30628a, gVar2.f30629b, gVar2, aVar);
    }
}
