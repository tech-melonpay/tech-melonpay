package J8;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Foreground.kt */
/* loaded from: classes2.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f, reason: collision with root package name */
    public static a f2195f;

    /* renamed from: a, reason: collision with root package name */
    public boolean f2196a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2197b = true;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f2198c = new Handler();

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f2199d = new CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    public c f2200e;

    /* compiled from: Foreground.kt */
    /* renamed from: J8.a$a, reason: collision with other inner class name */
    public static final class C0028a {
        public static a a() {
            a aVar = a.f2195f;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Foreground is not initialised - invoke at least once with parameterised init/get".toString());
        }
    }

    /* compiled from: Foreground.kt */
    public interface b {
        void a();

        void b();
    }

    /* compiled from: Foreground.kt */
    public static final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            if (!aVar.f2196a || !aVar.f2197b) {
                Log.i("J8.a", "still foreground");
                return;
            }
            aVar.f2196a = false;
            Log.i("J8.a", "went background");
            Iterator it = aVar.f2199d.iterator();
            while (it.hasNext()) {
                try {
                    ((b) it.next()).a();
                } catch (Exception e10) {
                    Log.e("J8.a", "Listener threw exception!", e10);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f2197b = true;
        c cVar = this.f2200e;
        Handler handler = this.f2198c;
        if (cVar != null) {
            handler.removeCallbacks(cVar);
        }
        c cVar2 = new c();
        this.f2200e = cVar2;
        handler.postDelayed(cVar2, 500L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f2197b = false;
        boolean z10 = !this.f2196a;
        this.f2196a = true;
        c cVar = this.f2200e;
        if (cVar != null) {
            this.f2198c.removeCallbacks(cVar);
        }
        if (!z10) {
            Log.i("J8.a", "still foreground");
            return;
        }
        Log.i("J8.a", "went foreground");
        Iterator it = this.f2199d.iterator();
        while (it.hasNext()) {
            try {
                ((b) it.next()).b();
            } catch (Exception e10) {
                Log.e("J8.a", "Listener threw exception!", e10);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
