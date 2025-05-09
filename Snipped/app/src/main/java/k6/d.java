package k6;

import com.luminary.business.domain.entity.payments.PaymentDomain;
import kotlin.Pair;

/* compiled from: PaymentInternalUseCase.kt */
/* loaded from: classes.dex */
public final class d extends com.luminary.business.domain.functional.a<PaymentDomain, Pair<? extends String, ? extends B5.e>> {

    /* renamed from: a, reason: collision with root package name */
    public final T5.a f23023a;

    public d(T5.a aVar) {
        this.f23023a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends String, ? extends B5.e> pair, T9.a<? super J5.a<? extends J5.b, ? extends PaymentDomain>> aVar) {
        Pair<? extends String, ? extends B5.e> pair2 = pair;
        return this.f23023a.b((String) pair2.f23089a, (B5.e) pair2.f23090b, aVar);
    }
}
