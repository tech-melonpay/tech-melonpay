package I;

import F.c;
import android.util.Range;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import java.util.List;

/* compiled from: AudioSettingsAudioProfileResolver.java */
/* loaded from: classes.dex */
public final class e implements x0.f<F.a> {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.camera.video.a f1676a;

    /* renamed from: b, reason: collision with root package name */
    public final EncoderProfilesProxy.AudioProfileProxy f1677b;

    public e(androidx.camera.video.a aVar, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
        this.f1676a = aVar;
        this.f1677b = audioProfileProxy;
    }

    @Override // x0.f
    public final F.a get() {
        androidx.camera.video.a aVar = this.f1676a;
        int a10 = a.a(aVar);
        int b9 = a.b(aVar);
        int c2 = aVar.c();
        Range<Integer> d10 = aVar.d();
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.f1677b;
        int channels = audioProfileProxy.getChannels();
        if (c2 == -1) {
            Logger.d("AudioSrcAdPrflRslvr", "Resolved AUDIO channel count from AudioProfile: " + channels);
            c2 = channels;
        } else {
            Logger.d("AudioSrcAdPrflRslvr", "Media spec AUDIO channel count overrides AudioProfile [AudioProfile channel count: " + channels + ", Resolved Channel Count: " + c2 + "]");
        }
        int sampleRate = audioProfileProxy.getSampleRate();
        int d11 = a.d(d10, c2, b9, sampleRate);
        Logger.d("AudioSrcAdPrflRslvr", "Using resolved AUDIO sample rate or nearest supported from AudioProfile: " + d11 + "Hz. [AudioProfile sample rate: " + sampleRate + "Hz]");
        List<Integer> list = F.a.f1123a;
        c.a aVar2 = new c.a();
        aVar2.f1131a = -1;
        aVar2.f1132b = -1;
        aVar2.f1133c = -1;
        aVar2.f1134d = -1;
        aVar2.f1131a = Integer.valueOf(a10);
        aVar2.f1134d = Integer.valueOf(b9);
        aVar2.f1133c = Integer.valueOf(c2);
        aVar2.f1132b = Integer.valueOf(d11);
        return aVar2.a();
    }
}
