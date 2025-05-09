package b6;

import com.luminary.business.domain.entity.cards.DailyLimitDomain;
import kotlin.Pair;

/* compiled from: GetDailyLimitUseCase.kt */
/* loaded from: classes.dex */
public final class n extends com.luminary.business.domain.functional.a<DailyLimitDomain, Pair<? extends String, ? extends Integer>> {

    /* renamed from: a, reason: collision with root package name */
    public final M5.a f8356a;

    public n(M5.a aVar) {
        this.f8356a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends String, ? extends Integer> pair, T9.a<? super J5.a<? extends J5.b, ? extends DailyLimitDomain>> aVar) {
        Pair<? extends String, ? extends Integer> pair2 = pair;
        return this.f8356a.p((String) pair2.f23089a, ((Number) pair2.f23090b).intValue(), aVar);
    }
}
