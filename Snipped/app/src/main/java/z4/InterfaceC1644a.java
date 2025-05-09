package z4;

import b4.C0587a;
import b4.c;
import b4.e;
import b4.g;
import b4.h;
import d4.C0685a;
import h4.d;
import h4.j;
import h4.q;
import java.util.List;
import qb.b;
import sb.f;
import sb.n;
import sb.o;
import sb.p;
import sb.s;
import sb.t;
import v4.C1544a;

/* compiled from: CardApi.kt */
/* renamed from: z4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1644a {
    @n("cards/edit/{clientId}/freeze/{cardId}")
    b<d> a(@s("clientId") String str, @s("cardId") String str2);

    @n("cards/edit/{clientId}/close/{cardId}")
    b<d> b(@s("clientId") String str, @s("cardId") String str2);

    @n("cards/edit/{clientId}/unfreeze/{cardId}")
    b<d> c(@s("clientId") String str, @s("cardId") String str2);

    @f("cards/vaults/{clientId}/list")
    b<List<q>> d(@s("clientId") String str);

    @o("cards/card/{clientId}/get_commission")
    b<h4.n> e(@s("clientId") String str, @sb.a c cVar);

    @o("cards/vaults/{clientId}/card-on-vault/{vaultId}")
    b<g4.d> f(@s("clientId") String str, @s("vaultId") String str2, @sb.a b4.d dVar);

    @f("clientcardprograms/list/{clientId}")
    b<List<j>> g(@s("clientId") String str);

    @p("cards/vault/{clientId}/edit/{vaultId}")
    b<q> h(@s("clientId") String str, @s("vaultId") int i, @sb.a b4.f fVar);

    @o("cards/new/{clientId}")
    b<d> i(@s("clientId") String str, @sb.a a4.j jVar);

    @p("cards/card/{clientId}/edit/{cardId}")
    b<d> j(@s("clientId") String str, @s("cardId") String str2, @sb.a e eVar);

    @o("cards/topups/vault/{clientId}")
    b<h4.p> k(@s("clientId") String str, @sb.a h hVar);

    @o("cards/topups/bank/{clientId}/calculate_commission")
    b<h4.n> l(@s("clientId") String str, @sb.a C0587a c0587a);

    @f("cards/topups/bank/{clientId}/instant_limit/{vaultId}")
    b<h4.f> m(@s("clientId") String str, @s("vaultId") int i);

    @o("cards/card/{clientId}/new")
    b<q> n(@s("clientId") String str, @sb.a b4.b bVar);

    @f("cards/card/{clientId}/details/{cardId}")
    b<d> o(@s("clientId") String str, @s("cardId") String str2);

    @p("cards/card/{clientId}/3d-secure/{cardId}")
    b<d> p(@s("clientId") String str, @s("cardId") int i, @sb.a g gVar);

    @o("cards/topups/bank/{clientId}")
    b<h4.p> q(@s("clientId") String str, @sb.a C0587a c0587a);

    @f("cards/transactions/{clientId}/onvault/{vaultId}")
    b<g4.b> r(@s("clientId") String str, @s("vaultId") int i, @t("page") int i9, @t("per_page") int i10);

    @f("cards/transactions/{clientId}/oncard/{cardId}")
    b<g4.b> s(@s("clientId") String str, @s("cardId") int i, @t("page") int i9, @t("per_page") int i10);

    @p("cards/card/{clientId}/restrictions/{cardId}")
    b<d> t(@s("clientId") String str, @s("cardId") int i, @sb.a C0685a c0685a);

    @f("cards/card/limits/{clientId}/get/{cardId}")
    b<n4.b> u(@s("clientId") String str, @s("cardId") int i);

    @f("cards/transactions/list/{clientId}")
    b<C1544a> v(@s("clientId") String str, @t("card_id") String str2);

    @f("cards/card/{clientId}/list")
    b<List<d>> w(@s("clientId") String str, @t("vault_id") Integer num, @t("show_closed") Boolean bool);

    @p("cards/card/limits/{clientId}/set/{cardId}")
    b<n4.b> x(@s("clientId") String str, @s("cardId") int i, @sb.a d4.b bVar);

    @f("cards/card/{clientId}/pancvv/{cardId}")
    b<g4.c> y(@s("clientId") String str, @s("cardId") int i);
}
