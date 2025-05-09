package x0;

import java.util.Objects;

/* compiled from: Pair.java */
/* loaded from: classes.dex */
public final class b<F, S> {

    /* renamed from: a, reason: collision with root package name */
    public final F f30903a;

    /* renamed from: b, reason: collision with root package name */
    public final S f30904b;

    public b(F f10, S s10) {
        this.f30903a = f10;
        this.f30904b = s10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(bVar.f30903a, this.f30903a) && Objects.equals(bVar.f30904b, this.f30904b);
    }

    public final int hashCode() {
        F f10 = this.f30903a;
        int hashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f30904b;
        return (s10 != null ? s10.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f30903a + " " + this.f30904b + "}";
    }
}
