package e6;

import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;

/* compiled from: CreateWithdrawUseCase.kt */
/* renamed from: e6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0719c extends com.luminary.business.domain.functional.a<CryptoExchangeDomain, v5.c> {

    /* renamed from: a, reason: collision with root package name */
    public final P5.a f20525a;

    public C0719c(P5.a aVar) {
        this.f20525a = aVar;
    }

    @Override // com.luminary.business.domain.functional.a
    public final Object b(v5.c cVar, T9.a<? super J5.a<? extends J5.b, ? extends CryptoExchangeDomain>> aVar) {
        v5.c cVar2 = cVar;
        return this.f20525a.i(cVar2.f30605a, cVar2, aVar);
    }
}
