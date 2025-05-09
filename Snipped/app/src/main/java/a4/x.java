package a4;

/* compiled from: SwitchOnboardingRaw.kt */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("switch_method")
    private final String f4436a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("has_code")
    private final boolean f4437b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("code")
    private final String f4438c;

    public x(String str, boolean z10, String str2) {
        this.f4436a = str;
        this.f4437b = z10;
        this.f4438c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return kotlin.jvm.internal.f.b(this.f4436a, xVar.f4436a) && this.f4437b == xVar.f4437b && kotlin.jvm.internal.f.b(this.f4438c, xVar.f4438c);
    }

    public final int hashCode() {
        return this.f4438c.hashCode() + C.v.d(this.f4436a.hashCode() * 31, 31, this.f4437b);
    }

    public final String toString() {
        String str = this.f4436a;
        boolean z10 = this.f4437b;
        String str2 = this.f4438c;
        StringBuilder sb2 = new StringBuilder("SwitchOnboardingRaw(switchMethod=");
        sb2.append(str);
        sb2.append(", hasCode=");
        sb2.append(z10);
        sb2.append(", code=");
        return androidx.camera.core.impl.utils.a.n(sb2, str2, ")");
    }
}
