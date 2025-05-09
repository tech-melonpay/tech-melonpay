package org.bouncycastle.util;

import com.sumsub.sns.internal.core.data.model.p;

/* loaded from: classes3.dex */
public class IPAddress {
    private static boolean isMaskValue(String str, int i) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt >= 0 && parseInt <= i;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean isValid(String str) {
        return isValidIPv4(str) || isValidIPv6(str);
    }

    public static boolean isValidIPv4(String str) {
        int indexOf;
        if (str.length() == 0) {
            return false;
        }
        String concat = str.concat(".");
        int i = 0;
        int i9 = 0;
        while (i < concat.length() && (indexOf = concat.indexOf(46, i)) > i) {
            if (i9 == 4) {
                return false;
            }
            try {
                int parseInt = Integer.parseInt(concat.substring(i, indexOf));
                if (parseInt >= 0 && parseInt <= 255) {
                    i = indexOf + 1;
                    i9++;
                }
            } catch (NumberFormatException unused) {
            }
            return false;
        }
        return i9 == 4;
    }

    public static boolean isValidIPv4WithNetmask(String str) {
        int indexOf = str.indexOf("/");
        String substring = str.substring(indexOf + 1);
        if (indexOf <= 0 || !isValidIPv4(str.substring(0, indexOf))) {
            return false;
        }
        return isValidIPv4(substring) || isMaskValue(substring, 32);
    }

    public static boolean isValidIPv6(String str) {
        int indexOf;
        if (str.length() == 0) {
            return false;
        }
        String concat = str.concat(p.f15541a);
        int i = 0;
        int i9 = 0;
        boolean z10 = false;
        while (i < concat.length() && (indexOf = concat.indexOf(58, i)) >= i) {
            if (i9 == 8) {
                return false;
            }
            if (i != indexOf) {
                String substring = concat.substring(i, indexOf);
                if (indexOf != concat.length() - 1 || substring.indexOf(46) <= 0) {
                    try {
                        int parseInt = Integer.parseInt(concat.substring(i, indexOf), 16);
                        if (parseInt >= 0 && parseInt <= 65535) {
                        }
                    } catch (NumberFormatException unused) {
                    }
                    return false;
                }
                if (!isValidIPv4(substring)) {
                    return false;
                }
                i9++;
            } else {
                if (indexOf != 1 && indexOf != concat.length() - 1 && z10) {
                    return false;
                }
                z10 = true;
            }
            i = indexOf + 1;
            i9++;
        }
        return i9 == 8 || z10;
    }

    public static boolean isValidIPv6WithNetmask(String str) {
        int indexOf = str.indexOf("/");
        String substring = str.substring(indexOf + 1);
        if (indexOf <= 0 || !isValidIPv6(str.substring(0, indexOf))) {
            return false;
        }
        return isValidIPv6(substring) || isMaskValue(substring, 128);
    }

    public static boolean isValidWithNetMask(String str) {
        return isValidIPv4WithNetmask(str) || isValidIPv6WithNetmask(str);
    }
}
