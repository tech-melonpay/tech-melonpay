package I;

import J.c;
import android.util.Range;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;

/* compiled from: AudioEncoderConfigAudioProfileResolver.java */
/* loaded from: classes.dex */
public final class b implements x0.f<J.a> {

    /* renamed from: a, reason: collision with root package name */
    public final String f1665a;

    /* renamed from: b, reason: collision with root package name */
    public final Timebase f1666b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1667c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.camera.video.a f1668d;

    /* renamed from: e, reason: collision with root package name */
    public final F.a f1669e;

    /* renamed from: f, reason: collision with root package name */
    public final EncoderProfilesProxy.AudioProfileProxy f1670f;

    public b(String str, int i, Timebase timebase, androidx.camera.video.a aVar, F.a aVar2, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
        this.f1665a = str;
        this.f1667c = i;
        this.f1666b = timebase;
        this.f1668d = aVar;
        this.f1669e = aVar2;
        this.f1670f = audioProfileProxy;
    }

    @Override // x0.f
    public final J.a get() {
        Logger.d("AudioEncAdPrflRslvr", "Using resolved AUDIO bitrate from AudioProfile");
        Range<Integer> b9 = this.f1668d.b();
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.f1670f;
        int bitrate = audioProfileProxy.getBitrate();
        F.a aVar = this.f1669e;
        int c2 = a.c(bitrate, aVar.d(), audioProfileProxy.getChannels(), aVar.e(), audioProfileProxy.getSampleRate(), b9);
        c.a aVar2 = new c.a();
        aVar2.f2029b = -1;
        String str = this.f1665a;
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        aVar2.f2028a = str;
        aVar2.f2029b = Integer.valueOf(this.f1667c);
        Timebase timebase = this.f1666b;
        if (timebase == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        aVar2.f2030c = timebase;
        aVar2.f2033f = Integer.valueOf(aVar.d());
        aVar2.f2032e = Integer.valueOf(aVar.e());
        aVar2.f2031d = Integer.valueOf(c2);
        return aVar2.a();
    }
}
