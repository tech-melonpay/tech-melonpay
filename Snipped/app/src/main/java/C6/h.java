package c6;

import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import kotlin.Triple;

/* compiled from: EditUBOUseCase.kt */
/* loaded from: classes.dex */
public final class h extends com.luminary.business.domain.functional.a<CorporateDetailsDomain, Triple<? extends String, ? extends String, ? extends u5.b>> {

    /* renamed from: a, reason: collision with root package name */
    public final N5.a f8572a;

    public h(N5.a aVar) {
        this.f8572a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Triple<? extends String, ? extends String, ? extends u5.b> triple, T9.a<? super J5.a<? extends J5.b, ? extends CorporateDetailsDomain>> aVar) {
        Triple<? extends String, ? extends String, ? extends u5.b> triple2 = triple;
        return this.f8572a.c((String) triple2.f23099a, (String) triple2.f23100b, (u5.b) triple2.f23101c, aVar);
    }
}
