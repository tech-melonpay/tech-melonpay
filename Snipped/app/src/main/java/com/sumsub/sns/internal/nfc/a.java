package com.sumsub.sns.internal.nfc;

import android.app.Activity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import h.ActivityC0775b;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final C0283a f17769d = new C0283a(null);

    /* renamed from: a, reason: collision with root package name */
    public final d f17770a;

    /* renamed from: b, reason: collision with root package name */
    public final b f17771b = new b();

    /* renamed from: c, reason: collision with root package name */
    public WeakReference<ActivityC0775b> f17772c;

    /* renamed from: com.sumsub.sns.internal.nfc.a$a, reason: collision with other inner class name */
    public static final class C0283a {
        public /* synthetic */ C0283a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0283a() {
        }
    }

    public final class b implements DefaultLifecycleObserver {
        public b() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(r rVar) {
            c.a(c.f17776a, "NfcActivityAttacher", "LifecycleObserver onDestroy", null, 4, null);
            a.this.a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onPause(r rVar) {
            c.a(c.f17776a, "NfcActivityAttacher", "LifecycleObserver onPause", null, 4, null);
            a.this.f17770a.d((Activity) rVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(r rVar) {
            c.a(c.f17776a, "NfcActivityAttacher", "LifecycleObserver onResume", null, 4, null);
            a.this.f17770a.e((Activity) rVar);
        }
    }

    public a(d dVar) {
        this.f17770a = dVar;
    }

    public final void a(ActivityC0775b activityC0775b) {
        if (this.f17772c != null) {
            throw new IllegalStateException("Can't attach activity twice");
        }
        this.f17772c = new WeakReference<>(activityC0775b);
        activityC0775b.getLifecycle().a(this.f17771b);
        c cVar = c.f17776a;
        c.a(cVar, "NfcActivityAttacher", "Attached to " + activityC0775b, null, 4, null);
        if (activityC0775b.getLifecycle().b() == Lifecycle.State.f6979e) {
            c.a(cVar, "NfcActivityAttacher", "onActivityResume on attach", null, 4, null);
            this.f17770a.e(activityC0775b);
        }
    }

    public final void a() {
        WeakReference<ActivityC0775b> weakReference = this.f17772c;
        ActivityC0775b activityC0775b = weakReference != null ? weakReference.get() : null;
        if (weakReference != null && activityC0775b != null) {
            c cVar = c.f17776a;
            c.a(cVar, "NfcActivityAttacher", "Detached from " + activityC0775b, null, 4, null);
            activityC0775b.getLifecycle().c(this.f17771b);
            this.f17772c = null;
            if (activityC0775b.getLifecycle().b() == Lifecycle.State.f6979e) {
                c.a(cVar, "NfcActivityAttacher", "onActivityPause on detach", null, 4, null);
                this.f17770a.d(activityC0775b);
                return;
            }
            return;
        }
        c.a(c.f17776a, "NfcActivityAttacher", "Detach called but attachedActivity is null", null, 4, null);
    }
}
