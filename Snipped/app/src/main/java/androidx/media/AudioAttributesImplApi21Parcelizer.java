package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import m1.AbstractC1025a;

/* loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC1025a abstractC1025a) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        Parcelable parcelable = audioAttributesImplApi21.f7121a;
        if (abstractC1025a.h(1)) {
            parcelable = abstractC1025a.k();
        }
        audioAttributesImplApi21.f7121a = (AudioAttributes) parcelable;
        audioAttributesImplApi21.f7122b = abstractC1025a.j(audioAttributesImplApi21.f7122b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC1025a abstractC1025a) {
        abstractC1025a.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f7121a;
        abstractC1025a.n(1);
        abstractC1025a.t(audioAttributes);
        abstractC1025a.s(audioAttributesImplApi21.f7122b, 2);
    }
}
