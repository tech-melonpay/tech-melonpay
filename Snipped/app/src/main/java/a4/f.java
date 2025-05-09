package a4;

/* compiled from: ChangePasswordRequestRaw.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("OldPassword")
    private final String f4300a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("NewPassword")
    private final String f4301b;

    public f(String str, String str2) {
        this.f4300a = str;
        this.f4301b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.f.b(this.f4300a, fVar.f4300a) && kotlin.jvm.internal.f.b(this.f4301b, fVar.f4301b);
    }

    public final int hashCode() {
        return this.f4301b.hashCode() + (this.f4300a.hashCode() * 31);
    }

    public final String toString() {
        return s3.b.l("ChangePasswordRequestRaw(oldPassword=", this.f4300a, ", newPassword=", this.f4301b, ")");
    }
}
