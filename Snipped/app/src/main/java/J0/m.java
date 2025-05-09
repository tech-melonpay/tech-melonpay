package j0;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f22278a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f22279b;

    /* renamed from: c, reason: collision with root package name */
    public final E[] f22280c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f22281d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f22282e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22283f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f22284g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public final int f22285h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final PendingIntent f22286j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f22287k;

    /* compiled from: NotificationCompat.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final IconCompat f22288a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f22289b;

        /* renamed from: c, reason: collision with root package name */
        public final PendingIntent f22290c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f22291d;

        /* renamed from: e, reason: collision with root package name */
        public final Bundle f22292e;

        /* renamed from: f, reason: collision with root package name */
        public ArrayList<E> f22293f;

        /* renamed from: g, reason: collision with root package name */
        public int f22294g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f22295h;
        public boolean i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f22296j;

        /* compiled from: NotificationCompat.java */
        /* renamed from: j0.m$a$a, reason: collision with other inner class name */
        public static class C0414a {
            public static Bundle a(Notification.Action action) {
                return action.getExtras();
            }

            public static RemoteInput[] b(Notification.Action action) {
                return action.getRemoteInputs();
            }
        }

        /* compiled from: NotificationCompat.java */
        public static class b {
            public static Icon a(Notification.Action action) {
                return action.getIcon();
            }
        }

        /* compiled from: NotificationCompat.java */
        public static class c {
            public static boolean a(Notification.Action action) {
                return action.getAllowGeneratedReplies();
            }
        }

        /* compiled from: NotificationCompat.java */
        public static class d {
            public static int a(Notification.Action action) {
                return action.getSemanticAction();
            }
        }

        /* compiled from: NotificationCompat.java */
        public static class e {
            public static boolean a(Notification.Action action) {
                return action.isContextual();
            }
        }

        /* compiled from: NotificationCompat.java */
        public static class f {
            public static boolean a(Notification.Action action) {
                return action.isAuthenticationRequired();
            }
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle());
        }

        public final m a() {
            CharSequence[] charSequenceArr;
            Set<String> set;
            if (this.i && this.f22290c == null) {
                throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList<E> arrayList3 = this.f22293f;
            if (arrayList3 != null) {
                Iterator<E> it = arrayList3.iterator();
                while (it.hasNext()) {
                    E next = it.next();
                    if (next.f22239d || (!((charSequenceArr = next.f22238c) == null || charSequenceArr.length == 0) || (set = next.f22242g) == null || set.isEmpty())) {
                        arrayList2.add(next);
                    } else {
                        arrayList.add(next);
                    }
                }
            }
            return new m(this.f22288a, this.f22289b, this.f22290c, this.f22292e, arrayList2.isEmpty() ? null : (E[]) arrayList2.toArray(new E[arrayList2.size()]), arrayList.isEmpty() ? null : (E[]) arrayList.toArray(new E[arrayList.size()]), this.f22291d, this.f22294g, this.f22295h, this.i, this.f22296j);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
            this.f22291d = true;
            this.f22295h = true;
            this.f22288a = iconCompat;
            this.f22289b = r.b(charSequence);
            this.f22290c = pendingIntent;
            this.f22292e = bundle;
            this.f22293f = null;
            this.f22291d = true;
            this.f22294g = 0;
            this.f22295h = true;
            this.i = false;
            this.f22296j = false;
        }
    }

    public m(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, E[] eArr, E[] eArr2, boolean z10, int i, boolean z11, boolean z12, boolean z13) {
        this.f22282e = true;
        this.f22279b = iconCompat;
        if (iconCompat != null) {
            int i9 = iconCompat.f6490a;
            if ((i9 == -1 ? IconCompat.a.d(iconCompat.f6491b) : i9) == 2) {
                this.f22285h = iconCompat.c();
            }
        }
        this.i = r.b(charSequence);
        this.f22286j = pendingIntent;
        this.f22278a = bundle == null ? new Bundle() : bundle;
        this.f22280c = eArr;
        this.f22281d = z10;
        this.f22283f = i;
        this.f22282e = z11;
        this.f22284g = z12;
        this.f22287k = z13;
    }

    public final IconCompat a() {
        int i;
        if (this.f22279b == null && (i = this.f22285h) != 0) {
            this.f22279b = IconCompat.b(null, "", i);
        }
        return this.f22279b;
    }
}
