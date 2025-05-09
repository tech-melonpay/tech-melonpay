package c6;

import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import java.util.List;

/* compiled from: GetCompaniesUseCase.kt */
/* loaded from: classes.dex */
public final class i extends com.luminary.business.domain.functional.a<List<? extends CorporateDetailsDomain>, String> {

    /* renamed from: a, reason: collision with root package name */
    public final N5.a f8573a;

    public i(N5.a aVar) {
        this.f8573a = aVar;
    }

    @Override // com.luminary.business.domain.functional.a
    public final Object b(String str, T9.a<? super J5.a<? extends J5.b, ? extends List<? extends CorporateDetailsDomain>>> aVar) {
        return this.f8573a.l(aVar);
    }
}
