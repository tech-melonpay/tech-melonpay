package c6;

import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import kotlin.Pair;

/* compiled from: AddContractorsUseCase.kt */
/* loaded from: classes.dex */
public final class b extends com.luminary.business.domain.functional.a<CorporateDetailsDomain, Pair<? extends String, ? extends com.luminary.business.domain.entity.company.a>> {

    /* renamed from: a, reason: collision with root package name */
    public final N5.a f8566a;

    public b(N5.a aVar) {
        this.f8566a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends String, ? extends com.luminary.business.domain.entity.company.a> pair, T9.a<? super J5.a<? extends J5.b, ? extends CorporateDetailsDomain>> aVar) {
        Pair<? extends String, ? extends com.luminary.business.domain.entity.company.a> pair2 = pair;
        return this.f8566a.e((String) pair2.f23089a, (com.luminary.business.domain.entity.company.a) pair2.f23090b, aVar);
    }
}
