package org.bouncycastle.jsse.provider;

import javax.net.ssl.SSLSessionBindingEvent;
import javax.net.ssl.SSLSessionBindingListener;

/* loaded from: classes.dex */
class SessionBindingListenerAdapter implements SSLSessionBindingListener {
    protected final SSLSessionBindingListener listener;

    public SessionBindingListenerAdapter(SSLSessionBindingListener sSLSessionBindingListener) {
        this.listener = sSLSessionBindingListener;
    }

    @Override // javax.net.ssl.SSLSessionBindingListener
    public void valueBound(final SSLSessionBindingEvent sSLSessionBindingEvent) {
        CallbackUtil.safeCallback(new Runnable() { // from class: org.bouncycastle.jsse.provider.SessionBindingListenerAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                SessionBindingListenerAdapter.this.listener.valueBound(sSLSessionBindingEvent);
            }
        });
    }

    @Override // javax.net.ssl.SSLSessionBindingListener
    public void valueUnbound(final SSLSessionBindingEvent sSLSessionBindingEvent) {
        CallbackUtil.safeCallback(new Runnable() { // from class: org.bouncycastle.jsse.provider.SessionBindingListenerAdapter.2
            @Override // java.lang.Runnable
            public void run() {
                SessionBindingListenerAdapter.this.listener.valueUnbound(sSLSessionBindingEvent);
            }
        });
    }
}
