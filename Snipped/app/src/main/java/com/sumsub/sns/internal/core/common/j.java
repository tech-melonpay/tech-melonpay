package com.sumsub.sns.internal.core.common;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import java.util.Iterator;
import k0.C0913a;

/* loaded from: classes2.dex */
public final class j {
    public static final boolean a(Context context, String str) {
        return C0913a.checkSelfPermission(context, str) == 0;
    }

    public static final boolean b(Context context, String str) {
        Object obj;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (!notificationManager.areNotificationsEnabled()) {
            return false;
        }
        Iterator<T> it = notificationManager.getNotificationChannels().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.f.b(((NotificationChannel) obj).getId(), str)) {
                break;
            }
        }
        NotificationChannel notificationChannel = (NotificationChannel) obj;
        return notificationChannel == null || notificationChannel.getImportance() != 0;
    }
}
