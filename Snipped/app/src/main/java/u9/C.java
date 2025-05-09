package u9;

import C.N;
import android.app.Activity;
import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import io.sentry.C0843a;
import io.sentry.C0852j;
import io.sentry.InterfaceC0850h;
import io.sentry.SentryLevel;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.i0;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: ScreenshotEventProcessor.java */
/* loaded from: classes2.dex */
public final class C implements InterfaceC0850h, Application.ActivityLifecycleCallbacks, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Application f30361a;

    /* renamed from: b, reason: collision with root package name */
    public final SentryAndroidOptions f30362b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference<Activity> f30363c;

    /* renamed from: d, reason: collision with root package name */
    public final o f30364d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f30365e = true;

    public C(Application application, SentryAndroidOptions sentryAndroidOptions, o oVar) {
        this.f30361a = application;
        D9.b.t0(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f30362b = sentryAndroidOptions;
        this.f30364d = oVar;
        application.registerActivityLifecycleCallbacks(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f30362b.isAttachScreenshot()) {
            this.f30361a.unregisterActivityLifecycleCallbacks(this);
            this.f30363c = null;
        }
    }

    @Override // io.sentry.InterfaceC0850h
    public final i0 d(i0 i0Var, C0852j c0852j) {
        WeakReference<Activity> weakReference;
        if (!this.f30365e) {
            return i0Var;
        }
        SentryAndroidOptions sentryAndroidOptions = this.f30362b;
        if (!sentryAndroidOptions.isAttachScreenshot()) {
            this.f30361a.unregisterActivityLifecycleCallbacks(this);
            this.f30365e = false;
            sentryAndroidOptions.getLogger().h(SentryLevel.DEBUG, "attachScreenshot is disabled, ScreenshotEventProcessor isn't installed.", new Object[0]);
            return i0Var;
        }
        N n10 = i0Var.f22040s;
        if (n10 != null && !((ArrayList) n10.f535b).isEmpty() && (weakReference = this.f30363c) != null) {
            Activity activity = weakReference.get();
            if (activity != null) {
                this.f30364d.getClass();
                if (!activity.isFinishing() && !activity.isDestroyed() && activity.getWindow() != null && activity.getWindow().getDecorView() != null && activity.getWindow().getDecorView().getRootView() != null) {
                    View rootView = activity.getWindow().getDecorView().getRootView();
                    if (rootView.getWidth() <= 0 || rootView.getHeight() <= 0) {
                        sentryAndroidOptions.getLogger().h(SentryLevel.DEBUG, "View's width and height is zeroed, not taking screenshot.", new Object[0]);
                    } else {
                        try {
                            Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
                            rootView.draw(new Canvas(createBitmap));
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            createBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                            if (byteArrayOutputStream.size() > 0) {
                                c0852j.f22049c = new C0843a(byteArrayOutputStream.toByteArray());
                                c0852j.a(activity, "android:activity");
                            } else {
                                sentryAndroidOptions.getLogger().h(SentryLevel.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                            }
                        } catch (Throwable th) {
                            sentryAndroidOptions.getLogger().f(SentryLevel.ERROR, "Taking screenshot failed.", th);
                        }
                    }
                }
            }
            sentryAndroidOptions.getLogger().h(SentryLevel.DEBUG, "Activity isn't valid, not taking screenshot.", new Object[0]);
        }
        return i0Var;
    }

    public final void j(Activity activity) {
        WeakReference<Activity> weakReference = this.f30363c;
        if (weakReference == null || weakReference.get() != activity) {
            this.f30363c = new WeakReference<>(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        j(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        WeakReference<Activity> weakReference = this.f30363c;
        if (weakReference == null || weakReference.get() != activity) {
            return;
        }
        this.f30363c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        WeakReference<Activity> weakReference = this.f30363c;
        if (weakReference == null || weakReference.get() != activity) {
            return;
        }
        this.f30363c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        j(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        j(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        WeakReference<Activity> weakReference = this.f30363c;
        if (weakReference == null || weakReference.get() != activity) {
            return;
        }
        this.f30363c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
