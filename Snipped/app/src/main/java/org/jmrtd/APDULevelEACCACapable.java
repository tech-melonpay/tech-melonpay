package org.jmrtd;

import java.math.BigInteger;
import net.sf.scuba.smartcards.APDUWrapper;

/* loaded from: classes3.dex */
public interface APDULevelEACCACapable {
    byte[] sendGeneralAuthenticate(APDUWrapper aPDUWrapper, byte[] bArr, boolean z10);

    void sendMSEKAT(APDUWrapper aPDUWrapper, byte[] bArr, byte[] bArr2);

    void sendMSESetATIntAuth(APDUWrapper aPDUWrapper, String str, BigInteger bigInteger);
}
