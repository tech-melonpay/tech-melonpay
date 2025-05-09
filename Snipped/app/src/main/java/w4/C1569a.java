package w4;

import e4.C0715a;
import kotlin.jvm.internal.f;

/* compiled from: LivenessCheckRaw.kt */
/* renamed from: w4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1569a extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("is_alive")
    private final Boolean f30821b;

    public final Boolean b() {
        return this.f30821b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1569a) && f.b(this.f30821b, ((C1569a) obj).f30821b);
    }

    public final int hashCode() {
        Boolean bool = this.f30821b;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "LivenessBodyRaw(isAlive=" + this.f30821b + ")";
    }
}
