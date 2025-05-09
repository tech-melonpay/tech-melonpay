package c6;

import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import kotlin.Pair;

/* compiled from: BusinessActivityUseCase.kt */
/* loaded from: classes.dex */
public final class e extends com.luminary.business.domain.functional.a<CorporateDetailsDomain, Pair<? extends String, ? extends com.luminary.business.domain.entity.company.b>> {

    /* renamed from: a, reason: collision with root package name */
    public final N5.a f8569a;

    public e(N5.a aVar) {
        this.f8569a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends String, ? extends com.luminary.business.domain.entity.company.b> pair, T9.a<? super J5.a<? extends J5.b, ? extends CorporateDetailsDomain>> aVar) {
        Pair<? extends String, ? extends com.luminary.business.domain.entity.company.b> pair2 = pair;
        return this.f8569a.i((String) pair2.f23089a, (com.luminary.business.domain.entity.company.b) pair2.f23090b, aVar);
    }
}
