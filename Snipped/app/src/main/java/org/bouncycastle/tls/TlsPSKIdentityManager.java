package org.bouncycastle.tls;

/* loaded from: classes3.dex */
public interface TlsPSKIdentityManager {
    byte[] getHint();

    byte[] getPSK(byte[] bArr);
}
