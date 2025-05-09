package j0;

import android.app.Notification;
import android.content.LocusId;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class n {
    public static boolean a(Notification notification) {
        return notification.getAllowSystemGeneratedContextualActions();
    }

    public static Notification.BubbleMetadata b(Notification notification) {
        return notification.getBubbleMetadata();
    }

    public static LocusId c(Notification notification) {
        return notification.getLocusId();
    }
}
