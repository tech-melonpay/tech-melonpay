package Fa;

import Ea.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import ka.C0956a;
import okhttp3.Protocol;

/* compiled from: AndroidSocketAdapter.kt */
/* loaded from: classes2.dex */
public class f implements k {

    /* renamed from: f, reason: collision with root package name */
    public static final e f1291f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final Class<? super SSLSocket> f1292a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1293b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f1294c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f1295d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f1296e;

    public f(Class<? super SSLSocket> cls) {
        this.f1292a = cls;
        this.f1293b = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        this.f1294c = cls.getMethod("setHostname", String.class);
        this.f1295d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f1296e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // Fa.k
    public final boolean a(SSLSocket sSLSocket) {
        return this.f1292a.isInstance(sSLSocket);
    }

    @Override // Fa.k
    public final boolean b() {
        boolean z10 = Ea.b.f1100e;
        return Ea.b.f1100e;
    }

    @Override // Fa.k
    public final String c(SSLSocket sSLSocket) {
        if (!this.f1292a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f1295d.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, C0956a.f23054b);
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && kotlin.jvm.internal.f.b(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // Fa.k
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        if (this.f1292a.isInstance(sSLSocket)) {
            try {
                this.f1293b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f1294c.invoke(sSLSocket, str);
                }
                Method method = this.f1296e;
                Ea.h hVar = Ea.h.f1121a;
                method.invoke(sSLSocket, h.a.b(list));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
