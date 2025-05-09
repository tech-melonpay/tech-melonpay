package M1;

import C.v;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import l3.b;

/* compiled from: SecondaryRequest.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006¨\u0006\u0017"}, d2 = {"LM1/a;", "", "", "a", "Ljava/lang/String;", "getExpires", "()Ljava/lang/String;", "expires", "b", "getLastAccess", "lastAccess", "c", "getETag", "eTag", "", "d", "I", "getHitCount", "()I", "hitCount", "e", "getComment", "comment", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("expires")
    private final String expires;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("lastAccess")
    private final String lastAccess;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("eTag")
    private final String eTag;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @b("hitCount")
    private final int hitCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @b("comment")
    private final String comment;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.expires, aVar.expires) && f.b(this.lastAccess, aVar.lastAccess) && f.b(this.eTag, aVar.eTag) && this.hitCount == aVar.hitCount && f.b(this.comment, aVar.comment);
    }

    public final int hashCode() {
        String str = this.expires;
        int b9 = v.b(this.hitCount, v.c(v.c((str == null ? 0 : str.hashCode()) * 31, 31, this.lastAccess), 31, this.eTag), 31);
        String str2 = this.comment;
        return b9 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.expires;
        String str2 = this.lastAccess;
        String str3 = this.eTag;
        int i = this.hitCount;
        String str4 = this.comment;
        StringBuilder p10 = s3.b.p("SecondaryRequest(expires=", str, ", lastAccess=", str2, ", eTag=");
        v.x(p10, str3, ", hitCount=", i, ", comment=");
        return androidx.camera.core.impl.utils.a.n(p10, str4, ")");
    }
}
