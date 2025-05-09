package e6;

import com.luminary.business.domain.entity.cryptowallet.CryptowalletDomain;
import java.util.List;

/* compiled from: GetWalletsUseCase.kt */
/* loaded from: classes.dex */
public final class k extends com.luminary.business.domain.functional.a<List<? extends CryptowalletDomain>, Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final P5.a f20533a;

    public k(P5.a aVar) {
        this.f20533a = aVar;
    }

    @Override // com.luminary.business.domain.functional.a
    public final Object b(Integer num, T9.a<? super J5.a<? extends J5.b, ? extends List<? extends CryptowalletDomain>>> aVar) {
        return this.f20533a.f(num.intValue(), aVar);
    }
}
