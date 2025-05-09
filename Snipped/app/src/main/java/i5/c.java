package I5;

/* compiled from: EmailCodeDomain.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f1735a;

    public c(String str) {
        this.f1735a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && kotlin.jvm.internal.f.b(this.f1735a, ((c) obj).f1735a);
    }

    public final int hashCode() {
        String str = this.f1735a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return androidx.camera.core.impl.utils.a.n(new StringBuilder("EmailCodeDomain(result="), this.f1735a, ")");
    }
}
