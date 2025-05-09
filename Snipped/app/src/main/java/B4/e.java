package b4;

import androidx.camera.core.n;

/* compiled from: EditCardRequestRaw.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("pretty_name")
    private final String f8331a;

    public e(String str) {
        this.f8331a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && kotlin.jvm.internal.f.b(this.f8331a, ((e) obj).f8331a);
    }

    public final int hashCode() {
        return this.f8331a.hashCode();
    }

    public final String toString() {
        return n.a("EditCardRequestRaw(prettyName=", this.f8331a, ")");
    }
}
