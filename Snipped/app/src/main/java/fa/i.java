package Fa;

import Ea.d;
import Ea.h;
import Fa.j;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;

/* compiled from: ConscryptSocketAdapter.kt */
/* loaded from: classes2.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1302a = new a();

    /* compiled from: ConscryptSocketAdapter.kt */
    public static final class a implements j.a {
        @Override // Fa.j.a
        public final boolean a(SSLSocket sSLSocket) {
            boolean z10 = Ea.d.f1107d;
            return d.a.b() && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // Fa.j.a
        public final k b(SSLSocket sSLSocket) {
            return new i();
        }
    }

    @Override // Fa.k
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // Fa.k
    public final boolean b() {
        boolean z10 = Ea.d.f1107d;
        return Ea.d.f1107d;
    }

    @Override // Fa.k
    public final String c(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // Fa.k
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Ea.h hVar = Ea.h.f1121a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) h.a.a(list).toArray(new String[0]));
        }
    }
}
