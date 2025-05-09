package Ea;

import Ea.h;
import Fa.i;
import Fa.j;
import Fa.k;
import P9.l;
import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;

/* compiled from: Android10Platform.kt */
/* loaded from: classes2.dex */
public final class a extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f1098d;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1099c;

    static {
        f1098d = h.a.c() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ArrayList o10 = l.o(new k[]{(!h.a.c() || Build.VERSION.SDK_INT < 29) ? null : new Fa.a(), new j(Fa.f.f1291f), new j(i.f1302a), new j(Fa.g.f1297a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = o10.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((k) next).b()) {
                arrayList.add(next);
            }
        }
        this.f1099c = arrayList;
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
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        Object obj;
        Iterator it = this.f1099c.iterator();
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
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f1099c.iterator();
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
    @SuppressLint({"NewApi"})
    public final boolean h(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
