package Aa;

import java.net.ProtocolException;
import okhttp3.Protocol;

/* compiled from: StatusLine.kt */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Protocol f160a;

    /* renamed from: b, reason: collision with root package name */
    public final int f161b;

    /* renamed from: c, reason: collision with root package name */
    public final String f162c;

    /* compiled from: StatusLine.kt */
    public static final class a {
        public static i a(String str) {
            int i;
            String str2;
            boolean startsWith = str.startsWith("HTTP/1.");
            Protocol protocol = Protocol.HTTP_1_0;
            if (startsWith) {
                i = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                int charAt = str.charAt(7) - '0';
                if (charAt != 0) {
                    if (charAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else {
                if (!str.startsWith("ICY ")) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                i = 4;
            }
            int i9 = i + 3;
            if (str.length() < i9) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            try {
                int parseInt = Integer.parseInt(str.substring(i, i9));
                if (str.length() <= i9) {
                    str2 = "";
                } else {
                    if (str.charAt(i9) != ' ') {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                    str2 = str.substring(i + 4);
                }
                return new i(protocol, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        }
    }

    public i(Protocol protocol, int i, String str) {
        this.f160a = protocol;
        this.f161b = i;
        this.f162c = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f160a == Protocol.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f161b);
        sb2.append(' ');
        sb2.append(this.f162c);
        return sb2.toString();
    }
}
