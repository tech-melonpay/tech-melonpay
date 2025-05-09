package v4;

import java.util.List;
import kotlin.jvm.internal.f;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: TransferTemplateRaw.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l3.b(ErrorBundle.SUMMARY_ENTRY)
    private final e4.b f30573a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("results")
    private final List<d> f30574b;

    public final List<d> a() {
        return this.f30574b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return f.b(this.f30573a, cVar.f30573a) && f.b(this.f30574b, cVar.f30574b);
    }

    public final int hashCode() {
        e4.b bVar = this.f30573a;
        int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        List<d> list = this.f30574b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "TransferTemplateContainerRaw(summary=" + this.f30573a + ", results=" + this.f30574b + ")";
    }
}
