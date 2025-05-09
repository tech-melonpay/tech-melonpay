package v4;

import e4.C0715a;
import java.util.List;
import kotlin.jvm.internal.f;
import org.bouncycastle.i18n.ErrorBundle;
import u4.C1520b;

/* compiled from: ProxyTransactionContainerRaw.kt */
/* renamed from: v4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1544a extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b(ErrorBundle.SUMMARY_ENTRY)
    private final b f30565b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("results")
    private final List<C1520b> f30566c;

    public final List<C1520b> b() {
        return this.f30566c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1544a)) {
            return false;
        }
        C1544a c1544a = (C1544a) obj;
        return f.b(this.f30565b, c1544a.f30565b) && f.b(this.f30566c, c1544a.f30566c);
    }

    public final int hashCode() {
        b bVar = this.f30565b;
        int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        List<C1520b> list = this.f30566c;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ProxyTransactionContainerRaw(summary=" + this.f30565b + ", results=" + this.f30566c + ")";
    }
}
