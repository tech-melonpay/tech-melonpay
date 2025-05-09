package W4;

import com.luminary.business.domain.entity.account.CardsDomain;
import com.luminary.business.domain.entity.cards.BankTopUpRequestDomain;
import com.luminary.business.domain.entity.cards.CardTransactionDomain;
import com.luminary.business.domain.entity.cards.DailyLimitDomain;
import com.luminary.business.domain.entity.cards.TopUpCommissionDomain;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.business.domain.entity.cards.VaultTopUpRequestDomain;
import d5.InterfaceC0686a;
import java.util.List;
import t5.C1280a;
import z5.C1645a;

/* compiled from: CardRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class b implements M5.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0686a f3813a;

    public b(InterfaceC0686a interfaceC0686a) {
        this.f3813a = interfaceC0686a;
    }

    @Override // M5.a
    public final Object a(int i, T9.a<? super J5.a<? extends J5.b, ? extends List<h4.i>>> aVar) {
        return this.f3813a.w(i);
    }

    @Override // M5.a
    public final Object b(int i, BankTopUpRequestDomain bankTopUpRequestDomain, T9.a<? super J5.a<? extends J5.b, TopUpCommissionDomain>> aVar) {
        return this.f3813a.z(i, bankTopUpRequestDomain);
    }

    @Override // M5.a
    public final Object c(String str, String str2, t5.c cVar, T9.a<? super J5.a<? extends J5.b, t5.j>> aVar) {
        return this.f3813a.h(str, str2, cVar);
    }

    @Override // M5.a
    public final Object d(String str, String str2, T9.a<? super J5.a<? extends J5.b, CardsDomain>> aVar) {
        return this.f3813a.e(str, str2);
    }

    @Override // M5.a
    public final Object e(String str, String str2, T9.a<? super J5.a<? extends J5.b, CardsDomain>> aVar) {
        return this.f3813a.a(str, str2);
    }

    @Override // M5.a
    public final Object f(String str, int i, int i9, T9.a<? super J5.a<? extends J5.b, ? extends List<CardTransactionDomain>>> aVar) {
        return this.f3813a.i(i, i9, str);
    }

    @Override // M5.a
    public final Object g(String str, Integer num, Boolean bool, T9.a<? super J5.a<? extends J5.b, ? extends List<CardsDomain>>> aVar) {
        return this.f3813a.f(str, num, bool);
    }

    @Override // M5.a
    public final Object h(String str, String str2, T9.a<? super J5.a<? extends J5.b, ? extends List<F5.b>>> aVar) {
        return this.f3813a.n(str, str2);
    }

    @Override // M5.a
    public final Object i(String str, int i, T9.a<? super J5.a<? extends J5.b, z5.c>> aVar) {
        return this.f3813a.m(i, str);
    }

    @Override // M5.a
    public final Object j(String str, String str2, T9.a<? super J5.a<? extends J5.b, CardsDomain>> aVar) {
        return this.f3813a.b(str, str2);
    }

    @Override // M5.a
    public final Object k(String str, t5.b bVar, T9.a<? super J5.a<? extends J5.b, TopUpCommissionDomain>> aVar) {
        return this.f3813a.y(str, bVar);
    }

    @Override // M5.a
    public final Object l(int i, VaultTopUpRequestDomain vaultTopUpRequestDomain, T9.a<? super J5.a<? extends J5.b, h4.o>> aVar) {
        return this.f3813a.g(i, vaultTopUpRequestDomain);
    }

    @Override // M5.a
    public final Object m(T9.a aVar) {
        return this.f3813a.v();
    }

    @Override // M5.a
    public final Object n(String str, C1280a c1280a, T9.a<? super J5.a<? extends J5.b, VaultDomain>> aVar) {
        return this.f3813a.t(str, c1280a);
    }

    @Override // M5.a
    public final Object o(t5.i iVar, T9.a<? super J5.a<? extends J5.b, CardsDomain>> aVar) {
        return this.f3813a.j(iVar);
    }

    @Override // M5.a
    public final Object p(String str, int i, T9.a<? super J5.a<? extends J5.b, DailyLimitDomain>> aVar) {
        return this.f3813a.k(i, str);
    }

    @Override // M5.a
    public final Object q(String str, String str2, T9.a<? super J5.a<? extends J5.b, CardsDomain>> aVar) {
        return this.f3813a.c(str, str2);
    }

    @Override // M5.a
    public final Object r(String str, T9.a<? super J5.a<? extends J5.b, ? extends List<VaultDomain>>> aVar) {
        return this.f3813a.d(str);
    }

    @Override // M5.a
    public final Object s(t5.f fVar, T9.a<? super J5.a<? extends J5.b, CardsDomain>> aVar) {
        return this.f3813a.o(fVar);
    }

    @Override // M5.a
    public final Object t(String str, int i, int i9, T9.a<? super J5.a<? extends J5.b, ? extends List<CardTransactionDomain>>> aVar) {
        return this.f3813a.r(i, i9, str);
    }

    @Override // M5.a
    public final Object u(String str, int i, z5.d dVar, T9.a<? super J5.a<? extends J5.b, z5.c>> aVar) {
        return this.f3813a.p(str, i, dVar);
    }

    @Override // M5.a
    public final Object v(String str, int i, T9.a<? super J5.a<? extends J5.b, h4.e>> aVar) {
        return this.f3813a.q(i, str);
    }

    @Override // M5.a
    public final Object w(String str, t5.e eVar, T9.a<? super J5.a<? extends J5.b, CardsDomain>> aVar) {
        return this.f3813a.u(str, eVar);
    }

    @Override // M5.a
    public final Object x(String str, int i, C1645a c1645a, T9.a<? super J5.a<? extends J5.b, CardsDomain>> aVar) {
        return this.f3813a.s(str, i, c1645a);
    }

    @Override // M5.a
    public final Object y(t5.g gVar, T9.a<? super J5.a<? extends J5.b, VaultDomain>> aVar) {
        return this.f3813a.x(gVar);
    }

    @Override // M5.a
    public final Object z(int i, BankTopUpRequestDomain bankTopUpRequestDomain, T9.a<? super J5.a<? extends J5.b, h4.o>> aVar) {
        return this.f3813a.l(i, bankTopUpRequestDomain);
    }
}
