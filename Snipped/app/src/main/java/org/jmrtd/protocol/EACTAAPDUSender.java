package org.jmrtd.protocol;

import net.sf.scuba.smartcards.APDUWrapper;
import net.sf.scuba.smartcards.CardService;
import net.sf.scuba.smartcards.CardServiceException;
import net.sf.scuba.smartcards.CommandAPDU;
import org.bouncycastle.tls.CipherSuite;
import org.jmrtd.APDULevelEACTACapable;

/* loaded from: classes3.dex */
public class EACTAAPDUSender implements APDULevelEACTACapable {
    private SecureMessagingAPDUSender secureMessagingSender;

    public EACTAAPDUSender(CardService cardService) {
        this.secureMessagingSender = new SecureMessagingAPDUSender(cardService);
    }

    @Override // org.jmrtd.APDULevelEACTACapable
    public synchronized byte[] sendGetChallenge(APDUWrapper aPDUWrapper) {
        return this.secureMessagingSender.transmit(aPDUWrapper, new CommandAPDU(0, -124, 0, 0, 8)).getData();
    }

    @Override // org.jmrtd.APDULevelEACTACapable
    public synchronized void sendMSESetATExtAuth(APDUWrapper aPDUWrapper, byte[] bArr) {
        short sw = (short) this.secureMessagingSender.transmit(aPDUWrapper, new CommandAPDU(0, 34, 129, 164, bArr)).getSW();
        if (sw != -28672) {
            throw new CardServiceException("Sending MSE AT failed", sw);
        }
    }

    @Override // org.jmrtd.APDULevelEACTACapable
    public synchronized void sendMSESetDST(APDUWrapper aPDUWrapper, byte[] bArr) {
        short sw = (short) this.secureMessagingSender.transmit(aPDUWrapper, new CommandAPDU(0, 34, 129, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, bArr)).getSW();
        if (sw != -28672) {
            throw new CardServiceException("Sending MSE Set DST failed", sw);
        }
    }

    @Override // org.jmrtd.APDULevelEACTACapable
    public synchronized void sendMutualAuthenticate(APDUWrapper aPDUWrapper, byte[] bArr) {
        short sw = (short) this.secureMessagingSender.transmit(aPDUWrapper, new CommandAPDU(0, -126, 0, 0, bArr)).getSW();
        if (sw != -28672) {
            throw new CardServiceException("Sending External Authenticate failed.", sw);
        }
    }

    @Override // org.jmrtd.APDULevelEACTACapable
    public synchronized void sendPSOExtendedLengthMode(APDUWrapper aPDUWrapper, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        short sw = (short) this.secureMessagingSender.transmit(aPDUWrapper, new CommandAPDU(0, 42, 0, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, bArr3)).getSW();
        if (sw != -28672) {
            throw new CardServiceException("Sending PSO failed", sw);
        }
    }
}
