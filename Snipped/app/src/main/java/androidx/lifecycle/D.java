package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;

/* compiled from: ProcessLifecycleOwner.kt */
/* loaded from: classes.dex */
public final class D extends C0541g {
    final /* synthetic */ ProcessLifecycleOwner this$0;

    /* compiled from: ProcessLifecycleOwner.kt */
    public static final class a extends C0541g {
        final /* synthetic */ ProcessLifecycleOwner this$0;

        public a(ProcessLifecycleOwner processLifecycleOwner) {
            this.this$0 = processLifecycleOwner;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            ProcessLifecycleOwner processLifecycleOwner = this.this$0;
            int i = processLifecycleOwner.f7007a + 1;
            processLifecycleOwner.f7007a = i;
            if (i == 1 && processLifecycleOwner.f7010d) {
                processLifecycleOwner.f7012f.f(Lifecycle.Event.ON_START);
                processLifecycleOwner.f7010d = false;
            }
        }
    }

    public D(ProcessLifecycleOwner processLifecycleOwner) {
        this.this$0 = processLifecycleOwner;
    }

    @Override // androidx.lifecycle.C0541g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = F.f6953b;
            ((F) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f6954a = this.this$0.f7014h;
        }
    }

    @Override // androidx.lifecycle.C0541g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i = processLifecycleOwner.f7008b - 1;
        processLifecycleOwner.f7008b = i;
        if (i == 0) {
            processLifecycleOwner.f7011e.postDelayed(processLifecycleOwner.f7013g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        ProcessLifecycleOwner.a.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.C0541g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i = processLifecycleOwner.f7007a - 1;
        processLifecycleOwner.f7007a = i;
        if (i == 0 && processLifecycleOwner.f7009c) {
            processLifecycleOwner.f7012f.f(Lifecycle.Event.ON_STOP);
            processLifecycleOwner.f7010d = true;
        }
    }
}
