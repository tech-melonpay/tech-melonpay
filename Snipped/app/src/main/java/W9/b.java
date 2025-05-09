package w9;

import android.app.Activity;
import android.content.res.Resources;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.camera.core.n;
import androidx.core.view.ScrollingView;
import io.sentry.C0844b;
import io.sentry.C0852j;
import io.sentry.InterfaceC0858p;
import io.sentry.InterfaceC0864w;
import io.sentry.SentryLevel;
import io.sentry.SpanStatus;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.u0;
import io.sentry.v0;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* compiled from: SentryGestureListener.java */
/* loaded from: classes2.dex */
public final class b implements GestureDetector.OnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference<Activity> f30851a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0858p f30852b;

    /* renamed from: c, reason: collision with root package name */
    public final SentryAndroidOptions f30853c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f30854d;

    /* renamed from: e, reason: collision with root package name */
    public WeakReference<View> f30855e = null;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0864w f30856f = null;

    /* renamed from: g, reason: collision with root package name */
    public String f30857g = null;

    /* renamed from: h, reason: collision with root package name */
    public final C0476b f30858h;

    /* compiled from: SentryGestureListener.java */
    public class a implements e {
        public a() {
        }

        @Override // w9.e
        public final boolean b() {
            return true;
        }

        @Override // w9.e
        public final boolean e(View view) {
            return ((b.this.f30854d && ScrollingView.class.isAssignableFrom(view.getClass())) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass())) && view.getVisibility() == 0;
        }
    }

    /* compiled from: SentryGestureListener.java */
    /* renamed from: w9.b$b, reason: collision with other inner class name */
    public static final class C0476b {

        /* renamed from: a, reason: collision with root package name */
        public String f30860a;

        /* renamed from: b, reason: collision with root package name */
        public WeakReference<View> f30861b;

        /* renamed from: c, reason: collision with root package name */
        public float f30862c;

        /* renamed from: d, reason: collision with root package name */
        public float f30863d;
    }

    public b(Activity activity, InterfaceC0858p interfaceC0858p, SentryAndroidOptions sentryAndroidOptions, boolean z10) {
        C0476b c0476b = new C0476b();
        c0476b.f30860a = null;
        c0476b.f30861b = new WeakReference<>(null);
        c0476b.f30862c = 0.0f;
        c0476b.f30863d = 0.0f;
        this.f30858h = c0476b;
        this.f30851a = new WeakReference<>(activity);
        this.f30852b = interfaceC0858p;
        this.f30853c = sentryAndroidOptions;
        this.f30854d = z10;
    }

    public final void a(View view, String str, Map<String, Object> map, MotionEvent motionEvent) {
        String str2;
        String canonicalName = view.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = view.getClass().getSimpleName();
        }
        C0852j c0852j = new C0852j();
        c0852j.a(motionEvent, "android:motionEvent");
        c0852j.a(view, "android:view");
        int id = view.getId();
        try {
            int id2 = view.getId();
            Resources resources = view.getContext().getResources();
            str2 = resources != null ? resources.getResourceEntryName(id2) : "";
        } catch (Resources.NotFoundException unused) {
            str2 = "0x" + Integer.toString(id, 16);
        }
        C0844b c0844b = new C0844b();
        c0844b.f21964c = "user";
        c0844b.f21966e = s3.b.j("ui.", str);
        if (str2 != null) {
            c0844b.a(str2, "view.id");
        }
        c0844b.a(canonicalName, "view.class");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            c0844b.f21965d.put(entry.getKey(), entry.getValue());
        }
        c0844b.f21967f = SentryLevel.INFO;
        this.f30852b.e(c0844b, c0852j);
    }

    public final View b(String str) {
        Activity activity = this.f30851a.get();
        SentryAndroidOptions sentryAndroidOptions = this.f30853c;
        if (activity == null) {
            sentryAndroidOptions.getLogger().h(SentryLevel.DEBUG, n.a("Activity is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            sentryAndroidOptions.getLogger().h(SentryLevel.DEBUG, n.a("Window is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            return decorView;
        }
        sentryAndroidOptions.getLogger().h(SentryLevel.DEBUG, n.a("DecorView is null in ", str, ". No breadcrumb captured."), new Object[0]);
        return null;
    }

    public final void c(View view, String str) {
        SentryAndroidOptions sentryAndroidOptions = this.f30853c;
        if (sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableUserInteractionTracing()) {
            Activity activity = this.f30851a.get();
            if (activity == null) {
                sentryAndroidOptions.getLogger().h(SentryLevel.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
                return;
            }
            try {
                int id = view.getId();
                Resources resources = view.getContext().getResources();
                String resourceEntryName = resources != null ? resources.getResourceEntryName(id) : "";
                WeakReference<View> weakReference = this.f30855e;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (this.f30856f != null) {
                    if (view.equals(view2) && str.equals(this.f30857g) && !this.f30856f.b()) {
                        sentryAndroidOptions.getLogger().h(SentryLevel.DEBUG, n.a("The view with id: ", resourceEntryName, " already has an ongoing transaction assigned. Rescheduling finish"), new Object[0]);
                        if (sentryAndroidOptions.getIdleTimeout() != null) {
                            this.f30856f.i();
                            return;
                        }
                        return;
                    }
                    d(SpanStatus.OK);
                }
                String str2 = activity.getClass().getSimpleName() + "." + resourceEntryName;
                String j10 = s3.b.j("ui.action.", str);
                v0 v0Var = new v0();
                v0Var.f22212b = true;
                v0Var.f22213c = sentryAndroidOptions.getIdleTimeout();
                v0Var.f22214d = true;
                u0 u0Var = new u0(str2, TransactionNameSource.COMPONENT, j10);
                InterfaceC0858p interfaceC0858p = this.f30852b;
                InterfaceC0864w d10 = interfaceC0858p.d(u0Var, v0Var);
                interfaceC0858p.f(new B.e(10, this, d10));
                this.f30856f = d10;
                this.f30855e = new WeakReference<>(view);
                this.f30857g = str;
            } catch (Resources.NotFoundException unused) {
                sentryAndroidOptions.getLogger().h(SentryLevel.DEBUG, "View id cannot be retrieved from Resources, no transaction captured.", new Object[0]);
            }
        }
    }

    public final void d(SpanStatus spanStatus) {
        InterfaceC0864w interfaceC0864w = this.f30856f;
        if (interfaceC0864w != null) {
            interfaceC0864w.c(spanStatus);
        }
        this.f30852b.f(new com.sumsub.sns.geo.presentation.d(this, 27));
        this.f30856f = null;
        WeakReference<View> weakReference = this.f30855e;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f30857g = null;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        C0476b c0476b = this.f30858h;
        c0476b.f30861b.clear();
        c0476b.f30860a = null;
        c0476b.f30862c = 0.0f;
        c0476b.f30863d = 0.0f;
        c0476b.f30862c = motionEvent.getX();
        c0476b.f30863d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.f30858h.f30860a = "swipe";
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        View b9 = b("onScroll");
        if (b9 != null && motionEvent != null) {
            C0476b c0476b = this.f30858h;
            if (c0476b.f30860a == null) {
                View a10 = f.a(b9, motionEvent.getX(), motionEvent.getY(), new a());
                if (a10 == null) {
                    this.f30853c.getLogger().h(SentryLevel.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                    return false;
                }
                c0476b.getClass();
                c0476b.f30861b = new WeakReference<>(a10);
                c0476b.f30860a = "scroll";
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View b9 = b("onSingleTapUp");
        if (b9 != null && motionEvent != null) {
            View a10 = f.a(b9, motionEvent.getX(), motionEvent.getY(), new s3.b(22));
            if (a10 == null) {
                this.f30853c.getLogger().h(SentryLevel.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            a(a10, "click", Collections.emptyMap(), motionEvent);
            c(a10, "click");
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
