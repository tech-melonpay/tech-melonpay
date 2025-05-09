package org.jmrtd;

import net.sf.scuba.smartcards.APDUWrapper;

/* loaded from: classes3.dex */
public interface APDULevelEACTACapable {
    byte[] sendGetChallenge(APDUWrapper aPDUWrapper);

    void sendMSESetATExtAuth(APDUWrapper aPDUWrapper, byte[] bArr);

    void sendMSESetDST(APDUWrapper aPDUWrapper, byte[] bArr);

    void sendMutualAuthenticate(APDUWrapper aPDUWrapper, byte[] bArr);

    void sendPSOExtendedLengthMode(APDUWrapper aPDUWrapper, byte[] bArr, byte[] bArr2);
}
