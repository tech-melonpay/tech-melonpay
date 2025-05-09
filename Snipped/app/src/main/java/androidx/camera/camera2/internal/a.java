package androidx.camera.camera2.internal;

import android.util.Size;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;

/* compiled from: AutoValue_Camera2CameraImpl_UseCaseInfo.java */
/* loaded from: classes.dex */
public final class a extends Camera2CameraImpl.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f5227a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<?> f5228b;

    /* renamed from: c, reason: collision with root package name */
    public final SessionConfig f5229c;

    /* renamed from: d, reason: collision with root package name */
    public final UseCaseConfig<?> f5230d;

    /* renamed from: e, reason: collision with root package name */
    public final Size f5231e;

    public a(String str, Class<?> cls, SessionConfig sessionConfig, UseCaseConfig<?> useCaseConfig, Size size) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f5227a = str;
        this.f5228b = cls;
        if (sessionConfig == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f5229c = sessionConfig;
        if (useCaseConfig == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f5230d = useCaseConfig;
        this.f5231e = size;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.f
    public final SessionConfig a() {
        return this.f5229c;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.f
    public final Size b() {
        return this.f5231e;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.f
    public final UseCaseConfig<?> c() {
        return this.f5230d;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.f
    public final String d() {
        return this.f5227a;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.f
    public final Class<?> e() {
        return this.f5228b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Camera2CameraImpl.f)) {
            return false;
        }
        Camera2CameraImpl.f fVar = (Camera2CameraImpl.f) obj;
        if (this.f5227a.equals(fVar.d()) && this.f5228b.equals(fVar.e()) && this.f5229c.equals(fVar.a()) && this.f5230d.equals(fVar.c())) {
            Size size = this.f5231e;
            if (size == null) {
                if (fVar.b() == null) {
                    return true;
                }
            } else if (size.equals(fVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f5227a.hashCode() ^ 1000003) * 1000003) ^ this.f5228b.hashCode()) * 1000003) ^ this.f5229c.hashCode()) * 1000003) ^ this.f5230d.hashCode()) * 1000003;
        Size size = this.f5231e;
        return hashCode ^ (size == null ? 0 : size.hashCode());
    }

    public final String toString() {
        return "UseCaseInfo{useCaseId=" + this.f5227a + ", useCaseType=" + this.f5228b + ", sessionConfig=" + this.f5229c + ", useCaseConfig=" + this.f5230d + ", surfaceResolution=" + this.f5231e + "}";
    }
}
