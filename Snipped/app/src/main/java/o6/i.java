package o6;

import kotlin.Pair;

/* compiled from: GetProxyTransactionUseCase.kt */
/* loaded from: classes.dex */
public final class i extends com.luminary.business.domain.functional.a<F5.b, Pair<? extends String, ? extends String>> {

    /* renamed from: a, reason: collision with root package name */
    public final X5.a f24385a;

    public i(X5.a aVar) {
        this.f24385a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends String, ? extends String> pair, T9.a<? super J5.a<? extends J5.b, ? extends F5.b>> aVar) {
        Pair<? extends String, ? extends String> pair2 = pair;
        return this.f24385a.d((String) pair2.f23089a, (String) pair2.f23090b, aVar);
    }
}
