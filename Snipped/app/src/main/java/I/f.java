package I;

import F.c;
import android.util.Range;
import androidx.camera.core.Logger;
import java.util.List;

/* compiled from: AudioSettingsDefaultResolver.java */
/* loaded from: classes.dex */
public final class f implements x0.f<F.a> {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.camera.video.a f1678a;

    public f(androidx.camera.video.a aVar) {
        this.f1678a = aVar;
    }

    @Override // x0.f
    public final F.a get() {
        int d10;
        androidx.camera.video.a aVar = this.f1678a;
        int a10 = a.a(aVar);
        int b9 = a.b(aVar);
        int c2 = aVar.c();
        if (c2 == -1) {
            Logger.d("DefAudioResolver", "Using fallback AUDIO channel count: 1");
            c2 = 1;
        } else {
            Logger.d("DefAudioResolver", "Using supplied AUDIO channel count: " + c2);
        }
        Range<Integer> d11 = aVar.d();
        if (androidx.camera.video.a.f5572b.equals(d11)) {
            Logger.d("DefAudioResolver", "Using fallback AUDIO sample rate: 44100Hz");
            d10 = 44100;
        } else {
            d10 = a.d(d11, c2, b9, d11.getUpper().intValue());
            Logger.d("DefAudioResolver", "Using AUDIO sample rate resolved from AudioSpec: " + d10 + "Hz");
        }
        List<Integer> list = F.a.f1123a;
        c.a aVar2 = new c.a();
        aVar2.f1131a = -1;
        aVar2.f1132b = -1;
        aVar2.f1133c = -1;
        aVar2.f1134d = -1;
        aVar2.f1131a = Integer.valueOf(a10);
        aVar2.f1134d = Integer.valueOf(b9);
        aVar2.f1133c = Integer.valueOf(c2);
        aVar2.f1132b = Integer.valueOf(d10);
        return aVar2.a();
    }
}
