package w9;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.core.view.GestureDetectorCompat;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.Collections;
import w9.b;

/* compiled from: SentryWindowCallback.java */
/* loaded from: classes2.dex */
public final class d extends g {

    /* renamed from: b, reason: collision with root package name */
    public final Window.Callback f30864b;

    /* renamed from: c, reason: collision with root package name */
    public final b f30865c;

    /* renamed from: d, reason: collision with root package name */
    public final GestureDetectorCompat f30866d;

    /* renamed from: e, reason: collision with root package name */
    public final SentryOptions f30867e;

    /* renamed from: f, reason: collision with root package name */
    public final a f30868f;

    /* compiled from: SentryWindowCallback.java */
    public interface a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Window.Callback callback, Context context, b bVar, SentryAndroidOptions sentryAndroidOptions) {
        super(callback);
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(context, bVar);
        c cVar = new c();
        this.f30864b = callback;
        this.f30865c = bVar;
        this.f30867e = sentryAndroidOptions;
        this.f30866d = gestureDetectorCompat;
        this.f30868f = cVar;
    }

    public final void a(MotionEvent motionEvent) {
        this.f30866d.f6499a.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            b bVar = this.f30865c;
            View b9 = bVar.b("onUp");
            b.C0476b c0476b = bVar.f30858h;
            View view = c0476b.f30861b.get();
            if (b9 == null || view == null) {
                return;
            }
            if (c0476b.f30860a == null) {
                bVar.f30853c.getLogger().h(SentryLevel.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
                return;
            }
            float x9 = motionEvent.getX() - c0476b.f30862c;
            float y10 = motionEvent.getY() - c0476b.f30863d;
            bVar.a(view, c0476b.f30860a, Collections.singletonMap("direction", Math.abs(x9) > Math.abs(y10) ? x9 > 0.0f ? "right" : "left" : y10 > 0.0f ? "down" : "up"), motionEvent);
            bVar.c(view, c0476b.f30860a);
            c0476b.f30861b.clear();
            c0476b.f30860a = null;
            c0476b.f30862c = 0.0f;
            c0476b.f30863d = 0.0f;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        SentryOptions sentryOptions;
        if (motionEvent != null) {
            this.f30868f.getClass();
            try {
                a(MotionEvent.obtain(motionEvent));
            } finally {
                if (sentryOptions != null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        return this.f30869a.dispatchTouchEvent(motionEvent);
    }
}
