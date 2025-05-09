package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.F;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LifecycleDispatcher.kt */
/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0549o {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f7094a = new AtomicBoolean(false);

    /* compiled from: LifecycleDispatcher.kt */
    /* renamed from: androidx.lifecycle.o$a */
    public static final class a extends C0541g {
        @Override // androidx.lifecycle.C0541g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            int i = F.f6953b;
            F.b.b(activity);
        }
    }
}
