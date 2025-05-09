package org.bouncycastle.est.jcajce;

import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
public interface SSLSocketFactoryCreator {
    SSLSocketFactory createFactory();

    boolean isTrusted();
}
