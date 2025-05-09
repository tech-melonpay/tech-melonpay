package B6;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.lifecycle.C0559z;

/* compiled from: NetworkLiveData.kt */
/* loaded from: classes2.dex */
public final class j extends C0559z<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f429a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f430b;

    /* renamed from: c, reason: collision with root package name */
    public final a f431c = new a();

    /* compiled from: NetworkLiveData.kt */
    public static final class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            j jVar = j.this;
            if (jVar.f429a != null) {
                Boolean bool = Boolean.TRUE;
                jVar.f429a = bool;
                jVar.postValue(bool);
                jVar.f429a = null;
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            Boolean bool = Boolean.FALSE;
            j jVar = j.this;
            jVar.f429a = bool;
            jVar.postValue(bool);
        }
    }

    public j(Application application) {
        this.f430b = (ConnectivityManager) application.getSystemService("connectivity");
    }

    @Override // androidx.lifecycle.AbstractC0557x
    public final void onActive() {
        super.onActive();
        ConnectivityManager connectivityManager = this.f430b;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        Boolean valueOf = networkCapabilities != null ? Boolean.valueOf(networkCapabilities.hasCapability(12)) : null;
        if (valueOf == null || kotlin.jvm.internal.f.b(valueOf, Boolean.FALSE)) {
            Boolean bool = Boolean.FALSE;
            this.f429a = bool;
            postValue(bool);
        }
        connectivityManager.registerDefaultNetworkCallback(this.f431c);
    }

    @Override // androidx.lifecycle.AbstractC0557x
    public final void onInactive() {
        super.onInactive();
        this.f430b.unregisterNetworkCallback(this.f431c);
    }
}
