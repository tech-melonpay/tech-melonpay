package b6;

import com.luminary.business.domain.entity.cards.VaultTopUpRequestDomain;

/* compiled from: VaultTopUpUseCase.kt */
/* loaded from: classes.dex */
public final class w extends com.luminary.business.domain.functional.a<h4.o, VaultTopUpRequestDomain> {

    /* renamed from: a, reason: collision with root package name */
    public final M5.a f8365a;

    public w(M5.a aVar) {
        this.f8365a = aVar;
    }

    @Override // com.luminary.business.domain.functional.a
    public final Object b(VaultTopUpRequestDomain vaultTopUpRequestDomain, T9.a<? super J5.a<? extends J5.b, ? extends h4.o>> aVar) {
        VaultTopUpRequestDomain vaultTopUpRequestDomain2 = vaultTopUpRequestDomain;
        return this.f8365a.l(vaultTopUpRequestDomain2.f10800a, vaultTopUpRequestDomain2, aVar);
    }
}
