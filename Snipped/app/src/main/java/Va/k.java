package va;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: Route.kt */
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final okhttp3.a f30764a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f30765b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f30766c;

    public k(okhttp3.a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        this.f30764a = aVar;
        this.f30765b = proxy;
        this.f30766c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (kotlin.jvm.internal.f.b(kVar.f30764a, this.f30764a) && kotlin.jvm.internal.f.b(kVar.f30765b, this.f30765b) && kotlin.jvm.internal.f.b(kVar.f30766c, this.f30766c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f30766c.hashCode() + ((this.f30765b.hashCode() + ((this.f30764a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f30766c + '}';
    }
}
