package org.bouncycastle.jsse.provider;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Security;
import java.util.logging.Level;
import java.util.logging.Logger;
import s3.b;

/* loaded from: classes.dex */
class PropertyUtils {
    private static final Logger LOG = Logger.getLogger(PropertyUtils.class.getName());

    public static boolean getBooleanSystemProperty(String str, boolean z10) {
        String systemProperty = getSystemProperty(str);
        if (systemProperty != null) {
            if ("true".equals(systemProperty)) {
                LOG.log(Level.INFO, "Found boolean system property [" + str + "]: true");
                return true;
            }
            if ("false".equals(systemProperty)) {
                LOG.log(Level.INFO, "Found boolean system property [" + str + "]: false");
                return false;
            }
            LOG.log(Level.WARNING, b.k("Unrecognized value for boolean system property [", str, "]: ", systemProperty));
        }
        LOG.log(Level.FINE, "Boolean system property [" + str + "] defaulted to: " + z10);
        return z10;
    }

    public static int getIntegerSystemProperty(String str, int i, int i9, int i10) {
        String systemProperty = getSystemProperty(str);
        if (systemProperty != null) {
            try {
                int parseInt = Integer.parseInt(systemProperty);
                if (parseInt >= i9 && parseInt <= i10) {
                    LOG.log(Level.INFO, "Found integer system property [" + str + "]: " + parseInt);
                    return parseInt;
                }
                Logger logger = LOG;
                Level level = Level.WARNING;
                if (logger.isLoggable(level)) {
                    logger.log(level, "Out-of-range (" + getRangeString(i9, i10) + ") integer system property [" + str + "]: " + systemProperty);
                }
            } catch (Exception unused) {
                LOG.log(Level.WARNING, b.k("Unrecognized value for integer system property [", str, "]: ", systemProperty));
            }
        }
        LOG.log(Level.FINE, "Integer system property [" + str + "] defaulted to: " + i);
        return i;
    }

    private static String getRangeString(int i, int i9) {
        StringBuilder sb2 = new StringBuilder(32);
        if (Integer.MIN_VALUE != i) {
            sb2.append(i);
            sb2.append(" <= ");
        }
        sb2.append('x');
        if (Integer.MAX_VALUE != i9) {
            sb2.append(" <= ");
            sb2.append(i9);
        }
        return sb2.toString();
    }

    public static String getSecurityProperty(final String str) {
        return (String) AccessController.doPrivileged(new PrivilegedAction<String>() { // from class: org.bouncycastle.jsse.provider.PropertyUtils.1
            @Override // java.security.PrivilegedAction
            public String run() {
                return Security.getProperty(str);
            }
        });
    }

    public static String[] getStringArraySecurityProperty(String str, String str2) {
        return parseStringArray(getStringSecurityProperty(str, str2));
    }

    public static String[] getStringArraySystemProperty(String str) {
        return parseStringArray(getStringSystemProperty(str));
    }

    public static String getStringSecurityProperty(String str, String str2) {
        String securityProperty = getSecurityProperty(str);
        if (securityProperty != null) {
            LOG.log(Level.INFO, b.k("Found string security property [", str, "]: ", securityProperty));
            return securityProperty;
        }
        LOG.log(Level.WARNING, b.k("String security property [", str, "] defaulted to: ", str2));
        return str2;
    }

    public static String getStringSystemProperty(String str) {
        String systemProperty = getSystemProperty(str);
        if (systemProperty == null) {
            return null;
        }
        LOG.log(Level.INFO, b.k("Found string system property [", str, "]: ", systemProperty));
        return systemProperty;
    }

    public static String getSystemProperty(final String str) {
        try {
            return (String) AccessController.doPrivileged(new PrivilegedAction<String>() { // from class: org.bouncycastle.jsse.provider.PropertyUtils.2
                @Override // java.security.PrivilegedAction
                public String run() {
                    return System.getProperty(str);
                }
            });
        } catch (RuntimeException e10) {
            LOG.log(Level.WARNING, "Failed to get system property", (Throwable) e10);
            return null;
        }
    }

    private static String[] parseStringArray(String str) {
        if (str == null) {
            return null;
        }
        String[] split = JsseUtils.stripDoubleQuotes(str.trim()).split(",");
        String[] strArr = new String[split.length];
        int i = 0;
        for (String str2 : split) {
            String trim = str2.trim();
            if (trim.length() >= 1) {
                strArr[i] = trim;
                i++;
            }
        }
        return JsseUtils.resize(strArr, i);
    }
}
