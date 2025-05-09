package a4;

/* compiled from: EditAccountRequestRaw.kt */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("pretty_name")
    private final String f4325a;

    public m(String str) {
        this.f4325a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && kotlin.jvm.internal.f.b(this.f4325a, ((m) obj).f4325a);
    }

    public final int hashCode() {
        String str = this.f4325a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return androidx.camera.core.n.a("EditAccountRequestRaw(prettyName=", this.f4325a, ")");
    }
}
