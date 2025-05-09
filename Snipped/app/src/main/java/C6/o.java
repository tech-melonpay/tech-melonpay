package c6;

import kotlin.Pair;

/* compiled from: UploadFileUseCase.kt */
/* loaded from: classes.dex */
public final class o extends com.luminary.business.domain.functional.a<u5.i, Pair<? extends String, ? extends u5.j>> {

    /* renamed from: a, reason: collision with root package name */
    public final N5.a f8579a;

    public o(N5.a aVar) {
        this.f8579a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends String, ? extends u5.j> pair, T9.a<? super J5.a<? extends J5.b, ? extends u5.i>> aVar) {
        Pair<? extends String, ? extends u5.j> pair2 = pair;
        return this.f8579a.j((String) pair2.f23089a, (u5.j) pair2.f23090b, aVar);
    }
}
