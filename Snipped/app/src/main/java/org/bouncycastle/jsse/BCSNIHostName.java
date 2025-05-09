package org.bouncycastle.jsse;

import androidx.camera.core.impl.utils.a;
import java.util.Locale;
import java.util.regex.Pattern;
import org.bouncycastle.jsse.provider.IDNUtil;
import org.bouncycastle.tls.NameType;
import org.bouncycastle.util.Strings;

/* loaded from: classes.dex */
public final class BCSNIHostName extends BCSNIServerName {
    private final String hostName;

    public static final class BCSNIHostNameMatcher extends BCSNIMatcher {
        private final Pattern pattern;

        public BCSNIHostNameMatcher(String str) {
            super(0);
            this.pattern = Pattern.compile(str, 2);
        }

        private String getAsciiHostName(BCSNIServerName bCSNIServerName) {
            return bCSNIServerName instanceof BCSNIHostName ? ((BCSNIHostName) bCSNIServerName).getAsciiName() : BCSNIHostName.normalizeHostName(Strings.fromUTF8ByteArray(bCSNIServerName.getEncoded()));
        }

        @Override // org.bouncycastle.jsse.BCSNIMatcher
        public boolean matches(BCSNIServerName bCSNIServerName) {
            String asciiHostName;
            if (bCSNIServerName == null) {
                throw new NullPointerException("'serverName' cannot be null");
            }
            if (bCSNIServerName.getType() != 0) {
                return false;
            }
            try {
                asciiHostName = getAsciiHostName(bCSNIServerName);
            } catch (RuntimeException unused) {
            }
            if (this.pattern.matcher(asciiHostName).matches()) {
                return true;
            }
            String unicode = IDNUtil.toUnicode(asciiHostName, 0);
            return !asciiHostName.equals(unicode) && this.pattern.matcher(unicode).matches();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BCSNIHostName(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r3 = normalizeHostName(r3)
            byte[] r0 = org.bouncycastle.util.Strings.toByteArray(r3)
            r1 = 0
            r2.<init>(r1, r0)
            r2.hostName = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jsse.BCSNIHostName.<init>(java.lang.String):void");
    }

    public static BCSNIMatcher createSNIMatcher(String str) {
        if (str != null) {
            return new BCSNIHostNameMatcher(str);
        }
        throw new NullPointerException("'regex' cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String normalizeHostName(String str) {
        if (str == null) {
            throw new NullPointerException("'hostName' cannot be null");
        }
        String ascii = IDNUtil.toASCII(str, IDNUtil.USE_STD3_ASCII_RULES);
        if (ascii.length() < 1) {
            throw new IllegalArgumentException("SNI host_name cannot be empty");
        }
        if (ascii.endsWith(".")) {
            throw new IllegalArgumentException("SNI host_name cannot end with a separator");
        }
        return ascii;
    }

    @Override // org.bouncycastle.jsse.BCSNIServerName
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BCSNIHostName) {
            return this.hostName.equalsIgnoreCase(((BCSNIHostName) obj).hostName);
        }
        return false;
    }

    public String getAsciiName() {
        return this.hostName;
    }

    @Override // org.bouncycastle.jsse.BCSNIServerName
    public int hashCode() {
        return this.hostName.toUpperCase(Locale.ENGLISH).hashCode();
    }

    @Override // org.bouncycastle.jsse.BCSNIServerName
    public String toString() {
        StringBuilder sb2 = new StringBuilder("{type=");
        sb2.append(NameType.getText((short) 0));
        sb2.append(", value=");
        return a.n(sb2, this.hostName, "}");
    }

    public BCSNIHostName(byte[] bArr) {
        super(0, bArr);
        this.hostName = normalizeHostName(Strings.fromUTF8ByteArray(bArr));
    }
}
