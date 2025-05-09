package org.bouncycastle.jsse.provider;

import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;

/* loaded from: classes.dex */
class HandshakeCompletedListenerAdapter implements HandshakeCompletedListener {
    protected final HandshakeCompletedListener listener;

    public HandshakeCompletedListenerAdapter(HandshakeCompletedListener handshakeCompletedListener) {
        this.listener = handshakeCompletedListener;
    }

    public boolean equals(Object obj) {
        return (obj instanceof HandshakeCompletedListenerAdapter) && ((HandshakeCompletedListenerAdapter) obj).listener == this.listener;
    }

    @Override // javax.net.ssl.HandshakeCompletedListener
    public void handshakeCompleted(final HandshakeCompletedEvent handshakeCompletedEvent) {
        CallbackUtil.safeCallback(new Runnable() { // from class: org.bouncycastle.jsse.provider.HandshakeCompletedListenerAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                HandshakeCompletedListenerAdapter.this.listener.handshakeCompleted(handshakeCompletedEvent);
            }
        });
    }

    public int hashCode() {
        return System.identityHashCode(this.listener);
    }
}
