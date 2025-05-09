package org.bouncycastle.jsse.provider;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class IDNUtil {
    private static final int MAX_LABEL_LENGTH = 63;
    public static final Method toASCIIMethod;
    public static final Method toUnicodeMethod;
    private static final String IDN_CLASSNAME = "java.net.IDN";
    public static final int ALLOW_UNASSIGNED = ReflectionUtil.getStaticIntOrDefault(IDN_CLASSNAME, "ALLOW_UNASSIGNED", 1).intValue();
    public static final int USE_STD3_ASCII_RULES = ReflectionUtil.getStaticIntOrDefault(IDN_CLASSNAME, "USE_STD3_ASCII_RULES", 2).intValue();

    static {
        Class cls = Integer.TYPE;
        toASCIIMethod = ReflectionUtil.getMethod(IDN_CLASSNAME, "toASCII", String.class, cls);
        toUnicodeMethod = ReflectionUtil.getMethod(IDN_CLASSNAME, "toUnicode", String.class, cls);
    }

    private static int findSeparator(String str, int i) {
        while (i < str.length() && !isSeparator(str.charAt(i))) {
            i++;
        }
        return i;
    }

    private static boolean hasAnyNonLDHAscii(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (charAt >= 0 && charAt <= ',') {
                return true;
            }
            if ('.' <= charAt && charAt <= '/') {
                return true;
            }
            if (':' <= charAt && charAt <= '@') {
                return true;
            }
            if ('[' <= charAt && charAt <= '`') {
                return true;
            }
            if ('{' <= charAt && charAt <= 127) {
                return true;
            }
        }
        return false;
    }

    private static boolean isAllAscii(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (charSequence.charAt(i) >= 128) {
                return false;
            }
        }
        return true;
    }

    private static boolean isRoot(String str) {
        return str.length() == 1 && isSeparator(str.charAt(0));
    }

    private static boolean isSeparator(char c2) {
        return c2 == '.' || c2 == 12290 || c2 == 65294 || c2 == 65377;
    }

    public static String toASCII(String str, int i) {
        Method method = toASCIIMethod;
        if (method != null) {
            return (String) ReflectionUtil.invokeMethod(null, method, str, Integer.valueOf(i));
        }
        if (isRoot(str)) {
            return ".";
        }
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            int findSeparator = findSeparator(str, i9);
            sb2.append(toAsciiLabel(str.substring(i9, findSeparator), i));
            if (findSeparator < str.length()) {
                sb2.append('.');
            }
            i9 = findSeparator + 1;
        }
        return sb2.toString();
    }

    private static String toAsciiLabel(String str, int i) {
        if (str.length() < 1) {
            throw new IllegalArgumentException("Domain name label cannot be empty");
        }
        if (!isAllAscii(str)) {
            throw new UnsupportedOperationException("IDN support incomplete");
        }
        if ((i & USE_STD3_ASCII_RULES) != 0) {
            if (hasAnyNonLDHAscii(str)) {
                throw new IllegalArgumentException("Domain name label cannot contain non-LDH characters");
            }
            if ('-' == str.charAt(0) || '-' == str.charAt(str.length() - 1)) {
                throw new IllegalArgumentException("Domain name label cannot begin or end with a hyphen");
            }
        }
        if (63 >= str.length()) {
            return str;
        }
        throw new IllegalArgumentException("Domain name label length cannot be more than 63");
    }

    public static String toUnicode(String str, int i) {
        Method method = toUnicodeMethod;
        if (method != null) {
            return (String) ReflectionUtil.invokeMethod(null, method, str, Integer.valueOf(i));
        }
        if (isRoot(str)) {
            return ".";
        }
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            int findSeparator = findSeparator(str, i9);
            sb2.append(toUnicodeLabel(str.substring(i9, findSeparator), i));
            if (findSeparator < str.length()) {
                sb2.append('.');
            }
            i9 = findSeparator + 1;
        }
        return sb2.toString();
    }

    private static String toUnicodeLabel(String str, int i) {
        return str;
    }
}
