package J;

import J.c;
import android.media.MediaFormat;
import com.google.android.gms.common.Scopes;
import java.util.Objects;

/* compiled from: AudioEncoderConfig.java */
/* loaded from: classes.dex */
public abstract class a implements k {

    /* compiled from: AudioEncoderConfig.java */
    /* renamed from: J.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0025a {
        public final c a() {
            c.a aVar = (c.a) this;
            String str = aVar.f2028a == null ? " mimeType" : "";
            if (aVar.f2029b == null) {
                str = str.concat(" profile");
            }
            if (aVar.f2030c == null) {
                str = C.v.n(str, " inputTimebase");
            }
            if (aVar.f2031d == null) {
                str = C.v.n(str, " bitrate");
            }
            if (aVar.f2032e == null) {
                str = C.v.n(str, " sampleRate");
            }
            if (aVar.f2033f == null) {
                str = C.v.n(str, " channelCount");
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(str));
            }
            c cVar = new c(aVar.f2028a, aVar.f2029b.intValue(), aVar.f2030c, aVar.f2031d.intValue(), aVar.f2032e.intValue(), aVar.f2033f.intValue());
            if (Objects.equals(cVar.f2022a, "audio/mp4a-latm") && cVar.f2023b == -1) {
                throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
            }
            return cVar;
        }
    }

    @Override // J.k
    public final MediaFormat a() {
        int f10 = f();
        int d10 = d();
        String str = ((c) this).f2022a;
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(str, f10, d10);
        createAudioFormat.setInteger("bitrate", c());
        if (e() != -1) {
            if (str.equals("audio/mp4a-latm")) {
                createAudioFormat.setInteger("aac-profile", e());
            } else {
                createAudioFormat.setInteger(Scopes.PROFILE, e());
            }
        }
        return createAudioFormat;
    }

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();
}
