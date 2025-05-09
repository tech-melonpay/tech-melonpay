package org.jmrtd;

import net.sf.scuba.smartcards.APDUWrapper;

/* loaded from: classes3.dex */
public interface APDULevelPACECapable {
    byte[] sendGeneralAuthenticate(APDUWrapper aPDUWrapper, byte[] bArr, int i, boolean z10);

    void sendMSESetATMutualAuth(APDUWrapper aPDUWrapper, String str, int i, byte[] bArr);
}
