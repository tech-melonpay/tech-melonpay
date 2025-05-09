package b6;

import com.luminary.business.domain.entity.cards.TopUpCommissionDomain;
import kotlin.Pair;

/* compiled from: GetCreateCardCommissionUseCase.kt */
/* loaded from: classes.dex */
public final class l extends com.luminary.business.domain.functional.a<TopUpCommissionDomain, Pair<? extends String, ? extends t5.b>> {

    /* renamed from: a, reason: collision with root package name */
    public final M5.a f8354a;

    public l(M5.a aVar) {
        this.f8354a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends String, ? extends t5.b> pair, T9.a<? super J5.a<? extends J5.b, ? extends TopUpCommissionDomain>> aVar) {
        Pair<? extends String, ? extends t5.b> pair2 = pair;
        return this.f8354a.k((String) pair2.f23089a, (t5.b) pair2.f23090b, aVar);
    }
}
