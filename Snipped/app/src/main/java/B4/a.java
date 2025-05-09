package B4;

import c4.C0624a;
import j4.C0896a;
import java.util.List;
import qb.b;
import sb.f;
import sb.o;
import sb.s;

/* compiled from: CryptoAccountProxyApi.kt */
/* loaded from: classes.dex */
public interface a {
    @f("cryptoaccount/wallet/{client_id}/details/{wallet_id}")
    b<C0896a> a(@s("client_id") int i, @s("wallet_id") int i9);

    @f("cryptoaccount/wallet/{client_id}")
    b<List<C0896a>> b(@s("client_id") int i);

    @o("cryptoaccount/wallet/{client_id}")
    b<C0896a> c(@s("client_id") int i, @sb.a C0624a c0624a);
}
