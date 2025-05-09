package org.bouncycastle.cms;

/* loaded from: classes2.dex */
public class CMSRuntimeException extends RuntimeException {

    /* renamed from: e, reason: collision with root package name */
    Exception f24774e;

    public CMSRuntimeException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f24774e;
    }

    public Exception getUnderlyingException() {
        return this.f24774e;
    }

    public CMSRuntimeException(String str, Exception exc) {
        super(str);
        this.f24774e = exc;
    }
}
