package org.bouncycastle.jce.provider;

/* loaded from: classes2.dex */
public class PKIXNameConstraintValidatorException extends Exception {
    private Throwable cause;

    public PKIXNameConstraintValidatorException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public PKIXNameConstraintValidatorException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }
}
