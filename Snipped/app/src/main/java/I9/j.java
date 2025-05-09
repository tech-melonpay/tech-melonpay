package I9;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* compiled from: ProxyAuthenticator.java */
/* loaded from: classes2.dex */
public final class j extends Authenticator {

    /* renamed from: a, reason: collision with root package name */
    public final String f1938a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1939b;

    public j(String str, String str2) {
        this.f1938a = str;
        this.f1939b = str2;
    }

    @Override // java.net.Authenticator
    public final PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() != Authenticator.RequestorType.PROXY) {
            return null;
        }
        return new PasswordAuthentication(this.f1938a, this.f1939b.toCharArray());
    }
}
