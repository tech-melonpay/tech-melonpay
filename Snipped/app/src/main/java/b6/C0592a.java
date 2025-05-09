package b6;

import com.luminary.business.domain.entity.cards.BankTopUpRequestDomain;

/* compiled from: BankTopUpUseCase.kt */
/* renamed from: b6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0592a extends com.luminary.business.domain.functional.a<h4.o, BankTopUpRequestDomain> {

    /* renamed from: a, reason: collision with root package name */
    public final M5.a f8343a;

    public C0592a(M5.a aVar) {
        this.f8343a = aVar;
    }

    @Override // com.luminary.business.domain.functional.a
    public final Object b(BankTopUpRequestDomain bankTopUpRequestDomain, T9.a<? super J5.a<? extends J5.b, ? extends h4.o>> aVar) {
        BankTopUpRequestDomain bankTopUpRequestDomain2 = bankTopUpRequestDomain;
        return this.f8343a.z(bankTopUpRequestDomain2.f10745a, bankTopUpRequestDomain2, aVar);
    }
}
