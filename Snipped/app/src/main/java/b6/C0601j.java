package b6;

import com.luminary.business.domain.entity.account.CardsDomain;

/* compiled from: GetCardDetailsUseCase.kt */
/* renamed from: b6.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0601j extends com.luminary.business.domain.functional.a<CardsDomain, t5.d> {

    /* renamed from: a, reason: collision with root package name */
    public final M5.a f8352a;

    public C0601j(M5.a aVar) {
        this.f8352a = aVar;
    }

    @Override // com.luminary.business.domain.functional.a
    public final Object b(t5.d dVar, T9.a<? super J5.a<? extends J5.b, ? extends CardsDomain>> aVar) {
        t5.d dVar2 = dVar;
        return this.f8352a.d(dVar2.f27531a, dVar2.f27532b, aVar);
    }
}
