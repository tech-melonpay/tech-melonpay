package J4;

import a4.q;
import a4.v;
import a4.x;
import f4.d;
import f4.g;
import f4.i;
import h4.h;
import i4.c;
import i4.e;
import java.util.List;
import qb.b;
import sb.f;
import sb.n;
import sb.o;
import sb.p;
import sb.s;
import sb.t;
import sb.y;
import w4.C1569a;
import w4.C1570b;

/* compiled from: UserProxyApi.kt */
/* loaded from: classes.dex */
public interface a {
    @f("countryphones")
    b<List<c>> a();

    @o("clients/requestvalidation/email")
    b<r4.a> b();

    @f("bankaccounts/{client_id}/statistic/{account_id}")
    b<List<i>> c(@s("client_id") int i, @s("account_id") int i9, @t("period") String str, @t("date_from") String str2, @t("date_to") String str3);

    @o("kyc/random/sdktoken")
    b<g> d();

    @f("housekeeping/sysvariables/public")
    b<List<e4.c>> e();

    @o("kyc/sdktoken")
    b<g> f();

    @f("clients/requestvalidation/phone")
    b<r4.g> g(@t("area_code") String str, @t("phone_number") String str2);

    @f("corporate/email-validation")
    b<e> h(@t("email") String str);

    @o("kyc/wizard/finished")
    b<d> i();

    @f("clients/validate/email")
    b<r4.d> j(@t("code") String str);

    @f("clients/validate/phone")
    b<r4.d> k(@t("sms_code") String str);

    @o("oauth/two-factor")
    b<r4.b> l(@sb.i("Authorization") String str);

    @o("kyc/ratification/individuals/questionnaire")
    b<f4.f> m(@sb.a q qVar);

    @o("clients/resetpassword/order")
    b<r4.f> n(@sb.a v vVar);

    @f("housekeeping/system/liveness_check")
    b<C1569a> o();

    @n("clients/resetpassword/do")
    b<r4.f> p(@t("code") String str);

    @n("clients/onboarding/switch")
    b<r4.d> q(@sb.a x xVar);

    @f
    b<C1570b> r(@y String str);

    @o("clients")
    b<r4.d> s(@sb.a r4.e eVar);

    @o("oauth/token")
    b<r4.b> t(@sb.i("Authorization") String str, @sb.a r4.c cVar);

    @f("clients")
    b<r4.d> u();

    @o("clientmedia/avatars/{client_id}")
    b<h> v(@s("client_id") String str, @sb.a a4.o oVar);

    @sb.b("clientmedia/avatars/{client_id}")
    b<h> w(@s("client_id") String str);

    @p("clients")
    b<r4.d> x(@sb.a r4.e eVar);

    @sb.b("clients")
    b<r4.d> y();

    @p("clients/changepassword")
    b<r4.f> z(@sb.a a4.f fVar);
}
