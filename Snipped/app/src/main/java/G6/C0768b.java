package g6;

import kotlin.Pair;

/* compiled from: GetExchangeRateUseCase.kt */
/* renamed from: g6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0768b extends com.luminary.business.domain.functional.a<Object, Pair<? extends String, ? extends x5.b>> {

    /* renamed from: a, reason: collision with root package name */
    public final Q5.a f20808a;

    public C0768b(Q5.a aVar) {
        this.f20808a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends String, ? extends x5.b> pair, T9.a<? super J5.a<? extends J5.b, ? extends Object>> aVar) {
        Pair<? extends String, ? extends x5.b> pair2 = pair;
        return this.f20808a.a((String) pair2.f23089a, (x5.b) pair2.f23090b, aVar);
    }
}
