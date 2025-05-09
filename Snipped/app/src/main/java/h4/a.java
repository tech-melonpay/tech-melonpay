package H4;

import qb.b;
import sb.f;
import sb.i;
import sb.o;
import sb.p;
import sb.s;
import t4.c;

/* compiled from: SignerProxyApi.kt */
/* loaded from: classes.dex */
public interface a {
    @f("signer/devices/{client_id}/list")
    b<t4.a> a(@s("client_id") String str);

    @f("signer/init/{client_id}/qrcode")
    b<c> b(@s("client_id") String str);

    @o("signer/totpcode/create")
    b<r5.c> c();

    @p("signer/exchangerequests/{client_id}/sign/{ex_request_id}")
    b<k4.f> d(@i("X-TFA-CODE") String str, @s("client_id") int i, @s("ex_request_id") int i9);
}
