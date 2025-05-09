package j0;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public PendingIntent f22302a;

    /* renamed from: b, reason: collision with root package name */
    public PendingIntent f22303b;

    /* renamed from: c, reason: collision with root package name */
    public IconCompat f22304c;

    /* renamed from: d, reason: collision with root package name */
    public int f22305d;

    /* renamed from: e, reason: collision with root package name */
    public int f22306e;

    /* renamed from: f, reason: collision with root package name */
    public int f22307f;

    /* renamed from: g, reason: collision with root package name */
    public String f22308g;

    /* compiled from: NotificationCompat.java */
    public static class a {
        public static q a(Notification.BubbleMetadata bubbleMetadata) {
            int i;
            if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                return null;
            }
            PendingIntent intent = bubbleMetadata.getIntent();
            Icon icon = bubbleMetadata.getIcon();
            PorterDuff.Mode mode = IconCompat.f6489k;
            IconCompat a10 = IconCompat.a.a(icon);
            if (intent == null) {
                throw new NullPointerException("Bubble requires non-null pending intent");
            }
            int i9 = 0;
            int i10 = bubbleMetadata.getAutoExpandBubble() ? 0 | 1 : (~1) & 0;
            PendingIntent deleteIntent = bubbleMetadata.getDeleteIntent();
            int i11 = bubbleMetadata.isNotificationSuppressed() ? i10 | 2 : i10 & (~2);
            int max = bubbleMetadata.getDesiredHeight() != 0 ? Math.max(bubbleMetadata.getDesiredHeight(), 0) : 0;
            if (bubbleMetadata.getDesiredHeightResId() != 0) {
                i = bubbleMetadata.getDesiredHeightResId();
            } else {
                i = 0;
                i9 = max;
            }
            q qVar = new q();
            qVar.f22302a = intent;
            qVar.f22304c = a10;
            qVar.f22305d = i9;
            qVar.f22306e = i;
            qVar.f22303b = deleteIntent;
            qVar.f22308g = null;
            qVar.f22307f = i11;
            return qVar;
        }

        public static Notification.BubbleMetadata b(q qVar) {
            PendingIntent pendingIntent;
            if (qVar == null || (pendingIntent = qVar.f22302a) == null) {
                return null;
            }
            Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(qVar.f22304c.f(null)).setIntent(pendingIntent).setDeleteIntent(qVar.f22303b).setAutoExpandBubble((qVar.f22307f & 1) != 0).setSuppressNotification((qVar.f22307f & 2) != 0);
            int i = qVar.f22305d;
            if (i != 0) {
                suppressNotification.setDesiredHeight(i);
            }
            int i9 = qVar.f22306e;
            if (i9 != 0) {
                suppressNotification.setDesiredHeightResId(i9);
            }
            return suppressNotification.build();
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class b {
        public static q a(Notification.BubbleMetadata bubbleMetadata) {
            c cVar;
            if (bubbleMetadata == null) {
                return null;
            }
            if (bubbleMetadata.getShortcutId() != null) {
                String shortcutId = bubbleMetadata.getShortcutId();
                cVar = new c();
                if (TextUtils.isEmpty(shortcutId)) {
                    throw new NullPointerException("Bubble requires a non-null shortcut id");
                }
                cVar.f22315g = shortcutId;
            } else {
                PendingIntent intent = bubbleMetadata.getIntent();
                Icon icon = bubbleMetadata.getIcon();
                PorterDuff.Mode mode = IconCompat.f6489k;
                cVar = new c(intent, IconCompat.a.a(icon));
            }
            cVar.a(1, bubbleMetadata.getAutoExpandBubble());
            cVar.f22314f = bubbleMetadata.getDeleteIntent();
            cVar.a(2, bubbleMetadata.isNotificationSuppressed());
            if (bubbleMetadata.getDesiredHeight() != 0) {
                cVar.f22311c = Math.max(bubbleMetadata.getDesiredHeight(), 0);
                cVar.f22312d = 0;
            }
            if (bubbleMetadata.getDesiredHeightResId() != 0) {
                cVar.f22312d = bubbleMetadata.getDesiredHeightResId();
                cVar.f22311c = 0;
            }
            PendingIntent pendingIntent = cVar.f22309a;
            String str = cVar.f22315g;
            if (str == null && pendingIntent == null) {
                throw new NullPointerException("Must supply pending intent or shortcut to bubble");
            }
            IconCompat iconCompat = cVar.f22310b;
            if (str == null && iconCompat == null) {
                throw new NullPointerException("Must supply an icon or shortcut for the bubble");
            }
            PendingIntent pendingIntent2 = cVar.f22314f;
            int i = cVar.f22311c;
            int i9 = cVar.f22312d;
            int i10 = cVar.f22313e;
            q qVar = new q();
            qVar.f22302a = pendingIntent;
            qVar.f22304c = iconCompat;
            qVar.f22305d = i;
            qVar.f22306e = i9;
            qVar.f22303b = pendingIntent2;
            qVar.f22308g = str;
            qVar.f22307f = i10;
            return qVar;
        }

        public static Notification.BubbleMetadata b(q qVar) {
            if (qVar == null) {
                return null;
            }
            String str = qVar.f22308g;
            Notification.BubbleMetadata.Builder builder = str != null ? new Notification.BubbleMetadata.Builder(str) : new Notification.BubbleMetadata.Builder(qVar.f22302a, qVar.f22304c.f(null));
            builder.setDeleteIntent(qVar.f22303b).setAutoExpandBubble((qVar.f22307f & 1) != 0).setSuppressNotification((qVar.f22307f & 2) != 0);
            int i = qVar.f22305d;
            if (i != 0) {
                builder.setDesiredHeight(i);
            }
            int i9 = qVar.f22306e;
            if (i9 != 0) {
                builder.setDesiredHeightResId(i9);
            }
            return builder.build();
        }
    }

    /* compiled from: NotificationCompat.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final PendingIntent f22309a;

        /* renamed from: b, reason: collision with root package name */
        public final IconCompat f22310b;

        /* renamed from: c, reason: collision with root package name */
        public int f22311c;

        /* renamed from: d, reason: collision with root package name */
        public int f22312d;

        /* renamed from: e, reason: collision with root package name */
        public int f22313e;

        /* renamed from: f, reason: collision with root package name */
        public PendingIntent f22314f;

        /* renamed from: g, reason: collision with root package name */
        public String f22315g;

        public c(PendingIntent pendingIntent, IconCompat iconCompat) {
            if (pendingIntent == null) {
                throw new NullPointerException("Bubble requires non-null pending intent");
            }
            this.f22309a = pendingIntent;
            this.f22310b = iconCompat;
        }

        public final void a(int i, boolean z10) {
            if (z10) {
                this.f22313e = i | this.f22313e;
            } else {
                this.f22313e = (~i) & this.f22313e;
            }
        }
    }
}
