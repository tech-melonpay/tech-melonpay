package I;

import I.m;
import androidx.camera.core.impl.EncoderProfilesProxy;

/* compiled from: AutoValue_VideoMimeInfo.java */
/* loaded from: classes.dex */
public final class h extends m {

    /* renamed from: a, reason: collision with root package name */
    public final String f1685a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1686b;

    /* renamed from: c, reason: collision with root package name */
    public final EncoderProfilesProxy.VideoProfileProxy f1687c;

    /* compiled from: AutoValue_VideoMimeInfo.java */
    public static final class a extends m.a {

        /* renamed from: a, reason: collision with root package name */
        public String f1688a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f1689b;

        /* renamed from: c, reason: collision with root package name */
        public EncoderProfilesProxy.VideoProfileProxy f1690c;
    }

    public h(String str, int i, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        this.f1685a = str;
        this.f1686b = i;
        this.f1687c = videoProfileProxy;
    }

    @Override // I.i
    public final String a() {
        return this.f1685a;
    }

    @Override // I.i
    public final int b() {
        return this.f1686b;
    }

    @Override // I.m
    public final EncoderProfilesProxy.VideoProfileProxy c() {
        return this.f1687c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f1685a.equals(mVar.a()) && this.f1686b == mVar.b()) {
            EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.f1687c;
            if (videoProfileProxy == null) {
                if (mVar.c() == null) {
                    return true;
                }
            } else if (videoProfileProxy.equals(mVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f1685a.hashCode() ^ 1000003) * 1000003) ^ this.f1686b) * 1000003;
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.f1687c;
        return hashCode ^ (videoProfileProxy == null ? 0 : videoProfileProxy.hashCode());
    }

    public final String toString() {
        return "VideoMimeInfo{mimeType=" + this.f1685a + ", profile=" + this.f1686b + ", compatibleVideoProfile=" + this.f1687c + "}";
    }
}
