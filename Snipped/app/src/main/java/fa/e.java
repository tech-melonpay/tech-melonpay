package Fa;

import Fa.j;
import javax.net.ssl.SSLSocket;

/* compiled from: AndroidSocketAdapter.kt */
/* loaded from: classes2.dex */
public final class e implements j.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1290a = "com.google.android.gms.org.conscrypt";

    @Override // Fa.j.a
    public final boolean a(SSLSocket sSLSocket) {
        return sSLSocket.getClass().getName().startsWith(this.f1290a + '.');
    }

    @Override // Fa.j.a
    public final k b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!kotlin.jvm.internal.f.b(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new f(cls2);
    }
}
