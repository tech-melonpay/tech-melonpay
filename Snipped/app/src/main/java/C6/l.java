package c6;

import java.util.List;

/* compiled from: GetFileListUseCase.kt */
/* loaded from: classes.dex */
public final class l extends com.luminary.business.domain.functional.a<List<? extends u5.i>, String> {

    /* renamed from: a, reason: collision with root package name */
    public final N5.a f8576a;

    public l(N5.a aVar) {
        this.f8576a = aVar;
    }

    @Override // com.luminary.business.domain.functional.a
    public final Object b(String str, T9.a<? super J5.a<? extends J5.b, ? extends List<? extends u5.i>>> aVar) {
        return this.f8576a.n(str, aVar);
    }
}
