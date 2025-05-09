package b6;

import com.luminary.business.domain.entity.account.CardsDomain;
import kotlin.Pair;

/* compiled from: CreateNewCardUseCase.kt */
/* renamed from: b6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0596e extends com.luminary.business.domain.functional.a<CardsDomain, Pair<? extends String, ? extends t5.e>> {

    /* renamed from: a, reason: collision with root package name */
    public final M5.a f8347a;

    public C0596e(M5.a aVar) {
        this.f8347a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends String, ? extends t5.e> pair, T9.a<? super J5.a<? extends J5.b, ? extends CardsDomain>> aVar) {
        Pair<? extends String, ? extends t5.e> pair2 = pair;
        return this.f8347a.w((String) pair2.f23089a, (t5.e) pair2.f23090b, aVar);
    }
}
