package F;

import C.v;
import F.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import pa.C1124b;

/* compiled from: AudioSettings.java */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final List<Integer> f1123a = Collections.unmodifiableList(Arrays.asList(48000, 44100, 22050, 11025, 8000, 4800));

    /* compiled from: AudioSettings.java */
    /* renamed from: F.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0014a {
        public final c a() {
            c.a aVar = (c.a) this;
            String str = aVar.f1131a == null ? " audioSource" : "";
            if (aVar.f1132b == null) {
                str = str.concat(" sampleRate");
            }
            if (aVar.f1133c == null) {
                str = v.n(str, " channelCount");
            }
            if (aVar.f1134d == null) {
                str = v.n(str, " audioFormat");
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(str));
            }
            c cVar = new c(aVar.f1131a.intValue(), aVar.f1132b.intValue(), aVar.f1133c.intValue(), aVar.f1134d.intValue());
            String str2 = cVar.f1127b == -1 ? " audioSource" : "";
            if (cVar.f1128c <= 0) {
                str2 = str2.concat(" sampleRate");
            }
            if (cVar.f1129d <= 0) {
                str2 = v.n(str2, " channelCount");
            }
            if (cVar.f1130e == -1) {
                str2 = v.n(str2, " audioFormat");
            }
            if (str2.isEmpty()) {
                return cVar;
            }
            throw new IllegalArgumentException("Required settings missing or non-positive:".concat(str2));
        }
    }

    public abstract int a();

    public abstract int b();

    public final int c() {
        int a10 = a();
        int d10 = d();
        C1124b.m(d10 > 0, "Invalid channel count: " + d10);
        if (a10 == 2) {
            return d10 * 2;
        }
        if (a10 == 3) {
            return d10;
        }
        if (a10 != 4) {
            if (a10 == 21) {
                return d10 * 3;
            }
            if (a10 != 22) {
                throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(a10, "Invalid audio encoding: "));
            }
        }
        return d10 * 4;
    }

    public abstract int d();

    public abstract int e();
}
