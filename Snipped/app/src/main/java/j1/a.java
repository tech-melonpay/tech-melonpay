package J1;

import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;

/* compiled from: Har.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"LJ1/a;", "", "LJ1/b;", "a", "LJ1/b;", "getLog", "()LJ1/b;", "log", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l3.b("log")
    private final b log;

    public a(List<HttpTransaction> list, K1.b bVar) {
        this.log = new b(list, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && f.b(this.log, ((a) obj).log);
    }

    public final int hashCode() {
        return this.log.hashCode();
    }

    public final String toString() {
        return "Har(log=" + this.log + ")";
    }
}
