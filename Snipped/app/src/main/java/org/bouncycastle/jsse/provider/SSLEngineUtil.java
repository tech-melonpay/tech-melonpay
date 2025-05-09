package org.bouncycastle.jsse.provider;

import java.lang.reflect.Method;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import org.bouncycastle.jsse.BCExtendedSSLSession;
import org.bouncycastle.jsse.BCSSLEngine;
import org.bouncycastle.jsse.BCSSLParameters;

/* loaded from: classes.dex */
abstract class SSLEngineUtil {
    private static final Method getHandshakeSession;
    private static final Method getSSLParameters;

    static {
        Method[] methods = ReflectionUtil.getMethods("javax.net.ssl.SSLEngine");
        getHandshakeSession = ReflectionUtil.findMethod(methods, "getHandshakeSession");
        getSSLParameters = ReflectionUtil.findMethod(methods, "getSSLParameters");
    }

    public static SSLEngine create(ProvSSLContextSpi provSSLContextSpi, ContextData contextData) {
        return new ProvSSLEngine(provSSLContextSpi, contextData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BCExtendedSSLSession importHandshakeSession(SSLEngine sSLEngine) {
        Method method;
        if (sSLEngine instanceof BCSSLEngine) {
            return ((BCSSLEngine) sSLEngine).getBCHandshakeSession();
        }
        if (sSLEngine == 0 || (method = getHandshakeSession) == null) {
            return null;
        }
        try {
            SSLSession sSLSession = (SSLSession) ReflectionUtil.invokeGetter(sSLEngine, method);
            if (sSLSession != null) {
                return SSLSessionUtil.importSSLSession(sSLSession);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BCSSLParameters importSSLParameters(SSLEngine sSLEngine) {
        Method method;
        if (sSLEngine instanceof BCSSLEngine) {
            return ((BCSSLEngine) sSLEngine).getParameters();
        }
        if (sSLEngine == 0 || (method = getSSLParameters) == null) {
            return null;
        }
        try {
            SSLParameters sSLParameters = (SSLParameters) ReflectionUtil.invokeGetter(sSLEngine, method);
            if (sSLParameters != null) {
                return SSLParametersUtil.importSSLParameters(sSLParameters);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static SSLEngine create(ProvSSLContextSpi provSSLContextSpi, ContextData contextData, String str, int i) {
        return new ProvSSLEngine(provSSLContextSpi, contextData, str, i);
    }
}
