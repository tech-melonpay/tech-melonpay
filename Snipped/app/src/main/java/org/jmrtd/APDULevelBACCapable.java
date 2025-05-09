package org.jmrtd;

import javax.crypto.SecretKey;

/* loaded from: classes3.dex */
public interface APDULevelBACCapable {
    byte[] sendGetChallenge();

    byte[] sendMutualAuth(byte[] bArr, byte[] bArr2, byte[] bArr3, SecretKey secretKey, SecretKey secretKey2);
}
