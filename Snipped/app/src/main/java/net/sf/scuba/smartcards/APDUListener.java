package net.sf.scuba.smartcards;

import java.util.EventListener;

/* loaded from: classes2.dex */
public interface APDUListener extends EventListener {
    void exchangedAPDU(APDUEvent aPDUEvent);
}
