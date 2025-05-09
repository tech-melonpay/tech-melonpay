package com.luminary.business;

import O9.f;
import O9.p;
import Z4.b;
import Z4.d;
import Z4.i;
import Z4.l;
import a5.C0511a;
import android.app.Application;
import b5.C0589b;
import bb.a;
import ca.InterfaceC0635a;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.h;
import org.koin.core.error.KoinAppAlreadyStartedException;
import u9.C1534e;
import u9.E;

/* compiled from: AndroidApplication.kt */
/* loaded from: classes.dex */
public final class AndroidApplication extends Application {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10636a = 0;

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        try {
            FirebaseApp.initializeApp(this);
        } catch (Exception unused) {
            p pVar = p.f3034a;
        }
        synchronized (a.f8485a) {
            org.koin.core.a aVar = new org.koin.core.a();
            if (a.f8486b != null) {
                throw new KoinAppAlreadyStartedException("A Koin Application has already been started");
            }
            a.f8486b = aVar.f25539a;
            org.koin.android.ext.koin.a.a(aVar, this);
            aVar.b(Z4.a.f4187a, C0589b.f8340a, b.f4188a, i.f4195a, d.f4190a, l.f4198a, K8.d.f2276a, C0511a.f4449a);
            p pVar2 = p.f3034a;
            aVar.a();
        }
        try {
            f b9 = kotlin.a.b(LazyThreadSafetyMode.f23085a, new InterfaceC0635a<K5.a>() { // from class: com.luminary.business.AndroidApplication$getFCMToken$$inlined$inject$default$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [K5.a, java.lang.Object] */
                @Override // ca.InterfaceC0635a
                public final K5.a invoke() {
                    return U4.b.l(this).a(null, null, h.a(K5.a.class));
                }
            });
            if (((K5.a) b9.getValue()).D().length() <= 0) {
                FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new A0.b(b9, 12));
            }
        } catch (Exception unused2) {
        }
        if (J8.a.f2195f == null) {
            J8.a aVar2 = new J8.a();
            J8.a.f2195f = aVar2;
            registerActivityLifecycleCallbacks(aVar2);
        }
        E.b(this, new C1534e(), new A0.b(this, 15));
        Thread.setDefaultUncaughtExceptionHandler(new L3.a(this));
    }
}
