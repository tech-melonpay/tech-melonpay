package y9;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.FrameMetrics;
import android.view.Window;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import u9.o;
import y9.f;

/* compiled from: SentryFrameMetricsCollector.java */
/* loaded from: classes2.dex */
public final class f implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final o f31171a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f31172b;

    /* renamed from: c, reason: collision with root package name */
    public final SentryOptions f31173c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f31174d;

    /* renamed from: e, reason: collision with root package name */
    public WeakReference<Window> f31175e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap<String, b> f31176f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f31177g;

    /* renamed from: h, reason: collision with root package name */
    public final c f31178h;
    public final e i;

    /* compiled from: SentryFrameMetricsCollector.java */
    public class a implements c {
    }

    /* compiled from: SentryFrameMetricsCollector.java */
    public interface b {
        void a(FrameMetrics frameMetrics, float f10);
    }

    /* compiled from: SentryFrameMetricsCollector.java */
    public interface c {
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [y9.e] */
    @SuppressLint({"NewApi"})
    public f(Context context, final SentryOptions sentryOptions, final o oVar) {
        a aVar = new a();
        this.f31172b = new HashSet();
        this.f31176f = new HashMap<>();
        this.f31177g = false;
        D9.b.t0(sentryOptions, "SentryOptions is required");
        this.f31173c = sentryOptions;
        this.f31171a = oVar;
        this.f31178h = aVar;
        if (context instanceof Application) {
            this.f31177g = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: y9.d
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    SentryOptions.this.getLogger().f(SentryLevel.ERROR, "Error during frames measurements.", th);
                }
            });
            handlerThread.start();
            this.f31174d = new Handler(handlerThread.getLooper());
            ((Application) context).registerActivityLifecycleCallbacks(this);
            this.i = new Window.OnFrameMetricsAvailableListener() { // from class: y9.e
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                    float refreshRate;
                    Display display;
                    f fVar = f.this;
                    fVar.getClass();
                    oVar.getClass();
                    if (Build.VERSION.SDK_INT >= 30) {
                        display = window.getContext().getDisplay();
                        refreshRate = display.getRefreshRate();
                    } else {
                        refreshRate = window.getWindowManager().getDefaultDisplay().getRefreshRate();
                    }
                    Iterator<f.b> it = fVar.f31176f.values().iterator();
                    while (it.hasNext()) {
                        it.next().a(frameMetrics, refreshRate);
                    }
                }
            };
        }
    }

    @SuppressLint({"NewApi"})
    public final void a(Window window) {
        WeakReference<Window> weakReference = this.f31175e;
        if (weakReference != null && weakReference.get() == window) {
            this.f31175e = null;
        }
        HashSet hashSet = this.f31172b;
        if (hashSet.contains(window)) {
            this.f31171a.getClass();
            try {
                c cVar = this.f31178h;
                e eVar = this.i;
                cVar.getClass();
                window.removeOnFrameMetricsAvailableListener(eVar);
            } catch (Exception e10) {
                this.f31173c.getLogger().f(SentryLevel.ERROR, "Failed to remove frameMetricsAvailableListener", e10);
            }
            hashSet.remove(window);
        }
    }

    @SuppressLint({"NewApi"})
    public final void b() {
        WeakReference<Window> weakReference = this.f31175e;
        Window window = weakReference != null ? weakReference.get() : null;
        if (window == null || !this.f31177g) {
            return;
        }
        HashSet hashSet = this.f31172b;
        if (hashSet.contains(window) || this.f31176f.isEmpty()) {
            return;
        }
        this.f31171a.getClass();
        Handler handler = this.f31174d;
        if (handler != null) {
            hashSet.add(window);
            e eVar = this.i;
            this.f31178h.getClass();
            window.addOnFrameMetricsAvailableListener(eVar, handler);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Window window = activity.getWindow();
        WeakReference<Window> weakReference = this.f31175e;
        if (weakReference == null || weakReference.get() != window) {
            this.f31175e = new WeakReference<>(window);
            b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(activity.getWindow());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
