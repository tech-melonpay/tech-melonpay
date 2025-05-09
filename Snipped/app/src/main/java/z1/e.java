package z1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import s1.AbstractC1197g;
import x1.C1581b;

/* compiled from: NetworkStateTracker.java */
/* loaded from: classes.dex */
public final class e extends d<C1581b> {
    public static final String i = AbstractC1197g.e("NetworkStateTracker");

    /* renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f31248g;

    /* renamed from: h, reason: collision with root package name */
    public final a f31249h;

    /* compiled from: NetworkStateTracker.java */
    public class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            AbstractC1197g.c().a(e.i, "Network capabilities changed: " + networkCapabilities, new Throwable[0]);
            e eVar = e.this;
            eVar.c(eVar.f());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            AbstractC1197g.c().a(e.i, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.c(eVar.f());
        }
    }

    public e(Context context, D1.a aVar) {
        super(context, aVar);
        this.f31248g = (ConnectivityManager) this.f31242b.getSystemService("connectivity");
        this.f31249h = new a();
    }

    @Override // z1.d
    public final C1581b a() {
        return f();
    }

    @Override // z1.d
    public final void d() {
        String str = i;
        try {
            AbstractC1197g.c().a(str, "Registering network callback", new Throwable[0]);
            this.f31248g.registerDefaultNetworkCallback(this.f31249h);
        } catch (IllegalArgumentException | SecurityException e10) {
            AbstractC1197g.c().b(str, "Received exception while registering network callback", e10);
        }
    }

    @Override // z1.d
    public final void e() {
        String str = i;
        try {
            AbstractC1197g.c().a(str, "Unregistering network callback", new Throwable[0]);
            this.f31248g.unregisterNetworkCallback(this.f31249h);
        } catch (IllegalArgumentException | SecurityException e10) {
            AbstractC1197g.c().b(str, "Received exception while unregistering network callback", e10);
        }
    }

    public final C1581b f() {
        boolean z10;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.f31248g;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z11 = false;
        boolean z12 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException e10) {
            AbstractC1197g.c().b(i, "Unable to validate active network", e10);
        }
        if (networkCapabilities != null) {
            if (networkCapabilities.hasCapability(16)) {
                z10 = true;
                boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
                    z11 = true;
                }
                C1581b c1581b = new C1581b();
                c1581b.f30908a = z12;
                c1581b.f30909b = z10;
                c1581b.f30910c = isActiveNetworkMetered;
                c1581b.f30911d = z11;
                return c1581b;
            }
        }
        z10 = false;
        boolean isActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
        if (activeNetworkInfo != null) {
            z11 = true;
        }
        C1581b c1581b2 = new C1581b();
        c1581b2.f30908a = z12;
        c1581b2.f30909b = z10;
        c1581b2.f30910c = isActiveNetworkMetered2;
        c1581b2.f30911d = z11;
        return c1581b2;
    }
}
