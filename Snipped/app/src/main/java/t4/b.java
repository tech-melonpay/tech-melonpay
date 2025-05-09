package t4;

import kotlin.jvm.internal.f;

/* compiled from: SignerRaw.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("response")
    private final e f27510a;

    public final e a() {
        return this.f27510a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && f.b(this.f27510a, ((b) obj).f27510a);
    }

    public final int hashCode() {
        return this.f27510a.hashCode();
    }

    public final String toString() {
        return "RecordResponseRaw(response=" + this.f27510a + ")";
    }
}
