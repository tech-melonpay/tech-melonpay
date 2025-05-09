package e6;

import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeCreateRequestDomain;
import kotlin.Pair;

/* compiled from: CreateCryptoExchangeUseCase.kt */
/* renamed from: e6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0717a extends com.luminary.business.domain.functional.a<v5.b, Pair<? extends Integer, ? extends CryptoExchangeCreateRequestDomain>> {

    /* renamed from: a, reason: collision with root package name */
    public final P5.a f20523a;

    public C0717a(P5.a aVar) {
        this.f20523a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends Integer, ? extends CryptoExchangeCreateRequestDomain> pair, T9.a<? super J5.a<? extends J5.b, ? extends v5.b>> aVar) {
        Pair<? extends Integer, ? extends CryptoExchangeCreateRequestDomain> pair2 = pair;
        return this.f20523a.a(((Number) pair2.f23089a).intValue(), (CryptoExchangeCreateRequestDomain) pair2.f23090b, aVar);
    }
}
