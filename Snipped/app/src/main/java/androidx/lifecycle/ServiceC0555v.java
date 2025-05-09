package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.Lifecycle;

/* compiled from: LifecycleService.kt */
/* renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ServiceC0555v extends Service implements r {
    private final N dispatcher = new N(this);

    @Override // androidx.lifecycle.r
    public Lifecycle getLifecycle() {
        return this.dispatcher.f6994a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.dispatcher.a(Lifecycle.Event.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.dispatcher.a(Lifecycle.Event.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        N n10 = this.dispatcher;
        n10.a(Lifecycle.Event.ON_STOP);
        n10.a(Lifecycle.Event.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        this.dispatcher.a(Lifecycle.Event.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i9) {
        return super.onStartCommand(intent, i, i9);
    }
}
