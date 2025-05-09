package B1;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.work.BackoffPolicy;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import s1.AbstractC1197g;
import s1.C1192b;

/* compiled from: WorkSpec.java */
@Entity(indices = {@Index({"schedule_requested_at"}), @Index({"period_start_time"})})
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @PrimaryKey
    @ColumnInfo(name = "id")
    public String f243a;

    /* renamed from: b, reason: collision with root package name */
    @ColumnInfo(name = "state")
    public WorkInfo$State f244b = WorkInfo$State.f8102a;

    /* renamed from: c, reason: collision with root package name */
    @ColumnInfo(name = "worker_class_name")
    public String f245c;

    /* renamed from: d, reason: collision with root package name */
    @ColumnInfo(name = "input_merger_class_name")
    public String f246d;

    /* renamed from: e, reason: collision with root package name */
    @ColumnInfo(name = "input")
    public androidx.work.b f247e;

    /* renamed from: f, reason: collision with root package name */
    @ColumnInfo(name = "output")
    public androidx.work.b f248f;

    /* renamed from: g, reason: collision with root package name */
    @ColumnInfo(name = "initial_delay")
    public long f249g;

    /* renamed from: h, reason: collision with root package name */
    @ColumnInfo(name = "interval_duration")
    public long f250h;

    @ColumnInfo(name = "flex_duration")
    public long i;

    /* renamed from: j, reason: collision with root package name */
    @Embedded
    public C1192b f251j;

    /* renamed from: k, reason: collision with root package name */
    @ColumnInfo(name = "run_attempt_count")
    public int f252k;

    /* renamed from: l, reason: collision with root package name */
    @ColumnInfo(name = "backoff_policy")
    public BackoffPolicy f253l;

    /* renamed from: m, reason: collision with root package name */
    @ColumnInfo(name = "backoff_delay_duration")
    public long f254m;

    /* renamed from: n, reason: collision with root package name */
    @ColumnInfo(name = "period_start_time")
    public long f255n;

    /* renamed from: o, reason: collision with root package name */
    @ColumnInfo(name = "minimum_retention_duration")
    public long f256o;

    /* renamed from: p, reason: collision with root package name */
    @ColumnInfo(name = "schedule_requested_at")
    public long f257p;

    /* renamed from: q, reason: collision with root package name */
    @ColumnInfo(name = "run_in_foreground")
    public boolean f258q;

    /* renamed from: r, reason: collision with root package name */
    @ColumnInfo(name = "out_of_quota_policy")
    public OutOfQuotaPolicy f259r;

    /* compiled from: WorkSpec.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @ColumnInfo(name = "id")
        public String f260a;

        /* renamed from: b, reason: collision with root package name */
        @ColumnInfo(name = "state")
        public WorkInfo$State f261b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f261b != aVar.f261b) {
                return false;
            }
            return this.f260a.equals(aVar.f260a);
        }

        public final int hashCode() {
            return this.f261b.hashCode() + (this.f260a.hashCode() * 31);
        }
    }

    static {
        AbstractC1197g.e("WorkSpec");
    }

    public p(String str, String str2) {
        androidx.work.b bVar = androidx.work.b.f8127c;
        this.f247e = bVar;
        this.f248f = bVar;
        this.f251j = C1192b.i;
        this.f253l = BackoffPolicy.f8067a;
        this.f254m = 30000L;
        this.f257p = -1L;
        this.f259r = OutOfQuotaPolicy.f8099a;
        this.f243a = str;
        this.f245c = str2;
    }

    public final long a() {
        int i;
        if (this.f244b == WorkInfo$State.f8102a && (i = this.f252k) > 0) {
            return Math.min(18000000L, this.f253l == BackoffPolicy.f8068b ? this.f254m * i : (long) Math.scalb(this.f254m, i - 1)) + this.f255n;
        }
        if (!c()) {
            long j10 = this.f255n;
            if (j10 == 0) {
                j10 = System.currentTimeMillis();
            }
            return j10 + this.f249g;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = this.f255n;
        if (j11 == 0) {
            j11 = this.f249g + currentTimeMillis;
        }
        long j12 = this.i;
        long j13 = this.f250h;
        if (j12 != j13) {
            return j11 + j13 + (j11 == 0 ? j12 * (-1) : 0L);
        }
        return j11 + (j11 != 0 ? j13 : 0L);
    }

    public final boolean b() {
        return !C1192b.i.equals(this.f251j);
    }

    public final boolean c() {
        return this.f250h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f249g != pVar.f249g || this.f250h != pVar.f250h || this.i != pVar.i || this.f252k != pVar.f252k || this.f254m != pVar.f254m || this.f255n != pVar.f255n || this.f256o != pVar.f256o || this.f257p != pVar.f257p || this.f258q != pVar.f258q || !this.f243a.equals(pVar.f243a) || this.f244b != pVar.f244b || !this.f245c.equals(pVar.f245c)) {
            return false;
        }
        String str = this.f246d;
        if (str == null ? pVar.f246d == null : str.equals(pVar.f246d)) {
            return this.f247e.equals(pVar.f247e) && this.f248f.equals(pVar.f248f) && this.f251j.equals(pVar.f251j) && this.f253l == pVar.f253l && this.f259r == pVar.f259r;
        }
        return false;
    }

    public final int hashCode() {
        int c2 = C.v.c((this.f244b.hashCode() + (this.f243a.hashCode() * 31)) * 31, 31, this.f245c);
        String str = this.f246d;
        int hashCode = (this.f248f.hashCode() + ((this.f247e.hashCode() + ((c2 + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j10 = this.f249g;
        int i = (hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f250h;
        int i9 = (i + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.i;
        int hashCode2 = (this.f253l.hashCode() + ((((this.f251j.hashCode() + ((i9 + ((int) (j12 ^ (j12 >>> 32)))) * 31)) * 31) + this.f252k) * 31)) * 31;
        long j13 = this.f254m;
        int i10 = (hashCode2 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f255n;
        int i11 = (i10 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f256o;
        int i12 = (i11 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.f257p;
        return this.f259r.hashCode() + ((((i12 + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f258q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return androidx.camera.core.impl.utils.a.n(new StringBuilder("{WorkSpec: "), this.f243a, "}");
    }
}
