package s5;

/* compiled from: EditAccountDomain.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f26633a;

    public h(String str) {
        this.f26633a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && kotlin.jvm.internal.f.b(this.f26633a, ((h) obj).f26633a);
    }

    public final int hashCode() {
        String str = this.f26633a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return androidx.camera.core.impl.utils.a.n(new StringBuilder("EditAccountDomain(prettyName="), this.f26633a, ")");
    }
}
