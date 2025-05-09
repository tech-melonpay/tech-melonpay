package e6;

import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import java.util.List;

/* compiled from: GetCryptoExchangeListUseCase.kt */
/* renamed from: e6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0720d extends com.luminary.business.domain.functional.a<List<? extends CryptoExchangeDomain>, v5.e> {

    /* renamed from: a, reason: collision with root package name */
    public final P5.a f20526a;

    public C0720d(P5.a aVar) {
        this.f20526a = aVar;
    }

    @Override // com.luminary.business.domain.functional.a
    public final Object b(v5.e eVar, T9.a<? super J5.a<? extends J5.b, ? extends List<? extends CryptoExchangeDomain>>> aVar) {
        return this.f20526a.e(eVar, aVar);
    }
}
