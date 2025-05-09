package a6;

import com.luminary.business.domain.entity.account.BankAccountDomain;
import java.util.List;

/* compiled from: GetBankAccountsUseCase.kt */
/* loaded from: classes.dex */
public final class g extends com.luminary.business.domain.functional.a<List<? extends BankAccountDomain>, String> {

    /* renamed from: a, reason: collision with root package name */
    public final L5.a f4458a;

    public g(L5.a aVar) {
        this.f4458a = aVar;
    }

    @Override // com.luminary.business.domain.functional.a
    public final Object b(String str, T9.a<? super J5.a<? extends J5.b, ? extends List<? extends BankAccountDomain>>> aVar) {
        return this.f4458a.e(str, aVar);
    }
}
