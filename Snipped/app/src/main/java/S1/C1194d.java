package s1;

import android.app.Notification;

/* compiled from: ForegroundInfo.java */
/* renamed from: s1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1194d {

    /* renamed from: a, reason: collision with root package name */
    public final int f26508a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26509b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f26510c;

    public C1194d(int i, Notification notification, int i9) {
        this.f26508a = i;
        this.f26510c = notification;
        this.f26509b = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1194d.class != obj.getClass()) {
            return false;
        }
        C1194d c1194d = (C1194d) obj;
        if (this.f26508a == c1194d.f26508a && this.f26509b == c1194d.f26509b) {
            return this.f26510c.equals(c1194d.f26510c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26510c.hashCode() + (((this.f26508a * 31) + this.f26509b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f26508a + ", mForegroundServiceType=" + this.f26509b + ", mNotification=" + this.f26510c + '}';
    }
}
