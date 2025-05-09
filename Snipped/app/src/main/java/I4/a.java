package I4;

import a4.z;
import java.util.ArrayList;
import sb.b;
import sb.f;
import sb.o;
import sb.s;
import sb.t;
import sb.w;
import u4.C1519a;
import u4.C1520b;
import u4.c;
import v4.d;
import va.i;

/* compiled from: StatementsProxyApi.kt */
/* loaded from: classes.dex */
public interface a {
    @b("transactions/invoices/{tx_id}/remove")
    qb.b<C1520b> a(@s("tx_id") String str);

    @f("transactions/{client_id}/details/{provider_tx_id}")
    qb.b<C1520b> b(@s("client_id") String str, @s("provider_tx_id") String str2);

    @f("paytemplates/{client_id}/search")
    qb.b<d> c(@s("client_id") String str, @t("payment_method") String str2, @t("name") String str3, @t("email") String str4, @t("to_account") String str5);

    @w
    @f("statements/cryptowallet/{wallet_id}/{client_id}")
    qb.b<c> d(@s("wallet_id") String str, @s("client_id") String str2, @t("client_timezone") String str3, @t("from_date") String str4, @t("to_date") String str5, @t("file_format") String str6);

    @w
    @f("transactions/{transactions_id}/companies/{company_id}/statement")
    qb.b<c> e(@s("transactions_id") String str, @s("company_id") String str2);

    @w
    @f("transactions/invoices/{tx_id}/download")
    qb.b<i> f(@sb.i("Authorization") String str, @s("tx_id") String str2, @t("get_preview") boolean z10);

    @f("transactions/{BankAccountId}")
    qb.b<V4.a> g(@s("BankAccountId") String str, @t("invoiced_only") Boolean bool, @t("created_from_date") String str2, @t("created_to_date") String str3, @t("direction") String str4, @t("sort_by_created_time") String str5, @t("sort_by_amount") String str6, @t("account_number") String str7, @t("exclude_payment_method") ArrayList<String> arrayList, @t("page") int i, @t("per_page") int i9);

    @f("paytemplates/{client_id}/check/global-requisites")
    qb.b<C1519a> h(@s("client_id") String str, @t("country") String str2, @t("currency") String str3);

    @f("paytemplates/{client_id}/list")
    qb.b<v4.c> i(@s("client_id") String str, @t("per_page") int i, @t("currency") String str2, @t("payment_method") String str3);

    @w
    @f("exchangerequest/{pk}/exchange/{client_id}/statement")
    qb.b<c> j(@s("pk") String str, @s("client_id") String str2);

    @w
    @f("statements/vault/{vault_id}/{client_id}")
    qb.b<c> k(@s("vault_id") String str, @s("client_id") String str2, @t("client_timezone") String str3, @t("from_date") String str4, @t("to_date") String str5, @t("file_format") String str6);

    @w
    @f("statements/card/{card_id}/{client_id}")
    qb.b<c> l(@s("card_id") String str, @s("client_id") String str2, @t("client_timezone") String str3, @t("from_date") String str4, @t("to_date") String str5, @t("file_format") String str6);

    @o("transactions/invoices/{client_id}/upload")
    qb.b<C1520b> m(@s("client_id") String str, @sb.a z zVar);

    @w
    @f("statements/account/{account_id}/{client_id}")
    qb.b<c> n(@s("account_id") String str, @s("client_id") String str2, @t("client_timezone") String str3, @t("from_date") String str4, @t("to_date") String str5, @t("file_format") String str6);
}
