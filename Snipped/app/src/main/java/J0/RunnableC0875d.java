package j0;

import android.app.Application;
import j0.C0876e;

/* compiled from: ActivityRecreator.java */
/* renamed from: j0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0875d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Application f22247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0876e.a f22248b;

    public RunnableC0875d(Application application, C0876e.a aVar) {
        this.f22247a = application;
        this.f22248b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22247a.unregisterActivityLifecycleCallbacks(this.f22248b);
    }
}
