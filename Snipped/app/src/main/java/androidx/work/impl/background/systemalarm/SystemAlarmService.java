package androidx.work.impl.background.systemalarm;

import C1.n;
import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.ServiceC0555v;
import androidx.work.impl.background.systemalarm.d;
import java.util.HashMap;
import java.util.WeakHashMap;
import s1.AbstractC1197g;

/* loaded from: classes.dex */
public class SystemAlarmService extends ServiceC0555v implements d.c {

    /* renamed from: c, reason: collision with root package name */
    public static final String f8157c = AbstractC1197g.e("SystemAlarmService");

    /* renamed from: a, reason: collision with root package name */
    public d f8158a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8159b;

    public final void a() {
        this.f8159b = true;
        AbstractC1197g.c().a(f8157c, "All commands completed in dispatcher", new Throwable[0]);
        String str = n.f630a;
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = n.f631b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                AbstractC1197g.c().f(n.f630a, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.ServiceC0555v, android.app.Service
    public final void onCreate() {
        super.onCreate();
        d dVar = new d(this);
        this.f8158a = dVar;
        if (dVar.f8186j != null) {
            AbstractC1197g.c().b(d.f8177k, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            dVar.f8186j = this;
        }
        this.f8159b = false;
    }

    @Override // androidx.lifecycle.ServiceC0555v, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f8159b = true;
        this.f8158a.d();
    }

    @Override // androidx.lifecycle.ServiceC0555v, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i9) {
        super.onStartCommand(intent, i, i9);
        if (this.f8159b) {
            AbstractC1197g.c().d(f8157c, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f8158a.d();
            d dVar = new d(this);
            this.f8158a = dVar;
            if (dVar.f8186j != null) {
                AbstractC1197g.c().b(d.f8177k, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            } else {
                dVar.f8186j = this;
            }
            this.f8159b = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f8158a.a(i9, intent);
        return 3;
    }
}
