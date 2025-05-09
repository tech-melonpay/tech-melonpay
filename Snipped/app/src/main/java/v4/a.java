package V4;

import java.util.List;
import kotlin.jvm.internal.f;
import l3.b;
import u4.C1520b;

/* compiled from: ProxyTransactionResponseRaw.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @b("results")
    private final List<C1520b> f3726a;

    public final List<C1520b> a() {
        return this.f3726a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && f.b(this.f3726a, ((a) obj).f3726a);
    }

    public final int hashCode() {
        return this.f3726a.hashCode();
    }

    public final String toString() {
        return "ProxyTransactionResponseRaw(results=" + this.f3726a + ")";
    }
}
