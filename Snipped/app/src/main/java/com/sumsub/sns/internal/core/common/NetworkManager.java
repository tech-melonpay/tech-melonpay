package com.sumsub.sns.internal.core.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.telephony.TelephonyManager;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.sumsub.sns.internal.log.c;
import k0.C0913a;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class NetworkManager {

    /* renamed from: a, reason: collision with root package name */
    public Context f15028a;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0646l<? super NetworkType, O9.p> f15030c;

    /* renamed from: b, reason: collision with root package name */
    public final O9.f f15029b = kotlin.a.a(new a());

    /* renamed from: d, reason: collision with root package name */
    public final b f15031d = new b();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "OTHER", "WIFI", "MOBILE", "ETHERNET", "M_2G", "M_3G", "M_4G", "M_5G", "LTE", "NONE", "NO_PERMISSION", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum NetworkType {
        OTHER("Other"),
        WIFI("WiFi"),
        MOBILE("Mobile"),
        ETHERNET("Ethernet"),
        M_2G("2G"),
        M_3G("3G"),
        M_4G("4G"),
        M_5G("5G"),
        LTE("LTE"),
        NONE("None"),
        NO_PERMISSION("No permission");

        private final String type;

        NetworkType(String str) {
            this.type = str;
        }

        public final String getType() {
            return this.type;
        }
    }

    public static final class a extends Lambda implements InterfaceC0635a<ConnectivityManager> {
        public a() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConnectivityManager invoke() {
            Context context = NetworkManager.this.f15028a;
            return (ConnectivityManager) (context != null ? context.getSystemService("connectivity") : null);
        }
    }

    public static final class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            super.onAvailable(network);
            try {
                InterfaceC0646l<NetworkType, O9.p> a10 = NetworkManager.this.a();
                if (a10 != null) {
                    NetworkManager networkManager = NetworkManager.this;
                    a10.invoke(networkManager.a(networkManager.f15028a));
                }
            } catch (Throwable th) {
                com.sumsub.sns.internal.log.b.b(com.sumsub.sns.internal.log.a.f17535a, c.a(this), "Ooops", th);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            super.onLost(network);
            try {
                InterfaceC0646l<NetworkType, O9.p> a10 = NetworkManager.this.a();
                if (a10 != null) {
                    NetworkManager networkManager = NetworkManager.this;
                    a10.invoke(networkManager.a(networkManager.f15028a));
                }
            } catch (Throwable th) {
                com.sumsub.sns.internal.log.b.b(com.sumsub.sns.internal.log.a.f17535a, c.a(this), "Ooops", th);
            }
        }
    }

    public final ConnectivityManager b() {
        return (ConnectivityManager) this.f15029b.getValue();
    }

    public final void c() {
        ConnectivityManager b9;
        try {
            Context context = this.f15028a;
            if (context == null || !a(context, "android.permission.CHANGE_NETWORK_STATE") || (b9 = b()) == null) {
                return;
            }
            b9.unregisterNetworkCallback(this.f15031d);
        } catch (Exception e10) {
            com.sumsub.sns.internal.log.b.b(com.sumsub.sns.internal.log.a.f17535a, c.a(this), "Can't stop network manager", e10);
        }
    }

    public final InterfaceC0646l<NetworkType, O9.p> a() {
        return this.f15030c;
    }

    public final void a(Context context, InterfaceC0646l<? super NetworkType, O9.p> interfaceC0646l) {
        this.f15028a = context;
        try {
            if (!a(context, "android.permission.CHANGE_NETWORK_STATE")) {
                interfaceC0646l.invoke(NetworkType.NO_PERMISSION);
            } else {
                this.f15030c = interfaceC0646l;
                NetworkRequest build = new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).build();
                ConnectivityManager b9 = b();
                if (b9 != null) {
                    b9.requestNetwork(build, this.f15031d);
                }
            }
        } catch (Throwable th) {
            com.sumsub.sns.internal.log.b.b(com.sumsub.sns.internal.log.a.f17535a, c.a(this), "Can't start network manager", th);
        }
    }

    @SuppressLint({"MissingPermission"})
    public final NetworkType a(Context context) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        try {
            if (context == null) {
                return NetworkType.NONE;
            }
            if (!a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                return NetworkType.NO_PERMISSION;
            }
            ConnectivityManager b9 = b();
            if (b9 != null && (activeNetwork = b9.getActiveNetwork()) != null) {
                ConnectivityManager b10 = b();
                if (b10 != null && (networkCapabilities = b10.getNetworkCapabilities(activeNetwork)) != null) {
                    if (networkCapabilities.hasTransport(1)) {
                        return NetworkType.WIFI;
                    }
                    if (networkCapabilities.hasTransport(3)) {
                        return NetworkType.ETHERNET;
                    }
                    if (networkCapabilities.hasTransport(0)) {
                        if (a(context, "android.permission.READ_PHONE_STATE")) {
                            return a(((TelephonyManager) context.getSystemService("phone")).getDataNetworkType());
                        }
                        return NetworkType.NONE;
                    }
                    return NetworkType.OTHER;
                }
                return NetworkType.NONE;
            }
            return NetworkType.OTHER;
        } catch (Throwable unused) {
            com.sumsub.sns.internal.log.b.b(com.sumsub.sns.internal.log.a.f17535a, c.a(this), "Error while getting network type", null, 4, null);
            return NetworkType.NONE;
        }
    }

    public final NetworkType a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return NetworkType.M_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return NetworkType.M_3G;
            case 13:
                return NetworkType.LTE;
            case 18:
                return NetworkType.M_4G;
            case 19:
            default:
                return NetworkType.OTHER;
            case 20:
                return NetworkType.M_5G;
        }
    }

    public final boolean a(Context context, String str) {
        return C0913a.checkSelfPermission(context, str) == 0;
    }
}
