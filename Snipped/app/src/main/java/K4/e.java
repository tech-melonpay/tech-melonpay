package k4;

import e4.C0715a;
import java.util.List;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: ExchangeListContainerRaw.kt */
/* loaded from: classes.dex */
public final class e extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b(ErrorBundle.SUMMARY_ENTRY)
    private final h f22959b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("results")
    private final List<f> f22960c;

    public final List<f> b() {
        return this.f22960c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.f.b(this.f22959b, eVar.f22959b) && kotlin.jvm.internal.f.b(this.f22960c, eVar.f22960c);
    }

    public final int hashCode() {
        h hVar = this.f22959b;
        int hashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        List<f> list = this.f22960c;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ExchangeListContainerRaw(summary=" + this.f22959b + ", results=" + this.f22960c + ")";
    }
}
