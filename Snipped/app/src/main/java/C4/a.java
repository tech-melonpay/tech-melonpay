package C4;

import a4.k;
import a4.l;
import c4.c;
import java.util.ArrayList;
import k4.C0943a;
import k4.C0944b;
import k4.C0945c;
import k4.d;
import k4.e;
import k4.g;
import l4.C0984a;
import qb.b;
import sb.f;
import sb.o;
import sb.p;
import sb.s;
import sb.t;

/* compiled from: CryptowalletProxyApi.kt */
/* loaded from: classes.dex */
public interface a {
    @f("exchangerequest/rate")
    b<k4.f> a(@t("source_ccy") String str, @t("target_ccy") String str2);

    @f("cryptowallet/get/{pk}")
    b<C0944b> b(@s("pk") int i, @t("client_id") int i9);

    @f("exchangerequest/{pk}/get")
    b<k4.f> c(@s("pk") int i, @t("client_id") int i9);

    @o("exchangerequest/create/withdraw")
    b<k4.f> d(@t("client_id") int i, @sb.a c cVar);

    @f("cryptowallet/list")
    b<C0945c> e(@t("client_id") int i, @t("per_page") int i9);

    @o("exchangerequest/create")
    b<C0943a> f(@t("client_id") int i, @sb.a c4.b bVar);

    @p("cryptowallet/edit/{pk}")
    b<C0944b> g(@s("pk") Long l10, @t("client_id") Integer num, @sb.a l lVar);

    @f("exchangerequest/list")
    b<e> h(@t("client_id") int i, @t("crypto_account_wallet_id") Integer num, @t("search_query") String str, @t("request_type_list") ArrayList<String> arrayList, @t("movement_type") String str2, @t("page") int i9, @t("per_page") Integer num2);

    @p("exchangerequest/{pk}/update")
    b<k4.f> i(@s("pk") int i, @t("client_id") int i9, @sb.a c4.e eVar);

    @f("availablecurrencies/list")
    b<C0984a> j();

    @f("exchangerequest/rates/{source}")
    b<d> k(@s("source") String str);

    @f("exchangerequest/rate/{client_id}")
    b<k4.f> l(@s("client_id") int i, @t("source_ccy") String str, @t("target_ccy") String str2, @t("source_bankaccount_id") Integer num, @t("destination_bankaccount_id") Integer num2);

    @o("cryptowallet/create")
    b<C0944b> m(@t("client_id") int i, @sb.a k kVar);

    @o("exchangerequest/preview")
    b<g> n(@t("client_id") int i, @sb.a c4.d dVar);
}
