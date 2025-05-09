package X4;

import I5.j;
import J5.a;
import J5.b;
import ca.InterfaceC0646l;
import com.google.firebase.messaging.ServiceStarter;
import com.google.gson.g;
import e4.C0715a;
import java.net.SocketTimeoutException;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.p;
import qb.b;
import qb.q;
import r5.C1150a;
import va.i;

/* compiled from: RetrofitExt.kt */
/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static J5.a a(b bVar, g gVar, boolean z10, InterfaceC0646l interfaceC0646l) {
        a.C0026a c0026a;
        J5.a c0026a2;
        a.C0026a c0026a3;
        try {
            q execute = bVar.execute();
            boolean j10 = execute.f26065a.j();
            p pVar = execute.f26065a;
            if (j10) {
                if (!j10) {
                    throw new NoWhenBranchMatchedException();
                }
                T t3 = execute.f26066b;
                if (t3 == 0 && z10) {
                    return new a.C0026a(new b.d(-1));
                }
                int i = pVar.f24674d;
                if (i == 203) {
                    if ((t3 instanceof C0715a) && ((C0715a) t3).a() != null) {
                        b.f fVar = new b.f(i, ((C0715a) t3).a());
                        fVar.f2158c = pVar.f24671a.f24644a.b();
                        c0026a3 = new a.C0026a(fVar);
                    } else if (t3 instanceof r4.b) {
                        b.e eVar = new b.e(i, ((r4.b) t3).b());
                        eVar.f2155c = "two-factor";
                        c0026a3 = new a.C0026a(eVar);
                    } else {
                        c0026a3 = new a.C0026a(new b.d(-1));
                    }
                    c0026a2 = c0026a3;
                } else {
                    String a10 = pVar.f24676f.a("date");
                    if (t3 != 0) {
                        Object invoke = interfaceC0646l.invoke(t3);
                        j jVar = invoke instanceof j ? (j) invoke : null;
                        if (jVar != null) {
                            jVar.f1794j = a10;
                        }
                        c0026a2 = new a.b(invoke);
                    } else {
                        c0026a2 = new a.C0026a(new b.d(-1));
                    }
                }
            } else {
                if (pVar.f24674d == 502) {
                    return new a.C0026a(new b.c("Request error. Try again later"));
                }
                i iVar = execute.f26067c;
                String y10 = iVar != null ? iVar.y() : null;
                int i9 = pVar.f24674d;
                if (y10 == null || y10.length() <= 0) {
                    c0026a2 = new a.C0026a(new b.d(i9));
                } else {
                    try {
                        try {
                            C1150a c1150a = (C1150a) gVar.b(C1150a.class, y10);
                            c0026a2 = c1150a.a() != null ? new a.C0026a(new b.a(i9, c1150a)) : new a.C0026a(new b.C0027b(i9, (r5.b) gVar.b(r5.b.class, y10)));
                        } catch (Exception unused) {
                            c0026a2 = new a.C0026a(new b.C0027b(i9, (r5.b) gVar.b(r5.b.class, y10)));
                        }
                    } catch (Exception unused2) {
                        c0026a2 = new a.C0026a(new b.d(i9));
                    }
                }
            }
            return c0026a2;
        } catch (SocketTimeoutException e10) {
            e10.printStackTrace();
            e10.getMessage();
            c0026a = new a.C0026a(new b.d(ServiceStarter.ERROR_UNKNOWN));
            return c0026a;
        } catch (Exception e11) {
            e11.printStackTrace();
            e11.getMessage();
            c0026a = new a.C0026a(new b.d(-1));
            return c0026a;
        }
    }
}
