package J;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.camera.video.internal.encoder.EncoderImpl;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import j2.AbstractC0892k;
import j2.C0884c;
import java.util.Objects;
import p2.InterfaceC1102c;
import q2.InterfaceC1129a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2068a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2069b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2070c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2072e;

    public /* synthetic */ m(EncoderImpl encoderImpl, int i, String str, Throwable th) {
        this.f2070c = encoderImpl;
        this.f2069b = i;
        this.f2071d = str;
        this.f2072e = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2068a) {
            case 0:
                ((EncoderImpl) this.f2070c).e(this.f2069b, (String) this.f2071d, (Throwable) this.f2072e);
                return;
            default:
                AbstractC0892k abstractC0892k = (AbstractC0892k) this.f2071d;
                int i = this.f2069b;
                Runnable runnable = (Runnable) this.f2072e;
                o2.c cVar = (o2.c) this.f2070c;
                InterfaceC1129a interfaceC1129a = cVar.f24352f;
                try {
                    try {
                        InterfaceC1102c interfaceC1102c = cVar.f24349c;
                        Objects.requireNonNull(interfaceC1102c);
                        interfaceC1129a.d(new com.sumsub.sns.geo.presentation.d(interfaceC1102c, 14));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) cVar.f24347a.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            interfaceC1129a.d(new D6.a(i, cVar, abstractC0892k));
                        } else {
                            cVar.a(abstractC0892k, i);
                        }
                    } catch (SynchronizationException unused) {
                        cVar.f24350d.b(abstractC0892k, i + 1);
                    }
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    runnable.run();
                    throw th;
                }
        }
    }

    public /* synthetic */ m(o2.c cVar, C0884c c0884c, int i, Runnable runnable) {
        this.f2070c = cVar;
        this.f2071d = c0884c;
        this.f2069b = i;
        this.f2072e = runnable;
    }
}
