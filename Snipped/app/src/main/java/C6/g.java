package c6;

import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import kotlin.Pair;

/* compiled from: EditCompanyUseCase.kt */
/* loaded from: classes.dex */
public final class g extends com.luminary.business.domain.functional.a<CorporateDetailsDomain, Pair<? extends String, ? extends u5.h>> {

    /* renamed from: a, reason: collision with root package name */
    public final N5.a f8571a;

    public g(N5.a aVar) {
        this.f8571a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends String, ? extends u5.h> pair, T9.a<? super J5.a<? extends J5.b, ? extends CorporateDetailsDomain>> aVar) {
        Pair<? extends String, ? extends u5.h> pair2 = pair;
        return this.f8571a.d((String) pair2.f23089a, (u5.h) pair2.f23090b, aVar);
    }
}
