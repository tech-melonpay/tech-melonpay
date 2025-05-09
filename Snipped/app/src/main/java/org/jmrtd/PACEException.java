package org.jmrtd;

@Deprecated
/* loaded from: classes3.dex */
public class PACEException extends CardServiceProtocolException {
    private static final long serialVersionUID = 8383980807753919040L;

    public PACEException(String str, int i) {
        super(str, i);
    }

    public PACEException(String str, int i, Throwable th) {
        super(str, i, th);
    }

    public PACEException(String str, int i, int i9) {
        super(str, i, i9);
    }

    public PACEException(String str, int i, Throwable th, int i9) {
        super(str, i, th, i9);
    }
}
