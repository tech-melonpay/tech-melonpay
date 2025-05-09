package org.jmrtd.protocol;

import java.security.PublicKey;
import org.jmrtd.APDULevelAACapable;
import org.jmrtd.CardServiceProtocolException;

/* loaded from: classes3.dex */
public class AAProtocol {
    private APDULevelAACapable service;
    private SecureMessagingWrapper wrapper;

    public AAProtocol(APDULevelAACapable aPDULevelAACapable, SecureMessagingWrapper secureMessagingWrapper) {
        this.service = aPDULevelAACapable;
        this.wrapper = secureMessagingWrapper;
    }

    public AAResult doAA(PublicKey publicKey, String str, String str2, byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length == 8) {
                    return new AAResult(publicKey, str, str2, bArr, this.service.sendInternalAuthenticate(this.wrapper, bArr));
                }
            } catch (Exception e10) {
                throw new CardServiceProtocolException("Exception", 1, e10);
            }
        }
        throw new IllegalArgumentException("AA failed: bad challenge");
    }
}
