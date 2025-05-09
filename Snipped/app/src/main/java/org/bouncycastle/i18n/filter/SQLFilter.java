package org.bouncycastle.i18n.filter;

/* loaded from: classes2.dex */
public class SQLFilter implements Filter {
    @Override // org.bouncycastle.i18n.filter.Filter
    public String doFilter(String str) {
        int i;
        String str2;
        StringBuffer stringBuffer = new StringBuffer(str);
        int i9 = 0;
        while (i9 < stringBuffer.length()) {
            char charAt = stringBuffer.charAt(i9);
            if (charAt == '\n') {
                i = i9 + 1;
                str2 = "\\n";
            } else if (charAt == '\r') {
                i = i9 + 1;
                str2 = "\\r";
            } else if (charAt == '\"') {
                i = i9 + 1;
                str2 = "\\\"";
            } else if (charAt == '\'') {
                i = i9 + 1;
                str2 = "\\'";
            } else if (charAt == '-') {
                i = i9 + 1;
                str2 = "\\-";
            } else if (charAt == '/') {
                i = i9 + 1;
                str2 = "\\/";
            } else if (charAt == ';') {
                i = i9 + 1;
                str2 = "\\;";
            } else if (charAt == '=') {
                i = i9 + 1;
                str2 = "\\=";
            } else if (charAt != '\\') {
                i9++;
            } else {
                i = i9 + 1;
                str2 = "\\\\";
            }
            stringBuffer.replace(i9, i, str2);
            i9 = i;
            i9++;
        }
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.i18n.filter.Filter
    public String doFilterUrl(String str) {
        return doFilter(str);
    }
}
