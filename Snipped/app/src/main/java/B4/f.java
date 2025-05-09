package b4;

import androidx.camera.core.n;

/* compiled from: EditVaultRequestRaw.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("pretty_name")
    private final String f8332a;

    public f(String str) {
        this.f8332a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && kotlin.jvm.internal.f.b(this.f8332a, ((f) obj).f8332a);
    }

    public final int hashCode() {
        return this.f8332a.hashCode();
    }

    public final String toString() {
        return n.a("EditVaultRequestRaw(prettyName=", this.f8332a, ")");
    }
}
