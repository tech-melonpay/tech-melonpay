package org.jmrtd;

import net.sf.scuba.smartcards.APDUWrapper;

/* loaded from: classes3.dex */
public interface APDULevelReadBinaryCapable {
    byte[] sendReadBinary(APDUWrapper aPDUWrapper, int i, int i9, int i10, boolean z10, boolean z11);

    void sendSelectApplet(APDUWrapper aPDUWrapper, byte[] bArr);

    void sendSelectFile(APDUWrapper aPDUWrapper, short s10);

    void sendSelectMF();
}
