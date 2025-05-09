package c6;

import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import kotlin.Pair;
import u5.C1521a;

/* compiled from: AddCryptoInfoUseCase.kt */
/* loaded from: classes.dex */
public final class c extends com.luminary.business.domain.functional.a<CorporateDetailsDomain, Pair<? extends String, ? extends C1521a>> {

    /* renamed from: a, reason: collision with root package name */
    public final N5.a f8567a;

    public c(N5.a aVar) {
        this.f8567a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends String, ? extends C1521a> pair, T9.a<? super J5.a<? extends J5.b, ? extends CorporateDetailsDomain>> aVar) {
        Pair<? extends String, ? extends C1521a> pair2 = pair;
        return this.f8567a.h((String) pair2.f23089a, (C1521a) pair2.f23090b, aVar);
    }
}
