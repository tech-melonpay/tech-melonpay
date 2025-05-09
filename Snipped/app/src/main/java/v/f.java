package v;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
import v.h;
import v.i;

/* compiled from: OutputConfigurationCompat.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final a f30493a;

    /* compiled from: OutputConfigurationCompat.java */
    public interface a {
        void a(long j10);

        void b(Surface surface);

        void c(long j10);

        String d();

        void e();

        void f(String str);

        Object g();

        Surface getSurface();
    }

    public f(int i, Surface surface) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 33) {
            this.f30493a = new j(new OutputConfiguration(i, surface));
        } else if (i9 >= 28) {
            this.f30493a = new i(new i.a(new OutputConfiguration(i, surface)));
        } else {
            this.f30493a = new h(new h.a(new OutputConfiguration(i, surface)));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        return this.f30493a.equals(((f) obj).f30493a);
    }

    public final int hashCode() {
        return this.f30493a.hashCode();
    }

    public f(h hVar) {
        this.f30493a = hVar;
    }
}
