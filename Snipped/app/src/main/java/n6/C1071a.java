package n6;

import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import kotlin.Triple;

/* compiled from: ConfirmExchangeUseCase.kt */
/* renamed from: n6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1071a extends com.luminary.business.domain.functional.a<CryptoExchangeDomain, Triple<? extends String, ? extends Integer, ? extends Integer>> {

    /* renamed from: a, reason: collision with root package name */
    public final W5.a f24243a;

    public C1071a(W5.a aVar) {
        this.f24243a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Triple<? extends String, ? extends Integer, ? extends Integer> triple, T9.a<? super J5.a<? extends J5.b, ? extends CryptoExchangeDomain>> aVar) {
        Triple<? extends String, ? extends Integer, ? extends Integer> triple2 = triple;
        return this.f24243a.a((String) triple2.f23099a, ((Number) triple2.f23100b).intValue(), ((Number) triple2.f23101c).intValue(), aVar);
    }
}
