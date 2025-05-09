package k6;

import B5.i;
import com.luminary.business.domain.entity.payments.PaymentDomain;
import kotlin.Pair;

/* compiled from: PaymentSwiftUseCase.kt */
/* loaded from: classes.dex */
public final class g extends com.luminary.business.domain.functional.a<PaymentDomain, Pair<? extends String, ? extends i>> {

    /* renamed from: a, reason: collision with root package name */
    public final T5.a f23026a;

    public g(T5.a aVar) {
        this.f23026a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends String, ? extends i> pair, T9.a<? super J5.a<? extends J5.b, ? extends PaymentDomain>> aVar) {
        Pair<? extends String, ? extends i> pair2 = pair;
        return this.f23026a.h((String) pair2.f23089a, (i) pair2.f23090b, aVar);
    }
}
