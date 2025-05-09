package org.bouncycastle.tls;

/* loaded from: classes3.dex */
public interface DatagramReceiver {
    int getReceiveLimit();

    int receive(byte[] bArr, int i, int i9, int i10);
}
