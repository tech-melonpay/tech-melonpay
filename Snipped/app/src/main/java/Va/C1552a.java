package va;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.EmptyList;
import okhttp3.p;

/* compiled from: Authenticator.kt */
/* renamed from: va.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1552a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1552a f30674a = new C1552a();

    /* renamed from: b, reason: collision with root package name */
    public static final C1552a f30675b = new C1552a();

    /* renamed from: c, reason: collision with root package name */
    public static final C1552a f30676c = new C1552a();

    public EmptyList b() {
        return EmptyList.f23104a;
    }

    public List c(String str) {
        try {
            return P9.l.u(InetAddress.getAllByName(str));
        } catch (NullPointerException e10) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e10);
            throw unknownHostException;
        }
    }

    public void a(k kVar, p pVar) {
    }
}
