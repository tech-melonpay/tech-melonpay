package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import androidx.lifecycle.F;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;

/* compiled from: ProcessLifecycleOwner.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Landroidx/lifecycle/r;", "<init>", "()V", "a", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ProcessLifecycleOwner implements r {
    public static final ProcessLifecycleOwner i = new ProcessLifecycleOwner();

    /* renamed from: a, reason: collision with root package name */
    public int f7007a;

    /* renamed from: b, reason: collision with root package name */
    public int f7008b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f7011e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7009c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7010d = true;

    /* renamed from: f, reason: collision with root package name */
    public final C0553t f7012f = new C0553t(this);

    /* renamed from: g, reason: collision with root package name */
    public final B2.d f7013g = new B2.d(this, 27);

    /* renamed from: h, reason: collision with root package name */
    public final b f7014h = new b();

    /* compiled from: ProcessLifecycleOwner.kt */
    public static final class a {
        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    public static final class b implements F.a {
        public b() {
        }

        @Override // androidx.lifecycle.F.a
        public final void onResume() {
            ProcessLifecycleOwner.this.a();
        }

        @Override // androidx.lifecycle.F.a
        public final void onStart() {
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.this;
            int i = processLifecycleOwner.f7007a + 1;
            processLifecycleOwner.f7007a = i;
            if (i == 1 && processLifecycleOwner.f7010d) {
                processLifecycleOwner.f7012f.f(Lifecycle.Event.ON_START);
                processLifecycleOwner.f7010d = false;
            }
        }
    }

    private ProcessLifecycleOwner() {
    }

    public final void a() {
        int i9 = this.f7008b + 1;
        this.f7008b = i9;
        if (i9 == 1) {
            if (!this.f7009c) {
                this.f7011e.removeCallbacks(this.f7013g);
            } else {
                this.f7012f.f(Lifecycle.Event.ON_RESUME);
                this.f7009c = false;
            }
        }
    }

    @Override // androidx.lifecycle.r
    public final Lifecycle getLifecycle() {
        return this.f7012f;
    }
}
