package e6;

import kotlin.Pair;

/* compiled from: GetCryptoPreviewUseCase.kt */
/* loaded from: classes.dex */
public final class f extends com.luminary.business.domain.functional.a<v5.h, Pair<? extends Integer, ? extends v5.f>> {

    /* renamed from: a, reason: collision with root package name */
    public final P5.a f20528a;

    public f(P5.a aVar) {
        this.f20528a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends Integer, ? extends v5.f> pair, T9.a<? super J5.a<? extends J5.b, ? extends v5.h>> aVar) {
        Pair<? extends Integer, ? extends v5.f> pair2 = pair;
        return this.f20528a.d(((Number) pair2.f23089a).intValue(), (v5.f) pair2.f23090b, aVar);
    }
}
