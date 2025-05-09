package org.bouncycastle.pkcs;

/* loaded from: classes3.dex */
public class PKCSException extends Exception {
    private Throwable cause;

    public PKCSException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public PKCSException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }
}
