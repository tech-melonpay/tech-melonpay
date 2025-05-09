package com.sumsub.sns.internal.core.common;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class r0 {
    public static final boolean a(InputStream inputStream, OutputStream outputStream) {
        try {
            int available = inputStream.available();
            if (available > 1048576) {
                available = 1048576;
            }
            byte[] bArr = new byte[available];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    inputStream.close();
                    outputStream.close();
                    return true;
                }
                outputStream.write(bArr, 0, read);
            }
        } catch (IOException unused) {
            return false;
        }
    }
}
