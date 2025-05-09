package org.bouncycastle.tls;

import org.bouncycastle.tls.crypto.TlsSRPConfig;

/* loaded from: classes3.dex */
public interface TlsSRPConfigVerifier {
    boolean accept(TlsSRPConfig tlsSRPConfig);
}
