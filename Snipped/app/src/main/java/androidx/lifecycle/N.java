package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;

/* compiled from: ServiceLifecycleDispatcher.kt */
/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final C0553t f6994a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f6995b = new Handler();

    /* renamed from: c, reason: collision with root package name */
    public a f6996c;

    /* compiled from: ServiceLifecycleDispatcher.kt */
    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final C0553t f6997a;

        /* renamed from: b, reason: collision with root package name */
        public final Lifecycle.Event f6998b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f6999c;

        public a(C0553t c0553t, Lifecycle.Event event) {
            this.f6997a = c0553t;
            this.f6998b = event;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f6999c) {
                return;
            }
            this.f6997a.f(this.f6998b);
            this.f6999c = true;
        }
    }

    public N(r rVar) {
        this.f6994a = new C0553t(rVar);
    }

    public final void a(Lifecycle.Event event) {
        a aVar = this.f6996c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f6994a, event);
        this.f6996c = aVar2;
        this.f6995b.postAtFrontOfQueue(aVar2);
    }
}
