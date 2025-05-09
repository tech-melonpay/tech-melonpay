package i6;

import kotlin.Pair;

/* compiled from: GetLimitsUseCase.kt */
/* renamed from: i6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0823a extends com.luminary.business.domain.functional.a<z5.c, Pair<? extends String, ? extends Integer>> {

    /* renamed from: a, reason: collision with root package name */
    public final M5.a f21480a;

    public C0823a(M5.a aVar) {
        this.f21480a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends String, ? extends Integer> pair, T9.a<? super J5.a<? extends J5.b, ? extends z5.c>> aVar) {
        Pair<? extends String, ? extends Integer> pair2 = pair;
        return this.f21480a.i((String) pair2.f23089a, ((Number) pair2.f23090b).intValue(), aVar);
    }
}
