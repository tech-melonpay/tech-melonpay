package org.bouncycastle.cms;

/* loaded from: classes2.dex */
public class CMSException extends Exception {

    /* renamed from: e, reason: collision with root package name */
    Exception f24773e;

    public CMSException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f24773e;
    }

    public Exception getUnderlyingException() {
        return this.f24773e;
    }

    public CMSException(String str, Exception exc) {
        super(str);
        this.f24773e = exc;
    }
}
