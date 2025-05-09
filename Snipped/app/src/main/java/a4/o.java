package a4;

/* compiled from: FileRequestRaw.kt */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("file")
    private final String f4352a;

    public o(String str) {
        this.f4352a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && kotlin.jvm.internal.f.b(this.f4352a, ((o) obj).f4352a);
    }

    public final int hashCode() {
        return this.f4352a.hashCode();
    }

    public final String toString() {
        return androidx.camera.core.n.a("FileRequestRaw(file=", this.f4352a, ")");
    }
}
