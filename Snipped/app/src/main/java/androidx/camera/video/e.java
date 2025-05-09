package androidx.camera.video;

import androidx.camera.core.SurfaceRequest;
import androidx.camera.video.StreamInfo;

/* compiled from: AutoValue_StreamInfo.java */
/* loaded from: classes.dex */
public final class e extends StreamInfo {

    /* renamed from: d, reason: collision with root package name */
    public final int f5594d;

    /* renamed from: e, reason: collision with root package name */
    public final StreamInfo.StreamState f5595e;

    /* renamed from: f, reason: collision with root package name */
    public final SurfaceRequest.TransformationInfo f5596f;

    public e(int i, StreamInfo.StreamState streamState, SurfaceRequest.TransformationInfo transformationInfo) {
        this.f5594d = i;
        this.f5595e = streamState;
        this.f5596f = transformationInfo;
    }

    @Override // androidx.camera.video.StreamInfo
    public final int a() {
        return this.f5594d;
    }

    @Override // androidx.camera.video.StreamInfo
    public final SurfaceRequest.TransformationInfo b() {
        return this.f5596f;
    }

    @Override // androidx.camera.video.StreamInfo
    public final StreamInfo.StreamState c() {
        return this.f5595e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StreamInfo)) {
            return false;
        }
        StreamInfo streamInfo = (StreamInfo) obj;
        if (this.f5594d == streamInfo.a() && this.f5595e.equals(streamInfo.c())) {
            SurfaceRequest.TransformationInfo transformationInfo = this.f5596f;
            if (transformationInfo == null) {
                if (streamInfo.b() == null) {
                    return true;
                }
            } else if (transformationInfo.equals(streamInfo.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f5594d ^ 1000003) * 1000003) ^ this.f5595e.hashCode()) * 1000003;
        SurfaceRequest.TransformationInfo transformationInfo = this.f5596f;
        return hashCode ^ (transformationInfo == null ? 0 : transformationInfo.hashCode());
    }

    public final String toString() {
        return "StreamInfo{id=" + this.f5594d + ", streamState=" + this.f5595e + ", inProgressTransformationInfo=" + this.f5596f + "}";
    }
}
