package r4;

import androidx.camera.core.n;

/* compiled from: EmailCodeRaw.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("result")
    private final String f26176a;

    public final String a() {
        return this.f26176a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && kotlin.jvm.internal.f.b(this.f26176a, ((a) obj).f26176a);
    }

    public final int hashCode() {
        String str = this.f26176a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return n.a("EmailCodeRaw(result=", this.f26176a, ")");
    }
}
