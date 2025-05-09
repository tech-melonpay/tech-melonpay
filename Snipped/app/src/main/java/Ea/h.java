package Ea;

import P9.n;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;

/* compiled from: Platform.kt */
/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static volatile h f1121a;

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f1122b;

    /* compiled from: Platform.kt */
    public static final class a {
        public static ArrayList a(List list) {
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
            return arrayList2;
        }

        public static byte[] b(List list) {
            Ka.f fVar = new Ka.f();
            Iterator it = a(list).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                fVar.W(str.length());
                fVar.n0(0, str.length(), str);
            }
            return fVar.E(fVar.f2294b);
        }

        public static boolean c() {
            return kotlin.jvm.internal.f.b("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
    
        if (r0 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00af, code lost:
    
        if (r0 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d0, code lost:
    
        if (r0 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f1, code lost:
    
        if (java.lang.Integer.parseInt(java.lang.System.getProperty("java.specification.version", "unknown")) >= 9) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0136  */
    static {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ea.h.<clinit>():void");
    }

    public static void i(int i, String str, Throwable th) {
        f1122b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public static /* synthetic */ void j(h hVar, String str, int i, int i9) {
        if ((i9 & 2) != 0) {
            i = 4;
        }
        hVar.getClass();
        i(i, str, null);
    }

    public Ha.c b(X509TrustManager x509TrustManager) {
        return new Ha.a(c(x509TrustManager));
    }

    public Ha.e c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new Ha.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f1122b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        return true;
    }

    public void k(Object obj, String str) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(5, str, (Throwable) obj);
    }

    public SSLContext l() {
        return SSLContext.getInstance("TLS");
    }

    public SSLSocketFactory m(X509TrustManager x509TrustManager) {
        try {
            SSLContext l10 = l();
            l10.init(null, new TrustManager[]{x509TrustManager}, null);
            return l10.getSocketFactory();
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager n() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void d(SSLSocket sSLSocket, String str, List<Protocol> list) {
    }
}
