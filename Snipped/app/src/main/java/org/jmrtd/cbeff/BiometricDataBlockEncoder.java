package org.jmrtd.cbeff;

import java.io.OutputStream;
import org.jmrtd.cbeff.BiometricDataBlock;

/* loaded from: classes3.dex */
public interface BiometricDataBlockEncoder<B extends BiometricDataBlock> {
    void encode(B b9, OutputStream outputStream);
}
