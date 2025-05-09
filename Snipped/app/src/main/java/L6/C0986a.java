package l6;

import kotlin.Pair;

/* compiled from: ChangePlanUseCase.kt */
/* renamed from: l6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0986a extends com.luminary.business.domain.functional.a<C5.a, Pair<? extends String, ? extends String>> {

    /* renamed from: a, reason: collision with root package name */
    public final U5.a f23556a;

    public C0986a(U5.a aVar) {
        this.f23556a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends String, ? extends String> pair, T9.a<? super J5.a<? extends J5.b, ? extends C5.a>> aVar) {
        Pair<? extends String, ? extends String> pair2 = pair;
        return this.f23556a.c((String) pair2.f23089a, (String) pair2.f23090b, aVar);
    }
}
