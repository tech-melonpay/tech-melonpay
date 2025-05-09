package org.jmrtd.protocol;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.smartcards.APDUEvent;
import net.sf.scuba.smartcards.APDUListener;
import net.sf.scuba.smartcards.APDUWrapper;
import net.sf.scuba.smartcards.CardService;
import net.sf.scuba.smartcards.CardServiceException;
import net.sf.scuba.smartcards.CommandAPDU;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ResponseAPDU;
import net.sf.scuba.util.Hex;
import org.jmrtd.Util;
import org.jmrtd.WrappedAPDUEvent;

/* loaded from: classes3.dex */
public class SecureMessagingAPDUSender {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd.protocol");
    private int apduCount = 0;
    private CardService service;

    public SecureMessagingAPDUSender(CardService cardService) {
        this.service = cardService;
    }

    private byte[] continueSendingUsingResponseChaining(APDUWrapper aPDUWrapper, short s10, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while ((65280 & s10) == 24832) {
            try {
                try {
                    byteArrayOutputStream.write(bArr);
                    int i = s10 & 255;
                    if (i <= 0) {
                        break;
                    }
                    ResponseAPDU transmit = transmit(aPDUWrapper, new CommandAPDU(0, -64, 0, 0, i));
                    byte[] data = transmit.getData();
                    s10 = (short) transmit.getSW();
                    bArr = data;
                } catch (IOException e10) {
                    throw new CardServiceException("Could not write to stream", e10, s10);
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e11) {
                    LOGGER.log(Level.FINE, "Error closing stream", (Throwable) e11);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException e12) {
            LOGGER.log(Level.FINE, "Error closing stream", (Throwable) e12);
        }
        return byteArray;
    }

    private List<ResponseAPDU> sendUsingCommandChaining(CommandAPDU commandAPDU, int i) {
        List<byte[]> partition = Util.partition(i, commandAPDU.getData());
        ArrayList arrayList = new ArrayList(partition.size());
        int i9 = 0;
        for (byte[] bArr : partition) {
            i9++;
            boolean z10 = i9 >= partition.size();
            int cla = commandAPDU.getCLA();
            arrayList.add(this.service.transmit(new CommandAPDU(!z10 ? cla | 16 : cla, commandAPDU.getINS(), commandAPDU.getP1(), commandAPDU.getP2(), bArr, commandAPDU.getNe())));
        }
        return arrayList;
    }

    public void addAPDUListener(APDUListener aPDUListener) {
        this.service.addAPDUListener(aPDUListener);
    }

    public boolean isExtendedAPDULengthSupported() {
        return this.service.isExtendedAPDULengthSupported();
    }

    public void notifyExchangedAPDU(APDUEvent aPDUEvent) {
        Collection<APDUListener> aPDUListeners = this.service.getAPDUListeners();
        if (aPDUListeners == null || aPDUListeners.isEmpty()) {
            return;
        }
        Iterator<APDUListener> it = aPDUListeners.iterator();
        while (it.hasNext()) {
            it.next().exchangedAPDU(aPDUEvent);
        }
    }

    public void removeAPDUListener(APDUListener aPDUListener) {
        this.service.removeAPDUListener(aPDUListener);
    }

    public ResponseAPDU transmit(APDUWrapper aPDUWrapper, CommandAPDU commandAPDU) {
        CommandAPDU wrap = aPDUWrapper != null ? aPDUWrapper.wrap(commandAPDU) : commandAPDU;
        ResponseAPDU transmit = this.service.transmit(wrap);
        short sw = (short) transmit.getSW();
        if (aPDUWrapper == null) {
            int i = this.apduCount + 1;
            this.apduCount = i;
            notifyExchangedAPDU(new APDUEvent(this, "PLAIN", i, wrap, transmit));
            return transmit;
        }
        try {
            if ((sw & ISO7816.SW_WRONG_LENGTH) == 26368) {
                return transmit;
            }
            try {
                try {
                    if (transmit.getBytes().length <= 2) {
                        throw new CardServiceException("Exception during transmission of wrapped APDU, C=" + Hex.bytesToHexString(commandAPDU.getBytes()), sw);
                    }
                    ResponseAPDU unwrap = aPDUWrapper.unwrap(transmit);
                    String type = aPDUWrapper.getType();
                    int i9 = this.apduCount + 1;
                    this.apduCount = i9;
                    notifyExchangedAPDU(new WrappedAPDUEvent(this, type, i9, commandAPDU, unwrap, wrap, transmit));
                    return unwrap;
                } catch (Exception e10) {
                    throw new CardServiceException("Exception during transmission of wrapped APDU, C=" + Hex.bytesToHexString(commandAPDU.getBytes()), e10, sw);
                }
            } catch (CardServiceException e11) {
                throw e11;
            }
        } finally {
            String type2 = aPDUWrapper.getType();
            int i10 = this.apduCount + 1;
            this.apduCount = i10;
            notifyExchangedAPDU(new WrappedAPDUEvent(this, type2, i10, commandAPDU, transmit, wrap, transmit));
        }
    }
}
