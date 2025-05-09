package org.bouncycastle.x509;

import java.io.InputStream;
import java.util.Collection;

/* loaded from: classes3.dex */
public abstract class X509StreamParserSpi {
    public abstract void engineInit(InputStream inputStream);

    public abstract Object engineRead();

    public abstract Collection engineReadAll();
}
