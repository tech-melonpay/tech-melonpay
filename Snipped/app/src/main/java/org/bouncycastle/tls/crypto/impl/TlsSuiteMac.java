package org.bouncycastle.tls.crypto.impl;

/* loaded from: classes3.dex */
public interface TlsSuiteMac {
    byte[] calculateMac(long j10, short s10, byte[] bArr, int i, int i9);

    byte[] calculateMacConstantTime(long j10, short s10, byte[] bArr, int i, int i9, int i10, byte[] bArr2);

    int getSize();
}
