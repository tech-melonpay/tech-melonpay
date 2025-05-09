package org.bouncycastle.asn1.x500.style;

/* loaded from: classes2.dex */
public class X500NameTokenizer {
    private StringBuffer buf;
    private int index;
    private char separator;
    private String value;

    public X500NameTokenizer(String str) {
        this(str, ',');
    }

    public boolean hasMoreTokens() {
        return this.index != this.value.length();
    }

    public String nextToken() {
        if (this.index == this.value.length()) {
            return null;
        }
        int i = this.index + 1;
        this.buf.setLength(0);
        boolean z10 = false;
        boolean z11 = false;
        while (i != this.value.length()) {
            char charAt = this.value.charAt(i);
            if (charAt == '\"') {
                if (!z10) {
                    z11 = !z11;
                }
            } else if (!z10 && !z11) {
                if (charAt == '\\') {
                    this.buf.append(charAt);
                    z10 = true;
                } else {
                    if (charAt == this.separator) {
                        break;
                    }
                    this.buf.append(charAt);
                }
                i++;
            }
            this.buf.append(charAt);
            z10 = false;
            i++;
        }
        this.index = i;
        return this.buf.toString();
    }

    public X500NameTokenizer(String str, char c2) {
        this.buf = new StringBuffer();
        this.value = str;
        this.index = -1;
        this.separator = c2;
    }
}
