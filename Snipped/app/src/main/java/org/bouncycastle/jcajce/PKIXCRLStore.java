package org.bouncycastle.jcajce;

import java.security.cert.CRL;
import java.util.Collection;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.Store;

/* loaded from: classes2.dex */
public interface PKIXCRLStore<T extends CRL> extends Store<T> {
    @Override // org.bouncycastle.util.Store
    Collection<T> getMatches(Selector<T> selector);
}
