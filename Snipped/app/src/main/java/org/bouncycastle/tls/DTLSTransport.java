package org.bouncycastle.tls;

import com.google.android.gms.measurement.internal.a;
import java.io.IOException;
import java.io.InterruptedIOException;

/* loaded from: classes3.dex */
public class DTLSTransport implements DatagramTransport {
    private final DTLSRecordLayer recordLayer;

    public DTLSTransport(DTLSRecordLayer dTLSRecordLayer) {
        this.recordLayer = dTLSRecordLayer;
    }

    @Override // org.bouncycastle.tls.TlsCloseable
    public void close() {
        this.recordLayer.close();
    }

    @Override // org.bouncycastle.tls.DatagramReceiver
    public int getReceiveLimit() {
        return this.recordLayer.getReceiveLimit();
    }

    @Override // org.bouncycastle.tls.DatagramSender
    public int getSendLimit() {
        return this.recordLayer.getSendLimit();
    }

    @Override // org.bouncycastle.tls.DatagramReceiver
    public int receive(byte[] bArr, int i, int i9, int i10) {
        if (bArr == null) {
            throw new NullPointerException("'buf' cannot be null");
        }
        if (i < 0 || i >= bArr.length) {
            throw new IllegalArgumentException(a.g(i, "'off' is an invalid offset: "));
        }
        if (i9 < 0 || i9 > bArr.length - i) {
            throw new IllegalArgumentException(a.g(i9, "'len' is an invalid length: "));
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("'waitMillis' cannot be negative");
        }
        try {
            return this.recordLayer.receive(bArr, i, i9, i10);
        } catch (InterruptedIOException e10) {
            throw e10;
        } catch (IOException e11) {
            this.recordLayer.fail((short) 80);
            throw e11;
        } catch (RuntimeException e12) {
            this.recordLayer.fail((short) 80);
            throw new TlsFatalAlert((short) 80, e12);
        } catch (TlsFatalAlert e13) {
            this.recordLayer.fail(e13.getAlertDescription());
            throw e13;
        }
    }

    @Override // org.bouncycastle.tls.DatagramSender
    public void send(byte[] bArr, int i, int i9) {
        if (bArr == null) {
            throw new NullPointerException("'buf' cannot be null");
        }
        if (i < 0 || i >= bArr.length) {
            throw new IllegalArgumentException(a.g(i, "'off' is an invalid offset: "));
        }
        if (i9 < 0 || i9 > bArr.length - i) {
            throw new IllegalArgumentException(a.g(i9, "'len' is an invalid length: "));
        }
        try {
            this.recordLayer.send(bArr, i, i9);
        } catch (InterruptedIOException e10) {
            throw e10;
        } catch (IOException e11) {
            this.recordLayer.fail((short) 80);
            throw e11;
        } catch (RuntimeException e12) {
            this.recordLayer.fail((short) 80);
            throw new TlsFatalAlert((short) 80, e12);
        } catch (TlsFatalAlert e13) {
            this.recordLayer.fail(e13.getAlertDescription());
            throw e13;
        }
    }
}
