package androidx.work.impl.foreground;

import D1.b;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.ServiceC0555v;
import androidx.work.impl.foreground.a;
import java.util.UUID;
import s1.AbstractC1197g;
import t1.k;

/* loaded from: classes.dex */
public class SystemForegroundService extends ServiceC0555v implements a.InterfaceC0089a {

    /* renamed from: e, reason: collision with root package name */
    public static final String f8196e = AbstractC1197g.e("SystemFgService");

    /* renamed from: a, reason: collision with root package name */
    public Handler f8197a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8198b;

    /* renamed from: c, reason: collision with root package name */
    public a f8199c;

    /* renamed from: d, reason: collision with root package name */
    public NotificationManager f8200d;

    public final void a() {
        this.f8197a = new Handler(Looper.getMainLooper());
        this.f8200d = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.f8199c = aVar;
        if (aVar.i == null) {
            aVar.i = this;
        } else {
            AbstractC1197g.c().b(a.f8201j, "A callback already exists.", new Throwable[0]);
        }
    }

    @Override // androidx.lifecycle.ServiceC0555v, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.ServiceC0555v, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f8199c.g();
    }

    @Override // androidx.lifecycle.ServiceC0555v, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i9) {
        super.onStartCommand(intent, i, i9);
        boolean z10 = this.f8198b;
        String str = f8196e;
        if (z10) {
            AbstractC1197g.c().d(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f8199c.g();
            a();
            this.f8198b = false;
        }
        if (intent == null) {
            return 3;
        }
        a aVar = this.f8199c;
        aVar.getClass();
        String action = intent.getAction();
        boolean equals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = a.f8201j;
        k kVar = aVar.f8202a;
        if (equals) {
            AbstractC1197g.c().d(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
            ((b) aVar.f8203b).a(new A1.b(aVar, kVar.f27440c, intent.getStringExtra("KEY_WORKSPEC_ID"), 0));
            aVar.f(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            aVar.f(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            AbstractC1197g.c().d(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                return 3;
            }
            UUID fromString = UUID.fromString(stringExtra);
            kVar.getClass();
            ((b) kVar.f27441d).a(new C1.a(kVar, fromString));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        AbstractC1197g.c().d(str2, "Stopping foreground service", new Throwable[0]);
        a.InterfaceC0089a interfaceC0089a = aVar.i;
        if (interfaceC0089a == null) {
            return 3;
        }
        SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC0089a;
        systemForegroundService.f8198b = true;
        AbstractC1197g.c().a(str, "All commands completed.", new Throwable[0]);
        systemForegroundService.stopForeground(true);
        systemForegroundService.stopSelf();
        return 3;
    }
}
