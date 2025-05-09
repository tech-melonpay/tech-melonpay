package b6;

import java.util.List;

/* compiled from: ProgramUseCase.kt */
/* loaded from: classes.dex */
public final class t extends com.luminary.business.domain.functional.a<List<? extends h4.i>, Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final M5.a f8362a;

    public t(M5.a aVar) {
        this.f8362a = aVar;
    }

    @Override // com.luminary.business.domain.functional.a
    public final Object b(Integer num, T9.a<? super J5.a<? extends J5.b, ? extends List<? extends h4.i>>> aVar) {
        return this.f8362a.a(num.intValue(), aVar);
    }
}
