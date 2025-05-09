package j0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.luminary.mobile.R;
import java.util.ArrayList;
import k0.C0914b;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: A, reason: collision with root package name */
    public String f22316A;

    /* renamed from: B, reason: collision with root package name */
    public Bundle f22317B;

    /* renamed from: E, reason: collision with root package name */
    public Notification f22320E;

    /* renamed from: F, reason: collision with root package name */
    public String f22321F;

    /* renamed from: H, reason: collision with root package name */
    public String f22323H;

    /* renamed from: I, reason: collision with root package name */
    public C0914b f22324I;

    /* renamed from: J, reason: collision with root package name */
    public long f22325J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f22326K;

    /* renamed from: L, reason: collision with root package name */
    public q f22327L;

    /* renamed from: M, reason: collision with root package name */
    public final Notification f22328M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f22329N;

    /* renamed from: O, reason: collision with root package name */
    public Icon f22330O;

    /* renamed from: P, reason: collision with root package name */
    @Deprecated
    public final ArrayList<String> f22331P;

    /* renamed from: a, reason: collision with root package name */
    public final Context f22332a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f22336e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f22337f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f22338g;

    /* renamed from: h, reason: collision with root package name */
    public PendingIntent f22339h;
    public IconCompat i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f22340j;

    /* renamed from: k, reason: collision with root package name */
    public int f22341k;

    /* renamed from: l, reason: collision with root package name */
    public int f22342l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f22344n;

    /* renamed from: o, reason: collision with root package name */
    public w f22345o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f22346p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f22347q;

    /* renamed from: r, reason: collision with root package name */
    public int f22348r;

    /* renamed from: s, reason: collision with root package name */
    public int f22349s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f22350t;

    /* renamed from: u, reason: collision with root package name */
    public String f22351u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f22352v;

    /* renamed from: w, reason: collision with root package name */
    public String f22353w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f22355y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f22356z;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<m> f22333b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<C0871C> f22334c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList<m> f22335d = new ArrayList<>();

    /* renamed from: m, reason: collision with root package name */
    public boolean f22343m = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f22354x = false;

    /* renamed from: C, reason: collision with root package name */
    public int f22318C = 0;

    /* renamed from: D, reason: collision with root package name */
    public int f22319D = 0;

    /* renamed from: G, reason: collision with root package name */
    public int f22322G = 0;

    /* compiled from: NotificationCompat.java */
    public static class a {
        public static AudioAttributes a(AudioAttributes.Builder builder) {
            return builder.build();
        }

        public static AudioAttributes.Builder b() {
            return new AudioAttributes.Builder();
        }

        public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i) {
            return builder.setContentType(i);
        }

        public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i) {
            return builder.setLegacyStreamType(i);
        }

        public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i) {
            return builder.setUsage(i);
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class b {
        public static Icon a(Notification notification) {
            return notification.getLargeIcon();
        }

        public static Icon b(Notification notification) {
            return notification.getSmallIcon();
        }
    }

    public r(Context context, String str) {
        Notification notification = new Notification();
        this.f22328M = notification;
        this.f22332a = context;
        this.f22321F = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f22342l = 0;
        this.f22331P = new ArrayList<>();
        this.f22326K = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle bundle;
        x xVar = new x(this);
        r rVar = xVar.f22383c;
        w wVar = rVar.f22345o;
        if (wVar != null) {
            wVar.b(xVar);
        }
        Notification build = xVar.f22382b.build();
        if (wVar != null) {
            rVar.f22345o.getClass();
        }
        if (wVar != null && (bundle = build.extras) != null) {
            wVar.a(bundle);
        }
        return build;
    }

    public final void c(int i, boolean z10) {
        Notification notification = this.f22328M;
        if (z10) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f22332a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f6489k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f6491b = bitmap;
            iconCompat = iconCompat2;
        }
        this.i = iconCompat;
    }

    public final void e(w wVar) {
        if (this.f22345o != wVar) {
            this.f22345o = wVar;
            if (wVar != null) {
                wVar.f(this);
            }
        }
    }
}
