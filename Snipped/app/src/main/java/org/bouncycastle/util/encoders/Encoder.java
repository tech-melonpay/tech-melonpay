package org.bouncycastle.util.encoders;

import java.io.OutputStream;

/* loaded from: classes3.dex */
public interface Encoder {
    int decode(String str, OutputStream outputStream);

    int decode(byte[] bArr, int i, int i9, OutputStream outputStream);

    int encode(byte[] bArr, int i, int i9, OutputStream outputStream);

    int getEncodedLength(int i);

    int getMaxDecodedLength(int i);
}
