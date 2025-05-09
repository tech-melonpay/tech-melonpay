package a6;

import kotlin.Pair;

/* compiled from: CreateNewAccountUseCase.kt */
/* renamed from: a6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0513a extends com.luminary.business.domain.functional.a<s5.f, Pair<? extends String, ? extends s5.g>> {

    /* renamed from: a, reason: collision with root package name */
    public final L5.a f4452a;

    public C0513a(L5.a aVar) {
        this.f4452a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends String, ? extends s5.g> pair, T9.a<? super J5.a<? extends J5.b, ? extends s5.f>> aVar) {
        Pair<? extends String, ? extends s5.g> pair2 = pair;
        return this.f4452a.b((String) pair2.f23089a, (s5.g) pair2.f23090b, aVar);
    }
}
