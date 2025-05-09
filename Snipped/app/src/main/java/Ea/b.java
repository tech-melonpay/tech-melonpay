package Ea;

import Ea.h;
import Fa.i;
import Fa.j;
import Fa.k;
import Fa.l;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;

/* compiled from: AndroidPlatform.kt */
/* loaded from: classes2.dex */
public final class b extends h {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f1100e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1101c;

    /* renamed from: d, reason: collision with root package name */
    public final Fa.h f1102d;

    /* compiled from: AndroidPlatform.kt */
    public static final class a implements Ha.e {

        /* renamed from: a, reason: collision with root package name */
        public final X509TrustManager f1103a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f1104b;

        public a(X509TrustManager x509TrustManager, Method method) {
            this.f1103a = x509TrustManager;
            this.f1104b = method;
        }

        @Override // Ha.e
        public final X509Certificate a(X509Certificate x509Certificate) {
            try {
                return ((TrustAnchor) this.f1104b.invoke(this.f1103a, x509Certificate)).getTrustedCert();
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f1103a, aVar.f1103a) && kotlin.jvm.internal.f.b(this.f1104b, aVar.f1104b);
        }

        public final int hashCode() {
            return this.f1104b.hashCode() + (this.f1103a.hashCode() * 31);
        }

        public final String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f1103a + ", findByIssuerAndSignatureMethod=" + this.f1104b + ')';
        }
    }

    static {
        boolean z10 = false;
        if (h.a.c() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f1100e = z10;
    }

    public b() {
        l lVar;
        Method method;
        Method method2;
        int i = 0;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            lVar = new l(cls);
        } catch (Exception e10) {
            h.f1121a.getClass();
            h.i(5, "unable to load android socket classes", e10);
            lVar = null;
        }
        ArrayList o10 = P9.l.o(new k[]{lVar, new j(Fa.f.f1291f), new j(i.f1302a), new j(Fa.g.f1297a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = o10.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((k) next).b()) {
                arrayList.add(next);
            }
        }
        this.f1101c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f1102d = new Fa.h(method3, method2, method, i);
    }

    @Override // Ea.h
    public final Ha.c b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        Fa.b bVar = x509TrustManagerExtensions != null ? new Fa.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : super.b(x509TrustManager);
    }

    @Override // Ea.h
    public final Ha.e c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new a(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // Ea.h
    public final void d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        Object obj;
        Iterator it = this.f1101c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((k) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        k kVar = (k) obj;
        if (kVar != null) {
            kVar.d(sSLSocket, str, list);
        }
    }

    @Override // Ea.h
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // Ea.h
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f1101c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((k) obj).a(sSLSocket)) {
                break;
            }
        }
        k kVar = (k) obj;
        if (kVar != null) {
            return kVar.c(sSLSocket);
        }
        return null;
    }

    @Override // Ea.h
    public final Object g() {
        Fa.h hVar = this.f1102d;
        Method method = (Method) hVar.f1299b;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, null);
            ((Method) hVar.f1300c).invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // Ea.h
    public final boolean h(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // Ea.h
    public final void k(Object obj, String str) {
        Fa.h hVar = this.f1102d;
        hVar.getClass();
        if (obj != null) {
            try {
                ((Method) hVar.f1301d).invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        h.j(this, str, 5, 4);
    }
}
