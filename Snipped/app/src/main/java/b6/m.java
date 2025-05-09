package b6;

import kotlin.Pair;

/* compiled from: GetCvvPanUseCase.kt */
/* loaded from: classes.dex */
public final class m extends com.luminary.business.domain.functional.a<h4.e, Pair<? extends String, ? extends Integer>> {

    /* renamed from: a, reason: collision with root package name */
    public final M5.a f8355a;

    public m(M5.a aVar) {
        this.f8355a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends String, ? extends Integer> pair, T9.a<? super J5.a<? extends J5.b, ? extends h4.e>> aVar) {
        Pair<? extends String, ? extends Integer> pair2 = pair;
        return this.f8355a.v((String) pair2.f23089a, ((Number) pair2.f23090b).intValue(), aVar);
    }
}
