package J;

import J.d;
import android.media.MediaFormat;
import android.util.Size;
import com.google.android.gms.common.Scopes;

/* compiled from: VideoEncoderConfig.java */
/* loaded from: classes.dex */
public abstract class v implements k {

    /* compiled from: VideoEncoderConfig.java */
    public static abstract class a {
    }

    public static d.a c() {
        d.a aVar = new d.a();
        aVar.f2043b = -1;
        aVar.f2049h = 1;
        aVar.f2046e = 2130708361;
        e eVar = w.f2093a;
        if (eVar == null) {
            throw new NullPointerException("Null dataSpace");
        }
        aVar.f2047f = eVar;
        return aVar;
    }

    @Override // J.k
    public final MediaFormat a() {
        Size j10 = j();
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(((d) this).f2034a, j10.getWidth(), j10.getHeight());
        createVideoFormat.setInteger("color-format", e());
        createVideoFormat.setInteger("bitrate", d());
        createVideoFormat.setInteger("frame-rate", g());
        createVideoFormat.setInteger("i-frame-interval", h());
        if (i() != -1) {
            createVideoFormat.setInteger(Scopes.PROFILE, i());
        }
        w f10 = f();
        if (f10.b() != 0) {
            createVideoFormat.setInteger("color-standard", f10.b());
        }
        if (f10.c() != 0) {
            createVideoFormat.setInteger("color-transfer", f10.c());
        }
        if (f10.a() != 0) {
            createVideoFormat.setInteger("color-range", f10.a());
        }
        return createVideoFormat;
    }

    public abstract int d();

    public abstract int e();

    public abstract w f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract Size j();
}
