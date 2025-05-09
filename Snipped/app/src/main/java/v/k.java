package v;

import android.view.Surface;
import java.util.Objects;
import v.f;

/* compiled from: OutputConfigurationCompatBaseImpl.java */
/* loaded from: classes.dex */
public class k implements f.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f30499a;

    /* compiled from: OutputConfigurationCompatBaseImpl.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f30500a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f30501b;

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    public k(Object obj) {
        this.f30499a = obj;
    }

    @Override // v.f.a
    public void b(Surface surface) {
        if (getSurface() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!h()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    @Override // v.f.a
    public void c(long j10) {
        ((a) this.f30499a).getClass();
    }

    @Override // v.f.a
    public String d() {
        return ((a) this.f30499a).f30500a;
    }

    @Override // v.f.a
    public void e() {
        ((a) this.f30499a).f30501b = true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        return Objects.equals(this.f30499a, ((k) obj).f30499a);
    }

    @Override // v.f.a
    public void f(String str) {
        ((a) this.f30499a).f30500a = str;
    }

    @Override // v.f.a
    public Object g() {
        return null;
    }

    @Override // v.f.a
    public Surface getSurface() {
        ((a) this.f30499a).getClass();
        throw null;
    }

    public boolean h() {
        return ((a) this.f30499a).f30501b;
    }

    public final int hashCode() {
        return this.f30499a.hashCode();
    }

    @Override // v.f.a
    public void a(long j10) {
    }
}
