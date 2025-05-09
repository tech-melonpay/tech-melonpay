package P5;

import J5.b;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeCreateRequestDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptowalletDomain;
import java.util.List;
import v5.C1545a;
import v5.c;
import v5.d;
import v5.e;
import v5.f;
import v5.g;
import v5.h;
import v5.i;
import v5.j;

/* compiled from: CryptowalletRepository.kt */
/* loaded from: classes.dex */
public interface a {
    Object a(int i, CryptoExchangeCreateRequestDomain cryptoExchangeCreateRequestDomain, T9.a<? super J5.a<? extends b, v5.b>> aVar);

    Object b(int i, int i9, T9.a<? super J5.a<? extends b, CryptowalletDomain>> aVar);

    Object c(String str, T9.a<? super J5.a<? extends b, j>> aVar);

    Object d(int i, f fVar, T9.a<? super J5.a<? extends b, h>> aVar);

    Object e(e eVar, T9.a<? super J5.a<? extends b, ? extends List<CryptoExchangeDomain>>> aVar);

    Object f(int i, T9.a<? super J5.a<? extends b, ? extends List<CryptowalletDomain>>> aVar);

    Object g(int i, int i9, T9.a<? super J5.a<? extends b, CryptoExchangeDomain>> aVar);

    Object h(i iVar, T9.a<? super J5.a<? extends b, CryptowalletDomain>> aVar);

    Object i(int i, c cVar, T9.a<? super J5.a<? extends b, CryptoExchangeDomain>> aVar);

    Object j(d dVar, T9.a<? super J5.a<? extends b, CryptowalletDomain>> aVar);

    Object k(T9.a<? super J5.a<? extends b, C1545a>> aVar);

    Object l(String str, String str2, T9.a<? super J5.a<? extends b, CryptoExchangeDomain>> aVar);

    Object m(int i, int i9, g gVar, T9.a<? super J5.a<? extends b, CryptoExchangeDomain>> aVar);

    Object n(int i, String str, String str2, Integer num, Integer num2, T9.a<? super J5.a<? extends b, CryptoExchangeDomain>> aVar);
}
