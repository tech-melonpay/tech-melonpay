package e6;

import com.luminary.business.domain.entity.cryptowallet.CryptowalletDomain;
import kotlin.Pair;

/* compiled from: GetWalletUseCase.kt */
/* loaded from: classes.dex */
public final class j extends com.luminary.business.domain.functional.a<CryptowalletDomain, Pair<? extends Integer, ? extends Integer>> {

    /* renamed from: a, reason: collision with root package name */
    public final P5.a f20532a;

    public j(P5.a aVar) {
        this.f20532a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends Integer, ? extends Integer> pair, T9.a<? super J5.a<? extends J5.b, ? extends CryptowalletDomain>> aVar) {
        Pair<? extends Integer, ? extends Integer> pair2 = pair;
        return this.f20532a.b(((Number) pair2.f23089a).intValue(), ((Number) pair2.f23090b).intValue(), aVar);
    }
}
