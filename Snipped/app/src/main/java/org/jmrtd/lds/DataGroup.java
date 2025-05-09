package org.jmrtd.lds;

import java.io.InputStream;

/* loaded from: classes3.dex */
public abstract class DataGroup extends AbstractTaggedLDSFile {
    private static final long serialVersionUID = -4761360877353069639L;

    public DataGroup(int i) {
        super(i);
    }

    @Override // org.jmrtd.lds.AbstractTaggedLDSFile
    public String toString() {
        return "DataGroup [" + Integer.toHexString(getTag()) + " (" + getLength() + ")]";
    }

    public DataGroup(int i, InputStream inputStream) {
        super(i, inputStream);
    }
}
