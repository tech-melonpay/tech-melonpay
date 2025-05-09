package com.luminary.business;

import B2.d;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.luminary.business.presentation.ui.activity.main.MainActivity;
import com.luminary.mobile.R;
import j0.r;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* compiled from: AppFirebaseMessagingService.kt */
/* loaded from: classes.dex */
public final class AppFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: a, reason: collision with root package name */
    public final String f10638a = "bank.business";

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        RemoteMessage.Notification notification = remoteMessage.getNotification();
        String title = notification != null ? notification.getTitle() : null;
        RemoteMessage.Notification notification2 = remoteMessage.getNotification();
        String body = notification2 != null ? notification2.getBody() : null;
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.addFlags(PKIFailureInfo.badCertTemplate);
        PendingIntent.getActivity(this, 0, intent, Build.VERSION.SDK_INT >= 31 ? 201326592 : 134217728);
        Uri defaultUri = RingtoneManager.getDefaultUri(2);
        String str = this.f10638a;
        r rVar = new r(this, str);
        rVar.f22328M.icon = R.mipmap.ic_launcher;
        rVar.f22336e = r.b(title);
        rVar.f22337f = r.b(body);
        rVar.c(16, true);
        Notification notification3 = rVar.f22328M;
        notification3.sound = defaultUri;
        notification3.audioStreamType = -1;
        notification3.audioAttributes = r.a.a(r.a.e(r.a.c(r.a.b(), 4), 5));
        rVar.f22321F = "100";
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        NotificationChannel notificationChannel = new NotificationChannel("100", str, 4);
        notificationChannel.setDescription("Notifications");
        notificationChannel.enableLights(true);
        notificationChannel.setLightColor(-65536);
        notificationChannel.enableVibration(true);
        notificationManager.createNotificationChannel(notificationChannel);
        notificationManager.notify(0, rVar.a());
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String str) {
        super.onNewToken(str);
        new Thread(new d(str, 9)).start();
    }
}
