package Fa;

import Ea.h;
import Fa.j;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* compiled from: BouncyCastleSocketAdapter.kt */
/* loaded from: classes2.dex */
public final class g implements k {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1297a = new a();

    /* compiled from: BouncyCastleSocketAdapter.kt */
    public static final class a implements j.a {
        @Override // Fa.j.a
        public final boolean a(SSLSocket sSLSocket) {
            return Ea.c.f1105d && (sSLSocket instanceof BCSSLSocket);
        }

        @Override // Fa.j.a
        public final k b(SSLSocket sSLSocket) {
            return new g();
        }
    }

    @Override // Fa.k
    public final boolean a(SSLSocket sSLSocket) {
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // Fa.k
    public final boolean b() {
        boolean z10 = Ea.c.f1105d;
        return Ea.c.f1105d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Fa.k
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || kotlin.jvm.internal.f.b(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Fa.k
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Ea.h hVar = Ea.h.f1121a;
            parameters.setApplicationProtocols((String[]) h.a.a(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
