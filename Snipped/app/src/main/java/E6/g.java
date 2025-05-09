package e6;

import com.luminary.business.domain.Quintuple;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;

/* compiled from: GetCurrencyRateForExchangeUseCase.kt */
/* loaded from: classes.dex */
public final class g extends com.luminary.business.domain.functional.a<CryptoExchangeDomain, Quintuple<? extends Integer, ? extends String, ? extends String, ? extends Integer, ? extends Integer>> {

    /* renamed from: a, reason: collision with root package name */
    public final P5.a f20529a;

    public g(P5.a aVar) {
        this.f20529a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Quintuple<? extends Integer, ? extends String, ? extends String, ? extends Integer, ? extends Integer> quintuple, T9.a<? super J5.a<? extends J5.b, ? extends CryptoExchangeDomain>> aVar) {
        Quintuple<? extends Integer, ? extends String, ? extends String, ? extends Integer, ? extends Integer> quintuple2 = quintuple;
        return this.f20529a.n(((Number) quintuple2.f10687a).intValue(), (String) quintuple2.f10688b, (String) quintuple2.f10689c, (Integer) quintuple2.f10690d, (Integer) quintuple2.f10691e, aVar);
    }
}
