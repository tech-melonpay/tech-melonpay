package androidx.media;

import m1.AbstractC1025a;

/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC1025a abstractC1025a) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f7123a = abstractC1025a.j(audioAttributesImplBase.f7123a, 1);
        audioAttributesImplBase.f7124b = abstractC1025a.j(audioAttributesImplBase.f7124b, 2);
        audioAttributesImplBase.f7125c = abstractC1025a.j(audioAttributesImplBase.f7125c, 3);
        audioAttributesImplBase.f7126d = abstractC1025a.j(audioAttributesImplBase.f7126d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC1025a abstractC1025a) {
        abstractC1025a.getClass();
        abstractC1025a.s(audioAttributesImplBase.f7123a, 1);
        abstractC1025a.s(audioAttributesImplBase.f7124b, 2);
        abstractC1025a.s(audioAttributesImplBase.f7125c, 3);
        abstractC1025a.s(audioAttributesImplBase.f7126d, 4);
    }
}
