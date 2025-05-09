package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
/* loaded from: classes.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f7121a;

    /* renamed from: b, reason: collision with root package name */
    public int f7122b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f7121a.equals(((AudioAttributesImplApi21) obj).f7121a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7121a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f7121a;
    }
}
