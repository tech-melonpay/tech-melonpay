package s1;

import androidx.room.ColumnInfo;
import androidx.work.NetworkType;

/* compiled from: Constraints.java */
/* renamed from: s1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1192b {
    public static final C1192b i;

    /* renamed from: b, reason: collision with root package name */
    @ColumnInfo(name = "requires_charging")
    public boolean f26498b;

    /* renamed from: c, reason: collision with root package name */
    @ColumnInfo(name = "requires_device_idle")
    public boolean f26499c;

    /* renamed from: d, reason: collision with root package name */
    @ColumnInfo(name = "requires_battery_not_low")
    public boolean f26500d;

    /* renamed from: e, reason: collision with root package name */
    @ColumnInfo(name = "requires_storage_not_low")
    public boolean f26501e;

    /* renamed from: a, reason: collision with root package name */
    @ColumnInfo(name = "required_network_type")
    public NetworkType f26497a = NetworkType.f8092a;

    /* renamed from: f, reason: collision with root package name */
    @ColumnInfo(name = "trigger_content_update_delay")
    public long f26502f = -1;

    /* renamed from: g, reason: collision with root package name */
    @ColumnInfo(name = "trigger_max_content_delay")
    public long f26503g = -1;

    /* renamed from: h, reason: collision with root package name */
    @ColumnInfo(name = "content_uri_triggers")
    public C1193c f26504h = new C1193c();

    static {
        NetworkType networkType = NetworkType.f8092a;
        C1193c c1193c = new C1193c();
        C1192b c1192b = new C1192b();
        c1192b.f26497a = networkType;
        c1192b.f26502f = -1L;
        c1192b.f26503g = -1L;
        new C1193c();
        c1192b.f26498b = false;
        c1192b.f26499c = false;
        c1192b.f26497a = networkType;
        c1192b.f26500d = false;
        c1192b.f26501e = false;
        c1192b.f26504h = c1193c;
        c1192b.f26502f = -1L;
        c1192b.f26503g = -1L;
        i = c1192b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1192b.class != obj.getClass()) {
            return false;
        }
        C1192b c1192b = (C1192b) obj;
        if (this.f26498b == c1192b.f26498b && this.f26499c == c1192b.f26499c && this.f26500d == c1192b.f26500d && this.f26501e == c1192b.f26501e && this.f26502f == c1192b.f26502f && this.f26503g == c1192b.f26503g && this.f26497a == c1192b.f26497a) {
            return this.f26504h.equals(c1192b.f26504h);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.f26497a.hashCode() * 31) + (this.f26498b ? 1 : 0)) * 31) + (this.f26499c ? 1 : 0)) * 31) + (this.f26500d ? 1 : 0)) * 31) + (this.f26501e ? 1 : 0)) * 31;
        long j10 = this.f26502f;
        int i9 = (hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f26503g;
        return this.f26504h.f26505a.hashCode() + ((i9 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }
}
