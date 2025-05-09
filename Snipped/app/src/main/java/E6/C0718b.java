package e6;

import com.luminary.business.domain.entity.cryptowallet.CryptowalletDomain;

/* compiled from: CreateWalletUseCase.kt */
/* renamed from: e6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0718b extends com.luminary.business.domain.functional.a<CryptowalletDomain, v5.d> {

    /* renamed from: a, reason: collision with root package name */
    public final P5.a f20524a;

    public C0718b(P5.a aVar) {
        this.f20524a = aVar;
    }

    @Override // com.luminary.business.domain.functional.a
    public final Object b(v5.d dVar, T9.a<? super J5.a<? extends J5.b, ? extends CryptowalletDomain>> aVar) {
        return this.f20524a.j(dVar, aVar);
    }
}
