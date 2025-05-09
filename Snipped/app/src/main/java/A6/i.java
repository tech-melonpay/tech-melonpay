package a6;

import com.luminary.business.domain.entity.account.FeeDomain;
import java.util.List;

/* compiled from: GetFeeUseCase.kt */
/* loaded from: classes.dex */
public final class i extends com.luminary.business.domain.functional.a<List<? extends FeeDomain>, Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final L5.a f4460a;

    public i(L5.a aVar) {
        this.f4460a = aVar;
    }

    @Override // com.luminary.business.domain.functional.a
    public final Object b(Integer num, T9.a<? super J5.a<? extends J5.b, ? extends List<? extends FeeDomain>>> aVar) {
        return this.f4460a.d(num.intValue(), aVar);
    }
}
