package g2;

/* compiled from: Encoding.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f20764a;

    public b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f20764a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f20764a.equals(((b) obj).f20764a);
    }

    public final int hashCode() {
        return this.f20764a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return androidx.camera.core.impl.utils.a.n(new StringBuilder("Encoding{name=\""), this.f20764a, "\"}");
    }
}
