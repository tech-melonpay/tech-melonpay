package i2;

import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* compiled from: AutoValue_LogRequest.java */
/* loaded from: classes.dex */
public final class e extends i {

    /* renamed from: a, reason: collision with root package name */
    public final long f21310a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21311b;

    /* renamed from: c, reason: collision with root package name */
    public final ClientInfo f21312c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f21313d;

    /* renamed from: e, reason: collision with root package name */
    public final String f21314e;

    /* renamed from: f, reason: collision with root package name */
    public final List<h> f21315f;

    /* renamed from: g, reason: collision with root package name */
    public final QosTier f21316g;

    public e() {
        throw null;
    }

    public e(long j10, long j11, ClientInfo clientInfo, Integer num, String str, List list, QosTier qosTier) {
        this.f21310a = j10;
        this.f21311b = j11;
        this.f21312c = clientInfo;
        this.f21313d = num;
        this.f21314e = str;
        this.f21315f = list;
        this.f21316g = qosTier;
    }

    @Override // i2.i
    public final ClientInfo a() {
        return this.f21312c;
    }

    @Override // i2.i
    @Encodable.Field(name = "logEvent")
    public final List<h> b() {
        return this.f21315f;
    }

    @Override // i2.i
    public final Integer c() {
        return this.f21313d;
    }

    @Override // i2.i
    public final String d() {
        return this.f21314e;
    }

    @Override // i2.i
    public final QosTier e() {
        return this.f21316g;
    }

    public final boolean equals(Object obj) {
        ClientInfo clientInfo;
        Integer num;
        String str;
        List<h> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f21310a == iVar.f() && this.f21311b == iVar.g() && ((clientInfo = this.f21312c) != null ? clientInfo.equals(iVar.a()) : iVar.a() == null) && ((num = this.f21313d) != null ? num.equals(iVar.c()) : iVar.c() == null) && ((str = this.f21314e) != null ? str.equals(iVar.d()) : iVar.d() == null) && ((list = this.f21315f) != null ? list.equals(iVar.b()) : iVar.b() == null)) {
            QosTier qosTier = this.f21316g;
            if (qosTier == null) {
                if (iVar.e() == null) {
                    return true;
                }
            } else if (qosTier.equals(iVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // i2.i
    public final long f() {
        return this.f21310a;
    }

    @Override // i2.i
    public final long g() {
        return this.f21311b;
    }

    public final int hashCode() {
        long j10 = this.f21310a;
        long j11 = this.f21311b;
        int i = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        ClientInfo clientInfo = this.f21312c;
        int hashCode = (i ^ (clientInfo == null ? 0 : clientInfo.hashCode())) * 1000003;
        Integer num = this.f21313d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f21314e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<h> list = this.f21315f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        QosTier qosTier = this.f21316g;
        return hashCode4 ^ (qosTier != null ? qosTier.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f21310a + ", requestUptimeMs=" + this.f21311b + ", clientInfo=" + this.f21312c + ", logSource=" + this.f21313d + ", logSourceName=" + this.f21314e + ", logEvents=" + this.f21315f + ", qosTier=" + this.f21316g + "}";
    }
}
