package I;

import I.d;
import androidx.camera.core.impl.EncoderProfilesProxy;

/* compiled from: AutoValue_AudioMimeInfo.java */
/* loaded from: classes.dex */
public final class g extends d {

    /* renamed from: a, reason: collision with root package name */
    public final String f1679a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1680b;

    /* renamed from: c, reason: collision with root package name */
    public final EncoderProfilesProxy.AudioProfileProxy f1681c;

    /* compiled from: AutoValue_AudioMimeInfo.java */
    public static final class a extends d.a {

        /* renamed from: a, reason: collision with root package name */
        public String f1682a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f1683b;

        /* renamed from: c, reason: collision with root package name */
        public EncoderProfilesProxy.AudioProfileProxy f1684c;

        public final g a() {
            String str = this.f1682a == null ? " mimeType" : "";
            if (this.f1683b == null) {
                str = str.concat(" profile");
            }
            if (str.isEmpty()) {
                return new g(this.f1682a, this.f1683b.intValue(), this.f1684c);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public g(String str, int i, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
        this.f1679a = str;
        this.f1680b = i;
        this.f1681c = audioProfileProxy;
    }

    @Override // I.i
    public final String a() {
        return this.f1679a;
    }

    @Override // I.i
    public final int b() {
        return this.f1680b;
    }

    @Override // I.d
    public final EncoderProfilesProxy.AudioProfileProxy c() {
        return this.f1681c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f1679a.equals(dVar.a()) && this.f1680b == dVar.b()) {
            EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.f1681c;
            if (audioProfileProxy == null) {
                if (dVar.c() == null) {
                    return true;
                }
            } else if (audioProfileProxy.equals(dVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f1679a.hashCode() ^ 1000003) * 1000003) ^ this.f1680b) * 1000003;
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.f1681c;
        return hashCode ^ (audioProfileProxy == null ? 0 : audioProfileProxy.hashCode());
    }

    public final String toString() {
        return "AudioMimeInfo{mimeType=" + this.f1679a + ", profile=" + this.f1680b + ", compatibleAudioProfile=" + this.f1681c + "}";
    }
}
