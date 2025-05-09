package E;

import androidx.camera.core.impl.EncoderProfilesProxy;
import java.util.List;

/* compiled from: AutoValue_VideoValidatedEncoderProfilesProxy.java */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    public final int f985a;

    /* renamed from: b, reason: collision with root package name */
    public final int f986b;

    /* renamed from: c, reason: collision with root package name */
    public final List<EncoderProfilesProxy.AudioProfileProxy> f987c;

    /* renamed from: d, reason: collision with root package name */
    public final List<EncoderProfilesProxy.VideoProfileProxy> f988d;

    /* renamed from: e, reason: collision with root package name */
    public final EncoderProfilesProxy.AudioProfileProxy f989e;

    /* renamed from: f, reason: collision with root package name */
    public final EncoderProfilesProxy.VideoProfileProxy f990f;

    public a(int i, int i9, List<EncoderProfilesProxy.AudioProfileProxy> list, List<EncoderProfilesProxy.VideoProfileProxy> list2, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        this.f985a = i;
        this.f986b = i9;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f987c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f988d = list2;
        this.f989e = audioProfileProxy;
        if (videoProfileProxy == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.f990f = videoProfileProxy;
    }

    @Override // E.e
    public final EncoderProfilesProxy.AudioProfileProxy a() {
        return this.f989e;
    }

    @Override // E.e
    public final EncoderProfilesProxy.VideoProfileProxy b() {
        return this.f990f;
    }

    public final boolean equals(Object obj) {
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f985a == eVar.getDefaultDurationSeconds() && this.f986b == eVar.getRecommendedFileFormat() && this.f987c.equals(eVar.getAudioProfiles()) && this.f988d.equals(eVar.getVideoProfiles()) && ((audioProfileProxy = this.f989e) != null ? audioProfileProxy.equals(eVar.a()) : eVar.a() == null) && this.f990f.equals(eVar.b());
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final List<EncoderProfilesProxy.AudioProfileProxy> getAudioProfiles() {
        return this.f987c;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final int getDefaultDurationSeconds() {
        return this.f985a;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final int getRecommendedFileFormat() {
        return this.f986b;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final List<EncoderProfilesProxy.VideoProfileProxy> getVideoProfiles() {
        return this.f988d;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f985a ^ 1000003) * 1000003) ^ this.f986b) * 1000003) ^ this.f987c.hashCode()) * 1000003) ^ this.f988d.hashCode()) * 1000003;
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.f989e;
        return ((hashCode ^ (audioProfileProxy == null ? 0 : audioProfileProxy.hashCode())) * 1000003) ^ this.f990f.hashCode();
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.f985a + ", recommendedFileFormat=" + this.f986b + ", audioProfiles=" + this.f987c + ", videoProfiles=" + this.f988d + ", defaultAudioProfile=" + this.f989e + ", defaultVideoProfile=" + this.f990f + "}";
    }
}
