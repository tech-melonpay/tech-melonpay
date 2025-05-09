package org.jmrtd.protocol;

import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.smartcards.APDUWrapper;
import net.sf.scuba.smartcards.CardService;
import net.sf.scuba.smartcards.CardServiceException;
import net.sf.scuba.smartcards.CommandAPDU;
import net.sf.scuba.smartcards.ResponseAPDU;
import net.sf.scuba.tlv.TLVUtil;
import org.jmrtd.APDULevelEACCACapable;

/* loaded from: classes3.dex */
public class EACCAAPDUSender implements APDULevelEACCACapable {
    private static final byte INS_BSI_GENERAL_AUTHENTICATE = -122;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd.protocol");
    private SecureMessagingAPDUSender secureMessagingSender;

    public EACCAAPDUSender(CardService cardService) {
        this.secureMessagingSender = new SecureMessagingAPDUSender(cardService);
    }

    @Override // org.jmrtd.APDULevelEACCACapable
    public synchronized byte[] sendGeneralAuthenticate(APDUWrapper aPDUWrapper, byte[] bArr, boolean z10) {
        return sendGeneralAuthenticate(aPDUWrapper, bArr, 256, z10);
    }

    @Override // org.jmrtd.APDULevelEACCACapable
    public synchronized void sendMSEKAT(APDUWrapper aPDUWrapper, byte[] bArr, byte[] bArr2) {
        try {
            byte[] bArr3 = new byte[bArr.length + (bArr2 != null ? bArr2.length : 0)];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            if (bArr2 != null) {
                System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
            }
            short sw = (short) this.secureMessagingSender.transmit(aPDUWrapper, new CommandAPDU(0, 34, 65, 166, bArr3)).getSW();
            if (sw != -28672) {
                throw new CardServiceException("Sending MSE KAT failed", sw);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f A[Catch: all -> 0x002d, TRY_ENTER, TryCatch #1 {, blocks: (B:20:0x0007, B:23:0x0010, B:25:0x0023, B:26:0x0039, B:12:0x006f, B:13:0x0076, B:17:0x0064, B:29:0x0030, B:4:0x004d), top: B:19:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #1 {, blocks: (B:20:0x0007, B:23:0x0010, B:25:0x0023, B:26:0x0039, B:12:0x006f, B:13:0x0076, B:17:0x0064, B:29:0x0030, B:4:0x004d), top: B:19:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006d A[DONT_GENERATE] */
    @Override // org.jmrtd.APDULevelEACCACapable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void sendMSESetATIntAuth(net.sf.scuba.smartcards.APDUWrapper r7, java.lang.String r8, java.math.BigInteger r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            r3 = 65
            r4 = 164(0xa4, float:2.3E-43)
            if (r9 == 0) goto L4d
            java.math.BigInteger r0 = java.math.BigInteger.ZERO     // Catch: java.lang.Throwable -> L2d
            int r0 = r9.compareTo(r0)     // Catch: java.lang.Throwable -> L2d
            if (r0 >= 0) goto L10
            goto L4d
        L10:
            byte[] r8 = org.jmrtd.Util.toOIDBytes(r8)     // Catch: java.lang.Throwable -> L2d
            byte[] r9 = org.jmrtd.Util.i2os(r9)     // Catch: java.lang.Throwable -> L2d
            r0 = 132(0x84, float:1.85E-43)
            byte[] r9 = net.sf.scuba.tlv.TLVUtil.wrapDO(r0, r9)     // Catch: java.lang.Throwable -> L2d
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L2d
            r0.<init>()     // Catch: java.lang.Throwable -> L2d
            r0.write(r8)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r0.write(r9)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r0.close()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            goto L39
        L2d:
            r7 = move-exception
            goto L77
        L2f:
            r8 = move-exception
            java.util.logging.Logger r9 = org.jmrtd.protocol.EACCAAPDUSender.LOGGER     // Catch: java.lang.Throwable -> L2d
            java.util.logging.Level r1 = java.util.logging.Level.WARNING     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = "Exception"
            r9.log(r1, r2, r8)     // Catch: java.lang.Throwable -> L2d
        L39:
            net.sf.scuba.smartcards.CommandAPDU r8 = new net.sf.scuba.smartcards.CommandAPDU     // Catch: java.lang.Throwable -> L2d
            byte[] r5 = r0.toByteArray()     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            r2 = 34
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L2d
            org.jmrtd.protocol.SecureMessagingAPDUSender r9 = r6.secureMessagingSender     // Catch: java.lang.Throwable -> L2d
            net.sf.scuba.smartcards.ResponseAPDU r7 = r9.transmit(r7, r8)     // Catch: java.lang.Throwable -> L2d
            goto L60
        L4d:
            net.sf.scuba.smartcards.CommandAPDU r9 = new net.sf.scuba.smartcards.CommandAPDU     // Catch: java.lang.Throwable -> L2d
            byte[] r5 = org.jmrtd.Util.toOIDBytes(r8)     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            r2 = 34
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L2d
            org.jmrtd.protocol.SecureMessagingAPDUSender r8 = r6.secureMessagingSender     // Catch: java.lang.Throwable -> L2d
            net.sf.scuba.smartcards.ResponseAPDU r7 = r8.transmit(r7, r9)     // Catch: java.lang.Throwable -> L2d
        L60:
            if (r7 != 0) goto L64
            r7 = -1
            goto L69
        L64:
            int r7 = r7.getSW()     // Catch: java.lang.Throwable -> L2d
            short r7 = (short) r7
        L69:
            r8 = -28672(0xffffffffffff9000, float:NaN)
            if (r7 != r8) goto L6f
            monitor-exit(r6)
            return
        L6f:
            net.sf.scuba.smartcards.CardServiceException r8 = new net.sf.scuba.smartcards.CardServiceException     // Catch: java.lang.Throwable -> L2d
            java.lang.String r9 = "Sending MSE AT failed"
            r8.<init>(r9, r7)     // Catch: java.lang.Throwable -> L2d
            throw r8     // Catch: java.lang.Throwable -> L2d
        L77:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.protocol.EACCAAPDUSender.sendMSESetATIntAuth(net.sf.scuba.smartcards.APDUWrapper, java.lang.String, java.math.BigInteger):void");
    }

    public synchronized byte[] sendGeneralAuthenticate(APDUWrapper aPDUWrapper, byte[] bArr, int i, boolean z10) {
        byte[] data;
        try {
            byte[] wrapDO = TLVUtil.wrapDO(124, bArr);
            ResponseAPDU transmit = this.secureMessagingSender.transmit(aPDUWrapper, new CommandAPDU(z10 ? 0 : 16, -122, 0, 0, wrapDO, i));
            short sw = (short) transmit.getSW();
            if (sw == 26368) {
                transmit = this.secureMessagingSender.transmit(aPDUWrapper, new CommandAPDU(z10 ? 0 : 16, -122, 0, 0, wrapDO, 256));
            }
            if (sw != -28672) {
                throw new CardServiceException("Sending general authenticate failed", sw);
            }
            data = transmit.getData();
            try {
                data = TLVUtil.unwrapDO(124, data);
            } catch (Exception e10) {
                LOGGER.log(Level.WARNING, "Could not unwrap response to GENERAL AUTHENTICATE", (Throwable) e10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return data;
    }
}
