package y4;

import a4.i;
import a4.m;
import f4.C0744a;
import f4.h;
import i4.c;
import java.util.List;
import qb.b;
import sb.f;
import sb.o;
import sb.p;
import sb.s;
import sb.t;

/* compiled from: AccountProxyApi.kt */
/* renamed from: y4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1613a {
    @f("bankaccounts/search/internal")
    b<f4.b> a(@t("by_bank_id") String str);

    @f("allcountries")
    b<List<c>> b();

    @o("bankaccounts/new/{client_id}")
    b<f4.c> c(@s("client_id") String str, @sb.a i iVar);

    @p("bankaccounts/{client_id}/details/{account_id}")
    b<C0744a> d(@s("client_id") String str, @s("account_id") String str2, @sb.a m mVar);

    @f("bankaccounts/pendingfees/{client_id}")
    b<h> e(@s("client_id") int i);

    @f("bankaccounts/{client_id}")
    b<List<C0744a>> f(@s("client_id") String str);

    @f("bankaccounts/{client_id}/details/{account_id}")
    b<C0744a> g(@s("client_id") String str, @s("account_id") String str2);
}
