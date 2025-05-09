package org.bouncycastle.jsse.provider;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCExtendedSSLSession;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
abstract class SSLSocketUtil {
    private static final Method getHandshakeSession;
    private static final Method getSSLParameters;

    static {
        Method[] methods = ReflectionUtil.getMethods("javax.net.ssl.SSLSocket");
        getHandshakeSession = ReflectionUtil.findMethod(methods, "getHandshakeSession");
        getSSLParameters = ReflectionUtil.findMethod(methods, "getSSLParameters");
    }

    public static ProvSSLSocketDirect create(ProvSSLContextSpi provSSLContextSpi, ContextData contextData) {
        return new ProvSSLSocketDirect(provSSLContextSpi, contextData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BCExtendedSSLSession importHandshakeSession(SSLSocket sSLSocket) {
        Method method;
        if (sSLSocket instanceof BCSSLSocket) {
            return ((BCSSLSocket) sSLSocket).getBCHandshakeSession();
        }
        if (sSLSocket == 0 || (method = getHandshakeSession) == null) {
            return null;
        }
        try {
            SSLSession sSLSession = (SSLSession) ReflectionUtil.invokeGetter(sSLSocket, method);
            if (sSLSession != null) {
                return SSLSessionUtil.importSSLSession(sSLSession);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BCSSLParameters importSSLParameters(SSLSocket sSLSocket) {
        Method method;
        if (sSLSocket instanceof BCSSLSocket) {
            return ((BCSSLSocket) sSLSocket).getParameters();
        }
        if (sSLSocket == 0 || (method = getSSLParameters) == null) {
            return null;
        }
        try {
            SSLParameters sSLParameters = (SSLParameters) ReflectionUtil.invokeGetter(sSLSocket, method);
            if (sSLParameters != null) {
                return SSLParametersUtil.importSSLParameters(sSLParameters);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static ProvSSLSocketDirect create(ProvSSLContextSpi provSSLContextSpi, ContextData contextData, String str, int i) {
        return new ProvSSLSocketDirect(provSSLContextSpi, contextData, str, i);
    }

    public static ProvSSLSocketDirect create(ProvSSLContextSpi provSSLContextSpi, ContextData contextData, String str, int i, InetAddress inetAddress, int i9) {
        return new ProvSSLSocketDirect(provSSLContextSpi, contextData, str, i, inetAddress, i9);
    }

    public static ProvSSLSocketDirect create(ProvSSLContextSpi provSSLContextSpi, ContextData contextData, InetAddress inetAddress, int i) {
        return new ProvSSLSocketDirect(provSSLContextSpi, contextData, inetAddress, i);
    }

    public static ProvSSLSocketDirect create(ProvSSLContextSpi provSSLContextSpi, ContextData contextData, InetAddress inetAddress, int i, InetAddress inetAddress2, int i9) {
        return new ProvSSLSocketDirect(provSSLContextSpi, contextData, inetAddress, i, inetAddress2, i9);
    }

    public static ProvSSLSocketDirect create(ProvSSLContextSpi provSSLContextSpi, ContextData contextData, boolean z10, boolean z11, ProvSSLParameters provSSLParameters) {
        return new ProvSSLSocketDirect(provSSLContextSpi, contextData, z10, z11, provSSLParameters);
    }

    public static ProvSSLSocketWrap create(ProvSSLContextSpi provSSLContextSpi, ContextData contextData, Socket socket, InputStream inputStream, boolean z10) {
        return new ProvSSLSocketWrap(provSSLContextSpi, contextData, socket, inputStream, z10);
    }

    public static ProvSSLSocketWrap create(ProvSSLContextSpi provSSLContextSpi, ContextData contextData, Socket socket, String str, int i, boolean z10) {
        return new ProvSSLSocketWrap(provSSLContextSpi, contextData, socket, str, i, z10);
    }
}
