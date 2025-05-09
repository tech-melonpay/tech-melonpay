package androidx.camera.video;

import C.C0487c;
import C.C0491g;
import android.util.Range;
import androidx.camera.video.f;
import java.util.Arrays;

/* compiled from: VideoSpec.java */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final Range<Integer> f5804a = new Range<>(0, Integer.MAX_VALUE);

    /* renamed from: b, reason: collision with root package name */
    public static final Range<Integer> f5805b = new Range<>(0, Integer.MAX_VALUE);

    /* renamed from: c, reason: collision with root package name */
    public static final C.r f5806c;

    /* compiled from: VideoSpec.java */
    public static abstract class a {
    }

    static {
        C0491g c0491g = C.o.f562c;
        f5806c = C.r.a(Arrays.asList(c0491g, C.o.f561b, C.o.f560a), new C0487c(c0491g, 1));
    }

    public static f.a a() {
        f.a aVar = new f.a();
        aVar.d(f5806c);
        Range<Integer> range = f5804a;
        if (range == null) {
            throw new NullPointerException("Null frameRate");
        }
        aVar.f5602b = range;
        aVar.c(f5805b);
        aVar.b(-1);
        return aVar;
    }

    public abstract int b();

    public abstract Range<Integer> c();

    public abstract Range<Integer> d();

    public abstract C.r e();

    public abstract f.a f();
}
