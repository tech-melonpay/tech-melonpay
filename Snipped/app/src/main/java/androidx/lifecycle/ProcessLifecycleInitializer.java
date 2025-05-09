package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.C0549o;
import androidx.lifecycle.Lifecycle;
import g1.C0758a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

/* compiled from: ProcessLifecycleInitializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lg1/b;", "Landroidx/lifecycle/r;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements g1.b<r> {
    @Override // g1.b
    public final List<Class<? extends g1.b<?>>> a() {
        return EmptyList.f23104a;
    }

    @Override // g1.b
    public final r b(Context context) {
        if (!C0758a.c(context).f20759b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        if (!C0549o.f7094a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0549o.a());
        }
        ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.i;
        processLifecycleOwner.getClass();
        processLifecycleOwner.f7011e = new Handler();
        processLifecycleOwner.f7012f.f(Lifecycle.Event.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new D(processLifecycleOwner));
        return processLifecycleOwner;
    }
}
