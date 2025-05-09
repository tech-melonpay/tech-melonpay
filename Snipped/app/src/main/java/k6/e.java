package k6;

import com.luminary.business.domain.entity.payments.PaymentDomain;
import kotlin.Pair;

/* compiled from: PaymentLocalUseCase.kt */
/* loaded from: classes.dex */
public final class e extends com.luminary.business.domain.functional.a<PaymentDomain, Pair<? extends String, ? extends B5.f>> {

    /* renamed from: a, reason: collision with root package name */
    public final T5.a f23024a;

    public e(T5.a aVar) {
        this.f23024a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends String, ? extends B5.f> pair, T9.a<? super J5.a<? extends J5.b, ? extends PaymentDomain>> aVar) {
        Pair<? extends String, ? extends B5.f> pair2 = pair;
        return this.f23024a.c((String) pair2.f23089a, (B5.f) pair2.f23090b, aVar);
    }
}
