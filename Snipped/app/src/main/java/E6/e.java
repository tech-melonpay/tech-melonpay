package e6;

import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import kotlin.Pair;

/* compiled from: GetCryptoExchangeUseCase.kt */
/* loaded from: classes.dex */
public final class e extends com.luminary.business.domain.functional.a<CryptoExchangeDomain, Pair<? extends Integer, ? extends Integer>> {

    /* renamed from: a, reason: collision with root package name */
    public final P5.a f20527a;

    public e(P5.a aVar) {
        this.f20527a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends Integer, ? extends Integer> pair, T9.a<? super J5.a<? extends J5.b, ? extends CryptoExchangeDomain>> aVar) {
        Pair<? extends Integer, ? extends Integer> pair2 = pair;
        return this.f20527a.g(((Number) pair2.f23089a).intValue(), ((Number) pair2.f23090b).intValue(), aVar);
    }
}
