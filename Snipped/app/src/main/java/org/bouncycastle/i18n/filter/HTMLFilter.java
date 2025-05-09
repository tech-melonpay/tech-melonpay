package org.bouncycastle.i18n.filter;

/* loaded from: classes2.dex */
public class HTMLFilter implements Filter {
    @Override // org.bouncycastle.i18n.filter.Filter
    public String doFilter(String str) {
        int i;
        String str2;
        StringBuffer stringBuffer = new StringBuffer(str);
        int i9 = 0;
        while (i9 < stringBuffer.length()) {
            char charAt = stringBuffer.charAt(i9);
            if (charAt == '\"') {
                i = i9 + 1;
                str2 = "&#34";
            } else if (charAt == '#') {
                i = i9 + 1;
                str2 = "&#35";
            } else if (charAt == '+') {
                i = i9 + 1;
                str2 = "&#43";
            } else if (charAt == '-') {
                i = i9 + 1;
                str2 = "&#45";
            } else if (charAt == '>') {
                i = i9 + 1;
                str2 = "&#62";
            } else if (charAt == ';') {
                i = i9 + 1;
                str2 = "&#59";
            } else if (charAt != '<') {
                switch (charAt) {
                    case '%':
                        i = i9 + 1;
                        str2 = "&#37";
                        break;
                    case '&':
                        i = i9 + 1;
                        str2 = "&#38";
                        break;
                    case '\'':
                        i = i9 + 1;
                        str2 = "&#39";
                        break;
                    case '(':
                        i = i9 + 1;
                        str2 = "&#40";
                        break;
                    case ')':
                        i = i9 + 1;
                        str2 = "&#41";
                        break;
                    default:
                        i9 -= 3;
                        continue;
                }
            } else {
                i = i9 + 1;
                str2 = "&#60";
            }
            stringBuffer.replace(i9, i, str2);
            i9 += 4;
        }
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.i18n.filter.Filter
    public String doFilterUrl(String str) {
        return doFilter(str);
    }
}
