package org.jmrtd.protocol;

import java.util.logging.Logger;
import net.sf.scuba.smartcards.CardService;
import org.jmrtd.APDULevelAACapable;

/* loaded from: classes3.dex */
public class AAAPDUSender implements APDULevelAACapable {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd.protocol");
    private SecureMessagingAPDUSender secureMessagingSender;

    public AAAPDUSender(CardService cardService) {
        this.secureMessagingSender = new SecureMessagingAPDUSender(cardService);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        if (r3 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
    @Override // org.jmrtd.APDULevelAACapable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized byte[] sendInternalAuthenticate(net.sf.scuba.smartcards.APDUWrapper r12, byte[] r13) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.protocol.AAAPDUSender.sendInternalAuthenticate(net.sf.scuba.smartcards.APDUWrapper, byte[]):byte[]");
    }
}
