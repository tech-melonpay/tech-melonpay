package org.bouncycastle.tls;

/* loaded from: classes3.dex */
public interface DatagramSender {
    int getSendLimit();

    void send(byte[] bArr, int i, int i9);
}
