package org.bouncycastle.cms;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public interface CMSProcessable {
    Object getContent();

    void write(OutputStream outputStream);
}
