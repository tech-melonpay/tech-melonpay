package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.PrivateKey;

/* loaded from: classes3.dex */
public interface XMSSMTPrivateKey extends XMSSMTKey, PrivateKey {
    XMSSMTPrivateKey extractKeyShard(int i);

    long getIndex();

    long getUsagesRemaining();
}
