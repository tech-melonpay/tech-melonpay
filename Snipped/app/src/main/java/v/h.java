package v;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;
import pa.C1124b;

/* compiled from: OutputConfigurationCompatApi26Impl.java */
/* loaded from: classes.dex */
public class h extends g {

    /* compiled from: OutputConfigurationCompatApi26Impl.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final OutputConfiguration f30494a;

        /* renamed from: b, reason: collision with root package name */
        public String f30495b;

        /* renamed from: c, reason: collision with root package name */
        public long f30496c = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.f30494a = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f30494a, aVar.f30494a) && this.f30496c == aVar.f30496c && Objects.equals(this.f30495b, aVar.f30495b);
        }

        public final int hashCode() {
            int hashCode = this.f30494a.hashCode() ^ 31;
            int i = (hashCode << 5) - hashCode;
            String str = this.f30495b;
            int hashCode2 = (str == null ? 0 : str.hashCode()) ^ i;
            return Long.hashCode(this.f30496c) ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    @Override // v.k, v.f.a
    public final void b(Surface surface) {
        ((OutputConfiguration) g()).addSurface(surface);
    }

    @Override // v.k, v.f.a
    public void c(long j10) {
        ((a) this.f30499a).f30496c = j10;
    }

    @Override // v.k, v.f.a
    public String d() {
        return ((a) this.f30499a).f30495b;
    }

    @Override // v.k, v.f.a
    public final void e() {
        ((OutputConfiguration) g()).enableSurfaceSharing();
    }

    @Override // v.k, v.f.a
    public void f(String str) {
        ((a) this.f30499a).f30495b = str;
    }

    @Override // v.g, v.k, v.f.a
    public Object g() {
        Object obj = this.f30499a;
        C1124b.l(obj instanceof a);
        return ((a) obj).f30494a;
    }

    @Override // v.k
    public final boolean h() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }
}
