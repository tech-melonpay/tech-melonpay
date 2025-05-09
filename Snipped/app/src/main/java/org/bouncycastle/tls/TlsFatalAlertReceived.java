package org.bouncycastle.tls;

/* loaded from: classes3.dex */
public class TlsFatalAlertReceived extends TlsException {
    protected short alertDescription;

    public TlsFatalAlertReceived(short s10) {
        super(AlertDescription.getText(s10), null);
        this.alertDescription = s10;
    }

    public short getAlertDescription() {
        return this.alertDescription;
    }
}
