package L1;

import kotlin.Metadata;
import kotlin.jvm.internal.f;

/* compiled from: Cache.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"LL1/a;", "", "LM1/a;", "a", "LM1/a;", "getAfterRequest", "()LM1/a;", "afterRequest", "b", "getBeforeRequest", "beforeRequest", "", "c", "Ljava/lang/String;", "getComment", "()Ljava/lang/String;", "comment", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l3.b("afterRequest")
    private final M1.a afterRequest;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l3.b("beforeRequest")
    private final M1.a beforeRequest;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l3.b("comment")
    private final String comment;

    public a() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.afterRequest, aVar.afterRequest) && f.b(this.beforeRequest, aVar.beforeRequest) && f.b(this.comment, aVar.comment);
    }

    public final int hashCode() {
        M1.a aVar = this.afterRequest;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        M1.a aVar2 = this.beforeRequest;
        int hashCode2 = (hashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.comment;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        M1.a aVar = this.afterRequest;
        M1.a aVar2 = this.beforeRequest;
        String str = this.comment;
        StringBuilder sb2 = new StringBuilder("Cache(afterRequest=");
        sb2.append(aVar);
        sb2.append(", beforeRequest=");
        sb2.append(aVar2);
        sb2.append(", comment=");
        return androidx.camera.core.impl.utils.a.n(sb2, str, ")");
    }

    public a(int i) {
        this.afterRequest = null;
        this.beforeRequest = null;
        this.comment = null;
    }
}
