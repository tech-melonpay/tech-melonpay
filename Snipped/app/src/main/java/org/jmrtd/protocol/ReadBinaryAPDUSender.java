package org.jmrtd.protocol;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.smartcards.APDUWrapper;
import net.sf.scuba.smartcards.CardService;
import net.sf.scuba.smartcards.CardServiceException;
import net.sf.scuba.smartcards.CommandAPDU;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ResponseAPDU;
import net.sf.scuba.util.Hex;
import org.jmrtd.APDULevelReadBinaryCapable;
import s3.b;

/* loaded from: classes3.dex */
public class ReadBinaryAPDUSender implements APDULevelReadBinaryCapable {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd.protocol");
    private SecureMessagingAPDUSender secureMessagingSender;
    private CardService service;

    public ReadBinaryAPDUSender(CardService cardService) {
        this.service = cardService;
        this.secureMessagingSender = new SecureMessagingAPDUSender(cardService);
    }

    private static void checkStatusWordAfterFileOperation(CommandAPDU commandAPDU, ResponseAPDU responseAPDU) {
        if (responseAPDU == null) {
            throw new CardServiceException("No response APDU");
        }
        byte[] data = responseAPDU.getData();
        short sw = (short) responseAPDU.getSW();
        String str = "CAPDU = " + Hex.bytesToHexString(commandAPDU.getBytes()) + ", RAPDU = " + Hex.bytesToHexString(responseAPDU.getBytes());
        if ((sw & ISO7816.SW_WRONG_LENGTH) == 26368 && (data == null || data.length == 0)) {
            throw new CardServiceException(b.j("Wrong length, ", str), sw);
        }
        if (sw != -28672) {
            if (sw == 25218) {
                if (data == null || data.length == 0) {
                    throw new CardServiceException(b.j("End of file, ", str), sw);
                }
            } else {
                if (sw != 27010) {
                    if (sw == 27266) {
                        throw new CardServiceException(b.j("File not found, ", str), sw);
                    }
                    if (sw != 27013 && sw != 27014) {
                        throw new CardServiceException(b.j("Error occured, ", str), sw);
                    }
                }
                throw new CardServiceException(b.j("Access to file denied, ", str), sw);
            }
        }
    }

    private static byte[] getResponseData(ResponseAPDU responseAPDU, boolean z10) {
        if (responseAPDU == null) {
            return null;
        }
        byte[] data = responseAPDU.getData();
        if (data == null) {
            throw new CardServiceException("Malformed read binary long response data");
        }
        if (!z10) {
            return data;
        }
        if (data[0] != 83) {
            throw new CardServiceException("Malformed read binary long response data");
        }
        int i = data[1];
        int i9 = (((byte) (i & 128)) == Byte.MIN_VALUE ? (i & 15) + 1 : 1) + 1;
        int length = data.length - i9;
        byte[] bArr = new byte[length];
        System.arraycopy(data, i9, bArr, 0, length);
        return bArr;
    }

    @Override // org.jmrtd.APDULevelReadBinaryCapable
    public synchronized byte[] sendReadBinary(APDUWrapper aPDUWrapper, int i, int i9, int i10, boolean z10, boolean z11) {
        CommandAPDU commandAPDU;
        int sw;
        int i11 = i10;
        synchronized (this) {
            ResponseAPDU responseAPDU = null;
            if (i11 == 0) {
                return null;
            }
            byte b9 = (byte) ((65280 & i9) >> 8);
            byte b10 = (byte) (i9 & 255);
            try {
                if (z11) {
                    int i12 = i11 < 128 ? i11 + 2 : i11 < 256 ? i11 + 3 : i11;
                    if (i12 > 256) {
                        i12 = 256;
                    }
                    commandAPDU = new CommandAPDU(0, -79, 0, 0, new byte[]{84, 2, b9, b10}, i12);
                    i11 = i12;
                } else {
                    commandAPDU = z10 ? new CommandAPDU(0, -80, (byte) i, b10, i10) : new CommandAPDU(0, -80, b9, b10, i10);
                }
                try {
                    responseAPDU = this.secureMessagingSender.transmit(aPDUWrapper, commandAPDU);
                    sw = responseAPDU.getSW();
                } catch (CardServiceException e10) {
                    if (this.service.isConnectionLost(e10)) {
                        throw e10;
                    }
                    LOGGER.log(Level.FINE, "Exception during READ BINARY", (Throwable) e10);
                    sw = e10.getSW();
                }
                short s10 = (short) sw;
                byte[] responseData = getResponseData(responseAPDU, z11);
                if (responseData == null || responseData.length == 0) {
                    LOGGER.warning("Empty response data: response APDU bytes = " + Arrays.toString(responseData) + ", le = " + i11 + ", sw = " + Integer.toHexString(s10));
                }
                checkStatusWordAfterFileOperation(commandAPDU, responseAPDU);
                return responseData;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.jmrtd.APDULevelReadBinaryCapable
    public synchronized void sendSelectApplet(APDUWrapper aPDUWrapper, byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("AID cannot be null");
        }
        CommandAPDU commandAPDU = new CommandAPDU(0, -92, 4, 12, bArr);
        checkStatusWordAfterFileOperation(commandAPDU, this.secureMessagingSender.transmit(aPDUWrapper, commandAPDU));
    }

    @Override // org.jmrtd.APDULevelReadBinaryCapable
    public synchronized void sendSelectFile(APDUWrapper aPDUWrapper, short s10) {
        CommandAPDU commandAPDU = new CommandAPDU(0, -92, 2, 12, new byte[]{(byte) ((s10 >> 8) & 255), (byte) (s10 & 255)}, 0);
        ResponseAPDU transmit = this.secureMessagingSender.transmit(aPDUWrapper, commandAPDU);
        if (transmit == null) {
            return;
        }
        checkStatusWordAfterFileOperation(commandAPDU, transmit);
    }

    @Override // org.jmrtd.APDULevelReadBinaryCapable
    public synchronized void sendSelectMF() {
        CommandAPDU commandAPDU = new CommandAPDU(0, -92, 0, 12, new byte[]{63, 0});
        checkStatusWordAfterFileOperation(commandAPDU, this.secureMessagingSender.transmit(null, commandAPDU));
    }
}
