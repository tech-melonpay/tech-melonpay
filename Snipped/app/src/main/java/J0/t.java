package j0;

import android.app.Notification;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class t extends w {

    /* compiled from: NotificationCompat.java */
    public static class a {
        public static Notification.Style a() {
            return new Notification.DecoratedCustomViewStyle();
        }
    }

    @Override // j0.w
    public final void b(x xVar) {
        xVar.f22382b.setStyle(a.a());
    }

    @Override // j0.w
    public final String d() {
        return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    }
}
