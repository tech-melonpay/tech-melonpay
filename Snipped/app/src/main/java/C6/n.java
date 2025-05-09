package c6;

import com.luminary.business.domain.entity.company.CorporateDetailsDomain;

/* compiled from: SubmitCompanyUseCase.kt */
/* loaded from: classes.dex */
public final class n extends com.luminary.business.domain.functional.a<CorporateDetailsDomain, String> {

    /* renamed from: a, reason: collision with root package name */
    public final N5.a f8578a;

    public n(N5.a aVar) {
        this.f8578a = aVar;
    }

    @Override // com.luminary.business.domain.functional.a
    public final Object b(String str, T9.a<? super J5.a<? extends J5.b, ? extends CorporateDetailsDomain>> aVar) {
        return this.f8578a.m(str, aVar);
    }
}
