package b6;

import com.luminary.business.domain.entity.cards.BankTopUpRequestDomain;
import com.luminary.business.domain.entity.cards.TopUpCommissionDomain;

/* compiled from: CalculateTopUpCommissionUseCase.kt */
/* renamed from: b6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0593b extends com.luminary.business.domain.functional.a<TopUpCommissionDomain, BankTopUpRequestDomain> {

    /* renamed from: a, reason: collision with root package name */
    public final M5.a f8344a;

    public C0593b(M5.a aVar) {
        this.f8344a = aVar;
    }

    @Override // com.luminary.business.domain.functional.a
    public final Object b(BankTopUpRequestDomain bankTopUpRequestDomain, T9.a<? super J5.a<? extends J5.b, ? extends TopUpCommissionDomain>> aVar) {
        BankTopUpRequestDomain bankTopUpRequestDomain2 = bankTopUpRequestDomain;
        return this.f8344a.b(bankTopUpRequestDomain2.f10745a, bankTopUpRequestDomain2, aVar);
    }
}
