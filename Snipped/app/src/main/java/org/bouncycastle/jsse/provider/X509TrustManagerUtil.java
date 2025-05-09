package org.bouncycastle.jsse.provider;

import java.lang.reflect.Constructor;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.BCX509ExtendedTrustManager;

/* loaded from: classes.dex */
abstract class X509TrustManagerUtil {
    private static final Constructor<? extends X509TrustManager> exportX509TrustManagerConstructor;
    private static final Constructor<? extends BCX509ExtendedTrustManager> importX509TrustManagerConstructor;
    private static final Class<?> x509ExtendedTrustManagerClass;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.String r0 = "javax.net.ssl.X509ExtendedTrustManager"
            r1 = 0
            java.lang.Class r2 = org.bouncycastle.jsse.provider.ReflectionUtil.getClass(r0)     // Catch: java.lang.Exception -> L8
            goto L9
        L8:
            r2 = r1
        L9:
            org.bouncycastle.jsse.provider.X509TrustManagerUtil.x509ExtendedTrustManagerClass = r2
            java.lang.reflect.Method[] r0 = org.bouncycastle.jsse.provider.ReflectionUtil.getMethods(r0)     // Catch: java.lang.Exception -> L1e
            if (r0 == 0) goto L1e
            java.lang.String r0 = "org.bouncycastle.jsse.provider.ExportX509TrustManager_7"
            java.lang.Class<org.bouncycastle.jsse.BCX509ExtendedTrustManager> r2 = org.bouncycastle.jsse.BCX509ExtendedTrustManager.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.Exception -> L1e
            java.lang.reflect.Constructor r0 = org.bouncycastle.jsse.provider.ReflectionUtil.getDeclaredConstructor(r0, r2)     // Catch: java.lang.Exception -> L1e
            goto L1f
        L1e:
            r0 = r1
        L1f:
            org.bouncycastle.jsse.provider.X509TrustManagerUtil.exportX509TrustManagerConstructor = r0
            java.lang.Class<?> r0 = org.bouncycastle.jsse.provider.X509TrustManagerUtil.x509ExtendedTrustManagerClass
            if (r0 == 0) goto L2f
            java.lang.String r2 = "org.bouncycastle.jsse.provider.ImportX509TrustManager_7"
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.Exception -> L2f
            java.lang.reflect.Constructor r1 = org.bouncycastle.jsse.provider.ReflectionUtil.getDeclaredConstructor(r2, r0)     // Catch: java.lang.Exception -> L2f
        L2f:
            org.bouncycastle.jsse.provider.X509TrustManagerUtil.importX509TrustManagerConstructor = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jsse.provider.X509TrustManagerUtil.<clinit>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static X509TrustManager exportX509TrustManager(BCX509ExtendedTrustManager bCX509ExtendedTrustManager) {
        if (bCX509ExtendedTrustManager instanceof ImportX509TrustManager) {
            return ((ImportX509TrustManager) bCX509ExtendedTrustManager).unwrap();
        }
        Constructor<? extends X509TrustManager> constructor = exportX509TrustManagerConstructor;
        if (constructor != null) {
            try {
                return constructor.newInstance(bCX509ExtendedTrustManager);
            } catch (Exception unused) {
            }
        }
        return new ExportX509TrustManager_5(bCX509ExtendedTrustManager);
    }

    public static BCX509ExtendedTrustManager importX509TrustManager(X509TrustManager x509TrustManager) {
        if (x509TrustManager instanceof BCX509ExtendedTrustManager) {
            return (BCX509ExtendedTrustManager) x509TrustManager;
        }
        if (x509TrustManager instanceof ExportX509TrustManager) {
            return ((ExportX509TrustManager) x509TrustManager).unwrap();
        }
        Constructor<? extends BCX509ExtendedTrustManager> constructor = importX509TrustManagerConstructor;
        if (constructor != null && x509ExtendedTrustManagerClass.isInstance(x509TrustManager)) {
            try {
                return constructor.newInstance(x509TrustManager);
            } catch (Exception unused) {
            }
        }
        return new ImportX509TrustManager_5(x509TrustManager);
    }
}
