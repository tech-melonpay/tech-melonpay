package S1;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.util.LongSparseArray;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.luminary.mobile.R;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: NotificationHelper.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static final LongSparseArray<HttpTransaction> f3355c = new LongSparseArray<>();

    /* renamed from: d, reason: collision with root package name */
    public static final HashSet<Long> f3356d = new HashSet<>();

    /* renamed from: a, reason: collision with root package name */
    public final Context f3357a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f3358b;

    public j(Context context) {
        this.f3357a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.f3358b = notificationManager;
        new A8.b(this, 11);
        notificationManager.createNotificationChannels(Collections.singletonList(new NotificationChannel("chucker_transactions", context.getString(R.string.chucker_network_notification_category), 2)));
    }
}
