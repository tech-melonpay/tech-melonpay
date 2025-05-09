package A1;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: SystemForegroundService.java */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Notification f23b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f25d;

    public d(SystemForegroundService systemForegroundService, int i, Notification notification, int i9) {
        this.f25d = systemForegroundService;
        this.f22a = i;
        this.f23b = notification;
        this.f24c = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = Build.VERSION.SDK_INT;
        Notification notification = this.f23b;
        int i9 = this.f22a;
        SystemForegroundService systemForegroundService = this.f25d;
        if (i >= 29) {
            systemForegroundService.startForeground(i9, notification, this.f24c);
        } else {
            systemForegroundService.startForeground(i9, notification);
        }
    }
}
