package org.jmrtd;

import net.sf.scuba.smartcards.CardFileInputStream;
import net.sf.scuba.smartcards.CardService;

/* loaded from: classes3.dex */
public abstract class FileSystemCardService extends CardService {
    @Deprecated
    public abstract CardFileInputStream getInputStream(short s10);

    public abstract CardFileInputStream getInputStream(short s10, int i);
}
