package v;

import android.hardware.camera2.params.OutputConfiguration;
import pa.C1124b;

/* compiled from: OutputConfigurationCompatApi33Impl.java */
/* loaded from: classes.dex */
public final class j extends i {
    @Override // v.k, v.f.a
    public final void a(long j10) {
        if (j10 == -1) {
            return;
        }
        ((OutputConfiguration) g()).setStreamUseCase(j10);
    }

    @Override // v.i, v.h, v.k, v.f.a
    public final void c(long j10) {
        ((OutputConfiguration) g()).setDynamicRangeProfile(j10);
    }

    @Override // v.i, v.h, v.g, v.k, v.f.a
    public final Object g() {
        Object obj = this.f30499a;
        C1124b.l(obj instanceof OutputConfiguration);
        return obj;
    }
}
