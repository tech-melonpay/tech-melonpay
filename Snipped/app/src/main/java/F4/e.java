package f4;

import androidx.camera.core.n;

/* compiled from: FinishKYCRaw.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("@result")
    private final String f20680a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && kotlin.jvm.internal.f.b(this.f20680a, ((e) obj).f20680a);
    }

    public final int hashCode() {
        String str = this.f20680a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return n.a("FinishKysResponse(result=", this.f20680a, ")");
    }
}
