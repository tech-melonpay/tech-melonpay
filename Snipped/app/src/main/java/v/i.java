package v;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;
import pa.C1124b;

/* compiled from: OutputConfigurationCompatApi28Impl.java */
/* loaded from: classes.dex */
public class i extends h {

    /* compiled from: OutputConfigurationCompatApi28Impl.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final OutputConfiguration f30497a;

        /* renamed from: b, reason: collision with root package name */
        public long f30498b = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.f30497a = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f30497a, aVar.f30497a) && this.f30498b == aVar.f30498b;
        }

        public final int hashCode() {
            int hashCode = this.f30497a.hashCode() ^ 31;
            return Long.hashCode(this.f30498b) ^ ((hashCode << 5) - hashCode);
        }
    }

    @Override // v.h, v.k, v.f.a
    public void c(long j10) {
        ((a) this.f30499a).f30498b = j10;
    }

    @Override // v.h, v.k, v.f.a
    public final String d() {
        return null;
    }

    @Override // v.h, v.k, v.f.a
    public final void f(String str) {
        ((OutputConfiguration) g()).setPhysicalCameraId(str);
    }

    @Override // v.h, v.g, v.k, v.f.a
    public Object g() {
        Object obj = this.f30499a;
        C1124b.l(obj instanceof a);
        return ((a) obj).f30497a;
    }
}
