package B;

import B.c;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.r;

/* compiled from: AutoValue_LifecycleCameraRepository_Key.java */
/* loaded from: classes.dex */
public final class a extends c.a {

    /* renamed from: a, reason: collision with root package name */
    public final r f163a;

    /* renamed from: b, reason: collision with root package name */
    public final CameraUseCaseAdapter.CameraId f164b;

    public a(r rVar, CameraUseCaseAdapter.CameraId cameraId) {
        if (rVar == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.f163a = rVar;
        if (cameraId == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.f164b = cameraId;
    }

    @Override // B.c.a
    public final CameraUseCaseAdapter.CameraId a() {
        return this.f164b;
    }

    @Override // B.c.a
    public final r b() {
        return this.f163a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c.a)) {
            return false;
        }
        c.a aVar = (c.a) obj;
        return this.f163a.equals(aVar.b()) && this.f164b.equals(aVar.a());
    }

    public final int hashCode() {
        return ((this.f163a.hashCode() ^ 1000003) * 1000003) ^ this.f164b.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwner=" + this.f163a + ", cameraId=" + this.f164b + "}";
    }
}
