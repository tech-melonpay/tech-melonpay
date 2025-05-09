package k6;

import B5.j;
import com.luminary.business.domain.entity.payments.PaymentDomain;
import kotlin.Pair;

/* compiled from: PaymentToBankAccountUseCase.kt */
/* loaded from: classes.dex */
public final class h extends com.luminary.business.domain.functional.a<PaymentDomain, Pair<? extends String, ? extends j>> {

    /* renamed from: a, reason: collision with root package name */
    public final T5.a f23027a;

    public h(T5.a aVar) {
        this.f23027a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends String, ? extends j> pair, T9.a<? super J5.a<? extends J5.b, ? extends PaymentDomain>> aVar) {
        Pair<? extends String, ? extends j> pair2 = pair;
        return this.f23027a.f((String) pair2.f23089a, (j) pair2.f23090b, aVar);
    }
}
