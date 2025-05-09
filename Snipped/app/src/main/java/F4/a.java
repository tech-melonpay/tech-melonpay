package F4;

import a4.g;
import a4.p;
import a4.r;
import a4.t;
import a4.u;
import a4.w;
import p4.c;
import p4.d;
import p4.e;
import qb.b;
import sb.f;
import sb.o;
import sb.s;

/* compiled from: PaymentsProxyApi.kt */
/* loaded from: classes.dex */
public interface a {
    @f("price-lists/{client_id}")
    b<e> a(@s("client_id") String str);

    @o("transactions/commissions/{client_id}/calculate")
    b<p4.a> b(@s("client_id") String str, @sb.a g gVar);

    @o("transactions/internal/{client_id}")
    b<d> c(@s("client_id") String str, @sb.a r rVar);

    @o("bankaccounts/counterparty/find")
    b<c> d(@sb.a p pVar);

    @o("transactions/to_bank_account/{client_id}")
    b<d> e(@s("client_id") String str, @sb.a u uVar);

    @o("transactions/fasterpayment/{client_id}")
    b<d> f(@s("client_id") String str, @sb.a a4.s sVar);

    @o("transactions/sepa/{client_id}")
    b<d> g(@s("client_id") String str, @sb.a t tVar);

    @o("transactions/swift/{client_id}")
    b<d> h(@s("client_id") String str, @sb.a w wVar);
}
