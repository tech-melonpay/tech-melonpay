package W4;

import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeCreateRequestDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptowalletDomain;
import g5.InterfaceC0766a;
import java.util.List;
import v5.C1545a;

/* compiled from: CryptowalletRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class e implements P5.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0766a f3816a;

    public e(InterfaceC0766a interfaceC0766a) {
        this.f3816a = interfaceC0766a;
    }

    @Override // P5.a
    public final Object a(int i, CryptoExchangeCreateRequestDomain cryptoExchangeCreateRequestDomain, T9.a<? super J5.a<? extends J5.b, v5.b>> aVar) {
        return this.f3816a.g(i, cryptoExchangeCreateRequestDomain);
    }

    @Override // P5.a
    public final Object b(int i, int i9, T9.a<? super J5.a<? extends J5.b, CryptowalletDomain>> aVar) {
        return this.f3816a.b(i, i9);
    }

    @Override // P5.a
    public final Object c(String str, T9.a<? super J5.a<? extends J5.b, v5.j>> aVar) {
        return this.f3816a.d(str);
    }

    @Override // P5.a
    public final Object d(int i, v5.f fVar, T9.a<? super J5.a<? extends J5.b, v5.h>> aVar) {
        return this.f3816a.e(i, fVar);
    }

    @Override // P5.a
    public final Object e(v5.e eVar, T9.a<? super J5.a<? extends J5.b, ? extends List<CryptoExchangeDomain>>> aVar) {
        return this.f3816a.i(eVar);
    }

    @Override // P5.a
    public final Object f(int i, T9.a<? super J5.a<? extends J5.b, ? extends List<CryptowalletDomain>>> aVar) {
        return this.f3816a.f(i);
    }

    @Override // P5.a
    public final Object g(int i, int i9, T9.a<? super J5.a<? extends J5.b, CryptoExchangeDomain>> aVar) {
        return this.f3816a.c(i, i9);
    }

    @Override // P5.a
    public final Object h(v5.i iVar, T9.a<? super J5.a<? extends J5.b, CryptowalletDomain>> aVar) {
        return this.f3816a.l(iVar);
    }

    @Override // P5.a
    public final Object i(int i, v5.c cVar, T9.a<? super J5.a<? extends J5.b, CryptoExchangeDomain>> aVar) {
        return this.f3816a.k(i, cVar);
    }

    @Override // P5.a
    public final Object j(v5.d dVar, T9.a<? super J5.a<? extends J5.b, CryptowalletDomain>> aVar) {
        return this.f3816a.j(dVar);
    }

    @Override // P5.a
    public final Object k(T9.a<? super J5.a<? extends J5.b, C1545a>> aVar) {
        return this.f3816a.m();
    }

    @Override // P5.a
    public final Object l(String str, String str2, T9.a<? super J5.a<? extends J5.b, CryptoExchangeDomain>> aVar) {
        return this.f3816a.a(str, str2);
    }

    @Override // P5.a
    public final Object m(int i, int i9, v5.g gVar, T9.a<? super J5.a<? extends J5.b, CryptoExchangeDomain>> aVar) {
        return this.f3816a.n(i, i9, gVar);
    }

    @Override // P5.a
    public final Object n(int i, String str, String str2, Integer num, Integer num2, T9.a<? super J5.a<? extends J5.b, CryptoExchangeDomain>> aVar) {
        return this.f3816a.h(i, str, str2, num, num2);
    }
}
