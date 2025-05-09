package L1;

import C.v;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.f;

/* compiled from: Timings.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u001a\u0010!\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LL1/e;", "", "", "a", "Ljava/lang/Long;", "getBlocked", "()Ljava/lang/Long;", "blocked", "b", "getDns", "dns", "c", "getSsl", "ssl", "d", "J", "getConnect", "()J", "connect", "e", "getSend", "send", "f", "getWait", "wait", "g", "getReceive", "receive", "", "h", "Ljava/lang/String;", "getComment", "()Ljava/lang/String;", "comment", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l3.b("blocked")
    private final Long blocked;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l3.b("dns")
    private final Long dns;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l3.b("ssl")
    private final Long ssl;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l3.b("connect")
    private final long connect;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l3.b("send")
    private final long send;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l3.b("wait")
    private final long wait;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l3.b("receive")
    private final long receive;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l3.b("comment")
    private final String comment;

    public e(HttpTransaction httpTransaction) {
        Long tookMs = httpTransaction.getTookMs();
        long longValue = tookMs != null ? tookMs.longValue() : 0L;
        this.blocked = null;
        this.dns = null;
        this.ssl = null;
        this.connect = 0L;
        this.send = 0L;
        this.wait = longValue;
        this.receive = 0L;
        this.comment = "The information described by this object is incomplete.";
    }

    public final long a() {
        Long l10 = this.blocked;
        long longValue = l10 != null ? l10.longValue() : 0L;
        Long l11 = this.dns;
        long longValue2 = longValue + (l11 != null ? l11.longValue() : 0L);
        Long l12 = this.ssl;
        return longValue2 + (l12 != null ? l12.longValue() : 0L) + this.connect + this.send + this.wait + this.receive;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return f.b(this.blocked, eVar.blocked) && f.b(this.dns, eVar.dns) && f.b(this.ssl, eVar.ssl) && this.connect == eVar.connect && this.send == eVar.send && this.wait == eVar.wait && this.receive == eVar.receive && f.b(this.comment, eVar.comment);
    }

    public final int hashCode() {
        Long l10 = this.blocked;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Long l11 = this.dns;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.ssl;
        return this.comment.hashCode() + v.e(this.receive, v.e(this.wait, v.e(this.send, v.e(this.connect, (hashCode2 + (l12 != null ? l12.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        Long l10 = this.blocked;
        Long l11 = this.dns;
        Long l12 = this.ssl;
        long j10 = this.connect;
        long j11 = this.send;
        long j12 = this.wait;
        long j13 = this.receive;
        String str = this.comment;
        StringBuilder sb2 = new StringBuilder("Timings(blocked=");
        sb2.append(l10);
        sb2.append(", dns=");
        sb2.append(l11);
        sb2.append(", ssl=");
        sb2.append(l12);
        sb2.append(", connect=");
        sb2.append(j10);
        sb2.append(", send=");
        sb2.append(j11);
        sb2.append(", wait=");
        sb2.append(j12);
        sb2.append(", receive=");
        sb2.append(j13);
        sb2.append(", comment=");
        return androidx.camera.core.impl.utils.a.n(sb2, str, ")");
    }
}
