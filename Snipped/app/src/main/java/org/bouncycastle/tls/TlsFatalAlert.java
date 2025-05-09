package org.bouncycastle.tls;

/* loaded from: classes3.dex */
public class TlsFatalAlert extends TlsException {
    protected short alertDescription;

    public TlsFatalAlert(short s10) {
        this(s10, null);
    }

    public short getAlertDescription() {
        return this.alertDescription;
    }

    public TlsFatalAlert(short s10, Throwable th) {
        super(AlertDescription.getText(s10), th);
        this.alertDescription = s10;
    }
}
