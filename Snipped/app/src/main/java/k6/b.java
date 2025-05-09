package k6;

import kotlin.Pair;

/* compiled from: GetCommissionsUseCase.kt */
/* loaded from: classes.dex */
public final class b extends com.luminary.business.domain.functional.a<B5.a, Pair<? extends String, ? extends B5.b>> {

    /* renamed from: a, reason: collision with root package name */
    public final T5.a f23021a;

    public b(T5.a aVar) {
        this.f23021a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends String, ? extends B5.b> pair, T9.a<? super J5.a<? extends J5.b, ? extends B5.a>> aVar) {
        Pair<? extends String, ? extends B5.b> pair2 = pair;
        return this.f23021a.d((String) pair2.f23089a, (B5.b) pair2.f23090b, aVar);
    }
}
