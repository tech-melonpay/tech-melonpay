package t4;

import kotlin.jvm.internal.f;

/* compiled from: SignerRaw.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("record")
    private final b f27509a;

    public final b a() {
        return this.f27509a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && f.b(this.f27509a, ((a) obj).f27509a);
    }

    public final int hashCode() {
        return this.f27509a.hashCode();
    }

    public final String toString() {
        return "BaseSignerResponseRaw(record=" + this.f27509a + ")";
    }
}
