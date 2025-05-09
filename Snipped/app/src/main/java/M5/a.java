package M5;

import J5.b;
import com.luminary.business.domain.entity.account.CardsDomain;
import com.luminary.business.domain.entity.cards.BankTopUpRequestDomain;
import com.luminary.business.domain.entity.cards.CardTransactionDomain;
import com.luminary.business.domain.entity.cards.DailyLimitDomain;
import com.luminary.business.domain.entity.cards.TopUpCommissionDomain;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.business.domain.entity.cards.VaultTopUpRequestDomain;
import h4.e;
import h4.i;
import h4.o;
import java.util.List;
import t5.C1280a;
import t5.c;
import t5.f;
import t5.g;
import t5.j;
import z5.C1645a;
import z5.d;

/* compiled from: CardRepository.kt */
/* loaded from: classes.dex */
public interface a {
    Object a(int i, T9.a<? super J5.a<? extends b, ? extends List<i>>> aVar);

    Object b(int i, BankTopUpRequestDomain bankTopUpRequestDomain, T9.a<? super J5.a<? extends b, TopUpCommissionDomain>> aVar);

    Object c(String str, String str2, c cVar, T9.a<? super J5.a<? extends b, j>> aVar);

    Object d(String str, String str2, T9.a<? super J5.a<? extends b, CardsDomain>> aVar);

    Object e(String str, String str2, T9.a<? super J5.a<? extends b, CardsDomain>> aVar);

    Object f(String str, int i, int i9, T9.a<? super J5.a<? extends b, ? extends List<CardTransactionDomain>>> aVar);

    Object g(String str, Integer num, Boolean bool, T9.a<? super J5.a<? extends b, ? extends List<CardsDomain>>> aVar);

    Object h(String str, String str2, T9.a<? super J5.a<? extends b, ? extends List<F5.b>>> aVar);

    Object i(String str, int i, T9.a<? super J5.a<? extends b, z5.c>> aVar);

    Object j(String str, String str2, T9.a<? super J5.a<? extends b, CardsDomain>> aVar);

    Object k(String str, t5.b bVar, T9.a<? super J5.a<? extends b, TopUpCommissionDomain>> aVar);

    Object l(int i, VaultTopUpRequestDomain vaultTopUpRequestDomain, T9.a<? super J5.a<? extends b, o>> aVar);

    Object m(T9.a aVar);

    Object n(String str, C1280a c1280a, T9.a<? super J5.a<? extends b, VaultDomain>> aVar);

    Object o(t5.i iVar, T9.a<? super J5.a<? extends b, CardsDomain>> aVar);

    Object p(String str, int i, T9.a<? super J5.a<? extends b, DailyLimitDomain>> aVar);

    Object q(String str, String str2, T9.a<? super J5.a<? extends b, CardsDomain>> aVar);

    Object r(String str, T9.a<? super J5.a<? extends b, ? extends List<VaultDomain>>> aVar);

    Object s(f fVar, T9.a<? super J5.a<? extends b, CardsDomain>> aVar);

    Object t(String str, int i, int i9, T9.a<? super J5.a<? extends b, ? extends List<CardTransactionDomain>>> aVar);

    Object u(String str, int i, d dVar, T9.a<? super J5.a<? extends b, z5.c>> aVar);

    Object v(String str, int i, T9.a<? super J5.a<? extends b, e>> aVar);

    Object w(String str, t5.e eVar, T9.a<? super J5.a<? extends b, CardsDomain>> aVar);

    Object x(String str, int i, C1645a c1645a, T9.a<? super J5.a<? extends b, CardsDomain>> aVar);

    Object y(g gVar, T9.a<? super J5.a<? extends b, VaultDomain>> aVar);

    Object z(int i, BankTopUpRequestDomain bankTopUpRequestDomain, T9.a<? super J5.a<? extends b, o>> aVar);
}
