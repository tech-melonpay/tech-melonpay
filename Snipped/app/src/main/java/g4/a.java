package G4;

import java.util.List;
import qb.b;
import sb.f;
import sb.p;
import sb.s;

/* compiled from: PlansProxyApi.kt */
/* loaded from: classes.dex */
public interface a {
    @f("pricelists/{client_id}/active")
    b<q4.a> a(@s("client_id") String str);

    @f("pricelists/{client_id}/available")
    b<List<q4.a>> b(@s("client_id") String str);

    @p("pricelists/{client_id}/change-to/{pricelist_id}")
    b<q4.a> c(@s("client_id") String str, @s("pricelist_id") String str2);
}
