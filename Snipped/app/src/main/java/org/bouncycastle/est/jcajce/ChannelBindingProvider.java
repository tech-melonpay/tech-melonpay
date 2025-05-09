package org.bouncycastle.est.jcajce;

import java.net.Socket;

/* loaded from: classes2.dex */
public interface ChannelBindingProvider {
    boolean canAccessChannelBinding(Socket socket);

    byte[] getChannelBinding(Socket socket, String str);
}
