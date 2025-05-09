package I;

import J.c;
import android.util.Range;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Timebase;

/* compiled from: AudioEncoderConfigDefaultResolver.java */
/* loaded from: classes.dex */
public final class c implements x0.f<J.a> {

    /* renamed from: a, reason: collision with root package name */
    public final String f1671a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1672b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.camera.video.a f1673c;

    /* renamed from: d, reason: collision with root package name */
    public final F.a f1674d;

    /* renamed from: e, reason: collision with root package name */
    public final Timebase f1675e;

    public c(String str, int i, Timebase timebase, androidx.camera.video.a aVar, F.a aVar2) {
        this.f1671a = str;
        this.f1672b = i;
        this.f1675e = timebase;
        this.f1673c = aVar;
        this.f1674d = aVar2;
    }

    @Override // x0.f
    public final J.a get() {
        Range<Integer> b9 = this.f1673c.b();
        Logger.d("AudioEncCfgDefaultRslvr", "Using fallback AUDIO bitrate");
        F.a aVar = this.f1674d;
        int c2 = a.c(156000, aVar.d(), 2, aVar.e(), 48000, b9);
        c.a aVar2 = new c.a();
        aVar2.f2029b = -1;
        String str = this.f1671a;
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        aVar2.f2028a = str;
        aVar2.f2029b = Integer.valueOf(this.f1672b);
        Timebase timebase = this.f1675e;
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
