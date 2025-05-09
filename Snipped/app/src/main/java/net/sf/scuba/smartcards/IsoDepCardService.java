package net.sf.scuba.smartcards;

import android.annotation.TargetApi;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.nfc.tech.NfcA;
import android.nfc.tech.NfcB;
import java.io.IOException;

/* loaded from: classes2.dex */
public class IsoDepCardService extends CardService {
    private int apduCount = 0;
    private IsoDep isoDep;

    public IsoDepCardService(IsoDep isoDep) {
        this.isoDep = isoDep;
    }

    private boolean isDirectConnectionLost(Throwable th) {
        if (!this.isoDep.isConnected()) {
            return true;
        }
        if (th == null) {
            return false;
        }
        if (th.getClass().getName().contains("TagLostException")) {
            return true;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        return message.toLowerCase().contains("tag was lost");
    }

    @Override // net.sf.scuba.smartcards.CardService
    public void close() {
        try {
            this.isoDep.close();
            this.state = 0;
        } catch (IOException unused) {
        }
    }

    @Override // net.sf.scuba.smartcards.CardService
    public byte[] getATR() {
        Tag tag;
        IsoDep isoDep = this.isoDep;
        if (isoDep == null || (tag = isoDep.getTag()) == null) {
            return null;
        }
        return NfcA.get(tag) != null ? this.isoDep.getHistoricalBytes() : NfcB.get(tag) != null ? this.isoDep.getHiLayerResponse() : this.isoDep.getHistoricalBytes();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001d, code lost:
    
        return false;
     */
    @Override // net.sf.scuba.smartcards.CardService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isConnectionLost(java.lang.Exception r4) {
        /*
            r3 = this;
            boolean r0 = r3.isDirectConnectionLost(r4)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 0
            if (r4 != 0) goto Lc
            return r0
        Lc:
            java.lang.Throwable r2 = r4.getCause()
            if (r2 == 0) goto L1d
            if (r4 == r2) goto L1d
            boolean r4 = r3.isDirectConnectionLost(r2)
            if (r4 == 0) goto L1b
            return r1
        L1b:
            r4 = r2
            goto Lc
        L1d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sf.scuba.smartcards.IsoDepCardService.isConnectionLost(java.lang.Exception):boolean");
    }

    @Override // net.sf.scuba.smartcards.CardService
    @TargetApi(16)
    public boolean isExtendedAPDULengthSupported() {
        return this.isoDep.isExtendedLengthApduSupported();
    }

    @Override // net.sf.scuba.smartcards.CardService
    public boolean isOpen() {
        if (this.isoDep.isConnected()) {
            this.state = 1;
            return true;
        }
        this.state = 0;
        return false;
    }

    @Override // net.sf.scuba.smartcards.CardService
    public void open() {
        if (isOpen()) {
            return;
        }
        try {
            this.isoDep.connect();
            if (!this.isoDep.isConnected()) {
                throw new CardServiceException("Failed to connect");
            }
            this.state = 1;
        } catch (IOException e10) {
            throw new CardServiceException("Failed to connect", e10);
        }
    }

    @Override // net.sf.scuba.smartcards.CardService
    public ResponseAPDU transmit(CommandAPDU commandAPDU) {
        try {
            if (!this.isoDep.isConnected()) {
                throw new CardServiceException("Not connected");
            }
            byte[] transceive = this.isoDep.transceive(commandAPDU.getBytes());
            if (transceive == null || transceive.length < 2) {
                throw new CardServiceException("Failed response");
            }
            ResponseAPDU responseAPDU = new ResponseAPDU(transceive);
            int i = this.apduCount + 1;
            this.apduCount = i;
            notifyExchangedAPDU(new APDUEvent(this, "ISODep", i, commandAPDU, responseAPDU));
            return responseAPDU;
        } catch (CardServiceException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new CardServiceException("Could not tranceive APDU", e11);
        }
    }
}
