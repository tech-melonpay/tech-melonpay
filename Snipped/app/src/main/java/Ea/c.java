package Ea;

import P9.n;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* compiled from: BouncyCastlePlatform.kt */
/* loaded from: classes2.dex */
public final class c extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f1105d;

    /* renamed from: c, reason: collision with root package name */
    public final BouncyCastleJsseProvider f1106c = new BouncyCastleJsseProvider();

    /* compiled from: BouncyCastlePlatform.kt */
    public static final class a {
    }

    static {
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, a.class.getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f1105d = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ea.h
    public final void d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(n.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).f24425a);
            }
            parameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ea.h
    public final String f(SSLSocket sSLSocket) {
        String applicationProtocol;
        if (!(sSLSocket instanceof BCSSLSocket) || (applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol()) == null || kotlin.jvm.internal.f.b(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // Ea.h
    public final SSLContext l() {
        return SSLContext.getInstance("TLS", this.f1106c);
    }

    @Override // Ea.h
    public final X509TrustManager n() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", BouncyCastleJsseProvider.PROVIDER_NAME);
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        throw new IllegalStateException("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)).toString());
    }
}
