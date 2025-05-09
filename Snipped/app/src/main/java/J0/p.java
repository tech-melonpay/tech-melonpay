package j0;

import android.app.Notification;
import android.os.Bundle;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class p extends w {

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f22301e;

    @Override // j0.w
    public final void a(Bundle bundle) {
        super.a(bundle);
    }

    @Override // j0.w
    public final void b(x xVar) {
        Notification.BigTextStyle bigText = new Notification.BigTextStyle(xVar.f22382b).setBigContentTitle(this.f22378b).bigText(this.f22301e);
        if (this.f22380d) {
            bigText.setSummaryText(this.f22379c);
        }
    }

    @Override // j0.w
    public final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.bigText");
    }

    @Override // j0.w
    public final String d() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    @Override // j0.w
    public final void e(Bundle bundle) {
        super.e(bundle);
        this.f22301e = bundle.getCharSequence("android.bigText");
    }
}
