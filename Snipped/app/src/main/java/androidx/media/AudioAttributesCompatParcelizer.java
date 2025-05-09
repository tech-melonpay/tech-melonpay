package androidx.media;

import m1.AbstractC1025a;

/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC1025a abstractC1025a) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.f7120a;
        if (abstractC1025a.h(1)) {
            obj = abstractC1025a.m();
        }
        audioAttributesCompat.f7120a = (AudioAttributesImpl) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC1025a abstractC1025a) {
        abstractC1025a.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f7120a;
        abstractC1025a.n(1);
        abstractC1025a.v(audioAttributesImpl);
    }
}
