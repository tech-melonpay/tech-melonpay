package A4;

import a4.C0510a;
import a4.c;
import a4.e;
import a4.h;
import a4.n;
import a4.y;
import i4.C0821a;
import i4.d;
import java.util.List;
import qb.b;
import sb.f;
import sb.o;
import sb.p;
import sb.s;
import sb.t;

/* compiled from: CompanyProxyApi.kt */
/* loaded from: classes.dex */
public interface a {
    @f("clientmedia/documents/{client_id}/list")
    b<List<i4.f>> a(@s("client_id") String str);

    @f("corporate/companies/{company_id}")
    b<i4.b> b(@s("company_id") String str);

    @p("corporate/companies/{company_id}")
    b<i4.b> c(@s("company_id") String str, @sb.a a4.b bVar);

    @o("corporate/companies")
    b<i4.b> d(@sb.a d dVar);

    @f("getcompany/search/regnumber")
    b<C0821a> e(@t("crn") String str);

    @o("corporate/team/{company_id}/beneficialowner")
    b<i4.b> f(@s("company_id") String str, @sb.a a4.d dVar);

    @f("corporate/companies")
    b<List<i4.b>> g();

    @o("clientmedia/documents/{client_id}")
    b<i4.f> h(@s("client_id") String str, @sb.a y yVar);

    @p("corporate/companies/{company_id}")
    b<i4.b> i(@s("company_id") String str, @sb.a e eVar);

    @p("corporate/companies/{company_id}")
    b<i4.b> j(@s("company_id") String str, @sb.a n nVar);

    @p("corporate/companies/{company_id}")
    b<i4.b> k(@s("company_id") String str, @sb.a C0510a c0510a);

    @p("corporate/status/companies/{company_id}")
    b<i4.b> l(@s("company_id") String str, @sb.a h hVar);

    @p("corporate/companies/{company_id}")
    b<i4.b> m(@s("company_id") String str, @sb.a d dVar);

    @p("corporate/companies/{company_id}")
    b<i4.b> n(@s("company_id") String str, @sb.a c cVar);

    @p("corporate/team/{company_id}/beneficialowner/{member_id}")
    b<i4.b> o(@s("company_id") String str, @s("member_id") String str2, @sb.a a4.d dVar);
}
