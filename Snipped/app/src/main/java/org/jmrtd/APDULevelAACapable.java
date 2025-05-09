package org.jmrtd;

import net.sf.scuba.smartcards.APDUWrapper;

/* loaded from: classes3.dex */
public interface APDULevelAACapable {
    byte[] sendInternalAuthenticate(APDUWrapper aPDUWrapper, byte[] bArr);
}
