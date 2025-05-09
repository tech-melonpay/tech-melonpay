package e6;

import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import kotlin.Pair;

/* compiled from: GetRateUseCase.kt */
/* loaded from: classes.dex */
public final class i extends com.luminary.business.domain.functional.a<CryptoExchangeDomain, Pair<? extends String, ? extends String>> {

    /* renamed from: a, reason: collision with root package name */
    public final P5.a f20531a;

    public i(P5.a aVar) {
        this.f20531a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends String, ? extends String> pair, T9.a<? super J5.a<? extends J5.b, ? extends CryptoExchangeDomain>> aVar) {
        Pair<? extends String, ? extends String> pair2 = pair;
        return this.f20531a.l((String) pair2.f23089a, (String) pair2.f23090b, aVar);
    }
}
