package f4;

import e4.C0715a;

/* compiled from: FinishKYCRaw.kt */
/* loaded from: classes.dex */
public final class d extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("response")
    private final e f20679b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && kotlin.jvm.internal.f.b(this.f20679b, ((d) obj).f20679b);
    }

    public final int hashCode() {
        e eVar = this.f20679b;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    public final String toString() {
        return "FinishKYCRaw(response=" + this.f20679b + ")";
    }
}
