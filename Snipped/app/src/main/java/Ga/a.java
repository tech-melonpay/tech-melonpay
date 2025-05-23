package Ga;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* compiled from: NullProxySelector.kt */
/* loaded from: classes2.dex */
public final class a extends ProxySelector {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1364a = new a();

    @Override // java.net.ProxySelector
    public final List<Proxy> select(URI uri) {
        if (uri != null) {
            return Collections.singletonList(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
