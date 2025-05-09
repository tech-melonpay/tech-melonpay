package org.bouncycastle.operator;

import java.io.OutputStream;

/* loaded from: classes3.dex */
public interface AADProcessor {
    OutputStream getAADStream();

    byte[] getMAC();
}
