package org.bouncycastle.jsse.provider;

import java.lang.reflect.Constructor;
import javax.net.ssl.SSLSession;
import org.bouncycastle.jsse.BCExtendedSSLSession;

/* loaded from: classes.dex */
abstract class SSLSessionUtil {
    private static final Constructor<? extends SSLSession> exportSSLSessionConstructor;
    private static final Class<?> extendedSSLSessionClass;
    private static final Constructor<? extends BCExtendedSSLSession> importSSLSessionConstructor;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.String r0 = "getRequestedServerNames"
            java.lang.String r1 = "javax.net.ssl.ExtendedSSLSession"
            r2 = 0
            java.lang.Class r3 = org.bouncycastle.jsse.provider.ReflectionUtil.getClass(r1)     // Catch: java.lang.Exception -> La
            goto Lb
        La:
            r3 = r2
        Lb:
            org.bouncycastle.jsse.provider.SSLSessionUtil.extendedSSLSessionClass = r3
            java.lang.reflect.Method[] r3 = org.bouncycastle.jsse.provider.ReflectionUtil.getMethods(r1)     // Catch: java.lang.Exception -> L29
            if (r3 == 0) goto L29
            boolean r3 = org.bouncycastle.jsse.provider.ReflectionUtil.hasMethod(r3, r0)     // Catch: java.lang.Exception -> L29
            if (r3 == 0) goto L1c
            java.lang.String r3 = "org.bouncycastle.jsse.provider.ExportSSLSession_8"
            goto L1e
        L1c:
            java.lang.String r3 = "org.bouncycastle.jsse.provider.ExportSSLSession_7"
        L1e:
            java.lang.Class<org.bouncycastle.jsse.BCExtendedSSLSession> r4 = org.bouncycastle.jsse.BCExtendedSSLSession.class
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Exception -> L29
            java.lang.reflect.Constructor r3 = org.bouncycastle.jsse.provider.ReflectionUtil.getDeclaredConstructor(r3, r4)     // Catch: java.lang.Exception -> L29
            goto L2a
        L29:
            r3 = r2
        L2a:
            org.bouncycastle.jsse.provider.SSLSessionUtil.exportSSLSessionConstructor = r3
            java.lang.Class<?> r3 = org.bouncycastle.jsse.provider.SSLSessionUtil.extendedSSLSessionClass
            if (r3 == 0) goto L49
            java.lang.reflect.Method[] r1 = org.bouncycastle.jsse.provider.ReflectionUtil.getMethods(r1)     // Catch: java.lang.Exception -> L49
            if (r1 == 0) goto L49
            boolean r0 = org.bouncycastle.jsse.provider.ReflectionUtil.hasMethod(r1, r0)     // Catch: java.lang.Exception -> L49
            if (r0 == 0) goto L3f
            java.lang.String r0 = "org.bouncycastle.jsse.provider.ImportSSLSession_8"
            goto L41
        L3f:
            java.lang.String r0 = "org.bouncycastle.jsse.provider.ImportSSLSession_7"
        L41:
            java.lang.Class[] r1 = new java.lang.Class[]{r3}     // Catch: java.lang.Exception -> L49
            java.lang.reflect.Constructor r2 = org.bouncycastle.jsse.provider.ReflectionUtil.getDeclaredConstructor(r0, r1)     // Catch: java.lang.Exception -> L49
        L49:
            org.bouncycastle.jsse.provider.SSLSessionUtil.importSSLSessionConstructor = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jsse.provider.SSLSessionUtil.<clinit>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SSLSession exportSSLSession(BCExtendedSSLSession bCExtendedSSLSession) {
        if (bCExtendedSSLSession instanceof ImportSSLSession) {
            return ((ImportSSLSession) bCExtendedSSLSession).unwrap();
        }
        Constructor<? extends SSLSession> constructor = exportSSLSessionConstructor;
        if (constructor != null) {
            try {
                return constructor.newInstance(bCExtendedSSLSession);
            } catch (Exception unused) {
            }
        }
        return new ExportSSLSession_5(bCExtendedSSLSession);
    }

    public static BCExtendedSSLSession importSSLSession(SSLSession sSLSession) {
        if (sSLSession instanceof BCExtendedSSLSession) {
            return (BCExtendedSSLSession) sSLSession;
        }
        if (sSLSession instanceof ExportSSLSession) {
            return ((ExportSSLSession) sSLSession).unwrap();
        }
        Constructor<? extends BCExtendedSSLSession> constructor = importSSLSessionConstructor;
        if (constructor != null && extendedSSLSessionClass.isInstance(sSLSession)) {
            try {
                return constructor.newInstance(sSLSession);
            } catch (Exception unused) {
            }
        }
        return new ImportSSLSession_5(sSLSession);
    }
}
