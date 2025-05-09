package a6;

import com.luminary.business.domain.entity.account.BankAccountDomain;

/* compiled from: GetAccountUseCase.kt */
/* renamed from: a6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0515c extends com.luminary.business.domain.functional.a<BankAccountDomain, s5.b> {

    /* renamed from: a, reason: collision with root package name */
    public final L5.a f4454a;

    public C0515c(L5.a aVar) {
        this.f4454a = aVar;
    }

    @Override // com.luminary.business.domain.functional.a
    public final Object b(s5.b bVar, T9.a<? super J5.a<? extends J5.b, ? extends BankAccountDomain>> aVar) {
        s5.b bVar2 = bVar;
        return this.f4454a.i(bVar2.f26608a, bVar2.f26609b, aVar);
    }
}
