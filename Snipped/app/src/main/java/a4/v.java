package a4;

/* compiled from: ResetPasswordRequestRaw.kt */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("email")
    private final String f4415a;

    public v(String str) {
        this.f4415a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && kotlin.jvm.internal.f.b(this.f4415a, ((v) obj).f4415a);
    }

    public final int hashCode() {
        return this.f4415a.hashCode();
    }

    public final String toString() {
        return androidx.camera.core.n.a("ResetPasswordRequestRaw(email=", this.f4415a, ")");
    }
}
