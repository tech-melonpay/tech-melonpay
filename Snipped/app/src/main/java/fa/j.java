package Fa;

import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* compiled from: DeferredSocketAdapter.kt */
/* loaded from: classes2.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final a f1303a;

    /* renamed from: b, reason: collision with root package name */
    public k f1304b;

    /* compiled from: DeferredSocketAdapter.kt */
    public interface a {
        boolean a(SSLSocket sSLSocket);

        k b(SSLSocket sSLSocket);
    }

    public j(a aVar) {
        this.f1303a = aVar;
    }

    @Override // Fa.k
    public final boolean a(SSLSocket sSLSocket) {
        return this.f1303a.a(sSLSocket);
    }

    @Override // Fa.k
    public final boolean b() {
        return true;
    }

    @Override // Fa.k
    public final String c(SSLSocket sSLSocket) {
        k e10 = e(sSLSocket);
        if (e10 != null) {
            return e10.c(sSLSocket);
        }
        return null;
    }

    @Override // Fa.k
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        k e10 = e(sSLSocket);
        if (e10 != null) {
            e10.d(sSLSocket, str, list);
        }
    }

    public final synchronized k e(SSLSocket sSLSocket) {
        try {
            if (this.f1304b == null && this.f1303a.a(sSLSocket)) {
                this.f1304b = this.f1303a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f1304b;
    }
}
