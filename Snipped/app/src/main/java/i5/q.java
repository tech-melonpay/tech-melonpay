package I5;

import C.v;

/* compiled from: SwitchOnboardingDomain.kt */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f1873a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1874b = true;

    /* renamed from: c, reason: collision with root package name */
    public final String f1875c;

    public q(String str, String str2) {
        this.f1873a = str;
        this.f1875c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.f.b(this.f1873a, qVar.f1873a) && this.f1874b == qVar.f1874b && kotlin.jvm.internal.f.b(this.f1875c, qVar.f1875c);
    }

    public final int hashCode() {
        return this.f1875c.hashCode() + v.d(this.f1873a.hashCode() * 31, 31, this.f1874b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SwitchOnboardingDomain(switchMethod=");
        sb2.append(this.f1873a);
        sb2.append(", hasCode=");
        sb2.append(this.f1874b);
        sb2.append(", code=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f1875c, ")");
    }
}
