package I5;

/* compiled from: ResetPasswordRequestDomain.kt */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f1864a;

    public n(String str) {
        this.f1864a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && kotlin.jvm.internal.f.b(this.f1864a, ((n) obj).f1864a);
    }

    public final int hashCode() {
        return this.f1864a.hashCode();
    }

    public final String toString() {
        return androidx.camera.core.impl.utils.a.n(new StringBuilder("ResetPasswordRequestDomain(email="), this.f1864a, ")");
    }
}
